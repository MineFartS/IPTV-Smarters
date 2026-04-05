package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class o8 extends oa<o8, a> implements dc {
    private static volatile lc<o8> zzahx;
    private static final o8 zzbjp;
    private int zzahj;
    private boolean zzbjj;
    private int zzbjk;
    private int zzbjl;
    private int zzbjm;
    private z8 zzbjn;
    private int zzbjo;

    public static final class a extends oa.b<o8, a> implements dc {
        public a() {
            super(o8.zzbjp);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        o8 o8Var = new o8();
        zzbjp = o8Var;
        oa.n(o8.class, o8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new o8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbjp, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"zzahj", "zzbjj", "zzbjk", w3.zzgk(), "zzbjl", c4.zzgk(), "zzbjm", d3.zzgk(), "zzbjn", "zzbjo", b4.zzgk()});
            case 4:
                return zzbjp;
            case 5:
                lc<o8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (o8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbjp);
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
