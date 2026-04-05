package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(23)
public final class JC implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C03751y A00;

    public JC(C03751y c03751y, MediaCodec mediaCodec) {
        this.A00 = c03751y;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(@NonNull MediaCodec mediaCodec, long j2, long j3) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A1T();
    }
}
