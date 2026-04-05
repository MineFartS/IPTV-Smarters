package c.f.a.b.e3.e1.p;

import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7198e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f7194a = str;
        this.f7195b = str2;
        this.f7196c = str3;
        this.f7197d = str4;
        this.f7198e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return x0.b(this.f7194a, hVar.f7194a) && x0.b(this.f7195b, hVar.f7195b) && x0.b(this.f7196c, hVar.f7196c) && x0.b(this.f7197d, hVar.f7197d) && x0.b(this.f7198e, hVar.f7198e);
    }

    public int hashCode() {
        String str = this.f7194a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7195b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7196c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f7197d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f7198e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
