package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"HandlerLeak"})
public class HandlerC0607Bp extends Handler {
    public final /* synthetic */ YN A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    public HandlerC0607Bp(YN yn, Looper looper) {
        super(looper);
        this.A00 = yn;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            byte[] bArr = (byte[]) message.obj;
            for (YK yk : this.A00.A09) {
                if (yk.A0O(bArr)) {
                    yk.A0K(message.what);
                    return;
                }
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
