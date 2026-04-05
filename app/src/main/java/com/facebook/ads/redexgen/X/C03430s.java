package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03430s {
    public static InterfaceC03380n A00;

    public final InterfaceC03380n A00(AdPlacementType adPlacementType) {
        InterfaceC03380n interfaceC03380n = A00;
        if (interfaceC03380n != null) {
            return interfaceC03380n;
        }
        int i2 = C03420r.A00[adPlacementType.ordinal()];
        if (i2 == 1) {
            return new RY();
        }
        if (i2 == 2) {
            return new RZ();
        }
        if (i2 == 3) {
            return new C0986Rb();
        }
        if (i2 == 4) {
            return new F2();
        }
        if (i2 != 5) {
            return null;
        }
        return new F0();
    }
}
