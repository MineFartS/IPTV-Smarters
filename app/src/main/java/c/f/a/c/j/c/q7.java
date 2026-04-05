package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class q7 extends oa<q7, a> implements dc {
    private static volatile lc<q7> zzahx;
    private static final q7 zzblq;
    private int zzahj;
    private boolean zzblk;
    private boolean zzbll;
    private int zzblm;
    private int zzblo;
    private int zzblp;
    private String zzbln = BuildConfig.FLAVOR;
    private String zzbfl = BuildConfig.FLAVOR;

    public static final class a extends oa.b<q7, a> implements dc {
        public a() {
            super(q7.zzblq);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        q7 q7Var = new q7();
        zzblq = q7Var;
        oa.n(q7.class, q7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new q7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzblq, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"zzahj", "zzblk", "zzbll", "zzblm", "zzbln", "zzblo", "zzblp", "zzbfl"});
            case 4:
                return zzblq;
            case 5:
                lc<q7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (q7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzblq);
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
