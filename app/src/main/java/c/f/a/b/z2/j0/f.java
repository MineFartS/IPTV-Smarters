package c.f.a.b.z2.j0;

import android.util.Pair;
import c.f.a.b.b3.a;
import c.f.a.b.j3.d0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import c.f.a.b.k3.s;
import c.f.a.b.w1;
import c.f.a.b.x2.w;
import c.f.a.b.z2.j0.e;
import c.f.b.b.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f10899a = x0.k0("OpusHead");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f10903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f10904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final i0 f10905f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final i0 f10906g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f10907h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f10908i;

        public a(i0 i0Var, i0 i0Var2, boolean z) throws w1 {
            this.f10906g = i0Var;
            this.f10905f = i0Var2;
            this.f10904e = z;
            i0Var2.P(12);
            this.f10900a = i0Var2.H();
            i0Var.P(12);
            this.f10908i = i0Var.H();
            c.f.a.b.z2.m.a(i0Var.n() == 1, "first_chunk must be 1");
            this.f10901b = -1;
        }

        public boolean a() {
            int i2 = this.f10901b + 1;
            this.f10901b = i2;
            if (i2 == this.f10900a) {
                return false;
            }
            this.f10903d = this.f10904e ? this.f10905f.I() : this.f10905f.F();
            if (this.f10901b == this.f10907h) {
                this.f10902c = this.f10906g.H();
                this.f10906g.Q(4);
                int i3 = this.f10908i - 1;
                this.f10908i = i3;
                this.f10907h = i3 > 0 ? this.f10906g.H() - 1 : -1;
            }
            return true;
        }
    }

    public interface b {
        int a();

        int b();

        int c();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p[] f10909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k1 f10910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10912d = 0;

        public c(int i2) {
            this.f10909a = new p[i2];
        }
    }

    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i0 f10915c;

        public d(e.b bVar, k1 k1Var) {
            i0 i0Var = bVar.f10898b;
            this.f10915c = i0Var;
            i0Var.P(12);
            int iH = i0Var.H();
            if ("audio/raw".equals(k1Var.f9338m)) {
                int iC0 = x0.c0(k1Var.B, k1Var.z);
                if (iH == 0 || iH % iC0 != 0) {
                    z.i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iC0 + ", stsz sample size: " + iH);
                    iH = iC0;
                }
            }
            this.f10913a = iH == 0 ? -1 : iH;
            this.f10914b = i0Var.H();
        }

        @Override // c.f.a.b.z2.j0.f.b
        public int a() {
            return this.f10913a;
        }

        @Override // c.f.a.b.z2.j0.f.b
        public int b() {
            return this.f10914b;
        }

        @Override // c.f.a.b.z2.j0.f.b
        public int c() {
            int i2 = this.f10913a;
            return i2 == -1 ? this.f10915c.H() : i2;
        }
    }

    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0 f10916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10920e;

        public e(e.b bVar) {
            i0 i0Var = bVar.f10898b;
            this.f10916a = i0Var;
            i0Var.P(12);
            this.f10918c = i0Var.H() & 255;
            this.f10917b = i0Var.H();
        }

        @Override // c.f.a.b.z2.j0.f.b
        public int a() {
            return -1;
        }

        @Override // c.f.a.b.z2.j0.f.b
        public int b() {
            return this.f10917b;
        }

        @Override // c.f.a.b.z2.j0.f.b
        public int c() {
            int i2 = this.f10918c;
            if (i2 == 8) {
                return this.f10916a.D();
            }
            if (i2 == 16) {
                return this.f10916a.J();
            }
            int i3 = this.f10919d;
            this.f10919d = i3 + 1;
            if (i3 % 2 != 0) {
                return this.f10920e & 15;
            }
            int iD = this.f10916a.D();
            this.f10920e = iD;
            return (iD & 240) >> 4;
        }
    }

    /* JADX INFO: renamed from: c.f.a.b.z2.j0.f$f, reason: collision with other inner class name */
    public static final class C0147f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10923c;

        public C0147f(int i2, long j2, int i3) {
            this.f10921a = i2;
            this.f10922b = j2;
            this.f10923c = i3;
        }
    }

    public static Pair<c.f.a.b.b3.a, c.f.a.b.b3.a> A(e.b bVar) {
        i0 i0Var = bVar.f10898b;
        i0Var.P(8);
        c.f.a.b.b3.a aVarB = null;
        c.f.a.b.b3.a aVarT = null;
        while (i0Var.a() >= 8) {
            int iE = i0Var.e();
            int iN = i0Var.n();
            int iN2 = i0Var.n();
            if (iN2 == 1835365473) {
                i0Var.P(iE);
                aVarB = B(i0Var, iE + iN);
            } else if (iN2 == 1936553057) {
                i0Var.P(iE);
                aVarT = t(i0Var, iE + iN);
            }
            i0Var.P(iE + iN);
        }
        return Pair.create(aVarB, aVarT);
    }

    public static c.f.a.b.b3.a B(i0 i0Var, int i2) {
        i0Var.Q(8);
        d(i0Var);
        while (i0Var.e() < i2) {
            int iE = i0Var.e();
            int iN = i0Var.n();
            if (i0Var.n() == 1768715124) {
                i0Var.P(iE);
                return k(i0Var, iE + iN);
            }
            i0Var.P(iE + iN);
        }
        return null;
    }

    public static void C(i0 i0Var, int i2, int i3, int i4, int i5, int i6, w wVar, c cVar, int i7) throws w1 {
        w wVar2;
        String str;
        i0 i0Var2 = i0Var;
        int i8 = i3;
        int i9 = i4;
        w wVarD = wVar;
        i0Var2.P(i8 + 8 + 8);
        i0Var2.Q(16);
        int iJ = i0Var.J();
        int iJ2 = i0Var.J();
        i0Var2.Q(50);
        int iE = i0Var.e();
        int iIntValue = i2;
        if (iIntValue == 1701733238) {
            Pair<Integer, p> pairR = r(i0Var2, i8, i9);
            if (pairR != null) {
                iIntValue = ((Integer) pairR.first).intValue();
                wVarD = wVarD == null ? null : wVarD.d(((p) pairR.second).f11007b);
                cVar.f10909a[i7] = (p) pairR.second;
            }
            i0Var2.P(iE);
        }
        String str2 = "video/3gpp";
        String str3 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        int i10 = -1;
        float fP = 1.0f;
        String str4 = null;
        List<byte[]> listK = null;
        byte[] bArrQ = null;
        c.f.a.b.k3.n nVar = null;
        boolean z = false;
        while (true) {
            if (iE - i8 >= i9) {
                wVar2 = wVarD;
                break;
            }
            i0Var2.P(iE);
            int iE2 = i0Var.e();
            String str5 = str2;
            int iN = i0Var.n();
            if (iN == 0) {
                wVar2 = wVarD;
                if (i0Var.e() - i8 == i9) {
                    break;
                }
            } else {
                wVar2 = wVarD;
            }
            c.f.a.b.z2.m.a(iN > 0, "childAtomSize must be positive");
            int iN2 = i0Var.n();
            if (iN2 == 1635148611) {
                c.f.a.b.z2.m.a(str3 == null, null);
                i0Var2.P(iE2 + 8);
                c.f.a.b.k3.m mVarB = c.f.a.b.k3.m.b(i0Var);
                listK = mVarB.f9481a;
                cVar.f10911c = mVarB.f9482b;
                if (!z) {
                    fP = mVarB.f9485e;
                }
                str4 = mVarB.f9486f;
                str = "video/avc";
            } else if (iN2 == 1752589123) {
                c.f.a.b.z2.m.a(str3 == null, null);
                i0Var2.P(iE2 + 8);
                s sVarA = s.a(i0Var);
                listK = sVarA.f9521a;
                cVar.f10911c = sVarA.f9522b;
                str4 = sVarA.f9523c;
                str = "video/hevc";
            } else {
                if (iN2 == 1685480259 || iN2 == 1685485123) {
                    c.f.a.b.k3.p pVarA = c.f.a.b.k3.p.a(i0Var);
                    if (pVarA != null) {
                        str4 = pVarA.f9496c;
                        str3 = "video/dolby-vision";
                    }
                } else if (iN2 == 1987076931) {
                    c.f.a.b.z2.m.a(str3 == null, null);
                    str = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (iN2 == 1635135811) {
                    c.f.a.b.z2.m.a(str3 == null, null);
                    str3 = "video/av01";
                } else if (iN2 == 1681012275) {
                    c.f.a.b.z2.m.a(str3 == null, null);
                    str3 = str5;
                } else if (iN2 == 1702061171) {
                    c.f.a.b.z2.m.a(str3 == null, null);
                    Pair<String, byte[]> pairH = h(i0Var2, iE2);
                    String str6 = (String) pairH.first;
                    byte[] bArr = (byte[]) pairH.second;
                    if (bArr != null) {
                        listK = t.K(bArr);
                    }
                    str3 = str6;
                } else if (iN2 == 1885434736) {
                    fP = p(i0Var2, iE2);
                    z = true;
                } else if (iN2 == 1937126244) {
                    bArrQ = q(i0Var2, iE2, iN);
                } else if (iN2 == 1936995172) {
                    int iD = i0Var.D();
                    i0Var2.Q(3);
                    if (iD == 0) {
                        int iD2 = i0Var.D();
                        if (iD2 == 0) {
                            i10 = 0;
                        } else if (iD2 == 1) {
                            i10 = 1;
                        } else if (iD2 == 2) {
                            i10 = 2;
                        } else if (iD2 == 3) {
                            i10 = 3;
                        }
                    }
                } else if (iN2 == 1668246642) {
                    int iN3 = i0Var.n();
                    boolean z2 = iN3 == 1852009592;
                    if (z2 || iN3 == 1852009571) {
                        int iJ3 = i0Var.J();
                        int iJ4 = i0Var.J();
                        i0Var2.Q(2);
                        nVar = new c.f.a.b.k3.n(c.f.a.b.k3.n.b(iJ3), z2 && (i0Var.D() & 128) != 0 ? 1 : 2, c.f.a.b.k3.n.c(iJ4), null);
                    } else {
                        z.i("AtomParsers", "Unsupported color type: " + c.f.a.b.z2.j0.e.a(iN3));
                    }
                }
                iE += iN;
                i0Var2 = i0Var;
                i8 = i3;
                i9 = i4;
                str2 = str5;
                wVarD = wVar2;
            }
            str3 = str;
            iE += iN;
            i0Var2 = i0Var;
            i8 = i3;
            i9 = i4;
            str2 = str5;
            wVarD = wVar2;
        }
        if (str3 == null) {
            return;
        }
        cVar.f10910b = new k1.b().R(i5).e0(str3).I(str4).j0(iJ).Q(iJ2).a0(fP).d0(i6).b0(bArrQ).h0(i10).T(listK).L(wVar2).J(nVar).E();
    }

    public static boolean a(long[] jArr, long j2, long j3, long j4) {
        int length = jArr.length - 1;
        return jArr[0] <= j3 && j3 < jArr[x0.r(4, 0, length)] && jArr[x0.r(jArr.length - 4, 0, length)] < j4 && j4 <= j2;
    }

    public static int b(i0 i0Var, int i2, int i3) throws w1 {
        int iE = i0Var.e();
        while (iE - i2 < i3) {
            i0Var.P(iE);
            int iN = i0Var.n();
            c.f.a.b.z2.m.a(iN > 0, "childAtomSize must be positive");
            if (i0Var.n() == 1702061171) {
                return iE;
            }
            iE += iN;
        }
        return -1;
    }

    public static int c(int i2) {
        if (i2 == 1936684398) {
            return 1;
        }
        if (i2 == 1986618469) {
            return 2;
        }
        if (i2 == 1952807028 || i2 == 1935832172 || i2 == 1937072756 || i2 == 1668047728) {
            return 3;
        }
        return i2 == 1835365473 ? 5 : -1;
    }

    public static void d(i0 i0Var) {
        int iE = i0Var.e();
        i0Var.Q(4);
        if (i0Var.n() != 1751411826) {
            iE += 4;
        }
        i0Var.P(iE);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(c.f.a.b.j3.i0 r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, c.f.a.b.x2.w r27, c.f.a.b.z2.j0.f.c r28, int r29) throws c.f.a.b.w1 {
        /*
            Method dump skipped, instruction units count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.j0.f.e(c.f.a.b.j3.i0, int, int, int, int, java.lang.String, boolean, c.f.a.b.x2.w, c.f.a.b.z2.j0.f$c, int):void");
    }

    public static Pair<Integer, p> f(i0 i0Var, int i2, int i3) throws w1 {
        int i4 = i2 + 8;
        String strA = null;
        Integer numValueOf = null;
        int i5 = -1;
        int i6 = 0;
        while (i4 - i2 < i3) {
            i0Var.P(i4);
            int iN = i0Var.n();
            int iN2 = i0Var.n();
            if (iN2 == 1718775137) {
                numValueOf = Integer.valueOf(i0Var.n());
            } else if (iN2 == 1935894637) {
                i0Var.Q(4);
                strA = i0Var.A(4);
            } else if (iN2 == 1935894633) {
                i5 = i4;
                i6 = iN;
            }
            i4 += iN;
        }
        if (!"cenc".equals(strA) && !"cbc1".equals(strA) && !"cens".equals(strA) && !"cbcs".equals(strA)) {
            return null;
        }
        c.f.a.b.z2.m.a(numValueOf != null, "frma atom is mandatory");
        c.f.a.b.z2.m.a(i5 != -1, "schi atom is mandatory");
        p pVarS = s(i0Var, i5, i6, strA);
        c.f.a.b.z2.m.a(pVarS != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, x0.i(pVarS));
    }

    public static Pair<long[], long[]> g(e.a aVar) {
        e.b bVarG = aVar.g(1701606260);
        if (bVarG == null) {
            return null;
        }
        i0 i0Var = bVarG.f10898b;
        i0Var.P(8);
        int iC = c.f.a.b.z2.j0.e.c(i0Var.n());
        int iH = i0Var.H();
        long[] jArr = new long[iH];
        long[] jArr2 = new long[iH];
        for (int i2 = 0; i2 < iH; i2++) {
            jArr[i2] = iC == 1 ? i0Var.I() : i0Var.F();
            jArr2[i2] = iC == 1 ? i0Var.w() : i0Var.n();
            if (i0Var.z() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            i0Var.Q(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair<String, byte[]> h(i0 i0Var, int i2) {
        i0Var.P(i2 + 8 + 4);
        i0Var.Q(1);
        i(i0Var);
        i0Var.Q(2);
        int iD = i0Var.D();
        if ((iD & 128) != 0) {
            i0Var.Q(2);
        }
        if ((iD & 64) != 0) {
            i0Var.Q(i0Var.J());
        }
        if ((iD & 32) != 0) {
            i0Var.Q(2);
        }
        i0Var.Q(1);
        i(i0Var);
        String strH = d0.h(i0Var.D());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return Pair.create(strH, null);
        }
        i0Var.Q(12);
        i0Var.Q(1);
        int i3 = i(i0Var);
        byte[] bArr = new byte[i3];
        i0Var.j(bArr, 0, i3);
        return Pair.create(strH, bArr);
    }

    public static int i(i0 i0Var) {
        int iD = i0Var.D();
        int i2 = iD & 127;
        while ((iD & 128) == 128) {
            iD = i0Var.D();
            i2 = (i2 << 7) | (iD & 127);
        }
        return i2;
    }

    public static int j(i0 i0Var) {
        i0Var.P(16);
        return i0Var.n();
    }

    public static c.f.a.b.b3.a k(i0 i0Var, int i2) {
        i0Var.Q(8);
        ArrayList arrayList = new ArrayList();
        while (i0Var.e() < i2) {
            a.b bVarC = j.c(i0Var);
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c.f.a.b.b3.a(arrayList);
    }

    public static Pair<Long, String> l(i0 i0Var) {
        i0Var.P(8);
        int iC = c.f.a.b.z2.j0.e.c(i0Var.n());
        i0Var.Q(iC == 0 ? 8 : 16);
        long jF = i0Var.F();
        i0Var.Q(iC == 0 ? 4 : 8);
        int iJ = i0Var.J();
        return Pair.create(Long.valueOf(jF), BuildConfig.FLAVOR + ((char) (((iJ >> 10) & 31) + 96)) + ((char) (((iJ >> 5) & 31) + 96)) + ((char) ((iJ & 31) + 96)));
    }

    public static c.f.a.b.b3.a m(e.a aVar) {
        e.b bVarG = aVar.g(1751411826);
        e.b bVarG2 = aVar.g(1801812339);
        e.b bVarG3 = aVar.g(1768715124);
        if (bVarG == null || bVarG2 == null || bVarG3 == null || j(bVarG.f10898b) != 1835299937) {
            return null;
        }
        i0 i0Var = bVarG2.f10898b;
        i0Var.P(12);
        int iN = i0Var.n();
        String[] strArr = new String[iN];
        for (int i2 = 0; i2 < iN; i2++) {
            int iN2 = i0Var.n();
            i0Var.Q(4);
            strArr[i2] = i0Var.A(iN2 - 8);
        }
        i0 i0Var2 = bVarG3.f10898b;
        i0Var2.P(8);
        ArrayList arrayList = new ArrayList();
        while (i0Var2.a() > 8) {
            int iE = i0Var2.e();
            int iN3 = i0Var2.n();
            int iN4 = i0Var2.n() - 1;
            if (iN4 < 0 || iN4 >= iN) {
                z.i("AtomParsers", "Skipped metadata with unknown key index: " + iN4);
            } else {
                c.f.a.b.b3.n.b bVarF = j.f(i0Var2, iE + iN3, strArr[iN4]);
                if (bVarF != null) {
                    arrayList.add(bVarF);
                }
            }
            i0Var2.P(iE + iN3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c.f.a.b.b3.a(arrayList);
    }

    public static void n(i0 i0Var, int i2, int i3, int i4, c cVar) {
        i0Var.P(i3 + 8 + 8);
        if (i2 == 1835365492) {
            i0Var.x();
            String strX = i0Var.x();
            if (strX != null) {
                cVar.f10910b = new k1.b().R(i4).e0(strX).E();
            }
        }
    }

    public static long o(i0 i0Var) {
        i0Var.P(8);
        i0Var.Q(c.f.a.b.z2.j0.e.c(i0Var.n()) != 0 ? 16 : 8);
        return i0Var.F();
    }

    public static float p(i0 i0Var, int i2) {
        i0Var.P(i2 + 8);
        return i0Var.H() / i0Var.H();
    }

    public static byte[] q(i0 i0Var, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            i0Var.P(i4);
            int iN = i0Var.n();
            if (i0Var.n() == 1886547818) {
                return Arrays.copyOfRange(i0Var.d(), i4, iN + i4);
            }
            i4 += iN;
        }
        return null;
    }

    public static Pair<Integer, p> r(i0 i0Var, int i2, int i3) throws w1 {
        Pair<Integer, p> pairF;
        int iE = i0Var.e();
        while (iE - i2 < i3) {
            i0Var.P(iE);
            int iN = i0Var.n();
            c.f.a.b.z2.m.a(iN > 0, "childAtomSize must be positive");
            if (i0Var.n() == 1936289382 && (pairF = f(i0Var, iE, iN)) != null) {
                return pairF;
            }
            iE += iN;
        }
        return null;
    }

    public static p s(i0 i0Var, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            i0Var.P(i6);
            int iN = i0Var.n();
            if (i0Var.n() == 1952804451) {
                int iC = c.f.a.b.z2.j0.e.c(i0Var.n());
                i0Var.Q(1);
                if (iC == 0) {
                    i0Var.Q(1);
                    i5 = 0;
                    i4 = 0;
                } else {
                    int iD = i0Var.D();
                    i4 = iD & 15;
                    i5 = (iD & 240) >> 4;
                }
                boolean z = i0Var.D() == 1;
                int iD2 = i0Var.D();
                byte[] bArr2 = new byte[16];
                i0Var.j(bArr2, 0, 16);
                if (z && iD2 == 0) {
                    int iD3 = i0Var.D();
                    bArr = new byte[iD3];
                    i0Var.j(bArr, 0, iD3);
                }
                return new p(z, str, iD2, bArr2, i5, i4, bArr);
            }
            i6 += iN;
        }
    }

    public static c.f.a.b.b3.a t(i0 i0Var, int i2) {
        i0Var.Q(12);
        while (i0Var.e() < i2) {
            int iE = i0Var.e();
            int iN = i0Var.n();
            if (i0Var.n() == 1935766900) {
                if (iN < 14) {
                    return null;
                }
                i0Var.Q(5);
                int iD = i0Var.D();
                if (iD != 12 && iD != 13) {
                    return null;
                }
                float f2 = iD == 12 ? 240.0f : 120.0f;
                i0Var.Q(1);
                return new c.f.a.b.b3.a(new c.f.a.b.b3.n.e(f2, i0Var.D()));
            }
            i0Var.P(iE + iN);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0431 A[EDGE_INSN: B:212:0x0431->B:170:0x0431 BREAK  A[LOOP:2: B:153:0x03c7->B:169:0x042a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.z2.j0.r u(c.f.a.b.z2.j0.o r38, c.f.a.b.z2.j0.e.a r39, c.f.a.b.z2.t r40) throws c.f.a.b.w1 {
        /*
            Method dump skipped, instruction units count: 1321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.j0.f.u(c.f.a.b.z2.j0.o, c.f.a.b.z2.j0.e$a, c.f.a.b.z2.t):c.f.a.b.z2.j0.r");
    }

    public static c v(i0 i0Var, int i2, int i3, String str, w wVar, boolean z) throws w1 {
        int i4;
        i0Var.P(12);
        int iN = i0Var.n();
        c cVar = new c(iN);
        for (int i5 = 0; i5 < iN; i5++) {
            int iE = i0Var.e();
            int iN2 = i0Var.n();
            c.f.a.b.z2.m.a(iN2 > 0, "childAtomSize must be positive");
            int iN3 = i0Var.n();
            if (iN3 == 1635148593 || iN3 == 1635148595 || iN3 == 1701733238 || iN3 == 1831958048 || iN3 == 1836070006 || iN3 == 1752589105 || iN3 == 1751479857 || iN3 == 1932670515 || iN3 == 1211250227 || iN3 == 1987063864 || iN3 == 1987063865 || iN3 == 1635135537 || iN3 == 1685479798 || iN3 == 1685479729 || iN3 == 1685481573 || iN3 == 1685481521) {
                i4 = iE;
                C(i0Var, iN3, i4, iN2, i2, i3, wVar, cVar, i5);
            } else if (iN3 == 1836069985 || iN3 == 1701733217 || iN3 == 1633889587 || iN3 == 1700998451 || iN3 == 1633889588 || iN3 == 1685353315 || iN3 == 1685353317 || iN3 == 1685353320 || iN3 == 1685353324 || iN3 == 1685353336 || iN3 == 1935764850 || iN3 == 1935767394 || iN3 == 1819304813 || iN3 == 1936684916 || iN3 == 1953984371 || iN3 == 778924082 || iN3 == 778924083 || iN3 == 1835557169 || iN3 == 1835560241 || iN3 == 1634492771 || iN3 == 1634492791 || iN3 == 1970037111 || iN3 == 1332770163 || iN3 == 1716281667) {
                i4 = iE;
                e(i0Var, iN3, iE, iN2, i2, str, z, wVar, cVar, i5);
            } else {
                if (iN3 == 1414810956 || iN3 == 1954034535 || iN3 == 2004251764 || iN3 == 1937010800 || iN3 == 1664495672) {
                    w(i0Var, iN3, iE, iN2, i2, str, cVar);
                } else if (iN3 == 1835365492) {
                    n(i0Var, iN3, iE, i2, cVar);
                } else if (iN3 == 1667329389) {
                    cVar.f10910b = new k1.b().R(i2).e0("application/x-camera-motion").E();
                }
                i4 = iE;
            }
            i0Var.P(i4 + iN2);
        }
        return cVar;
    }

    public static void w(i0 i0Var, int i2, int i3, int i4, int i5, String str, c cVar) {
        i0Var.P(i3 + 8 + 8);
        String str2 = "application/ttml+xml";
        t tVarK = null;
        long j2 = Long.MAX_VALUE;
        if (i2 != 1414810956) {
            if (i2 == 1954034535) {
                int i6 = (i4 - 8) - 8;
                byte[] bArr = new byte[i6];
                i0Var.j(bArr, 0, i6);
                tVarK = t.K(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i2 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i2 == 1937010800) {
                j2 = 0;
            } else {
                if (i2 != 1664495672) {
                    throw new IllegalStateException();
                }
                cVar.f10912d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        cVar.f10910b = new k1.b().R(i5).e0(str2).V(str).i0(j2).T(tVarK).E();
    }

    public static C0147f x(i0 i0Var) {
        boolean z;
        i0Var.P(8);
        int iC = c.f.a.b.z2.j0.e.c(i0Var.n());
        i0Var.Q(iC == 0 ? 8 : 16);
        int iN = i0Var.n();
        i0Var.Q(4);
        int iE = i0Var.e();
        int i2 = iC == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                z = true;
                break;
            }
            if (i0Var.d()[iE + i4] != -1) {
                z = false;
                break;
            }
            i4++;
        }
        long j2 = -9223372036854775807L;
        if (z) {
            i0Var.Q(i2);
        } else {
            long jF = iC == 0 ? i0Var.F() : i0Var.I();
            if (jF != 0) {
                j2 = jF;
            }
        }
        i0Var.Q(16);
        int iN2 = i0Var.n();
        int iN3 = i0Var.n();
        i0Var.Q(4);
        int iN4 = i0Var.n();
        int iN5 = i0Var.n();
        if (iN2 == 0 && iN3 == 65536 && iN4 == -65536 && iN5 == 0) {
            i3 = 90;
        } else if (iN2 == 0 && iN3 == -65536 && iN4 == 65536 && iN5 == 0) {
            i3 = 270;
        } else if (iN2 == -65536 && iN3 == 0 && iN4 == 0 && iN5 == -65536) {
            i3 = 180;
        }
        return new C0147f(iN, j2, i3);
    }

    public static o y(e.a aVar, e.b bVar, long j2, w wVar, boolean z, boolean z2) throws w1 {
        e.b bVar2;
        long j3;
        long[] jArr;
        long[] jArr2;
        e.a aVarF;
        Pair<long[], long[]> pairG;
        e.a aVar2 = (e.a) c.f.a.b.j3.g.e(aVar.f(1835297121));
        int iC = c(j(((e.b) c.f.a.b.j3.g.e(aVar2.g(1751411826))).f10898b));
        if (iC == -1) {
            return null;
        }
        C0147f c0147fX = x(((e.b) c.f.a.b.j3.g.e(aVar.g(1953196132))).f10898b);
        if (j2 == -9223372036854775807L) {
            bVar2 = bVar;
            j3 = c0147fX.f10922b;
        } else {
            bVar2 = bVar;
            j3 = j2;
        }
        long jO = o(bVar2.f10898b);
        long jP0 = j3 != -9223372036854775807L ? x0.P0(j3, 1000000L, jO) : -9223372036854775807L;
        e.a aVar3 = (e.a) c.f.a.b.j3.g.e(((e.a) c.f.a.b.j3.g.e(aVar2.f(1835626086))).f(1937007212));
        Pair<Long, String> pairL = l(((e.b) c.f.a.b.j3.g.e(aVar2.g(1835296868))).f10898b);
        c cVarV = v(((e.b) c.f.a.b.j3.g.e(aVar3.g(1937011556))).f10898b, c0147fX.f10921a, c0147fX.f10923c, (String) pairL.second, wVar, z2);
        if (z || (aVarF = aVar.f(1701082227)) == null || (pairG = g(aVarF)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairG.first;
            jArr2 = (long[]) pairG.second;
            jArr = jArr3;
        }
        if (cVarV.f10910b == null) {
            return null;
        }
        return new o(c0147fX.f10921a, iC, ((Long) pairL.first).longValue(), jO, jP0, cVarV.f10910b, cVarV.f10912d, cVarV.f10909a, cVarV.f10911c, jArr, jArr2);
    }

    public static List<r> z(e.a aVar, c.f.a.b.z2.t tVar, long j2, w wVar, boolean z, boolean z2, c.f.b.a.f<o, o> fVar) {
        o oVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < aVar.f10897d.size(); i2++) {
            e.a aVar2 = aVar.f10897d.get(i2);
            if (aVar2.f10894a == 1953653099 && (oVarApply = fVar.apply(y(aVar2, (e.b) c.f.a.b.j3.g.e(aVar.g(1836476516)), j2, wVar, z, z2))) != null) {
                arrayList.add(u(oVarApply, (e.a) c.f.a.b.j3.g.e(((e.a) c.f.a.b.j3.g.e(((e.a) c.f.a.b.j3.g.e(aVar2.f(1835297121))).f(1835626086))).f(1937007212)), tVar));
            }
        }
        return arrayList;
    }
}
