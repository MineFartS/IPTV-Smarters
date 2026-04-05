package com.google.ads.interactivemedia.v3.internal;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ayd extends axf<bau, bas> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aye f20718a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayd(aye ayeVar, Class cls) {
        super(cls);
        this.f20718a = ayeVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ blz a(bkd bkdVar) {
        return bau.d(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ bas c(blz blzVar) {
        bau bauVar = (bau) blzVar;
        baw bawVarC = new ayh().a().c(bauVar.e());
        bcm bcmVarC = new bag().a().c(bauVar.f());
        bar barVarC = bas.c();
        barVarC.a(bawVarC);
        barVarC.b(bcmVarC);
        barVarC.c(0);
        return barVarC.ac();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final Map<String, axe<bau>> d() {
        HashMap map = new HashMap();
        bck bckVar = bck.SHA256;
        map.put("AES128_CTR_HMAC_SHA256", aye.j(16, 16, bckVar, 1));
        map.put("AES128_CTR_HMAC_SHA256_RAW", aye.j(16, 16, bckVar, 3));
        map.put("AES256_CTR_HMAC_SHA256", aye.j(32, 32, bckVar, 1));
        map.put("AES256_CTR_HMAC_SHA256_RAW", aye.j(32, 32, bckVar, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ void e(blz blzVar) throws InvalidAlgorithmParameterException {
        bau bauVar = (bau) blzVar;
        new ayh().a().e(bauVar.e());
        new bag().a().e(bauVar.f());
        beu.a(bauVar.e().a());
    }
}
