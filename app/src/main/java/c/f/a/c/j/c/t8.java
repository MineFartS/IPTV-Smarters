package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class t8 extends oa<t8, a> implements dc {
    private static volatile lc<t8> zzahx;
    private static final t8 zzbkg;
    private xa<p8> zzbkf = oa.u();

    public static final class a extends oa.b<t8, a> implements dc {
        public a() {
            super(t8.zzbkg);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        t8 t8Var = new t8();
        zzbkg = t8Var;
        oa.n(t8.class, t8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new t8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbkg, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbkf", p8.class});
            case 4:
                return zzbkg;
            case 5:
                lc<t8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (t8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbkg);
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
