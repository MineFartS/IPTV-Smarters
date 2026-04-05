package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class d8 extends oa<d8, a> implements dc {
    private static volatile lc<d8> zzahx;
    private static final d8 zzbfm;
    private int zzahj;
    private int zzbff;
    private boolean zzbfg;
    private int zzbfh;
    private boolean zzbfi;
    private xa<p7> zzbfj = oa.u();
    private xa<p7> zzbfk = oa.u();
    private String zzbfl = BuildConfig.FLAVOR;

    public static final class a extends oa.b<d8, a> implements dc {
        public a() {
            super(d8.zzbfm);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        d8 d8Var = new d8();
        zzbfm = d8Var;
        oa.n(d8.class, d8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new d8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbfm, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzahj", "zzbff", w2.zzgk(), "zzbfg", "zzbfh", w3.zzgk(), "zzbfi", "zzbfj", p7.class, "zzbfk", p7.class, "zzbfl"});
            case 4:
                return zzbfm;
            case 5:
                lc<d8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (d8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbfm);
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
