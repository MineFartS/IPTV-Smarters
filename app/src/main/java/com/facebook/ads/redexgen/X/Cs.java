package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Cs {
    public static String[] A0A;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C0622Cm A04;
    public D1 A05;
    public final CR A06;
    public final D3 A07 = new D3();
    public final C0768Il A09 = new C0768Il(1);
    public final C0768Il A08 = new C0768Il();

    static {
        A02();
    }

    public static void A02() {
        A0A = new String[]{"3clh", "In2mDQuCVOg3ihkf16hWdIIfuM6sFv5F", "x02l2Vae1akitXdZsfkSin5rPssADgyF", "voDg", "hUzVtg6QDcg3AayaGyy4Y5hfj2RvIx7z", "AYA0HHhZRav1tOhmR967ChnIf", "RG8", "bQ6q4wCv1qa3psjbWrVNO9D1ADq5zdw2"};
    }

    public Cs(CR cr) {
        this.A06 = cr;
    }

    private D2 A00() {
        int i2 = this.A07.A07.A02;
        if (this.A07.A08 == null) {
            return this.A05.A00(i2);
        }
        D3 d3 = this.A07;
        String[] strArr = A0A;
        if (strArr[1].charAt(10) != strArr[4].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[1] = "mhitCTNVD2gTcCiZ9jaRAXWaAA0g9dMw";
        strArr2[4] = "MwiogHOaq0gqmibDd9x4nD1rPGRVV4il";
        return d3.A08;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        C0768Il c0768Il = this.A07.A09;
        D2 d2A00 = A00();
        if (d2A00.A00 != 0) {
            c0768Il.A0a(d2A00.A00);
        }
        if (this.A07.A0H[this.A01]) {
            c0768Il.A0a(c0768Il.A0J() * 6);
        }
    }

    public final int A04() {
        C0768Il c0768Il;
        int length;
        if (!this.A07.A0A) {
            return 0;
        }
        D2 d2A00 = A00();
        if (d2A00.A00 != 0) {
            c0768Il = this.A07.A09;
            length = d2A00.A00;
        } else {
            byte[] bArr = d2A00.A04;
            String[] strArr = A0A;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "Pfb0S5CneQgYrjeMjOJgtR7T7eyOdr1R";
            strArr2[4] = "zLY8KEVp0MgNhcadjz3HGMWIKnjSbq4p";
            this.A08.A0c(bArr, bArr.length);
            c0768Il = this.A08;
            length = bArr.length;
        }
        boolean[] zArr = this.A07.A0H;
        int vectorSize = this.A01;
        boolean z = zArr[vectorSize];
        byte[] bArr2 = this.A09.A00;
        int vectorSize2 = z ? 128 : 0;
        bArr2[0] = (byte) (vectorSize2 | length);
        this.A09.A0Z(0);
        this.A06.ACh(this.A09, 1);
        this.A06.ACh(c0768Il, length);
        if (!z) {
            int vectorSize3 = length + 1;
            return vectorSize3;
        }
        C0768Il c0768Il2 = this.A07.A09;
        int iA0J = c0768Il2.A0J();
        c0768Il2.A0a(-2);
        int subsampleCount = iA0J * 6;
        int i2 = subsampleCount + 2;
        this.A06.ACh(c0768Il2, i2);
        int subsampleDataLength = length + 1;
        return subsampleDataLength + i2;
    }

    public final void A05() {
        this.A07.A02();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A06(long j2) {
        long jA01 = C05639t.A01(j2);
        for (int i2 = this.A01; i2 < this.A07.A00 && this.A07.A01(i2) < jA01; i2++) {
            boolean[] zArr = this.A07.A0I;
            String[] strArr = A0A;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "yYyJ6pNJ0kgjmttu9OhrBT2GfQD0mn7b";
            strArr2[4] = "spdSEizAECgh3deYwyaUKu4kY7nul1tj";
            if (zArr[i2]) {
                this.A03 = i2;
            }
        }
    }

    public final void A07(DrmInitData drmInitData) {
        D2 d2A00 = this.A05.A00(this.A07.A07.A02);
        this.A06.A5B(this.A05.A07.A0O(drmInitData.A05(d2A00 != null ? d2A00.A02 : null)));
    }

    public final void A08(D1 d1, C0622Cm c0622Cm) {
        this.A05 = (D1) IM.A01(d1);
        this.A04 = (C0622Cm) IM.A01(c0622Cm);
        this.A06.A5B(d1.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        int i2 = this.A00;
        int[] iArr = this.A07.A0E;
        int i3 = this.A02;
        if (i2 != iArr[i3]) {
            return true;
        }
        this.A02 = i3 + 1;
        String[] strArr = A0A;
        if (strArr[2].charAt(8) != strArr[7].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[6] = "24SILmm";
        strArr2[6] = "24SILmm";
        this.A00 = 0;
        return false;
    }
}
