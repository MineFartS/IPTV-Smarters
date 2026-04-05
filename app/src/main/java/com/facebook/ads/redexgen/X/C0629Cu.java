package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0629Cu implements Handler.Callback, InterfaceC1227aE, HV, FC, InterfaceC05669w, AT {
    public static byte[] A0V;
    public static String[] A0W;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public A8 A04;
    public AJ A05;
    public FD A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public Y0[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final C1159Xu A0G;
    public final InterfaceC1163Xy A0H;
    public final AE A0J;
    public final C0571Ac A0L;
    public final C0572Ad A0M;
    public final HW A0N;
    public final HX A0O;
    public final IP A0P;
    public final IZ A0Q;
    public final ArrayList<A6> A0R;
    public final boolean A0S;
    public final Y0[] A0T;
    public final AX[] A0U;
    public final AH A0K = new AH();
    public C0570Aa A06 = C0570Aa.A03;
    public final A7 A0I = new A7(null);

    static {
        A0L();
        A0K();
    }

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0V, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0K() {
        A0V = new byte[]{40, DateTimeFieldType.SECOND_OF_MINUTE, 2, 61, 1, 12, DateTimeFieldType.SECOND_OF_DAY, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 40, DateTimeFieldType.SECOND_OF_MINUTE, 2, 61, 1, 12, DateTimeFieldType.SECOND_OF_DAY, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 87, 37, 12, 3, 9, 1, 8, 31, 25, 55, 62, 63, 34, 57, 62, 55, 112, 61, 53, 35, 35, 49, 55, 53, 35, 112, 35, 53, 62, 36, 112, 49, 54, 36, 53, 34, 112, 34, 53, 60, 53, 49, 35, 53, 126, 71, 96, 122, 107, 124, 96, 111, 98, 46, 124, 123, 96, 122, 103, 99, 107, 46, 107, 124, 124, 97, 124, 32, 50, DateTimeFieldType.HOUR_OF_HALFDAY, 3, 27, 0, 3, 1, 9, 66, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 76, 102, 90, 64, 71, 86, 80, DateTimeFieldType.SECOND_OF_MINUTE, 80, 71, 71, 90, 71, 27, 74, 109, 118, 105, 57, 127, 120, 112, 117, 124, 125, 55, 119, 124, 64, 124, 126, 118, 68, 124, 97, 120};
    }

    public static void A0L() {
        A0W = new String[]{"86glHvEVsTHsOarjgO3yrK", "TuAJpp7uzbfmMtpdLTRiZnKK78MiZtWb", "2J1ujHTPZohQZteX1j6kCS7zhajZ8mZI", "eCxkC7v7XtRVNueTNXvbthBaIEqCwNNl", "l3Yyub2xLFiYeWCCac", "TG0XkoHYQCfebcNj4J", "6SVWI1Jvh0Z3jrcRBB9hLc8AjjQAtTry", "lVbeqNrXIfO7zu9EZv7JtI"};
    }

    public C0629Cu(Y0[] y0Arr, HW hw, HX hx, AE ae, boolean z, int i2, boolean z2, Handler handler, InterfaceC1163Xy interfaceC1163Xy, IP ip) {
        this.A0T = y0Arr;
        this.A0N = hw;
        this.A0O = hx;
        this.A0J = ae;
        this.A08 = z;
        this.A02 = i2;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = interfaceC1163Xy;
        this.A0P = ip;
        this.A0D = ae.A5S();
        this.A0S = ae.ACf();
        this.A05 = new AJ(AbstractC0573Ae.A01, -9223372036854775807L, TrackGroupArray.A04, hx);
        this.A0U = new AX[y0Arr.length];
        for (int i3 = 0; i3 < y0Arr.length; i3++) {
            y0Arr[i3].AD0(i3);
            this.A0U[i3] = y0Arr[i3].A5e();
        }
        this.A0G = new C1159Xu(this, ip);
        this.A0R = new ArrayList<>();
        this.A0C = new Y0[0];
        this.A0M = new C0572Ad();
        this.A0L = new C0571Ac();
        hw.A00(this);
        this.A0F = new HandlerThread(A06(21, 29, 15), -16);
        this.A0F.start();
        this.A0Q = ip.A4J(this.A0F.getLooper(), this);
    }

    private int A00() {
        AbstractC0573Ae abstractC0573Ae = this.A05.A03;
        if (abstractC0573Ae.A0F()) {
            return 0;
        }
        return abstractC0573Ae.A0C(abstractC0573Ae.A06(this.A0B), this.A0M).A00;
    }

    private int A01(int i2, AbstractC0573Ae abstractC0573Ae, AbstractC0573Ae abstractC0573Ae2) {
        int maxIterations = i2;
        int iA05 = -1;
        int iA01 = abstractC0573Ae.A01();
        for (int i3 = 0; i3 < iA01 && iA05 == -1; i3++) {
            maxIterations = abstractC0573Ae.A04(maxIterations, this.A0L, this.A0M, this.A02, this.A0B);
            if (maxIterations == -1) {
                break;
            }
            iA05 = abstractC0573Ae2.A05(abstractC0573Ae.A0B(maxIterations, this.A0L, true).A03);
        }
        return iA05;
    }

    private long A02(FB fb, long j2) throws C05699z {
        return A03(fb, j2, this.A0K.A0H() != this.A0K.A0I());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long A03(com.facebook.ads.redexgen.X.FB r11, long r12, boolean r14) throws com.facebook.ads.redexgen.X.C05699z {
        /*
            r10 = this;
            r10.A0H()
            r5 = 0
            r10.A09 = r5
            r6 = 2
            r10.A0O(r6)
            com.facebook.ads.redexgen.X.AH r0 = r10.A0K
            com.facebook.ads.redexgen.X.AF r1 = r0.A0H()
            r3 = r1
        L11:
            if (r3 == 0) goto L1e
            boolean r0 = r10.A0u(r11, r12, r3)
            if (r0 == 0) goto Lbf
            com.facebook.ads.redexgen.X.AH r0 = r10.A0K
            r0.A0T(r3)
        L1e:
            if (r1 != r3) goto L22
            if (r14 == 0) goto L6f
        L22:
            com.facebook.ads.redexgen.X.Y0[] r9 = r10.A0C
            int r8 = r9.length
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0629Cu.A0W
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 18
            if (r1 == r0) goto L38
        L32:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L38:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W
            java.lang.String r1 = "MfZ5b0v7S5HL"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "MfZ5b0v7S5HL"
            r0 = 4
            r2[r0] = r1
            r7 = 0
        L45:
            if (r7 >= r8) goto L6a
            r4 = r9[r7]
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0629Cu.A0W
            r0 = 6
            r1 = r1[r0]
            r0 = 23
            char r1 = r1.charAt(r0)
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 == r0) goto L32
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W
            java.lang.String r1 = "gre2iAEzIfwakAGQE6Y0w4gvRDGAgj"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "gre2iAEzIfwakAGQE6Y0w4gvRDGAgj"
            r0 = 4
            r2[r0] = r1
            r10.A0c(r4)
            int r7 = r7 + 1
            goto L45
        L6a:
            com.facebook.ads.redexgen.X.Y0[] r0 = new com.facebook.ads.redexgen.X.Y0[r5]
            r10.A0C = r0
            r1 = 0
        L6f:
            if (r3 == 0) goto Lb5
            r10.A0W(r1)
            boolean r4 = r3.A05
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W
            r0 = 1
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L32
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W
            java.lang.String r1 = "xpv6IUpjcorvZnU437"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "xpv6IUpjcorvZnU437"
            r0 = 5
            r2[r0] = r1
            if (r4 == 0) goto La9
            com.facebook.ads.redexgen.X.aF r0 = r3.A08
            long r12 = r0.ACq(r12)
            com.facebook.ads.redexgen.X.aF r5 = r3.A08
            long r3 = r10.A0D
            long r1 = r12 - r3
            boolean r0 = r10.A0S
            r5.A4n(r1, r0)
        La9:
            r10.A0Q(r12)
            r10.A09()
        Laf:
            com.facebook.ads.redexgen.X.IZ r0 = r10.A0Q
            r0.ACs(r6)
            return r12
        Lb5:
            com.facebook.ads.redexgen.X.AH r1 = r10.A0K
            r0 = 1
            r1.A0P(r0)
            r10.A0Q(r12)
            goto Laf
        Lbf:
            com.facebook.ads.redexgen.X.AH r0 = r10.A0K
            com.facebook.ads.redexgen.X.AF r3 = r0.A0D()
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0629Cu.A03(com.facebook.ads.redexgen.X.FB, long, boolean):long");
    }

    private Pair<Integer, Long> A04(A8 a8, boolean z) {
        int iA01;
        AbstractC0573Ae abstractC0573Ae = this.A05.A03;
        AbstractC0573Ae abstractC0573Ae2 = a8.A02;
        if (abstractC0573Ae.A0F()) {
            return null;
        }
        if (abstractC0573Ae2.A0F()) {
            abstractC0573Ae2 = abstractC0573Ae;
        }
        try {
            Pair<Integer, Long> pairA08 = abstractC0573Ae2.A08(this.A0M, this.A0L, a8.A00, a8.A01);
            if (abstractC0573Ae == abstractC0573Ae2) {
                return pairA08;
            }
            int iA05 = abstractC0573Ae.A05(abstractC0573Ae2.A0B(((Integer) pairA08.first).intValue(), this.A0L, true).A03);
            if (iA05 != -1) {
                Integer numValueOf = Integer.valueOf(iA05);
                Object obj = pairA08.second;
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[4] = "NzmvKaw5D7qN";
                strArr[4] = "NzmvKaw5D7qN";
                return Pair.create(numValueOf, obj);
            }
            if (!z || (iA01 = A01(((Integer) pairA08.first).intValue(), abstractC0573Ae2, abstractC0573Ae)) == -1) {
                return null;
            }
            int i2 = abstractC0573Ae.A0A(iA01, this.A0L).A00;
            String[] strArr2 = A0W;
            if (strArr2[1].charAt(27) == strArr2[2].charAt(27)) {
                return A05(abstractC0573Ae, i2, -9223372036854775807L);
            }
            String[] strArr3 = A0W;
            strArr3[4] = "Yw40DLhiFndXC7wfBusX4OUMnHZHVu";
            strArr3[4] = "Yw40DLhiFndXC7wfBusX4OUMnHZHVu";
            return A05(abstractC0573Ae, i2, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new AD(abstractC0573Ae, a8.A00, a8.A01);
        }
    }

    private Pair<Integer, Long> A05(AbstractC0573Ae abstractC0573Ae, int i2, long j2) {
        return abstractC0573Ae.A08(this.A0M, this.A0L, i2, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07() throws com.facebook.ads.redexgen.X.C05699z, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0629Cu.A07():void");
    }

    private void A08() {
        A0O(4);
        A0p(false, true, false);
    }

    private void A09() {
        AF afA0G = this.A0K.A0G();
        long jA07 = afA0G.A07();
        if (jA07 == Long.MIN_VALUE) {
            A0l(false);
            return;
        }
        long bufferedDurationUs = jA07 - afA0G.A09(this.A03);
        boolean zADB = this.A0J.ADB(bufferedDurationUs, this.A0G.A6o().A01);
        A0l(zADB);
        if (zADB) {
            long nextLoadPositionUs = this.A03;
            afA0G.A0G(nextLoadPositionUs);
        }
    }

    private void A0A() {
        int i2;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            int i3 = this.A0I.A01;
            if (this.A0I.A03) {
                i2 = this.A0I.A00;
            } else {
                i2 = -1;
            }
            handler.obtainMessage(0, i3, i2, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        AF afA0G = this.A0K.A0G();
        AF afA0I = this.A0K.A0I();
        if (afA0G != null && !afA0G.A06) {
            if (afA0I != null) {
                AF readingPeriodHolder = afA0I.A01;
                if (readingPeriodHolder != afA0G) {
                    return;
                }
            }
            for (Y0 renderer : this.A0C) {
                if (!renderer.A7P()) {
                    return;
                }
            }
            afA0G.A08.A8Z();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0N(this.A03);
        if (this.A0K.A0R()) {
            AG agA0J = this.A0K.A0J(this.A03, this.A05);
            if (agA0J == null) {
                this.A07.A8a();
                return;
            }
            this.A0K.A0L(this.A0U, this.A0N, this.A0J.A5N(), this.A07, this.A05.A03.A0B(agA0J.A04.A02, this.A0L, true).A03, agA0J).ABl(this, agA0J.A03);
            A0l(true);
        }
    }

    private void A0D() {
        A0p(true, true, true);
        this.A0J.AAl();
        A0O(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0E() throws C05699z {
        if (!this.A0K.A0Q()) {
            return;
        }
        float f2 = this.A0G.A6o().A01;
        AF afA0I = this.A0K.A0I();
        boolean z = true;
        for (AF afA0H = this.A0K.A0H(); afA0H != null; afA0H = afA0H.A01) {
            boolean selectionsChangedForReadPeriod = afA0H.A06;
            if (!selectionsChangedForReadPeriod) {
                return;
            }
            if (!afA0H.A0J(f2)) {
                if (afA0H == afA0I) {
                    z = false;
                }
            } else {
                if (z) {
                    AF afA0H2 = this.A0K.A0H();
                    boolean zA0T = this.A0K.A0T(afA0H2);
                    boolean[] zArr = new boolean[this.A0T.length];
                    long jA0C = afA0H2.A0C(this.A05.A0A, zA0T, zArr);
                    A0j(afA0H2.A03, afA0H2.A04);
                    if (this.A05.A00 != 4 && jA0C != this.A05.A0A) {
                        AJ aj = this.A05;
                        this.A05 = aj.A04(aj.A04, jA0C, this.A05.A01);
                        this.A0I.A04(4);
                        A0Q(jA0C);
                    }
                    int i2 = 0;
                    int enabledRendererCount = this.A0T.length;
                    boolean[] zArr2 = new boolean[enabledRendererCount];
                    int i3 = 0;
                    while (true) {
                        Y0[] y0Arr = this.A0T;
                        if (i3 >= y0Arr.length) {
                            this.A05 = this.A05.A05(afA0H2.A03, afA0H2.A04);
                            A0q(zArr2, i2);
                            break;
                        }
                        Y0 y0 = y0Arr[i3];
                        zArr2[i3] = y0.A75() != 0;
                        FY fy = afA0H2.A0A[i3];
                        if (fy != null) {
                            i2++;
                        }
                        if (zArr2[i3]) {
                            FY fyA7A = y0.A7A();
                            int i4 = A0W[4].length();
                            if (i4 == 29) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A0W;
                            strArr[4] = "CIOLNyaJNw";
                            strArr[4] = "CIOLNyaJNw";
                            if (fy != fyA7A) {
                                A0c(y0);
                            } else if (zArr[i3]) {
                                y0.ACe(this.A03);
                            }
                        }
                        i3++;
                    }
                } else {
                    this.A0K.A0T(afA0H);
                    if (afA0H.A06) {
                        afA0H.A0B(Math.max(afA0H.A02.A03, afA0H.A09(this.A03)), false);
                        A0j(afA0H.A03, afA0H.A04);
                    }
                }
                if (this.A05.A00 != 4) {
                    A09();
                    A0J();
                    this.A0Q.ACs(2);
                    return;
                }
                return;
            }
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0s(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws C05699z {
        this.A09 = false;
        this.A0G.A05();
        for (Y0 y0 : this.A0C) {
            y0.start();
        }
    }

    private void A0H() throws C05699z {
        this.A0G.A06();
        for (Y0 y0 : this.A0C) {
            A0d(y0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f1, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f9, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ff, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0200, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0122, code lost:
    
        r8 = r4.A04;
        r7 = r1.A0K.A0E();
        r6 = r7.A04;
        r9 = r7.A08.AC4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
    
        if (com.facebook.ads.redexgen.X.C0629Cu.A0W[4].length() == 29) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0146, code lost:
    
        r3 = com.facebook.ads.redexgen.X.C0629Cu.A0W;
        r3[6] = "vjt4oSs9hMr9NwWN4mwojUjVUYrN8cQ6";
        r3[6] = "vjt4oSs9hMr9NwWN4mwojUjVUYrN8cQ6";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0152, code lost:
    
        if (r9 == (-9223372036854775807L)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0154, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0156, code lost:
    
        r2 = r1.A0T;
        r0 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0159, code lost:
    
        if (r5 >= r0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015b, code lost:
    
        r4 = r2[r5];
        r0 = r8.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0161, code lost:
    
        if (r0 != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0163, code lost:
    
        r5 = r5 + 1;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0167, code lost:
    
        if (r13 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0169, code lost:
    
        r4.ACy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0171, code lost:
    
        if (r4.A7b() != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0173, code lost:
    
        r12 = r6.A01.A01(r5);
        r11 = r6.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0186, code lost:
    
        if (r1.A0U[r5].A7F() != 5) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0188, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0189, code lost:
    
        r3 = r8.A03[r5];
        r9 = r6.A03;
        r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        if (r2[1].charAt(27) == r2[2].charAt(27)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a3, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W;
        r2[5] = "Ap10Ra2l8gLZ0YRne2";
        r2[5] = "Ap10Ra2l8gLZ0YRne2";
        r0 = r9[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b1, code lost:
    
        if (r11 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b7, code lost:
    
        if (r0.equals(r3) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b9, code lost:
    
        if (r10 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bb, code lost:
    
        r3 = A0w(r12);
        r9 = r7.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cd, code lost:
    
        if (com.facebook.ads.redexgen.X.C0629Cu.A0W[3].charAt(0) == 'c') goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cf, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W;
        r2[5] = "P6QWonkpaKbLAx4pgk";
        r2[5] = "P6QWonkpaKbLAx4pgk";
        r4.ACV(r3, r9[r5], r7.A08());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e6, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e8, code lost:
    
        r4.ACy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ed, code lost:
    
        if (r9 == (-9223372036854775807L)) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0I() throws com.facebook.ads.redexgen.X.C05699z, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0629Cu.A0I():void");
    }

    private void A0J() throws C05699z {
        if (!this.A0K.A0Q()) {
            return;
        }
        AF afA0H = this.A0K.A0H();
        long jAC4 = afA0H.A08.AC4();
        if (jAC4 != -9223372036854775807L) {
            A0Q(jAC4);
            long periodPositionUs = this.A05.A0A;
            if (jAC4 != periodPositionUs) {
                AJ aj = this.A05;
                this.A05 = aj.A04(aj.A04, jAC4, this.A05.A01);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long jA09 = afA0H.A09(this.A03);
            A0R(this.A05.A0A, jA09);
            this.A05.A0A = jA09;
        }
        this.A05.A09 = this.A0C.length == 0 ? afA0H.A02.A01 : afA0H.A0D(true);
    }

    private void A0M(float f2) {
        for (AF afA0F = this.A0K.A0F(); afA0F != null; afA0F = afA0F.A01) {
            if (afA0F.A04 != null) {
                for (HT trackSelection : afA0F.A04.A01.A02()) {
                    if (trackSelection != null) {
                        trackSelection.AAW(f2);
                    }
                }
            }
        }
    }

    private void A0N(int i2) throws C05699z {
        this.A02 = i2;
        if (!this.A0K.A0S(i2)) {
            A0k(true);
        }
    }

    private void A0O(int i2) {
        if (this.A05.A00 != i2) {
            this.A05 = this.A05.A02(i2);
        }
    }

    private void A0P(int i2, boolean z, int i3) throws C05699z {
        AF afA0H = this.A0K.A0H();
        Y0 y0 = this.A0T[i2];
        this.A0C[i3] = y0;
        if (y0.A75() == 0) {
            AY ay = afA0H.A04.A03[i2];
            Format[] formatArrA0w = A0w(afA0H.A04.A01.A01(i2));
            boolean z2 = this.A08 && this.A05.A00 == 3;
            y0.A4u(ay, formatArrA0w, afA0H.A0A[i2], this.A03, !z && z2, afA0H.A08());
            this.A0G.A09(y0);
            if (z2) {
                y0.start();
            }
        }
    }

    private void A0Q(long j2) throws C05699z {
        if (this.A0K.A0Q()) {
            AF afA0H = this.A0K.A0H();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[0] = "3Dp2X759xi1gKy2gc8ykMJ";
            strArr[7] = "GcHSrS1OF4oxjH6XmPjhKR";
            j2 = afA0H.A0A(j2);
        }
        this.A03 = j2;
        this.A0G.A07(this.A03);
        for (Y0 y0 : this.A0C) {
            y0.ACe(this.A03);
        }
    }

    private void A0R(long j2, long j3) throws C05699z {
        A6 a6;
        A6 a62;
        if (this.A0R.isEmpty() || this.A05.A04.A02()) {
            return;
        }
        if (this.A05.A02 == j2) {
            j2--;
        }
        int i2 = this.A05.A04.A02;
        int i3 = this.A00;
        if (i3 > 0) {
            a6 = this.A0R.get(i3 - 1);
        } else {
            a6 = null;
        }
        while (a6 != null) {
            if (a6.A00 <= i2) {
                int i4 = a6.A00;
                if (A0W[3].charAt(0) == 'c') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[0] = "ZbbXGQ7fBHqOH9bFx5EieA";
                strArr[7] = "wqQaVgv9yDX8FIaCovLxd4";
                if (i4 != i2 || a6.A01 <= j2) {
                    break;
                }
            }
            this.A00--;
            int i5 = this.A00;
            a6 = i5 > 0 ? this.A0R.get(i5 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            a62 = this.A0R.get(this.A00);
        } else {
            a62 = null;
        }
        while (a62 != null && a62.A02 != null && (a62.A00 < i2 || (a62.A00 == i2 && a62.A01 <= j2))) {
            this.A00++;
            a62 = this.A00 < this.A0R.size() ? this.A0R.get(this.A00) : null;
        }
        while (a62 != null && a62.A02 != null && a62.A00 == i2 && a62.A01 > j2 && a62.A01 <= j3) {
            A0a(a62.A03);
            if (a62.A03.A0B() || a62.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            a62 = this.A00 < this.A0R.size() ? this.A0R.get(this.A00) : null;
        }
    }

    private void A0S(long j2, long j3) {
        this.A0Q.ACQ(2);
        this.A0Q.ACt(2, j2 + j3);
    }

    private void A0T(A5 a5) throws C05699z {
        Object playingPeriodUid;
        if (a5.A01 != this.A07) {
            return;
        }
        AbstractC0573Ae abstractC0573Ae = this.A05.A03;
        AbstractC0573Ae abstractC0573Ae2 = a5.A00;
        Object manifest = a5.A02;
        this.A0K.A0O(abstractC0573Ae2);
        this.A05 = this.A05.A03(abstractC0573Ae2, manifest);
        A0F();
        int i2 = this.A01;
        if (i2 > 0) {
            this.A0I.A03(i2);
            this.A01 = 0;
            A8 a8 = this.A04;
            if (a8 != null) {
                Pair<Integer, Long> pairA04 = A04(a8, true);
                this.A04 = null;
                if (pairA04 == null) {
                    A08();
                    return;
                }
                int iIntValue = ((Integer) pairA04.first).intValue();
                long jLongValue = ((Long) pairA04.second).longValue();
                FB fbA0M = this.A0K.A0M(iIntValue, jLongValue);
                this.A05 = this.A05.A04(fbA0M, fbA0M.A02() ? 0L : jLongValue, jLongValue);
                return;
            }
            if (this.A05.A02 != -9223372036854775807L) {
                return;
            }
            boolean zA0F = abstractC0573Ae2.A0F();
            String[] strArr = A0W;
            if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "lH2oXw2RUPBHBuRA0";
            strArr2[4] = "lH2oXw2RUPBHBuRA0";
            if (zA0F) {
                A08();
                return;
            }
            Pair<Integer, Long> pairA05 = A05(abstractC0573Ae2, abstractC0573Ae2.A06(this.A0B), -9223372036854775807L);
            int iIntValue2 = ((Integer) pairA05.first).intValue();
            long jLongValue2 = ((Long) pairA05.second).longValue();
            FB fbA0M2 = this.A0K.A0M(iIntValue2, jLongValue2);
            this.A05 = this.A05.A04(fbA0M2, fbA0M2.A02() ? 0L : jLongValue2, jLongValue2);
            return;
        }
        int i3 = this.A05.A04.A02;
        long j2 = this.A05.A01;
        if (abstractC0573Ae.A0F()) {
            if (!abstractC0573Ae2.A0F()) {
                FB fbA0M3 = this.A0K.A0M(i3, j2);
                this.A05 = this.A05.A04(fbA0M3, fbA0M3.A02() ? 0L : j2, j2);
                return;
            }
            return;
        }
        AF afA0F = this.A0K.A0F();
        if (afA0F == null) {
            C0571Ac c0571Ac = this.A0L;
            if (A0W[3].charAt(0) != 'c') {
                String[] strArr3 = A0W;
                strArr3[0] = "AIgzGczszMkheYOO0l2WDA";
                strArr3[7] = "AQm6fITMTu1q9a2hy8bL0W";
                playingPeriodUid = abstractC0573Ae.A0B(i3, c0571Ac, true).A03;
            } else {
                String[] strArr4 = A0W;
                strArr4[6] = "kxPd1uECtZJZCmNWUxsBgkB7loYAAl3C";
                strArr4[6] = "kxPd1uECtZJZCmNWUxsBgkB7loYAAl3C";
                playingPeriodUid = abstractC0573Ae.A0B(i3, c0571Ac, true).A03;
            }
        } else {
            playingPeriodUid = afA0F.A09;
        }
        int iA05 = abstractC0573Ae2.A05(playingPeriodUid);
        if (iA05 == -1) {
            int iA01 = A01(i3, abstractC0573Ae, abstractC0573Ae2);
            if (iA01 == -1) {
                A08();
                return;
            }
            Pair<Integer, Long> pairA052 = A05(abstractC0573Ae2, abstractC0573Ae2.A0A(iA01, this.A0L).A00, -9223372036854775807L);
            int iIntValue3 = ((Integer) pairA052.first).intValue();
            long jLongValue3 = ((Long) pairA052.second).longValue();
            FB fbA0M4 = this.A0K.A0M(iIntValue3, jLongValue3);
            abstractC0573Ae2.A0B(iIntValue3, this.A0L, true);
            if (afA0F != null) {
                Object obj = this.A0L.A03;
                afA0F.A02 = afA0F.A02.A00(-1);
                while (afA0F.A01 != null) {
                    afA0F = afA0F.A01;
                    if (afA0F.A09.equals(obj)) {
                        afA0F.A02 = this.A0K.A0K(afA0F.A02, iIntValue3);
                    } else {
                        afA0F.A02 = afA0F.A02.A00(-1);
                    }
                }
            }
            this.A05 = this.A05.A04(fbA0M4, A02(fbA0M4, fbA0M4.A02() ? 0L : jLongValue3), jLongValue3);
            return;
        }
        if (iA05 != i3) {
            AJ ajA01 = this.A05.A01(iA05);
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0W;
            strArr5[4] = "bxSLNYRWzgoGTszax8Z4I";
            strArr5[4] = "bxSLNYRWzgoGTszax8Z4I";
            this.A05 = ajA01;
        }
        FB fb = this.A05.A04;
        if (fb.A02()) {
            FB fbA0M5 = this.A0K.A0M(iA05, j2);
            if (!fbA0M5.equals(fb)) {
                this.A05 = this.A05.A04(fbA0M5, A02(fbA0M5, fbA0M5.A02() ? 0L : j2), j2);
                return;
            }
        }
        if (!this.A0K.A0V(fb, this.A03)) {
            A0k(false);
        }
    }

    private void A0U(A8 a8) throws Throwable {
        long jLongValue;
        FB fbA0M;
        long jLongValue2;
        boolean z;
        this.A0I.A03(1);
        Pair<Integer, Long> pairA04 = A04(a8, true);
        try {
            try {
                if (pairA04 == null) {
                    fbA0M = new FB(A00());
                    jLongValue2 = -9223372036854775807L;
                    jLongValue = -9223372036854775807L;
                    z = true;
                } else {
                    int iIntValue = ((Integer) pairA04.first).intValue();
                    jLongValue = ((Long) pairA04.second).longValue();
                    fbA0M = this.A0K.A0M(iIntValue, jLongValue);
                    if (fbA0M.A02()) {
                        jLongValue2 = 0;
                        String[] strArr = A0W;
                        if (strArr[0].length() == strArr[7].length()) {
                            String[] strArr2 = A0W;
                            strArr2[3] = "i2wx9svvSsraq7xK4Hb6P8jzWPWvECua";
                            strArr2[3] = "i2wx9svvSsraq7xK4Hb6P8jzWPWvECua";
                            z = true;
                        }
                        throw new RuntimeException();
                    }
                    jLongValue2 = ((Long) pairA04.second).longValue();
                    z = a8.A01 == -9223372036854775807L;
                }
                if (this.A07 != null && this.A01 <= 0) {
                    try {
                        if (jLongValue2 != -9223372036854775807L) {
                            long jA5K = jLongValue2;
                            if (fbA0M.equals(this.A05.A04)) {
                                AF afA0H = this.A0K.A0H();
                                String[] strArr3 = A0W;
                                if (strArr3[0].length() == strArr3[7].length()) {
                                    String[] strArr4 = A0W;
                                    strArr4[3] = "hQgZLd0P1yiuMRtM5yatEhywmfTa4Rur";
                                    strArr4[3] = "hQgZLd0P1yiuMRtM5yatEhywmfTa4Rur";
                                    if (afA0H != null && jA5K != 0) {
                                        jA5K = afA0H.A08.A5K(jA5K, this.A06);
                                    }
                                    if (C05639t.A01(jA5K) == C05639t.A01(this.A05.A0A)) {
                                        this.A05 = this.A05.A04(fbA0M, this.A05.A0A, jLongValue);
                                        if (z) {
                                            this.A0I.A04(2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            long jA02 = A02(fbA0M, jA5K);
                            z |= jLongValue2 != jA02;
                            jLongValue2 = jA02;
                        } else {
                            A0O(4);
                            A0p(false, true, false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.A05 = this.A05.A04(fbA0M, jLongValue2, jLongValue);
                        if (z) {
                            this.A0I.A04(2);
                        }
                        throw th;
                    }
                } else {
                    this.A04 = a8;
                }
                this.A05 = this.A05.A04(fbA0M, jLongValue2, jLongValue);
                if (z) {
                    this.A0I.A04(2);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void A0W(@Nullable AF af) throws C05699z {
        AF afA0H = this.A0K.A0H();
        if (afA0H == null || af == afA0H) {
            return;
        }
        int i2 = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i3 = 0;
        while (true) {
            Y0[] y0Arr = this.A0T;
            if (i3 >= y0Arr.length) {
                break;
            }
            Y0 y0 = y0Arr[i3];
            zArr[i3] = y0.A75() != 0;
            if (afA0H.A04.A00(i3)) {
                i2++;
            }
            if (zArr[i3] && (!afA0H.A04.A00(i3) || (y0.A7b() && y0.A7A() == af.A0A[i3]))) {
                A0c(y0);
            }
            i3++;
        }
        AJ aj = this.A05;
        if (A0W[6].charAt(23) == 'j') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[0] = "YeyTuc4hJN2cviDoFTSuVw";
        strArr[7] = "y3cCzPpceybwtUTWhAu8hu";
        this.A05 = aj.A05(afA0H.A03, afA0H.A04);
        A0q(zArr, i2);
    }

    private void A0X(AK ak) {
        this.A0G.AD6(ak);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Y(AV av) throws C05699z {
        if (av.A0D()) {
            return;
        }
        try {
            av.A04().A7M(av.A00(), av.A09());
        } finally {
            av.A0A(true);
        }
    }

    private void A0Z(AV av) throws C05699z {
        if (av.A02() == -9223372036854775807L) {
            A0a(av);
            return;
        }
        if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new A6(av));
            return;
        }
        A6 a6 = new A6(av);
        if (A0s(a6)) {
            ArrayList<A6> arrayList = this.A0R;
            String[] strArr = A0W;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[6] = "bdowkwDe22b4JBVUMCxt2Emm6YTTpUJh";
            strArr2[6] = "bdowkwDe22b4JBVUMCxt2Emm6YTTpUJh";
            arrayList.add(a6);
            Collections.sort(this.A0R);
            return;
        }
        av.A0A(false);
    }

    private void A0a(AV av) throws C05699z {
        if (av.A03().getLooper() == this.A0Q.A6X()) {
            A0Y(av);
            if (this.A05.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.ACs(2);
                return;
            }
            return;
        }
        this.A0Q.A8i(15, av).sendToTarget();
    }

    private void A0b(AV av) {
        av.A03().post(new A4(this, av));
    }

    private void A0c(Y0 y0) throws C05699z {
        this.A0G.A08(y0);
        A0d(y0);
        y0.A4l();
    }

    private void A0d(Y0 y0) throws C05699z {
        if (y0.A75() == 2) {
            y0.stop();
        }
    }

    private void A0e(C0570Aa c0570Aa) {
        this.A06 = c0570Aa;
    }

    private void A0f(InterfaceC1228aF interfaceC1228aF) {
        if (!this.A0K.A0U(interfaceC1228aF)) {
            return;
        }
        this.A0K.A0N(this.A03);
        A09();
    }

    private void A0g(InterfaceC1228aF interfaceC1228aF) throws C05699z {
        if (!this.A0K.A0U(interfaceC1228aF)) {
            return;
        }
        AF afA0G = this.A0K.A0G();
        afA0G.A0F(this.A0G.A6o().A01);
        A0j(afA0G.A03, afA0G.A04);
        if (!this.A0K.A0Q()) {
            A0Q(this.A0K.A0D().A02.A03);
            A0W(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.FZ
    /* JADX INFO: renamed from: A0h, reason: merged with bridge method [inline-methods] */
    public final void A9J(InterfaceC1228aF interfaceC1228aF) {
        this.A0Q.A8i(10, interfaceC1228aF).sendToTarget();
    }

    private void A0i(FD fd, boolean z, boolean z2) {
        this.A01++;
        A0p(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = fd;
        A0O(2);
        fd.ABo(this.A0H, true, this);
        this.A0Q.ACs(2);
    }

    private void A0j(TrackGroupArray trackGroupArray, HX hx) {
        this.A0J.ABA(this.A0T, trackGroupArray, hx.A01);
    }

    private void A0k(boolean z) throws C05699z {
        FB fb = this.A0K.A0H().A02.A04;
        long jA03 = A03(fb, this.A05.A0A, true);
        long newPositionUs = this.A05.A0A;
        if (jA03 != newPositionUs) {
            AJ aj = this.A05;
            this.A05 = aj.A04(fb, jA03, aj.A01);
            if (z) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0l(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0m(boolean z) throws C05699z {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
            return;
        }
        if (this.A05.A00 == 3) {
            A0G();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[6] = "X2QfJ1e23pCpGilE5nvaFXYxLnWx3Vax";
            strArr[6] = "X2QfJ1e23pCpGilE5nvaFXYxLnWx3Vax";
            this.A0Q.ACs(2);
            return;
        }
        if (this.A05.A00 != 2) {
            return;
        }
        this.A0Q.ACs(2);
    }

    private void A0n(boolean z) throws C05699z {
        this.A0B = z;
        if (!this.A0K.A0W(z)) {
            A0k(true);
        }
    }

    private void A0o(boolean z, boolean z2) {
        A0p(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.AB4();
        A0O(1);
    }

    private void A0p(boolean z, boolean z2, boolean z3) {
        Object obj;
        FB fb;
        TrackGroupArray trackGroupArray;
        HX hx;
        FD fd;
        this.A0Q.ACQ(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (Y0 renderer : this.A0C) {
            try {
                A0c(renderer);
            } catch (C05699z | RuntimeException e2) {
                Log.e(A06(0, 21, 15), A06(138, 12, 123), e2);
            }
        }
        this.A0C = new Y0[0];
        AH ah = this.A0K;
        String[] strArr = A0W;
        if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "2WNzaDjkqcOaPFAy0QOPwI";
        strArr2[7] = "unAKX8spYNQMyMddShLfR5";
        ah.A0P(!z2);
        A0l(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0O(AbstractC0573Ae.A01);
            for (A6 a6 : this.A0R) {
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0W;
                strArr3[6] = "oYGfQB8mGDj6jmVX6XAe4nZE0DoRm7Og";
                strArr3[6] = "oYGfQB8mGDj6jmVX6XAe4nZE0DoRm7Og";
                a6.A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AbstractC0573Ae abstractC0573Ae = z3 ? AbstractC0573Ae.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        if (!z2) {
            fb = this.A05.A04;
        } else {
            fb = new FB(A00());
        }
        long j2 = z2 ? -9223372036854775807L : this.A05.A0A;
        long j3 = z2 ? -9223372036854775807L : this.A05.A01;
        int i2 = this.A05.A00;
        if (z3) {
            trackGroupArray = TrackGroupArray.A04;
        } else {
            AJ aj = this.A05;
            if (A0W[5].length() != 18) {
                trackGroupArray = aj.A05;
            } else {
                String[] strArr4 = A0W;
                strArr4[1] = "udHBd6VluCWpjwypGpbQkm44C5lEXr7W";
                strArr4[2] = "ikIjUWR3chEMULYYaopllYxVSgtPleKx";
                trackGroupArray = aj.A05;
            }
        }
        if (z3) {
            hx = this.A0O;
        } else {
            hx = this.A05.A06;
        }
        this.A05 = new AJ(abstractC0573Ae, obj, fb, j2, j3, i2, false, trackGroupArray, hx);
        if (z && (fd = this.A07) != null) {
            fd.ACN(this);
            this.A07 = null;
        }
    }

    private void A0q(boolean[] zArr, int i2) throws C05699z {
        this.A0C = new Y0[i2];
        int enabledRendererCount = 0;
        AF afA0H = this.A0K.A0H();
        for (int i3 = 0; i3 < this.A0T.length; i3++) {
            if (afA0H.A04.A00(i3)) {
                A0P(i3, zArr[i3], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A0r() {
        AF afA0H = this.A0K.A0H();
        long j2 = afA0H.A02.A01;
        return j2 == -9223372036854775807L || this.A05.A0A < j2 || (afA0H.A01 != null && (afA0H.A01.A06 || afA0H.A01.A02.A04.A02()));
    }

    private boolean A0s(A6 a6) {
        if (a6.A02 == null) {
            Pair<Integer, Long> pairA04 = A04(new A8(a6.A03.A08(), a6.A03.A01(), C05639t.A00(a6.A03.A02())), false);
            if (pairA04 == null) {
                return false;
            }
            a6.A01(((Integer) pairA04.first).intValue(), ((Long) pairA04.second).longValue(), this.A05.A03.A0B(((Integer) pairA04.first).intValue(), this.A0L, true).A03);
        } else {
            int iA05 = this.A05.A03.A05(a6.A02);
            if (iA05 == -1) {
                return false;
            }
            a6.A00 = iA05;
        }
        return true;
    }

    private boolean A0t(Y0 y0) {
        AF afA0I = this.A0K.A0I();
        return afA0I.A01 != null && afA0I.A01.A06 && y0.A7P();
    }

    private boolean A0u(FB fb, long j2, AF af) {
        if (fb.equals(af.A02.A04) && af.A06) {
            this.A05.A03.A0A(af.A02.A04.A02, this.A0L);
            int iA04 = this.A0L.A04(j2);
            if (iA04 == -1 || this.A0L.A09(iA04) == af.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[PHI: r3
  0x006f: PHI (r3v2 long) = (r3v1 long), (r3v4 long) binds: [B:25:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0v(boolean r8) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.Y0[] r0 = r7.A0C
            int r0 = r0.length
            if (r0 != 0) goto La
            boolean r0 = r7.A0r()
            return r0
        La:
            r6 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L23
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L23:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W
            java.lang.String r1 = "XitCw2lYTMNoWfZ3MNfhmS"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "pjSmPGutCkFid20LDJR8Tk"
            r0 = 7
            r2[r0] = r1
            if (r8 != 0) goto L32
            return r6
        L32:
            com.facebook.ads.redexgen.X.AJ r0 = r7.A05
            boolean r0 = r0.A08
            r3 = 1
            if (r0 != 0) goto L3a
            return r3
        L3a:
            com.facebook.ads.redexgen.X.AH r0 = r7.A0K
            com.facebook.ads.redexgen.X.AF r5 = r0.A0G()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W
            r0 = 1
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L8a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W
            java.lang.String r1 = "c9QtbAseiMx42ehTAZ"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "c9QtbAseiMx42ehTAZ"
            r0 = 5
            r2[r0] = r1
            com.facebook.ads.redexgen.X.AG r0 = r5.A02
            boolean r0 = r0.A05
            r0 = r0 ^ r3
            long r3 = r5.A0D(r0)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L88
        L6f:
            com.facebook.ads.redexgen.X.AE r2 = r7.A0J
            long r0 = r7.A03
            long r0 = r5.A09(r0)
            long r3 = r3 - r0
            com.facebook.ads.redexgen.X.Xu r0 = r7.A0G
            com.facebook.ads.redexgen.X.AK r0 = r0.A6o()
            float r1 = r0.A01
            boolean r0 = r7.A09
            boolean r0 = r2.ADE(r3, r1, r0)
            if (r0 == 0) goto L89
        L88:
            r6 = 1
        L89:
            return r6
        L8a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0629Cu.A0W
            java.lang.String r1 = "5BPuibQqZ5NKjWZyuTION1z1lHkA3o6b"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "lue4BzZmQF8ChJf2GK4Pk4NwU097v1o6"
            r0 = 2
            r2[r0] = r1
            com.facebook.ads.redexgen.X.AG r0 = r5.A02
            boolean r0 = r0.A05
            r0 = r0 ^ r3
            long r3 = r5.A0D(r0)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L88
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0629Cu.A0v(boolean):boolean");
    }

    @NonNull
    public static Format[] A0w(HT ht) {
        int length = ht != null ? ht.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i2 = 0; i2 < length; i2++) {
            formatArr[i2] = ht.A6M(i2);
            if (A0W[3].charAt(0) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[1] = "cHoAaTwhCyKnC5gIlgOheFkD17ImOLE4";
            strArr[2] = "NdVO49IoL7wvUQC4on3mokgCd3AJvc50";
        }
        return formatArr;
    }

    public final Looper A0x() {
        return this.A0F.getLooper();
    }

    public final synchronized void A0y() {
        if (this.A0A) {
            return;
        }
        this.A0Q.ACs(7);
        boolean z = false;
        while (!this.A0A) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        if (A0W[3].charAt(0) == 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[5] = "ci8xVCbgf6WZorAiSg";
        strArr[5] = "ci8xVCbgf6WZorAiSg";
    }

    public final void A0z(AbstractC0573Ae abstractC0573Ae, int i2, long j2) {
        this.A0Q.A8i(3, new A8(abstractC0573Ae, i2, j2)).sendToTarget();
    }

    public final void A10(FD fd, boolean z, boolean z2) {
        this.A0Q.A8h(0, z ? 1 : 0, z2 ? 1 : 0, fd).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.A8g(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A12(boolean z) {
        this.A0Q.A8g(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05669w
    public final void AAV(AK ak) {
        this.A0E.obtainMessage(1, ak).sendToTarget();
        A0M(ak.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1227aE
    public final void AAd(InterfaceC1228aF interfaceC1228aF) {
        this.A0Q.A8i(9, interfaceC1228aF).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.FC
    public final void AAz(FD fd, AbstractC0573Ae abstractC0573Ae, Object obj) {
        this.A0Q.A8i(8, new A5(fd, abstractC0573Ae, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.AT
    public final synchronized void ACu(AV av) {
        if (this.A0A) {
            Log.w(A06(0, 21, 15), A06(50, 37, 50));
            av.A0A(false);
        } else {
            this.A0Q.A8i(14, av).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String strA06 = A06(0, 21, 15);
        try {
            switch (message.what) {
                case 0:
                    A0i((FD) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0m(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0U((A8) message.obj);
                    break;
                case 4:
                    A0X((AK) message.obj);
                    break;
                case 5:
                    A0e((C0570Aa) message.obj);
                    break;
                case 6:
                    A0o(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0T((A5) message.obj);
                    break;
                case 9:
                    A0g((InterfaceC1228aF) message.obj);
                    break;
                case 10:
                    A0f((InterfaceC1228aF) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0N(message.arg1);
                    break;
                case 13:
                    A0n(message.arg1 != 0);
                    break;
                case 14:
                    A0Z((AV) message.obj);
                    break;
                case 15:
                    A0b((AV) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C05699z e2) {
            Log.e(strA06, A06(110, 15, 0), e2);
            A0o(false, false);
            this.A0E.obtainMessage(2, e2).sendToTarget();
            A0A();
        } catch (IOException e3) {
            Log.e(strA06, A06(125, 13, 87), e3);
            A0o(false, false);
            this.A0E.obtainMessage(2, C05699z.A00(e3)).sendToTarget();
            A0A();
        } catch (RuntimeException e4) {
            Log.e(strA06, A06(87, 23, 108), e4);
            A0o(false, false);
            this.A0E.obtainMessage(2, C05699z.A02(e4)).sendToTarget();
            if (A0W[6].charAt(23) == 'j') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[5] = "BLVAUEtDSJNWXrvjpr";
            strArr[5] = "BLVAUEtDSJNWXrvjpr";
            A0A();
        }
        return true;
    }
}
