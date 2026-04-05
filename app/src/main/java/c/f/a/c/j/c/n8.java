package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class n8 extends oa<n8, a> implements dc {
    private static volatile lc<n8> zzahx;
    private static final n8 zzbjd;
    private int zzahj;
    private int zzbiz;
    private int zzbja;
    private int zzbjb;
    private xa<b> zzbjc = oa.u();

    public static final class a extends oa.b<n8, a> implements dc {
        public a() {
            super(n8.zzbjd);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    public static final class b extends oa<b, a> implements dc {
        private static volatile lc<b> zzahx;
        private static final b zzbji;
        private int zzahj;
        private int zzbje;
        private int zzbjf;
        private int zzbjg;
        private int zzbjh;

        public static final class a extends oa.b<b, a> implements dc {
            public a() {
                super(b.zzbji);
            }

            public /* synthetic */ a(l7 l7Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzbji = bVar;
            oa.n(b.class, bVar);
        }

        @Override // c.f.a.c.j.c.oa
        public final Object k(int i2, Object obj, Object obj2) {
            l7 l7Var = null;
            switch (l7.f12923a[i2 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(l7Var);
                case 3:
                    return oa.l(zzbji, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzahj", "zzbje", "zzbjf", "zzbjg", "zzbjh"});
                case 4:
                    return zzbji;
                case 5:
                    lc<b> aVar = zzahx;
                    if (aVar == null) {
                        synchronized (b.class) {
                            aVar = zzahx;
                            if (aVar == null) {
                                aVar = new oa.a<>(zzbji);
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

    static {
        n8 n8Var = new n8();
        zzbjd = n8Var;
        oa.n(n8.class, n8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new n8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbjd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzahj", "zzbiz", "zzbja", "zzbjb", "zzbjc", b.class});
            case 4:
                return zzbjd;
            case 5:
                lc<n8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (n8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbjd);
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
