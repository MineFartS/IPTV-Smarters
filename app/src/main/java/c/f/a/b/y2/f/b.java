package c.f.a.b.y2.f;

import android.os.Handler;
import c.f.a.b.j3.v0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.t2.c0;
import c.f.a.b.t2.s;
import c.f.a.b.t2.u;
import c.f.a.b.t2.v;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.ext.opus.OpusDecoder;
import com.google.android.exoplayer2.ext.opus.OpusLibrary;

/* JADX INFO: loaded from: classes2.dex */
public class b extends c0<OpusDecoder> {
    public b() {
        this((Handler) null, (u) null, new s[0]);
    }

    public b(Handler handler, u uVar, v vVar) {
        super(handler, uVar, vVar);
    }

    public b(Handler handler, u uVar, s... sVarArr) {
        super(handler, uVar, sVarArr);
    }

    @Override // c.f.a.b.t2.c0
    public int d0(k1 k1Var) {
        Class<? extends ExoMediaCrypto> cls = k1Var.F;
        boolean z = cls == null || OpusLibrary.c(cls);
        if (!OpusLibrary.b() || !"audio/opus".equalsIgnoreCase(k1Var.f9338m)) {
            return 0;
        }
        if (c0(x0.b0(2, k1Var.z, k1Var.A))) {
            return !z ? 2 : 4;
        }
        return 1;
    }

    @Override // c.f.a.b.t2.c0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public OpusDecoder O(k1 k1Var, ExoMediaCrypto exoMediaCrypto) {
        v0.a("createOpusDecoder");
        boolean z = T(x0.b0(4, k1Var.z, k1Var.A)) == 2;
        int i2 = k1Var.f9339n;
        OpusDecoder opusDecoder = new OpusDecoder(16, 16, i2 != -1 ? i2 : 5760, k1Var.f9340o, exoMediaCrypto, z);
        v0.c();
        return opusDecoder;
    }

    @Override // c.f.a.b.t2.c0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public k1 S(OpusDecoder opusDecoder) {
        return x0.b0(opusDecoder.f23907n ? 4 : 2, opusDecoder.f23908o, 48000);
    }

    @Override // c.f.a.b.h2, c.f.a.b.j2
    public String getName() {
        return "LibopusAudioRenderer";
    }
}
