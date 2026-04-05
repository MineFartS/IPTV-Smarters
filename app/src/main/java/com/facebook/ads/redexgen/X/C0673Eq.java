package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@RequiresApi(16)
public class C0673Eq extends C1011Sa {
    @Override // com.facebook.ads.redexgen.X.C03962t
    public final int A04(View view) {
        return view.getImportantForAccessibility();
    }

    @Override // com.facebook.ads.redexgen.X.C03962t
    public final int A06(View view) {
        return view.getMinimumHeight();
    }

    @Override // com.facebook.ads.redexgen.X.C03962t
    public final int A07(View view) {
        return view.getMinimumWidth();
    }

    @Override // com.facebook.ads.redexgen.X.C03962t
    public final void A0B(View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // com.facebook.ads.redexgen.X.C03962t
    public void A0D(View view, int i2) {
        if (i2 == 4) {
            i2 = 2;
        }
        view.setImportantForAccessibility(i2);
    }

    @Override // com.facebook.ads.redexgen.X.C03962t
    public final void A0G(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // com.facebook.ads.redexgen.X.C03962t
    public final void A0H(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    @Override // com.facebook.ads.redexgen.X.C03962t
    public final boolean A0I(View view) {
        return view.hasTransientState();
    }
}
