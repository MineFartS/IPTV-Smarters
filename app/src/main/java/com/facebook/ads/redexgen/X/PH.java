package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PH extends AnonymousClass43<OL> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    @Nullable
    public MR A04;
    public String A05;
    public List<C0919Ol> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass16 A08;
    public final C7C A09;
    public final X2 A0A;
    public final JZ A0B;
    public final C0849Ls A0C;
    public final PI A0D;
    public final Q2 A0E;

    public PH(X2 x2, List<C0919Ol> list, AnonymousClass16 anonymousClass16, JZ jz, C7C c7c, Q2 q2, C0849Ls c0849Ls, MR mr, String str, int i2, int i3, int i4, int i5, PI pi) {
        this.A0A = x2;
        this.A0B = jz;
        this.A09 = c7c;
        this.A0E = q2;
        this.A0C = c0849Ls;
        this.A04 = mr;
        this.A08 = anonymousClass16;
        this.A06 = list;
        this.A00 = i2;
        this.A03 = i5;
        this.A05 = str;
        this.A01 = i4;
        this.A02 = i3;
        this.A0D = pi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final OL A07(ViewGroup viewGroup, int i2) {
        return new OL(OR.A00(new OC(this.A0A, this.A0B, this.A04, this.A08, null, this.A0E, this.A0C).A0H(), this.A03, this.A05, this.A0D), this.A07, this.A0E, this.A00, this.A01, this.A02, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0F(OL ol, int i2) {
        ol.A0m(this.A06.get(i2), this.A0B, this.A09, this.A0C, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    public final int A0E() {
        return this.A06.size();
    }
}
