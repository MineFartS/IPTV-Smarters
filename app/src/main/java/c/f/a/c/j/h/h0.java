package c.f.a.c.j.h;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends l6<h0, g0> implements r7 {
    private static final h0 zzj;
    private int zza;
    private int zze;
    private t6<t0> zzf = l6.o();
    private t6<j0> zzg = l6.o();
    private boolean zzh;
    private boolean zzi;

    static {
        h0 h0Var = new h0();
        zzj = h0Var;
        l6.t(h0.class, h0Var);
    }

    public static /* synthetic */ void F(h0 h0Var, int i2, t0 t0Var) {
        t0Var.getClass();
        t6<t0> t6Var = h0Var.zzf;
        if (!t6Var.zza()) {
            h0Var.zzf = l6.p(t6Var);
        }
        h0Var.zzf.set(i2, t0Var);
    }

    public static /* synthetic */ void G(h0 h0Var, int i2, j0 j0Var) {
        j0Var.getClass();
        t6<j0> t6Var = h0Var.zzg;
        if (!t6Var.zza()) {
            h0Var.zzg = l6.p(t6Var);
        }
        h0Var.zzg.set(i2, j0Var);
    }

    public final t0 A(int i2) {
        return this.zzf.get(i2);
    }

    public final List<j0> B() {
        return this.zzg;
    }

    public final int C() {
        return this.zzg.size();
    }

    public final j0 D(int i2) {
        return this.zzg.get(i2);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zza", "zze", "zzf", t0.class, "zzg", j0.class, "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new h0();
        }
        f0 f0Var = null;
        if (i3 == 4) {
            return new g0(f0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzj;
    }

    public final boolean w() {
        return (this.zza & 1) != 0;
    }

    public final int x() {
        return this.zze;
    }

    public final List<t0> y() {
        return this.zzf;
    }

    public final int z() {
        return this.zzf.size();
    }
}
