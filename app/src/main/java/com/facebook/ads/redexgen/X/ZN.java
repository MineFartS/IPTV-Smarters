package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZN implements DL {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02;
    public CR A03;
    public boolean A04;
    public final C0768Il A05 = new C0768Il(10);

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 123);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{25, 62, 72, 56, 54, 71, 57, 62, 67, 60, -11, 62, 67, 75, 54, 65, 62, 57, -11, 30, 25, 8, -11, 73, 54, 60, -16, 11, -38, -7, 12, 8, 11, 12, 25, 89, 104, 104, 100, 97, 91, 89, 108, 97, 103, 102, 39, 97, 92, 43};
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A48(C0768Il c0768Il) {
        if (!this.A04) {
            return;
        }
        int iA05 = c0768Il.A05();
        int i2 = this.A00;
        if (i2 < 10) {
            int iMin = Math.min(iA05, 10 - i2);
            System.arraycopy(c0768Il.A00, c0768Il.A07(), this.A05.A00, this.A00, iMin);
            if (this.A00 + iMin == 10) {
                this.A05.A0Z(0);
                if (73 != this.A05.A0F() || 68 != this.A05.A0F() || 51 != this.A05.A0F()) {
                    Log.w(A00(26, 9, 44), A00(0, 26, 90));
                    this.A04 = false;
                    return;
                } else {
                    this.A05.A0a(3);
                    this.A01 = this.A05.A0E() + 10;
                }
            }
        }
        int iMin2 = Math.min(iA05, this.A01 - this.A00);
        this.A03.ACh(c0768Il, iMin2);
        this.A00 += iMin2;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A4V(CH ch, DZ dz) {
        dz.A06();
        this.A03 = ch.ADb(dz.A04(), 4);
        this.A03.A5B(Format.A0B(dz.A05(), A00(35, 15, 125), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABX() {
        int i2;
        if (!this.A04 || (i2 = this.A01) == 0 || this.A00 != i2) {
            return;
        }
        this.A03.ACi(this.A02, 1, i2, 0, null);
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABY(long j2, boolean z) {
        if (!z) {
            return;
        }
        this.A04 = true;
        this.A02 = j2;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ACl() {
        this.A04 = false;
    }
}
