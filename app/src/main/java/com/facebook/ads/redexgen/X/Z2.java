package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z2 implements D8 {
    public static byte[] A0C;
    public static String[] A0D;
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final D7 A0A = new D7();
    public final DB A0B;

    static {
        A0B();
        A0A();
    }

    public static String A09(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{38, 7, 72, 7, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 72, 24, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 72, 11, 9, 6, 72, 10, DateTimeFieldType.HALFDAY_OF_DAY, 72, DateTimeFieldType.HOUR_OF_HALFDAY, 7, 29, 6, 12, 70};
    }

    public static void A0B() {
        A0D = new String[]{"IwWJ1rAHfmexjsebXRXcDPjaU73iSJJD", "Pfa9O7smeRLr", "YVPVKTJSUnoy1mID8h1JiHhyOv", "4YIcZCc9D0v6GYbVW55qq4", "MQGq3Ss0TGTuZcZl9hZWKHAs", "ClxO0wOPMkXGPeTsbkyLqOefUDvePx9Y", "eY8aqVMBTreysgzhCT0m33TuEQRECFok", "4vNP3Dy1WFFR"};
    }

    public Z2(long j2, long j3, DB db, int i2, long j4) {
        IM.A03(j2 >= 0 && j3 > j2);
        this.A0B = db;
        this.A09 = j2;
        this.A08 = j3;
        if (i2 == j3 - j2) {
            this.A07 = j4;
            this.A00 = 3;
        } else {
            this.A00 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j2, long j3, long j4) {
        long j5 = this.A08;
        long j6 = this.A09;
        long j7 = j2 + ((((j5 - j6) * j3) / this.A07) - j4);
        if (j7 < j6) {
            j7 = this.A09;
        }
        long j8 = this.A08;
        if (j7 >= j8) {
            return j8 - 1;
        }
        return j7;
    }

    private final long A01(long j2, CG cg) throws InterruptedException, IOException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long jA6p = cg.A6p();
        if (A0E(cg, this.A01)) {
            this.A0A.A04(cg, false);
            cg.ACd();
            long j3 = j2 - this.A0A.A05;
            int i2 = this.A0A.A01 + this.A0A.A00;
            if (j3 >= 0) {
                String[] strArr = A0D;
                if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[2] = "1HFKFqyQYawdfec4zhOWKwAEhw";
                strArr2[3] = "atngC4wrhlAL4xDnem6FNv";
                if (j3 <= 72000) {
                    cg.ADJ(i2);
                    return -(this.A0A.A05 + 2);
                }
            }
            if (j3 < 0) {
                this.A01 = jA6p;
                this.A02 = this.A0A.A05;
            } else {
                long initialPosition = cg.A6p();
                this.A04 = initialPosition + ((long) i2);
                this.A05 = this.A0A.A05;
                long initialPosition2 = this.A01;
                if ((initialPosition2 - this.A04) + ((long) i2) < 100000) {
                    cg.ADJ(i2);
                    long initialPosition3 = this.A05;
                    return -(initialPosition3 + 2);
                }
            }
            long initialPosition4 = this.A01;
            long j4 = this.A04;
            if (initialPosition4 - j4 < 100000) {
                this.A01 = j4;
                return j4;
            }
            long jA6p2 = cg.A6p() - (((long) i2) * (j3 > 0 ? 1L : 2L));
            long j5 = this.A01;
            long j6 = this.A04;
            long j7 = (j5 - j6) * j3;
            String[] strArr3 = A0D;
            String str = strArr3[5];
            String str2 = strArr3[0];
            int pageSize = str.charAt(24);
            if (pageSize != str2.charAt(24)) {
                long initialPosition5 = this.A02;
                return Math.min(Math.max(jA6p2 + (j7 / (initialPosition5 - this.A05)), j6), this.A01 - 1);
            }
            String[] strArr4 = A0D;
            strArr4[1] = "HnyCEdH4by64";
            strArr4[7] = "f67XG71IQfud";
            return Math.min(Math.max(jA6p2 + (j7 / (this.A02 - this.A05)), j6), this.A01 - 1);
        }
        long j8 = this.A04;
        if (j8 != jA6p) {
            return j8;
        }
        throw new IOException(A09(0, 25, 6));
    }

    private final long A02(CG cg) throws InterruptedException, IOException {
        A0D(cg);
        this.A0A.A03();
        while ((this.A0A.A04 & 4) != 4 && cg.A6p() < this.A08) {
            this.A0A.A04(cg, false);
            cg.ADJ(this.A0A.A01 + this.A0A.A00);
        }
        return this.A0A.A05;
    }

    private final long A03(CG cg, long j2, long j3) throws InterruptedException, IOException {
        this.A0A.A04(cg, false);
        while (this.A0A.A05 < j2) {
            cg.ADJ(this.A0A.A01 + this.A0A.A00);
            j3 = this.A0A.A05;
            this.A0A.A04(cg, false);
        }
        cg.ACd();
        return j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.D8
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final Z1 A4S() {
        D5 d5 = null;
        if (this.A07 != 0) {
            return new Z1(this);
        }
        return null;
    }

    private final void A0C() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0D(CG cg) throws InterruptedException, IOException {
        if (A0E(cg, this.A08)) {
        } else {
            throw new EOFException();
        }
    }

    private final boolean A0E(CG cg, long j2) throws InterruptedException, IOException {
        long jMin = Math.min(3 + j2, this.A08);
        byte[] bArr = new byte[2048];
        int length = bArr.length;
        while (true) {
            if (cg.A6p() + ((long) length) > jMin && (length = (int) (jMin - cg.A6p())) < 4) {
                return false;
            }
            cg.ABd(bArr, 0, length, false);
            for (int i2 = 0; i2 < length - 3; i2++) {
                if (bArr[i2] == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103 && bArr[i2 + 3] == 83) {
                    cg.ADJ(i2);
                    return true;
                }
            }
            cg.ADJ(length - 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final long AC1(CG cg) throws InterruptedException, IOException {
        long jA03;
        int i2 = this.A00;
        if (i2 == 0) {
            this.A03 = cg.A6p();
            this.A00 = 1;
            long j2 = this.A08 - 65307;
            if (j2 > this.A03) {
                return j2;
            }
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j3 = this.A06;
            if (j3 == 0) {
                jA03 = 0;
            } else {
                long jA01 = A01(j3, cg);
                if (jA01 >= 0) {
                    return jA01;
                }
                jA03 = A03(cg, this.A06, -(jA01 + 2));
            }
            this.A00 = 3;
            return -(2 + jA03);
        }
        this.A07 = A02(cg);
        this.A00 = 3;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final long ADQ(long j2) {
        int i2 = this.A00;
        IM.A03(i2 == 3 || i2 == 2);
        long jA05 = 0;
        if (j2 != 0) {
            jA05 = this.A0B.A05(j2);
        }
        this.A06 = jA05;
        this.A00 = 2;
        A0C();
        long j3 = this.A06;
        String[] strArr = A0D;
        if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[6] = "l4iEtEKEuRK6wb9mepvhy";
        strArr2[6] = "l4iEtEKEuRK6wb9mepvhy";
        return j3;
    }
}
