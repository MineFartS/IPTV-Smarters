package c.f.a.c.j.c;

import c.f.a.c.j.c.f8;
import c.f.a.c.j.c.oa;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class j8 extends oa<j8, a> implements dc {
    private static volatile lc<j8> zzahx;
    private static final j8 zzbin;
    private int zzahj;
    private int zzbgn;
    private long zzbgo;
    private long zzbgp;
    private int zzbgq;
    private r8 zzbgr;
    private r7 zzbgs;
    private q8 zzbgt;
    private o8 zzbgu;
    private h8 zzbgv;
    private q7 zzbgw;
    private d8 zzbgx;
    private y7 zzbgy;
    private n8 zzbgz;
    private d2 zzbha;
    private n7 zzbhc;
    private int zzbhj;
    private int zzbhk;
    private m8 zzbhl;
    private int zzbhm;
    private i8 zzbhn;
    private m8 zzbhp;
    private int zzbhq;
    private int zzbhr;
    private int zzbhs;
    private int zzbht;
    private int zzbhu;
    private int zzbhv;
    private z7 zzbhw;
    private f8 zzbhx;
    private m7 zzbhy;
    private w8 zzbhz;
    private u7 zzbia;
    private y8 zzbib;
    private int zzbid;
    private o7 zzbie;
    private boolean zzbig;
    private boolean zzbih;
    private int zzbii;
    private b8 zzbij;
    private s7 zzbik;
    private t8 zzbil;
    private byte zzbim = 2;
    private String zzbfl = BuildConfig.FLAVOR;
    private String zzbhb = BuildConfig.FLAVOR;
    private String zzbhd = BuildConfig.FLAVOR;
    private wa zzbhe = oa.q();
    private xa<s8> zzbhf = oa.u();
    private xa<u8> zzbhg = oa.u();
    private xa<k8> zzbhh = oa.u();
    private xa<v7> zzbhi = oa.u();
    private xa<m8> zzbho = oa.u();
    private xa<e8> zzbic = oa.u();
    private xa<g8> zzbif = oa.u();

    public static final class a extends oa.b<j8, a> implements dc {
        public a() {
            super(j8.zzbin);
        }

        public /* synthetic */ a(l7 l7Var) {
            this();
        }

        public final a n(b8 b8Var) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((j8) this.f12994c).G(b8Var);
            return this;
        }

        public final a o(f8.a aVar) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((j8) this.f12994c).H((f8) ((oa) aVar.v()));
            return this;
        }

        public final a p(int i2) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((j8) this.f12994c).D(i2);
            return this;
        }

        public final a q(String str) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((j8) this.f12994c).E(str);
            return this;
        }

        public final a r(String str) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((j8) this.f12994c).F(str);
            return this;
        }

        public final a u(e8 e8Var) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((j8) this.f12994c).J(e8Var);
            return this;
        }

        public final f8 w() {
            return ((j8) this.f12994c).K();
        }

        public final a y(long j2) {
            if (this.f12995d) {
                k();
                this.f12995d = false;
            }
            ((j8) this.f12994c).N(j2);
            return this;
        }
    }

    static {
        j8 j8Var = new j8();
        zzbin = j8Var;
        oa.n(j8.class, j8Var);
    }

    public static a L() {
        return zzbin.p();
    }

    public static a w(j8 j8Var) {
        return zzbin.i(j8Var);
    }

    public final void D(int i2) {
        this.zzahj |= 268435456;
        this.zzbhv = i2;
    }

    public final void E(String str) {
        str.getClass();
        this.zzahj |= 16384;
        this.zzbhb = str;
    }

    public final void F(String str) {
        str.getClass();
        this.zzahj |= 65536;
        this.zzbhd = str;
    }

    public final void G(b8 b8Var) {
        b8Var.getClass();
        this.zzbij = b8Var;
        this.zzbgn |= 256;
    }

    public final void H(f8 f8Var) {
        f8Var.getClass();
        this.zzbhx = f8Var;
        this.zzahj |= 1073741824;
    }

    public final void J(e8 e8Var) {
        e8Var.getClass();
        xa<e8> xaVar = this.zzbic;
        if (!xaVar.z()) {
            int size = xaVar.size();
            this.zzbic = xaVar.E(size == 0 ? 10 : size << 1);
        }
        this.zzbic.add(e8Var);
    }

    public final f8 K() {
        f8 f8Var = this.zzbhx;
        return f8Var == null ? f8.G() : f8Var;
    }

    public final void N(long j2) {
        this.zzahj |= 2;
        this.zzbgp = j2;
    }

    @Override // c.f.a.c.j.c.oa
    public final Object k(int i2, Object obj, Object obj2) {
        l7 l7Var = null;
        switch (l7.f12923a[i2 - 1]) {
            case 1:
                return new j8();
            case 2:
                return new a(l7Var);
            case 3:
                return oa.l(zzbin, "\u00013\u0000\u0002\u000133\u0000\b\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000f\u0011ဈ\u0010\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017ဌ\u0011\u0018ဉ\u0015\u0019\u001b\u001aဉ\u0016\u001bဌ\u0018\u001cင\u0019\u001dင\u001a\u001eင\u001b\u001fဆ\u001c ဉ\u001d!ဉ\u001e\"ဉ\u001f#ဌ\u0012$ဉ\u0013%ᐉ &ဉ!'ဉ\"(\u001b)ဌ#*ဉ$+\u001b,ဌ\u0017-ဇ%.ဇ&/ဌ'0ဉ(1င\u00142ဉ)3ဉ*", new Object[]{"zzahj", "zzbgn", "zzbgo", "zzbgp", "zzbgq", n6.zzgk(), "zzbgr", "zzbgs", "zzbgt", "zzbgu", "zzbgv", "zzbhb", "zzbgw", "zzbgx", "zzbgy", "zzbfl", "zzbgz", "zzbha", "zzbhc", "zzbhd", "zzbhe", "zzbhf", s8.class, "zzbhg", u8.class, "zzbhh", k8.class, "zzbhi", v7.class, "zzbhj", h6.zzgk(), "zzbhn", "zzbho", m8.class, "zzbhp", "zzbhr", o4.zzgk(), "zzbhs", "zzbht", "zzbhu", "zzbhv", "zzbhw", "zzbhx", "zzbhy", "zzbhk", b6.zzgk(), "zzbhl", "zzbhz", "zzbia", "zzbib", "zzbic", e8.class, "zzbid", c6.zzgk(), "zzbie", "zzbif", g8.class, "zzbhq", n4.zzgk(), "zzbig", "zzbih", "zzbii", h4.zzgk(), "zzbij", "zzbhm", "zzbik", "zzbil"});
            case 4:
                return zzbin;
            case 5:
                lc<j8> aVar = zzahx;
                if (aVar == null) {
                    synchronized (j8.class) {
                        aVar = zzahx;
                        if (aVar == null) {
                            aVar = new oa.a<>(zzbin);
                            zzahx = aVar;
                        }
                        break;
                    }
                }
                return aVar;
            case 6:
                return Byte.valueOf(this.zzbim);
            case 7:
                this.zzbim = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
