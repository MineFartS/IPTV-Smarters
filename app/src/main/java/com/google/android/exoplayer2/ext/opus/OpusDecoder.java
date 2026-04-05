package com.google.android.exoplayer2.ext.opus;

import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.t2.i0;
import c.f.a.b.v2.b;
import c.f.a.b.v2.f;
import c.f.a.b.v2.h;
import c.f.a.b.v2.i;
import c.f.a.b.x2.s;
import c.f.a.b.y2.f.c;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OpusDecoder extends i<f, SimpleOutputBuffer, c> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f23907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f23908o;
    public final ExoMediaCrypto p;
    public final int q;
    public final int r;
    public final long s;
    public int t;

    public OpusDecoder(int i2, int i3, int i4, List<byte[]> list, ExoMediaCrypto exoMediaCrypto, boolean z) throws c {
        int i5;
        super(new f[i2], new SimpleOutputBuffer[i3]);
        if (!OpusLibrary.b()) {
            throw new c("Failed to load decoder native libraries");
        }
        this.p = exoMediaCrypto;
        if (exoMediaCrypto != null && !OpusLibrary.opusIsSecureDecodeSupported()) {
            throw new c("Opus decoder does not support secure decode");
        }
        int size = list.size();
        int i6 = 1;
        if (size != 1 && size != 3) {
            throw new c("Invalid initialization data size");
        }
        if (size == 3 && (list.get(1).length != 8 || list.get(2).length != 8)) {
            throw new c("Invalid pre-skip or seek pre-roll");
        }
        this.q = i0.d(list);
        this.r = i0.f(list);
        byte[] bArr = list.get(0);
        if (bArr.length < 19) {
            throw new c("Invalid header length");
        }
        int iC = i0.c(bArr);
        this.f23908o = iC;
        if (iC > 8) {
            throw new c("Invalid channel count: " + iC);
        }
        int iZ = z(bArr, 16);
        byte[] bArr2 = new byte[8];
        if (bArr[18] == 0) {
            if (iC > 2) {
                throw new c("Invalid header, missing stream map");
            }
            int i7 = iC == 2 ? 1 : 0;
            bArr2[0] = 0;
            bArr2[1] = 1;
            i5 = i7;
        } else {
            if (bArr.length < iC + 21) {
                throw new c("Invalid header length");
            }
            i6 = bArr[19] & 255;
            i5 = bArr[20] & 255;
            System.arraycopy(bArr, 21, bArr2, 0, iC);
        }
        long jOpusInit = opusInit(48000, iC, i6, i5, iZ, bArr2);
        this.s = jOpusInit;
        if (jOpusInit == 0) {
            throw new c("Failed to initialize decoder");
        }
        u(i4);
        this.f23907n = z;
        if (z) {
            opusSetFloatOutput();
        }
    }

    public static int z(byte[] bArr, int i2) {
        return (short) (((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255));
    }

    @Override // c.f.a.b.v2.i
    public f g() {
        return new f(2);
    }

    @Override // c.f.a.b.v2.c
    public String getName() {
        return "libopus" + OpusLibrary.a();
    }

    public final native void opusClose(long j2);

    public final native int opusDecode(long j2, long j3, ByteBuffer byteBuffer, int i2, SimpleOutputBuffer simpleOutputBuffer);

    public final native int opusGetErrorCode(long j2);

    public final native String opusGetErrorMessage(long j2);

    public final native long opusInit(int i2, int i3, int i4, int i5, int i6, byte[] bArr);

    public final native void opusReset(long j2);

    public final native int opusSecureDecode(long j2, long j3, ByteBuffer byteBuffer, int i2, SimpleOutputBuffer simpleOutputBuffer, int i3, ExoMediaCrypto exoMediaCrypto, int i4, byte[] bArr, byte[] bArr2, int i5, int[] iArr, int[] iArr2);

    public final native void opusSetFloatOutput();

    @Override // c.f.a.b.v2.i, c.f.a.b.v2.c
    public void release() {
        super.release();
        opusClose(this.s);
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public SimpleOutputBuffer h() {
        return new SimpleOutputBuffer(new h.a() { // from class: c.f.a.b.y2.f.a
            @Override // c.f.a.b.v2.h.a
            public final void a(h hVar) {
                this.f10593a.r((SimpleOutputBuffer) hVar);
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
        OpusDecoder opusDecoder;
        int iOpusDecode;
        if (z) {
            opusReset(this.s);
            this.t = fVar.f10278e == 0 ? this.q : this.r;
        }
        ByteBuffer byteBuffer = (ByteBuffer) x0.i(fVar.f10276c);
        b bVar = fVar.f10275b;
        if (fVar.p()) {
            iOpusDecode = opusSecureDecode(this.s, fVar.f10278e, byteBuffer, byteBuffer.limit(), simpleOutputBuffer, 48000, this.p, bVar.f10254c, (byte[]) g.e(bVar.f10253b), (byte[]) g.e(bVar.f10252a), bVar.f10257f, bVar.f10255d, bVar.f10256e);
            opusDecoder = this;
        } else {
            opusDecoder = this;
            iOpusDecode = opusDecode(opusDecoder.s, fVar.f10278e, byteBuffer, byteBuffer.limit(), simpleOutputBuffer);
        }
        if (iOpusDecode < 0) {
            if (iOpusDecode != -2) {
                return new c("Decode error: " + opusDecoder.opusGetErrorMessage(iOpusDecode));
            }
            String str = "Drm error: " + opusDecoder.opusGetErrorMessage(opusDecoder.s);
            return new c(str, new s(opusDecoder.opusGetErrorCode(opusDecoder.s), str));
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) x0.i(simpleOutputBuffer.data);
        byteBuffer2.position(0);
        byteBuffer2.limit(iOpusDecode);
        int i2 = opusDecoder.t;
        if (i2 <= 0) {
            return null;
        }
        int i3 = opusDecoder.f23908o * 2;
        int i4 = i2 * i3;
        if (iOpusDecode > i4) {
            opusDecoder.t = 0;
            byteBuffer2.position(i4);
            return null;
        }
        opusDecoder.t = i2 - (iOpusDecode / i3);
        simpleOutputBuffer.addFlag(Integer.MIN_VALUE);
        byteBuffer2.position(iOpusDecode);
        return null;
    }
}
