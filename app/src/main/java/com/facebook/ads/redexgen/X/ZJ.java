package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZJ implements DL {
    public static byte[] A06;
    public static String[] A07;
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<DW> A04;
    public final CR[] A05;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{117, 100, 100, 120, 125, 119, 117, 96, 125, 123, 122, 59, 112, 98, 118, 103, 97, 118, 103};
    }

    public static void A02() {
        A07 = new String[]{"Jiy", "2wEJIBTa4RvP8yrIwKSodHRjo9", "akcZBAKpF", "EuZb8kUx1OZ", "XeLxT4hCbfpB8vk3L3qpbFThh9kK", "oaj", "R8TqjunyKtvNfOkCV", "nGIequV"};
    }

    public ZJ(List<DW> list) {
        this.A04 = list;
        this.A05 = new CR[list.size()];
    }

    private boolean A03(C0768Il c0768Il, int i2) {
        if (c0768Il.A05() == 0) {
            return false;
        }
        if (c0768Il.A0F() != i2) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A48(C0768Il c0768Il) {
        if (this.A03) {
            if (this.A00 == 2 && !A03(c0768Il, 32)) {
                return;
            }
            if (this.A00 == 1 && !A03(c0768Il, 0)) {
                return;
            }
            int iA07 = c0768Il.A07();
            int iA05 = c0768Il.A05();
            for (CR output : this.A05) {
                c0768Il.A0Z(iA07);
                output.ACh(c0768Il, iA05);
            }
            this.A01 += iA05;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A4V(CH ch, DZ dz) {
        int i2 = 0;
        while (true) {
            CR[] crArr = this.A05;
            String[] strArr = A07;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "6Yign7KSgGvnaQ3UG";
            strArr2[0] = "Q7U";
            if (i2 < crArr.length) {
                DW dw = this.A04.get(i2);
                dz.A06();
                CR crADb = ch.ADb(dz.A04(), 3);
                crADb.A5B(Format.A0A(dz.A05(), A00(0, 19, 88), null, -1, 0, Collections.singletonList(dw.A02), dw.A01, null));
                this.A05[i2] = crADb;
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABX() {
        if (this.A03) {
            for (CR cr : this.A05) {
                cr.ACi(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABY(long j2, boolean z) {
        if (!z) {
            return;
        }
        this.A03 = true;
        this.A02 = j2;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ACl() {
        this.A03 = false;
    }
}
