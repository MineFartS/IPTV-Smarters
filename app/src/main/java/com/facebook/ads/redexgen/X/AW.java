package com.facebook.ads.redexgen.X;

import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AW extends YI implements InterfaceC0708Gb {
    public static String[] A02;
    public long A00;
    public InterfaceC0708Gb A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{BuildConfig.FLAVOR, "mui60dwzFhaHNm2Uk6c71g13RzPqoL9o", "B0rzWlns", "IaExOe45iIyqIoKsg3ghGHNojNO5y7aX", "6x0KWKc5lmTcd6rSDKCIntspSHI5N7vM", "fpXFGNqhd64a2XzCiJ5Y2uwqVb67lOfi", "JEeTPk6X6cicZdwnLWr3cLjXKJNjxOw", "om0z9vsHwazWN6uDNjDMJ"};
    }

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.X.BU
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j2, InterfaceC0708Gb interfaceC0708Gb, long j3) {
        super.A01 = j2;
        this.A01 = interfaceC0708Gb;
        if (j3 == Long.MAX_VALUE) {
            j3 = super.A01;
        }
        this.A00 = j3;
        if (A02[0].length() != 0) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[1] = "xukRyz5yFwN1nVXA8Rs2f92E1X9llmA1";
        strArr[1] = "xukRyz5yFwN1nVXA8Rs2f92E1X9llmA1";
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final List<C0707Ga> A5r(long j2) {
        return this.A01.A5r(j2 - this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final long A6G(int i2) {
        return this.A01.A6G(i2) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final int A6H() {
        return this.A01.A6H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final int A6b(long j2) {
        return this.A01.A6b(j2 - this.A00);
    }
}
