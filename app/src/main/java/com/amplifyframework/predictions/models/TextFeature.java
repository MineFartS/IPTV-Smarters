package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* JADX INFO: loaded from: classes.dex */
public abstract class TextFeature<T> extends Feature<T> {
    private final int length;
    private final int startIndex;
    private final String targetText;

    public static abstract class Builder<B extends Builder<B, R, T>, R extends TextFeature<T>, T> extends Feature.Builder<B, R, T> {
        private int startIndex;
        private String targetText;

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final String getTargetText() {
            String str = this.targetText;
            str.getClass();
            return str;
        }

        public final B startIndex(int i2) {
            this.startIndex = i2;
            return this;
        }

        public final B targetText(String str) {
            str.getClass();
            this.targetText = str;
            return this;
        }
    }

    public TextFeature(Builder<?, ? extends TextFeature<T>, T> builder) {
        super(builder);
        String targetText = builder.getTargetText();
        this.targetText = targetText;
        this.startIndex = builder.getStartIndex();
        this.length = targetText.length();
    }

    public int getLength() {
        return this.length;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public final String getTargetText() {
        return this.targetText;
    }
}
