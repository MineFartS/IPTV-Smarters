package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1289bE implements HZ {
    public static byte[] A08;
    public static String[] A09;
    public int A00;
    public int A01;
    public int A02;
    public HY[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final HY[] A07;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 123);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-69, -81, -2, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HOUR_OF_HALFDAY, 33, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 12, 29, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, -55, 10, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_MINUTE, 24, 12, 10, 29, DateTimeFieldType.MINUTE_OF_DAY, 24, DateTimeFieldType.MILLIS_OF_SECOND, -29, -55};
    }

    public static void A02() {
        A09 = new String[]{"4ve0RWyhYyl9xCQBcFEHHb6J5", "0", "sHlJnKRUCXWWG8DJxhYmJcdBG87KccAz", "Y1hOWn5yAZG8wtugOKE5SlkzB9Lmm", "ccLKzhNJONN8hN3GMkJFYY9R9j4tosDy", "kB2MLz2Qt2VhBov62BdjLbPbFvH", "HEcEuygojM8kHr", "TVH0enYaQUtbllarZb7wcHSuDyXsicXL"};
    }

    public C1289bE(boolean z, int i2) {
        this(z, i2, 0);
    }

    public C1289bE(boolean z, int i2, int i3) {
        IM.A03(i2 > 0);
        IM.A03(i3 >= 0);
        this.A05 = z;
        this.A04 = i2;
        this.A01 = i3;
        this.A03 = new HY[i3 + 100];
        if (i3 > 0) {
            this.A06 = new byte[i3 * i2];
            for (int i4 = 0; i4 < i3; i4++) {
                this.A03[i4] = new HY(this.A06, i4 * i2);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new HY[1];
    }

    public final synchronized int A03() {
        int i2;
        i2 = this.A00 * this.A04;
        String[] strArr = A09;
        if (strArr[3].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[0] = "5S97W7P0mYMCYwMDzMcet6TY3";
        strArr2[1] = "7";
        return i2;
    }

    public final synchronized void A04() {
        if (this.A05) {
            A05(0);
        }
    }

    public final synchronized void A05(int i2) {
        boolean z = i2 < this.A02;
        this.A02 = i2;
        if (z) {
            ADc();
        }
    }

    @Override // com.facebook.ads.redexgen.X.HZ
    public final synchronized HY A3N() {
        HY hy;
        this.A00++;
        if (this.A01 > 0) {
            HY[] hyArr = this.A03;
            int i2 = this.A01 - 1;
            this.A01 = i2;
            hy = hyArr[i2];
            this.A03[this.A01] = null;
        } else {
            hy = new HY(new byte[this.A04], 0);
        }
        return hy;
    }

    @Override // com.facebook.ads.redexgen.X.HZ
    public final int A6S() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.HZ
    public final synchronized void ACH(HY hy) {
        this.A07[0] = hy;
        ACI(this.A07);
        String[] strArr = A09;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[2] = "vTQnHDwqIVvtvGKS6QPwZVkZoK1Lgm5f";
        strArr2[2] = "vTQnHDwqIVvtvGKS6QPwZVkZoK1Lgm5f";
    }

    @Override // com.facebook.ads.redexgen.X.HZ
    public final synchronized void ACI(HY[] hyArr) {
        if (this.A01 + hyArr.length >= this.A03.length) {
            this.A03 = (HY[]) Arrays.copyOf(this.A03, Math.max(this.A03.length * 2, this.A01 + hyArr.length));
        }
        for (HY hy : hyArr) {
            if (hy.A01 == this.A06 || hy.A01.length == this.A04) {
                HY[] hyArr2 = this.A03;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                hyArr2[i2] = hy;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 46) + System.identityHashCode(hy.A01) + A00(0, 2, 20) + System.identityHashCode(this.A06) + A00(0, 2, 20) + hy.A01.length + A00(0, 2, 20) + this.A04);
            }
        }
        this.A00 -= hyArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.HZ
    public final synchronized void ADc() {
        int lowIndex = Math.max(0, J1.A04(this.A02, this.A04) - this.A00);
        if (lowIndex >= this.A01) {
            return;
        }
        if (this.A06 != null) {
            int i2 = 0;
            int i3 = this.A01 - 1;
            while (i2 <= i3) {
                HY hy = this.A03[i2];
                if (hy.A01 == this.A06) {
                    i2++;
                } else {
                    HY hy2 = this.A03[i3];
                    if (hy2.A01 != this.A06) {
                        i3--;
                    } else {
                        int highIndex = i2 + 1;
                        this.A03[i2] = hy2;
                        this.A03[i3] = hy;
                        i3--;
                        i2 = highIndex;
                    }
                }
            }
            lowIndex = Math.max(lowIndex, i2);
            if (lowIndex >= this.A01) {
                return;
            }
        }
        Arrays.fill(this.A03, lowIndex, this.A01, (Object) null);
        this.A01 = lowIndex;
    }
}
