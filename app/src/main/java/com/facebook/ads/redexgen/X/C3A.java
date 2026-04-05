package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3A {
    public static final AnonymousClass39 A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C0672Ep();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C1015Sf();
        } else {
            A00 = new AnonymousClass39();
        }
    }

    public static void A00(ViewParent viewParent, View view, int i2) {
        if (viewParent instanceof SZ) {
            throw null;
        }
        if (i2 == 0) {
            A00.A03(viewParent, view);
        }
    }

    public static void A01(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6) {
        if (viewParent instanceof SZ) {
            throw null;
        }
        if (i6 == 0) {
            A00.A04(viewParent, view, i2, i3, i4, i5);
        }
    }

    public static void A02(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
        if (viewParent instanceof SZ) {
            throw null;
        }
        if (i4 == 0) {
            A00.A05(viewParent, view, i2, i3, iArr);
        }
    }

    public static void A03(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof SZ) {
            throw null;
        }
        if (i3 == 0) {
            A00.A06(viewParent, view, view2, i2);
        }
    }

    public static boolean A04(ViewParent viewParent, View view, float f2, float f3) {
        return A00.A07(viewParent, view, f2, f3);
    }

    public static boolean A05(ViewParent viewParent, View view, float f2, float f3, boolean z) {
        return A00.A08(viewParent, view, f2, f3, z);
    }

    public static boolean A06(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof SZ) {
            return ((SZ) viewParent).onStartNestedScroll(view, view2, i2, i3);
        }
        if (i3 == 0) {
            return A00.A09(viewParent, view, view2, i2);
        }
        return false;
    }
}
