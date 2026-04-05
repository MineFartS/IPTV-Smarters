package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03601j {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{69, 82, 64, 86, 69, 83, 82, 83, 104, 65, 94, 83, 82, 88};
    }

    public static void A02(C7C c7c, C0997Rm c0997Rm) {
        c7c.A0S(new AnonymousClass79(c0997Rm.A0O().A01(), C0918Ok.A04, C0918Ok.A04, c0997Rm.A0U(), A00(0, 14, 37)));
        c7c.A0W(new C7B(c0997Rm.A0M().A0E().A08(), c0997Rm.A0U(), A00(0, 14, 37), c0997Rm.A0M().A0E().A05()));
        c7c.A0S(new AnonymousClass79(c0997Rm.A0M().A0E().A07(), C03551e.A00(c0997Rm.A0M().A0E()), C03551e.A01(c0997Rm.A0M().A0E()), c0997Rm.A0U(), A00(0, 14, 37)));
        Iterator<String> it = c0997Rm.A0M().A0H().A00().iterator();
        while (it.hasNext()) {
            c7c.A0S(new AnonymousClass79(it.next(), -1, -1, c0997Rm.A0U(), A00(0, 14, 37)));
        }
    }
}
