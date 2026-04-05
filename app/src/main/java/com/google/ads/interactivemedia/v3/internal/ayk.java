package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ayk extends axh<bbc> {
    public ayk() {
        super(bbc.class, new ayi(awu.class));
    }

    public static /* synthetic */ axe j(int i2, int i3) {
        bbd bbdVarC = bbe.c();
        bbdVarC.a(i2);
        bbf bbfVarC = bbg.c();
        bbfVarC.a();
        bbdVarC.b(bbfVarC.ac());
        return new axe(bbdVarC.ac(), i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final axf<bbe, bbc> a() {
        return new ayj(this, bbe.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final bcs b() {
        return bcs.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ blz c(bkd bkdVar) {
        return bbc.e(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final String g() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ void i(blz blzVar) throws GeneralSecurityException {
        bbc bbcVar = (bbc) blzVar;
        beu.b(bbcVar.a());
        beu.a(bbcVar.g().d());
        if (bbcVar.f().a() != 12 && bbcVar.f().a() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
