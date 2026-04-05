package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0617Ch {
    public static byte[] A09;
    public static String[] A0A;
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C0768Il A06;
    public final C0768Il A07;
    public final boolean A08;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{27, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 9, 34, 30, DateTimeFieldType.SECOND_OF_MINUTE, 8, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_DAY, 93, DateTimeFieldType.CLOCKHOUR_OF_DAY, 8, DateTimeFieldType.HOUR_OF_HALFDAY, 9, 93, 31, 24, 93, 76};
    }

    public static void A02() {
        A0A = new String[]{"fT4", "9XJ", "BdT8ugCih1Mpz00LrHVoF8KqNvgOr8AQ", "ItU4Mc5lT2NsoQYD", "XQJ1SNvFfokPp3KD", "IGCc23FH28N7ANBVj9k1dGnz4ha0U", "1lzK38hIt0", "A8GyDlY1o0KAgmQELzlat0ZxMGcgz"};
    }

    public C0617Ch(C0768Il c0768Il, C0768Il c0768Il2, boolean z) {
        this.A07 = c0768Il;
        this.A06 = c0768Il2;
        this.A08 = z;
        c0768Il2.A0Z(12);
        this.A05 = c0768Il2.A0I();
        c0768Il.A0Z(12);
        this.A04 = c0768Il.A0I();
        IM.A06(c0768Il.A09() == 1, A00(0, 21, 44));
        this.A00 = -1;
    }

    public final boolean A03() {
        long jA0N;
        int iA0I;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == this.A05) {
            if (A0A[6].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[2] = "dfpT2dt5bGn60gbEA6wBElGJneIfVZr3";
            strArr[2] = "dfpT2dt5bGn60gbEA6wBElGJneIfVZr3";
            return false;
        }
        if (this.A08) {
            jA0N = this.A06.A0O();
        } else {
            jA0N = this.A06.A0N();
        }
        this.A02 = jA0N;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0I();
            this.A07.A0a(4);
            int i3 = this.A04 - 1;
            this.A04 = i3;
            if (i3 > 0) {
                C0768Il c0768Il = this.A07;
                String[] strArr2 = A0A;
                if (strArr2[0].length() != strArr2[1].length()) {
                    iA0I = c0768Il.A0I() - 1;
                } else {
                    String[] strArr3 = A0A;
                    strArr3[2] = "DxoiDv7jb7q87sjQbqIMGefCzqS86q5Y";
                    strArr3[2] = "DxoiDv7jb7q87sjQbqIMGefCzqS86q5Y";
                    iA0I = c0768Il.A0I() - 1;
                }
            } else {
                iA0I = -1;
            }
            this.A03 = iA0I;
        }
        return true;
    }
}
