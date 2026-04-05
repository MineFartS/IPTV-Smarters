package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class q8 extends oa<q8, a> implements dc {
    private static volatile lc<q8> zzahx;
    private static final q8 zzbjz;
    private int zzahj;
    private int zzbfh;
    private int zzbjt;
    private int zzbju;
    private wa zzbjv = oa.q();
    private wa zzbjw = oa.q();
    private xa<String> zzbjx = oa.u();
    private xa<String> zzbjy = oa.u();

    public static final class a extends oa.b<q8, a> implements dc {
        public a() {
            super(q8.zzbjz);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        q8 q8Var = new q8();
        zzbjz = q8Var;
        oa.n(q8.class, q8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new q8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbjz, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002ဌ\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007ဌ\u0002", new Object[]{"zzahj", "zzbjt", "zzbju", i4.zzgk(), "zzbjv", "zzbjw", "zzbjx", "zzbjy", "zzbfh", w3.zzgk()});
            case 4:
                return zzbjz;
            case 5:
                lc<q8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (q8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbjz);
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
