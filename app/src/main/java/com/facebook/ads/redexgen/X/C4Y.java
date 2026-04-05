package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4Y {
    public static String[] A00;

    static {
        A03();
    }

    public static void A03() {
        A00 = new String[]{"UqypfisWbLbbWLDfIVvpiaUsz0iS", "wEiCJDeLGzLJebV", "cX", "dRMEhdR7kDOm9Ob", "SmhGT229bW5LAFpAZzaxeRYqKvMDeGhX", "QcSoUKFtoryhyFMFYIfDI81ChPsDlMu7", "SBvSWfqovIH0ljTVzoffsyrdWCNw", "n"};
    }

    public static int A00(C4U c4u, AbstractC04253z abstractC04253z, View view, View view2, C4F c4f, boolean z) {
        if (c4f.A0X() == 0 || c4u.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(c4f.A0q(view) - c4f.A0q(view2)) + 1;
        }
        int iA0C = abstractC04253z.A0C(view2);
        int iA0F = abstractC04253z.A0F(view);
        String[] strArr = A00;
        if (strArr[4].charAt(28) == strArr[5].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[3] = "xd2oZUwi45Npmqe";
        strArr2[1] = "1k2xoHfklbXXQiR";
        return Math.min(abstractC04253z.A0B(), iA0C - iA0F);
    }

    public static int A01(C4U c4u, AbstractC04253z abstractC04253z, View view, View view2, C4F c4f, boolean z) {
        if (c4f.A0X() == 0 || c4u.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c4u.A03();
        }
        return (int) (((abstractC04253z.A0C(view2) - abstractC04253z.A0F(view)) / (Math.abs(c4f.A0q(view) - c4f.A0q(view2)) + 1)) * c4u.A03());
    }

    public static int A02(C4U c4u, AbstractC04253z abstractC04253z, View view, View view2, C4F c4f, boolean z, boolean z2) {
        int iMax;
        if (c4f.A0X() != 0) {
            int iA03 = c4u.A03();
            String[] strArr = A00;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[6] = "xSzU3PMpL9LC7k2G9V08vNIV3nIP";
            strArr2[0] = "UsrmTbcEPDcBULmsiiLKltF5MwgK";
            if (iA03 != 0 && view != null && view2 != null) {
                int iMin = Math.min(c4f.A0q(view), c4f.A0q(view2));
                int iMax2 = Math.max(c4f.A0q(view), c4f.A0q(view2));
                if (z2) {
                    iMax = Math.max(0, (c4u.A03() - iMax2) - 1);
                } else {
                    iMax = Math.max(0, iMin);
                }
                if (!z) {
                    return iMax;
                }
                return Math.round((iMax * (Math.abs(abstractC04253z.A0C(view2) - abstractC04253z.A0F(view)) / (Math.abs(c4f.A0q(view) - c4f.A0q(view2)) + 1))) + (abstractC04253z.A0A() - abstractC04253z.A0F(view)));
            }
        }
        return 0;
    }
}
