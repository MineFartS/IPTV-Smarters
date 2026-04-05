package c.f.a.b.e3.e1.p;

import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7183c;

    public e(String str, String str2, String str3) {
        this.f7181a = str;
        this.f7182b = str2;
        this.f7183c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return x0.b(this.f7181a, eVar.f7181a) && x0.b(this.f7182b, eVar.f7182b) && x0.b(this.f7183c, eVar.f7183c);
    }

    public int hashCode() {
        int iHashCode = this.f7181a.hashCode() * 31;
        String str = this.f7182b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7183c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
