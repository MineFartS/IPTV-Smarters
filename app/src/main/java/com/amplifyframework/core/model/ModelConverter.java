package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class ModelConverter {
    private ModelConverter() {
    }

    private static Object extractAssociateId(ModelField modelField, Model model, ModelSchema modelSchema) throws AmplifyException {
        Object objExtractFieldValue = extractFieldValue(modelField.getName(), model, modelSchema);
        if (modelField.isModel() && (objExtractFieldValue instanceof Model)) {
            return ((Model) objExtractFieldValue).getId();
        }
        if (modelField.isModel() && (objExtractFieldValue instanceof Map)) {
            return ((Map) objExtractFieldValue).get(Name.MARK);
        }
        if (modelField.isModel() && objExtractFieldValue == null) {
            return null;
        }
        throw new IllegalStateException("Associated data is not a Model or Map.");
    }

    private static Object extractFieldValue(String str, Model model, ModelSchema modelSchema) throws AmplifyException {
        if (model instanceof SerializedModel) {
            return ((SerializedModel) model).getSerializedData().get(str);
        }
        try {
            Field declaredField = model.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(model);
        } catch (Exception e2) {
            throw new AmplifyException("An invalid field was provided. " + str + " is not present in " + modelSchema.getName(), e2, "Check if this model schema is a correct representation of the fields in the provided Object");
        }
    }

    public static <T extends Model> Map<String, Object> toMap(T t, ModelSchema modelSchema) throws AmplifyException {
        Object objExtractFieldValue;
        Object objExtractAssociateId;
        HashMap map = new HashMap();
        for (ModelField modelField : modelSchema.getFields().values()) {
            String name = modelField.getName();
            ModelAssociation modelAssociation = modelSchema.getAssociations().get(name);
            if (modelAssociation == null) {
                if (!(t instanceof SerializedModel) || ((SerializedModel) t).getSerializedData().containsKey(modelField.getName())) {
                    objExtractFieldValue = extractFieldValue(modelField.getName(), t, modelSchema);
                    map.put(name, objExtractFieldValue);
                }
            } else if (modelAssociation.isOwner() && (objExtractAssociateId = extractAssociateId(modelField, t, modelSchema)) != null) {
                objExtractFieldValue = SerializedModel.builder().serializedData(Collections.singletonMap(Name.MARK, objExtractAssociateId)).modelSchema(null).build();
                map.put(name, objExtractFieldValue);
            }
        }
        return map;
    }
}
