package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.ImageFeature;

/* JADX INFO: loaded from: classes.dex */
public final class IdentifiedText extends ImageFeature<String> {
    private final int page;

    public static final class Builder extends ImageFeature.Builder<Builder, IdentifiedText, String> {
        private int page;

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public IdentifiedText build() {
            return new IdentifiedText(this);
        }

        public int getPage() {
            return this.page;
        }

        public Builder page(int i2) {
            this.page = i2;
            return this;
        }

        public Builder text(String str) {
            str.getClass();
            return (Builder) super.value(str);
        }
    }

    private IdentifiedText(Builder builder) {
        super(builder);
        this.page = builder.getPage();
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getPage() {
        return this.page;
    }

    public String getText() {
        return getValue();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.IDENTIFIED_TEXT.getAlias();
    }
}
