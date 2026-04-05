package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class XN extends AbstractRunnableC0829Kx {
    public static byte[] A03;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ X3 A01;
    public final /* synthetic */ MultithreadedBundleWrapper A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{91, 108, 99, 40, 123, 125, 107, 107, 109, 123, 123, 110, 125, 100, 100, 113, 40, 97, 102, 97, 124, 97, 105, 100, 97, 114, 109, 108, 41};
    }

    public XN(X3 x3, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener) {
        this.A01 = x3;
        this.A02 = multithreadedBundleWrapper;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        try {
            C1140Xb.A02().A0D(this.A01);
            if (!AnonymousClass90.A06.get() && JT.A10(this.A01)) {
                AnonymousClass99.A04(this.A01, this.A02);
            }
        } catch (Throwable th) {
            this.A01.A04().A3S(th);
        }
        AnonymousClass90.A0E(this.A01);
        AudienceNetworkAds.InitListener initListener = this.A00;
        if (initListener != null) {
            AnonymousClass90.A06(initListener, new C05438z(true, A00(0, 29, 0)));
        }
    }
}
