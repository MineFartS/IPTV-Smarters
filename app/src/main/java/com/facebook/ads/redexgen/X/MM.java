package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.widget.LinearLayout;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class MM extends LinearLayout {
    public static int A00 = (int) (C0856Lz.A01 * 56.0f);

    public abstract void A05(C1H c1h, boolean z);

    public abstract boolean A07();

    public abstract int getToolbarHeight();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setPageDetails(C1Q c1q, String str, int i2, C1X c1x);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f2);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i2);

    public abstract void setToolbarListener(ML ml);

    public MM(Context context) {
        super(context);
    }

    public void A06(InterfaceC0868Ml interfaceC0868Ml) {
    }
}
