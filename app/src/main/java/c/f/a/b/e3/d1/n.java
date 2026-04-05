package c.f.a.b.e3.d1;

import c.f.a.b.i3.s;
import c.f.a.b.k1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7059j;

    public n(c.f.a.b.i3.p pVar, s sVar, k1 k1Var, int i2, Object obj, long j2, long j3, long j4) {
        super(pVar, sVar, 1, k1Var, i2, obj, j2, j3);
        c.f.a.b.j3.g.e(k1Var);
        this.f7059j = j4;
    }

    public long g() {
        long j2 = this.f7059j;
        if (j2 != -1) {
            return 1 + j2;
        }
        return -1L;
    }

    public abstract boolean h();
}
