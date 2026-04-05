package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class y8 extends oa<y8, a> implements dc {
    private static volatile lc<y8> zzahx;
    private static final y8 zzbkv;
    private int zzahj;
    private int zzbgf;
    private long zzbkt;
    private int zzbku;

    public static final class a extends oa.b<y8, a> implements dc {
        public a() {
            super(y8.zzbkv);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        y8 y8Var = new y8();
        zzbkv = y8Var;
        oa.n(y8.class, y8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new y8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbkv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"zzahj", "zzbgf", c5.zzgk(), "zzbkt", "zzbku", i3.zzgk()});
            case 4:
                return zzbkv;
            case 5:
                lc<y8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (y8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbkv);
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
