package com.facebook.ads.redexgen.X;

import com.amazonaws.event.ProgressEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC04816e {
    A04(0),
    A07(1024),
    A05(2048),
    A06(ProgressEvent.PART_FAILED_EVENT_CODE);

    public static byte[] A01;
    public static final Map<Integer, EnumC04816e> A02;
    public int A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-104, -101, -92, -97, -99, -92, -75, -97, -99, -92, -91, -88, -101, 120, 105, 122, 105, 118, 119, 113, 108, 127, 110, 123, 113, 124, 122, -116, -128, 110, 122, 125, 121, 114, -91, -89, -91, -94, -101, -107, -101, -95, -89, -91};
    }

    static {
        A02();
        A02 = new HashMap();
        for (EnumC04816e enumC04816e : values()) {
            A02.put(Integer.valueOf(enumC04816e.A00), enumC04816e);
        }
    }

    EnumC04816e(int i2) {
        this.A00 = i2;
    }

    public static EnumC04816e A00(int i2) {
        EnumC04816e enumC04816e = A02.get(Integer.valueOf(i2));
        return enumC04816e == null ? A04 : enumC04816e;
    }

    public final int A03() {
        return this.A00;
    }
}
