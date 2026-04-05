package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.CompanionAd;
import com.google.ads.interactivemedia.v3.internal.bnt;
import com.google.ads.interactivemedia.v3.internal.bnv;

/* JADX INFO: loaded from: classes.dex */
public class CompanionAdImpl implements CompanionAd {
    private String apiFramework;
    private String resourceValue;
    private bi size;

    public boolean equals(Object obj) {
        return bnt.c(this, obj, new String[0]);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public String getApiFramework() {
        return this.apiFramework;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public int getHeight() {
        return this.size.height().intValue();
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public String getResourceValue() {
        return this.resourceValue;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public int getWidth() {
        return this.size.width().intValue();
    }

    public int hashCode() {
        return bnv.a(this, new String[0]);
    }

    public void setApiFramework(String str) {
        this.apiFramework = str;
    }

    public void setResourceValue(String str) {
        this.resourceValue = str;
    }

    public void setSize(bi biVar) {
        this.size = biVar;
    }

    public String toString() {
        String str = this.apiFramework;
        String str2 = this.resourceValue;
        String strValueOf = String.valueOf(this.size.width());
        String strValueOf2 = String.valueOf(this.size.height());
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 58 + length2 + strValueOf.length() + strValueOf2.length());
        sb.append("CompanionAd [apiFramework=");
        sb.append(str);
        sb.append(", resourceUrl=");
        sb.append(str2);
        sb.append(", width=");
        sb.append(strValueOf);
        sb.append(", height=");
        sb.append(strValueOf2);
        sb.append("]");
        return sb.toString();
    }
}
