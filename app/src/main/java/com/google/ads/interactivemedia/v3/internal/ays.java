package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ays extends axf<bbv, bbu> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ayt f20723a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ays(ayt aytVar, Class cls) {
        super(cls);
        this.f20723a = aytVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ blz a(bkd bkdVar) {
        return bbv.d(bkdVar, bkm.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ bbu c(blz blzVar) {
        bbt bbtVarC = bbu.c();
        bbtVarC.b();
        bbtVarC.a(bkd.o(bes.b(32)));
        return bbtVarC.ac();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final Map<String, axe<bbv>> d() {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", new axe(bbv.c(), 1));
        map.put("CHACHA20_POLY1305_RAW", new axe(bbv.c(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axf
    public final /* bridge */ /* synthetic */ void e(blz blzVar) {
    }
}
