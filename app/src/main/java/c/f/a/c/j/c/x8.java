package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class x8 extends oa<x8, a> implements dc {
    private static volatile lc<x8> zzahx;
    private static final x8 zzbks;
    private int zzahj;
    private String zzbeo = BuildConfig.FLAVOR;
    private String zzbep = BuildConfig.FLAVOR;

    public static final class a extends oa.b<x8, a> implements dc {
        public a() {
            super(x8.zzbks);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        x8 x8Var = new x8();
        zzbks = x8Var;
        oa.n(x8.class, x8Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new x8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbks, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbeo", "zzbep"});
            case 4:
                return zzbks;
            case 5:
                lc<x8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (x8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbks);
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
