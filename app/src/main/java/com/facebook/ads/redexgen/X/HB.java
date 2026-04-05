package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class HB {
    public static byte[] A0A;
    public static String[] A0B;
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public Layout.Alignment A08;
    public SpannableStringBuilder A09;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0B;
            if (strArr[2].charAt(3) == strArr[4].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[7] = "dE6A8";
            strArr2[7] = "dE6A8";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 82);
            i5++;
        }
    }

    public static void A02() {
        A0A = new byte[]{-32, -7, -3, -16, -18, -6, -14, -7, -12, 5, -16, -17, -85, -20, -9, -12, -14, -7, -8, -16, -7, -1, -59, -85, 11, 25, DateTimeFieldType.MILLIS_OF_DAY, 42, 40, 40, -9, 41, 25, -10, 41, 29, 32, 24, 25, 38};
    }

    public static void A03() {
        A0B = new String[]{"vgym8n4g3kPlzh8iIq", "NAoY0yaTEmpVmZayfLtjrx2aw", "ggOUAOLNPEguk0iXJXBNHZqvAgJ9VjZi", "bSLHaz9YBJes6EAuclteHitymP7rzXdw", "k7dBXXWTHLUA1jWUqySLqUHdC1ziQrAg", "4aJsL2pYaVARsHZq", "XLH0fnwqDlKe4VeoBMSsI84BU", "G62i1"};
    }

    public HB() {
        A0F();
    }

    private HB A00() {
        if (this.A08 == null) {
            this.A05 = Integer.MIN_VALUE;
        } else {
            int i2 = HA.A00[this.A08.ordinal()];
            if (i2 == 1) {
                this.A05 = 0;
            } else {
                if (A0B[5].length() != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0B;
                strArr[1] = "CkNmrc0J4D9ywVj";
                strArr[1] = "CkNmrc0J4D9ywVj";
                if (i2 == 2) {
                    this.A05 = 1;
                } else if (i2 != 3) {
                    Log.w(A01(24, 16, 98), A01(0, 24, 57) + this.A08);
                    this.A05 = 0;
                } else {
                    this.A05 = 2;
                }
            }
        }
        return this;
    }

    public final HB A04(float f2) {
        this.A00 = f2;
        return this;
    }

    public final HB A05(float f2) {
        this.A01 = f2;
        return this;
    }

    public final HB A06(float f2) {
        this.A02 = f2;
        return this;
    }

    public final HB A07(int i2) {
        this.A03 = i2;
        return this;
    }

    public final HB A08(int i2) {
        this.A04 = i2;
        return this;
    }

    public final HB A09(int i2) {
        this.A05 = i2;
        return this;
    }

    public final HB A0A(long j2) {
        this.A06 = j2;
        return this;
    }

    public final HB A0B(long j2) {
        this.A07 = j2;
        return this;
    }

    public final HB A0C(Layout.Alignment alignment) {
        this.A08 = alignment;
        return this;
    }

    public final HB A0D(SpannableStringBuilder spannableStringBuilder) {
        this.A09 = spannableStringBuilder;
        return this;
    }

    public final C1277b2 A0E() {
        if (this.A01 != Float.MIN_VALUE) {
            int i2 = this.A05;
            if (A0B[5].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[1] = "AZWqxPkc";
            strArr[1] = "AZWqxPkc";
            if (i2 == Integer.MIN_VALUE) {
                A00();
            }
        }
        return new C1277b2(this.A07, this.A06, this.A09, this.A08, this.A00, this.A04, this.A03, this.A01, this.A05, this.A02);
    }

    public final void A0F() {
        this.A07 = 0L;
        this.A06 = 0L;
        this.A09 = null;
        this.A08 = null;
        this.A00 = Float.MIN_VALUE;
        this.A04 = Integer.MIN_VALUE;
        this.A03 = Integer.MIN_VALUE;
        this.A01 = Float.MIN_VALUE;
        this.A05 = Integer.MIN_VALUE;
        this.A02 = Float.MIN_VALUE;
    }
}
