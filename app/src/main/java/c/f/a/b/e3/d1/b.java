package c.f.a.b.e3.d1;

import c.f.a.b.i3.s;
import c.f.a.b.k1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f6995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f6997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f6998n;

    public b(c.f.a.b.i3.p pVar, s sVar, k1 k1Var, int i2, Object obj, long j2, long j3, long j4, long j5, long j6) {
        super(pVar, sVar, k1Var, i2, obj, j2, j3, j6);
        this.f6995k = j4;
        this.f6996l = j5;
    }

    public final int i(int i2) {
        return ((int[]) c.f.a.b.j3.g.i(this.f6998n))[i2];
    }

    public final d j() {
        return (d) c.f.a.b.j3.g.i(this.f6997m);
    }

    public void k(d dVar) {
        this.f6997m = dVar;
        this.f6998n = dVar.a();
    }
}
