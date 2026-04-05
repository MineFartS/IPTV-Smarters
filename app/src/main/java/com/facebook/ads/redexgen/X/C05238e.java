package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05238e extends Exception {
    public int A00;
    public int A01;

    @Nullable
    public JSONObject A02;
    public boolean A03;
    public boolean A04;

    public C05238e(String str) {
        super(str);
        this.A00 = 0;
        this.A03 = true;
        this.A01 = -1;
    }

    public C05238e(String str, String str2) {
        super(str + '\n' + str2);
        this.A00 = 0;
        this.A03 = true;
        this.A01 = -1;
    }

    public C05238e(Throwable th) {
        super(th);
        this.A00 = 0;
        this.A03 = true;
        this.A01 = -1;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    @Nullable
    public final JSONObject A02() {
        return this.A02;
    }

    public final void A03(int i2) {
        this.A00 = i2;
    }

    public final void A04(int i2) {
        this.A01 = i2;
    }

    public final void A05(@Nullable JSONObject jSONObject) {
        this.A02 = jSONObject;
    }

    public final void A06(boolean z) {
        this.A03 = z;
    }

    public final void A07(boolean z) {
        this.A04 = z;
    }

    public final boolean A08() {
        return this.A03;
    }

    public final boolean A09() {
        return this.A04;
    }
}
