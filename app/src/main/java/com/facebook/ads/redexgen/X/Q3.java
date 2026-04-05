package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Q3 {
    public float A00;
    public C0R A01;
    public Map<String, String> A02;

    public Q3(C0R c0r) {
        this(c0r, 0.0f);
    }

    public Q3(C0R c0r, float f2) {
        this(c0r, f2, null);
    }

    public Q3(C0R c0r, float f2, Map<String, String> map) {
        this.A01 = c0r;
        this.A00 = f2;
        if (map != null) {
            this.A02 = map;
        } else {
            Map<String, String> windowParams = new HashMap<>();
            this.A02 = windowParams;
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final C0R A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == C0R.A0J;
    }
}
