package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0688Ff extends RO<Boolean> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 11);
            if (A01[7].charAt(3) == 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "sG0ZW8iA9FhuxyrPPxk32ZMKyd5Ipxxl";
            strArr[5] = "sG0ZW8iA9FhuxyrPPxk32ZMKyd5Ipxxl";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_DAY};
    }

    public static void A02() {
        A01 = new String[]{"NNAYJgqAxq6", "RPmyeRiulwcpe3gVYddUzJFJGH82m9fu", "pocSipesvfpE3cLwVJ3T4sWKEfE1MBsP", "ucqb8xU9Bp2wsMR", "gQQeWK5z7iltXeb", "VYMBA8uabkegiq2fUHtiV8r4OY0PGXOy", "rIrwlxT4sDyLq1tQKgD", "S1PcdjNAO4tZ3rA00rKdBmTcOV6cHprj"};
    }

    public C0688Ff(String str) {
        super(str);
    }

    public final C0X A03(@Nullable Boolean bool) {
        return new C0X(this, bool == null ? A00(0, 4, 115) : bool.toString());
    }
}
