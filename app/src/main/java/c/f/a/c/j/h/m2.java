package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class m2 extends l6<m2, l2> implements r7 {
    private static final m2 zze;
    private t6<o2> zza = l6.o();

    static {
        m2 m2Var = new m2();
        zze = m2Var;
        l6.t(m2.class, m2Var);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", o2.class});
        }
        if (i3 == 3) {
            return new m2();
        }
        k2 k2Var = null;
        if (i3 == 4) {
            return new l2(k2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zze;
    }
}
