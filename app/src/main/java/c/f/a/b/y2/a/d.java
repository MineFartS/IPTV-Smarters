package c.f.a.b.y2.a;

import android.os.Handler;
import android.view.Surface;
import c.f.a.b.i2;
import c.f.a.b.j3.v0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.k3.d0;
import c.f.a.b.k3.o;
import c.f.a.b.v2.g;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.ext.av1.Gav1Decoder;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;

/* JADX INFO: loaded from: classes.dex */
public class d extends o {
    public static final int W = ((x0.k(1280, 64) * x0.k(720, 64)) * 6144) / 2;
    public final int X;
    public final int Y;
    public final int Z;
    public Gav1Decoder f0;

    public d(long j2, Handler handler, d0 d0Var, int i2) {
        this(j2, handler, d0Var, i2, 0, 4, 4);
    }

    public d(long j2, Handler handler, d0 d0Var, int i2, int i3, int i4, int i5) {
        super(j2, handler, d0Var, i2);
        this.Z = i3;
        this.X = i4;
        this.Y = i5;
    }

    @Override // c.f.a.b.k3.o
    public g M(String str, k1 k1Var, k1 k1Var2) {
        return new g(str, k1Var, k1Var2, 3, 0);
    }

    @Override // c.f.a.b.j2
    public final int a(k1 k1Var) {
        return ("video/av01".equalsIgnoreCase(k1Var.f9338m) && c.a()) ? k1Var.F != null ? i2.a(2) : i2.b(4, 16, 0) : i2.a(0);
    }

    @Override // c.f.a.b.h2, c.f.a.b.j2
    public String getName() {
        return "Libgav1VideoRenderer";
    }

    @Override // c.f.a.b.k3.o
    public void n0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws b {
        Gav1Decoder gav1Decoder = this.f0;
        if (gav1Decoder == null) {
            throw new b("Failed to render output buffer to surface: decoder is not initialized.");
        }
        gav1Decoder.A(videoDecoderOutputBuffer, surface);
        videoDecoderOutputBuffer.release();
    }

    @Override // c.f.a.b.k3.o
    public void p0(int i2) {
        Gav1Decoder gav1Decoder = this.f0;
        if (gav1Decoder != null) {
            gav1Decoder.B(i2);
        }
    }

    @Override // c.f.a.b.k3.o
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public Gav1Decoder P(k1 k1Var, ExoMediaCrypto exoMediaCrypto) {
        v0.a("createGav1Decoder");
        int i2 = k1Var.f9339n;
        if (i2 == -1) {
            i2 = W;
        }
        Gav1Decoder gav1Decoder = new Gav1Decoder(this.X, this.Y, i2, this.Z);
        this.f0 = gav1Decoder;
        v0.c();
        return gav1Decoder;
    }
}
