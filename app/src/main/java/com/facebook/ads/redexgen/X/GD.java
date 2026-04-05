package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GD {
    public static byte[] A00;
    public static String[] A01;

    static {
        A06();
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 46);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{DateTimeFieldType.MILLIS_OF_SECOND, 3, DateTimeFieldType.MINUTE_OF_DAY, 31, 25, 89, 1, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 27, 68, 91, 86, 87, 93, 29, 69, 87, 80, 95};
    }

    public static void A06() {
        A01 = new String[]{"IGZwuDV4UOmLtGd7zigAXO", "3ZCCYF4IrXqPGB9Y7gdbmjEX2m1NZSjt", "k910pd4k2bDwhoi7Zc3GT2m6dfUWVoMn", "QJnwSxGL2YfQjsQHzRRtwbiJda5MDSxd", "k15rpm86KezORfNHzwHrRFqBBUY5qtN8", "tHhlHKbxLh1Ed4b03opJUB67", "ihweZBItsWKOZCt0W3g4zNqGDXekxD6l", "SFKB2IDS3wp7p7n5mUDuqcUJ"};
    }

    @Nullable
    public static YX A00(InterfaceC0740Hh interfaceC0740Hh, int i2, GP gp) throws InterruptedException, IOException {
        C1241aS c1241aSA02 = A02(interfaceC0740Hh, i2, gp, true);
        if (c1241aSA02 == null) {
            return null;
        }
        return (YX) c1241aSA02.A01();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C1241aS A01(int r7, com.facebook.ads.internal.exoplayer2.Format r8) {
        /*
            java.lang.String r5 = r8.A0L
            if (r5 == 0) goto L4a
            r2 = 10
            r1 = 10
            r0 = 28
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L48
            r6 = 0
            r4 = 10
            r3 = 88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.GD.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 6
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L32
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L32:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.GD.A01
            java.lang.String r1 = "umYYB8IjHV4qkgFI2rUrk9vd7V2MjiVO"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "umYYB8IjHV4qkgFI2rUrk9vd7V2MjiVO"
            r0 = 3
            r2[r0] = r1
            java.lang.String r0 = A04(r6, r4, r3)
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L4a
        L48:
            r0 = 1
            goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r0 == 0) goto L58
            com.facebook.ads.redexgen.X.Yo r1 = new com.facebook.ads.redexgen.X.Yo
            r1.<init>()
        L52:
            com.facebook.ads.redexgen.X.aS r0 = new com.facebook.ads.redexgen.X.aS
            r0.<init>(r1, r7, r8)
            return r0
        L58:
            com.facebook.ads.redexgen.X.Yy r1 = new com.facebook.ads.redexgen.X.Yy
            r1.<init>()
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.GD.A01(int, com.facebook.ads.internal.exoplayer2.Format):com.facebook.ads.redexgen.X.aS");
    }

    @Nullable
    public static C1241aS A02(InterfaceC0740Hh interfaceC0740Hh, int i2, GP gp, boolean z) throws InterruptedException, IOException {
        GN gnA05;
        GN gnA06 = gp.A06();
        if (gnA06 == null) {
            return null;
        }
        C1241aS c1241aSA01 = A01(i2, gp.A02);
        if (z) {
            GN gnA07 = gp.A07();
            if (gnA07 == null) {
                return null;
            }
            gnA05 = gnA06.A05(gnA07, gp.A03);
            if (gnA05 == null) {
                A07(interfaceC0740Hh, gp, c1241aSA01, gnA06);
                gnA05 = gnA07;
            }
        } else {
            gnA05 = gnA06;
        }
        A07(interfaceC0740Hh, gp, c1241aSA01, gnA05);
        return c1241aSA01;
    }

    public static C1257ai A03(InterfaceC0740Hh interfaceC0740Hh, Uri uri) throws IOException {
        return (C1257ai) C1304bT.A00(interfaceC0740Hh, new C1258aj(), uri);
    }

    public static void A07(InterfaceC0740Hh interfaceC0740Hh, GP gp, C1241aS c1241aS, GN gn) throws InterruptedException, IOException {
        new BG(interfaceC0740Hh, new C0744Hl(gn.A04(gp.A03), gn.A02, gn.A01, gp.A08()), gp.A02, 0, null, c1241aS).A7u();
    }
}
