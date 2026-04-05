package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class g8 extends oa<g8, a> implements dc {
    private static volatile lc<g8> zzahx;
    private static final g8 zzbge;
    private int zzahj;
    private int zzbez;
    private int zzbgb;
    private int zzbgc;
    private int zzbgd;

    public static final class a extends oa.b<g8, a> implements dc {
        public a() {
            super(g8.zzbge);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        g8 g8Var = new g8();
        zzbge = g8Var;
        oa.n(g8.class, g8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new g8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbge, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"zzahj", "zzbgb", "zzbez", "zzbgc", t4.zzgk(), "zzbgd"});
            case 4:
                return zzbge;
            case 5:
                lc<g8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (g8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbge);
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
