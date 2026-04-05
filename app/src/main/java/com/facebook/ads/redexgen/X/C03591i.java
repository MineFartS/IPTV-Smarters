package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03591i {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            strArr2[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b2 = (byte) ((bArrCopyOfRange[i5] - i4) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr3 = A01;
            strArr3[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr3[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            bArrCopyOfRange[i5] = b2;
            i5++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    public static void A02() {
        A01 = new String[]{"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};
    }

    public static void A03(X2 x2, AnonymousClass16 anonymousClass16, boolean z, InterfaceC03571g interfaceC03571g) {
        if (!JT.A18(x2)) {
            C7C c7c = new C7C(x2);
            C1S playableAdData = anonymousClass16.A0M().A0E().A06();
            C0789Jg funnelLoggingHandler = new C0789Jg(anonymousClass16.A0Q(), x2.A06());
            c7c.A0X(funnelLoggingHandler);
            if (playableAdData == null) {
                interfaceC03571g.AAT(AdError.CACHE_ERROR);
                return;
            }
            C7B c7b = new C7B(playableAdData.A0F(), anonymousClass16.A0U(), anonymousClass16.A0T());
            c7b.A04 = true;
            if (JT.A15(x2)) {
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "84TqyqDRqUmJCVM8";
                strArr[0] = "84TqyqDRqUmJCVM8";
                c7b.A03 = A00(0, 5, 22);
            }
            int i2 = C03561f.A00[playableAdData.A0A().ordinal()];
            if (i2 == 1 || i2 == 2) {
                c7c.A0T(c7b);
            }
            c7c.A0R(new AnonymousClass79(anonymousClass16.A0O().A01(), -1, -1, anonymousClass16.A0U(), anonymousClass16.A0T()));
            c7c.A0R(new AnonymousClass79(playableAdData.A0E(), -1, -1, anonymousClass16.A0U(), anonymousClass16.A0T()));
            c7c.A0Q(new C1002Rr(x2, interfaceC03571g, c7c, playableAdData, z, null), new AnonymousClass75(anonymousClass16.A0U(), anonymousClass16.A0T()));
            return;
        }
        interfaceC03571g.AAU();
    }
}
