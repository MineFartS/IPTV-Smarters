package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class x7 extends oa<x7, a> implements dc {
    private static volatile lc<x7> zzahx;
    private static final x7 zzbmm;
    private int zzahj;
    private int zzbis;
    private int zzbit;
    private c8 zzbiu;

    public static final class a extends oa.b<x7, a> implements dc {
        public a() {
            super(x7.zzbmm);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        x7 x7Var = new x7();
        zzbmm = x7Var;
        oa.n(x7.class, x7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new x7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbmm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbis", i6.zzgk(), "zzbit", "zzbiu"});
            case 4:
                return zzbmm;
            case 5:
                lc<x7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (x7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbmm);
                            zzahx = aVar;
                        }
                        break;
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
