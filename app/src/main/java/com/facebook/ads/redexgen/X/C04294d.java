package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04294d {
    public static C2Q<C04294d> A03 = new SV(20);
    public int A00;

    @Nullable
    public C4A A01;

    @Nullable
    public C4A A02;

    public static C04294d A00() {
        C04294d record = A03.A2P();
        return record == null ? new C04294d() : record;
    }

    public static void A01() {
        while (A03.A2P() != null) {
        }
    }

    public static void A02(C04294d c04294d) {
        c04294d.A00 = 0;
        c04294d.A02 = null;
        c04294d.A01 = null;
        A03.ACJ(c04294d);
    }
}
