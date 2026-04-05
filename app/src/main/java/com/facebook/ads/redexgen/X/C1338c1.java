package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1338c1 implements InterfaceC0799Jq {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ C1339c5 A01;

    public C1338c1(C1339c5 c1339c5, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = c1339c5;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Jq
    public final void AD1() {
        this.A00.setVolume(0.0f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Jq
    public final void AD4(NativeAd nativeAd) {
        this.A01.A0J(C1320bj.A0J(nativeAd.getInternalNativeAd()), null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Jq
    public final void ADf() {
        this.A01.A0D();
    }
}
