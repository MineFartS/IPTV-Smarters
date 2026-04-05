package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public final class ayq extends axh<bbm> {
    public ayq() {
        super(bbm.class, new ayo(awu.class));
    }

    public static /* synthetic */ axe j(int i2, int i3) {
        bbn bbnVarC = bbo.c();
        bbnVarC.a(i2);
        return new axe(bbnVarC.ac(), i3);
    }

    public static void k() {
        if (l()) {
            axx.n(new ayq());
        }
    }

    private static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final axf<bbo, bbm> a() {
        return new ayp(this, bbo.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final bcs b() {
        return bcs.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ blz c(bkd bkdVar) {
        return bbm.e(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final String g() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ void i(blz blzVar) throws GeneralSecurityException {
        bbm bbmVar = (bbm) blzVar;
        beu.b(bbmVar.a());
        beu.a(bbmVar.f().d());
    }
}
