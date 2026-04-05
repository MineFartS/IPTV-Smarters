package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class m8 extends oa<m8, a> implements dc {
    private static volatile lc<m8> zzahx;
    private static final m8 zzbiy;
    private int zzahj;
    private String zzbiw = BuildConfig.FLAVOR;
    private String zzbix = BuildConfig.FLAVOR;

    public static final class a extends oa.b<m8, a> implements dc {
        public a() {
            super(m8.zzbiy);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }

        public final a n(String str) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((m8) this.f12994c).x(str);
            return this;
        }
    }

    static {
        m8 m8Var = new m8();
        zzbiy = m8Var;
        oa.n(m8.class, m8Var);
    }

    public static a y() {
        return zzbiy.p();
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new m8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbiy, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbiw", "zzbix"});
            case 4:
                return zzbiy;
            case 5:
                lc<m8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (m8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbiy);
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

    public final void x(String str) {
        str.getClass();
        this.zzahj |= 1;
        this.zzbiw = str;
    }
}
