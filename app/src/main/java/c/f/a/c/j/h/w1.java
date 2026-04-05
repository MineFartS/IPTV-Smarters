package c.f.a.c.j.h;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 extends l6<w1, v1> implements r7 {
    private static final w1 zze;
    private t6<y1> zza = l6.o();

    static {
        w1 w1Var = new w1();
        zze = w1Var;
        l6.t(w1.class, w1Var);
    }

    public static /* synthetic */ void A(w1 w1Var, y1 y1Var) {
        y1Var.getClass();
        t6<y1> t6Var = w1Var.zza;
        if (!t6Var.zza()) {
            w1Var.zza = l6.p(t6Var);
        }
        w1Var.zza.add(y1Var);
    }

    public static v1 y() {
        return zze.q();
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", y1.class});
        }
        if (i3 == 3) {
            return new w1();
        }
        g1 g1Var = null;
        if (i3 == 4) {
            return new v1(g1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zze;
    }

    public final List<y1> w() {
        return this.zza;
    }

    public final y1 x(int i2) {
        return this.zza.get(0);
    }
}
