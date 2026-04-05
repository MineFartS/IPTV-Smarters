package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class bag extends axh<bcm> {
    public bag() {
        super(bcm.class, new bae(axl.class));
    }

    public static /* synthetic */ axe k(int i2, int i3, bck bckVar, int i4) {
        bcn bcnVarC = bco.c();
        bcp bcpVarD = bcq.d();
        bcpVarD.a(bckVar);
        bcpVarD.b(i3);
        bcnVarC.b(bcpVarD.ac());
        bcnVarC.a(i2);
        return new axe(bcnVarC.ac(), i4);
    }

    public static final void l(bcm bcmVar) throws GeneralSecurityException {
        beu.b(bcmVar.a());
        if (bcmVar.h().d() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m(bcmVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(bcq bcqVar) throws GeneralSecurityException {
        if (bcqVar.a() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        bck bckVar = bck.UNKNOWN_HASH;
        int iOrdinal = bcqVar.c().ordinal();
        if (iOrdinal == 1) {
            if (bcqVar.a() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 2) {
            if (bcqVar.a() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 3) {
            if (bcqVar.a() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 4) {
            if (bcqVar.a() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (bcqVar.a() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final axf<bco, bcm> a() {
        return new baf(this, bco.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final bcs b() {
        return bcs.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ blz c(bkd bkdVar) {
        return bcm.f(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final String g() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ void i(blz blzVar) throws GeneralSecurityException {
        l((bcm) blzVar);
    }
}
