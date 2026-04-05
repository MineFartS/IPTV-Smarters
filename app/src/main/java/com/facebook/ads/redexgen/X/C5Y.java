package com.facebook.ads.redexgen.X;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5Y {
    public final long A00;
    public final C5X A01;
    public final String A02;
    public final boolean A03;

    public C5Y(String str, boolean z, C5X c5x) {
        this(str, z, c5x, System.currentTimeMillis());
    }

    public C5Y(String str, boolean z, C5X c5x, long j2) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = c5x;
        this.A00 = j2;
    }

    public static C5Y A00() {
        return new C5Y(BuildConfig.FLAVOR, true, C5X.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final C5X A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
