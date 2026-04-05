package c.f.a.c.j.h;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 extends l6<s1, r1> implements r7 {
    private static final s1 zzg;
    private int zza;
    private String zze = BuildConfig.FLAVOR;
    private long zzf;

    static {
        s1 s1Var = new s1();
        zzg = s1Var;
        l6.t(s1.class, s1Var);
    }

    public static r1 w() {
        return zzg.q();
    }

    public static /* synthetic */ void y(s1 s1Var, String str) {
        str.getClass();
        s1Var.zza |= 1;
        s1Var.zze = str;
    }

    public static /* synthetic */ void z(s1 s1Var, long j2) {
        s1Var.zza |= 2;
        s1Var.zzf = j2;
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new s1();
        }
        g1 g1Var = null;
        if (i3 == 4) {
            return new r1(g1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}
