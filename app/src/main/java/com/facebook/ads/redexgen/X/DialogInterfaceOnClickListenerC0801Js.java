package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0801Js implements DialogInterface.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC1322bl A00;

    public DialogInterfaceOnClickListenerC0801Js(ViewOnClickListenerC1322bl viewOnClickListenerC1322bl) {
        this.A00 = viewOnClickListenerC1322bl;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        if (this.A00.A01.A0W == null) {
            return;
        }
        this.A00.A01.A0W.A0c(this.A00.A01());
    }
}
