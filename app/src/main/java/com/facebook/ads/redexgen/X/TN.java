package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewListener;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TN implements MZ {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ TO A01;

    public TN(TO to, MediaViewListener mediaViewListener) {
        this.A01 = to;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.X.MZ
    public final void A9F() {
        this.A00.onComplete(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MZ
    public final void A9Y() {
        this.A00.onEnterFullscreen(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MZ
    public final void A9e() {
        this.A00.onExitFullscreen(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MZ
    public final void A9h() {
        this.A00.onFullscreenBackground(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MZ
    public final void A9i() {
        this.A00.onFullscreenForeground(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MZ
    public final void AAS() {
        this.A00.onPlay(this.A01.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MZ
    public final void ABQ() {
        this.A00.onVolumeChange(this.A01.A02, this.A01.A04.getVolume());
    }

    @Override // com.facebook.ads.redexgen.X.MZ
    public final void onPause() {
        this.A00.onPause(this.A01.A02);
    }
}
