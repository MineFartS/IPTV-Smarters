package com.facebook.ads.redexgen.X;

import android.icu.util.TimeZone;
import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1113Wa implements InterfaceC04806d {
    public final /* synthetic */ C1116Wd A00;

    public C1113Wa(C1116Wd c1116Wd) {
        this.A00 = c1116Wd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.A00.A08(EnumC04916o.A05);
        }
        return this.A00.A09(TimeZone.getDefault().getID());
    }
}
