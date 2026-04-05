package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class l8 extends oa<l8, a> implements dc {
    private static volatile lc<l8> zzahx;
    private static final l8 zzbiv;
    private int zzahj;
    private int zzbis;
    private int zzbit;
    private c8 zzbiu;

    public static final class a extends oa.b<l8, a> implements dc {
        public a() {
            super(l8.zzbiv);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        l8 l8Var = new l8();
        zzbiv = l8Var;
        oa.n(l8.class, l8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new l8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbiv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbis", p3.zzgk(), "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                lc<l8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (l8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbiv);
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
