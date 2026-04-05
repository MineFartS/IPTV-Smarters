package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AL extends AbstractC1280b5 {
    public final int A00;

    @Nullable
    public final Object A01;

    public AL(TrackGroup trackGroup, int i2) {
        this(trackGroup, i2, 0, null);
    }

    public AL(TrackGroup trackGroup, int i2, int i3, @Nullable Object obj) {
        super(trackGroup, i2);
        this.A00 = i3;
        this.A01 = obj;
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final int A6z() {
        return 0;
    }
}
