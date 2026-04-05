package c.f.a.c.j.h;

import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends l6<q1, p1> implements r7 {
    private static final q1 zzj;
    private int zza;
    private t6<u1> zze = l6.o();
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        q1 q1Var = new q1();
        zzj = q1Var;
        l6.t(q1.class, q1Var);
    }

    public static p1 G() {
        return zzj.q();
    }

    public static /* synthetic */ void I(q1 q1Var, int i2, u1 u1Var) {
        u1Var.getClass();
        q1Var.R();
        q1Var.zze.set(i2, u1Var);
    }

    public static /* synthetic */ void J(q1 q1Var, u1 u1Var) {
        u1Var.getClass();
        q1Var.R();
        q1Var.zze.add(u1Var);
    }

    public static /* synthetic */ void K(q1 q1Var, Iterable iterable) {
        q1Var.R();
        t4.j(iterable, q1Var.zze);
    }

    public static /* synthetic */ void M(q1 q1Var, int i2) {
        q1Var.R();
        q1Var.zze.remove(i2);
    }

    public static /* synthetic */ void N(q1 q1Var, String str) {
        str.getClass();
        q1Var.zza |= 1;
        q1Var.zzf = str;
    }

    public static /* synthetic */ void O(q1 q1Var, long j2) {
        q1Var.zza |= 2;
        q1Var.zzg = j2;
    }

    public static /* synthetic */ void P(q1 q1Var, long j2) {
        q1Var.zza |= 4;
        q1Var.zzh = j2;
    }

    public final boolean A() {
        return (this.zza & 2) != 0;
    }

    public final long B() {
        return this.zzg;
    }

    public final boolean C() {
        return (this.zza & 4) != 0;
    }

    public final long D() {
        return this.zzh;
    }

    public final boolean E() {
        return (this.zza & 8) != 0;
    }

    public final int F() {
        return this.zzi;
    }

    public final void R() {
        t6<u1> t6Var = this.zze;
        if (t6Var.zza()) {
            return;
        }
        this.zze = l6.p(t6Var);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zza", "zze", u1.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new q1();
        }
        g1 g1Var = null;
        if (i3 == 4) {
            return new p1(g1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzj;
    }

    public final List<u1> w() {
        return this.zze;
    }

    public final int x() {
        return this.zze.size();
    }

    public final u1 y(int i2) {
        return this.zze.get(i2);
    }

    public final String z() {
        return this.zzf;
    }
}
