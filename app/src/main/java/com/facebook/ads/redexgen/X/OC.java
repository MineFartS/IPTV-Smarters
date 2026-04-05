package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OC {

    @Nullable
    public View A02;

    @Nullable
    public MM A03;

    @Nullable
    public H8 A04;
    public final View A05;
    public final AnonymousClass16 A06;
    public final X2 A07;
    public final JZ A08;
    public final C0849Ls A09;
    public final MR A0A;
    public final Q2 A0B;
    public int A01 = 0;
    public int A00 = 1;

    public OC(X2 x2, JZ jz, MR mr, AnonymousClass16 anonymousClass16, View view, Q2 q2, C0849Ls c0849Ls) {
        this.A07 = x2;
        this.A08 = jz;
        this.A0A = mr;
        this.A06 = anonymousClass16;
        this.A05 = view;
        this.A0B = q2;
        this.A09 = c0849Ls;
    }

    public final OC A0C(int i2) {
        this.A00 = i2;
        return this;
    }

    public final OC A0D(int i2) {
        this.A01 = i2;
        return this;
    }

    public final OC A0E(View view) {
        this.A02 = view;
        return this;
    }

    public final OC A0F(MM mm) {
        this.A03 = mm;
        return this;
    }

    public final OC A0G(H8 h8) {
        this.A04 = h8;
        return this;
    }

    public final OD A0H() {
        return new OD(this);
    }
}
