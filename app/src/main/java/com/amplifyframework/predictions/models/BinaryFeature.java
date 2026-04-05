package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class BinaryFeature extends Feature<Boolean> {
    private final String type;

    public static final class Builder extends Feature.Builder<Builder, BinaryFeature, Boolean> {
        private String type;

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public BinaryFeature build() {
            return new BinaryFeature(this);
        }

        public String getType() {
            String str = this.type;
            str.getClass();
            return str;
        }

        public Builder type(String str) {
            str.getClass();
            this.type = str;
            return this;
        }
    }

    private BinaryFeature(Builder builder) {
        super(builder);
        this.type = builder.getType();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return this.type;
    }
}
