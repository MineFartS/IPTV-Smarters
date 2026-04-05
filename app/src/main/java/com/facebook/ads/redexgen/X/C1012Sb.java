package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1012Sb implements InterfaceC03812e {
    public final Rect A00 = new Rect();
    public final /* synthetic */ AnonymousClass38 A01;

    public C1012Sb(AnonymousClass38 anonymousClass38) {
        this.A01 = anonymousClass38;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03812e
    public final C3B A8w(View view, C3B c3b) {
        C3B c3bA06 = C2u.A06(view, c3b);
        if (c3bA06.A08()) {
            return c3bA06;
        }
        Rect rect = this.A00;
        rect.left = c3bA06.A04();
        rect.top = c3bA06.A06();
        rect.right = c3bA06.A05();
        rect.bottom = c3bA06.A03();
        int childCount = this.A01.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C3B c3bA05 = C2u.A05(this.A01.getChildAt(i2), c3bA06);
            rect.left = Math.min(c3bA05.A04(), rect.left);
            rect.top = Math.min(c3bA05.A06(), rect.top);
            rect.right = Math.min(c3bA05.A05(), rect.right);
            rect.bottom = Math.min(c3bA05.A03(), rect.bottom);
        }
        return c3bA06.A07(rect.left, rect.top, rect.right, rect.bottom);
    }
}
