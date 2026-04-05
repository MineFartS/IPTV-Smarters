package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z6 implements CF {
    public static byte[] A03;
    public static final CI A04;
    public CH A00;
    public DB A01;
    public boolean A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{95, 120, 112, 117, 124, 125, 57, 109, 118, 57, 125, 124, 109, 124, 107, 116, 112, 119, 124, 57, 123, 112, 109, 106, 109, 107, 124, 120, 116, 57, 109, 96, 105, 124};
    }

    static {
        A02();
        A04 = new Z5();
    }

    public static C0768Il A00(C0768Il c0768Il) {
        c0768Il.A0Z(0);
        return c0768Il;
    }

    private boolean A03(CG cg) throws InterruptedException, IOException {
        D7 d7 = new D7();
        if (!d7.A04(cg, true) || (d7.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(d7.A00, 8);
        C0768Il c0768Il = new C0768Il(length);
        cg.ABc(c0768Il.A00, 0, length);
        C0768Il scratch = A00(c0768Il);
        if (Z4.A05(scratch)) {
            this.A01 = new Z4();
        } else {
            C0768Il scratch2 = A00(c0768Il);
            if (Z9.A07(scratch2)) {
                this.A01 = new Z9();
            } else {
                C0768Il scratch3 = A00(c0768Il);
                if (!Z7.A05(scratch3)) {
                    return false;
                }
                this.A01 = new Z7();
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A7V(CH ch) {
        this.A00 = ch;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final int AC0(CG cg, CM cm) throws InterruptedException, IOException {
        if (this.A01 == null) {
            if (A03(cg)) {
                cg.ACd();
            } else {
                throw new AI(A01(0, 34, 107));
            }
        }
        if (!this.A02) {
            CR crADb = this.A00.ADb(0, 1);
            this.A00.A4x();
            this.A01.A07(this.A00, crADb);
            this.A02 = true;
        }
        return this.A01.A03(cg, cm);
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void ACm(long j2, long j3) {
        DB db = this.A01;
        if (db != null) {
            db.A06(j2, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final boolean ADK(CG cg) throws InterruptedException, IOException {
        try {
            return A03(cg);
        } catch (AI unused) {
            return false;
        }
    }
}
