package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class p8 extends oa<p8, a> implements dc {
    private static volatile lc<p8> zzahx;
    private static final p8 zzbjs;
    private int zzahj;
    private String zzbhd = BuildConfig.FLAVOR;
    private boolean zzbjq;
    private a8 zzbjr;

    public static final class a extends oa.b<p8, a> implements dc {
        public a() {
            super(p8.zzbjs);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        p8 p8Var = new p8();
        zzbjs = p8Var;
        oa.n(p8.class, p8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new p8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbjs, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbhd", "zzbjq", "zzbjr"});
            case 4:
                return zzbjs;
            case 5:
                lc<p8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (p8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbjs);
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
