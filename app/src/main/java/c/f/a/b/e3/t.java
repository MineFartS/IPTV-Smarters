package c.f.a.b.e3;

/* JADX INFO: loaded from: classes2.dex */
public class t implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0[] f7985b;

    public t(t0[] t0VarArr) {
        this.f7985b = t0VarArr;
    }

    @Override // c.f.a.b.e3.t0
    public final long b() {
        long jMin = Long.MAX_VALUE;
        for (t0 t0Var : this.f7985b) {
            long jB = t0Var.b();
            if (jB != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jB);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // c.f.a.b.e3.t0
    public boolean c(long j2) {
        boolean zC;
        boolean z = false;
        do {
            long jB = b();
            if (jB == Long.MIN_VALUE) {
                break;
            }
            zC = false;
            for (t0 t0Var : this.f7985b) {
                long jB2 = t0Var.b();
                boolean z2 = jB2 != Long.MIN_VALUE && jB2 <= j2;
                if (jB2 == jB || z2) {
                    zC |= t0Var.c(j2);
                }
            }
            z |= zC;
        } while (zC);
        return z;
    }

    @Override // c.f.a.b.e3.t0
    public boolean d() {
        for (t0 t0Var : this.f7985b) {
            if (t0Var.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // c.f.a.b.e3.t0
    public final long g() {
        long jMin = Long.MAX_VALUE;
        for (t0 t0Var : this.f7985b) {
            long jG = t0Var.g();
            if (jG != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jG);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // c.f.a.b.e3.t0
    public final void h(long j2) {
        for (t0 t0Var : this.f7985b) {
            t0Var.h(j2);
        }
    }
}
