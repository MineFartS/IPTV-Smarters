package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC04856i {
    A04(0),
    A05(100);

    public static byte[] A01;
    public static final Map<Integer, EnumC04856i> A02;
    public int A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-98, -97, -96, -101, -81, -90, -82, -104, -103, -105, -104};
    }

    static {
        A02();
        A02 = new HashMap();
        for (EnumC04856i enumC04856i : values()) {
            A02.put(Integer.valueOf(enumC04856i.A00), enumC04856i);
        }
    }

    EnumC04856i(int i2) {
        this.A00 = i2;
    }

    public static EnumC04856i A00(int i2) {
        EnumC04856i enumC04856i = A02.get(Integer.valueOf(i2));
        return enumC04856i == null ? A04 : enumC04856i;
    }
}
