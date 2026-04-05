package com.google.ads.interactivemedia.v3.internal;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aym extends axf<bbk, bbi> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ayn f20721a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aym(ayn aynVar, Class cls) {
        super(cls);
        this.f20721a = aynVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ blz a(bkd bkdVar) {
        return bbk.e(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ bbi c(blz blzVar) {
        bbh bbhVarC = bbi.c();
        bbhVarC.a(bkd.o(bes.b(((bbk) blzVar).a())));
        bbhVarC.b();
        return bbhVarC.ac();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final Map<String, axe<bbk>> d() {
        HashMap map = new HashMap();
        map.put("AES128_GCM", ayn.j(16, 1));
        map.put("AES128_GCM_RAW", ayn.j(16, 3));
        map.put("AES256_GCM", ayn.j(32, 1));
        map.put("AES256_GCM_RAW", ayn.j(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ void e(blz blzVar) throws InvalidAlgorithmParameterException {
        beu.a(((bbk) blzVar).a());
    }
}
