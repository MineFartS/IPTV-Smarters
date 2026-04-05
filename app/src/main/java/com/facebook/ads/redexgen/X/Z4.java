package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z4 extends DB {
    public static byte[] A02;
    public static String[] A03;
    public Z3 A00;
    public IY A01;

    static {
        A04();
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{6, DateTimeFieldType.MINUTE_OF_DAY, 3, DateTimeFieldType.HOUR_OF_HALFDAY, 8, 72, 1, 11, 6, 4};
    }

    public static void A04() {
        A03 = new String[]{"RjYCDLb2NANzCnedRKoQM0GQ", "QX5lqyT5r1TYXy6sq6A", "sDmzmZu2Epi", "QleORMZQxcHxPLUcnR0aaEPVJ", "tBrVRsKa63H7cOEQm0uGMqa5cwtrVWSW", "PEwzIbtLaNn1pzRcppb", "zVqUyH", "ZIYCsXe3luBjtUiXTHmKPLmA"};
    }

    private int A00(C0768Il c0768Il) {
        int i2 = (c0768Il.A00[2] & 255) >> 4;
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
            case 7:
                c0768Il.A0a(4);
                c0768Il.A0P();
                int iA0F = i2 == 6 ? c0768Il.A0F() : c0768Il.A0J();
                c0768Il.A0Z(0);
                return iA0F + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static boolean A05(C0768Il c0768Il) {
        return c0768Il.A05() >= 5 && c0768Il.A0F() == 127 && c0768Il.A0N() == 1179402563;
    }

    public static boolean A06(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final long A08(C0768Il c0768Il) {
        if (!A06(c0768Il.A00)) {
            return -1L;
        }
        int iA00 = A00(c0768Il);
        String[] strArr = A03;
        if (strArr[2].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[2] = "M0DKrSciZtY";
        strArr2[0] = "bwyyvFLni8GVBC8P6VU38e20";
        return iA00;
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final void A0A(boolean z) {
        super.A0A(z);
        if (z) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final boolean A0B(C0768Il c0768Il, long j2, DA da) throws InterruptedException, IOException {
        byte[] bArr = c0768Il.A00;
        if (this.A01 == null) {
            this.A01 = new IY(bArr, 17);
            byte[] data = Arrays.copyOfRange(bArr, 9, c0768Il.A08());
            data[4] = -128;
            List listSingletonList = Collections.singletonList(data);
            da.A00 = Format.A07(null, A02(0, 10, 95), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, listSingletonList, null, 0, null);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            this.A00 = new Z3(this);
            this.A00.A02(c0768Il);
            return true;
        }
        if (!A06(bArr)) {
            return true;
        }
        Z3 z3 = this.A00;
        if (z3 != null) {
            z3.A01(j2);
            da.A01 = this.A00;
        }
        return false;
    }
}
