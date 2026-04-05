package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1026Sq extends O9 {
    public static final int A01 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final OK A00;

    public C1026Sq(OD od, boolean z) {
        super(od, z);
        this.A00 = new OK(od.A05(), od.A02());
        this.A00.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(O9.A09, O9.A09, O9.A09, O9.A09);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(od.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(O9.A09, 0, O9.A09, 0);
        frameLayout.addView(this.A00, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final boolean A0M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final boolean A0P() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void A0b(AnonymousClass19 anonymousClass19, String str, double d2, @Nullable Bundle bundle) {
        super.A0b(anonymousClass19, str, d2, bundle);
        if (d2 > 0.0d) {
            this.A00.A00((int) (((double) (A01 - (O9.A09 * 2))) / d2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final boolean A0c() {
        return false;
    }
}
