package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class o7 extends oa<o7, a> implements dc {
    private static volatile lc<o7> zzahx;
    private static final o7 zzblh;
    private int zzahj;
    private int zzble;
    private int zzblf;
    private int zzblg;

    public static final class a extends oa.b<o7, a> implements dc {
        public a() {
            super(o7.zzblh);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        o7 o7Var = new o7();
        zzblh = o7Var;
        oa.n(o7.class, o7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new o7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzblh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzahj", "zzble", "zzblf", "zzblg"});
            case 4:
                return zzblh;
            case 5:
                lc<o7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (o7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzblh);
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
