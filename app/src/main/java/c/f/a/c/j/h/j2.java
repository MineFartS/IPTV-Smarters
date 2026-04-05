package c.f.a.c.j.h;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class j2 extends l6<j2, i2> implements r7 {
    private static final j2 zzk;
    private int zza;
    private long zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        j2 j2Var = new j2();
        zzk = j2Var;
        l6.t(j2.class, j2Var);
    }

    public static i2 F() {
        return zzk.q();
    }

    public static /* synthetic */ void H(j2 j2Var, long j2) {
        j2Var.zza |= 1;
        j2Var.zze = j2;
    }

    public static /* synthetic */ void I(j2 j2Var, String str) {
        str.getClass();
        j2Var.zza |= 2;
        j2Var.zzf = str;
    }

    public static /* synthetic */ void J(j2 j2Var, String str) {
        str.getClass();
        j2Var.zza |= 4;
        j2Var.zzg = str;
    }

    public static /* synthetic */ void K(j2 j2Var) {
        j2Var.zza &= -5;
        j2Var.zzg = zzk.zzg;
    }

    public static /* synthetic */ void L(j2 j2Var, long j2) {
        j2Var.zza |= 8;
        j2Var.zzh = j2;
    }

    public static /* synthetic */ void M(j2 j2Var) {
        j2Var.zza &= -9;
        j2Var.zzh = 0L;
    }

    public static /* synthetic */ void N(j2 j2Var, double d2) {
        j2Var.zza |= 32;
        j2Var.zzj = d2;
    }

    public static /* synthetic */ void O(j2 j2Var) {
        j2Var.zza &= -33;
        j2Var.zzj = 0.0d;
    }

    public final String A() {
        return this.zzg;
    }

    public final boolean B() {
        return (this.zza & 8) != 0;
    }

    public final long C() {
        return this.zzh;
    }

    public final boolean D() {
        return (this.zza & 32) != 0;
    }

    public final double E() {
        return this.zzj;
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new j2();
        }
        g1 g1Var = null;
        if (i3 == 4) {
            return new i2(g1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }

    public final boolean w() {
        return (this.zza & 1) != 0;
    }

    public final long x() {
        return this.zze;
    }

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zza & 4) != 0;
    }
}
