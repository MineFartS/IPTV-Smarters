package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.amazonaws.event.ProgressEvent;
import java.io.IOException;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZS implements CF {
    public static String[] A08;
    public static final CI A09;
    public long A00;
    public CH A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<DS> A05;
    public final C0768Il A06;
    public final C0780Ix A07;

    public static void A00() {
        A08 = new String[]{BuildConfig.FLAVOR, "mExdGVP0maPlz", "mtU4GW9lJGPRgwi7WTtJ47xTDMOD9Jvz", "mnVK2jaR5CYO63Y95SEKprVffrLm5k0s", "WHnhbYArFQVibafDHBFVvoYN0aOa9WUH", "bzekXst0bt0AdcZvIiwJXkkJcIHRgIjU", "gyTL2jV1VgKAzlNybmW", "q"};
    }

    static {
        A00();
        A09 = new ZR();
    }

    public ZS() {
        this(new C0780Ix(0L));
    }

    public ZS(C0780Ix c0780Ix) {
        this.A07 = c0780Ix;
        this.A06 = new C0768Il(ProgressEvent.PART_FAILED_EVENT_CODE);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A7V(CH ch) {
        this.A01 = ch;
        ch.ACn(new C1167Yc(-9223372036854775807L));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
    @Override // com.facebook.ads.redexgen.X.CF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int AC0(com.facebook.ads.redexgen.X.CG r10, com.facebook.ads.redexgen.X.CM r11) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZS.AC0(com.facebook.ads.redexgen.X.CG, com.facebook.ads.redexgen.X.CM):int");
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void ACm(long j2, long j3) {
        this.A07.A09();
        for (int i2 = 0; i2 < this.A05.size(); i2++) {
            this.A05.valueAt(i2).A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final boolean ADK(CG cg) throws InterruptedException, IOException {
        byte[] bArr = new byte[14];
        cg.ABc(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        if (A08[7].length() == 3) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[4] = "dWjhqjXulz1hd3AtKzuGBSPNQhOMyT1H";
        strArr[4] = "dWjhqjXulz1hd3AtKzuGBSPNQhOMyT1H";
        cg.A3M(bArr[13] & 7);
        cg.ABc(bArr, 0, 3);
        return 1 == ((bArr[2] & 255) | (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)));
    }
}
