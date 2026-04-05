package c.f.a.b.v2;

import c.f.a.b.k1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f10285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f10286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10288e;

    public g(String str, k1 k1Var, k1 k1Var2, int i2, int i3) {
        c.f.a.b.j3.g.a(i2 == 0 || i3 == 0);
        this.f10284a = c.f.a.b.j3.g.d(str);
        this.f10285b = (k1) c.f.a.b.j3.g.e(k1Var);
        this.f10286c = (k1) c.f.a.b.j3.g.e(k1Var2);
        this.f10287d = i2;
        this.f10288e = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f10287d == gVar.f10287d && this.f10288e == gVar.f10288e && this.f10284a.equals(gVar.f10284a) && this.f10285b.equals(gVar.f10285b) && this.f10286c.equals(gVar.f10286c);
    }

    public int hashCode() {
        return ((((((((527 + this.f10287d) * 31) + this.f10288e) * 31) + this.f10284a.hashCode()) * 31) + this.f10285b.hashCode()) * 31) + this.f10286c.hashCode();
    }
}
