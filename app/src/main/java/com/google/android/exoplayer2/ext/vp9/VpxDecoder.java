package com.google.android.exoplayer2.ext.vp9;

import android.view.Surface;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.k3.w;
import c.f.a.b.v2.b;
import c.f.a.b.v2.h;
import c.f.a.b.v2.i;
import c.f.a.b.x2.s;
import c.f.a.b.y2.h.c;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class VpxDecoder extends i<w, VideoDecoderOutputBuffer, c> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ExoMediaCrypto f23911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f23912o;
    public ByteBuffer p;
    public volatile int q;

    public VpxDecoder(int i2, int i3, int i4, ExoMediaCrypto exoMediaCrypto, int i5) throws c {
        super(new w[i2], new VideoDecoderOutputBuffer[i3]);
        if (!VpxLibrary.b()) {
            throw new c("Failed to load decoder native libraries.");
        }
        this.f23911n = exoMediaCrypto;
        if (exoMediaCrypto != null && !VpxLibrary.vpxIsSecureDecodeSupported()) {
            throw new c("Vpx decoder does not support secure decode.");
        }
        long jVpxInit = vpxInit(false, false, i5);
        this.f23912o = jVpxInit;
        if (jVpxInit == 0) {
            throw new c("Failed to initialize decoder");
        }
        u(i4);
    }

    public void A(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws c {
        if (vpxRenderFrame(this.f23912o, surface, videoDecoderOutputBuffer) == -1) {
            throw new c("Buffer render failed.");
        }
    }

    public void B(int i2) {
        this.q = i2;
    }

    @Override // c.f.a.b.v2.c
    public String getName() {
        return "libvpx" + VpxLibrary.a();
    }

    @Override // c.f.a.b.v2.i, c.f.a.b.v2.c
    public void release() {
        super.release();
        this.p = null;
        vpxClose(this.f23912o);
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public w g() {
        return new w(2);
    }

    public final native long vpxClose(long j2);

    public final native long vpxDecode(long j2, ByteBuffer byteBuffer, int i2);

    public final native int vpxGetErrorCode(long j2);

    public final native String vpxGetErrorMessage(long j2);

    public final native int vpxGetFrame(long j2, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    public final native long vpxInit(boolean z, boolean z2, int i2);

    public final native int vpxReleaseFrame(long j2, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    public final native int vpxRenderFrame(long j2, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    public final native long vpxSecureDecode(long j2, ByteBuffer byteBuffer, int i2, ExoMediaCrypto exoMediaCrypto, int i3, byte[] bArr, byte[] bArr2, int i4, int[] iArr, int[] iArr2);

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public VideoDecoderOutputBuffer h() {
        return new VideoDecoderOutputBuffer(new h.a() { // from class: c.f.a.b.y2.h.a
            @Override // c.f.a.b.v2.h.a
            public final void a(h hVar) {
                this.f10596a.r((VideoDecoderOutputBuffer) hVar);
            }
        });
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public c i(Throwable th) {
        return new c("Unexpected decode error", th);
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public c j(w wVar, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z) {
        ByteBuffer byteBuffer;
        int iRemaining;
        ByteBuffer byteBuffer2;
        if (z && (byteBuffer2 = this.p) != null) {
            byteBuffer2.clear();
        }
        ByteBuffer byteBuffer3 = (ByteBuffer) x0.i(wVar.f10276c);
        int iLimit = byteBuffer3.limit();
        b bVar = wVar.f10275b;
        long jVpxSecureDecode = wVar.p() ? vpxSecureDecode(this.f23912o, byteBuffer3, iLimit, this.f23911n, bVar.f10254c, (byte[]) g.e(bVar.f10253b), (byte[]) g.e(bVar.f10252a), bVar.f10257f, bVar.f10255d, bVar.f10256e) : vpxDecode(this.f23912o, byteBuffer3, iLimit);
        if (jVpxSecureDecode != 0) {
            if (jVpxSecureDecode != -2) {
                return new c("Decode error: " + vpxGetErrorMessage(this.f23912o));
            }
            String str = "Drm error: " + vpxGetErrorMessage(this.f23912o);
            return new c(str, new s(vpxGetErrorCode(this.f23912o), str));
        }
        if (wVar.hasSupplementalData() && (iRemaining = (byteBuffer = (ByteBuffer) g.e(wVar.f10279f)).remaining()) > 0) {
            ByteBuffer byteBuffer4 = this.p;
            if (byteBuffer4 == null || byteBuffer4.capacity() < iRemaining) {
                this.p = ByteBuffer.allocate(iRemaining);
            } else {
                this.p.clear();
            }
            this.p.put(byteBuffer);
            this.p.flip();
        }
        if (wVar.isDecodeOnly()) {
            return null;
        }
        videoDecoderOutputBuffer.init(wVar.f10278e, this.q, this.p);
        int iVpxGetFrame = vpxGetFrame(this.f23912o, videoDecoderOutputBuffer);
        if (iVpxGetFrame == 1) {
            videoDecoderOutputBuffer.addFlag(Integer.MIN_VALUE);
        } else if (iVpxGetFrame == -1) {
            return new c("Buffer initialization failed.");
        }
        videoDecoderOutputBuffer.format = wVar.f9546i;
        return null;
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void r(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (this.q == 1 && !videoDecoderOutputBuffer.isDecodeOnly()) {
            vpxReleaseFrame(this.f23912o, videoDecoderOutputBuffer);
        }
        super.r(videoDecoderOutputBuffer);
    }
}
