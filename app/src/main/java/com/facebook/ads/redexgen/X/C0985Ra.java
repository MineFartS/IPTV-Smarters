package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0985Ra extends AbstractRunnableC0829Kx {
    public final /* synthetic */ C0986Rb A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C0985Ra(C0986Rb c0986Rb, Map map, Map map2) {
        this.A00 = c0986Rb;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        if (!TextUtils.isEmpty(this.A00.A0L)) {
            HashMap map = new HashMap();
            map.putAll(this.A02);
            map.putAll(this.A01);
            if (this.A00.A0D == null) {
                return;
            }
            this.A00.A0D.A8N(this.A00.A0L, map);
        }
    }
}
