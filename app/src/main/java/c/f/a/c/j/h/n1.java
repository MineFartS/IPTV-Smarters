package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 extends l6<n1, m1> implements r7 {
    private static final n1 zzg;
    private int zza;
    private int zze;
    private long zzf;

    static {
        n1 n1Var = new n1();
        zzg = n1Var;
        l6.t(n1.class, n1Var);
    }

    public static m1 A() {
        return zzg.q();
    }

    public static /* synthetic */ void C(n1 n1Var, int i2) {
        n1Var.zza |= 1;
        n1Var.zze = i2;
    }

    public static /* synthetic */ void D(n1 n1Var, long j2) {
        n1Var.zza |= 2;
        n1Var.zzf = j2;
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new n1();
        }
        g1 g1Var = null;
        if (i3 == 4) {
            return new m1(g1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final boolean w() {
        return (this.zza & 1) != 0;
    }

    public final int x() {
        return this.zze;
    }

    public final boolean y() {
        return (this.zza & 2) != 0;
    }

    public final long z() {
        return this.zzf;
    }
}
