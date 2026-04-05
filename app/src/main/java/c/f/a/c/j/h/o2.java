package c.f.a.c.j.h;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class o2 extends l6<o2, n2> implements r7 {
    private static final o2 zzg;
    private int zza;
    private String zze = BuildConfig.FLAVOR;
    private t6<w2> zzf = l6.o();

    static {
        o2 o2Var = new o2();
        zzg = o2Var;
        l6.t(o2.class, o2Var);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zze", "zzf", w2.class});
        }
        if (i3 == 3) {
            return new o2();
        }
        k2 k2Var = null;
        if (i3 == 4) {
            return new n2(k2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}
