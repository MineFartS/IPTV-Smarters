package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ayn extends axh<bbi> {
    public ayn() {
        super(bbi.class, new ayl(awu.class));
    }

    public static /* synthetic */ axe j(int i2, int i3) {
        bbj bbjVarC = bbk.c();
        bbjVarC.a(i2);
        return new axe(bbjVarC.ac(), i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final axf<bbk, bbi> a() {
        return new aym(this, bbk.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final bcs b() {
        return bcs.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ blz c(bkd bkdVar) {
        return bbi.e(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final String g() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ void i(blz blzVar) throws GeneralSecurityException {
        bbi bbiVar = (bbi) blzVar;
        beu.b(bbiVar.a());
        beu.a(bbiVar.f().d());
    }
}
