package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05659v implements InterfaceC1316bf {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C05659v(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0794Jl
    public final void A8o() {
        C0821Ko.A00(new C1303bS(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0794Jl
    public final void A8r() {
        C0821Ko.A00(new C1306bV(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0794Jl
    public final void A9b(K7 k7) {
        C0821Ko.A00(new C1312bb(this, k7));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0794Jl
    public final void AAA() {
        C0821Ko.A00(new C1286bB(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1316bf
    public final void AAB() {
        C0821Ko.A00(new C1309bY(this));
    }
}
