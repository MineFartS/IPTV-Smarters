package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends l6<l1, k1> implements r7 {
    private static final l1 zzi;
    private int zza;
    private int zze;
    private f2 zzf;
    private f2 zzg;
    private boolean zzh;

    static {
        l1 l1Var = new l1();
        zzi = l1Var;
        l6.t(l1.class, l1Var);
    }

    public static k1 D() {
        return zzi.q();
    }

    public static /* synthetic */ void F(l1 l1Var, int i2) {
        l1Var.zza |= 1;
        l1Var.zze = i2;
    }

    public static /* synthetic */ void G(l1 l1Var, f2 f2Var) {
        f2Var.getClass();
        l1Var.zzf = f2Var;
        l1Var.zza |= 2;
    }

    public static /* synthetic */ void H(l1 l1Var, f2 f2Var) {
        l1Var.zzg = f2Var;
        l1Var.zza |= 4;
    }

    public static /* synthetic */ void I(l1 l1Var, boolean z) {
        l1Var.zza |= 8;
        l1Var.zzh = z;
    }

    public final f2 A() {
        f2 f2Var = this.zzg;
        return f2Var == null ? f2.H() : f2Var;
    }

    public final boolean B() {
        return (this.zza & 8) != 0;
    }

    public final boolean C() {
        return this.zzh;
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new l1();
        }
        g1 g1Var = null;
        if (i3 == 4) {
            return new k1(g1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }

    public final boolean w() {
        return (this.zza & 1) != 0;
    }

    public final int x() {
        return this.zze;
    }

    public final f2 y() {
        f2 f2Var = this.zzf;
        return f2Var == null ? f2.H() : f2Var;
    }

    public final boolean z() {
        return (this.zza & 4) != 0;
    }
}
