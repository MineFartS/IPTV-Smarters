package com.amplifyframework.core.model;

import a.i.q.d;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.util.Immutable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class SerializedModel implements Model {
    private final String modelId;
    private final ModelSchema modelSchema;
    private final Map<String, Object> serializedData;

    public static final class Builder implements BuilderSteps.SerializedDataStep, BuilderSteps.ModelSchemaStep, BuilderSteps.BuildStep {
        private String id;
        private ModelSchema modelSchema;
        private final Map<String, Object> serializedData;

        private Builder() {
            this.serializedData = new HashMap();
        }

        @Override // com.amplifyframework.core.model.SerializedModel.BuilderSteps.BuildStep
        public SerializedModel build() {
            return new SerializedModel(this.id, Immutable.of(this.serializedData), this.modelSchema);
        }

        @Override // com.amplifyframework.core.model.SerializedModel.BuilderSteps.ModelSchemaStep
        public BuilderSteps.BuildStep modelSchema(ModelSchema modelSchema) {
            this.modelSchema = modelSchema;
            return this;
        }

        @Override // com.amplifyframework.core.model.SerializedModel.BuilderSteps.SerializedDataStep
        public BuilderSteps.ModelSchemaStep serializedData(Map<String, Object> map) {
            Map<String, Object> map2 = this.serializedData;
            map.getClass();
            map2.putAll(map);
            String str = (String) map.get(Name.MARK);
            str.getClass();
            this.id = str;
            return this;
        }
    }

    public interface BuilderSteps {

        public interface BuildStep {
            SerializedModel build();
        }

        public interface ModelSchemaStep {
            BuildStep modelSchema(ModelSchema modelSchema);
        }

        public interface SerializedDataStep {
            ModelSchemaStep serializedData(Map<String, Object> map);
        }
    }

    private SerializedModel(String str, Map<String, Object> map, ModelSchema modelSchema) {
        this.modelId = str;
        this.serializedData = map;
        this.modelSchema = modelSchema;
    }

    public static BuilderSteps.SerializedDataStep builder() {
        return new Builder();
    }

    public static <T extends Model> SerializedModel create(T t, ModelSchema modelSchema) {
        return builder().serializedData(ModelConverter.toMap(t, modelSchema)).modelSchema(modelSchema).build();
    }

    public static <T extends Model> SerializedModel difference(T t, T t2, ModelSchema modelSchema) throws AmplifyException {
        if (t2 == null) {
            return create(t, modelSchema);
        }
        Map<String, Object> map = ModelConverter.toMap(t, modelSchema);
        Map<String, Object> map2 = ModelConverter.toMap(t2, modelSchema);
        HashMap map3 = new HashMap();
        for (String str : map.keySet()) {
            HashSet hashSet = new HashSet();
            hashSet.add(PrimaryKey.fieldName());
            hashSet.addAll(modelSchema.getPrimaryIndexFields());
            if (hashSet.contains(str) || !d.a(map2.get(str), map.get(str))) {
                map3.put(str, map.get(str));
            }
        }
        return builder().serializedData(map3).modelSchema(modelSchema).build();
    }

    public static SerializedModel merge(SerializedModel serializedModel, SerializedModel serializedModel2, ModelSchema modelSchema) {
        HashMap map = new HashMap(serializedModel.serializedData);
        for (String str : serializedModel2.getSerializedData().keySet()) {
            if (!map.containsKey(str)) {
                map.put(str, serializedModel2.getSerializedData().get(str));
            }
        }
        return builder().serializedData(map).modelSchema(modelSchema).build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SerializedModel.class != obj.getClass()) {
            return false;
        }
        SerializedModel serializedModel = (SerializedModel) obj;
        return d.a(this.modelId, serializedModel.modelId) && d.a(this.serializedData, serializedModel.serializedData) && d.a(this.modelSchema, serializedModel.modelSchema);
    }

    @Override // com.amplifyframework.core.model.Model
    public String getId() {
        return this.modelId;
    }

    @Override // com.amplifyframework.core.model.Model
    public String getModelName() {
        ModelSchema modelSchema = this.modelSchema;
        if (modelSchema == null) {
            return null;
        }
        return modelSchema.getName();
    }

    public ModelSchema getModelSchema() {
        return this.modelSchema;
    }

    public Map<String, Object> getSerializedData() {
        return this.serializedData;
    }

    public Object getValue(ModelField modelField) {
        return this.serializedData.get(modelField.getName());
    }

    public int hashCode() {
        return d.b(this.modelId, this.serializedData, this.modelSchema);
    }

    public String toString() {
        return "SerializedModel{id='" + this.modelId + "', serializedData=" + this.serializedData + ", modelName=" + getModelName() + '}';
    }
}
