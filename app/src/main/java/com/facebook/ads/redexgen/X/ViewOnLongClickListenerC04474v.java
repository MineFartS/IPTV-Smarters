package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnLongClickListenerC04474v implements View.OnLongClickListener {
    public final /* synthetic */ C04484w A00;

    public ViewOnLongClickListenerC04474v(C04484w c04484w) {
        this.A00 = c04484w;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00.A0B != null && this.A00.A06 != null) {
            this.A00.A0B.setBounds(0, 0, this.A00.A06.getWidth(), this.A00.A06.getHeight());
            this.A00.A0B.A0E(!this.A00.A0B.A0F());
        }
        return true;
    }
}
