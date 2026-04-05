package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04193s {
    public static byte[] A05;
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ C1027Sr A04;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{DateTimeFieldType.HALFDAY_OF_DAY, 1, 76, 98, 78, 78, 83, 69, 72, 79, 64, 85, 68, 28, 111, 99, 46, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 34, 58, 44, 54, 55, 5, 49, 44, 46, 6, 45, 39, 126, 91, 87, 26, 33, DateTimeFieldType.MILLIS_OF_DAY, 27, 30, DateTimeFieldType.MINUTE_OF_HOUR, 74, 116, 91, 86, 93, 90, 71, 124, 91, 83, 90, 78, 88, 101, 90, 70, 92, 65, 92, 90, 91, 8};
    }

    public C04193s(C1027Sr c1027Sr) {
        this.A04 = c1027Sr;
        A03();
    }

    public final void A02() {
        int iA0A;
        if (this.A02) {
            iA0A = this.A04.A04.A07();
        } else {
            iA0A = this.A04.A04.A0A();
        }
        this.A00 = iA0A;
    }

    public final void A03() {
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        this.A02 = false;
        this.A03 = false;
    }

    public final void A04(View view) {
        if (this.A02) {
            this.A00 = this.A04.A04.A0C(view) + this.A04.A04.A05();
        } else {
            this.A00 = this.A04.A04.A0F(view);
        }
        this.A01 = this.A04.A0q(view);
    }

    public final void A05(View view) {
        int estimatedEnd = this.A04.A04.A05();
        if (estimatedEnd >= 0) {
            A04(view);
            return;
        }
        this.A01 = this.A04.A0q(view);
        if (this.A02) {
            int iA07 = this.A04.A04.A07() - estimatedEnd;
            int childEnd = this.A04.A04.A0C(view);
            int i2 = iA07 - childEnd;
            int childEnd2 = this.A04.A04.A07();
            this.A00 = childEnd2 - i2;
            if (i2 > 0) {
                int childEnd3 = this.A04.A04.A0D(view);
                int previousEndMargin = this.A00;
                int previousEndMargin2 = previousEndMargin - childEnd3;
                int iA0A = this.A04.A04.A0A();
                int layoutStart = this.A04.A04.A0F(view);
                int startReference = Math.min(layoutStart - iA0A, 0) + iA0A;
                int previousEndMargin3 = previousEndMargin2 - startReference;
                if (previousEndMargin3 < 0) {
                    int startMargin = -previousEndMargin3;
                    this.A00 += Math.min(i2, startMargin);
                    return;
                }
                return;
            }
            return;
        }
        int iA0F = this.A04.A04.A0F(view);
        int iA0A2 = iA0F - this.A04.A04.A0A();
        this.A00 = iA0F;
        if (iA0A2 <= 0) {
            return;
        }
        int iA0D = this.A04.A04.A0D(view) + iA0F;
        int iA072 = this.A04.A04.A07() - estimatedEnd;
        int previousLayoutEnd = this.A04.A04.A0C(view);
        int estimatedEnd2 = this.A04.A04.A07();
        int previousEndMargin4 = Math.min(0, iA072 - previousLayoutEnd);
        int estimatedEnd3 = (estimatedEnd2 - previousEndMargin4) - iA0D;
        if (estimatedEnd3 >= 0) {
            return;
        }
        int endMargin = -estimatedEnd3;
        this.A00 -= Math.min(iA0A2, endMargin);
    }

    public final boolean A06(View view, C4U c4u) {
        C4G c4g = (C4G) view.getLayoutParams();
        return !c4g.A02() && c4g.A00() >= 0 && c4g.A00() < c4u.A03();
    }

    public final String toString() {
        return A00(40, 21, 73) + this.A01 + A00(0, 14, 93) + this.A00 + A00(14, 17, 63) + this.A02 + A00(31, 9, 11) + this.A03 + '}';
    }
}
