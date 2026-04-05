package c.f.a.c.j.h;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f2 extends l6<f2, e2> implements r7 {
    private static final f2 zzh;
    private r6 zza = l6.m();
    private r6 zze = l6.m();
    private t6<n1> zzf = l6.o();
    private t6<h2> zzg = l6.o();

    static {
        f2 f2Var = new f2();
        zzh = f2Var;
        l6.t(f2.class, f2Var);
    }

    public static e2 G() {
        return zzh.q();
    }

    public static f2 H() {
        return zzh;
    }

    public static /* synthetic */ void J(f2 f2Var, Iterable iterable) {
        r6 r6Var = f2Var.zza;
        if (!r6Var.zza()) {
            f2Var.zza = l6.n(r6Var);
        }
        t4.j(iterable, f2Var.zza);
    }

    public static /* synthetic */ void K(f2 f2Var) {
        f2Var.zza = l6.m();
    }

    public static /* synthetic */ void L(f2 f2Var, Iterable iterable) {
        r6 r6Var = f2Var.zze;
        if (!r6Var.zza()) {
            f2Var.zze = l6.n(r6Var);
        }
        t4.j(iterable, f2Var.zze);
    }

    public static /* synthetic */ void M(f2 f2Var) {
        f2Var.zze = l6.m();
    }

    public static /* synthetic */ void N(f2 f2Var, Iterable iterable) {
        f2Var.S();
        t4.j(iterable, f2Var.zzf);
    }

    public static /* synthetic */ void O(f2 f2Var, int i2) {
        f2Var.S();
        f2Var.zzf.remove(i2);
    }

    public static /* synthetic */ void P(f2 f2Var, Iterable iterable) {
        f2Var.T();
        t4.j(iterable, f2Var.zzg);
    }

    public static /* synthetic */ void R(f2 f2Var, int i2) {
        f2Var.T();
        f2Var.zzg.remove(i2);
    }

    public final List<n1> A() {
        return this.zzf;
    }

    public final int B() {
        return this.zzf.size();
    }

    public final n1 C(int i2) {
        return this.zzf.get(i2);
    }

    public final List<h2> D() {
        return this.zzg;
    }

    public final int E() {
        return this.zzg.size();
    }

    public final h2 F(int i2) {
        return this.zzg.get(i2);
    }

    public final void S() {
        t6<n1> t6Var = this.zzf;
        if (t6Var.zza()) {
            return;
        }
        this.zzf = l6.p(t6Var);
    }

    public final void T() {
        t6<h2> t6Var = this.zzg;
        if (t6Var.zza()) {
            return;
        }
        this.zzg = l6.p(t6Var);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzh, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zza", "zze", "zzf", n1.class, "zzg", h2.class});
        }
        if (i3 == 3) {
            return new f2();
        }
        g1 g1Var = null;
        if (i3 == 4) {
            return new e2(g1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }

    public final List<Long> w() {
        return this.zza;
    }

    public final int x() {
        return this.zza.size();
    }

    public final List<Long> y() {
        return this.zze;
    }

    public final int z() {
        return this.zze.size();
    }
}
