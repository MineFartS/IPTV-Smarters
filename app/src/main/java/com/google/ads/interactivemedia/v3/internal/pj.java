package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class pj implements om {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk f22710a;

    public /* synthetic */ pj(pk pkVar) {
        this.f22710a = pkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.om
    public final void a(Exception exc) {
        alj.a("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f22710a.f22712c.b(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.om
    public final void b() {
        if (this.f22710a.f22721l != null) {
            this.f22710a.f22721l.b();
        }
    }
}
