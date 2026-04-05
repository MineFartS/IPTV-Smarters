package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class UserContextDataType implements Serializable {
    private String encodedData;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UserContextDataType)) {
            return false;
        }
        UserContextDataType userContextDataType = (UserContextDataType) obj;
        if ((userContextDataType.getEncodedData() == null) ^ (getEncodedData() == null)) {
            return false;
        }
        return userContextDataType.getEncodedData() == null || userContextDataType.getEncodedData().equals(getEncodedData());
    }

    public String getEncodedData() {
        return this.encodedData;
    }

    public int hashCode() {
        return 31 + (getEncodedData() == null ? 0 : getEncodedData().hashCode());
    }

    public void setEncodedData(String str) {
        this.encodedData = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEncodedData() != null) {
            sb.append("EncodedData: " + getEncodedData());
        }
        sb.append("}");
        return sb.toString();
    }

    public UserContextDataType withEncodedData(String str) {
        this.encodedData = str;
        return this;
    }
}
