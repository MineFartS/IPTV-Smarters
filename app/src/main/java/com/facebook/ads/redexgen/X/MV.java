package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MV implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public MV(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (this.A00.A00 != null && this.A00.A05.A03()) {
                this.A00.A00.A9E();
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
