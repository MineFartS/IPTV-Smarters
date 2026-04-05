package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class bae extends axg<axl, bcm> {
    public bae(Class cls) {
        super(cls);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axg
    public final /* bridge */ /* synthetic */ axl b(bcm bcmVar) throws GeneralSecurityException {
        bcm bcmVar2 = bcmVar;
        bck bckVarC = bcmVar2.g().c();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bcmVar2.h().t(), "HMAC");
        int iA = bcmVar2.g().a();
        bck bckVar = bck.UNKNOWN_HASH;
        int iOrdinal = bckVarC.ordinal();
        if (iOrdinal == 1) {
            return new beq(new bep("HMACSHA1", secretKeySpec), iA);
        }
        if (iOrdinal == 2) {
            return new beq(new bep("HMACSHA384", secretKeySpec), iA);
        }
        if (iOrdinal == 3) {
            return new beq(new bep("HMACSHA256", secretKeySpec), iA);
        }
        if (iOrdinal == 4) {
            return new beq(new bep("HMACSHA512", secretKeySpec), iA);
        }
        if (iOrdinal == 5) {
            return new beq(new bep("HMACSHA224", secretKeySpec), iA);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
