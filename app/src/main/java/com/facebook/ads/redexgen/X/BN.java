package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BN extends AbstractC1215a1 implements F8 {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final CI A05;
    public final InterfaceC0739Hg A06;

    @Nullable
    public final Object A07;
    public final String A08;

    public BN(Uri uri, InterfaceC0739Hg interfaceC0739Hg, CI ci, int i2, @Nullable String str, int i3, @Nullable Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0739Hg;
        this.A05 = ci;
        this.A03 = i2;
        this.A08 = str;
        this.A02 = i3;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j2, boolean z) {
        this.A00 = j2;
        this.A01 = z;
        A01(new C1232aJ(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1215a1
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1215a1
    public final void A03(InterfaceC1163Xy interfaceC1163Xy, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.X.FD
    public final InterfaceC1228aF A4Q(FB fb, HZ hz) {
        IM.A03(fb.A02 == 0);
        return new BQ(this.A04, this.A06.A4E(), this.A05.A4I(), this.A03, A00(fb), this, hz, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.FD
    public final void A8a() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.F8
    public final void AAy(long j2, boolean z) {
        if (j2 == -9223372036854775807L) {
            j2 = this.A00;
        }
        if (this.A00 == j2 && this.A01 == z) {
            return;
        }
        A00(j2, z);
    }

    @Override // com.facebook.ads.redexgen.X.FD
    public final void ACL(InterfaceC1228aF interfaceC1228aF) {
        ((BQ) interfaceC1228aF).A0S();
    }
}
