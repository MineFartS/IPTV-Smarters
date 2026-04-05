package c.f.a.b.y2.c;

import android.os.Handler;
import c.f.a.b.j3.g;
import c.f.a.b.j3.v0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.t2.c0;
import c.f.a.b.t2.d0;
import c.f.a.b.t2.s;
import c.f.a.b.t2.u;
import c.f.a.b.t2.v;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioDecoder;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c0<FfmpegAudioDecoder> {
    public b() {
        this((Handler) null, (u) null, new s[0]);
    }

    public b(Handler handler, u uVar, v vVar) {
        super(handler, uVar, vVar);
    }

    public b(Handler handler, u uVar, s... sVarArr) {
        this(handler, uVar, new d0(null, sVarArr));
    }

    @Override // c.f.a.b.t2.c0
    public int d0(k1 k1Var) {
        String str = (String) g.e(k1Var.f9338m);
        if (!FfmpegLibrary.d() || !c.f.a.b.j3.d0.p(str)) {
            return 0;
        }
        if (!FfmpegLibrary.e(str)) {
            return 1;
        }
        if (i0(k1Var, 2) || i0(k1Var, 4)) {
            return k1Var.F != null ? 2 : 4;
        }
        return 1;
    }

    @Override // c.f.a.b.t2.c0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public FfmpegAudioDecoder O(k1 k1Var, ExoMediaCrypto exoMediaCrypto) {
        v0.a("createFfmpegAudioDecoder");
        int i2 = k1Var.f9339n;
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(k1Var, 16, 16, i2 != -1 ? i2 : 5760, h0(k1Var));
        v0.c();
        return ffmpegAudioDecoder;
    }

    @Override // c.f.a.b.t2.c0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public k1 S(FfmpegAudioDecoder ffmpegAudioDecoder) {
        g.e(ffmpegAudioDecoder);
        return new k1.b().e0("audio/raw").H(ffmpegAudioDecoder.z()).f0(ffmpegAudioDecoder.C()).Y(ffmpegAudioDecoder.A()).E();
    }

    @Override // c.f.a.b.h2, c.f.a.b.j2
    public String getName() {
        return "FfmpegAudioRenderer";
    }

    public final boolean h0(k1 k1Var) {
        if (!i0(k1Var, 2)) {
            return true;
        }
        if (T(x0.b0(4, k1Var.z, k1Var.A)) != 2) {
            return false;
        }
        return !"audio/ac3".equals(k1Var.f9338m);
    }

    public final boolean i0(k1 k1Var, int i2) {
        return c0(x0.b0(i2, k1Var.z, k1Var.A));
    }

    @Override // c.f.a.b.u0, c.f.a.b.j2
    public final int n() {
        return 8;
    }
}
