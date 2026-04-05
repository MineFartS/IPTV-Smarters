package c.f.a.c.j.h;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends l6<f1, e1> implements r7 {
    private static final f1 zzg;
    private int zza;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;

    static {
        f1 f1Var = new f1();
        zzg = f1Var;
        l6.t(f1.class, f1Var);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new f1();
        }
        z0 z0Var = null;
        if (i3 == 4) {
            return new e1(z0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final String w() {
        return this.zze;
    }

    public final String x() {
        return this.zzf;
    }
}
