package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JV {
    public double A00;
    public EnumC0783Ja A01;
    public EnumC0784Jb A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final JV A00(double d2) {
        this.A00 = d2;
        return this;
    }

    public final JV A01(EnumC0783Ja enumC0783Ja) {
        this.A01 = enumC0783Ja;
        return this;
    }

    public final JV A02(EnumC0784Jb enumC0784Jb) {
        this.A02 = enumC0784Jb;
        return this;
    }

    public final JV A03(String str) {
        this.A03 = str;
        return this;
    }

    public final JV A04(String str) {
        this.A04 = str;
        return this;
    }

    public final JV A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final JV A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final JW A07(C8C c8c) {
        return new JW(c8c, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
