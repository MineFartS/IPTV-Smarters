package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03922p extends C0580Al implements Comparable<C03922p> {
    public long A00;

    public C03922p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull C03922p c03922p) {
        if (A04() != c03922p.A04()) {
            return A04() ? 1 : -1;
        }
        long j2 = ((YH) this).A00 - ((YH) c03922p).A00;
        if (j2 == 0) {
            j2 = this.A00 - c03922p.A00;
            if (j2 == 0) {
                return 0;
            }
        }
        return j2 > 0 ? 1 : -1;
    }
}
