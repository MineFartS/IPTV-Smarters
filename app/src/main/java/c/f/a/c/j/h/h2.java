package c.f.a.c.j.h;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h2 extends l6<h2, g2> implements r7 {
    private static final h2 zzg;
    private int zza;
    private int zze;
    private r6 zzf = l6.m();

    static {
        h2 h2Var = new h2();
        zzg = h2Var;
        l6.t(h2.class, h2Var);
    }

    public static g2 B() {
        return zzg.q();
    }

    public static /* synthetic */ void D(h2 h2Var, int i2) {
        h2Var.zza |= 1;
        h2Var.zze = i2;
    }

    public static /* synthetic */ void E(h2 h2Var, Iterable iterable) {
        r6 r6Var = h2Var.zzf;
        if (!r6Var.zza()) {
            h2Var.zzf = l6.n(r6Var);
        }
        t4.j(iterable, h2Var.zzf);
    }

    public final long A(int i2) {
        return this.zzf.w(i2);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zza", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new h2();
        }
        g1 g1Var = null;
        if (i3 == 4) {
            return new g2(g1Var);
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

    public final List<Long> y() {
        return this.zzf;
    }

    public final int z() {
        return this.zzf.size();
    }
}
