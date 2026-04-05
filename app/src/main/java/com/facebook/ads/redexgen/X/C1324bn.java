package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1324bn implements IP {
    @Override // com.facebook.ads.redexgen.X.IP
    public final IZ A4J(Looper looper, @Nullable Handler.Callback callback) {
        return new C1325bo(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.X.IP
    public final long A4s() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.X.IP
    public final long ADi() {
        return SystemClock.uptimeMillis();
    }
}
