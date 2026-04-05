package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class em implements awf<com.google.ads.interactivemedia.v3.impl.data.bd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eq f21723b;

    public em(eq eqVar, String str) {
        this.f21723b = eqVar;
        this.f21722a = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf
    public final void a(Throwable th) {
        pn.e("Failure to make Native-layer network request", th);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf
    public final /* bridge */ /* synthetic */ void b(com.google.ads.interactivemedia.v3.impl.data.bd bdVar) {
        this.f21723b.f21727b.o(new dw(du.nativeXhr, dv.nativeResponse, this.f21722a, bdVar));
    }
}
