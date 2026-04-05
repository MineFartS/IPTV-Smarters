package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0728Gv {
    public static String[] A09;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C0768Il A07 = new C0768Il();
    public final int[] A08 = new int[256];

    static {
        A00();
    }

    public static void A00() {
        A09 = new String[]{"dgnk6daQ0T87wOoHtyty7iRYaKvd8BzP", "TK3sWG", "r0T7HSyuXxeUz69yLbXIR4BhIiF2UDCf", "E94UIter8sht222SneNEBcgvWBNv8GHv", "qg4jsBrtjCwX7ZbqQAPOhxC1noKxQthL", "J", "sUrKaEkRL4ABh9brwle2ScDHOfoRuahW", "YVc6k2"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(C0768Il c0768Il, int i2) {
        int iA0H;
        if (i2 < 4) {
            return;
        }
        c0768Il.A0a(3);
        int i3 = i2 - 4;
        if ((c0768Il.A0F() & 128) != 0) {
            if (i3 < 7 || (iA0H = c0768Il.A0H()) < 4) {
                return;
            }
            this.A01 = c0768Il.A0J();
            this.A00 = c0768Il.A0J();
            this.A07.A0X(iA0H - 4);
            i3 -= 7;
        }
        int iA07 = this.A07.A07();
        int iA08 = this.A07.A08();
        if (iA07 < iA08 && i3 > 0) {
            int bytesToRead = Math.min(i3, iA08 - iA07);
            c0768Il.A0d(this.A07.A00, iA07, bytesToRead);
            this.A07.A0Z(iA07 + bytesToRead);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(C0768Il c0768Il, int i2) {
        if (i2 < 19) {
            return;
        }
        this.A05 = c0768Il.A0J();
        this.A04 = c0768Il.A0J();
        c0768Il.A0a(11);
        this.A02 = c0768Il.A0J();
        this.A03 = c0768Il.A0J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(C0768Il c0768Il, int i2) {
        if (i2 % 5 != 2) {
            return;
        }
        c0768Il.A0a(2);
        Arrays.fill(this.A08, 0);
        int i3 = i2 / 5;
        for (int r = 0; r < i3; r++) {
            int iA0F = c0768Il.A0F();
            int iA0F2 = c0768Il.A0F();
            int iA0F3 = c0768Il.A0F();
            int iA0F4 = c0768Il.A0F();
            int entryCount = c0768Il.A0F();
            int i4 = (int) (((double) iA0F2) + (((double) (iA0F3 - 128)) * 1.402d));
            int cb = iA0F4 - 128;
            double d2 = ((double) iA0F2) - (((double) cb) * 0.34414d);
            int i5 = iA0F3 - 128;
            int i6 = (int) (d2 - (((double) i5) * 0.71414d));
            int i7 = iA0F4 - 128;
            int i8 = (int) (((double) iA0F2) + (((double) i7) * 1.772d));
            int[] iArr = this.A08;
            int i9 = J1.A06(i4, 0, 255);
            int i10 = (entryCount << 24) | (i9 << 16);
            int i11 = J1.A06(i6, 0, 255);
            int i12 = i10 | (i11 << 8);
            int i13 = J1.A06(i8, 0, 255);
            iArr[iA0F] = i12 | i13;
        }
        this.A06 = true;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x003b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.C0707Ga A07() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0728Gv.A07():com.facebook.ads.redexgen.X.Ga");
    }

    public final void A08() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0X(0);
        this.A06 = false;
    }
}
