package c.f.a.c.j.h;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class y1 extends l6<y1, x1> implements r7 {
    private static final y1 zzZ;
    public static final /* synthetic */ int zza = 0;
    private long zzB;
    private int zzC;
    private boolean zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private long zzM;
    private long zzN;
    private int zzQ;
    private d2 zzS;
    private long zzU;
    private long zzV;
    private int zzY;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private t6<q1> zzh = l6.o();
    private t6<j2> zzi = l6.o();
    private String zzo = BuildConfig.FLAVOR;
    private String zzp = BuildConfig.FLAVOR;
    private String zzq = BuildConfig.FLAVOR;
    private String zzr = BuildConfig.FLAVOR;
    private String zzt = BuildConfig.FLAVOR;
    private String zzu = BuildConfig.FLAVOR;
    private String zzv = BuildConfig.FLAVOR;
    private String zzy = BuildConfig.FLAVOR;
    private String zzA = BuildConfig.FLAVOR;
    private String zzD = BuildConfig.FLAVOR;
    private String zzE = BuildConfig.FLAVOR;
    private t6<l1> zzG = l6.o();
    private String zzH = BuildConfig.FLAVOR;
    private String zzL = BuildConfig.FLAVOR;
    private String zzO = BuildConfig.FLAVOR;
    private String zzP = BuildConfig.FLAVOR;
    private String zzR = BuildConfig.FLAVOR;
    private q6 zzT = l6.l();
    private String zzW = BuildConfig.FLAVOR;
    private String zzX = BuildConfig.FLAVOR;

    static {
        y1 y1Var = new y1();
        zzZ = y1Var;
        l6.t(y1.class, y1Var);
    }

    public static x1 K0() {
        return zzZ.q();
    }

    public static /* synthetic */ void M0(y1 y1Var, int i2) {
        y1Var.zze |= 1;
        y1Var.zzg = 1;
    }

    public static /* synthetic */ void N0(y1 y1Var, int i2, q1 q1Var) {
        q1Var.getClass();
        y1Var.c1();
        y1Var.zzh.set(i2, q1Var);
    }

    public static /* synthetic */ void O0(y1 y1Var, q1 q1Var) {
        q1Var.getClass();
        y1Var.c1();
        y1Var.zzh.add(q1Var);
    }

    public static /* synthetic */ void P0(y1 y1Var, Iterable iterable) {
        y1Var.c1();
        t4.j(iterable, y1Var.zzh);
    }

    public static /* synthetic */ void R0(y1 y1Var, int i2) {
        y1Var.c1();
        y1Var.zzh.remove(i2);
    }

    public static /* synthetic */ void S0(y1 y1Var, int i2, j2 j2Var) {
        j2Var.getClass();
        y1Var.d1();
        y1Var.zzi.set(i2, j2Var);
    }

    public static /* synthetic */ void T0(y1 y1Var, j2 j2Var) {
        j2Var.getClass();
        y1Var.d1();
        y1Var.zzi.add(j2Var);
    }

    public static /* synthetic */ void U0(y1 y1Var, Iterable iterable) {
        y1Var.d1();
        t4.j(iterable, y1Var.zzi);
    }

    public static /* synthetic */ void V0(y1 y1Var, int i2) {
        y1Var.d1();
        y1Var.zzi.remove(i2);
    }

    public static /* synthetic */ void W0(y1 y1Var, long j2) {
        y1Var.zze |= 2;
        y1Var.zzj = j2;
    }

    public static /* synthetic */ void X0(y1 y1Var, long j2) {
        y1Var.zze |= 4;
        y1Var.zzk = j2;
    }

    public static /* synthetic */ void Y0(y1 y1Var, long j2) {
        y1Var.zze |= 8;
        y1Var.zzl = j2;
    }

    public static /* synthetic */ void Z(y1 y1Var, long j2) {
        y1Var.zze |= 32;
        y1Var.zzn = j2;
    }

    public static /* synthetic */ void Z0(y1 y1Var, long j2) {
        y1Var.zze |= 16;
        y1Var.zzm = j2;
    }

    public static /* synthetic */ void a0(y1 y1Var) {
        y1Var.zze &= -33;
        y1Var.zzn = 0L;
    }

    public static /* synthetic */ void a1(y1 y1Var) {
        y1Var.zze &= -17;
        y1Var.zzm = 0L;
    }

    public static /* synthetic */ void b0(y1 y1Var, String str) {
        y1Var.zze |= 64;
        y1Var.zzo = "android";
    }

    public static /* synthetic */ void c0(y1 y1Var, String str) {
        str.getClass();
        y1Var.zze |= 128;
        y1Var.zzp = str;
    }

    public static /* synthetic */ void d0(y1 y1Var, String str) {
        str.getClass();
        y1Var.zze |= 256;
        y1Var.zzq = str;
    }

    public static /* synthetic */ void e0(y1 y1Var, String str) {
        str.getClass();
        y1Var.zze |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        y1Var.zzr = str;
    }

    public static /* synthetic */ void e1(y1 y1Var, String str) {
        str.getClass();
        y1Var.zze |= 16777216;
        y1Var.zzH = str;
    }

    public static /* synthetic */ void f0(y1 y1Var, int i2) {
        y1Var.zze |= 1024;
        y1Var.zzs = i2;
    }

    public static /* synthetic */ void f1(y1 y1Var, int i2) {
        y1Var.zze |= 33554432;
        y1Var.zzI = i2;
    }

    public static /* synthetic */ void g0(y1 y1Var, String str) {
        str.getClass();
        y1Var.zze |= 2048;
        y1Var.zzt = str;
    }

    public static /* synthetic */ void g1(y1 y1Var) {
        y1Var.zze &= -268435457;
        y1Var.zzL = zzZ.zzL;
    }

    public static /* synthetic */ void h0(y1 y1Var, String str) {
        str.getClass();
        y1Var.zze |= ProgressEvent.PART_FAILED_EVENT_CODE;
        y1Var.zzu = str;
    }

    public static /* synthetic */ void h1(y1 y1Var, long j2) {
        y1Var.zze |= 536870912;
        y1Var.zzM = j2;
    }

    public static /* synthetic */ void i0(y1 y1Var, String str) {
        str.getClass();
        y1Var.zze |= 8192;
        y1Var.zzv = str;
    }

    public static /* synthetic */ void i1(y1 y1Var, long j2) {
        y1Var.zze |= 1073741824;
        y1Var.zzN = j2;
    }

    public static /* synthetic */ void j0(y1 y1Var, long j2) {
        y1Var.zze |= 16384;
        y1Var.zzw = j2;
    }

    public static /* synthetic */ void j1(y1 y1Var) {
        y1Var.zze &= Integer.MAX_VALUE;
        y1Var.zzO = zzZ.zzO;
    }

    public static /* synthetic */ void k0(y1 y1Var, long j2) {
        y1Var.zze |= 32768;
        y1Var.zzx = 37000L;
    }

    public static /* synthetic */ void k1(y1 y1Var, int i2) {
        y1Var.zzf |= 2;
        y1Var.zzQ = i2;
    }

    public static /* synthetic */ void l0(y1 y1Var, String str) {
        str.getClass();
        y1Var.zze |= 65536;
        y1Var.zzy = str;
    }

    public static /* synthetic */ void l1(y1 y1Var, String str) {
        str.getClass();
        y1Var.zzf |= 4;
        y1Var.zzR = str;
    }

    public static /* synthetic */ void m0(y1 y1Var) {
        y1Var.zze &= -65537;
        y1Var.zzy = zzZ.zzy;
    }

    public static /* synthetic */ void m1(y1 y1Var, d2 d2Var) {
        d2Var.getClass();
        y1Var.zzS = d2Var;
        y1Var.zzf |= 8;
    }

    public static /* synthetic */ void n0(y1 y1Var, boolean z) {
        y1Var.zze |= 131072;
        y1Var.zzz = z;
    }

    public static /* synthetic */ void n1(y1 y1Var, Iterable iterable) {
        q6 q6Var = y1Var.zzT;
        if (!q6Var.zza()) {
            int size = q6Var.size();
            y1Var.zzT = q6Var.n(size == 0 ? 10 : size + size);
        }
        t4.j(iterable, y1Var.zzT);
    }

    public static /* synthetic */ void o0(y1 y1Var) {
        y1Var.zze &= -131073;
        y1Var.zzz = false;
    }

    public static /* synthetic */ void o1(y1 y1Var, long j2) {
        y1Var.zzf |= 16;
        y1Var.zzU = j2;
    }

    public static /* synthetic */ void p0(y1 y1Var, String str) {
        str.getClass();
        y1Var.zze |= 262144;
        y1Var.zzA = str;
    }

    public static /* synthetic */ void p1(y1 y1Var, long j2) {
        y1Var.zzf |= 32;
        y1Var.zzV = j2;
    }

    public static /* synthetic */ void q0(y1 y1Var) {
        y1Var.zze &= -262145;
        y1Var.zzA = zzZ.zzA;
    }

    public static /* synthetic */ void q1(y1 y1Var, String str) {
        str.getClass();
        y1Var.zzf |= 64;
        y1Var.zzW = str;
    }

    public static /* synthetic */ void r0(y1 y1Var, long j2) {
        y1Var.zze |= 524288;
        y1Var.zzB = j2;
    }

    public static /* synthetic */ void r1(y1 y1Var, String str) {
        str.getClass();
        y1Var.zzf |= 128;
        y1Var.zzX = str;
    }

    public static /* synthetic */ void t0(y1 y1Var, int i2) {
        y1Var.zze |= Constants.MB;
        y1Var.zzC = i2;
    }

    public static /* synthetic */ void u0(y1 y1Var, String str) {
        y1Var.zze |= 2097152;
        y1Var.zzD = str;
    }

    public static /* synthetic */ void v0(y1 y1Var) {
        y1Var.zze &= -2097153;
        y1Var.zzD = zzZ.zzD;
    }

    public static /* synthetic */ void x0(y1 y1Var, String str) {
        str.getClass();
        y1Var.zze |= 4194304;
        y1Var.zzE = str;
    }

    public static /* synthetic */ void y0(y1 y1Var, boolean z) {
        y1Var.zze |= 8388608;
        y1Var.zzF = z;
    }

    public static /* synthetic */ void z0(y1 y1Var, Iterable iterable) {
        t6<l1> t6Var = y1Var.zzG;
        if (!t6Var.zza()) {
            y1Var.zzG = l6.p(t6Var);
        }
        t4.j(iterable, y1Var.zzG);
    }

    public final boolean A() {
        return (this.zze & 32768) != 0;
    }

    public final boolean A1() {
        return (this.zze & 4) != 0;
    }

    public final long B() {
        return this.zzx;
    }

    public final String B0() {
        return this.zzO;
    }

    public final long B1() {
        return this.zzk;
    }

    public final String C() {
        return this.zzy;
    }

    public final boolean C0() {
        return (this.zzf & 2) != 0;
    }

    public final boolean C1() {
        return (this.zze & 8) != 0;
    }

    public final boolean D() {
        return (this.zze & 131072) != 0;
    }

    public final int D0() {
        return this.zzQ;
    }

    public final long D1() {
        return this.zzl;
    }

    public final boolean E() {
        return this.zzz;
    }

    public final String E0() {
        return this.zzR;
    }

    public final boolean E1() {
        return (this.zze & 16) != 0;
    }

    public final String F() {
        return this.zzA;
    }

    public final boolean F0() {
        return (this.zzf & 16) != 0;
    }

    public final long F1() {
        return this.zzm;
    }

    public final boolean G() {
        return (this.zze & 524288) != 0;
    }

    public final long G0() {
        return this.zzU;
    }

    public final boolean G1() {
        return (this.zze & 32) != 0;
    }

    public final long H() {
        return this.zzB;
    }

    public final String H0() {
        return this.zzW;
    }

    public final long H1() {
        return this.zzn;
    }

    public final boolean I() {
        return (this.zze & Constants.MB) != 0;
    }

    public final boolean I0() {
        return (this.zzf & 128) != 0;
    }

    public final String I1() {
        return this.zzo;
    }

    public final int J() {
        return this.zzC;
    }

    public final String J0() {
        return this.zzX;
    }

    public final String J1() {
        return this.zzp;
    }

    public final String K() {
        return this.zzD;
    }

    public final String K1() {
        return this.zzq;
    }

    public final String L() {
        return this.zzE;
    }

    public final String L1() {
        return this.zzr;
    }

    public final boolean M() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean M1() {
        return (this.zze & 1024) != 0;
    }

    public final boolean N() {
        return this.zzF;
    }

    public final int N1() {
        return this.zzs;
    }

    public final List<l1> O() {
        return this.zzG;
    }

    public final String O1() {
        return this.zzt;
    }

    public final String P() {
        return this.zzH;
    }

    public final boolean R() {
        return (this.zze & 33554432) != 0;
    }

    public final int S() {
        return this.zzI;
    }

    public final boolean T() {
        return (this.zze & 536870912) != 0;
    }

    public final long V() {
        return this.zzM;
    }

    public final boolean W() {
        return (this.zze & 1073741824) != 0;
    }

    public final long X() {
        return this.zzN;
    }

    public final boolean Y() {
        return (this.zze & 1) != 0;
    }

    public final int b1() {
        return this.zzg;
    }

    public final void c1() {
        t6<q1> t6Var = this.zzh;
        if (t6Var.zza()) {
            return;
        }
        this.zzh = l6.p(t6Var);
    }

    public final void d1() {
        t6<j2> t6Var = this.zzi;
        if (t6Var.zza()) {
            return;
        }
        this.zzi = l6.p(t6Var);
    }

    public final List<q1> s1() {
        return this.zzh;
    }

    public final int t1() {
        return this.zzh.size();
    }

    public final q1 u1(int i2) {
        return this.zzh.get(i2);
    }

    @Override // c.f.a.c.j.h.l6
    public final Object v(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return l6.u(zzZ, "\u0001-\u0000\u0002\u00015-\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(", new Object[]{"zze", "zzf", "zzg", "zzh", q1.class, "zzi", j2.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", l1.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", j1.zzb()});
        }
        if (i3 == 3) {
            return new y1();
        }
        g1 g1Var = null;
        if (i3 == 4) {
            return new x1(g1Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzZ;
    }

    public final List<j2> v1() {
        return this.zzi;
    }

    public final String w() {
        return this.zzu;
    }

    public final int w1() {
        return this.zzi.size();
    }

    public final String x() {
        return this.zzv;
    }

    public final j2 x1(int i2) {
        return this.zzi.get(i2);
    }

    public final boolean y() {
        return (this.zze & 16384) != 0;
    }

    public final boolean y1() {
        return (this.zze & 2) != 0;
    }

    public final long z() {
        return this.zzw;
    }

    public final long z1() {
        return this.zzj;
    }
}
