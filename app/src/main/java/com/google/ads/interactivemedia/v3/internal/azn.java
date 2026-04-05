package com.google.ads.interactivemedia.v3.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class azn extends axg<awy, bce> {
    public azn(Class cls) {
        super(cls);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axg
    public final /* bridge */ /* synthetic */ awy b(bce bceVar) throws GeneralSecurityException {
        bce bceVar2 = bceVar;
        bcc bccVarC = bceVar2.f().c();
        bci bciVarG = bccVarC.g();
        int iC = azy.c(bciVarG.e());
        byte[] bArrT = bceVar2.g().t();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) bei.f20999e.a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrT), bet.h(iC)));
        new azz(bccVarC.c().e());
        bciVarG.g().t();
        azy.a(bciVarG.f());
        azy.d(bccVarC.a());
        return new bed(eCPrivateKey);
    }
}
