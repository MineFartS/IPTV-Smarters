package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JO {

    @Nullable
    public final Handler A00;

    @Nullable
    public final JP A01;

    public JO(@Nullable Handler handler, @Nullable JP jp) {
        this.A00 = jp != null ? (Handler) IM.A01(handler) : null;
        this.A01 = jp;
    }

    public final void A01(int i2, int i3, int i4, float f2) {
        if (this.A01 != null) {
            this.A00.post(new JL(this, i2, i3, i4, f2));
        }
    }

    public final void A02(int i2, long j2) {
        if (this.A01 != null) {
            this.A00.post(new JK(this, i2, j2));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new JM(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new JJ(this, format));
        }
    }

    public final void A05(BZ bz) {
        if (this.A01 != null) {
            this.A00.post(new JN(this, bz));
        }
    }

    public final void A06(BZ bz) {
        if (this.A01 != null) {
            this.A00.post(new JH(this, bz));
        }
    }

    public final void A07(String str, long j2, long j3) {
        if (this.A01 != null) {
            this.A00.post(new JI(this, str, j2, j3));
        }
    }
}
