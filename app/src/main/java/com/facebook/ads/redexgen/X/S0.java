package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S0 extends AbstractRunnableC0829Kx {
    public final /* synthetic */ RZ A00;
    public final /* synthetic */ C0679Ew A01;
    public final /* synthetic */ Map A02;

    public S0(C0679Ew c0679Ew, Map map, RZ rz) {
        this.A01 = c0679Ew;
        this.A02 = map;
        this.A00 = rz;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        this.A01.A0V(this.A02);
        this.A01.A0P(this.A00);
        if (JT.A0i(this.A01.A0C)) {
            this.A01.A01 = null;
            K7 k7 = new K7(AdErrorType.INTERSTITIAL_AD_TIMEOUT, BuildConfig.FLAVOR);
            this.A01.A0C.A0A().A4Z(k7.A04().getErrorCode(), k7.A05());
            this.A01.A07.A0F(k7);
            return;
        }
        this.A01.A0O();
    }
}
