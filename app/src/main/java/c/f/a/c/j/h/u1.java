package c.f.a.c.j.h;

import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends l6<u1, t1> implements r7 {
    private static final u1 zzk;
    private int zza;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private t6<u1> zzj = l6.o();

    static {
        u1 u1Var = new u1();
        zzk = u1Var;
        l6.t(u1.class, u1Var);
    }

    public static t1 I() {
        return zzk.q();
    }

    public static /* synthetic */ void K(u1 u1Var, String str) {
        str.getClass();
        u1Var.zza |= 1;
        u1Var.zze = str;
    }

    public static /* synthetic */ void L(u1 u1Var, String str) {
        str.getClass();
        u1Var.zza |= 2;
        u1Var.zzf = str;
    }

    public static /* synthetic */ void M(u1 u1Var) {
        u1Var.zza &= -3;
        u1Var.zzf = zzk.zzf;
    }

    public static /* synthetic */ void N(u1 u1Var, long j2) {
        u1Var.zza |= 4;
        u1Var.zzg = j2;
    }

    public static /* synthetic */ void O(u1 u1Var) {
        u1Var.zza &= -5;
        u1Var.zzg = 0L;
    }

    public static /* synthetic */ void P(u1 u1Var, double d2) {
        u1Var.zza |= 16;
        u1Var.zzi = d2;
    }

    public static /* synthetic */ void R(u1 u1Var) {
        u1Var.zza &= -17;
        u1Var.zzi = 0.0d;
    }

    public static /* synthetic */ void S(u1 u1Var, u1 u1Var2) {
        u1Var2.getClass();
        u1Var.W();
        u1Var.zzj.add(u1Var2);
    }

    public static /* synthetic */ void T(u1 u1Var, Iterable iterable) {
        u1Var.W();
        t4.j(iterable, u1Var.zzj);
    }

    public final boolean A() {
        return (this.zza & 4) != 0;
    }

    public final long B() {
        return this.zzg;
    }

    public final boolean C() {
        return (this.zza & 8) != 0;
    }

    public final float D() {
        return this.zzh;
    }

    public final boolean E() {
        return (this.zza & 16) != 0;
    }

    public final double F() {
        return this.zzi;
    }

    public final List<u1> G() {
        return this.zzj;
    }

    public final int H() {
        return this.zzj.size();
    }

    public final void W() {
        t6<u1> t6Var = this.zzj;
        if (t6Var.zza()) {
            return;
        }
        this.zzj = l6.p(t6Var);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", u1.class});
        }
        if (i3 == 3) {
            return new u1();
        }
        g1 g1Var = null;
        if (i3 == 4) {
            return new t1(g1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }

    public final boolean w() {
        return (this.zza & 1) != 0;
    }

    public final String x() {
        return this.zze;
    }

    public final boolean y() {
        return (this.zza & 2) != 0;
    }

    public final String z() {
        return this.zzf;
    }
}
