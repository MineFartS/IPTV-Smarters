package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1086Uz implements InterfaceC04806d {
    public final /* synthetic */ VJ A00;

    public C1086Uz(VJ vj) {
        this.A00 = vj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A08(EnumC04916o.A05);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            return this.A00.A0F(Arrays.asList(strArr));
        }
        return this.A00.A08(EnumC04916o.A07);
    }
}
