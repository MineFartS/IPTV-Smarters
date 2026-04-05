package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TV implements InterfaceC03631m {
    public static byte[] A03;
    public C5C A00;
    public X2 A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, 127, 122, 127, 126, 102, 127};
    }

    public TV(C5C c5c, X2 x2, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c5c;
        this.A01 = x2;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03631m
    public final void A9b(K7 k7) {
        C0821Ko.A00(new TS(this, k7));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03631m
    public final void AAK(List<C0986Rb> list) {
        C7C c7c = new C7C(this.A01);
        String strA02 = A02(6, 7, 70);
        for (C0986Rb c0986Rb : list) {
            if (A02(6, 7, 70).equals(strA02)) {
                strA02 = c0986Rb.A0R();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c0986Rb.A0K() != null) {
                    c7c.A0R(new AnonymousClass79(c0986Rb.A0K().getUrl(), c0986Rb.A0K().getHeight(), c0986Rb.A0K().getWidth(), c0986Rb.A0R(), A02(0, 6, 2)));
                }
                if (c0986Rb.A0J() != null) {
                    c7c.A0R(new AnonymousClass79(c0986Rb.A0J().getUrl(), c0986Rb.A0J().getHeight(), c0986Rb.A0J().getWidth(), c0986Rb.A0R(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c0986Rb.A0T())) {
                    c7c.A0W(new C7B(c0986Rb.A0T(), c0986Rb.A0R(), A02(0, 6, 2), c0986Rb.A0N().longValue()));
                }
            }
        }
        c7c.A0Q(new TU(this, list), new AnonymousClass75(strA02, A02(0, 6, 2)));
    }
}
