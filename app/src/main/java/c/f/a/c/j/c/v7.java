package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class v7 extends oa<v7, a> implements dc {
    private static volatile lc<v7> zzahx;
    private static final v7 zzbmk;
    private int zzahj;
    private String zzbhd = BuildConfig.FLAVOR;
    private xa<s8> zzbmh = oa.u();
    private xa<m8> zzbmi = oa.u();
    private boolean zzbmj;

    public static final class a extends oa.b<v7, a> implements dc {
        public a() {
            super(v7.zzbmk);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        v7 v7Var = new v7();
        zzbmk = v7Var;
        oa.n(v7.class, v7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new v7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbmk, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzahj", "zzbhd", "zzbmh", s8.class, "zzbmi", m8.class, "zzbmj"});
            case 4:
                return zzbmk;
            case 5:
                lc<v7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (v7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbmk);
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
