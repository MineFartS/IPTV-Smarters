package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.18, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@RequiresApi(19)
public class AnonymousClass18 extends AnonymousClass29 {
    @Override // com.facebook.ads.redexgen.X.C0673Eq, com.facebook.ads.redexgen.X.C03962t
    public final void A0D(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    @Override // com.facebook.ads.redexgen.X.C03962t
    public final boolean A0J(View view) {
        return view.isAttachedToWindow();
    }
}
