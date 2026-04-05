package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C03511a {
    public int A00;
    public int A01;
    public String A02;

    public C03511a(String str, int i2, int i3) {
        this.A02 = str;
        this.A01 = Math.min(C0856Lz.A02.widthPixels, (int) (i2 * C0856Lz.A01));
        this.A00 = Math.min(C0856Lz.A02.heightPixels, (int) (i3 * C0856Lz.A01));
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }
}
