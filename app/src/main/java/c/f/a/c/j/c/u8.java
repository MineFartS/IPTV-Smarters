package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class u8 extends oa<u8, a> implements dc {
    private static volatile lc<u8> zzahx;
    private static final u8 zzbkk;
    private int zzahj;
    private int zzbkh;
    private int zzbki;
    private s8 zzbkj;

    public static final class a extends oa.b<u8, a> implements dc {
        public a() {
            super(u8.zzbkk);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        u8 u8Var = new u8();
        zzbkk = u8Var;
        oa.n(u8.class, u8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new u8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbkk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbkh", "zzbki", "zzbkj"});
            case 4:
                return zzbkk;
            case 5:
                lc<u8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (u8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbkk);
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
