package com.amplifyframework.core.model;

import a.i.q.d;
import android.annotation.SuppressLint;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.model.ModelAssociation;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.util.FieldFinder;
import com.amplifyframework.util.Immutable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ModelSchema {
    private final Map<String, ModelAssociation> associations;
    private final List<AuthRule> authRules;
    private final Map<String, ModelField> fields;
    private final Map<String, ModelIndex> indexes;
    private final Class<? extends Model> modelClass;
    private final String name;
    private final String pluralName;

    public static final class Builder {
        private Class<? extends Model> modelClass;
        private String name;
        private String pluralName;
        private final List<AuthRule> authRules = new ArrayList();
        private final Map<String, ModelField> fields = new TreeMap();
        private final Map<String, ModelAssociation> associations = new TreeMap();
        private final Map<String, ModelIndex> indexes = new TreeMap();

        public Builder associations(Map<String, ModelAssociation> map) {
            map.getClass();
            this.associations.clear();
            this.associations.putAll(map);
            return this;
        }

        public Builder authRules(List<AuthRule> list) {
            list.getClass();
            this.authRules.clear();
            this.authRules.addAll(list);
            return this;
        }

        @SuppressLint({"SyntheticAccessor"})
        public ModelSchema build() {
            this.name.getClass();
            return new ModelSchema(this);
        }

        public Builder fields(Map<String, ModelField> map) {
            map.getClass();
            this.fields.clear();
            this.fields.putAll(map);
            return this;
        }

        public Builder indexes(Map<String, ModelIndex> map) {
            map.getClass();
            this.indexes.clear();
            this.indexes.putAll(map);
            return this;
        }

        public Builder modelClass(Class<? extends Model> cls) {
            this.modelClass = cls;
            return this;
        }

        public Builder name(String str) {
            str.getClass();
            this.name = str;
            return this;
        }

        public Builder pluralName(String str) {
            this.pluralName = str;
            return this;
        }
    }

    private ModelSchema(Builder builder) {
        this.name = builder.name;
        this.pluralName = builder.pluralName;
        this.authRules = builder.authRules;
        this.fields = builder.fields;
        this.associations = builder.associations;
        this.indexes = builder.indexes;
        this.modelClass = builder.modelClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    private static ModelAssociation createModelAssociation(Field field) {
        ModelAssociation.Builder builderAssociatedName;
        Class<? extends Model> clsType;
        if (field.isAnnotationPresent(BelongsTo.class)) {
            Annotation annotation = field.getAnnotation(BelongsTo.class);
            annotation.getClass();
            BelongsTo belongsTo = (BelongsTo) annotation;
            builderAssociatedName = ModelAssociation.builder().name(BelongsTo.class.getSimpleName()).targetName(belongsTo.targetName());
            clsType = belongsTo.type();
        } else if (field.isAnnotationPresent(HasOne.class)) {
            Annotation annotation2 = field.getAnnotation(HasOne.class);
            annotation2.getClass();
            HasOne hasOne = (HasOne) annotation2;
            builderAssociatedName = ModelAssociation.builder().name(HasOne.class.getSimpleName()).associatedName(hasOne.associatedWith());
            clsType = hasOne.type();
        } else {
            if (!field.isAnnotationPresent(HasMany.class)) {
                return null;
            }
            Annotation annotation3 = field.getAnnotation(HasMany.class);
            annotation3.getClass();
            HasMany hasMany = (HasMany) annotation3;
            builderAssociatedName = ModelAssociation.builder().name(HasMany.class.getSimpleName()).associatedName(hasMany.associatedWith());
            clsType = hasMany.type();
        }
        return builderAssociatedName.associatedType(clsType.getSimpleName()).build();
    }

    private static ModelField createModelField(Field field) {
        com.amplifyframework.core.model.annotations.ModelField modelField = (com.amplifyframework.core.model.annotations.ModelField) field.getAnnotation(com.amplifyframework.core.model.annotations.ModelField.class);
        if (modelField == null) {
            return null;
        }
        String name = field.getName();
        Class<?> type = field.getType();
        String strTargetType = modelField.targetType();
        ArrayList arrayList = new ArrayList();
        for (com.amplifyframework.core.model.annotations.AuthRule authRule : modelField.authRules()) {
            arrayList.add(new AuthRule(authRule));
        }
        ModelField.ModelFieldBuilder modelFieldBuilderJavaClassForValue = ModelField.builder().name(name).javaClassForValue(type);
        if (strTargetType.isEmpty()) {
            strTargetType = type.getSimpleName();
        }
        return modelFieldBuilderJavaClassForValue.targetType(strTargetType).isReadOnly(modelField.isReadOnly()).isRequired(modelField.isRequired()).isArray(Collection.class.isAssignableFrom(field.getType())).isEnum(Enum.class.isAssignableFrom(field.getType())).isModel(Model.class.isAssignableFrom(field.getType())).authRules(arrayList).build();
    }

    private static ModelIndex createModelIndex(Index index) {
        return ModelIndex.builder().indexName(index.name()).indexFieldNames(Arrays.asList(index.fields())).build();
    }

    public static ModelSchema fromModelClass(Class<? extends Model> cls) throws AmplifyException {
        try {
            List<Field> listFindModelFieldsIn = FieldFinder.findModelFieldsIn(cls);
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            TreeMap treeMap3 = new TreeMap();
            ArrayList arrayList = new ArrayList();
            ModelConfig modelConfig = (ModelConfig) cls.getAnnotation(ModelConfig.class);
            String simpleName = cls.getSimpleName();
            String strPluralName = (modelConfig == null || modelConfig.pluralName().isEmpty()) ? null : modelConfig.pluralName();
            if (modelConfig != null) {
                for (com.amplifyframework.core.model.annotations.AuthRule authRule : modelConfig.authRules()) {
                    arrayList.add(new AuthRule(authRule));
                }
            }
            for (Annotation annotation : cls.getAnnotations()) {
                if (annotation.annotationType().isAssignableFrom(Indexes.class)) {
                    for (Index index : ((Indexes) annotation).value()) {
                        ModelIndex modelIndexCreateModelIndex = createModelIndex(index);
                        treeMap3.put(modelIndexCreateModelIndex.getIndexName(), modelIndexCreateModelIndex);
                    }
                } else if (annotation.annotationType().isAssignableFrom(Index.class)) {
                    ModelIndex modelIndexCreateModelIndex2 = createModelIndex((Index) annotation);
                    treeMap3.put(modelIndexCreateModelIndex2.getIndexName(), modelIndexCreateModelIndex2);
                }
            }
            for (Field field : listFindModelFieldsIn) {
                ModelField modelFieldCreateModelField = createModelField(field);
                if (modelFieldCreateModelField != null) {
                    treeMap.put(field.getName(), modelFieldCreateModelField);
                }
                ModelAssociation modelAssociationCreateModelAssociation = createModelAssociation(field);
                if (modelAssociationCreateModelAssociation != null) {
                    treeMap2.put(field.getName(), modelAssociationCreateModelAssociation);
                }
            }
            return builder().name(simpleName).pluralName(strPluralName).authRules(arrayList).fields(treeMap).associations(treeMap2).indexes(treeMap3).modelClass(cls).build();
        } catch (Exception e2) {
            throw new AmplifyException("Error in constructing a ModelSchema.", e2, AmplifyException.TODO_RECOVERY_SUGGESTION);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelSchema.class != obj.getClass()) {
            return false;
        }
        ModelSchema modelSchema = (ModelSchema) obj;
        return d.a(getName(), modelSchema.getName()) && d.a(getPluralName(), modelSchema.getPluralName()) && d.a(getAuthRules(), modelSchema.getAuthRules()) && d.a(getFields(), modelSchema.getFields()) && d.a(getAssociations(), modelSchema.getAssociations()) && d.a(getIndexes(), modelSchema.getIndexes()) && d.a(getModelClass(), modelSchema.getModelClass());
    }

    public Map<String, ModelAssociation> getAssociations() {
        return Immutable.of(this.associations);
    }

    public List<AuthRule> getAuthRules() {
        return this.authRules;
    }

    public Map<String, ModelField> getFields() {
        return this.fields;
    }

    public Map<String, ModelIndex> getIndexes() {
        return this.indexes;
    }

    public Class<? extends Model> getModelClass() {
        return this.modelClass;
    }

    public String getName() {
        return this.name;
    }

    public String getPluralName() {
        return this.pluralName;
    }

    public List<String> getPrimaryIndexFields() {
        ModelIndex modelIndex = this.indexes.get("undefined");
        return (modelIndex == null || modelIndex.getIndexFieldNames().size() < 1) ? Arrays.asList(PrimaryKey.fieldName()) : modelIndex.getIndexFieldNames();
    }

    public String getPrimaryKeyName() {
        return getPrimaryIndexFields().get(0);
    }

    public boolean hasModelLevelRules() {
        return this.authRules.size() > 0;
    }

    public int hashCode() {
        return d.b(getName(), getPluralName(), getAuthRules(), getFields(), getAssociations(), getIndexes(), getModelClass());
    }

    public String toString() {
        return "ModelSchema{name='" + this.name + "', pluralName='" + this.pluralName + "', authRules=" + this.authRules + ", fields=" + this.fields + ", associations=" + this.associations + ", indexes=" + this.indexes + ", modelClass=" + this.modelClass + '}';
    }
}
