package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Ek implements Comparable<Ek> {
    public final long A00;
    public final C0744Hl A01;

    public Ek(long j2, C0744Hl c0744Hl) {
        this.A00 = j2;
        this.A01 = c0744Hl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull Ek ek) {
        long j2 = this.A00 - ek.A00;
        if (j2 == 0) {
            return 0;
        }
        return j2 < 0 ? -1 : 1;
    }
}
