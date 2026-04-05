package com.facebook.ads.redexgen.X;

import com.amazonaws.event.ProgressEvent;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1182Yr implements CF {
    public static byte[] A0E;
    public static String[] A0F;
    public static final CI A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public CH A04;
    public CR A05;
    public InterfaceC1181Yq A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final CJ A0A;
    public final CK A0B;
    public final CL A0C;
    public final C0768Il A0D;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{117, 82, 90, 83, 97, 87, 83, 64, 81, 90, 87, 86, DateTimeFieldType.MINUTE_OF_DAY, 70, 93, 93, DateTimeFieldType.MINUTE_OF_DAY, 95, 83, 92, 75, DateTimeFieldType.MINUTE_OF_DAY, 80, 75, 70, 87, 65, 28, 0, DateTimeFieldType.SECOND_OF_DAY, 4, 31, 11, 58, 61, 52};
    }

    public static void A06() {
        A0F = new String[]{"ydp2W5xsf3wxxmCItZRtLRLpaCcQN61V", "ZzeQ67WJ6", "MfxT7BiZm", "QAZkmCdKFAHfN7ilsO4NsWCm7AIOdsAB", "uXA2W", "sq6CLgUZZ", "GhmTF3RrY3ydpwpSZCJZy8aIHeXkOr61", "710SvX7FP4z"};
    }

    static {
        A06();
        A05();
        A0G = new C1180Yp();
        A0J = J1.A08(A04(32, 4, 79));
        A0H = J1.A08(A04(0, 4, 32));
        A0I = J1.A08(A04(28, 4, 74));
    }

    public C1182Yr() {
        this(0);
    }

    public C1182Yr(int i2) {
        this(i2, -9223372036854775807L);
    }

    public C1182Yr(int i2, long j2) {
        this.A08 = i2;
        this.A09 = j2;
        this.A0D = new C0768Il(10);
        this.A0C = new CL();
        this.A0A = new CJ();
        this.A02 = -9223372036854775807L;
        this.A0B = new CK();
    }

    private int A00(CG cg) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            cg.ACd();
            String[] strArr = A0F;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[0] = "k6Z5PTGWNQqxWVGEWp2g14fMjsllqw2H";
            strArr2[6] = "hJNgcdrxKvM79jF48EqDHnrsGOClnbxU";
            if (!cg.ABd(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Z(0);
            int iA09 = this.A0D.A09();
            if (!A07(iA09, this.A01) || CL.A00(iA09) == -1) {
                cg.ADJ(1);
                this.A01 = 0;
                return 0;
            }
            CL.A05(iA09, this.A0C);
            if (this.A02 == -9223372036854775807L) {
                this.A02 = this.A06.A7B(cg.A6p());
                if (this.A09 != -9223372036854775807L) {
                    this.A02 += this.A09 - this.A06.A7B(0L);
                }
            }
            this.A00 = this.A0C.A02;
        }
        int iACg = this.A05.ACg(cg, this.A00, true);
        if (iACg == -1) {
            return -1;
        }
        this.A00 -= iACg;
        if (this.A00 > 0) {
            return 0;
        }
        this.A05.ACi(this.A02 + ((this.A03 * 1000000) / ((long) this.A0C.A03)), 1, this.A0C.A02, 0, null);
        this.A03 += (long) this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    public static int A01(C0768Il c0768Il, int i2) {
        if (c0768Il.A08() >= i2 + 4) {
            c0768Il.A0Z(i2);
            int iA09 = c0768Il.A09();
            if (iA09 == A0J || iA09 == A0H) {
                return iA09;
            }
        }
        if (c0768Il.A08() >= 40) {
            c0768Il.A0Z(36);
            int iA092 = c0768Il.A09();
            int i3 = A0I;
            if (iA092 == i3) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    private InterfaceC1181Yq A02(CG cg) throws InterruptedException, IOException {
        cg.ABc(this.A0D.A00, 0, 4);
        this.A0D.A0Z(0);
        CL.A05(this.A0D.A09(), this.A0C);
        return new C0615Cf(cg.A6W(), cg.A6p(), this.A0C);
    }

    private InterfaceC1181Yq A03(CG cg) throws InterruptedException, IOException {
        C0768Il c0768Il = new C0768Il(this.A0C.A02);
        cg.ABc(c0768Il.A00, 0, this.A0C.A02);
        int i2 = 21;
        if ((this.A0C.A05 & 1) == 0) {
            int seekHeader = this.A0C.A01;
            if (seekHeader == 1) {
                i2 = 13;
            }
        } else if (this.A0C.A01 != 1) {
            i2 = 36;
        }
        int iA01 = A01(c0768Il, i2);
        int seekHeader2 = A0J;
        if (iA01 != seekHeader2) {
            int seekHeader3 = A0H;
            if (iA01 != seekHeader3) {
                int seekHeader4 = A0I;
                if (iA01 == seekHeader4) {
                    C0613Ca c0613CaA00 = C0613Ca.A00(cg.A6W(), cg.A6p(), this.A0C, c0768Il);
                    int seekHeader5 = this.A0C.A02;
                    cg.ADJ(seekHeader5);
                    return c0613CaA00;
                }
                cg.ACd();
                return null;
            }
        }
        CY cyA01 = CY.A01(cg.A6W(), cg.A6p(), this.A0C, c0768Il);
        if (cyA01 != null && !this.A0A.A04()) {
            cg.ACd();
            int seekHeader6 = i2 + 141;
            cg.A3M(seekHeader6);
            cg.ABc(this.A0D.A00, 0, 3);
            this.A0D.A0Z(0);
            CJ cj = this.A0A;
            int seekHeader7 = this.A0D.A0H();
            cj.A05(seekHeader7);
        }
        int seekHeader8 = this.A0C.A02;
        cg.ADJ(seekHeader8);
        if (cyA01 == null || cyA01.A7q()) {
            return cyA01;
        }
        int seekHeader9 = A0H;
        if (iA01 == seekHeader9) {
            return A02(cg);
        }
        return cyA01;
    }

    public static boolean A07(int i2, long j2) {
        return ((long) ((-128000) & i2)) == ((-128000) & j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A08(com.facebook.ads.redexgen.X.CG r14, boolean r15) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1182Yr.A08(com.facebook.ads.redexgen.X.CG, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A7V(CH ch) {
        this.A04 = ch;
        this.A05 = this.A04.ADb(0, 1);
        this.A04.A4x();
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final int AC0(CG cg, CM cm) throws InterruptedException, IOException {
        if (this.A01 == 0) {
            try {
                A08(cg, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            this.A06 = A03(cg);
            InterfaceC1181Yq interfaceC1181Yq = this.A06;
            if (interfaceC1181Yq == null || (!interfaceC1181Yq.A7q() && (this.A08 & 1) != 0)) {
                InterfaceC1181Yq interfaceC1181YqA02 = A02(cg);
                String[] strArr = A0F;
                if (strArr[2].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0F;
                strArr2[3] = "vRoDRHRtSRtNnEEJ64K4r5ogXxosELXw";
                strArr2[3] = "vRoDRHRtSRtNnEEJ64K4r5ogXxosELXw";
                this.A06 = interfaceC1181YqA02;
            }
            this.A04.ACn(this.A06);
            this.A05.A5B(Format.A05(null, this.A0C.A06, null, -1, ProgressEvent.PART_FAILED_EVENT_CODE, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(cg);
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void ACm(long j2, long j3) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final boolean ADK(CG cg) throws InterruptedException, IOException {
        return A08(cg, true);
    }
}
