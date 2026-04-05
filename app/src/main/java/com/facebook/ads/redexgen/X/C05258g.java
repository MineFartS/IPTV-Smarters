package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05258g extends AbstractC0980Qv {

    @Nullable
    public O9 A00;
    public final InterfaceC04464u A01;
    public final AtomicBoolean A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;

    public C05258g(X2 x2, InterfaceC0878Mw interfaceC0878Mw, JZ jz, AnonymousClass16 anonymousClass16, C7C c7c, MR mr) {
        super(x2, interfaceC0878Mw, jz, anonymousClass16, c7c, mr);
        this.A01 = new C0979Qu(this);
        this.A03 = new AtomicBoolean(false);
        this.A02 = new AtomicBoolean(false);
        this.A04 = new AtomicBoolean(false);
    }

    private O9 A01(int i2) {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new XE(imageView, super.A03).A06(super.A01.A0M().A0E().A00(), super.A01.A0M().A0E().A01()).A07(new C0977Qs(this)).A08(super.A01.A0M().A0E().A07());
        return OA.A00(new OC(super.A03, super.A04, this.A08, super.A01, imageView, this.A0A, this.A06).A0D(this.A07.getToolbarHeight()).A0F(this.A07).A0C(i2).A0H(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A03.get() && this.A02.get()) {
            A0Q();
        }
    }

    private void A06(int i2) {
        C0856Lz.A0M(this.A00);
        this.A00 = A01(i2);
        C1H colors = this.A00.getColors();
        O9 o9 = this.A00;
        C0856Lz.A0P(this, colors.A07(o9 != null && (o9.A0c() || (this.A00 instanceof X4))));
        this.A07.A05(colors, this.A00.A0c());
        addView(this.A00, 0, AbstractC0980Qv.A0D);
        O9 o92 = this.A00;
        setUpFullscreenMode(o92 != null && o92.A0c());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Qv
    public final void A0R() {
        C0856Lz.A0O(this.A00);
        C0856Lz.A0O(this.A07);
        this.A02.set(true);
        A05();
        int iA03 = super.A01.A0M().A0E().A03();
        if (iA03 > 0) {
            O9 o9 = this.A00;
            if (o9 != null) {
                o9.A0a();
            }
            A0S(iA03, new C0978Qt(this));
            return;
        }
        this.A04.set(true);
        this.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Qv
    public final void A0T(C04484w c04484w) {
        c04484w.A0L(this.A01);
        A06(c04484w.A0I().getResources().getConfiguration().orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        C0856Lz.A0K(this.A00);
        C0856Lz.A0K(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Qv
    public final boolean A0U() {
        O9 o9 = this.A00;
        return o9 != null && o9.A0d(false);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAQ(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAn(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        O9 o9 = this.A00;
        if (o9 != null) {
            return o9.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Qv, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A06(configuration.orientation);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Qv, com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        O9 o9 = this.A00;
        if (o9 != null) {
            o9.A0W();
        }
        super.onDestroy();
    }
}
