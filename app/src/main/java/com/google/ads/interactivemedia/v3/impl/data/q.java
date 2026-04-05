package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public final class q extends CompanionData {
    private final String clickThroughUrl;
    private final String size;
    private final String src;
    private final as type;

    public q(String str, String str2, String str3, as asVar) {
        if (str == null) {
            throw new NullPointerException("Null size");
        }
        this.size = str;
        if (str2 == null) {
            throw new NullPointerException("Null src");
        }
        this.src = str2;
        if (str3 == null) {
            throw new NullPointerException("Null clickThroughUrl");
        }
        this.clickThroughUrl = str3;
        if (asVar == null) {
            throw new NullPointerException("Null type");
        }
        this.type = asVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompanionData) {
            CompanionData companionData = (CompanionData) obj;
            if (this.size.equals(companionData.size()) && this.src.equals(companionData.src()) && this.clickThroughUrl.equals(companionData.clickThroughUrl()) && this.type.equals(companionData.type())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.src.hashCode()) * 1000003) ^ this.clickThroughUrl.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String size() {
        return this.size;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String src() {
        return this.src;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public as type() {
        return this.type;
    }
}
