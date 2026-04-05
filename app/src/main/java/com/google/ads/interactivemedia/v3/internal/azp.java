package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class azp extends axr<bce, bcg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f20743a = new byte[0];

    public azp() {
        super(bce.class, new azn(awy.class));
    }

    public static /* synthetic */ axe k(bcj bcjVar, bck bckVar, bbw bbwVar, axd axdVar, byte[] bArr, int i2) {
        bbz bbzVarA = bca.a();
        bch bchVarA = bci.a();
        bchVarA.a(bcjVar);
        bchVarA.b(bckVar);
        bchVarA.c(bkd.o(bArr));
        bci bciVarAc = bchVarA.ac();
        bcv bcvVarA = bcw.a();
        bcvVarA.b(axdVar.a());
        bcvVarA.c(bkd.o(axdVar.b()));
        int iC = axdVar.c() - 1;
        bcvVarA.a(iC != 0 ? iC != 1 ? iC != 2 ? bdl.CRUNCHY : bdl.RAW : bdl.LEGACY : bdl.TINK);
        bcw bcwVarAc = bcvVarA.ac();
        bbx bbxVarA = bby.a();
        bbxVarA.a(bcwVarAc);
        bby bbyVarAc = bbxVarA.ac();
        bcb bcbVarD = bcc.d();
        bcbVarD.c(bciVarAc);
        bcbVarD.a(bbyVarAc);
        bcbVarD.b(bbwVar);
        bbzVarA.a(bcbVarD.ac());
        return new axe(bbzVarA.ac(), i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final axf<bca, bce> a() {
        return new azo(this, bca.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final bcs b() {
        return bcs.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ blz c(bkd bkdVar) {
        return bce.e(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final String g() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ void i(blz blzVar) throws GeneralSecurityException {
        bce bceVar = (bce) blzVar;
        if (bceVar.g().d() == 0) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        beu.b(bceVar.a());
        azy.b(bceVar.f().c());
    }
}
