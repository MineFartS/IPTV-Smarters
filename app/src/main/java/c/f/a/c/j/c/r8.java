package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class r8 extends oa<r8, a> implements dc {
    private static volatile lc<r8> zzahx;
    private static final r8 zzbka;
    private int zzahj;
    private int zzbju;

    public static final class a extends oa.b<r8, a> implements dc {
        public a() {
            super(r8.zzbka);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        r8 r8Var = new r8();
        zzbka = r8Var;
        oa.n(r8.class, r8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new r8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbka, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzahj", "zzbju", i4.zzgk()});
            case 4:
                return zzbka;
            case 5:
                lc<r8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (r8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbka);
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
