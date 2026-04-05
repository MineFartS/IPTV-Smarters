package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class c8 extends oa<c8, a> implements dc {
    private static volatile lc<c8> zzahx;
    private static final c8 zzbfe;
    private int zzahj;
    private int zzbez;
    private double zzbfa;
    private double zzbfb;
    private double zzbfc;
    private double zzbfd;

    public static final class a extends oa.b<c8, a> implements dc {
        public a() {
            super(c8.zzbfe);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        c8 c8Var = new c8();
        zzbfe = c8Var;
        oa.n(c8.class, c8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new c8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbfe, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zzahj", "zzbez", "zzbfa", "zzbfb", "zzbfc", "zzbfd"});
            case 4:
                return zzbfe;
            case 5:
                lc<c8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (c8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbfe);
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
