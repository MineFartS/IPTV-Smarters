package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class B5 {

    @Nullable
    public final Handler A00;

    @Nullable
    public final B6 A01;

    public B5(@Nullable Handler handler, @Nullable B6 b6) {
        this.A00 = b6 != null ? (Handler) IM.A01(handler) : null;
        this.A01 = b6;
    }

    public final void A01(int i2) {
        if (this.A01 != null) {
            this.A00.post(new B4(this, i2));
        }
    }

    public final void A02(int i2, long j2, long j3) {
        if (this.A01 != null) {
            this.A00.post(new B2(this, i2, j2, j3));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new B1(this, format));
        }
    }

    public final void A04(BZ bz) {
        if (this.A01 != null) {
            this.A00.post(new B3(this, bz));
        }
    }

    public final void A05(BZ bz) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0594Az(this, bz));
        }
    }

    public final void A06(String str, long j2, long j3) {
        if (this.A01 != null) {
            this.A00.post(new B0(this, str, j2, j3));
        }
    }
}
