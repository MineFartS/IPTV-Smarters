package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class u7 extends oa<u7, a> implements dc {
    private static volatile lc<u7> zzahx;
    private static final u7 zzbmg;
    private int zzahj;
    private m8 zzbfq;
    private int zzbgf;
    private long zzbkt;
    private int zzbmc;
    private int zzbmd;
    private int zzbme;
    private xa<m8> zzbmf = oa.u();

    public static final class a extends oa.b<u7, a> implements dc {
        public a() {
            super(u7.zzbmg);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        u7 u7Var = new u7();
        zzbmg = u7Var;
        oa.n(u7.class, u7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new u7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbmg, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzahj", "zzbfq", "zzbmc", w5.zzgk(), "zzbgf", u5.zzgk(), "zzbmd", w3.zzgk(), "zzbme", i3.zzgk(), "zzbkt", "zzbmf", m8.class});
            case 4:
                return zzbmg;
            case 5:
                lc<u7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (u7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbmg);
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
