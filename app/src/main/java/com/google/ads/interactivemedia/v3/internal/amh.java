package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class amh implements akt {
    @Override // com.google.ads.interactivemedia.v3.internal.akt
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akt
    public final alc b(Looper looper, Handler.Callback callback) {
        return new amj(new Handler(looper, callback));
    }
}
