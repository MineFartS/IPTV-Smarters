package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GN {
    public static byte[] A04;
    public static String[] A05;
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;

    static {
        A03();
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-94, -52, -64, 12, 5, DateTimeFieldType.HOUR_OF_HALFDAY, 7, DateTimeFieldType.SECOND_OF_DAY, 8, -35, -57, -69, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -4, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -40, 6, DateTimeFieldType.SECOND_OF_MINUTE, 34, 27, 25, 24, 9, 38, 29, -36, 38, 25, 26, 25, 38, 25, 34, DateTimeFieldType.MILLIS_OF_SECOND, 25, 9, 38, 29, -15};
    }

    public static void A03() {
        A05 = new String[]{"l0BSXtEJznKjTn8XKXfpNBsDG6byaR4N", "pkQPmNFIpmFMsk96jh4ONECcao3Prfi6", "SRY5bzcISiO6D40dd4XnMCzHlx", "Atffyk6FQOT2cyVsOLLHRwUWSXgf", "m7sJBk", "jGdEe", "5oF3wMr01BlWViYzIYU29xiGUoNvF8R5", "rJFP"};
    }

    public GN(@Nullable String str, long j2, long j3) {
        this.A03 = str == null ? A00(0, 0, 120) : str;
        this.A02 = j2;
        this.A01 = j3;
    }

    private final String A01(String str) {
        return C0782Iz.A02(str, this.A03);
    }

    public final Uri A04(String str) {
        return C0782Iz.A00(str, this.A03);
    }

    @Nullable
    public final GN A05(@Nullable GN gn, String str) {
        String strA01 = A01(str);
        if (gn != null) {
            String resolvedUri = gn.A01(str);
            if (strA01.equals(resolvedUri)) {
                long j2 = this.A01;
                if (j2 != -1) {
                    long j3 = this.A02;
                    if (j3 + j2 == gn.A02) {
                        long j4 = gn.A01;
                        return new GN(strA01, j3, j4 != -1 ? j2 + j4 : -1L);
                    }
                }
                long j5 = gn.A01;
                if (j5 != -1) {
                    long j6 = gn.A02;
                    if (j6 + j5 == this.A02) {
                        long j7 = this.A01;
                        if (j7 != -1) {
                            long j8 = j5 + j7;
                            if (A05[3].length() != 28) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A05;
                            strArr[0] = "C0WIebzzG6zXoAefXyktNQnJ7qo9T71d";
                            strArr[1] = "T0ljURVlOIMAxNHekcBGNQ4K4yOxZCet";
                            j = j8;
                        }
                        return new GN(strA01, j6, j);
                    }
                }
                return null;
            }
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GN gn = (GN) obj;
        long j2 = this.A02;
        String[] strArr = A05;
        if (strArr[0].charAt(20) != strArr[1].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[4] = "v17tiI";
        strArr2[7] = "mhCF";
        return j2 == gn.A02 && this.A01 == gn.A01 && this.A03.equals(gn.A03);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i2 = ((17 * 31) + ((int) this.A02)) * 31;
            int result = (int) this.A01;
            this.A00 = ((i2 + result) * 31) + this.A03.hashCode();
        }
        int result2 = this.A00;
        return result2;
    }

    public final String toString() {
        return A00(18, 23, 95) + this.A03 + A00(10, 8, 70) + this.A02 + A00(1, 9, 75) + this.A01 + A00(0, 1, 36);
    }
}
