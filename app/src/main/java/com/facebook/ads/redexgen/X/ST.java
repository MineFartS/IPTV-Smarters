package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ST<K, V> extends C2P<K, V> {
    public final /* synthetic */ SU A00;

    public ST(SU su) {
        this.A00 = su;
    }

    @Override // com.facebook.ads.redexgen.X.C2P
    public final int A05() {
        return ((C2S) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.X.C2P
    public final int A06(Object obj) {
        return this.A00.A09(obj);
    }

    @Override // com.facebook.ads.redexgen.X.C2P
    public final int A07(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.X.C2P
    public final Object A08(int i2, int i3) {
        return this.A00.A02[(i2 << 1) + i3];
    }

    @Override // com.facebook.ads.redexgen.X.C2P
    public final V A09(int i2, V v) {
        V value = this.A00.A0D(i2, v);
        return value;
    }

    @Override // com.facebook.ads.redexgen.X.C2P
    public final Map<K, V> A0B() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C2P
    public final void A0E() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.X.C2P
    public final void A0F(int i2) {
        this.A00.A0B(i2);
    }

    @Override // com.facebook.ads.redexgen.X.C2P
    public final void A0G(K k2, V v) {
        this.A00.put(k2, v);
    }
}
