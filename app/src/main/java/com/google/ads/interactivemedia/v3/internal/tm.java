package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class tm implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23083a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f23084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f23085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f23086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final UUID f23087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<String, Integer> f23088f;
    private boolean A;
    private int B;
    private long C;
    private boolean D;
    private long E;
    private long F;
    private long G;
    private alk H;
    private alk I;
    private boolean J;
    private boolean K;
    private int L;
    private long M;
    private long N;
    private int O;
    private int P;
    private int[] Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private int W;
    private int X;
    private int Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private int ac;
    private byte ad;
    private boolean ae;
    private rm af;
    private final tg ag;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final to f23089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray<tk> f23090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f23091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final alx f23092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final alx f23093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final alx f23094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final alx f23095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final alx f23096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final alx f23097o;
    private final alx p;
    private final alx q;
    private final alx r;
    private final alx s;
    private ByteBuffer t;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;
    private tk z;

    static {
        ti tiVar = new rp() { // from class: com.google.ads.interactivemedia.v3.internal.ti
            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final rj[] a() {
                int i2 = tm.f23083a;
                return new rj[]{new tm()};
            }

            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final /* synthetic */ rj[] b(Uri uri, Map map) {
                return ro.a(this);
            }
        };
        f23084b = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        f23085c = amn.W("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        f23086d = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f23087e = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f23088f = Collections.unmodifiableMap(map);
    }

    public tm() {
        this(0);
    }

    public tm(int i2) {
        tg tgVar = new tg();
        this.v = -1L;
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.E = -1L;
        this.F = -1L;
        this.G = -9223372036854775807L;
        this.ag = tgVar;
        tgVar.a(new tj(this));
        this.f23091i = 1 == (i2 ^ 1);
        this.f23089g = new to();
        this.f23090h = new SparseArray<>();
        this.f23094l = new alx(4);
        this.f23095m = new alx(ByteBuffer.allocate(4).putInt(-1).array());
        this.f23096n = new alx(4);
        this.f23092j = new alx(alr.f20069a);
        this.f23093k = new alx(4);
        this.f23097o = new alx();
        this.p = new alx();
        this.q = new alx(8);
        this.r = new alx();
        this.s = new alx();
        this.Q = new int[1];
    }

    private static byte[] A(long j2, String str, long j3) {
        ajr.d(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - (((long) (i2 * 3600)) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - (((long) (i3 * 60)) * 1000000);
        int i4 = (int) (j5 / 1000000);
        return amn.W(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (((long) i4) * 1000000)) / j3))));
    }

    private static int[] B(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length;
        return length >= i2 ? iArr : new int[Math.max(length + length, i2)];
    }

    private final int o() {
        int i2 = this.X;
        y();
        return i2;
    }

    private final int p(rk rkVar, tk tkVar, int i2) throws lb {
        int i3;
        if ("S_TEXT/UTF8".equals(tkVar.f23062b)) {
            z(rkVar, f23084b, i2);
        } else {
            if (!"S_TEXT/ASS".equals(tkVar.f23062b)) {
                sf sfVar = tkVar.V;
                if (!this.Z) {
                    if (tkVar.f23067g) {
                        this.T &= -1073741825;
                        if (!this.aa) {
                            rkVar.h(this.f23094l.K(), 0, 1);
                            this.W++;
                            if ((this.f23094l.K()[0] & 128) == 128) {
                                throw new lb("Extension bit is set in signal byte");
                            }
                            this.ad = this.f23094l.K()[0];
                            this.aa = true;
                        }
                        byte b2 = this.ad;
                        if ((b2 & 1) == 1) {
                            int i4 = b2 & 2;
                            this.T |= 1073741824;
                            if (!this.ae) {
                                rkVar.h(this.q.K(), 0, 8);
                                this.W += 8;
                                this.ae = true;
                                this.f23094l.K()[0] = (byte) ((i4 != 2 ? 0 : 128) | 8);
                                this.f23094l.I(0);
                                sfVar.f(this.f23094l, 1);
                                this.X++;
                                this.q.I(0);
                                sfVar.f(this.q, 8);
                                this.X += 8;
                            }
                            if (i4 == 2) {
                                if (!this.ab) {
                                    rkVar.h(this.f23094l.K(), 0, 1);
                                    this.W++;
                                    this.f23094l.I(0);
                                    this.ac = this.f23094l.k();
                                    this.ab = true;
                                }
                                int i5 = this.ac * 4;
                                this.f23094l.E(i5);
                                rkVar.h(this.f23094l.K(), 0, i5);
                                this.W += i5;
                                int i6 = (this.ac >> 1) + 1;
                                int i7 = (i6 * 6) + 2;
                                ByteBuffer byteBuffer = this.t;
                                if (byteBuffer == null || byteBuffer.capacity() < i7) {
                                    this.t = ByteBuffer.allocate(i7);
                                }
                                this.t.position(0);
                                this.t.putShort((short) i6);
                                int i8 = 0;
                                int i9 = 0;
                                while (true) {
                                    i3 = this.ac;
                                    if (i8 >= i3) {
                                        break;
                                    }
                                    int iN = this.f23094l.n();
                                    if (i8 % 2 == 0) {
                                        this.t.putShort((short) (iN - i9));
                                    } else {
                                        this.t.putInt(iN - i9);
                                    }
                                    i8++;
                                    i9 = iN;
                                }
                                int i10 = (i2 - this.W) - i9;
                                if ((i3 & 1) == 1) {
                                    this.t.putInt(i10);
                                } else {
                                    this.t.putShort((short) i10);
                                    this.t.putInt(0);
                                }
                                this.r.G(this.t.array(), i7);
                                sfVar.f(this.r, i7);
                                this.X += i7;
                            }
                        }
                    } else {
                        byte[] bArr = tkVar.f23068h;
                        if (bArr != null) {
                            this.f23097o.G(bArr, bArr.length);
                        }
                    }
                    if (tkVar.f23066f > 0) {
                        this.T |= 268435456;
                        this.s.E(0);
                        this.f23094l.E(4);
                        this.f23094l.K()[0] = (byte) ((i2 >> 24) & 255);
                        this.f23094l.K()[1] = (byte) ((i2 >> 16) & 255);
                        this.f23094l.K()[2] = (byte) ((i2 >> 8) & 255);
                        this.f23094l.K()[3] = (byte) (i2 & 255);
                        sfVar.f(this.f23094l, 4);
                        this.X += 4;
                    }
                    this.Z = true;
                }
                int iD = i2 + this.f23097o.d();
                if (!"V_MPEG4/ISO/AVC".equals(tkVar.f23062b) && !"V_MPEGH/ISO/HEVC".equals(tkVar.f23062b)) {
                    if (tkVar.S != null) {
                        ajr.f(this.f23097o.d() == 0);
                        tkVar.S.d(rkVar);
                    }
                    while (true) {
                        int i11 = this.W;
                        if (i11 >= iD) {
                            break;
                        }
                        int iQ = q(rkVar, sfVar, iD - i11);
                        this.W += iQ;
                        this.X += iQ;
                    }
                } else {
                    byte[] bArrK = this.f23093k.K();
                    bArrK[0] = 0;
                    bArrK[1] = 0;
                    bArrK[2] = 0;
                    int i12 = tkVar.W;
                    int i13 = 4 - i12;
                    while (this.W < iD) {
                        int i14 = this.Y;
                        if (i14 == 0) {
                            int iMin = Math.min(i12, this.f23097o.a());
                            rkVar.h(bArrK, i13 + iMin, i12 - iMin);
                            if (iMin > 0) {
                                this.f23097o.D(bArrK, i13, iMin);
                            }
                            this.W += i12;
                            this.f23093k.I(0);
                            this.Y = this.f23093k.n();
                            this.f23092j.I(0);
                            sfVar.c(this.f23092j, 4);
                            this.X += 4;
                        } else {
                            int iQ2 = q(rkVar, sfVar, i14);
                            this.W += iQ2;
                            this.X += iQ2;
                            this.Y -= iQ2;
                        }
                    }
                }
                if ("A_VORBIS".equals(tkVar.f23062b)) {
                    this.f23095m.I(0);
                    sfVar.c(this.f23095m, 4);
                    this.X += 4;
                }
                return o();
            }
            z(rkVar, f23086d, i2);
        }
        return o();
    }

    private final int q(rk rkVar, sf sfVar, int i2) {
        int iA = this.f23097o.a();
        if (iA <= 0) {
            return sfVar.a(rkVar, i2, false);
        }
        int iMin = Math.min(i2, iA);
        sfVar.c(this.f23097o, iMin);
        return iMin;
    }

    private final long r(long j2) throws lb {
        long j3 = this.w;
        if (j3 != -9223372036854775807L) {
            return amn.q(j2, j3, 1000L);
        }
        throw new lb("Can't scale timecode prior to timecodeScale being set.");
    }

    private final tk s(int i2) throws lb {
        u(i2);
        return this.z;
    }

    private final void t(int i2) throws lb {
        if (this.H == null || this.I == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i2);
            sb.append(" must be in a Cues");
            throw new lb(sb.toString());
        }
    }

    private final void u(int i2) throws lb {
        if (this.z != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in a TrackEntry");
        throw new lb(sb.toString());
    }

    private final void v() {
        ajr.c(this.af);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea A[PHI: r1
  0x00ea: PHI (r1v30 int) = (r1v29 int), (r1v31 int) binds: [B:44:0x00ce, B:48:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[EDGE_INSN: B:53:0x00b7->B:42:0x00b7 BREAK  A[LOOP:0: B:36:0x009c->B:41:0x00b4], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w(com.google.ads.interactivemedia.v3.internal.tk r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.tm.w(com.google.ads.interactivemedia.v3.internal.tk, long, int, int, int):void");
    }

    private final void x(rk rkVar, int i2) {
        if (this.f23094l.d() >= i2) {
            return;
        }
        if (this.f23094l.b() < i2) {
            alx alxVar = this.f23094l;
            int iB = alxVar.b();
            alxVar.B(Math.max(iB + iB, i2));
        }
        rkVar.h(this.f23094l.K(), this.f23094l.d(), i2 - this.f23094l.d());
        this.f23094l.H(i2);
    }

    private final void y() {
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = false;
        this.aa = false;
        this.ab = false;
        this.ac = 0;
        this.ad = (byte) 0;
        this.ae = false;
        this.f23097o.E(0);
    }

    private final void z(rk rkVar, byte[] bArr, int i2) {
        int length = bArr.length;
        int i3 = i2 + 32;
        if (this.p.b() < i3) {
            this.p.F(Arrays.copyOf(bArr, i3 + i2));
        } else {
            System.arraycopy(bArr, 0, this.p.K(), 0, 32);
        }
        rkVar.h(this.p.K(), 32, i2);
        this.p.I(0);
        this.p.H(i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final int a(rk rkVar, rz rzVar) {
        this.K = false;
        while (!this.K) {
            if (!this.ag.c(rkVar)) {
                for (int i2 = 0; i2 < this.f23090h.size(); i2++) {
                    tk tkVarValueAt = this.f23090h.valueAt(i2);
                    tk.b(tkVarValueAt);
                    tl tlVar = tkVarValueAt.S;
                    if (tlVar != null) {
                        tlVar.a(tkVarValueAt);
                    }
                }
                return -1;
            }
            long jE = rkVar.e();
            if (this.D) {
                this.F = jE;
                rzVar.f22929a = this.E;
                this.D = false;
                return 1;
            }
            if (this.A) {
                long j2 = this.F;
                if (j2 != -1) {
                    rzVar.f22929a = j2;
                    this.F = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.af = rmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        this.G = -9223372036854775807L;
        this.L = 0;
        this.ag.b();
        this.f23089g.e();
        y();
        for (int i2 = 0; i2 < this.f23090h.size(); i2++) {
            tl tlVar = this.f23090h.valueAt(i2).S;
            if (tlVar != null) {
                tlVar.b();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final boolean f(rk rkVar) {
        return new tn().a(rkVar);
    }

    public final void h(int i2, int i3, rk rkVar) throws lb {
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i2;
        int i9 = 4;
        int i10 = 1;
        int i11 = 0;
        if (i8 != 161 && i8 != 163) {
            if (i8 == 165) {
                if (this.L != 2) {
                    return;
                }
                tk tkVar = this.f23090h.get(this.R);
                if (this.U != 4 || !"V_VP9".equals(tkVar.f23062b)) {
                    rkVar.j(i3);
                    return;
                } else {
                    this.s.E(i3);
                    rkVar.h(this.s.K(), 0, i3);
                    return;
                }
            }
            if (i8 == 16877) {
                tk tkVarS = s(i2);
                if (tkVarS.X != 1685485123 && tkVarS.X != 1685480259) {
                    rkVar.j(i3);
                    return;
                }
                byte[] bArr = new byte[i3];
                tkVarS.M = bArr;
                rkVar.h(bArr, 0, i3);
                return;
            }
            if (i8 == 16981) {
                u(i2);
                byte[] bArr2 = new byte[i3];
                this.z.f23068h = bArr2;
                rkVar.h(bArr2, 0, i3);
                return;
            }
            if (i8 == 18402) {
                byte[] bArr3 = new byte[i3];
                rkVar.h(bArr3, 0, i3);
                s(i2).f23069i = new se(1, bArr3, 0, 0);
                return;
            }
            if (i8 == 21419) {
                Arrays.fill(this.f23096n.K(), (byte) 0);
                rkVar.h(this.f23096n.K(), 4 - i3, i3);
                this.f23096n.I(0);
                this.B = (int) this.f23096n.s();
                return;
            }
            if (i8 == 25506) {
                u(i2);
                byte[] bArr4 = new byte[i3];
                this.z.f23070j = bArr4;
                rkVar.h(bArr4, 0, i3);
                return;
            }
            if (i8 != 30322) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unexpected id: ");
                sb.append(i8);
                throw new lb(sb.toString());
            }
            u(i2);
            byte[] bArr5 = new byte[i3];
            this.z.u = bArr5;
            rkVar.h(bArr5, 0, i3);
            return;
        }
        if (this.L == 0) {
            this.R = (int) this.f23089g.d(rkVar, false, true, 8);
            this.S = this.f23089g.a();
            this.N = -9223372036854775807L;
            this.L = 1;
            this.f23094l.E(0);
        }
        tk tkVar2 = this.f23090h.get(this.R);
        if (tkVar2 == null) {
            rkVar.j(i3 - this.S);
            this.L = 0;
            return;
        }
        tk.b(tkVar2);
        if (this.L == 1) {
            x(rkVar, 3);
            int i12 = (this.f23094l.K()[2] & 6) >> 1;
            byte b2 = 255;
            if (i12 == 0) {
                this.P = 1;
                int[] iArrB = B(this.Q, 1);
                this.Q = iArrB;
                iArrB[0] = (i3 - this.S) - 3;
            } else {
                x(rkVar, 4);
                int i13 = (this.f23094l.K()[3] & 255) + 1;
                this.P = i13;
                int[] iArrB2 = B(this.Q, i13);
                this.Q = iArrB2;
                if (i12 == 2) {
                    int i14 = this.S;
                    int i15 = this.P;
                    Arrays.fill(iArrB2, 0, i15, ((i3 - i14) - 4) / i15);
                } else {
                    if (i12 != 1) {
                        if (i12 != 3) {
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unexpected lacing value: ");
                            sb2.append(2);
                            throw new lb(sb2.toString());
                        }
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            int i18 = this.P - 1;
                            if (i16 >= i18) {
                                this.Q[i18] = ((i3 - this.S) - i9) - i17;
                                break;
                            }
                            this.Q[i16] = i11;
                            i9++;
                            x(rkVar, i9);
                            int i19 = i9 - 1;
                            if (this.f23094l.K()[i19] == 0) {
                                throw new lb("No valid varint length mask found");
                            }
                            int i20 = 0;
                            while (true) {
                                if (i20 >= 8) {
                                    j2 = 0;
                                    break;
                                }
                                int i21 = i10 << (7 - i20);
                                if ((this.f23094l.K()[i19] & i21) != 0) {
                                    i9 += i20;
                                    x(rkVar, i9);
                                    int i22 = i19 + 1;
                                    j2 = this.f23094l.K()[i19] & b2 & (i21 ^ (-1));
                                    while (i22 < i9) {
                                        j2 = (j2 << 8) | ((long) (this.f23094l.K()[i22] & b2));
                                        i22++;
                                        b2 = 255;
                                    }
                                    if (i16 > 0) {
                                        j2 -= (1 << ((i20 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i20++;
                                    i10 = 1;
                                    b2 = 255;
                                }
                            }
                            if (j2 < -2147483648L || j2 > 2147483647L) {
                                break;
                            }
                            int i23 = (int) j2;
                            int[] iArr = this.Q;
                            if (i16 != 0) {
                                i23 += iArr[i16 - 1];
                            }
                            iArr[i16] = i23;
                            i17 += i23;
                            i16++;
                            i10 = 1;
                            i11 = 0;
                            b2 = 255;
                        }
                        throw new lb("EBML lacing sample size out of range.");
                    }
                    int i24 = 0;
                    int i25 = 0;
                    while (true) {
                        i4 = this.P - 1;
                        if (i24 >= i4) {
                            break;
                        }
                        this.Q[i24] = 0;
                        do {
                            i9++;
                            x(rkVar, i9);
                            i5 = this.f23094l.K()[i9 - 1] & 255;
                            int[] iArr2 = this.Q;
                            i6 = iArr2[i24] + i5;
                            iArr2[i24] = i6;
                        } while (i5 == 255);
                        i25 += i6;
                        i24++;
                    }
                    this.Q[i4] = ((i3 - this.S) - i9) - i25;
                }
            }
            this.M = this.G + r((this.f23094l.K()[0] << 8) | (this.f23094l.K()[1] & 255));
            if (tkVar2.f23064d == 2) {
                i7 = 1;
                this.T = i7;
                this.L = 2;
                this.O = 0;
            } else {
                if (i8 == 163) {
                    if ((this.f23094l.K()[2] & 128) == 128) {
                        i8 = 163;
                        i7 = 1;
                        this.T = i7;
                        this.L = 2;
                        this.O = 0;
                    } else {
                        i8 = 163;
                    }
                }
                i7 = 0;
                this.T = i7;
                this.L = 2;
                this.O = 0;
            }
        }
        if (i8 == 163) {
            while (true) {
                int i26 = this.O;
                if (i26 >= this.P) {
                    this.L = 0;
                    return;
                }
                w(tkVar2, ((long) ((this.O * tkVar2.f23065e) / 1000)) + this.M, this.T, p(rkVar, tkVar2, this.Q[i26]), 0);
                this.O++;
            }
        } else {
            while (true) {
                int i27 = this.O;
                if (i27 >= this.P) {
                    return;
                }
                int[] iArr3 = this.Q;
                iArr3[i27] = p(rkVar, tkVar2, iArr3[i27]);
                this.O++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r19) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.tm.i(int):void");
    }

    public final void j(int i2, double d2) {
        if (i2 == 181) {
            s(i2).P = (int) d2;
            return;
        }
        if (i2 == 17545) {
            this.x = (long) d2;
            return;
        }
        switch (i2) {
            case 21969:
                s(i2).C = (float) d2;
                break;
            case 21970:
                s(i2).D = (float) d2;
                break;
            case 21971:
                s(i2).E = (float) d2;
                break;
            case 21972:
                s(i2).F = (float) d2;
                break;
            case 21973:
                s(i2).G = (float) d2;
                break;
            case 21974:
                s(i2).H = (float) d2;
                break;
            case 21975:
                s(i2).I = (float) d2;
                break;
            case 21976:
                s(i2).J = (float) d2;
                break;
            case 21977:
                s(i2).K = (float) d2;
                break;
            case 21978:
                s(i2).L = (float) d2;
                break;
            default:
                switch (i2) {
                    case 30323:
                        s(i2).r = (float) d2;
                        break;
                    case 30324:
                        s(i2).s = (float) d2;
                        break;
                    case 30325:
                        s(i2).t = (float) d2;
                        break;
                }
                break;
        }
    }

    public final void k(int i2, long j2) throws lb {
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j2);
            sb.append(" not supported");
            throw new lb(sb.toString());
        }
        if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j2);
            sb2.append(" not supported");
            throw new lb(sb2.toString());
        }
        switch (i2) {
            case 131:
                s(i2).f23064d = (int) j2;
                return;
            case 136:
                s(i2).U = j2 == 1;
                return;
            case 155:
                this.N = r(j2);
                return;
            case 159:
                s(i2).N = (int) j2;
                return;
            case 176:
                s(i2).f23072l = (int) j2;
                return;
            case 179:
                t(i2);
                this.H.c(r(j2));
                return;
            case 186:
                s(i2).f23073m = (int) j2;
                return;
            case 215:
                s(i2).f23063c = (int) j2;
                return;
            case 231:
                this.G = r(j2);
                return;
            case 238:
                this.U = (int) j2;
                return;
            case 241:
                if (this.J) {
                    return;
                }
                t(i2);
                this.I.c(j2);
                this.J = true;
                return;
            case 251:
                this.V = true;
                return;
            case 16871:
                s(i2).X = (int) j2;
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j2);
                sb3.append(" not supported");
                throw new lb(sb3.toString());
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j2);
                    sb4.append(" not supported");
                    throw new lb(sb4.toString());
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j2);
                sb5.append(" not supported");
                throw new lb(sb5.toString());
            case 18401:
                if (j2 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new lb(sb6.toString());
            case 18408:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j2);
                sb7.append(" not supported");
                throw new lb(sb7.toString());
            case 21420:
                this.C = j2 + this.v;
                return;
            case 21432:
                u(i2);
                int i3 = (int) j2;
                if (i3 == 0) {
                    this.z.v = 0;
                    return;
                }
                if (i3 == 1) {
                    this.z.v = 2;
                    return;
                } else if (i3 == 3) {
                    this.z.v = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.z.v = 3;
                    return;
                }
            case 21680:
                s(i2).f23074n = (int) j2;
                return;
            case 21682:
                s(i2).p = (int) j2;
                return;
            case 21690:
                s(i2).f23075o = (int) j2;
                return;
            case 21930:
                s(i2).T = j2 == 1;
                return;
            case 21998:
                s(i2).f23066f = (int) j2;
                return;
            case 22186:
                s(i2).Q = j2;
                return;
            case 22203:
                s(i2).R = j2;
                return;
            case 25188:
                s(i2).O = (int) j2;
                return;
            case 30321:
                u(i2);
                int i4 = (int) j2;
                if (i4 == 0) {
                    this.z.q = 0;
                    return;
                }
                if (i4 == 1) {
                    this.z.q = 1;
                    return;
                } else if (i4 == 2) {
                    this.z.q = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.z.q = 3;
                    return;
                }
            case 2352003:
                s(i2).f23065e = (int) j2;
                return;
            case 2807729:
                this.w = j2;
                return;
            default:
                switch (i2) {
                    case 21945:
                        u(i2);
                        int i5 = (int) j2;
                        if (i5 == 1) {
                            this.z.z = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.z.z = 1;
                            return;
                        }
                    case 21946:
                        u(i2);
                        int iB = amq.b((int) j2);
                        if (iB != -1) {
                            this.z.y = iB;
                            return;
                        }
                        return;
                    case 21947:
                        u(i2);
                        this.z.w = true;
                        int iA = amq.a((int) j2);
                        if (iA != -1) {
                            this.z.x = iA;
                            return;
                        }
                        return;
                    case 21948:
                        s(i2).A = (int) j2;
                        return;
                    case 21949:
                        s(i2).B = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void l(int i2, long j2, long j3) throws lb {
        v();
        if (i2 == 160) {
            this.V = false;
            return;
        }
        if (i2 == 174) {
            this.z = new tk(null);
            return;
        }
        if (i2 == 187) {
            this.J = false;
            return;
        }
        if (i2 == 19899) {
            this.B = -1;
            this.C = -1L;
            return;
        }
        if (i2 == 20533) {
            s(i2).f23067g = true;
            return;
        }
        if (i2 == 21968) {
            s(i2).w = true;
            return;
        }
        if (i2 == 408125543) {
            long j4 = this.v;
            if (j4 != -1 && j4 != j2) {
                throw new lb("Multiple Segment elements not supported");
            }
            this.v = j2;
            this.u = j3;
            return;
        }
        if (i2 == 475249515) {
            this.H = new alk();
            this.I = new alk();
        } else if (i2 == 524531317 && !this.A) {
            if (this.f23091i && this.E != -1) {
                this.D = true;
            } else {
                this.af.bb(new sb(this.y));
                this.A = true;
            }
        }
    }

    public final void m(int i2, String str) throws lb {
        if (i2 == 134) {
            s(i2).f23062b = str;
            return;
        }
        if (i2 != 17026) {
            if (i2 == 21358) {
                s(i2).f23061a = str;
                return;
            } else {
                if (i2 != 2274716) {
                    return;
                }
                s(i2).Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw new lb(sb.toString());
    }
}
