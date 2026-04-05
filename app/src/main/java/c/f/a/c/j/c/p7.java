package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class p7 extends oa<p7, a> implements dc {
    private static volatile lc<p7> zzahx;
    private static final p7 zzblj;
    private int zzahj;
    private int zzbkc;
    private String zzbli = BuildConfig.FLAVOR;

    public static final class a extends oa.b<p7, a> implements dc {
        public a() {
            super(p7.zzblj);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        p7 p7Var = new p7();
        zzblj = p7Var;
        oa.n(p7.class, p7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new p7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzblj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbkc", "zzbli"});
            case 4:
                return zzblj;
            case 5:
                lc<p7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (p7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzblj);
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
