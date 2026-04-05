package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZX implements DT {
    public static String[] A05;
    public final int A00;
    public final /* synthetic */ ZY A04;
    public final C0767Ik A03 = new C0767Ik(new byte[5]);
    public final SparseArray<InterfaceC0635Da> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    static {
        A01();
    }

    public static void A01() {
        A05 = new String[]{"RGyTh4SpGx69CnC3uYB0gmKqWWTNP", "iDg", "j2BD3qxwlCatqD2Ch8dsr4SydA7XKwXL", "m1LAn1cIXYa33UPzElI", "cPJKdoCFMTZnGOgvNAg6pI", "iUx5cAJ8Ufw2U1Fp6uB6P", "qd", "YeOgnvzSUR8"};
    }

    public ZX(ZY zy, int i2) {
        this.A04 = zy;
        this.A00 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.DX A00(com.facebook.ads.redexgen.X.C0768Il r13, int r14) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZX.A00(com.facebook.ads.redexgen.X.Il, int):com.facebook.ads.redexgen.X.DX");
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final void A48(C0768Il c0768Il) {
        C0780Ix c0780Ix;
        InterfaceC0635Da interfaceC0635DaA4P;
        if (c0768Il.A0F() != 2) {
            return;
        }
        if (this.A04.A05 != 1 && this.A04.A05 != 2 && this.A04.A01 != 1) {
            c0780Ix = new C0780Ix(((C0780Ix) this.A04.A0B.get(0)).A04());
            this.A04.A0B.add(c0780Ix);
        } else {
            c0780Ix = (C0780Ix) this.A04.A0B.get(0);
        }
        c0768Il.A0a(2);
        int iA0J = c0768Il.A0J();
        int i2 = 5;
        c0768Il.A0a(5);
        c0768Il.A0b(this.A03, 2);
        int i3 = 4;
        this.A03.A09(4);
        int i4 = 12;
        int programNumber = this.A03.A05(12);
        c0768Il.A0a(programNumber);
        int programNumber2 = this.A04.A05;
        int programInfoLength = 21;
        if (programNumber2 == 2 && this.A04.A03 == null) {
            DX dx = new DX(21, null, null, new byte[0]);
            ZY zy = this.A04;
            zy.A03 = zy.A09.A4P(21, dx);
            this.A04.A03.A7X(c0780Ix, this.A04.A02, new DZ(iA0J, 21, 8192));
        }
        this.A01.clear();
        this.A02.clear();
        int iA05 = c0768Il.A05();
        while (iA05 > 0) {
            c0768Il.A0b(this.A03, i2);
            int iA052 = this.A03.A05(8);
            this.A03.A09(3);
            int iA053 = this.A03.A05(13);
            this.A03.A09(i3);
            int iA054 = this.A03.A05(i4);
            DX dxA00 = A00(c0768Il, iA054);
            if (iA052 == 6) {
                iA052 = dxA00.A00;
            }
            int esInfoLength = iA054 + 5;
            iA05 -= esInfoLength;
            int esInfoLength2 = this.A04.A05;
            int i5 = esInfoLength2 == 2 ? iA052 : iA053;
            if (!this.A04.A07.get(i5)) {
                int trackId = this.A04.A05;
                if (trackId != 2 || iA052 != programInfoLength) {
                    ZY zy2 = this.A04;
                    String[] strArr = A05;
                    String str = strArr[0];
                    String str2 = strArr[1];
                    int programInfoLength2 = str.length();
                    if (programInfoLength2 == str2.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A05;
                    strArr2[5] = "uMTX0BK3hwRt9LI9TXEhN";
                    strArr2[7] = "Q6yhhKO6s7v";
                    interfaceC0635DaA4P = zy2.A09.A4P(iA052, dxA00);
                } else {
                    interfaceC0635DaA4P = this.A04.A03;
                }
                if (this.A04.A05 != 2 || iA053 < this.A02.get(i5, 8192)) {
                    SparseIntArray sparseIntArray = this.A02;
                    int programInfoLength3 = A05[4].length();
                    if (programInfoLength3 == 17) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A05;
                    strArr3[3] = "hYuW2ZxScZvjOUyRYzD";
                    strArr3[3] = "hYuW2ZxScZvjOUyRYzD";
                    sparseIntArray.put(i5, iA053);
                    this.A01.put(i5, interfaceC0635DaA4P);
                }
            }
            i2 = 5;
            i3 = 4;
            i4 = 12;
            programInfoLength = 21;
        }
        int size = this.A02.size();
        for (int i6 = 0; i6 < size; i6++) {
            int iKeyAt = this.A02.keyAt(i6);
            this.A04.A07.put(iKeyAt, true);
            InterfaceC0635Da interfaceC0635DaValueAt = this.A01.valueAt(i6);
            if (interfaceC0635DaValueAt != null) {
                if (interfaceC0635DaValueAt != this.A04.A03) {
                    interfaceC0635DaValueAt.A7X(c0780Ix, this.A04.A02, new DZ(iA0J, iKeyAt, 8192));
                }
                SparseArray sparseArray = this.A04.A06;
                int trackIdCount = this.A02.valueAt(i6);
                sparseArray.put(trackIdCount, interfaceC0635DaValueAt);
            }
        }
        if (this.A04.A05 != 2) {
            int i7 = 0;
            SparseArray sparseArray2 = this.A04.A06;
            int programInfoLength4 = this.A00;
            sparseArray2.remove(programInfoLength4);
            ZY zy3 = this.A04;
            if (zy3.A05 != 1) {
                i7 = this.A04.A01 - 1;
            }
            zy3.A01 = i7;
            if (this.A04.A01 != 0) {
                return;
            }
            this.A04.A02.A4x();
            this.A04.A04 = true;
            return;
        }
        if (this.A04.A04) {
            return;
        }
        this.A04.A02.A4x();
        this.A04.A01 = 0;
        this.A04.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final void A7X(C0780Ix c0780Ix, CH ch, DZ dz) {
    }
}
