package com.amplifyframework.predictions.models;

import a.i.q.e;
import com.amplifyframework.predictions.models.ImageFeature;

/* JADX INFO: loaded from: classes.dex */
public final class BoundedKeyValue extends ImageFeature<e<String, String>> {

    public static final class Builder extends ImageFeature.Builder<Builder, BoundedKeyValue, e<String, String>> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public BoundedKeyValue build() {
            getValue().getClass();
            getValue().f1955a.getClass();
            getValue().f1956b.getClass();
            return new BoundedKeyValue(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder keyValuePair(String str, String str2) {
            str.getClass();
            str2.getClass();
            return (Builder) value(e.a(str, str2));
        }
    }

    private BoundedKeyValue(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getKey() {
        return getValue().f1955a;
    }

    public String getKeyValue() {
        return getValue().f1956b;
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.BOUNDED_KEY_VALUE.getAlias();
    }
}
