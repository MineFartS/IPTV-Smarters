package c.k.a;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18214b;

    public g(String str, String str2) {
        this.f18213a = str;
        this.f18214b = str2;
    }

    public String a() {
        return this.f18214b;
    }

    public String b() {
        return this.f18213a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (c.k.a.y.h.f(this.f18213a, gVar.f18213a) && c.k.a.y.h.f(this.f18214b, gVar.f18214b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f18214b;
        int iHashCode = (899 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18213a;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f18213a + " realm=\"" + this.f18214b + "\"";
    }
}
