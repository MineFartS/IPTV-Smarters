package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class yp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f23803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f23804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f23805c;

    public /* synthetic */ yp(MediaCodec mediaCodec) {
        this.f23803a = mediaCodec;
        if (amn.f20135a < 21) {
            this.f23804b = mediaCodec.getInputBuffers();
            this.f23805c = mediaCodec.getOutputBuffers();
        }
    }

    public final int a() {
        return this.f23803a.dequeueInputBuffer(0L);
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f23803a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                if (amn.f20135a < 21) {
                    this.f23805c = this.f23803a.getOutputBuffers();
                }
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    public final MediaFormat c() {
        return this.f23803a.getOutputFormat();
    }

    public final ByteBuffer d(int i2) {
        return amn.f20135a >= 21 ? this.f23803a.getInputBuffer(i2) : ((ByteBuffer[]) amn.A(this.f23804b))[i2];
    }

    public final ByteBuffer e(int i2) {
        return amn.f20135a >= 21 ? this.f23803a.getOutputBuffer(i2) : ((ByteBuffer[]) amn.A(this.f23805c))[i2];
    }

    public final void f() {
        this.f23803a.flush();
    }

    public final void g() {
        this.f23804b = null;
        this.f23805c = null;
        this.f23803a.release();
    }

    public final void h(int i2, long j2) {
        this.f23803a.releaseOutputBuffer(i2, j2);
    }

    public final void i(int i2, boolean z) {
        this.f23803a.releaseOutputBuffer(i2, z);
    }

    public final void j(final xw xwVar, Handler handler) {
        this.f23803a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.ads.interactivemedia.v3.internal.yn
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
                xwVar.a(j2);
            }
        }, handler);
    }

    public final void k(Surface surface) {
        this.f23803a.setOutputSurface(surface);
    }

    public final void l(Bundle bundle) {
        this.f23803a.setParameters(bundle);
    }

    public final void m(int i2) {
        this.f23803a.setVideoScalingMode(i2);
    }

    public final void n(int i2, int i3, long j2, int i4) {
        this.f23803a.queueInputBuffer(i2, 0, i3, j2, i4);
    }

    public final void o(int i2, pv pvVar, long j2) {
        this.f23803a.queueSecureInputBuffer(i2, 0, pvVar.a(), j2, 0);
    }
}
