package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bac extends axf<bao, bam> {
    public bac(Class cls) {
        super(cls);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ blz a(bkd bkdVar) {
        return bao.e(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ bam c(blz blzVar) {
        bao baoVar = (bao) blzVar;
        bal balVarC = bam.c();
        balVarC.c();
        balVarC.a(bkd.o(bes.b(baoVar.a())));
        balVarC.b(baoVar.f());
        return balVarC.ac();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final Map<String, axe<bao>> d() {
        HashMap map = new HashMap();
        ban banVarC = bao.c();
        banVarC.a();
        bap bapVarC = baq.c();
        bapVarC.a();
        banVarC.b(bapVarC.ac());
        map.put("AES_CMAC", new axe(banVarC.ac(), 1));
        ban banVarC2 = bao.c();
        banVarC2.a();
        bap bapVarC2 = baq.c();
        bapVarC2.a();
        banVarC2.b(bapVarC2.ac());
        map.put("AES256_CMAC", new axe(banVarC2.ac(), 1));
        ban banVarC3 = bao.c();
        banVarC3.a();
        bap bapVarC3 = baq.c();
        bapVarC3.a();
        banVarC3.b(bapVarC3.ac());
        map.put("AES256_CMAC_RAW", new axe(banVarC3.ac(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ void e(blz blzVar) throws GeneralSecurityException {
        bao baoVar = (bao) blzVar;
        bad.l(baoVar.f());
        bad.m(baoVar.a());
    }
}
