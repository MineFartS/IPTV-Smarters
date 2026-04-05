package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0779Iw {
    public static String[] A07;
    public static final Comparator<C0778Iv> A08;
    public static final Comparator<C0778Iv> A09;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C0778Iv[] A06 = new C0778Iv[5];
    public final ArrayList<C0778Iv> A05 = new ArrayList<>();
    public int A00 = -1;

    public static void A02() {
        A07 = new String[]{"v8bLZp59B3s5kjImuBjcCmNW", "l5XLQfXbQh6R34DBcL2a2gRDiWiOWq7j", "cKC0Gfnr6KNVk9zoAEVguSpqajRxhGsy", "4MzGZFDG0CqgMdioIrH5vwyzFGAbThRu", "MvXRt7wPeDxEfDCDFesb3zWoJZhNCkxf", "mCnVL7G0HMRU3KziMebPW175T1XCPvkW", "oyPZ3wFE5cpoHVmJFEQQrP2WxUjSMaR1", "eOuchRPwSpgwlWmZThUBhEapR1FbTYXS"};
    }

    static {
        A02();
        A08 = new C0776It();
        A09 = new C0777Iu();
    }

    public C0779Iw(int i2) {
        this.A04 = i2;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    public final float A03(float f2) {
        A01();
        float f3 = this.A03 * f2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList<C0778Iv> arrayList = this.A05;
            if (A07[7].charAt(12) != 'l') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[1] = "MYxxtSQw2w0IEM5GsYZTgS2IPhbXFMQD";
            strArr[1] = "MYxxtSQw2w0IEM5GsYZTgS2IPhbXFMQD";
            int i4 = arrayList.size();
            if (i3 < i4) {
                C0778Iv c0778Iv = this.A05.get(i3);
                int i5 = c0778Iv.A02;
                i2 += i5;
                if (i2 >= f3) {
                    return c0778Iv.A00;
                }
                i3++;
            } else {
                if (this.A05.isEmpty()) {
                    return Float.NaN;
                }
                return this.A05.get(r1.size() - 1).A00;
            }
        }
    }

    public final void A04(int i2, float f2) {
        C0778Iv c0778Iv;
        A00();
        int i3 = this.A02;
        if (i3 > 0) {
            C0778Iv[] c0778IvArr = this.A06;
            int i4 = i3 - 1;
            this.A02 = i4;
            c0778Iv = c0778IvArr[i4];
        } else {
            c0778Iv = new C0778Iv(null);
        }
        int i5 = this.A01;
        this.A01 = i5 + 1;
        c0778Iv.A01 = i5;
        if (A07[6].charAt(29) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[0] = "5E26ZSMWQoSDuNI0YD8YDk9y";
        strArr[0] = "5E26ZSMWQoSDuNI0YD8YDk9y";
        c0778Iv.A02 = i2;
        c0778Iv.A00 = f2;
        this.A05.add(c0778Iv);
        this.A03 += i2;
        while (true) {
            int i6 = this.A03;
            int i7 = this.A04;
            if (i6 > i7) {
                int i8 = i6 - i7;
                C0778Iv c0778Iv2 = this.A05.get(0);
                if (c0778Iv2.A02 <= i8) {
                    this.A03 -= c0778Iv2.A02;
                    this.A05.remove(0);
                    int i9 = this.A02;
                    if (i9 < 5) {
                        C0778Iv[] c0778IvArr2 = this.A06;
                        if (A07[6].charAt(29) != 'a') {
                            this.A02 = i9 + 1;
                            c0778IvArr2[i9] = c0778Iv2;
                        } else {
                            String[] strArr2 = A07;
                            strArr2[0] = "NjEm8Wq6Ir4EIF9DQvkt7JHV";
                            strArr2[0] = "NjEm8Wq6Ir4EIF9DQvkt7JHV";
                            this.A02 = i9 + 1;
                            c0778IvArr2[i9] = c0778Iv2;
                        }
                    }
                } else {
                    c0778Iv2.A02 -= i8;
                    this.A03 -= i8;
                }
            } else {
                return;
            }
        }
    }
}
