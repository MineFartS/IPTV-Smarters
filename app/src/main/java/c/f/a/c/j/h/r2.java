package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class r2 extends l6<r2, q2> implements r7 {
    private static final r2 zzg;
    private int zza;
    private t6<w2> zze = l6.o();
    private m2 zzf;

    static {
        r2 r2Var = new r2();
        zzg = r2Var;
        l6.t(r2.class, r2Var);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zze", w2.class, "zzf"});
        }
        if (i3 == 3) {
            return new r2();
        }
        k2 k2Var = null;
        if (i3 == 4) {
            return new q2(k2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}
