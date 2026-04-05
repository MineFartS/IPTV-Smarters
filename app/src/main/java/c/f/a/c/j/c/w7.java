package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class w7 extends oa<w7, a> implements dc {
    private static volatile lc<w7> zzahx;
    private static final w7 zzbml;
    private int zzahj;
    private c8 zzbiu;

    public static final class a extends oa.b<w7, a> implements dc {
        public a() {
            super(w7.zzbml);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        w7 w7Var = new w7();
        zzbml = w7Var;
        oa.n(w7.class, w7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new w7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbml, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzahj", "zzbiu"});
            case 4:
                return zzbml;
            case 5:
                lc<w7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (w7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbml);
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
