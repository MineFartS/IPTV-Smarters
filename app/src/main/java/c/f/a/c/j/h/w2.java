package c.f.a.c.j.h;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class w2 extends l6<w2, s2> implements r7 {
    private static final w2 zzk;
    private int zza;
    private int zze;
    private t6<w2> zzf = l6.o();
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private boolean zzi;
    private double zzj;

    static {
        w2 w2Var = new w2();
        zzk = w2Var;
        l6.t(w2.class, w2Var);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zza", "zze", v2.zzb(), "zzf", w2.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new w2();
        }
        k2 k2Var = null;
        if (i3 == 4) {
            return new s2(k2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }
}
