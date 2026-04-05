package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class f8 extends oa<f8, a> implements dc {
    private static volatile lc<f8> zzahx;
    private static final f8 zzbga;
    private int zzahj;
    private m8 zzbfq;
    private boolean zzbfr;
    private long zzbfs;
    private int zzbft;
    private int zzbfu;
    private int zzbfv;
    private int zzbfw;
    private int zzbfx;
    private t7 zzbfy;
    private int zzbfz;

    public static final class a extends oa.b<f8, a> implements dc {
        public a() {
            super(f8.zzbga);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }

        public final a n(m8 m8Var) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((f8) this.f12994c).E(m8Var);
            return this;
        }

        public final a o(int i2) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((f8) this.f12994c).B(i2);
            return this;
        }

        public final a p(int i2) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((f8) this.f12994c).C(i2);
            return this;
        }

        public final a q(long j2) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((f8) this.f12994c).I(j2);
            return this;
        }

        public final a r(boolean z) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((f8) this.f12994c).J(z);
            return this;
        }
    }

    static {
        f8 f8Var = new f8();
        zzbga = f8Var;
        oa.n(f8.class, f8Var);
    }

    public static a F() {
        return zzbga.p();
    }

    public static f8 G() {
        return zzbga;
    }

    public static a w(f8 f8Var) {
        return zzbga.i(f8Var);
    }

    public final void B(int i2) {
        this.zzahj |= 64;
        this.zzbfw = i2;
    }

    public final void C(int i2) {
        this.zzahj |= 128;
        this.zzbfx = i2;
    }

    public final void E(m8 m8Var) {
        m8Var.getClass();
        this.zzbfq = m8Var;
        this.zzahj |= 1;
    }

    public final void I(long j2) {
        this.zzahj |= 4;
        this.zzbfs = j2;
    }

    public final void J(boolean z) {
        this.zzahj |= 2;
        this.zzbfr = z;
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new f8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbga, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဌ\t", new Object[]{"zzahj", "zzbfq", "zzbfr", "zzbfs", "zzbft", "zzbfu", c3.zzgk(), "zzbfv", x2.zzgk(), "zzbfw", "zzbfx", "zzbfy", "zzbfz", b4.zzgk()});
            case 4:
                return zzbga;
            case 5:
                lc<f8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (f8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbga);
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
