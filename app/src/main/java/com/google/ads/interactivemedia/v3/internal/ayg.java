package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ayg extends axf<bay, baw> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ayh f20719a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayg(ayh ayhVar, Class cls) {
        super(cls);
        this.f20719a = ayhVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ blz a(bkd bkdVar) {
        return bay.f(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ baw c(blz blzVar) {
        bay bayVar = (bay) blzVar;
        bav bavVarC = baw.c();
        bavVarC.b(bayVar.g());
        bavVarC.a(bkd.o(bes.b(bayVar.a())));
        bavVarC.c();
        return bavVarC.ac();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ void e(blz blzVar) throws GeneralSecurityException {
        bay bayVar = (bay) blzVar;
        beu.a(bayVar.a());
        ayh ayhVar = this.f20719a;
        ayh.l(bayVar.g());
    }
}
