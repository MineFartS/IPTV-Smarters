package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class k8 extends oa<k8, a> implements dc {
    private static volatile lc<k8> zzahx;
    private static final k8 zzbir;
    private int zzahj;
    private int zzbio = 0;
    private Object zzbip;
    private long zzbiq;

    public static final class a extends oa.b<k8, a> implements dc {
        public a() {
            super(k8.zzbir);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        k8 k8Var = new k8();
        zzbir = k8Var;
        oa.n(k8.class, k8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new k8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbir, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002်\u0000\u0003ဵ\u0000\u0004း\u0000", new Object[]{"zzbip", "zzbio", "zzahj", "zzbiq"});
            case 4:
                return zzbir;
            case 5:
                lc<k8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (k8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbir);
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
