package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MB implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1237aO A00;

    public MB(C1237aO c1237aO) {
        this.A00 = c1237aO;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        dialogInterface.cancel();
    }
}
