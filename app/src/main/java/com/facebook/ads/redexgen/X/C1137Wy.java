package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1137Wy extends AbstractRunnableC0829Kx {
    public final /* synthetic */ AnonymousClass74 A00;
    public final /* synthetic */ AnonymousClass75 A01;
    public final /* synthetic */ C7C A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1137Wy(C7C c7c, ArrayList arrayList, AnonymousClass74 anonymousClass74, AnonymousClass75 anonymousClass75, ArrayList arrayList2) {
        this.A02 = c7c;
        this.A03 = arrayList;
        this.A00 = anonymousClass74;
        this.A01 = anonymousClass75;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        AtomicBoolean atomicBooleanA0B = C7C.A0B(this.A03);
        if (this.A02.A04 instanceof X2) {
            X2 x2 = (X2) this.A02.A04;
            if (atomicBooleanA0B.get()) {
                x2.A0A().A3w(C0848Lr.A01(this.A02.A00));
            } else {
                x2.A0A().A3v(C0848Lr.A01(this.A02.A00));
            }
        }
        this.A02.A02.post(new C1136Wx(this, atomicBooleanA0B));
        C7C.A0B(this.A04);
    }
}
