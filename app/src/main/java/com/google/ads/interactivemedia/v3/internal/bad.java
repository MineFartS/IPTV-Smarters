package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class bad extends axh<bam> {
    public bad() {
        super(bam.class, new bab(axl.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(baq baqVar) throws GeneralSecurityException {
        if (baqVar.a() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (baqVar.a() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(int i2) throws GeneralSecurityException {
        if (i2 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final axf<bao, bam> a() {
        return new bac(bao.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final bcs b() {
        return bcs.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ blz c(bkd bkdVar) {
        return bam.e(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final String g() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ void i(blz blzVar) throws GeneralSecurityException {
        bam bamVar = (bam) blzVar;
        beu.b(bamVar.a());
        m(bamVar.g().d());
        l(bamVar.f());
    }
}
