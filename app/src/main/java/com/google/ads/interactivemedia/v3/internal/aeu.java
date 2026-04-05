package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aeu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19442c;

    public aeu(String str, String str2, String str3) {
        this.f19440a = str;
        this.f19441b = str2;
        this.f19442c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aeu.class == obj.getClass()) {
            aeu aeuVar = (aeu) obj;
            if (amn.O(this.f19440a, aeuVar.f19440a) && amn.O(this.f19441b, aeuVar.f19441b) && amn.O(this.f19442c, aeuVar.f19442c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f19440a.hashCode() * 31;
        String str = this.f19441b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19442c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
