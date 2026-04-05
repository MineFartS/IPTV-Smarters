package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S6 extends AbstractRunnableC0829Kx {
    public final /* synthetic */ F0 A00;
    public final /* synthetic */ C0676Et A01;
    public final /* synthetic */ Map A02;

    public S6(C0676Et c0676Et, Map map, F0 f0) {
        this.A01 = c0676Et;
        this.A02 = map;
        this.A00 = f0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        this.A01.A0V(this.A02);
        this.A01.A0P(this.A00);
        this.A01.A01 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A01.A0C.A0A().A4Z(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A01.A07.A0F(new K7(adErrorType, BuildConfig.FLAVOR));
    }
}
