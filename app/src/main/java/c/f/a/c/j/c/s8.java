package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class s8 extends oa<s8, a> implements dc {
    private static volatile lc<s8> zzahx;
    private static final s8 zzbke;
    private int zzahj;
    private int zzbkb;
    private int zzbkc;
    private int zzbkd;

    public static final class a extends oa.b<s8, a> implements dc {
        public a() {
            super(s8.zzbke);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        s8 s8Var = new s8();
        zzbke = s8Var;
        oa.n(s8.class, s8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new s8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbke, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzahj", "zzbkb", i4.zzgk(), "zzbkc", "zzbkd"});
            case 4:
                return zzbke;
            case 5:
                lc<s8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (s8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbke);
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
