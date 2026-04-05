package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class z7 extends oa<z7, a> implements dc {
    private static volatile lc<z7> zzahx;
    private static final z7 zzbmu;
    private int zzahj;
    private int zzbmp;
    private int zzbmq;
    private xa<m8> zzbmr = oa.u();
    private xa<m8> zzbms = oa.u();
    private int zzbmt;

    public static final class a extends oa.b<z7, a> implements dc {
        public a() {
            super(z7.zzbmu);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        z7 z7Var = new z7();
        zzbmu = z7Var;
        oa.n(z7.class, z7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new z7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbmu, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002", new Object[]{"zzahj", "zzbmp", t6.zzgk(), "zzbmq", u6.zzgk(), "zzbmr", m8.class, "zzbms", m8.class, "zzbmt", w3.zzgk()});
            case 4:
                return zzbmu;
            case 5:
                lc<z7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (z7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbmu);
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
