package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1B implements Serializable {
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public C1S A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    public final C1B A0B(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C1B A0C(int i2) {
        this.A01 = i2;
        return this;
    }

    public final C1B A0D(int i2) {
        this.A02 = i2;
        return this;
    }

    public final C1B A0E(int i2) {
        this.A03 = i2;
        return this;
    }

    public final C1B A0F(int i2) {
        this.A04 = i2;
        return this;
    }

    public final C1B A0G(long j2) {
        this.A05 = j2;
        return this;
    }

    public final C1B A0H(@Nullable C1S c1s) {
        this.A06 = c1s;
        return this;
    }

    public final C1B A0I(String str) {
        this.A07 = str;
        return this;
    }

    public final C1B A0J(String str) {
        this.A08 = str;
        return this;
    }

    public final C1B A0K(boolean z) {
        this.A09 = z;
        return this;
    }

    public final C1B A0L(boolean z) {
        this.A0A = z;
        return this;
    }

    public final C1C A0M() {
        return new C1C(this);
    }
}
