package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public final class z extends bc {
    private final int connectionTimeoutMs;
    private final String content;
    private final String id;
    private final int readTimeoutMs;
    private final bb requestType;
    private final String url;
    private final String userAgent;

    public z(bb bbVar, String str, String str2, String str3, String str4, int i2, int i3) {
        if (bbVar == null) {
            throw new NullPointerException("Null requestType");
        }
        this.requestType = bbVar;
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (str2 == null) {
            throw new NullPointerException("Null url");
        }
        this.url = str2;
        this.content = str3;
        if (str4 == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.userAgent = str4;
        this.connectionTimeoutMs = i2;
        this.readTimeoutMs = i3;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public int connectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public String content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bc) {
            bc bcVar = (bc) obj;
            if (this.requestType.equals(bcVar.requestType()) && this.id.equals(bcVar.id()) && this.url.equals(bcVar.url()) && ((str = this.content) != null ? str.equals(bcVar.content()) : bcVar.content() == null) && this.userAgent.equals(bcVar.userAgent()) && this.connectionTimeoutMs == bcVar.connectionTimeoutMs() && this.readTimeoutMs == bcVar.readTimeoutMs()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.requestType.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.url.hashCode()) * 1000003;
        String str = this.content;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.userAgent.hashCode()) * 1000003) ^ this.connectionTimeoutMs) * 1000003) ^ this.readTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public int readTimeoutMs() {
        return this.readTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public bb requestType() {
        return this.requestType;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.requestType);
        String str = this.id;
        String str2 = this.url;
        String str3 = this.content;
        String str4 = this.userAgent;
        int i2 = this.connectionTimeoutMs;
        int i3 = this.readTimeoutMs;
        int length = strValueOf.length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 125 + length2 + length3 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NetworkRequestData{requestType=");
        sb.append(strValueOf);
        sb.append(", id=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", content=");
        sb.append(str3);
        sb.append(", userAgent=");
        sb.append(str4);
        sb.append(", connectionTimeoutMs=");
        sb.append(i2);
        sb.append(", readTimeoutMs=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public String userAgent() {
        return this.userAgent;
    }
}
