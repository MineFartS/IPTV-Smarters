package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EZ extends C1028Ss {
    public final /* synthetic */ T8 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZ(T8 t8, Context context) {
        super(context);
        this.A00 = t8;
    }

    @Override // com.facebook.ads.redexgen.X.C1028Ss, com.facebook.ads.redexgen.X.C4S
    public final void A0J(View view, C4U c4u, C4Q c4q) {
        T8 t8 = this.A00;
        int[] iArrA0J = t8.A0J(t8.A00.getLayoutManager(), view);
        int i2 = iArrA0J[0];
        int i3 = iArrA0J[1];
        int iA0N = A0N(Math.max(Math.abs(i2), Math.abs(i3)));
        if (iA0N > 0) {
            c4q.A05(i2, i3, iA0N, ((C1028Ss) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1028Ss
    public final float A0K(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
