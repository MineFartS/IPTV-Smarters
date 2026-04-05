package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HD implements Comparable<HD> {
    public final int A00;
    public final H9 A01;

    public HD(int i2, H9 h9) {
        this.A00 = i2;
        this.A01 = h9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull HD hd) {
        return this.A00 - hd.A00;
    }
}
