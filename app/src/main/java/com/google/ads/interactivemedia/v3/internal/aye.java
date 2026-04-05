package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class aye extends axh<bas> {
    public aye() {
        super(bas.class, new ayc(awu.class));
    }

    public static /* synthetic */ axe j(int i2, int i3, bck bckVar, int i4) {
        bax baxVarC = bay.c();
        baz bazVarC = bba.c();
        bazVarC.a();
        baxVarC.b(bazVarC.ac());
        baxVarC.a(i2);
        bay bayVarAc = baxVarC.ac();
        bcn bcnVarC = bco.c();
        bcp bcpVarD = bcq.d();
        bcpVarD.a(bckVar);
        bcpVarD.b(i3);
        bcnVarC.b(bcpVarD.ac());
        bcnVarC.a(32);
        bco bcoVarAc = bcnVarC.ac();
        bat batVarA = bau.a();
        batVarA.a(bayVarAc);
        batVarA.b(bcoVarAc);
        return new axe(batVarA.ac(), i4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final axf<bau, bas> a() {
        return new ayd(this, bau.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final bcs b() {
        return bcs.SYMMETRIC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ blz c(bkd bkdVar) {
        return bas.e(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final String g() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axh
    public final /* bridge */ /* synthetic */ void i(blz blzVar) throws GeneralSecurityException {
        bas basVar = (bas) blzVar;
        beu.b(basVar.a());
        new ayh().i(basVar.f());
        new bag();
        bag.l(basVar.g());
    }
}
