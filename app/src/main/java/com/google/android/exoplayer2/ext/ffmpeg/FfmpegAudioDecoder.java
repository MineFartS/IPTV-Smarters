package com.google.android.exoplayer2.ext.ffmpeg;

import c.f.a.b.j3.g;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.v2.f;
import c.f.a.b.v2.h;
import c.f.a.b.v2.i;
import c.f.a.b.y2.c.c;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class FfmpegAudioDecoder extends i<f, SimpleOutputBuffer, c> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f23901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f23902o;
    public final int p;
    public final int q;
    public long r;
    public boolean s;
    public volatile int t;
    public volatile int u;

    public FfmpegAudioDecoder(k1 k1Var, int i2, int i3, int i4, boolean z) throws c {
        super(new f[i2], new SimpleOutputBuffer[i3]);
        if (!FfmpegLibrary.d()) {
            throw new c("Failed to load decoder native libraries.");
        }
        g.e(k1Var.f9338m);
        String str = (String) g.e(FfmpegLibrary.a(k1Var.f9338m));
        this.f23901n = str;
        byte[] bArrB = B(k1Var.f9338m, k1Var.f9340o);
        this.f23902o = bArrB;
        this.p = z ? 4 : 2;
        this.q = z ? 131072 : 65536;
        long jFfmpegInitialize = ffmpegInitialize(str, bArrB, z, k1Var.A, k1Var.z);
        this.r = jFfmpegInitialize;
        if (jFfmpegInitialize == 0) {
            throw new c("Initialization failed.");
        }
        u(i4);
    }

    public static byte[] B(String str, List<byte[]> list) {
        str.hashCode();
        switch (str) {
            case "audio/vorbis":
                return D(list);
            case "audio/mp4a-latm":
            case "audio/opus":
                return list.get(0);
            case "audio/alac":
                return y(list);
            default:
                return null;
        }
    }

    public static byte[] D(List<byte[]> list) {
        byte[] bArr = list.get(0);
        byte[] bArr2 = list.get(1);
        byte[] bArr3 = new byte[bArr.length + bArr2.length + 6];
        bArr3[0] = (byte) (bArr.length >> 8);
        bArr3[1] = (byte) (bArr.length & 255);
        System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
        bArr3[bArr.length + 2] = 0;
        bArr3[bArr.length + 3] = 0;
        bArr3[bArr.length + 4] = (byte) (bArr2.length >> 8);
        bArr3[bArr.length + 5] = (byte) (bArr2.length & 255);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 6, bArr2.length);
        return bArr3;
    }

    public static byte[] y(List<byte[]> list) {
        byte[] bArr = list.get(0);
        int length = bArr.length + 12;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1634492771);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(bArr, 0, bArr.length);
        return byteBufferAllocate.array();
    }

    public int A() {
        return this.p;
    }

    public int C() {
        return this.u;
    }

    public final native int ffmpegDecode(long j2, ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3);

    public final native int ffmpegGetChannelCount(long j2);

    public final native int ffmpegGetSampleRate(long j2);

    public final native long ffmpegInitialize(String str, byte[] bArr, boolean z, int i2, int i3);

    public final native void ffmpegRelease(long j2);

    public final native long ffmpegReset(long j2, byte[] bArr);

    @Override // c.f.a.b.v2.i
    public f g() {
        return new f(2, FfmpegLibrary.b());
    }

    @Override // c.f.a.b.v2.c
    public String getName() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.f23901n;
    }

    @Override // c.f.a.b.v2.i, c.f.a.b.v2.c
    public void release() {
        super.release();
        ffmpegRelease(this.r);
        this.r = 0L;
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public SimpleOutputBuffer h() {
        return new SimpleOutputBuffer(new h.a() { // from class: c.f.a.b.y2.c.a
            @Override // c.f.a.b.v2.h.a
            public final void a(h hVar) {
                this.f10507a.r((SimpleOutputBuffer) hVar);
            }
        });
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public c i(Throwable th) {
        return new c("Unexpected decode error", th);
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public c j(f fVar, SimpleOutputBuffer simpleOutputBuffer, boolean z) {
        if (z) {
            long jFfmpegReset = ffmpegReset(this.r, this.f23902o);
            this.r = jFfmpegReset;
            if (jFfmpegReset == 0) {
                return new c("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = (ByteBuffer) x0.i(fVar.f10276c);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferInit = simpleOutputBuffer.init(fVar.f10278e, this.q);
        int iFfmpegDecode = ffmpegDecode(this.r, byteBuffer, iLimit, byteBufferInit, this.q);
        if (iFfmpegDecode == -2) {
            return new c("Error decoding (see logcat).");
        }
        if (iFfmpegDecode == -1) {
            simpleOutputBuffer.setFlags(Integer.MIN_VALUE);
            return null;
        }
        if (iFfmpegDecode == 0) {
            simpleOutputBuffer.setFlags(Integer.MIN_VALUE);
            return null;
        }
        if (!this.s) {
            this.t = ffmpegGetChannelCount(this.r);
            this.u = ffmpegGetSampleRate(this.r);
            if (this.u == 0 && "alac".equals(this.f23901n)) {
                g.e(this.f23902o);
                i0 i0Var = new i0(this.f23902o);
                i0Var.P(this.f23902o.length - 4);
                this.u = i0Var.H();
            }
            this.s = true;
        }
        byteBufferInit.position(0);
        byteBufferInit.limit(iFfmpegDecode);
        return null;
    }

    public int z() {
        return this.t;
    }
}
