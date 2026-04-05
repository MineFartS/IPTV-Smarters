package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class h8 extends oa<h8, a> implements dc {
    private static volatile lc<h8> zzahx;
    private static final h8 zzbgg;
    private int zzahj;
    private int zzbgf;

    public static final class a extends oa.b<h8, a> implements dc {
        public a() {
            super(h8.zzbgg);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        h8 h8Var = new h8();
        zzbgg = h8Var;
        oa.n(h8.class, h8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new h8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbgg, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzahj", "zzbgf", j3.zzgk()});
            case 4:
                return zzbgg;
            case 5:
                lc<h8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (h8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbgg);
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
