package com.google.android.exoplayer2.ext.av1;

import android.view.Surface;
import c.f.a.b.j3.x0;
import c.f.a.b.k3.w;
import c.f.a.b.v2.h;
import c.f.a.b.v2.i;
import c.f.a.b.y2.a.b;
import c.f.a.b.y2.a.c;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Gav1Decoder extends i<w, VideoDecoderOutputBuffer, b> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f23899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile int f23900o;

    public Gav1Decoder(int i2, int i3, int i4, int i5) throws b {
        super(new w[i2], new VideoDecoderOutputBuffer[i3]);
        if (!c.a()) {
            throw new b("Failed to load decoder native library.");
        }
        if (i5 == 0 && (i5 = gav1GetThreads()) <= 0) {
            i5 = Runtime.getRuntime().availableProcessors();
        }
        long jGav1Init = gav1Init(i5);
        this.f23899n = jGav1Init;
        if (jGav1Init != 0 && gav1CheckError(jGav1Init) != 0) {
            u(i4);
            return;
        }
        throw new b("Failed to initialize decoder. Error: " + gav1GetErrorMessage(jGav1Init));
    }

    public void A(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws b {
        if (videoDecoderOutputBuffer.mode != 1) {
            throw new b("Invalid output mode.");
        }
        if (gav1RenderFrame(this.f23899n, surface, videoDecoderOutputBuffer) != 0) {
            return;
        }
        throw new b("Buffer render error: " + gav1GetErrorMessage(this.f23899n));
    }

    public void B(int i2) {
        this.f23900o = i2;
    }

    public final native int gav1CheckError(long j2);

    public final native void gav1Close(long j2);

    public final native int gav1Decode(long j2, ByteBuffer byteBuffer, int i2);

    public final native String gav1GetErrorMessage(long j2);

    public final native int gav1GetFrame(long j2, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z);

    public final native int gav1GetThreads();

    public final native long gav1Init(int i2);

    public final native void gav1ReleaseFrame(long j2, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    public final native int gav1RenderFrame(long j2, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    @Override // c.f.a.b.v2.c
    public String getName() {
        return "libgav1";
    }

    @Override // c.f.a.b.v2.i, c.f.a.b.v2.c
    public void release() {
        super.release();
        gav1Close(this.f23899n);
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public w g() {
        return new w(2);
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public VideoDecoderOutputBuffer h() {
        return new VideoDecoderOutputBuffer(new h.a() { // from class: c.f.a.b.y2.a.a
            @Override // c.f.a.b.v2.h.a
            public final void a(h hVar) {
                this.f10474a.r((VideoDecoderOutputBuffer) hVar);
            }
        });
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public b i(Throwable th) {
        return new b("Unexpected decode error", th);
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public b j(w wVar, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z) {
        ByteBuffer byteBuffer = (ByteBuffer) x0.i(wVar.f10276c);
        if (gav1Decode(this.f23899n, byteBuffer, byteBuffer.limit()) == 0) {
            return new b("gav1Decode error: " + gav1GetErrorMessage(this.f23899n));
        }
        boolean zIsDecodeOnly = wVar.isDecodeOnly();
        if (!zIsDecodeOnly) {
            videoDecoderOutputBuffer.init(wVar.f10278e, this.f23900o, null);
        }
        int iGav1GetFrame = gav1GetFrame(this.f23899n, videoDecoderOutputBuffer, zIsDecodeOnly);
        if (iGav1GetFrame == 0) {
            return new b("gav1GetFrame error: " + gav1GetErrorMessage(this.f23899n));
        }
        if (iGav1GetFrame == 2) {
            videoDecoderOutputBuffer.addFlag(Integer.MIN_VALUE);
        }
        if (!zIsDecodeOnly) {
            videoDecoderOutputBuffer.format = wVar.f9546i;
        }
        return null;
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void r(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (videoDecoderOutputBuffer.mode == 1 && !videoDecoderOutputBuffer.isDecodeOnly()) {
            gav1ReleaseFrame(this.f23899n, videoDecoderOutputBuffer);
        }
        super.r(videoDecoderOutputBuffer);
    }
}
