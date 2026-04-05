package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1093Vg implements InterfaceC04806d {
    public final /* synthetic */ C1095Vi A00;

    public C1093Vg(C1095Vi c1095Vi) {
        this.A00 = c1095Vi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A08(EnumC04916o.A05);
        }
        return this.A00.A09(Locale.getDefault().getScript());
    }
}
