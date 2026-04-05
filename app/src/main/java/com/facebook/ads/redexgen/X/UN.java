package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UN implements InterfaceC04806d {
    public final /* synthetic */ US A00;

    public UN(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 9) {
            return this.A00.A08(EnumC04916o.A05);
        }
        if (this.A00.A01 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        US us = this.A00;
        return us.A09(us.A01.nativeLibraryDir);
    }
}
