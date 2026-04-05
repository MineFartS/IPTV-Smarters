package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1055Tu extends C6Q {
    public final List<C04776a> A00;

    public C1055Tu(Context context, C04715u c04715u) {
        super(context, c04715u);
        this.A00 = new ArrayList();
    }

    public final List<C04776a> A03() {
        return Collections.unmodifiableList(this.A00);
    }

    public final void A04(C04776a c04776a) {
        if (c04776a.A03().contains(EnumC04846h.A0B)) {
            this.A00.add(c04776a);
        }
    }

    public final void A05(EnumC04816e enumC04816e) {
        A02(enumC04816e, this.A00);
    }
}
