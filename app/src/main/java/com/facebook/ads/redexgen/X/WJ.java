package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WJ implements InterfaceC04806d {
    public final /* synthetic */ WL A00;
    public final /* synthetic */ List A01;

    public WJ(WL wl, List list) {
        this.A00 = wl;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        HashMap map = new HashMap();
        for (C04796c c04796c : this.A01) {
            if (c04796c.A02()) {
                String str = (String) c04796c.A01();
                WK systemProperty = new WK(str);
                map.put(str, systemProperty);
            }
        }
        return this.A00.A02(map);
    }
}
