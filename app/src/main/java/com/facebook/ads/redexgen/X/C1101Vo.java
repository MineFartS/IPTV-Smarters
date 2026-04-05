package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1101Vo implements InterfaceC04806d {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ W5 A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{DateTimeFieldType.MINUTE_OF_DAY, 121, 120, 106, 1, DateTimeFieldType.SECOND_OF_DAY};
    }

    public static void A02() {
        A02 = new String[]{"Wdahz1Wjl3dMmMcpJsybmGRAeciA4tMI", "owhKI", "oRwt0jb9EEblUBuGQWVNL6ozc0Rzi0vw", "l56im1aaEdwcDHM5hLD8b", "Eu2PxKSDFU9lAkWHn67wF6yqVh6mLTIL", "0Vvrgp6tuvzAmenwYfecbhGxQfkK1YW3", "HQi", "vUie1Te"};
    }

    public C1101Vo(W5 w5) {
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
            android.content.pm.ServiceInfo[] r0 = com.facebook.ads.redexgen.X.W5.A0B(r0)
            if (r0 == 0) goto L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
        Le:
            com.facebook.ads.redexgen.X.W5 r0 = r5.A00
            android.content.pm.ServiceInfo[] r0 = com.facebook.ads.redexgen.X.W5.A0B(r0)
            int r0 = r0.length
            if (r4 >= r0) goto L3c
            com.facebook.ads.redexgen.X.W5 r0 = r5.A00
            android.content.pm.ServiceInfo[] r0 = com.facebook.ads.redexgen.X.W5.A0B(r0)
            r0 = r0[r4]
            java.lang.String r0 = r0.name
            r3.append(r0)
            com.facebook.ads.redexgen.X.W5 r0 = r5.A00
            android.content.pm.ServiceInfo[] r0 = com.facebook.ads.redexgen.X.W5.A0B(r0)
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r4 == r0) goto L39
            r2 = 0
            r1 = 1
            r0 = 6
            java.lang.String r0 = A00(r2, r1, r0)
            r3.append(r0)
        L39:
            int r4 = r4 + 1
            goto Le
        L3c:
            com.facebook.ads.redexgen.X.W5 r4 = r5.A00
            java.lang.String r3 = r3.toString()
            r2 = 1
            r1 = 5
            r0 = 50
            java.lang.String r0 = A00(r2, r1, r0)
            byte[] r1 = r3.getBytes(r0)
            com.facebook.ads.redexgen.X.70 r0 = com.facebook.ads.redexgen.X.AnonymousClass70.A06
            java.lang.String r0 = com.facebook.ads.redexgen.X.AnonymousClass71.A08(r1, r0)
            com.facebook.ads.redexgen.X.6s r0 = r4.A09(r0)
            return r0
        L59:
            com.facebook.ads.redexgen.X.W5 r1 = r5.A00
            com.facebook.ads.redexgen.X.6o r0 = com.facebook.ads.redexgen.X.EnumC04916o.A07
            com.facebook.ads.redexgen.X.6s r3 = r1.A08(r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1101Vo.A02
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 15
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L82
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1101Vo.A02
            java.lang.String r1 = "PIV5HCfMNdAm4GWeouxefmFP0XOPfsYa"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "Fq26Ssz9KPDLteFZDGni0zECOafhdUl8"
            r0 = 4
            r2[r0] = r1
            return r3
        L82:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1101Vo.A51():com.facebook.ads.redexgen.X.6s");
    }
}
