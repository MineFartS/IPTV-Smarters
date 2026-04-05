package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03400p {
    public static byte[] A04;
    public static String[] A05;
    public boolean A00;
    public final X2 A01;
    public final AbstractC03410q A02;
    public final Q2 A03;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 37);
            String[] strArr = A05;
            if (strArr[7].charAt(19) == strArr[3].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ralyQsFIfJjHchT6ijaCYOn7xcrh9SYP";
            strArr2[0] = "lf1tsTh5P7IODA8hmkOKCVUdKtrYifbk";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-126, -90, -87, -85, -98, -84, -84, -94, -88, -89, 89, -91, -88, -96, -96, -98, -99};
    }

    public static void A02() {
        A05 = new String[]{"OqcLT37Xtir4oyEfNmT1h4Rk4YkQZZDY", "Uwe5RI", "pL0dXLjcEL0YvPTfwlaTsWSX1DbaAkE5", "xtw7OOYBvYdKgcW8WzcZrKA0PDZy4bwg", "f918FI", "0rYE8aKdqB5alUcDRGHr7byWf0zxjLED", "HJdrWZ0hD1uhwEG", "W2AWehjS6wPr2mpVEIqcODXDVwSDQEbA"};
    }

    public abstract void A07(Map<String, String> map);

    public AbstractC03400p(X2 x2, AbstractC03410q abstractC03410q, Q2 q2) {
        this.A01 = x2;
        this.A02 = abstractC03410q;
        this.A03 = q2;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        AbstractC03410q abstractC03410q = this.A02;
        if (abstractC03410q != null) {
            abstractC03410q.A01();
        }
        A07(new C0897Np().A04(this.A03).A06());
        this.A00 = true;
        LK.A02(this.A01, A00(0, 17, 20));
        AbstractC03410q abstractC03410q2 = this.A02;
    }
}
