package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0897Np {
    public static byte[] A01;
    public static String[] A02;
    public final Map<String, String> A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {71, 90, 86, 80, 67, 125, 74, 75, 76, 86, 81, 5, 30, 4, DateTimeFieldType.MINUTE_OF_DAY, 25};
        String[] strArr = A02;
        if (strArr[6].charAt(15) == strArr[1].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "rnLFNN7HWa";
        strArr2[3] = "rnLFNN7HWa";
        A01 = bArr;
    }

    public static void A02() {
        A02 = new String[]{"CvydOG1rdpeZVjh1I2HxFGGpkCBtP1uR", "LPAb8wO4e9Bm4297vBHQiNlf50jewka4", "p6i6iSivtdsam", "kr1L5mV", "OjxdnAkOIagRjcigNYlctVvlDEXS237l", "CTcf", "XEPmNqkHOtxVdZCukAC2cQoZWEBCmlPv", "qw43eBE0dfm3vpW8jqKcT1ME9HQ7Rm2E"};
    }

    public C0897Np() {
        this.A00 = new HashMap();
    }

    public C0897Np(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final C0897Np A03(@Nullable C0849Ls c0849Ls) {
        if (c0849Ls != null) {
            this.A00.put(A00(11, 5, 0), LY.A01(c0849Ls.A05()));
        }
        return this;
    }

    public final C0897Np A04(@Nullable Q2 q2) {
        if (q2 != null) {
            this.A00.putAll(q2.A0U());
        }
        return this;
    }

    public final C0897Np A05(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 83), str);
        }
        return this;
    }

    public final Map<String, String> A06() {
        return this.A00;
    }
}
