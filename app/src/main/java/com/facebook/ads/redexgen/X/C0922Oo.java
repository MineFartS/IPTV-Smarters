package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0922Oo extends FrameLayout {
    public static final int A07 = (int) (C0856Lz.A01 * 16.0f);
    public C05529i A00;

    @Nullable
    public C7r A01;
    public C0743Hk A02;
    public C7V A03;
    public AnonymousClass76 A04;
    public final X2 A05;
    public final C0789Jg A06;

    public C0922Oo(X2 x2, C0789Jg c0789Jg) {
        super(x2);
        this.A06 = c0789Jg;
        this.A05 = x2;
        setUpView(x2);
    }

    public final void A01() {
        A0b(true, 10);
    }

    public final void A02() {
        C7r c7r = this.A01;
        if (c7r != null) {
            c7r.A0h();
            this.A01 = null;
        }
    }

    public final void A03(C9F c9f) {
        getEventBus().A06(c9f);
    }

    public final void A04(JZ jz, String str, Map<String, String> extraParams) {
        A02();
        this.A01 = new C7r(this.A05, jz, this.A00, str, extraParams);
    }

    public final void A05(PD pd) {
        A0Y(pd, 13);
    }

    public final boolean A06() {
        return A0h();
    }

    @VisibleForTesting
    public C0854Lx getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A03.setImage(str);
    }

    private void setUpPlugins(X2 x2) {
        A0U();
        this.A03 = new C7V(x2);
        A0Z(this.A03);
        this.A02 = new C0743Hk(x2, this.A06);
        A0Z(new C05047d(x2));
        A0Z(this.A02);
        this.A04 = new AnonymousClass76(x2, true, this.A06);
        A0Z(this.A04);
        A0Z(new C0745Hn(this.A04, PP.A03, true, true));
        if (!A0d()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i2 = A07;
        layoutParams.setMargins(i2, i2, i2, i2);
        this.A02.setLayoutParams(layoutParams);
        addView(this.A02);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.9i] */
    private void setUpVideo(final X2 x2) {
        this.A00 = new C0854Lx(x2) { // from class: com.facebook.ads.redexgen.X.9i
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int newHeightSpec, int i2) {
                if (View.MeasureSpec.getMode(newHeightSpec) == 1073741824) {
                    i2 = newHeightSpec;
                } else if (View.MeasureSpec.getMode(i2) == 1073741824) {
                    newHeightSpec = i2;
                }
                super.onMeasure(newHeightSpec, i2);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C0856Lz.A0N(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC0921On(this));
    }

    private void setUpView(X2 x2) {
        setUpVideo(x2);
        setUpPlugins(x2);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f2) {
        setVolume(f2);
        this.A02.A0A();
    }
}
