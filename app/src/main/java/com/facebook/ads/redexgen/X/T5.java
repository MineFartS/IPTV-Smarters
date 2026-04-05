package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class T5 extends C2Y {
    public static String[] A02;
    public final C2Y A00 = new T4(this);
    public final C0660Eb A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"kCJseLSqSIrXu4CFjUZgH7qP37OfZeHD", "xEAmwUG5TGVzyoKH1PTTnmgJSds6zi0t", "yfye5wiKddzXjwKpYSAHRZ10SdbOyGIS", "FmBYeFx3U0BhjOzbepjZtX", "pFd99JFbVQiCxR8NKRmLZvqZPwpJ8hMq", "9sA", "zOMSQIOQC2uzgyYA4i3GoXbtL5yC1N4Y", "6JUJmYz6"};
    }

    public T5(C0660Eb c0660Eb) {
        this.A01 = c0660Eb;
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C0660Eb.class.getName());
        if ((view instanceof C0660Eb) && !A0B()) {
            C0660Eb c0660Eb = (C0660Eb) view;
            if (c0660Eb.getLayoutManager() != null) {
                c0660Eb.getLayoutManager().A1y(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final void A08(View view, C3J c3j) {
        super.A08(view, c3j);
        c3j.A0P(C0660Eb.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1G(c3j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final boolean A09(View view, int i2, Bundle bundle) {
        if (super.A09(view, i2, bundle)) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[0].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            strArr2[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            C4F layoutManager = this.A01.getLayoutManager();
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A02;
            strArr3[7] = "ZdbAAVtg";
            strArr3[3] = "rBKlzqXoYmUf6BYv0O8fT1";
            return layoutManager.A1a(i2, bundle);
        }
        return false;
    }

    public final C2Y A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1u();
    }
}
