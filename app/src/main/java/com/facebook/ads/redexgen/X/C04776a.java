package com.facebook.ads.redexgen.X;

import java.util.EnumSet;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04776a {
    public final int A00;
    public final InterfaceC04806d A01;
    public final EnumSet<EnumC04846h> A02;

    public C04776a(int i2, EnumSet<EnumC04846h> enumSet, InterfaceC04806d interfaceC04806d) {
        this.A00 = i2;
        this.A02 = enumSet;
        this.A01 = interfaceC04806d;
    }

    public final int A00() {
        return this.A00;
    }

    @Nullable
    public final InterfaceC04806d A01() {
        if (this.A02.contains(EnumC04846h.A07)) {
            return this.A01;
        }
        return null;
    }

    @Nullable
    public final InterfaceC04806d A02(EnumC04816e enumC04816e) {
        if (A04(enumC04816e)) {
            return this.A01;
        }
        return null;
    }

    public final EnumSet<EnumC04846h> A03() {
        return this.A02;
    }

    public final boolean A04(EnumC04816e enumC04816e) {
        return AnonymousClass71.A0F(enumC04816e) && this.A02.contains(EnumC04846h.A00(enumC04816e.A03()));
    }
}
