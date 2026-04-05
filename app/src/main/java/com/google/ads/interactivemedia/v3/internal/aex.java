package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19455e;

    public aex(String str, String str2, String str3, String str4, String str5) {
        this.f19451a = str;
        this.f19452b = str2;
        this.f19453c = str3;
        this.f19454d = str4;
        this.f19455e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aex)) {
            return false;
        }
        aex aexVar = (aex) obj;
        return amn.O(this.f19451a, aexVar.f19451a) && amn.O(this.f19452b, aexVar.f19452b) && amn.O(this.f19453c, aexVar.f19453c) && amn.O(this.f19454d, aexVar.f19454d) && amn.O(this.f19455e, aexVar.f19455e);
    }

    public final int hashCode() {
        String str = this.f19451a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f19452b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19453c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f19454d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f19455e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
