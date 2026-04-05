package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BG extends AbstractC1239aQ {
    public static String[] A03;
    public final C1241aS A00;
    public volatile int A01;
    public volatile boolean A02;

    static {
        A00();
    }

    public static void A00() {
        A03 = new String[]{"FTXS65w45Sm8EixZZ7uSggYPBpwtIcy7", "SFeIEgnsWGvj7S3XoKkTI5wMpuch1G", "tZn", "cpavPDB0sv4udQmWeOO6ScBtux7hBxE", "SN9", "hsPxk11qntOnrh8X1tTDrxbKf8HCC3Lw", "5vJvpsU2rLI4nd2aJg4QBMGujCjOgy5o", "bKhoUdmV1"};
    }

    public BG(InterfaceC0740Hh interfaceC0740Hh, C0744Hl c0744Hl, Format format, int i2, @Nullable Object obj, C1241aS c1241aS) {
        super(interfaceC0740Hh, c0744Hl, 2, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.A00 = c1241aS;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0751Hu
    public final void A3y() {
        this.A02 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0751Hu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A7u() throws java.lang.InterruptedException, java.io.IOException {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.Hl r2 = r11.A05
            int r0 = r11.A01
            long r0 = (long) r0
            com.facebook.ads.redexgen.X.Hl r1 = r2.A03(r0)
            com.facebook.ads.redexgen.X.YY r5 = new com.facebook.ads.redexgen.X.YY     // Catch: java.lang.Throwable -> La8
            com.facebook.ads.redexgen.X.Hh r6 = r11.A07     // Catch: java.lang.Throwable -> La8
            long r7 = r1.A01     // Catch: java.lang.Throwable -> La8
            com.facebook.ads.redexgen.X.Hh r0 = r11.A07     // Catch: java.lang.Throwable -> La8
            long r9 = r0.ABR(r1)     // Catch: java.lang.Throwable -> La8
            r5.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> La8
            int r4 = r11.A01     // Catch: java.lang.Throwable -> La8
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.BG.A03
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 31
            if (r1 == r0) goto L2e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BG.A03
            java.lang.String r1 = "qI9IG8GuTDlQsbgWWKKyszLuRpDPsg7y"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "qI9IG8GuTDlQsbgWWKKyszLuRpDPsg7y"
            r0 = 0
            r2[r0] = r1
            if (r4 != 0) goto L46
            com.facebook.ads.redexgen.X.aS r2 = r11.A00     // Catch: java.lang.Throwable -> La8
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.A02(r3, r0)     // Catch: java.lang.Throwable -> La8
        L46:
            com.facebook.ads.redexgen.X.aS r0 = r11.A00     // Catch: java.lang.Throwable -> L9a
            com.facebook.ads.redexgen.X.CF r1 = r0.A04     // Catch: java.lang.Throwable -> L9a
            r4 = 0
        L4b:
            if (r4 != 0) goto L56
            boolean r0 = r11.A02     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L56
            int r4 = r1.AC0(r5, r3)     // Catch: java.lang.Throwable -> L9a
            goto L4b
        L56:
            r3 = 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.BG.A03
            r0 = 5
            r1 = r1[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            r0 = 72
            if (r1 == r0) goto L75
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BG.A03
            java.lang.String r1 = "FcV3JUuiZ"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "FcV3JUuiZ"
            r0 = 7
            r2[r0] = r1
            if (r4 == r3) goto L84
            goto L85
        L75:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BG.A03
            java.lang.String r1 = "M5NAc4g4ZEDKUijLw0hm4lwG5pmT3hrL"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "M5NAc4g4ZEDKUijLw0hm4lwG5pmT3hrL"
            r0 = 0
            r2[r0] = r1
            if (r4 == r3) goto L84
            goto L85
        L84:
            r3 = 0
        L85:
            com.facebook.ads.redexgen.X.IM.A04(r3)     // Catch: java.lang.Throwable -> L9a
            long r2 = r5.A6p()     // Catch: java.lang.Throwable -> La8
            com.facebook.ads.redexgen.X.Hl r0 = r11.A05     // Catch: java.lang.Throwable -> La8
            long r0 = r0.A01     // Catch: java.lang.Throwable -> La8
            long r2 = r2 - r0
            int r0 = (int) r2     // Catch: java.lang.Throwable -> La8
            r11.A01 = r0     // Catch: java.lang.Throwable -> La8
            com.facebook.ads.redexgen.X.Hh r0 = r11.A07
            com.facebook.ads.redexgen.X.J1.A0a(r0)
            return
        L9a:
            r4 = move-exception
            long r2 = r5.A6p()     // Catch: java.lang.Throwable -> La8
            com.facebook.ads.redexgen.X.Hl r0 = r11.A05     // Catch: java.lang.Throwable -> La8
            long r0 = r0.A01     // Catch: java.lang.Throwable -> La8
            long r2 = r2 - r0
            int r0 = (int) r2     // Catch: java.lang.Throwable -> La8
            r11.A01 = r0     // Catch: java.lang.Throwable -> La8
            throw r4     // Catch: java.lang.Throwable -> La8
        La8:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Hh r0 = r11.A07
            com.facebook.ads.redexgen.X.J1.A0a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BG.A7u():void");
    }
}
