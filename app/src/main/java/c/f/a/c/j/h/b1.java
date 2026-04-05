package c.f.a.c.j.h;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends l6<b1, a1> implements r7 {
    private static final b1 zzi;
    private int zza;
    private String zze = BuildConfig.FLAVOR;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        b1 b1Var = new b1();
        zzi = b1Var;
        l6.t(b1.class, b1Var);
    }

    public static /* synthetic */ void C(b1 b1Var, String str) {
        str.getClass();
        b1Var.zza |= 1;
        b1Var.zze = str;
    }

    public final int A() {
        return this.zzh;
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new b1();
        }
        z0 z0Var = null;
        if (i3 == 4) {
            return new a1(z0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }

    public final String w() {
        return this.zze;
    }

    public final boolean x() {
        return this.zzf;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zza & 8) != 0;
    }
}
