package c.f.a.b.y2.d;

import android.os.Handler;
import c.f.a.b.j3.v0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.t2.c0;
import c.f.a.b.t2.s;
import c.f.a.b.t2.u;
import c.f.a.b.t2.v;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends c0<e> {
    public i() {
        this((Handler) null, (u) null, new s[0]);
    }

    public i(Handler handler, u uVar, v vVar) {
        super(handler, uVar, vVar);
    }

    public i(Handler handler, u uVar, s... sVarArr) {
        super(handler, uVar, sVarArr);
    }

    public static k1 h0(FlacStreamMetadata flacStreamMetadata) {
        return x0.b0(x0.a0(flacStreamMetadata.bitsPerSample), flacStreamMetadata.channels, flacStreamMetadata.sampleRate);
    }

    @Override // c.f.a.b.t2.c0
    public int d0(k1 k1Var) {
        if (!h.isAvailable() || !"audio/flac".equalsIgnoreCase(k1Var.f9338m)) {
            return 0;
        }
        if (c0(k1Var.f9340o.isEmpty() ? x0.b0(2, k1Var.z, k1Var.A) : h0(new FlacStreamMetadata(k1Var.f9340o.get(0), 8)))) {
            return k1Var.F != null ? 2 : 4;
        }
        return 1;
    }

    @Override // c.f.a.b.t2.c0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public e O(k1 k1Var, ExoMediaCrypto exoMediaCrypto) {
        v0.a("createFlacDecoder");
        e eVar = new e(16, 16, k1Var.f9339n, k1Var.f9340o);
        v0.c();
        return eVar;
    }

    @Override // c.f.a.b.t2.c0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public k1 S(e eVar) {
        return h0(eVar.y());
    }

    @Override // c.f.a.b.h2, c.f.a.b.j2
    public String getName() {
        return "LibflacAudioRenderer";
    }
}
