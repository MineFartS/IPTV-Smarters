package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0685Fc extends RO<Integer> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{12, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY};
    }

    public C0685Fc(String str) {
        super(str);
    }

    public final C0X A02(@Nullable Integer num) {
        return new C0X(this, num == null ? A00(0, 4, 18) : num.toString());
    }
}
