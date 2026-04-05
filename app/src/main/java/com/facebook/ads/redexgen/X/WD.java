package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WD implements InterfaceC04806d {
    public final /* synthetic */ C6Z A00;
    public final /* synthetic */ WF A01;
    public final /* synthetic */ List A02;

    public WD(WF wf, List list, C6Z c6z) {
        this.A01 = wf;
        this.A02 = list;
        this.A00 = c6z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        HashMap map = new HashMap();
        for (C04796c c04796c : this.A02) {
            if (c04796c.A02()) {
                String str = (String) c04796c.A01();
                map.put(str, new WE(this.A01.A00, str, this.A00));
            }
        }
        return this.A01.A03(map);
    }
}
