package com.facebook.ads.redexgen.X;

import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7M extends KS {
    public static String[] A01;
    public final C9F<K5> A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"4h8fvEACfo1aNbNL", "KiY64Fil", "L", "TPcthrsJz3ToBiwYAQ4xewU", "cWfSExW1cmjdZd3Ek8eXqqhjC3VFU", "NINEnIjXlG8iO8hrf55I2V2lHb1VufX", "CO", "8GF4DU4RrtKBXlYvExHV9F2Nh74lSozH"};
    }

    public C7M(X2 x2) {
        this(x2, null);
    }

    public C7M(X2 x2, AttributeSet attributeSet) {
        this(x2, attributeSet, 0);
    }

    public C7M(X2 x2, AttributeSet attributeSet, int i2) {
        super(x2, attributeSet, i2);
        this.A00 = new HI(this);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iApplyDimension, iApplyDimension);
        layoutParams.addRule(13);
        addView(progressBar, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.KS
    public final void A07() {
        super.A07();
        setVisibility(0);
        if (getVideoView() != null) {
            C0854Lx videoView = getVideoView();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "LLc1CvKTLQ71W60sfu5S1t2gX7MmeGtJ";
            strArr2[7] = "LLc1CvKTLQ71W60sfu5S1t2gX7MmeGtJ";
            videoView.getEventBus().A06(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.KS
    public final void A08() {
        if (getVideoView() != null) {
            C9E<C9F, C9D> eventBus = getVideoView().getEventBus();
            C9F<K5> c9f = this.A00;
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "4Zu3PRCBzV1MZjgNBq7KORh";
            strArr2[1] = "VnRIjxfO";
            eventBus.A07(c9f);
        }
        setVisibility(8);
        super.A08();
    }
}
