package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class m7 extends oa<m7, a> implements dc {
    private static volatile lc<m7> zzahx;
    private static final va<Integer, g7> zzber = new a9();
    private static final m7 zzbes;
    private int zzahj;
    private String zzbeo = BuildConfig.FLAVOR;
    private String zzbep = BuildConfig.FLAVOR;
    private wa zzbeq = oa.q();

    public static final class a extends oa.b<m7, a> implements dc {
        public a() {
            super(m7.zzbes);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }
    }

    static {
        m7 m7Var = new m7();
        zzbes = m7Var;
        oa.n(m7.class, m7Var);
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new m7();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbes, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001e", new Object[]{"zzahj", "zzbeo", "zzbep", "zzbeq", g7.zzgk()});
            case 4:
                return zzbes;
            case 5:
                lc<m7> aVar = zzahx;
                if (aVar == null) {
                    synchronized (m7.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbes);
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
