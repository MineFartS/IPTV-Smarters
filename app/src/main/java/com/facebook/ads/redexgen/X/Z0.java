package com.facebook.ads.redexgen.X;

import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z0 implements CF, CO {
    public static byte[] A0J;
    public static String[] A0K;
    public static final CI A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public CH A09;
    public C0768Il A0A;
    public boolean A0B;
    public C0630Cv[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C0768Il A0F;
    public final C0768Il A0G;
    public final C0768Il A0H;
    public final ArrayDeque<C1183Ys> A0I;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{57, 12, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_MINUTE, 88, 11, DateTimeFieldType.HOUR_OF_DAY, 2, 29, 88, DateTimeFieldType.SECOND_OF_DAY, 29, 11, 11, 88, 12, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, DateTimeFieldType.MILLIS_OF_DAY, 88, DateTimeFieldType.CLOCKHOUR_OF_DAY, 29, 25, 28, 29, 10, 88, DateTimeFieldType.SECOND_OF_DAY, 29, DateTimeFieldType.MILLIS_OF_DAY, 31, 12, DateTimeFieldType.CLOCKHOUR_OF_DAY, 88, 80, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.HALFDAY_OF_DAY, 8, 8, DateTimeFieldType.MILLIS_OF_SECOND, 10, 12, 29, 28, 81, 86, 4, 1, 85, 85};
    }

    public static void A08() {
        A0K = new String[]{"0jSfxoXEMfCjtmnyDugkNcQJRjSOySMa", "bnCyjA5DcUmWUqivzOXdDI", "awYt8cnKxKdhDKIItvFTiUYUED9yM0q1", "Luabopmg5NHaS5SoCXeHIbwAQFsLRvJ0", "odfzLqPoxtdmNhQ8QVXSS2", "Wo8IxRBaFRXe4oQbEdt7BomqryNllMGC", "1wQy", "sEQm6Nsu4XqoPKwwi3EdYrJfunZcOKFC"};
    }

    static {
        A08();
        A07();
        A0L = new C1190Yz();
        A0M = J1.A08(A04(48, 4, 105));
    }

    public Z0() {
        this(0);
    }

    public Z0(int i2) {
        this.A0E = i2;
        this.A0F = new C0768Il(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C0768Il(C0764Ih.A03);
        this.A0G = new C0768Il(4);
        this.A06 = -1;
    }

    private int A00(long preferredSkipAmount) {
        long j2 = Long.MAX_VALUE;
        int i2 = 1;
        int i3 = -1;
        long j3 = Long.MAX_VALUE;
        long j4 = Long.MAX_VALUE;
        int trackIndex = 1;
        int sampleIndex = -1;
        int i4 = 0;
        while (true) {
            C0630Cv[] c0630CvArr = this.A0C;
            if (i4 >= c0630CvArr.length) {
                break;
            }
            C0630Cv c0630Cv = c0630CvArr[i4];
            int i5 = c0630Cv.A00;
            if (i5 != c0630Cv.A03.A01) {
                long j5 = c0630Cv.A03.A06[i5];
                long j6 = this.A0D[i4][i5];
                long j7 = j5 - preferredSkipAmount;
                int i6 = (j7 < 0 || j7 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) ? 1 : 0;
                if ((i6 == 0 && i2 != 0) || (i6 == i2 && j7 < j2)) {
                    i2 = i6;
                    j2 = j7;
                    i3 = i4;
                    j3 = j6;
                }
                if (j6 < j4) {
                    j4 = j6;
                    trackIndex = i6;
                    sampleIndex = i4;
                }
            }
            i4++;
        }
        if (A0K[5].charAt(28) != 'l') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[7] = "2rf3IkD44HipF2iEZWYVpECLVHr0uALb";
        strArr[0] = "2zlrhAiZVnIklu1FhIrlCsqVaSaq97eM";
        if (j4 == Long.MAX_VALUE || trackIndex == 0) {
            return i3;
        }
        long sampleOffset = 10485760 + j4;
        return j3 < sampleOffset ? i3 : sampleIndex;
    }

    private int A01(CG cg, CM cm) throws InterruptedException, IOException {
        int i2;
        long jA6p = cg.A6p();
        if (this.A06 == -1) {
            this.A06 = A00(jA6p);
            if (this.A06 == -1) {
                return -1;
            }
        }
        C0630Cv c0630Cv = this.A0C[this.A06];
        CR cr = c0630Cv.A01;
        int i3 = c0630Cv.A00;
        long j2 = c0630Cv.A03.A06[i3];
        int i4 = c0630Cv.A03.A05[i3];
        long inputPosition = j2 - jA6p;
        long position = inputPosition + ((long) this.A04);
        if (position < 0 || position >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            cm.A00 = j2;
            return 1;
        }
        if (c0630Cv.A02.A02 == 1) {
            position += 8;
            i4 -= 8;
        }
        cg.ADJ((int) position);
        if (c0630Cv.A02.A01 != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i5 = c0630Cv.A02.A01;
            int i6 = 4 - c0630Cv.A02.A01;
            while (this.A04 < i4) {
                int i7 = this.A05;
                if (i7 == 0) {
                    byte[] nalLengthData = this.A0G.A00;
                    cg.readFully(nalLengthData, i6, i5);
                    this.A0G.A0Z(0);
                    this.A05 = this.A0G.A0I();
                    this.A0H.A0Z(0);
                    cr.ACh(this.A0H, 4);
                    this.A04 += 4;
                    i4 += i6;
                } else {
                    int writtenBytes = cr.ACg(cg, i7, false);
                    this.A04 += writtenBytes;
                    this.A05 -= writtenBytes;
                }
            }
            i2 = 0;
        } else {
            while (true) {
                int i8 = this.A04;
                if (i8 >= i4) {
                    break;
                }
                int iACg = cr.ACg(cg, i4 - i8, false);
                int writtenBytes2 = this.A04;
                this.A04 = writtenBytes2 + iACg;
                int writtenBytes3 = this.A05;
                this.A05 = writtenBytes3 - iACg;
            }
            i2 = 0;
        }
        cr.ACi(c0630Cv.A03.A07[i3], c0630Cv.A03.A04[i3], i4, 0, null);
        c0630Cv.A00++;
        this.A06 = -1;
        this.A04 = i2;
        this.A05 = i2;
        return i2;
    }

    public static int A02(D4 d4, long j2) {
        int iA00 = d4.A00(j2);
        if (iA00 == -1) {
            return d4.A01(j2);
        }
        return iA00;
    }

    public static long A03(D4 d4, long j2, long j3) {
        int iA02 = A02(d4, j2);
        if (iA02 == -1) {
            return j3;
        }
        return Math.min(d4.A06[iA02], j3);
    }

    private ArrayList<D4> A05(C1183Ys c1183Ys, CJ cj, boolean z) throws AI {
        D1 d1A0C;
        ArrayList<D4> arrayList = new ArrayList<>();
        int i2 = 0;
        while (true) {
            int size = c1183Ys.A01.size();
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "cCqXKTxpaVHnB5xhxhubewm2proDizNi";
            strArr2[0] = "XNMFZPcuybbaYtAFLaJvO7GLnY5oO3YZ";
            if (i2 < size) {
                C1183Ys c1183Ys2 = c1183Ys.A01.get(i2);
                if (((AbstractC0616Cg) c1183Ys2).A00 == AbstractC0616Cg.A1L && (d1A0C = C0621Cl.A0C(c1183Ys2, c1183Ys.A07(AbstractC0616Cg.A0n), -9223372036854775807L, null, z, this.A0B)) != null) {
                    D4 d4A0E = C0621Cl.A0E(d1A0C, c1183Ys2.A06(AbstractC0616Cg.A0d).A06(AbstractC0616Cg.A0h).A06(AbstractC0616Cg.A16), cj);
                    if (d4A0E.A01 != 0) {
                        arrayList.add(d4A0E);
                    }
                }
                i2++;
            } else {
                return arrayList;
            }
        }
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A09(long j2) throws AI {
        while (!this.A0I.isEmpty() && this.A0I.peek().A00 == j2) {
            C1183Ys c1183YsPop = this.A0I.pop();
            if (((AbstractC0616Cg) c1183YsPop).A00 == AbstractC0616Cg.A0j) {
                A0B(c1183YsPop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A08(c1183YsPop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A0A(long j2) {
        for (C0630Cv c0630Cv : this.A0C) {
            D4 d4 = c0630Cv.A03;
            int iA00 = d4.A00(j2);
            if (iA00 == -1) {
                iA00 = d4.A01(j2);
            }
            c0630Cv.A00 = iA00;
        }
    }

    private void A0B(C1183Ys c1183Ys) throws AI {
        ArrayList<D4> arrayListA05;
        int size = -1;
        long jMax = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        CJ cj = new CJ();
        C1184Yt c1184YtA07 = c1183Ys.A07(AbstractC0616Cg.A1P);
        if (c1184YtA07 != null && (metadata = C0621Cl.A0F(c1184YtA07, this.A0B)) != null) {
            cj.A06(metadata);
        }
        boolean ignoreEditLists = (this.A0E & 1) != 0;
        try {
            arrayListA05 = A05(c1183Ys, cj, ignoreEditLists);
        } catch (C1187Yw unused) {
            cj = new CJ();
            arrayListA05 = A05(c1183Ys, cj, true);
        }
        int size2 = arrayListA05.size();
        for (int i2 = 0; i2 < size2; i2++) {
            D4 d4 = arrayListA05.get(i2);
            D1 d1 = d4.A03;
            C0630Cv c0630Cv = new C0630Cv(d1, d4, this.A09.ADb(i2, d1.A03));
            int trackCount = d4.A00 + 30;
            Format formatA0K = d1.A07.A0K(trackCount);
            if (d1.A03 == 1) {
                if (cj.A04()) {
                    formatA0K = formatA0K.A0L(cj.A00, cj.A01);
                }
                if (metadata != null) {
                    formatA0K = formatA0K.A0P(metadata);
                }
            }
            c0630Cv.A01.A5B(formatA0K);
            jMax = Math.max(jMax, d1.A04 != -9223372036854775807L ? d1.A04 : d4.A02);
            int maxInputSize = d1.A03;
            if (maxInputSize == 2 && size == -1) {
                size = arrayList.size();
            }
            arrayList.add(c0630Cv);
        }
        this.A02 = size;
        this.A08 = jMax;
        this.A0C = (C0630Cv[]) arrayList.toArray(new C0630Cv[arrayList.size()]);
        this.A0D = A0H(this.A0C);
        this.A09.A4x();
        this.A09.ACn(this);
    }

    public static boolean A0C(int i2) {
        if (i2 != AbstractC0616Cg.A0j) {
            int i3 = AbstractC0616Cg.A1L;
            String[] strArr = A0K;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "xHWkCkmm9lwx55Xb6ilKRbCBaMi3tx91";
            strArr2[3] = "ufwmFaOIh4ETn2yFiF4b2v05oMaexVS8";
            if (i2 != i3 && i2 != AbstractC0616Cg.A0d && i2 != AbstractC0616Cg.A0h && i2 != AbstractC0616Cg.A16 && i2 != AbstractC0616Cg.A0N) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0D(int i2) {
        if (i2 != AbstractC0616Cg.A0c && i2 != AbstractC0616Cg.A0n && i2 != AbstractC0616Cg.A0V && i2 != AbstractC0616Cg.A1A && i2 != AbstractC0616Cg.A1D && i2 != AbstractC0616Cg.A1B) {
            int i3 = AbstractC0616Cg.A0C;
            if (A0K[1].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[1] = "WjfYMB7jPbcUwDvfNOpuH1";
            strArr[1] = "WjfYMB7jPbcUwDvfNOpuH1";
            if (i2 != i3 && i2 != AbstractC0616Cg.A0O && i2 != AbstractC0616Cg.A19 && i2 != AbstractC0616Cg.A1C && i2 != AbstractC0616Cg.A1E && i2 != AbstractC0616Cg.A17 && i2 != AbstractC0616Cg.A0B && i2 != AbstractC0616Cg.A1J && i2 != AbstractC0616Cg.A0U && i2 != AbstractC0616Cg.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0E(CG cg) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            if (!cg.AC5(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Z(0);
            this.A07 = this.A0F.A0N();
            this.A01 = this.A0F.A09();
        }
        long j2 = this.A07;
        if (j2 == 1) {
            cg.readFully(this.A0F.A00, 8, 8);
            this.A00 += 8;
            this.A07 = this.A0F.A0O();
        } else if (j2 == 0) {
            long jA6W = cg.A6W();
            if (jA6W == -1 && !this.A0I.isEmpty()) {
                jA6W = this.A0I.peek().A00;
            }
            if (jA6W != -1) {
                this.A07 = (jA6W - cg.A6p()) + ((long) this.A00);
            }
        }
        if (this.A07 >= this.A00) {
            if (A0C(this.A01)) {
                long jA6p = (cg.A6p() + this.A07) - ((long) this.A00);
                this.A0I.push(new C1183Ys(this.A01, jA6p));
                if (this.A07 == this.A00) {
                    A09(jA6p);
                } else {
                    A06();
                }
            } else if (A0D(this.A01)) {
                IM.A04(this.A00 == 8);
                IM.A04(this.A07 <= 2147483647L);
                this.A0A = new C0768Il((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new AI(A04(0, 48, 100));
    }

    private boolean A0F(CG cg, CM cm) throws InterruptedException, IOException {
        long j2 = this.A07 - ((long) this.A00);
        long jA6p = cg.A6p() + j2;
        boolean z = false;
        C0768Il c0768Il = this.A0A;
        if (c0768Il != null) {
            cg.readFully(c0768Il.A00, this.A00, (int) j2);
            if (this.A01 == AbstractC0616Cg.A0U) {
                this.A0B = A0G(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new C1184Yt(this.A01, this.A0A));
            }
        } else if (j2 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            cg.ADJ((int) j2);
        } else {
            cm.A00 = cg.A6p() + j2;
            z = true;
        }
        A09(jA6p);
        return z && this.A03 != 2;
    }

    public static boolean A0G(C0768Il c0768Il) {
        c0768Il.A0Z(8);
        if (c0768Il.A09() == A0M) {
            return true;
        }
        c0768Il.A0a(4);
        while (c0768Il.A05() > 0) {
            if (c0768Il.A09() == A0M) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0036 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long[][] A0H(com.facebook.ads.redexgen.X.C0630Cv[] r14) {
        /*
            int r0 = r14.length
            long[][] r6 = new long[r0][]
            int r0 = r14.length
            int[] r5 = new int[r0]
            int r0 = r14.length
            long[] r4 = new long[r0]
            int r0 = r14.length
            boolean[] r3 = new boolean[r0]
            r2 = 0
        Ld:
            int r0 = r14.length
            if (r2 >= r0) goto L28
            r0 = r14[r2]
            com.facebook.ads.redexgen.X.D4 r0 = r0.A03
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r6[r2] = r0
            r0 = r14[r2]
            com.facebook.ads.redexgen.X.D4 r0 = r0.A03
            long[] r1 = r0.A07
            r0 = 0
            r0 = r1[r0]
            r4[r2] = r0
            int r2 = r2 + 1
            goto Ld
        L28:
            r12 = 0
            r2 = 0
        L2b:
            int r0 = r14.length
            if (r2 >= r0) goto L71
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = -1
            r1 = 0
        L35:
            int r0 = r14.length
            if (r1 >= r0) goto L48
            boolean r0 = r3[r1]
            if (r0 != 0) goto L45
            r7 = r4[r1]
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 > 0) goto L45
            r9 = r1
            r10 = r4[r1]
        L45:
            int r1 = r1 + 1
            goto L35
        L48:
            r7 = r5[r9]
            r0 = r6[r9]
            r0[r7] = r12
            r0 = r14[r9]
            com.facebook.ads.redexgen.X.D4 r0 = r0.A03
            int[] r0 = r0.A05
            r0 = r0[r7]
            long r0 = (long) r0
            long r12 = r12 + r0
            r1 = 1
            int r7 = r7 + r1
            r5[r9] = r7
            r0 = r6[r9]
            int r0 = r0.length
            if (r7 >= r0) goto L6c
            r0 = r14[r9]
            com.facebook.ads.redexgen.X.D4 r0 = r0.A03
            long[] r0 = r0.A07
            r0 = r0[r7]
            r4[r9] = r0
            goto L2b
        L6c:
            r3[r9] = r1
            int r2 = r2 + 1
            goto L2b
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Z0.A0H(com.facebook.ads.redexgen.X.Cv[]):long[][]");
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final long A67() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final CN A6v(long secondTimeUs) {
        long j2;
        long jA03;
        int iA01;
        C0630Cv[] c0630CvArr = this.A0C;
        if (c0630CvArr.length == 0) {
            return new CN(CP.A04);
        }
        long j3 = -9223372036854775807L;
        long jA032 = -1;
        int i2 = this.A02;
        if (i2 != -1) {
            D4 d4 = c0630CvArr[i2].A03;
            int iA02 = A02(d4, secondTimeUs);
            if (iA02 == -1) {
                return new CN(CP.A04);
            }
            j2 = d4.A07[iA02];
            jA03 = d4.A06[iA02];
            if (j2 < secondTimeUs) {
                int i3 = d4.A01 - 1;
                if (A0K[5].charAt(28) == 'l') {
                    String[] strArr = A0K;
                    strArr[4] = "wZC6PUUkwbL39FGS7qgHi4";
                    strArr[6] = "ISWp";
                    if (iA02 < i3 && (iA01 = d4.A01(secondTimeUs)) != -1 && iA01 != iA02) {
                        j3 = d4.A07[iA01];
                        jA032 = d4.A06[iA01];
                    }
                }
            }
            throw new RuntimeException();
        }
        j2 = secondTimeUs;
        jA03 = Long.MAX_VALUE;
        int i4 = 0;
        while (true) {
            C0630Cv[] c0630CvArr2 = this.A0C;
            if (A0K[5].charAt(28) != 'l') {
                break;
            }
            String[] strArr2 = A0K;
            strArr2[2] = "HuKpkwhwNffVsg1qOYm34WvQGcpzf7CA";
            strArr2[3] = "OpSxQ7AB5KpfVVm82hohcPrOWAs1xSas";
            if (i4 < c0630CvArr2.length) {
                if (i4 != this.A02) {
                    D4 d42 = c0630CvArr2[i4].A03;
                    jA03 = A03(d42, j2, jA03);
                    if (j3 != -9223372036854775807L) {
                        jA032 = A03(d42, j3, jA032);
                    }
                }
                i4++;
            } else {
                CP cp = new CP(j2, jA03);
                if (j3 == -9223372036854775807L) {
                    return new CN(cp);
                }
                return new CN(cp, new CP(j3, jA032));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A7V(CH ch) {
        this.A09 = ch;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final boolean A7q() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final int AC0(CG cg, CM cm) throws InterruptedException, IOException {
        while (true) {
            int i2 = this.A03;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "qJxbwGisfZf9YKIw0pjhTsx78598m8MK";
            strArr2[0] = "kX2rligkfJBBB9teOSCW5LaSmFhGBJWo";
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return A01(cg, cm);
                    }
                    throw new IllegalStateException();
                }
                if (A0F(cg, cm)) {
                    return 1;
                }
            } else if (!A0E(cg)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void ACm(long j2, long j3) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j2 == 0) {
            A06();
        } else {
            if (this.A0C == null) {
                return;
            }
            A0A(j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final boolean ADK(CG cg) throws InterruptedException, IOException {
        return C0634Cz.A05(cg);
    }
}
