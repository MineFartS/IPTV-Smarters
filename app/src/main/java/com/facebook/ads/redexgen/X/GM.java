package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GM {
    public final long A00;

    @Nullable
    public final String A01;
    public final List<GI> A02;
    public final List<GL> A03;

    public GM(@Nullable String str, long j2, List<GI> list, List<GL> list2) {
        this.A01 = str;
        this.A00 = j2;
        this.A02 = Collections.unmodifiableList(list);
        this.A03 = Collections.unmodifiableList(list2);
    }
}
