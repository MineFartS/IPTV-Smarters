package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1191Za implements CF {
    public static byte[] A05;
    public static String[] A06;
    public static final CI A07;
    public int A00;
    public int A01;
    public CH A02;
    public CR A03;
    public C1192Zb A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{100, 95, 66, 68, 65, 65, 94, 67, 69, 84, 85, DateTimeFieldType.HOUR_OF_DAY, 94, 67, DateTimeFieldType.HOUR_OF_DAY, 68, 95, 67, 84, 82, 94, 86, 95, 88, 75, 84, 85, DateTimeFieldType.HOUR_OF_DAY, 70, 80, 71, DateTimeFieldType.HOUR_OF_DAY, 89, 84, 80, 85, 84, 67, 31, 107, 127, 110, 99, 101, 37, 120, 107, 125};
    }

    public static void A02() {
        A06 = new String[]{"TnN98hFrpPh0PRtpc088aNdcZccscvrw", "5aRpZ2NNsZI5w0o7DGq1eAqNryB", "mEVhsrU6MzIr1qyqOlGiN", "yrEmV4s21h7BLFfB7siMTKTjJQry3", "EfBKzRp", "ss80CflBP4AmUjPde3BocO42m8Tqd1M1", "kqV6vinpOYrD", "3vWKjffhrtNYzin5lJ6IQFsZaR1xXQhq"};
    }

    static {
        A02();
        A01();
        A07 = new ZZ();
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A7V(CH ch) {
        this.A02 = ch;
        this.A03 = ch.ADb(0, 1);
        this.A04 = null;
        ch.A4x();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0 A[PHI: r5 r6
  0x00b0: PHI (r5v4 'size' int) = (r5v1 'size' int), (r5v5 'size' int) binds: [B:24:0x00e5, B:15:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r6v4 int) = (r6v2 int), (r6v5 int) binds: [B:24:0x00e5, B:15:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.facebook.ads.redexgen.X.CF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int AC0(com.facebook.ads.redexgen.X.CG r19, com.facebook.ads.redexgen.X.CM r20) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1191Za.AC0(com.facebook.ads.redexgen.X.CG, com.facebook.ads.redexgen.X.CM):int");
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void ACm(long j2, long j3) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final boolean ADK(CG cg) throws InterruptedException, IOException {
        return C0637Dc.A00(cg) != null;
    }
}
