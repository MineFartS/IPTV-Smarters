package c.f.a.b.y2.h;

import android.os.Handler;
import android.view.Surface;
import c.f.a.b.i2;
import c.f.a.b.j3.v0;
import c.f.a.b.k1;
import c.f.a.b.k3.d0;
import c.f.a.b.k3.o;
import c.f.a.b.v2.g;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.ext.vp9.VpxDecoder;
import com.google.android.exoplayer2.ext.vp9.VpxLibrary;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class b extends o {
    public final int W;
    public final int X;
    public final int Y;
    public VpxDecoder Z;

    public b(long j2, Handler handler, d0 d0Var, int i2) {
        this(j2, handler, d0Var, i2, Runtime.getRuntime().availableProcessors(), 4, 4);
    }

    public b(long j2, Handler handler, d0 d0Var, int i2, int i3, int i4, int i5) {
        super(j2, handler, d0Var, i2);
        this.Y = i3;
        this.W = i4;
        this.X = i5;
    }

    @Override // c.f.a.b.k3.o
    public g M(String str, k1 k1Var, k1 k1Var2) {
        return new g(str, k1Var, k1Var2, 3, 0);
    }

    @Override // c.f.a.b.j2
    public final int a(k1 k1Var) {
        if (!VpxLibrary.b() || !"video/x-vnd.on2.vp9".equalsIgnoreCase(k1Var.f9338m)) {
            return i2.a(0);
        }
        Class<? extends ExoMediaCrypto> cls = k1Var.F;
        return !(cls == null || VpxLibrary.c(cls)) ? i2.a(2) : i2.b(4, 16, 0);
    }

    @Override // c.f.a.b.h2, c.f.a.b.j2
    public String getName() {
        return "LibvpxVideoRenderer";
    }

    @Override // c.f.a.b.k3.o
    public void n0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws c {
        VpxDecoder vpxDecoder = this.Z;
        if (vpxDecoder == null) {
            throw new c("Failed to render output buffer to surface: decoder is not initialized.");
        }
        vpxDecoder.A(videoDecoderOutputBuffer, surface);
        videoDecoderOutputBuffer.release();
    }

    @Override // c.f.a.b.k3.o
    public void p0(int i2) {
        VpxDecoder vpxDecoder = this.Z;
        if (vpxDecoder != null) {
            vpxDecoder.B(i2);
        }
    }

    @Override // c.f.a.b.k3.o
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public VpxDecoder P(k1 k1Var, ExoMediaCrypto exoMediaCrypto) {
        v0.a("createVpxDecoder");
        int i2 = k1Var.f9339n;
        VpxDecoder vpxDecoder = new VpxDecoder(this.W, this.X, i2 != -1 ? i2 : 786432, exoMediaCrypto, this.Y);
        this.Z = vpxDecoder;
        v0.c();
        return vpxDecoder;
    }
}
