package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class u extends bkx<u, k> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u f23138a;
    private long A;
    private long B;
    private long C;
    private long G;
    private long H;
    private long I;
    private long K;
    private v N;
    private long aB;
    private boolean aE;
    private long aG;
    private ad aH;
    private r af;
    private t ah;
    private int as;
    private int at;
    private int au;
    private af av;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23141g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f23145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f23148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f23149o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f23142h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f23143i = BuildConfig.FLAVOR;
    private String t = BuildConfig.FLAVOR;
    private String D = BuildConfig.FLAVOR;
    private String E = "D";
    private String F = BuildConfig.FLAVOR;
    private String J = BuildConfig.FLAVOR;
    private long L = -1;
    private long M = -1;
    private long O = -1;
    private long P = -1;
    private long Q = -1;
    private long R = -1;
    private long S = -1;
    private long T = -1;
    private String U = "D";
    private String V = "D";
    private long W = -1;
    private int X = 1000;
    private int Y = 1000;
    private long Z = -1;
    private long aa = -1;
    private long ab = -1;
    private long ac = -1;
    private long ad = -1;
    private int ae = 1000;
    private blc<r> ag = bkx.ap();
    private long ai = -1;
    private long aj = -1;
    private long ak = -1;
    private long al = -1;
    private long am = -1;
    private long an = -1;
    private long ao = -1;
    private long ap = -1;
    private String aq = "D";
    private long ar = -1;
    private long aw = -1;
    private int ax = 1000;
    private int ay = 1000;
    private String az = "D";
    private blc<p> aA = bkx.ap();
    private String aC = BuildConfig.FLAVOR;
    private int aD = 2;
    private String aF = BuildConfig.FLAVOR;

    static {
        u uVar = new u();
        f23138a = uVar;
        bkx.at(u.class, uVar);
    }

    private u() {
    }

    public static /* synthetic */ void A(u uVar, long j2) {
        uVar.f23140f |= 4;
        uVar.P = j2;
    }

    public static /* synthetic */ void B(u uVar, long j2) {
        uVar.f23140f |= 8;
        uVar.Q = j2;
    }

    public static /* synthetic */ void C(u uVar, long j2) {
        uVar.f23140f |= 16;
        uVar.R = j2;
    }

    public static /* synthetic */ void D(u uVar, long j2) {
        uVar.f23140f |= 32;
        uVar.S = j2;
    }

    public static /* synthetic */ void E(u uVar, long j2) {
        uVar.f23140f |= 64;
        uVar.T = j2;
    }

    public static /* synthetic */ void F(u uVar, String str) {
        str.getClass();
        uVar.f23140f |= 128;
        uVar.U = str;
    }

    public static /* synthetic */ void G(u uVar, String str) {
        str.getClass();
        uVar.f23140f |= 256;
        uVar.V = str;
    }

    public static /* synthetic */ void H(u uVar, ab abVar) {
        uVar.X = abVar.a();
        uVar.f23140f |= 1024;
    }

    public static /* synthetic */ void I(u uVar, ab abVar) {
        uVar.Y = abVar.a();
        uVar.f23140f |= 2048;
    }

    public static /* synthetic */ void J(u uVar, long j2) {
        uVar.f23140f |= ProgressEvent.PART_FAILED_EVENT_CODE;
        uVar.Z = j2;
    }

    public static /* synthetic */ void K(u uVar, long j2) {
        uVar.f23140f |= 8192;
        uVar.aa = j2;
    }

    public static /* synthetic */ void L(u uVar, ab abVar) {
        uVar.ae = abVar.a();
        uVar.f23140f |= 131072;
    }

    public static /* synthetic */ void M(u uVar, r rVar) {
        rVar.getClass();
        uVar.af = rVar;
        uVar.f23140f |= 262144;
    }

    public static /* synthetic */ void N(u uVar, r rVar) {
        rVar.getClass();
        uVar.ax();
        uVar.ag.add(rVar);
    }

    public static /* synthetic */ void P(u uVar, long j2) {
        uVar.f23140f |= 2097152;
        uVar.aj = j2;
    }

    public static /* synthetic */ void Q(u uVar, long j2) {
        uVar.f23140f |= 4194304;
        uVar.ak = j2;
    }

    public static /* synthetic */ void R(u uVar, long j2) {
        uVar.f23140f |= 8388608;
        uVar.al = j2;
    }

    public static /* synthetic */ void S(u uVar, af afVar) {
        afVar.getClass();
        uVar.av = afVar;
        uVar.f23141g |= 2;
    }

    public static /* synthetic */ void T(u uVar, ab abVar) {
        uVar.ax = abVar.a();
        uVar.f23141g |= 8;
    }

    public static /* synthetic */ void U(u uVar, ab abVar) {
        uVar.ay = abVar.a();
        uVar.f23141g |= 16;
    }

    public static /* synthetic */ void V(u uVar, String str) {
        str.getClass();
        uVar.f23141g |= 128;
        uVar.aC = str;
    }

    public static /* synthetic */ void W(u uVar, n nVar) {
        uVar.aD = nVar.a();
        uVar.f23141g |= 256;
    }

    public static /* synthetic */ void X(u uVar, boolean z) {
        uVar.f23141g |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        uVar.aE = z;
    }

    public static /* synthetic */ void Y(u uVar, long j2) {
        uVar.f23141g |= 2048;
        uVar.aG = j2;
    }

    public static /* synthetic */ void Z(u uVar, String str) {
        str.getClass();
        uVar.f23139e |= 1;
        uVar.f23142h = str;
    }

    public static k a() {
        return f23138a.ak();
    }

    public static /* synthetic */ void aa(u uVar, String str) {
        uVar.f23139e |= 2;
        uVar.f23143i = str;
    }

    public static /* synthetic */ void ab(u uVar, long j2) {
        uVar.f23139e |= 4;
        uVar.f23144j = j2;
    }

    public static /* synthetic */ void ac(u uVar, long j2) {
        uVar.f23139e |= 16;
        uVar.f23146l = j2;
    }

    private final void ax() {
        blc<r> blcVar = this.ag;
        if (blcVar.c()) {
            return;
        }
        this.ag = bkx.aq(blcVar);
    }

    public static u d(byte[] bArr, bkm bkmVar) {
        return (u) bkx.an(f23138a, bArr, bkmVar);
    }

    public static /* synthetic */ void g(u uVar, long j2) {
        uVar.f23139e |= 32;
        uVar.f23147m = j2;
    }

    public static /* synthetic */ void h(u uVar, long j2) {
        uVar.f23139e |= 1024;
        uVar.r = j2;
    }

    public static /* synthetic */ void i(u uVar, long j2) {
        uVar.f23139e |= 2048;
        uVar.s = j2;
    }

    public static /* synthetic */ void j(u uVar, long j2) {
        uVar.f23139e |= 8192;
        uVar.u = j2;
    }

    public static /* synthetic */ void k(u uVar, long j2) {
        uVar.f23139e |= 16384;
        uVar.v = j2;
    }

    public static /* synthetic */ void l(u uVar, long j2) {
        uVar.f23139e |= 32768;
        uVar.w = j2;
    }

    public static /* synthetic */ void m(u uVar, long j2) {
        uVar.f23139e |= 65536;
        uVar.x = j2;
    }

    public static /* synthetic */ void n(u uVar, long j2) {
        uVar.f23139e |= 524288;
        uVar.A = j2;
    }

    public static /* synthetic */ void o(u uVar, long j2) {
        uVar.f23139e |= Constants.MB;
        uVar.B = j2;
    }

    public static /* synthetic */ void p(u uVar, long j2) {
        uVar.f23139e |= 2097152;
        uVar.C = j2;
    }

    public static /* synthetic */ void q(u uVar, String str) {
        str.getClass();
        uVar.f23139e |= 4194304;
        uVar.D = str;
    }

    public static /* synthetic */ void r(u uVar, String str) {
        str.getClass();
        uVar.f23139e |= 16777216;
        uVar.F = str;
    }

    public static /* synthetic */ void s(u uVar, long j2) {
        uVar.f23139e |= 33554432;
        uVar.G = j2;
    }

    public static /* synthetic */ void t(u uVar, long j2) {
        uVar.f23139e |= 67108864;
        uVar.H = j2;
    }

    public static /* synthetic */ void u(u uVar, long j2) {
        uVar.f23139e |= 134217728;
        uVar.I = j2;
    }

    public static /* synthetic */ void v(u uVar, String str) {
        str.getClass();
        uVar.f23139e |= 268435456;
        uVar.J = str;
    }

    public static /* synthetic */ void w(u uVar, long j2) {
        uVar.f23139e |= 536870912;
        uVar.K = j2;
    }

    public static /* synthetic */ void x(u uVar, long j2) {
        uVar.f23139e |= 1073741824;
        uVar.L = j2;
    }

    public static /* synthetic */ void y(u uVar, long j2) {
        uVar.f23139e |= Integer.MIN_VALUE;
        uVar.M = j2;
    }

    public static /* synthetic */ void z(u uVar, long j2) {
        uVar.f23140f |= 2;
        uVar.O = j2;
    }

    public final boolean ad() {
        return (this.f23139e & 4194304) != 0;
    }

    public final boolean ae() {
        return (this.f23141g & ProgressEvent.PART_FAILED_EVENT_CODE) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f23138a, "\u0001O\u0000\u0003\u0001ÉO\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂF\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈG\u0019ဂK\u001aဌH\u001bဈ\u0016\u001cဇI\u001dဈ\u0018\u001eဈJ\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bÉဉL", new Object[]{"e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "aB", "B", "C", "aC", "aG", "aD", n.c(), "D", "aE", "F", "aF", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "ag", r.class, "S", "T", "U", "V", "X", ab.c(), "Y", ab.c(), "af", "Z", "aa", "ab", "ac", "ad", "ae", ab.c(), "ah", "ai", "aj", "ak", "al", "ao", "ap", "ar", "as", aa.c(), "at", ac.b(), "aq", "au", l.b(), "av", "aw", "am", "an", "ax", ab.c(), "W", "E", "ay", ab.c(), "az", "aA", p.class, "aH"});
        }
        if (i3 == 3) {
            return new u();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new k(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f23138a;
    }

    public final ad e() {
        ad adVar = this.aH;
        return adVar == null ? ad.d() : adVar;
    }

    public final String f() {
        return this.D;
    }
}
