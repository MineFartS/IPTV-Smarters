package c.f.a.c.j.h;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends l6<l0, k0> implements r7 {
    private static final l0 zzi;
    private int zza;
    private y0 zze;
    private r0 zzf;
    private boolean zzg;
    private String zzh = BuildConfig.FLAVOR;

    static {
        l0 l0Var = new l0();
        zzi = l0Var;
        l6.t(l0.class, l0Var);
    }

    public static l0 E() {
        return zzi;
    }

    public static /* synthetic */ void G(l0 l0Var, String str) {
        l0Var.zza |= 8;
        l0Var.zzh = str;
    }

    public final boolean A() {
        return (this.zza & 4) != 0;
    }

    public final boolean B() {
        return this.zzg;
    }

    public final boolean C() {
        return (this.zza & 8) != 0;
    }

    public final String D() {
        return this.zzh;
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new l0();
        }
        f0 f0Var = null;
        if (i3 == 4) {
            return new k0(f0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }

    public final boolean w() {
        return (this.zza & 1) != 0;
    }

    public final y0 x() {
        y0 y0Var = this.zze;
        return y0Var == null ? y0.E() : y0Var;
    }

    public final boolean y() {
        return (this.zza & 2) != 0;
    }

    public final r0 z() {
        r0 r0Var = this.zzf;
        return r0Var == null ? r0.G() : r0Var;
    }
}
