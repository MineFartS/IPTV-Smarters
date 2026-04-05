package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class w8 extends oa<w8, a> implements dc {
    private static volatile lc<w8> zzahx;
    private static final w8 zzbkr;
    private int zzahj;
    private byte zzbim = 2;
    private int zzbko;
    private int zzbkp;
    private int zzbkq;

    public static final class a extends oa.b<w8, a> implements dc {
        public a() {
            super(w8.zzbkr);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        w8 w8Var = new w8();
        zzbkr = w8Var;
        oa.n(w8.class, w8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new w8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbkr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zzahj", "zzbko", x4.zzgk(), "zzbkp", "zzbkq", h7.zzgk()});
            case 4:
                return zzbkr;
            case 5:
                lc<w8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (w8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbkr);
                            zzahx = aVar;
                        }
                        break;
                    }
                }
                return aVar;
            case 6:
                return Byte.valueOf(this.zzbim);
            case 7:
                this.zzbim = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
