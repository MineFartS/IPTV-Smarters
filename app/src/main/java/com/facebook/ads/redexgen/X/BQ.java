package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BQ implements InterfaceC1228aF, CH, InterfaceC0749Hs<C1223aA>, InterfaceC0752Hv, FX {
    public static byte[] A0c;
    public static String[] A0d;
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public CO A07;

    @Nullable
    public InterfaceC1227aE A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final F7 A0S;
    public final F8 A0T;
    public final FO A0U;
    public final HZ A0V;
    public final InterfaceC0740Hh A0W;

    @Nullable
    public final String A0b;
    public final C1302bR A0X = new C1302bR(A07(0, 27, 82));
    public final IS A0Y = new IS();
    public final Runnable A0Z = new F5(this);
    public final Runnable A0a = new F6(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public C1229aG[] A0K = new C1229aG[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    static {
        A0C();
        A0B();
    }

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0c, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0d[7].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[2] = "Up";
            strArr[2] = "Up";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 120);
            i5++;
        }
    }

    public static void A0B() {
        A0c = new byte[]{102, 69, 75, 78, 79, 88, DateTimeFieldType.CLOCKHOUR_OF_DAY, 111, 82, 94, 88, 75, 73, 94, 69, 88, 103, 79, 78, 67, 75, 122, 79, 88, 67, 69, 78};
    }

    public static void A0C() {
        A0d = new String[]{"iI0ZOGUFhjVKOFZqbUjTJbzZriBk", "wCM5SpVnQk8vEGvx3xuFkFQnwN8gnHkn", "CC", "sZUrtXRAji2vfBWVwphN9cenOJ8FQWpp", "F506DqgxlNyYyNAR0eHuGAxqIBb0RwxX", "mj8nEZtHpBznvwUNQKJPsV2u1H4", "sYtV3FATfn8NsU7nH3", "hZDPske6mXbyt4vhVom9Ng"};
    }

    public BQ(Uri uri, InterfaceC0740Hh interfaceC0740Hh, CF[] cfArr, int i2, FO fo, F8 f8, HZ hz, @Nullable String str, int i3) {
        this.A0Q = uri;
        this.A0W = interfaceC0740Hh;
        this.A0O = i2;
        this.A0U = fo;
        this.A0T = f8;
        this.A0V = hz;
        this.A0b = str;
        this.A0P = i3;
        this.A0S = new F7(cfArr, this);
        this.A00 = i2 == -1 ? 3 : i2;
        fo.A04();
    }

    private int A00() {
        int iA0D = 0;
        for (C1229aG c1229aG : this.A0K) {
            String[] strArr = A0d;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[3] = "qSOUgbz3JlJaX9UdXA1gn9agrJ83m9Y6";
            strArr2[1] = "wkCF1xtIBevCyUX610AjJpYT598Om9ct";
            iA0D += c1229aG.A0D();
        }
        return iA0D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0749Hs
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int AA4(C1223aA c1223aA, long j2, long j3, IOException iOException) {
        boolean isErrorFatal = A0O(iOException);
        this.A0U.A0I(c1223aA.A03, 1, -1, null, 0, null, c1223aA.A02, this.A03, j2, j3, c1223aA.A00, iOException, isErrorFatal);
        A0F(c1223aA);
        if (isErrorFatal) {
            return 3;
        }
        int iA00 = A00();
        boolean z = iA00 > this.A02;
        if (A0M(c1223aA, iA00)) {
            return z ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        long jMax = Long.MIN_VALUE;
        for (C1229aG c1229aG : this.A0K) {
            if (A0d[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[6] = "ZyGj31aUIwj7oXhThZ";
            strArr[6] = "ZyGj31aUIwj7oXhThZ";
            jMax = Math.max(jMax, c1229aG.A0G());
        }
        return jMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (C1229aG sampleQueue : this.A0K) {
            if (sampleQueue.A0H() == null) {
                return;
            }
        }
        this.A0Y.A02();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A67();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < length) {
                Format formatA0H = this.A0K[i2].A0H();
                trackGroupArr[i2] = new TrackGroup(formatA0H);
                String str = formatA0H.A0O;
                if (!C0761Ie.A0E(str)) {
                    boolean zA0C = C0761Ie.A0C(str);
                    if (A0d[7].length() != 22) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0d;
                    strArr[4] = "sORkCePcQUNrHwPTmIu9z8sBJIN6eDJt";
                    strArr[4] = "sORkCePcQUNrHwPTmIu9z8sBJIN6eDJt";
                    if (!zA0C) {
                        z = false;
                    }
                }
                this.A0N[i2] = z;
                boolean isAudioVideo = this.A0A;
                this.A0A = isAudioVideo | z;
                i2++;
            } else {
                this.A09 = new TrackGroupArray(trackGroupArr);
                if (this.A0O == -1 && this.A05 == -1 && this.A07.A67() == -9223372036854775807L) {
                    this.A00 = 6;
                }
                this.A0F = true;
                this.A0T.AAy(this.A03, this.A07.A7q());
                this.A08.AAd(this);
                return;
            }
        }
    }

    private void A0A() {
        C1223aA c1223aA = new C1223aA(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            IM.A04(A0J());
            long j2 = this.A03;
            if (j2 != -9223372036854775807L && this.A06 >= j2) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            } else {
                c1223aA.A05(this.A07.A6v(this.A06).A00.A00, this.A06);
                this.A06 = -9223372036854775807L;
            }
        }
        this.A02 = A00();
        this.A0U.A0F(c1223aA.A03, 1, -1, null, 0, null, c1223aA.A02, this.A03, this.A0X.A05(c1223aA, this, this.A00));
    }

    private void A0D(int i2) {
        if (!this.A0M[i2]) {
            Format formatA02 = this.A09.A02(i2).A02(0);
            this.A0U.A07(C0761Ie.A01(formatA02.A0O), formatA02, 0, null, this.A04);
            this.A0M[i2] = true;
        }
    }

    private void A0E(int i2) {
        if (!this.A0E || !this.A0N[i2] || this.A0K[i2].A0N()) {
            return;
        }
        this.A06 = 0L;
        this.A0E = false;
        this.A0D = true;
        this.A04 = 0L;
        this.A02 = 0;
        for (C1229aG sampleQueue : this.A0K) {
            sampleQueue.A0J();
        }
        this.A08.A9J(this);
    }

    private void A0F(C1223aA c1223aA) {
        if (this.A05 != -1) {
            return;
        }
        this.A05 = c1223aA.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0749Hs
    /* JADX INFO: renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final void AA3(C1223aA c1223aA, long j2, long j3) {
        if (this.A03 == -9223372036854775807L) {
            long jA02 = A02();
            long largestQueuedTimestampUs = jA02 == Long.MIN_VALUE ? 0L : 10000 + jA02;
            this.A03 = largestQueuedTimestampUs;
            this.A0T.AAy(this.A03, this.A07.A7q());
        }
        this.A0U.A0H(c1223aA.A03, 1, -1, null, 0, null, c1223aA.A02, this.A03, j2, j3, c1223aA.A00);
        A0F(c1223aA);
        this.A0B = true;
        this.A08.A9J(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0749Hs
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final void AA1(C1223aA c1223aA, long j2, long j3, boolean z) {
        this.A0U.A0G(c1223aA.A03, 1, -1, null, 0, null, c1223aA.A02, this.A03, j2, j3, c1223aA.A00);
        if (!z) {
            A0F(c1223aA);
            for (C1229aG c1229aG : this.A0K) {
                c1229aG.A0J();
            }
            if (this.A01 > 0) {
                this.A08.A9J(this);
            }
        }
    }

    private boolean A0J() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0K() {
        if (!this.A0D) {
            boolean zA0J = A0J();
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[7] = "wEe5Kid34hKwvsAXbAWEFW";
            strArr[7] = "wEe5Kid34hKwvsAXbAWEFW";
            if (!zA0J) {
                return false;
            }
        }
        return true;
    }

    private boolean A0L(long j2) {
        int length = this.A0K.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                return true;
            }
            C1229aG sampleQueue = this.A0K[i2];
            sampleQueue.A0K();
            if (!(sampleQueue.A0E(j2, true, false) != -1) && (this.A0N[i2] || !this.A0A)) {
                break;
            }
            i2++;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r7 != (-9223372036854775807L)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0M(com.facebook.ads.redexgen.X.C1223aA r10, int r11) {
        /*
            r9 = this;
            long r1 = r9.A05
            r6 = 1
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L38
            com.facebook.ads.redexgen.X.CO r0 = r9.A07
            if (r0 == 0) goto L41
            long r7 = r0.A67()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BQ.A0d
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L3b
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BQ.A0d
            java.lang.String r1 = "Q0rpoNhjqPePbxzXOOIqRvZr1JNrttpQ"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "Q0rpoNhjqPePbxzXOOIqRvZr1JNrttpQ"
            r0 = 4
            r2[r0] = r1
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L41
        L38:
            r9.A02 = r11
            return r6
        L3b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L41:
            boolean r0 = r9.A0F
            r5 = 0
            if (r0 == 0) goto L6f
            boolean r0 = r9.A0K()
            if (r0 != 0) goto L6f
            r9.A0E = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.BQ.A0d
            r0 = 4
            r1 = r1[r0]
            r0 = 6
            char r1 = r1.charAt(r0)
            r0 = 89
            if (r1 == r0) goto L69
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BQ.A0d
            java.lang.String r1 = "yM"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "yM"
            r0 = 2
            r2[r0] = r1
            return r5
        L69:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6f:
            boolean r0 = r9.A0F
            r9.A0D = r0
            r2 = 0
            r9.A04 = r2
            r9.A02 = r5
            com.facebook.ads.redexgen.X.aG[] r4 = r9.A0K
            int r1 = r4.length
        L7c:
            if (r5 >= r1) goto L86
            r0 = r4[r5]
            r0.A0J()
            int r5 = r5 + 1
            goto L7c
        L86:
            r10.A05(r2, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BQ.A0M(com.facebook.ads.redexgen.X.aA, int):boolean");
    }

    public static boolean A0O(IOException iOException) {
        return iOException instanceof C1235aM;
    }

    public final int A0P(int skipCount, long j2) {
        int iA0E;
        if (A0K()) {
            return 0;
        }
        C1229aG c1229aG = this.A0K[skipCount];
        if (this.A0B && j2 > c1229aG.A0G()) {
            iA0E = c1229aG.A0B();
        } else {
            iA0E = c1229aG.A0E(j2, true, true);
            if (iA0E == -1) {
                iA0E = 0;
            }
        }
        if (iA0E > 0) {
            A0D(skipCount);
        } else {
            A0E(skipCount);
        }
        return iA0E;
    }

    public final int A0Q(int i2, AC ac, YH yh, boolean z) {
        if (A0K()) {
            return -3;
        }
        C1229aG c1229aG = this.A0K[i2];
        boolean z2 = this.A0B;
        long j2 = this.A04;
        if (A0d[6].length() != 18) {
            throw new RuntimeException();
        }
        String[] strArr = A0d;
        strArr[4] = "BZZhA5HnQ267vlJC28K7sY9wv6QGzHwf";
        strArr[4] = "BZZhA5HnQ267vlJC28K7sY9wv6QGzHwf";
        int iA0F = c1229aG.A0F(ac, yh, z, z2, j2);
        if (iA0F == -4) {
            A0D(i2);
        } else if (iA0F == -3) {
            A0E(i2);
        }
        return iA0F;
    }

    public final void A0R() throws IOException {
        this.A0X.A07(this.A00);
    }

    public final void A0S() {
        if (this.A0F) {
            for (C1229aG c1229aG : this.A0K) {
                c1229aG.A0I();
            }
        }
        this.A0X.A08(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A05();
    }

    public final boolean A0T(int i2) {
        return !A0K() && (this.A0B || this.A0K[i2].A0N());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final boolean A4A(long j2) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F) {
            int i2 = this.A01;
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[4] = "7rVHsGRdVZCry1KpVG9eopTEFKGRMHdR";
            strArr[4] = "7rVHsGRdVZCry1KpVG9eopTEFKGRMHdR";
            if (i2 == 0) {
                return false;
            }
        }
        boolean zA03 = this.A0Y.A03();
        if (!this.A0X.A09()) {
            A0A();
            String[] strArr2 = A0d;
            if (strArr2[5].length() != strArr2[0].length()) {
                String[] strArr3 = A0d;
                strArr3[4] = "GZZ8Yg3MT0LKLUTCQO9quz1OXrB3914Q";
                strArr3[4] = "GZZ8Yg3MT0LKLUTCQO9quz1OXrB3914Q";
                return true;
            }
            String[] strArr4 = A0d;
            strArr4[4] = "KAHjzw5ailzTQNPlHwAo2zZrrjfyTj4F";
            strArr4[4] = "KAHjzw5ailzTQNPlHwAo2zZrrjfyTj4F";
            return false;
        }
        return zA03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final void A4n(long j2, boolean z) {
        int length = this.A0K.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.A0K[i2].A0L(j2, z, this.A0L[i2]);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final void A4x() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final long A5K(long j2, C0570Aa c0570Aa) {
        if (!this.A07.A7q()) {
            return 0L;
        }
        CN cnA6v = this.A07.A6v(j2);
        return J1.A0J(j2, c0570Aa, cnA6v.A00.A01, cnA6v.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final long A5Z() {
        long jA02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0J()) {
            long j2 = this.A06;
            if (A0d[6].length() == 18) {
                String[] strArr = A0d;
                strArr[4] = "v1DtQTmxA3FTsqocwnKPSJWZapJDPMlv";
                strArr[4] = "v1DtQTmxA3FTsqocwnKPSJWZapJDPMlv";
                return j2;
            }
        } else {
            if (this.A0A) {
                jA02 = Long.MAX_VALUE;
                if (A0d[6].length() == 18) {
                    String[] strArr2 = A0d;
                    strArr2[7] = "vaKypmx8P8ApWe5d9yUSyn";
                    strArr2[7] = "vaKypmx8P8ApWe5d9yUSyn";
                    int length = this.A0K.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (this.A0N[i2]) {
                            C1229aG c1229aG = this.A0K[i2];
                            String[] strArr3 = A0d;
                            if (strArr3[5].length() == strArr3[0].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr4 = A0d;
                            strArr4[7] = "ClOx81htkGLxdwhy5PY2qE";
                            strArr4[7] = "ClOx81htkGLxdwhy5PY2qE";
                            jA02 = Math.min(jA02, c1229aG.A0G());
                        }
                    }
                }
            } else {
                jA02 = A02();
            }
            return jA02 == Long.MIN_VALUE ? this.A04 : jA02;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final long A6c() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A5Z();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final TrackGroupArray A7E() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final void A8Z() throws IOException {
        A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0752Hv
    public final void AA8() {
        for (C1229aG c1229aG : this.A0K) {
            c1229aG.A0J();
        }
        this.A0S.A04();
    }

    @Override // com.facebook.ads.redexgen.X.FX
    public final void ABF(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final void ABl(InterfaceC1227aE interfaceC1227aE, long j2) {
        this.A08 = interfaceC1227aE;
        this.A0Y.A03();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final long AC4() {
        if (!this.A0C) {
            this.A0U.A06();
            this.A0C = true;
        }
        if (this.A0D) {
            if (this.A0B || A00() > this.A02) {
                this.A0D = false;
                return this.A04;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final void ACC(long j2) {
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final void ACn(CO co) {
        this.A07 = co;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final long ACq(long j2) {
        if (!this.A07.A7q()) {
            j2 = 0;
        }
        this.A04 = j2;
        this.A0D = false;
        if (!A0J() && A0L(j2)) {
            return j2;
        }
        this.A0E = false;
        this.A06 = j2;
        this.A0B = false;
        if (this.A0X.A09()) {
            this.A0X.A06();
        } else {
            for (C1229aG sampleQueue : this.A0K) {
                sampleQueue.A0J();
            }
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long ACr(com.facebook.ads.redexgen.X.HT[] r13, boolean[] r14, com.facebook.ads.redexgen.X.FY[] r15, boolean[] r16, long r17) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BQ.ACr(com.facebook.ads.redexgen.X.HT[], boolean[], com.facebook.ads.redexgen.X.FY[], boolean[], long):long");
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final CR ADb(int i2, int i3) {
        int length = this.A0K.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.A0J[i4] == i2) {
                return this.A0K[i4];
            }
        }
        C1229aG c1229aG = new C1229aG(this.A0V);
        c1229aG.A0M(this);
        this.A0J = Arrays.copyOf(this.A0J, length + 1);
        this.A0J[length] = i2;
        this.A0K = (C1229aG[]) Arrays.copyOf(this.A0K, length + 1);
        this.A0K[length] = c1229aG;
        return c1229aG;
    }
}
