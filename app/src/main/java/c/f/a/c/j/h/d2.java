package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 extends l6<d2, z1> implements r7 {
    private static final d2 zzg;
    private int zza;
    private int zze = 1;
    private t6<s1> zzf = l6.o();

    static {
        d2 d2Var = new d2();
        zzg = d2Var;
        l6.t(d2.class, d2Var);
    }

    public static z1 w() {
        return zzg.q();
    }

    public static /* synthetic */ void y(d2 d2Var, s1 s1Var) {
        s1Var.getClass();
        t6<s1> t6Var = d2Var.zzf;
        if (!t6Var.zza()) {
            d2Var.zzf = l6.p(t6Var);
        }
        d2Var.zzf.add(s1Var);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zza", "zze", c2.zzb(), "zzf", s1.class});
        }
        if (i3 == 3) {
            return new d2();
        }
        g1 g1Var = null;
        if (i3 == 4) {
            return new z1(g1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}
