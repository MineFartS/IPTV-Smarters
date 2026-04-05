package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1104Vr implements InterfaceC04806d {
    public static byte[] A01;
    public final /* synthetic */ W5 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{123, -71, -72, -86, -111, -100};
    }

    public C1104Vr(W5 w5) {
        this.A00 = w5;
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0015 */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.AbstractC04956s A51() throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.W5 r0 = r5.A00
            java.lang.String[] r0 = com.facebook.ads.redexgen.X.W5.A0D(r0)
            if (r0 == 0) goto L58
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
        Le:
            com.facebook.ads.redexgen.X.W5 r0 = r5.A00
            java.lang.String[] r0 = com.facebook.ads.redexgen.X.W5.A0D(r0)
            int r0 = r0.length
            if (r4 >= r0) goto L3b
            com.facebook.ads.redexgen.X.W5 r0 = r5.A00
            java.lang.String[] r0 = com.facebook.ads.redexgen.X.W5.A0D(r0)
            r0 = r0[r4]
            r3.append(r0)
            com.facebook.ads.redexgen.X.W5 r0 = r5.A00
            java.lang.String[] r0 = com.facebook.ads.redexgen.X.W5.A0D(r0)
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r4 == r0) goto L38
            r2 = 0
            r1 = 1
            r0 = 29
            java.lang.String r0 = A00(r2, r1, r0)
            r3.append(r0)
        L38:
            int r4 = r4 + 1
            goto Le
        L3b:
            com.facebook.ads.redexgen.X.W5 r4 = r5.A00
            java.lang.String r3 = r3.toString()
            r2 = 1
            r1 = 5
            r0 = 16
            java.lang.String r0 = A00(r2, r1, r0)
            byte[] r1 = r3.getBytes(r0)
            com.facebook.ads.redexgen.X.70 r0 = com.facebook.ads.redexgen.X.AnonymousClass70.A06
            java.lang.String r0 = com.facebook.ads.redexgen.X.AnonymousClass71.A08(r1, r0)
            com.facebook.ads.redexgen.X.6s r0 = r4.A09(r0)
            return r0
        L58:
            com.facebook.ads.redexgen.X.W5 r1 = r5.A00
            com.facebook.ads.redexgen.X.6o r0 = com.facebook.ads.redexgen.X.EnumC04916o.A07
            com.facebook.ads.redexgen.X.6s r0 = r1.A08(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1104Vr.A51():com.facebook.ads.redexgen.X.6s");
    }
}
