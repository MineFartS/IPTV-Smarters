package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XS implements Q5 {
    public static byte[] A01;
    public final X3 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, -45, -8, DateTimeFieldType.SECOND_OF_MINUTE, 27, 26, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, -45, -6, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_DAY, 11, DateTimeFieldType.SECOND_OF_DAY, 102, 100, 86, 99, 30, 82, 88, 86, 95, 101};
    }

    public XS(X3 x3) {
        this.A00 = x3;
    }

    @Override // com.facebook.ads.redexgen.X.Q5
    public final Map<String, String> A5D(boolean z) {
        HashMap map = new HashMap();
        if (!C04525a.A00().A04()) {
            map.put(A00(0, 23, 39), AnonymousClass97.A00().A02(this.A00, true).A77());
        }
        map.put(A00(23, 10, 114), C9B.A06(new C05328n(this.A00), this.A00, z));
        return map;
    }
}
