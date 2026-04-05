package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class azo extends axf<bca, bce> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ azp f20742a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azo(azp azpVar, Class cls) {
        super(cls);
        this.f20742a = azpVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ blz a(bkd bkdVar) {
        return bca.d(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ bce c(blz blzVar) throws GeneralSecurityException {
        bca bcaVar = (bca) blzVar;
        KeyPair keyPairE = bet.e(bet.h(azy.c(bcaVar.e().g().e())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairE.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairE.getPrivate();
        ECPoint w = eCPublicKey.getW();
        bcf bcfVarD = bcg.d();
        bcfVarD.b();
        bcfVarD.a(bcaVar.e());
        bcfVarD.c(bkd.o(w.getAffineX().toByteArray()));
        bcfVarD.d(bkd.o(w.getAffineY().toByteArray()));
        bcg bcgVarAc = bcfVarD.ac();
        bcd bcdVarC = bce.c();
        bcdVarC.c();
        bcdVarC.b(bcgVarAc);
        bcdVarC.a(bkd.o(eCPrivateKey.getS().toByteArray()));
        return bcdVarC.ac();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final Map<String, axe<bca>> d() {
        HashMap map = new HashMap();
        bcj bcjVar = bcj.NIST_P256;
        bck bckVar = bck.SHA256;
        bbw bbwVar = bbw.UNCOMPRESSED;
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", azp.k(bcjVar, bckVar, bbwVar, axv.a("AES128_GCM"), azp.f20743a, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", azp.k(bcjVar, bckVar, bbwVar, axv.a("AES128_GCM"), azp.f20743a, 3));
        bbw bbwVar2 = bbw.COMPRESSED;
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", azp.k(bcjVar, bckVar, bbwVar2, axv.a("AES128_GCM"), azp.f20743a, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", azp.k(bcjVar, bckVar, bbwVar2, axv.a("AES128_GCM"), azp.f20743a, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", azp.k(bcjVar, bckVar, bbwVar2, axv.a("AES128_GCM"), azp.f20743a, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", azp.k(bcjVar, bckVar, bbwVar, axv.a("AES128_CTR_HMAC_SHA256"), azp.f20743a, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", azp.k(bcjVar, bckVar, bbwVar, axv.a("AES128_CTR_HMAC_SHA256"), azp.f20743a, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", azp.k(bcjVar, bckVar, bbwVar2, axv.a("AES128_CTR_HMAC_SHA256"), azp.f20743a, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", azp.k(bcjVar, bckVar, bbwVar2, axv.a("AES128_CTR_HMAC_SHA256"), azp.f20743a, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ void e(blz blzVar) throws GeneralSecurityException {
        azy.b(((bca) blzVar).e());
    }
}
