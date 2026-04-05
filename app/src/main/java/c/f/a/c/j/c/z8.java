package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class z8 extends oa<z8, a> implements dc {
    private static volatile lc<z8> zzahx;
    private static final z8 zzbkz;
    private int zzahj;
    private int zzbft;
    private int zzbjo;
    private int zzbkc;
    private int zzbkw;
    private boolean zzbkx;
    private boolean zzbky;

    public static final class a extends oa.b<z8, a> implements dc {
        public a() {
            super(z8.zzbkz);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        z8 z8Var = new z8();
        zzbkz = z8Var;
        oa.n(z8.class, z8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new z8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbkz, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဆ\u0005", new Object[]{"zzahj", "zzbkc", "zzbkw", d5.zzgk(), "zzbkx", "zzbky", "zzbjo", o3.zzgk(), "zzbft"});
            case 4:
                return zzbkz;
            case 5:
                lc<z8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (z8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbkz);
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
