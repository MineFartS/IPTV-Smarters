package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class v8 extends oa<v8, a> implements dc {
    private static volatile lc<v8> zzahx;
    private static final v8 zzbkn;
    private int zzahj;
    private int zzbkl;
    private int zzbkm;

    public static final class a extends oa.b<v8, a> implements dc {
        public a() {
            super(v8.zzbkn);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        v8 v8Var = new v8();
        zzbkn = v8Var;
        oa.n(v8.class, v8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new v8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbkn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"zzahj", "zzbkl", v3.zzgk(), "zzbkm"});
            case 4:
                return zzbkn;
            case 5:
                lc<v8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (v8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbkn);
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
