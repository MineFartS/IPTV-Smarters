package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class y7 extends oa<y7, a> implements dc {
    private static volatile lc<y7> zzahx;
    private static final y7 zzbmo;
    private int zzahj;
    private int zzblp;
    private int zzbmc;
    private xa<p7> zzbfj = oa.u();
    private xa<p7> zzbmn = oa.u();

    public static final class a extends oa.b<y7, a> implements dc {
        public a() {
            super(y7.zzbmo);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        y7 y7Var = new y7();
        zzbmo = y7Var;
        oa.n(y7.class, y7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new y7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbmo, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzahj", "zzbmc", o6.zzgk(), "zzbfj", p7.class, "zzbmn", p7.class, "zzblp"});
            case 4:
                return zzbmo;
            case 5:
                lc<y7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (y7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbmo);
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
