package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class N2 {
    public static String[] A00;
    public static final int A01;
    public static final int A02;
    public static final int A03;

    public static void A03() {
        A00 = new String[]{"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", "v", "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", "k"};
    }

    static {
        A03();
        A01 = (int) (C0856Lz.A01 * 200.0f);
        A03 = (int) (C0856Lz.A01 * 200.0f);
        A02 = (int) (C0856Lz.A01 * 50.0f);
    }

    public static AnonymousClass10 A00(@Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return AnonymousClass10.A05;
        }
        if (A04(nativeAdLayout)) {
            return AnonymousClass10.A06;
        }
        return AnonymousClass10.A04;
    }

    @Nullable
    public static N1 A01(X2 x2, JZ jz, String str, @Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int i2 = A01;
        if (width >= i2 && height >= i2) {
            return new C1154Xp(x2, jz, str);
        }
        if (width < A03 || height < A02) {
            return null;
        }
        return new C1157Xs(x2, jz, str);
    }

    public static N1 A02(X2 x2, JZ jz, String str, C1Q c1q, MS ms, MR mr) {
        return new C1161Xw(x2, jz, str, c1q, ms, mr);
    }

    public static boolean A04(NativeAdLayout nativeAdLayout) {
        int h2 = nativeAdLayout.getWidth();
        int w = nativeAdLayout.getHeight();
        int i2 = A01;
        if (h2 < i2 || w < i2) {
            if (h2 >= A03) {
                int i3 = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                String[] strArr = A00;
                strArr[5] = "hhrIY4o6fKEkU42z4UVpb3";
                strArr[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (w < i3) {
                }
            }
            return true;
        }
        return false;
    }
}
