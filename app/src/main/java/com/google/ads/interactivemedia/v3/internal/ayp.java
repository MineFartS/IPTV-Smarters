package com.google.ads.interactivemedia.v3.internal;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ayp extends axf<bbo, bbm> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ayq f20722a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayp(ayq ayqVar, Class cls) {
        super(cls);
        this.f20722a = ayqVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ blz a(bkd bkdVar) {
        return bbo.e(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ bbm c(blz blzVar) {
        bbl bblVarC = bbm.c();
        bblVarC.a(bkd.o(bes.b(((bbo) blzVar).a())));
        bblVarC.b();
        return bblVarC.ac();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final Map<String, axe<bbo>> d() {
        HashMap map = new HashMap();
        map.put("AES128_GCM_SIV", ayq.j(16, 1));
        map.put("AES128_GCM_SIV_RAW", ayq.j(16, 3));
        map.put("AES256_GCM_SIV", ayq.j(32, 1));
        map.put("AES256_GCM_SIV_RAW", ayq.j(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ void e(blz blzVar) throws InvalidAlgorithmParameterException {
        beu.a(((bbo) blzVar).a());
    }
}
