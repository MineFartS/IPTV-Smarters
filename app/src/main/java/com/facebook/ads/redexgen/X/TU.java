package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TU implements AnonymousClass74 {
    public final List<C0986Rb> A00;
    public final /* synthetic */ TV A01;

    public TU(TV tv2, List<C0986Rb> list) {
        this.A01 = tv2;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A00.A07(true);
        this.A01.A00.A04();
        this.A01.A00.A05(0);
        Iterator<C0986Rb> it = this.A00.iterator();
        while (it.hasNext()) {
            this.A01.A00.A06(new NativeAd(this.A01.A01, new C1320bj(this.A01.A01, it.next(), null, C1320bj.A0I(), this.A01.A00.A03())));
        }
        C0821Ko.A00(new TT(this));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9B() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9I() {
        A00();
    }
}
