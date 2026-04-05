package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class a8 extends oa<a8, a> implements dc {
    private static volatile lc<a8> zzahx;
    private static final va<Integer, a7> zzbmw = new c9();
    private static final a8 zzbmx;
    private int zzahj;
    private int zzbis;
    private int zzbmt;
    private wa zzbmv = oa.q();

    public static final class a extends oa.b<a8, a> implements dc {
        public a() {
            super(a8.zzbmx);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        a8 a8Var = new a8();
        zzbmx = a8Var;
        oa.n(a8.class, a8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new a8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbmx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001e", new Object[]{"zzahj", "zzbis", b7.zzgk(), "zzbmt", w3.zzgk(), "zzbmv", a7.zzgk()});
            case 4:
                return zzbmx;
            case 5:
                lc<a8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (a8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbmx);
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
