package c.f.a.c.j.h;

import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends l6<d1, c1> implements r7 {
    private static final d1 zzn;
    private int zza;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = BuildConfig.FLAVOR;
    private t6<f1> zzh = l6.o();
    private t6<b1> zzi = l6.o();
    private t6<h0> zzj = l6.o();
    private String zzk = BuildConfig.FLAVOR;
    private t6<r2> zzm = l6.o();

    static {
        d1 d1Var = new d1();
        zzn = d1Var;
        l6.t(d1.class, d1Var);
    }

    public static c1 F() {
        return zzn.q();
    }

    public static d1 G() {
        return zzn;
    }

    public static /* synthetic */ void I(d1 d1Var, int i2, b1 b1Var) {
        b1Var.getClass();
        t6<b1> t6Var = d1Var.zzi;
        if (!t6Var.zza()) {
            d1Var.zzi = l6.p(t6Var);
        }
        d1Var.zzi.set(i2, b1Var);
    }

    public final List<f1> A() {
        return this.zzh;
    }

    public final int B() {
        return this.zzi.size();
    }

    public final b1 C(int i2) {
        return this.zzi.get(i2);
    }

    public final List<h0> D() {
        return this.zzj;
    }

    public final boolean E() {
        return this.zzl;
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", f1.class, "zzi", b1.class, "zzj", h0.class, "zzk", "zzl", "zzm", r2.class});
        }
        if (i3 == 3) {
            return new d1();
        }
        z0 z0Var = null;
        if (i3 == 4) {
            return new c1(z0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzn;
    }

    public final boolean w() {
        return (this.zza & 1) != 0;
    }

    public final long x() {
        return this.zze;
    }

    public final boolean y() {
        return (this.zza & 2) != 0;
    }

    public final String z() {
        return this.zzf;
    }
}
