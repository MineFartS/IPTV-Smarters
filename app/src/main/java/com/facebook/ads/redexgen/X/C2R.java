package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2R, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2R extends C0660Eb {
    public C2R(X2 x2) {
        super(x2);
        setCarouselLayoutManager(x2);
    }

    @Override // com.facebook.ads.redexgen.X.C0660Eb
    public C1027Sr getLayoutManager() {
        return (C1027Sr) super.getLayoutManager();
    }

    private void setCarouselLayoutManager(X2 x2) {
        C1027Sr c1027Sr = new C1027Sr(x2, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1027Sr.A1W(true);
        }
        super.setLayoutManager(c1027Sr);
    }

    @Override // com.facebook.ads.redexgen.X.C0660Eb
    public void setLayoutManager(C4F c4f) {
    }
}
