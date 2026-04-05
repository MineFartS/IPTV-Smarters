package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class t7 extends oa<t7, a> implements dc {
    private static volatile lc<t7> zzahx;
    private static final t7 zzbmb;
    private int zzahj;
    private int zzblz;
    private int zzbma;

    public static final class a extends oa.b<t7, a> implements dc {
        public a() {
            super(t7.zzbmb);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        t7 t7Var = new t7();
        zzbmb = t7Var;
        oa.n(t7.class, t7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new t7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbmb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzahj", "zzblz", p5.zzgk(), "zzbma", p5.zzgk()});
            case 4:
                return zzbmb;
            case 5:
                lc<t7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (t7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbmb);
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
