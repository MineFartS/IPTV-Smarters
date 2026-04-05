package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class n7 extends oa<n7, a> implements dc {
    private static volatile lc<n7> zzahx;
    private static final n7 zzbld;
    private int zzahj;
    private long zzbla;
    private ya zzblb = oa.r();
    private ya zzblc = oa.r();

    public static final class a extends oa.b<n7, a> implements dc {
        public a() {
            super(n7.zzbld);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        n7 n7Var = new n7();
        zzbld = n7Var;
        oa.n(n7.class, n7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new n7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbld, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzahj", "zzbla", "zzblb", "zzblc"});
            case 4:
                return zzbld;
            case 5:
                lc<n7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (n7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbld);
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
