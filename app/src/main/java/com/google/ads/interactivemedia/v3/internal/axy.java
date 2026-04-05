package com.google.ads.interactivemedia.v3.internal;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class axy {
    static {
        Charset.forName("UTF-8");
    }

    public static bde a(bda bdaVar) {
        bdb bdbVarA = bde.a();
        bdbVarA.b(bdaVar.c());
        for (bcz bczVar : bdaVar.f()) {
            bdc bdcVarA = bdd.a();
            bdcVarA.d(bczVar.c().g());
            bdcVarA.c(bczVar.d());
            bdcVarA.b(bczVar.f());
            bdcVarA.a(bczVar.a());
            bdbVarA.a(bdcVarA.ac());
        }
        return bdbVarA.ac();
    }

    public static void b(bda bdaVar) {
        int iC = bdaVar.c();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (bcz bczVar : bdaVar.f()) {
            if (bczVar.d() == bcu.ENABLED) {
                if (!bczVar.g()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(bczVar.a())));
                }
                if (bczVar.f() == bdl.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(bczVar.a())));
                }
                if (bczVar.d() == bcu.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(bczVar.a())));
                }
                if (bczVar.a() == iC) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= bczVar.c().c() == bcs.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
