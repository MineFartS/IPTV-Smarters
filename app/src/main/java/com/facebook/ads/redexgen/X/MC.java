package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MC implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C1237aO A01;

    public MC(C1237aO c1237aO, EditText editText) {
        this.A01 = c1237aO;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.A01.A02.execute(new C1238aP(this, dialogInterface));
    }
}
