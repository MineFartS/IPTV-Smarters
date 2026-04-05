package com.amazonaws.services.s3.model;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CORSRule {
    private List<String> allowedHeaders;
    private List<AllowedMethods> allowedMethods;
    private List<String> allowedOrigins;
    private List<String> exposedHeaders;
    private String id;
    private int maxAgeSeconds;

    public enum AllowedMethods {
        GET("GET"),
        PUT("PUT"),
        HEAD("HEAD"),
        POST(ClientConstants.HTTP_REQUEST_TYPE_POST),
        DELETE("DELETE");

        private final String AllowedMethod;

        AllowedMethods(String str) {
            this.AllowedMethod = str;
        }

        public static AllowedMethods fromValue(String str) {
            for (AllowedMethods allowedMethods : values()) {
                String string = allowedMethods.toString();
                if (string == null && str == null) {
                    return allowedMethods;
                }
                if (string != null && string.equals(str)) {
                    return allowedMethods;
                }
            }
            throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.AllowedMethod;
        }
    }

    public List<String> getAllowedHeaders() {
        return this.allowedHeaders;
    }

    public List<AllowedMethods> getAllowedMethods() {
        return this.allowedMethods;
    }

    public List<String> getAllowedOrigins() {
        return this.allowedOrigins;
    }

    public List<String> getExposedHeaders() {
        return this.exposedHeaders;
    }

    public String getId() {
        return this.id;
    }

    public int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public void setAllowedHeaders(List<String> list) {
        this.allowedHeaders = list;
    }

    public void setAllowedHeaders(String... strArr) {
        this.allowedHeaders = Arrays.asList(strArr);
    }

    public void setAllowedMethods(List<AllowedMethods> list) {
        this.allowedMethods = list;
    }

    public void setAllowedMethods(AllowedMethods... allowedMethodsArr) {
        this.allowedMethods = Arrays.asList(allowedMethodsArr);
    }

    public void setAllowedOrigins(List<String> list) {
        this.allowedOrigins = list;
    }

    public void setAllowedOrigins(String... strArr) {
        this.allowedOrigins = Arrays.asList(strArr);
    }

    public void setExposedHeaders(List<String> list) {
        this.exposedHeaders = list;
    }

    public void setExposedHeaders(String... strArr) {
        this.exposedHeaders = Arrays.asList(strArr);
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMaxAgeSeconds(int i2) {
        this.maxAgeSeconds = i2;
    }

    public CORSRule withAllowedHeaders(List<String> list) {
        this.allowedHeaders = list;
        return this;
    }

    public CORSRule withAllowedMethods(List<AllowedMethods> list) {
        this.allowedMethods = list;
        return this;
    }

    public CORSRule withAllowedOrigins(List<String> list) {
        this.allowedOrigins = list;
        return this;
    }

    public CORSRule withExposedHeaders(List<String> list) {
        this.exposedHeaders = list;
        return this;
    }

    public CORSRule withId(String str) {
        this.id = str;
        return this;
    }

    public CORSRule withMaxAgeSeconds(int i2) {
        this.maxAgeSeconds = i2;
        return this;
    }
}
