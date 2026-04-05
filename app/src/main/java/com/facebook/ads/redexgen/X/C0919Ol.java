package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0919Ol {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final AnonymousClass19 A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-27, -29, -12, -26, -27, -16, -10, 12, 10, 27, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HALFDAY_OF_DAY};
    }

    public C0919Ol(int i2, int i3, AnonymousClass19 anonymousClass19) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = anonymousClass19;
    }

    public final int A02() {
        return this.A01;
    }

    public final AnonymousClass19 A03() {
        return this.A02;
    }

    public final Map<String, String> A04() {
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        String strA00 = A00(0, 0, 12);
        sb.append(strA00);
        map.put(A00(7, 7, 94), sb.toString());
        map.put(A00(0, 7, 55), this.A00 + strA00);
        return map;
    }
}
