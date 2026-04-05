package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7V extends KS {
    public static String[] A04;
    public final ImageView A00;
    public final X2 A01;
    public final C9F<C7q> A02;
    public final C9F<KJ> A03;

    static {
        A00();
    }

    public static void A00() {
        A04 = new String[]{"t7nWMgaAgPrF08nCpsue0KJ0bXYxildh", "6KdtKMmtzfHYFwbGu3Z1Ir1zVfPvm0mZ", "4a3tRJ2Sc2HJRD7iGLBoGFg5dIAFXATk", "UpueiF5Mlf4qFrRwKkN0oaj1wZcm2sVE", "2I2trXzlQyfCpDc0SWIB9I9l1xDqUCt2", "pVCp6f81Bxfp7pGgyLuO3QWY2ZOI1Rz7", "JWrnXr9CYPwxDsxVPLOhiB9OxQPOAEin", "O346HS8RGmqKBjl58VTWQBGWIRLrpgc9"};
    }

    public C7V(X2 x2) {
        super(x2);
        this.A03 = new HQ(this);
        this.A02 = new HN(this);
        this.A01 = x2;
        this.A00 = new ImageView(x2);
        this.A00.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C0856Lz.A0P(this.A00, DefaultRenderer.BACKGROUND_COLOR);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.KS
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.KS
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A05(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.A00.layout(0, 0, i4 - i2, i5 - i3);
    }

    public void setImage(@Nullable String str) {
        setImage(str, null);
    }

    public void setImage(@Nullable String str, @Nullable InterfaceC0896No interfaceC0896No) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        XE xeA05 = new XE(this.A00, this.A01).A05();
        if (interfaceC0896No != null) {
            xeA05.A07(interfaceC0896No);
        }
        xeA05.A08(str);
        String[] strArr = A04;
        if (strArr[0].charAt(21) == strArr[6].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "kA5c9xFlh2VnhKEqDnwhhyQ6vC8xp51l";
        strArr2[6] = "v6NK46wFN1tyoiPUrV3jpTAezqYTXUDI";
    }
}
