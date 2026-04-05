package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class e8 extends oa<e8, a> implements dc {
    private static volatile lc<e8> zzahx;
    private static final e8 zzbfp;
    private int zzahj;
    private String zzbfn = BuildConfig.FLAVOR;
    private String zzbfo = BuildConfig.FLAVOR;

    public static final class a extends oa.b<e8, a> implements dc {
        public a() {
            super(e8.zzbfp);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }

        public final a n(String str) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((e8) this.f12994c).x(str);
            return this;
        }

        public final a o(String str) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((e8) this.f12994c).y(str);
            return this;
        }
    }

    static {
        e8 e8Var = new e8();
        zzbfp = e8Var;
        oa.n(e8.class, e8Var);
    }

    public static a A() {
        return zzbfp.p();
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new e8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbfp, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbfn", "zzbfo"});
            case 4:
                return zzbfp;
            case 5:
                lc<e8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (e8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbfp);
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
        this.zzbfn = str;
    }

    public final void y(String str) {
        str.getClass();
        this.zzahj |= 2;
        this.zzbfo = str;
    }
}
