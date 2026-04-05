package com.amplifyframework.core.model;

import com.amplifyframework.util.Immutable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ModelSchemaRegistry {
    private final Map<String, ModelSchema> modelSchemaMap = new HashMap();

    private ModelSchemaRegistry() {
    }

    public static synchronized ModelSchemaRegistry instance() {
        return new ModelSchemaRegistry();
    }

    public void clear() {
        this.modelSchemaMap.clear();
    }

    public synchronized <T extends Model> ModelSchema getModelSchemaForModelClass(Class<T> cls) {
        return this.modelSchemaMap.get(cls.getSimpleName());
    }

    public synchronized ModelSchema getModelSchemaForModelClass(String str) {
        return this.modelSchemaMap.get(str);
    }

    public synchronized <T extends Model> ModelSchema getModelSchemaForModelInstance(T t) {
        return this.modelSchemaMap.get(t.getClass().getSimpleName());
    }

    public Map<String, ModelSchema> getModelSchemaMap() {
        return Immutable.of(this.modelSchemaMap);
    }

    public synchronized void register(String str, ModelSchema modelSchema) {
        this.modelSchemaMap.put(str, modelSchema);
    }

    public synchronized void register(Map<String, ModelSchema> map) {
        this.modelSchemaMap.putAll(map);
    }

    public synchronized void register(Set<Class<? extends Model>> set) {
        for (Class<? extends Model> cls : set) {
            this.modelSchemaMap.put(cls.getSimpleName(), ModelSchema.fromModelClass(cls));
        }
    }
}
