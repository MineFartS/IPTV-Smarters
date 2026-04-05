package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z9 extends DB {
    public static byte[] A05;
    public static String[] A06;
    public int A00;
    public DD A01;
    public DF A02;
    public DH A03;
    public boolean A04;

    static {
        A05();
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{61, 41, 56, 53, 51, 115, 42, 51, 46, 62, 53, 47};
    }

    public static void A05() {
        A06 = new String[]{"Wz5kpI", "Qu4rCXWHGrZxyCLJ91nJYm9HwbbNBaAB", "jcFxTUNQ9mBSPSNjMUJY07wGvzfGS2C0", "wRecpgZSCUfboq2e81nqZjs5B", "2wu5mHiieWPMNFHGOEN0thCm6IWO9Xya", "P54DBngSoaRE6HRNMaW6H3WNUnBy8S0x", "u1kez8Hi5IXqm6uzKKQ3Ad3inAYpSzVQ", "yOq9tmgmQLY5WHe8QvjpkSndY9PHYfSY"};
    }

    public static int A00(byte b2, int i2, int i3) {
        return (b2 >> i3) & (255 >>> (8 - i2));
    }

    public static int A01(byte b2, DD dd) {
        if (!dd.A04[A00(b2, dd.A00, 1)].A03) {
            return dd.A02.A03;
        }
        return dd.A02.A04;
    }

    private final DD A02(C0768Il c0768Il) throws IOException {
        if (this.A03 == null) {
            this.A03 = DI.A04(c0768Il);
            return null;
        }
        DF df = this.A02;
        if (A06[7].charAt(1) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[3] = "EnVW7ymY5FyvrkHYKpVAYit2P";
        strArr[0] = "59lsEN";
        if (df == null) {
            this.A02 = DI.A03(c0768Il);
            return null;
        }
        byte[] bArr = new byte[c0768Il.A08()];
        System.arraycopy(c0768Il.A00, 0, bArr, 0, c0768Il.A08());
        return new DD(this.A03, this.A02, bArr, DI.A0D(c0768Il, this.A03.A05), DI.A00(r4.length - 1));
    }

    public static void A06(C0768Il c0768Il, long j2) {
        c0768Il.A0Y(c0768Il.A08() + 4);
        c0768Il.A00[c0768Il.A08() - 4] = (byte) (j2 & 255);
        c0768Il.A00[c0768Il.A08() - 3] = (byte) ((j2 >>> 8) & 255);
        c0768Il.A00[c0768Il.A08() - 2] = (byte) ((j2 >>> 16) & 255);
        c0768Il.A00[c0768Il.A08() - 1] = (byte) (255 & (j2 >>> 24));
    }

    public static boolean A07(C0768Il c0768Il) {
        try {
            return DI.A0B(1, c0768Il, true);
        } catch (AI unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final long A08(C0768Il c0768Il) {
        if ((c0768Il.A00[0] & 1) == 1) {
            return -1L;
        }
        int iA01 = A01(c0768Il.A00[0], this.A01);
        int i2 = this.A04 ? (this.A00 + iA01) / 4 : 0;
        A06(c0768Il, i2);
        this.A04 = true;
        this.A00 = iA01;
        return i2;
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final void A09(long j2) {
        super.A09(j2);
        this.A04 = j2 != 0;
        DH dh = this.A03;
        this.A00 = dh != null ? dh.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final void A0A(boolean z) {
        super.A0A(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final boolean A0B(C0768Il c0768Il, long j2, DA da) throws InterruptedException, IOException {
        if (this.A01 != null) {
            String[] strArr = A06;
            if (strArr[5].charAt(2) != strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "mO0nJ77ourwQSXFSw31DnFJId1Q3DZ07";
            strArr2[2] = "mO0nJ77ourwQSXFSw31DnFJId1Q3DZ07";
            return false;
        }
        this.A01 = A02(c0768Il);
        if (this.A01 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A01.A02.A09);
        arrayList.add(this.A01.A03);
        da.A00 = Format.A07(null, A03(0, 12, 111), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
        return true;
    }
}
