package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05699z extends Exception {
    public final int A00;
    public final int A01;

    public C05699z(int i2, String str, Throwable th, int i3) {
        super(str, th);
        this.A01 = i2;
        this.A00 = i3;
    }

    public static C05699z A00(IOException iOException) {
        return new C05699z(0, null, iOException, -1);
    }

    public static C05699z A01(Exception exc, int i2) {
        return new C05699z(1, null, exc, i2);
    }

    public static C05699z A02(RuntimeException runtimeException) {
        return new C05699z(2, null, runtimeException, -1);
    }
}
