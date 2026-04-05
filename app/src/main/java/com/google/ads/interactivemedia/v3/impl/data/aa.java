package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public final class aa extends bd {
    private final String content;
    private final String contentType;
    private final int errorCode;
    private final String id;

    public aa(String str, String str2, String str3, int i2) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (str2 == null) {
            throw new NullPointerException("Null content");
        }
        this.content = str2;
        if (str3 == null) {
            throw new NullPointerException("Null contentType");
        }
        this.contentType = str3;
        this.errorCode = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bd
    public String content() {
        return this.content;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bd
    public String contentType() {
        return this.contentType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bd) {
            bd bdVar = (bd) obj;
            if (this.id.equals(bdVar.id()) && this.content.equals(bdVar.content()) && this.contentType.equals(bdVar.contentType()) && this.errorCode == bdVar.errorCode()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bd
    public int errorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        return ((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.content.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003) ^ this.errorCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bd
    public String id() {
        return this.id;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.content;
        String str3 = this.contentType;
        int i2 = this.errorCode;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("NetworkResponseData{id=");
        sb.append(str);
        sb.append(", content=");
        sb.append(str2);
        sb.append(", contentType=");
        sb.append(str3);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
