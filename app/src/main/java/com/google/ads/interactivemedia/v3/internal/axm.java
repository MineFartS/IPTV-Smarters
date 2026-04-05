package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class axm {
    @Deprecated
    public static final axi a(byte[] bArr) {
        try {
            bda bdaVarE = bda.e(bArr, bkm.a());
            for (bcz bczVar : bdaVarE.f()) {
                if (bczVar.c().c() == bcs.UNKNOWN_KEYMATERIAL || bczVar.c().c() == bcs.SYMMETRIC || bczVar.c().c() == bcs.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return axi.a(bdaVarE);
        } catch (blf unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
