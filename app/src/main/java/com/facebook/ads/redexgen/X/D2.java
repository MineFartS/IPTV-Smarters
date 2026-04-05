package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D2 {
    public static byte[] A05;
    public static String[] A06;
    public final int A00;
    public final CQ A01;

    @Nullable
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "3n0Xyqau0qpDSx89MxSLBxd";
            strArr2[0] = "tz3h4DDpAPGNu8T48YqRwIi";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 103);
            i5++;
        }
    }

    public static void A02() {
        A05 = new byte[]{118, 127, 113, DateTimeFieldType.CLOCKHOUR_OF_DAY, 34, 34, 36, 60, 56, 63, 54, 113, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 2, 124, DateTimeFieldType.MINUTE_OF_DAY, 5, 3, 113, 72, 110, 125, 127, 119, 89, 114, 127, 110, 101, 108, 104, 117, 115, 114, 94, 115, 100, 58, 1, 28, 26, 31, 31, 0, 29, 27, 10, 11, 79, 31, 29, 0, 27, 10, 12, 27, 6, 0, 1, 79, 28, 12, 7, 10, 2, 10, 79, 27, DateTimeFieldType.MILLIS_OF_DAY, 31, 10, 79, 72, 114, 115, 114, 32, 2, 3, 2, DateTimeFieldType.MINUTE_OF_DAY, 95, 89, 82, 95, 32, 38, 45, 48, 1, DateTimeFieldType.CLOCKHOUR_OF_DAY, 27, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 66, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 6, 7, 76};
    }

    public static void A03() {
        A06 = new String[]{"C09qkhbo3vRSWUJSgSkEV0X", "WA1yWV5061NHQxIGBHZdG7C7pKjO5Y9H", "pYBemDtXYAadS99Nmeaz8GF", "NyHZMe4zCbCNgYs1LmeICE7hAZM3ASIf", BuildConfig.FLAVOR, "Aq1CtCEX8aJa", "3dQVxpobetg6gtuImvAOL3PNXFyzfQ27", "PtQ4b0lS5cBc"};
    }

    public D2(boolean z, @Nullable String str, int i2, byte[] bArr, int i3, int i4, @Nullable byte[] bArr2) {
        IM.A03((bArr2 == null) ^ (i2 == 0));
        this.A03 = z;
        this.A02 = str;
        this.A00 = i2;
        this.A04 = bArr2;
        this.A01 = new CQ(A00(str), bArr, i3, i4);
    }

    public static int A00(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(74, 4, 118))) {
                    b2 = 2;
                }
                break;
            case 3046671:
                if (str.equals(A01(78, 4, 6))) {
                    b2 = 3;
                }
                break;
            case 3049879:
                if (str.equals(A01(82, 4, 91))) {
                    b2 = 0;
                }
                break;
            case 3049895:
                if (str.equals(A01(86, 4, 36))) {
                    b2 = 1;
                }
                break;
        }
        if (b2 == 0 || b2 == 1) {
            return 1;
        }
        if (b2 == 2 || b2 == 3) {
            return 2;
        }
        Log.w(A01(20, 18, 123), A01(38, 36, 8) + str + A01(0, 20, 54) + A01(90, 12, 5));
        return 1;
    }
}
