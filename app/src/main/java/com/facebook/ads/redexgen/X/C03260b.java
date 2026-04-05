package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@RequiresApi(21)
public class C03260b extends AnonymousClass18 {
    @Override // com.facebook.ads.redexgen.X.C03962t
    public final C3B A09(View view, C3B c3b) {
        WindowInsets windowInsets = (WindowInsets) C3B.A01(c3b);
        WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (windowInsetsDispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(windowInsetsDispatchApplyWindowInsets);
        }
        return C3B.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.X.C03962t
    public final C3B A0A(View view, C3B c3b) {
        WindowInsets windowInsets = (WindowInsets) C3B.A01(c3b);
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (windowInsetsOnApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(windowInsetsOnApplyWindowInsets);
        }
        return C3B.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.X.C03962t
    public final void A0C(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.C03962t
    public final void A0F(View view, final InterfaceC03812e interfaceC03812e) {
        if (interfaceC03812e == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.2s
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return (WindowInsets) C3B.A01(interfaceC03812e.A8w(view2, C3B.A00(windowInsets)));
                }
            });
        }
    }
}
