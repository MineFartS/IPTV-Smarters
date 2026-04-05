package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AV {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final AT A0A;
    public final AU A0B;
    public final AbstractC0573Ae A0C;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public AV(AT at, AU au, AbstractC0573Ae abstractC0573Ae, int i2, Handler handler) {
        this.A0A = at;
        this.A0B = au;
        this.A0C = abstractC0573Ae;
        this.A03 = handler;
        this.A01 = i2;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final AU A04() {
        return this.A0B;
    }

    public final AV A05() {
        IM.A04(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            IM.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.ACu(this);
        return this;
    }

    public final AV A06(int i2) {
        IM.A04(!this.A09);
        this.A00 = i2;
        return this;
    }

    public final AV A07(@Nullable Object obj) {
        IM.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final AbstractC0573Ae A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z) {
        this.A07 |= z;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        IM.A04(this.A09);
        IM.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
