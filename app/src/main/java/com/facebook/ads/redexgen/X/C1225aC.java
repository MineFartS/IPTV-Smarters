package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1225aC implements InterfaceC0706Fz {

    @Nullable
    public CI A02;

    @Nullable
    public Object A03;

    @Nullable
    public String A04;
    public boolean A05;
    public final InterfaceC0739Hg A06;
    public int A01 = -1;
    public int A00 = Constants.MB;

    public C1225aC(InterfaceC0739Hg interfaceC0739Hg) {
        this.A06 = interfaceC0739Hg;
    }

    public final BN A00(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new YZ();
        }
        return new BN(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}
