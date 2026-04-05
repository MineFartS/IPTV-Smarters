package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D6 {
    public static String[] A05;
    public int A01;
    public boolean A02;
    public final D7 A03 = new D7();
    public final C0768Il A04 = new C0768Il(new byte[65025], 0);
    public int A00 = -1;

    static {
        A01();
    }

    public static void A01() {
        A05 = new String[]{"YmqCfQGeJdZscNiSsRHgK8Xqwc4qCDQV", "BEVC1cuwi5mxHrGOZ29iGldY3rFRULVC", "DSPc42zLHxXdWx97yn92wynUTyNm", "qbq", "Vn6wbfa2hXyYQug1oukzP6oQFgTa", "a4c", "hss", "EwoauNNUoRbyLKR"};
    }

    private int A00(int i2) {
        this.A01 = 0;
        int i3 = 0;
        while (this.A01 + i2 < this.A03.A02) {
            int[] iArr = this.A03.A09;
            int i4 = this.A01;
            this.A01 = i4 + 1;
            int i5 = iArr[i4 + i2];
            i3 += i5;
            if (i5 != 255) {
                break;
            }
        }
        return i3;
    }

    public final D7 A02() {
        return this.A03;
    }

    public final C0768Il A03() {
        return this.A04;
    }

    public final void A04() {
        this.A03.A03();
        this.A04.A0W();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A05() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        C0768Il c0768Il = this.A04;
        c0768Il.A00 = Arrays.copyOf(c0768Il.A00, Math.max(65025, this.A04.A08()));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A06(com.facebook.ads.redexgen.X.CG r8) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D6.A06(com.facebook.ads.redexgen.X.CG):boolean");
    }
}
