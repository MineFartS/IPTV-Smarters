package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04745x {
    public final List<InterfaceC04735w> A00 = new ArrayList();

    public final void A00(InterfaceC04735w interfaceC04735w) {
        this.A00.add(interfaceC04735w);
    }

    public final void A01(EnumC04816e enumC04816e) {
        Iterator<InterfaceC04735w> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().ADh(enumC04816e);
        }
    }
}
