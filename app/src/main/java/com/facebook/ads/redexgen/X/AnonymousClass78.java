package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.78, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass78 implements Callable<Boolean> {
    public static byte[] A02;
    public static String[] A03;
    public final C7B A00;
    public final /* synthetic */ C7C A01;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{114, 126, 109, 116, 106, 111, 43, 52, 57, 56, 50};
        if (A03[1].length() != 15) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "XFV0lH04tD";
        strArr[5] = "8rdCtS3Igw";
    }

    public static void A03() {
        A03 = new String[]{"4L70rbdc", "PBHhMXx0npnpwTY", "91GJPzFmEyeOW3DYeKz29HPCrWXW0gNC", "umTRidE45okZulrVlJrHIV8", "kRbho3HgdeG0CdJ8rA209tRImftPXEnI", "60YY30c8MY", "ZuHjaYDngPTOcLYvMZdLe8TI8ruUn8GD", "lL0vcWHD5F"};
    }

    public AnonymousClass78(C7C c7c, C7B c7b) {
        this.A01 = c7c;
        this.A00 = c7b;
    }

    private final Boolean A00() throws Throwable {
        if (C0822Kp.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A08, this.A00.A07, this.A00.A06, this.A00.A04 ? A01(0, 6, 63) : A01(6, 5, 125), this.A00.A02, this.A00.A05);
            anonymousClass06.A04 = this.A00.A03;
            anonymousClass06.A02 = this.A00.A01;
            anonymousClass06.A05 = this.A00.A04;
            if (C7F.A06(this.A01.A04)) {
                C7C.A0E.put(this.A00.A08, anonymousClass06);
            }
            return Boolean.valueOf(C7C.A02(this.A01.A04.A00()).ACb(anonymousClass06) != null);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (C0822Kp.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            return null;
        }
    }
}
