package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1325bo implements IZ {
    public final Handler A00;

    public C1325bo(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final Looper A6X() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final Message A8g(int i2, int i3, int i4) {
        return this.A00.obtainMessage(i2, i3, i4);
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final Message A8h(int i2, int i3, int i4, Object obj) {
        return this.A00.obtainMessage(i2, i3, i4, obj);
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final Message A8i(int i2, Object obj) {
        return this.A00.obtainMessage(i2, obj);
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final void ACQ(int i2) {
        this.A00.removeMessages(i2);
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final boolean ACs(int i2) {
        return this.A00.sendEmptyMessage(i2);
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final boolean ACt(int i2, long j2) {
        return this.A00.sendEmptyMessageAtTime(i2, j2);
    }
}
