package com.amplifyframework.predictions.result;

import com.amplifyframework.predictions.models.LanguageType;

/* JADX INFO: loaded from: classes.dex */
public final class TranslateTextResult {
    private final LanguageType targetLanguage;
    private final String translatedText;

    public static final class Builder {
        private LanguageType targetLanguage;
        private String translatedText;

        public TranslateTextResult build() {
            return new TranslateTextResult(this);
        }

        public LanguageType getTargetLanguage() {
            LanguageType languageType = this.targetLanguage;
            languageType.getClass();
            return languageType;
        }

        public String getTranslatedText() {
            String str = this.translatedText;
            str.getClass();
            return str;
        }

        public Builder targetLanguage(LanguageType languageType) {
            languageType.getClass();
            this.targetLanguage = languageType;
            return this;
        }

        public Builder translatedText(String str) {
            str.getClass();
            this.translatedText = str;
            return this;
        }
    }

    private TranslateTextResult(Builder builder) {
        this.translatedText = builder.getTranslatedText();
        this.targetLanguage = builder.getTargetLanguage();
    }

    public static Builder builder() {
        return new Builder();
    }

    public LanguageType getTargetLanguage() {
        return this.targetLanguage;
    }

    public String getTranslatedText() {
        return this.translatedText;
    }
}
