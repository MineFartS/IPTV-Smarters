package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class r7 extends oa<r7, a> implements dc {
    private static volatile lc<r7> zzahx;
    private static final r7 zzblu;
    private int zzahj;
    private int zzblr;
    private int zzbls;
    private int zzblt;

    public static final class a extends oa.b<r7, a> implements dc {
        public a() {
            super(r7.zzblu);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        r7 r7Var = new r7();
        zzblu = r7Var;
        oa.n(r7.class, r7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new r7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzblu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"zzahj", "zzblr", "zzbls", i5.zzgk(), "zzblt"});
            case 4:
                return zzblu;
            case 5:
                lc<r7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (r7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzblu);
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
