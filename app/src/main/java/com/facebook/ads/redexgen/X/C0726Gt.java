package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0726Gt {
    public C0720Gn A00;
    public C0722Gp A01;
    public final int A02;
    public final int A03;
    public final SparseArray<C0724Gr> A08 = new SparseArray<>();
    public final SparseArray<C0719Gm> A06 = new SparseArray<>();
    public final SparseArray<C0721Go> A07 = new SparseArray<>();
    public final SparseArray<C0719Gm> A04 = new SparseArray<>();
    public final SparseArray<C0721Go> A05 = new SparseArray<>();

    public C0726Gt(int i2, int i3) {
        this.A03 = i2;
        this.A02 = i3;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}
