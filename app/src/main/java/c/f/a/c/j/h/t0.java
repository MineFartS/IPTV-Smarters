package c.f.a.c.j.h;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends l6<t0, s0> implements r7 {
    private static final t0 zzk;
    private int zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private l0 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        t0 t0Var = new t0();
        zzk = t0Var;
        l6.t(t0.class, t0Var);
    }

    public static s0 E() {
        return zzk.q();
    }

    public static /* synthetic */ void G(t0 t0Var, String str) {
        t0Var.zza |= 2;
        t0Var.zzf = str;
    }

    public final boolean A() {
        return this.zzh;
    }

    public final boolean B() {
        return this.zzi;
    }

    public final boolean C() {
        return (this.zza & 32) != 0;
    }

    public final boolean D() {
        return this.zzj;
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new t0();
        }
        f0 f0Var = null;
        if (i3 == 4) {
            return new s0(f0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }

    public final boolean w() {
        return (this.zza & 1) != 0;
    }

    public final int x() {
        return this.zze;
    }

    public final String y() {
        return this.zzf;
    }

    public final l0 z() {
        l0 l0Var = this.zzg;
        return l0Var == null ? l0.E() : l0Var;
    }
}
