package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OR {
    public static R6 A00(final OD od, int i2, final String str, final PI pi) {
        return i2 == 1 ? new R6(od, str, pi) { // from class: com.facebook.ads.redexgen.X.8o
            public static final int A00 = (int) (C0856Lz.A01 * 20.0f);
            public static final int A01 = (int) (C0856Lz.A01 * 16.0f);

            @Override // com.facebook.ads.redexgen.X.O9
            public final boolean A0O() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.R6
            public final void A0h(X2 x2) {
                O6 titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                titleDescContainer.setPadding(0, 0, 0, A00);
                getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                LinearLayout linearLayout = new LinearLayout(x2);
                C0856Lz.A0W(linearLayout, new ColorDrawable(-1));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setOrientation(1);
                int i3 = A01;
                linearLayout.setPadding(i3, i3, i3, i3);
                linearLayout.addView(titleDescContainer);
                linearLayout.addView(getCtaButton());
                addView(getMediaContainer());
                addView(linearLayout);
            }
        } : new R6(od, str, pi) { // from class: com.facebook.ads.redexgen.X.9Q
            public static final int A00 = (int) (C0856Lz.A01 * 12.0f);

            @Override // com.facebook.ads.redexgen.X.R6, com.facebook.ads.redexgen.X.O9
            public final boolean A0M() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.O9
            public final boolean A0N() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.R6
            public final void A0h(X2 x2) {
                O6 titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(layoutParams);
                int i3 = A00;
                titleDescContainer.setPadding(i3, i3, i3, i3);
                C0856Lz.A0V(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams2);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
