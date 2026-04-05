package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0747Hq extends IOException {
    public final int A00;
    public final C0744Hl A01;

    public C0747Hq(IOException iOException, C0744Hl c0744Hl, int i2) {
        super(iOException);
        this.A01 = c0744Hl;
        this.A00 = i2;
    }

    public C0747Hq(String str, C0744Hl c0744Hl, int i2) {
        super(str);
        this.A01 = c0744Hl;
        this.A00 = i2;
    }

    public C0747Hq(String str, IOException iOException, C0744Hl c0744Hl, int i2) {
        super(str, iOException);
        this.A01 = c0744Hl;
        this.A00 = i2;
    }
}
