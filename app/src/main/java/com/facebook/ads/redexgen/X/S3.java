package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S3 implements AnonymousClass11 {
    public static byte[] A07;
    public static String[] A08;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C0678Ev A04;
    public final /* synthetic */ C05388t A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{57, 46, 46, 51, 46, 67, 93, 73};
    }

    public static void A02() {
        A08 = new String[]{"NdU3dTBV9vpPy6YybD2Qky8Xp9oiymUK", "iGXlqhzjj4re98AW13mRmUxQt0ip7heY", "i4JUsV98mtHDxTx4GI", "uX4rqc35PVKyGMlab4Ievks4AeXTKuCR", "rLO13ppjW7wMy", "YX8F9O1K3gbo5OniWABn3Un2bmHHQded", "vQnjhTu4uDmsPPd6tCmWM2PRV3nZ7tVA", "6doRqStA7fW6oocsKlayDSgQ6jqa5ScM"};
    }

    public S3(C0678Ev c0678Ev, Runnable runnable, long j2, C05388t c05388t) {
        this.A04 = c0678Ev;
        this.A06 = runnable;
        this.A03 = j2;
        this.A05 = c05388t;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass11
    public final void AAH(C0986Rb c0986Rb) {
        if (!this.A00) {
            this.A00 = true;
            this.A04.A06(this.A05.A05(EnumC05428x.A03), null);
        }
        if (this.A04.A07 != null) {
            this.A04.A07.A0B();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass11
    public final void AAI(C0986Rb c0986Rb) {
        if (c0986Rb != this.A04.A01) {
            return;
        }
        this.A04.A0G().removeCallbacks(this.A06);
        C0678Ev c0678Ev = this.A04;
        c0678Ev.A02 = c0986Rb;
        c0678Ev.A07.A0E(c0986Rb);
        if (!this.A02) {
            this.A02 = true;
            this.A04.A06(this.A05.A05(EnumC05428x.A05), this.A04.A01(this.A03));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass11
    public final void AAJ(C0986Rb c0986Rb) {
        if (!this.A01) {
            this.A01 = true;
            C0678Ev c0678Ev = this.A04;
            C05388t c05388t = this.A05;
            EnumC05428x enumC05428x = EnumC05428x.A04;
            String[] strArr = A08;
            if (strArr[3].charAt(16) != strArr[0].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "w5hMaJohNUScvyTMb6YchiksjKW7iU2S";
            strArr2[0] = "lwejxTPFHVjkcDrib15s3w6szJ9sWeR6";
            c0678Ev.A06(c05388t.A05(enumC05428x), null);
        }
        this.A04.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass11
    public final void AAL(C0986Rb c0986Rb, K7 k7) {
        if (c0986Rb != this.A04.A01) {
            return;
        }
        this.A04.A0G().removeCallbacks(this.A06);
        this.A04.A0P(c0986Rb);
        if (!this.A02) {
            this.A02 = true;
            Map mapA01 = this.A04.A01(this.A03);
            mapA01.put(A00(0, 5, 58), String.valueOf(k7.A04().getErrorCode()));
            mapA01.put(A00(5, 3, 72), String.valueOf(k7.A05()));
            this.A04.A06(this.A05.A05(EnumC05428x.A05), mapA01);
        }
        this.A04.A0O();
    }
}
