package c.f.a.c.j.h;

import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends l6<j0, i0> implements r7 {
    private static final j0 zzm;
    private int zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private t6<l0> zzg = l6.o();
    private boolean zzh;
    private r0 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        j0 j0Var = new j0();
        zzm = j0Var;
        l6.t(j0.class, j0Var);
    }

    public static i0 I() {
        return zzm.q();
    }

    public static /* synthetic */ void K(j0 j0Var, String str) {
        j0Var.zza |= 2;
        j0Var.zzf = str;
    }

    public static /* synthetic */ void L(j0 j0Var, int i2, l0 l0Var) {
        l0Var.getClass();
        t6<l0> t6Var = j0Var.zzg;
        if (!t6Var.zza()) {
            j0Var.zzg = l6.p(t6Var);
        }
        j0Var.zzg.set(i2, l0Var);
    }

    public final int A() {
        return this.zzg.size();
    }

    public final l0 B(int i2) {
        return this.zzg.get(i2);
    }

    public final boolean C() {
        return (this.zza & 8) != 0;
    }

    public final r0 D() {
        r0 r0Var = this.zzi;
        return r0Var == null ? r0.G() : r0Var;
    }

    public final boolean E() {
        return this.zzj;
    }

    public final boolean F() {
        return this.zzk;
    }

    public final boolean G() {
        return (this.zza & 64) != 0;
    }

    public final boolean H() {
        return this.zzl;
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zza", "zze", "zzf", "zzg", l0.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i3 == 3) {
            return new j0();
        }
        f0 f0Var = null;
        if (i3 == 4) {
            return new i0(f0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzm;
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

    public final List<l0> z() {
        return this.zzg;
    }
}
