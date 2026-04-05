package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1054Tt extends C6Q implements C6L {
    public C6A A00;
    public final C04715u A01;
    public final Map<Integer, C04776a> A02;

    @SuppressLint({"UseSparseArrays"})
    public C1054Tt(Context context, C04715u c04715u) {
        super(context, c04715u);
        this.A02 = new HashMap();
        this.A01 = c04715u;
    }

    public final void A03(C04776a c04776a) {
        this.A02.put(Integer.valueOf(c04776a.A00()), c04776a);
    }

    public final void A04(EnumC04816e enumC04816e, Context context) {
        this.A00 = C6A.A00(context, this.A01);
        this.A00.A05(this.A02, enumC04816e);
    }

    @Override // com.facebook.ads.redexgen.X.C6L
    public final void ABb() {
        C6A c6a = this.A00;
        if (c6a != null) {
            c6a.A04();
        }
    }
}
