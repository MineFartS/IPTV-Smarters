package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A6 implements Comparable<A6> {
    public int A00;
    public long A01;

    @Nullable
    public Object A02;
    public final AV A03;

    public A6(AV av) {
        this.A03 = av;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull A6 a6) {
        if ((this.A02 == null) != (a6.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i2 = this.A00 - a6.A00;
        if (i2 != 0) {
            return i2;
        }
        return J1.A07(this.A01, a6.A01);
    }

    public final void A01(int i2, long j2, Object obj) {
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = obj;
    }
}
