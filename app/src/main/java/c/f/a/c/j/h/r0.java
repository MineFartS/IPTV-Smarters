package c.f.a.c.j.h;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends l6<r0, m0> implements r7 {
    private static final r0 zzj;
    private int zza;
    private int zze;
    private boolean zzf;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        r0 r0Var = new r0();
        zzj = r0Var;
        l6.t(r0.class, r0Var);
    }

    public static r0 G() {
        return zzj;
    }

    public final boolean A() {
        return (this.zza & 4) != 0;
    }

    public final String B() {
        return this.zzg;
    }

    public final boolean C() {
        return (this.zza & 8) != 0;
    }

    public final String D() {
        return this.zzh;
    }

    public final boolean E() {
        return (this.zza & 16) != 0;
    }

    public final String F() {
        return this.zzi;
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zza", "zze", q0.zzb(), "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new r0();
        }
        f0 f0Var = null;
        if (i3 == 4) {
            return new m0(f0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzj;
    }

    public final boolean w() {
        return (this.zza & 1) != 0;
    }

    public final q0 x() {
        q0 q0VarZza = q0.zza(this.zze);
        return q0VarZza == null ? q0.UNKNOWN_COMPARISON_TYPE : q0VarZza;
    }

    public final boolean y() {
        return (this.zza & 2) != 0;
    }

    public final boolean z() {
        return this.zzf;
    }
}
