package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ayh extends axh<baw> {
    public ayh() {
        super(baw.class, new ayf(bem.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(bba bbaVar) throws GeneralSecurityException {
        if (bbaVar.a() < 12 || bbaVar.a() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final axf<bay, baw> a() {
        return new ayg(this, bay.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final bcs b() {
        return bcs.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ blz c(bkd bkdVar) {
        return baw.f(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final String g() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void i(baw bawVar) throws GeneralSecurityException {
        beu.b(bawVar.a());
        beu.a(bawVar.h().d());
        l(bawVar.g());
    }
}
