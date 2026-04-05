package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0902Nu implements DialogInterface.OnClickListener {
    public final /* synthetic */ C0904Nw A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public DialogInterfaceOnClickListenerC0902Nu(C0904Nw c0904Nw, String str, Map map) {
        this.A00 = c0904Nw;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.A00.A04.A8P(this.A01, this.A02);
    }
}
