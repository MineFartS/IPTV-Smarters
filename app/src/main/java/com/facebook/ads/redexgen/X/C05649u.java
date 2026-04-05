package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C05649u extends C1028Ss {
    public final /* synthetic */ C05629s A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05649u(C05629s c05629s, X2 x2) {
        super(x2);
        this.A00 = c05629s;
    }

    @Override // com.facebook.ads.redexgen.X.C1028Ss
    public final float A0K(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C1028Ss
    public final int A0L() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.C1028Ss
    public final int A0P(View view, int left) {
        C4F c4fA09 = A09();
        if (!c4fA09.A25()) {
            return 0;
        }
        C4G c4g = (C4G) view.getLayoutParams();
        int start = c4fA09.A0l(view) - c4g.leftMargin;
        int end = c4fA09.A0o(view) + c4g.rightMargin;
        return A0O(start, end, c4fA09.A0f(), c4fA09.A0i() - c4fA09.A0g(), left) + this.A00.A02;
    }

    @Override // com.facebook.ads.redexgen.X.C1028Ss
    public final PointF A0Q(int i2) {
        return this.A00.A45(i2);
    }
}
