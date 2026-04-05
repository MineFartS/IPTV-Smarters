package c.f.a.c.j.h;

import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends l6<y0, u0> implements r7 {
    private static final y0 zzi;
    private int zza;
    private int zze;
    private boolean zzg;
    private String zzf = BuildConfig.FLAVOR;
    private t6<String> zzh = l6.o();

    static {
        y0 y0Var = new y0();
        zzi = y0Var;
        l6.t(y0.class, y0Var);
    }

    public static y0 E() {
        return zzi;
    }

    public final boolean A() {
        return (this.zza & 4) != 0;
    }

    public final boolean B() {
        return this.zzg;
    }

    public final List<String> C() {
        return this.zzh;
    }

    public final int D() {
        return this.zzh.size();
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zza", "zze", x0.zzb(), "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new y0();
        }
        f0 f0Var = null;
        if (i3 == 4) {
            return new u0(f0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }

    public final boolean w() {
        return (this.zza & 1) != 0;
    }

    public final x0 x() {
        x0 x0VarZza = x0.zza(this.zze);
        return x0VarZza == null ? x0.UNKNOWN_MATCH_TYPE : x0VarZza;
    }

    public final boolean y() {
        return (this.zza & 2) != 0;
    }

    public final String z() {
        return this.zzf;
    }
}
