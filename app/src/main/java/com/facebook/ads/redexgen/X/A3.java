package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A3 {
    public static String[] A0C;
    public final int A00;
    public final int A01;
    public final AJ A02;
    public final HW A03;
    public final Set<AN> A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    static {
        A00();
    }

    public static void A00() {
        A0C = new String[]{"WV1wdoH9jrQVDigahBrbrXyjnekpmiiE", "mIVo7Cnr72P7RKesjBWLJYV7ajvYF70D", "pH5vi4Kbi5SdF2Ft8jCp0yyfmrwCNJ93", "VAiIhwzGtJV", "mutijWrtbdTsRUOKFhZTpXzdiINxdKbV", "iAqM", "YM6GPYhzTMlO14HNxrpVvdDRlTI", "SmN7PcN3RYN"};
    }

    public A3(AJ aj, AJ aj2, Set<AN> set, HW hw, boolean z, int i2, int i3, boolean z2, boolean z3, boolean z4) {
        this.A02 = aj;
        this.A04 = set;
        this.A03 = hw;
        this.A08 = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A09 = z2;
        this.A06 = z3;
        this.A07 = z4 || aj2.A00 != aj.A00;
        this.A0A = (aj2.A03 == aj.A03 && aj2.A07 == aj.A07) ? false : true;
        this.A05 = aj2.A08 != aj.A08;
        this.A0B = aj2.A06 != aj.A06;
    }

    public final void A01() {
        if (this.A0A || this.A01 == 0) {
            Iterator<AN> it = this.A04.iterator();
            while (it.hasNext()) {
                it.next().AB8(this.A02.A03, this.A02.A07, this.A01);
            }
        }
        boolean z = this.A08;
        String[] strArr = A0C;
        if (strArr[1].charAt(12) == strArr[4].charAt(12)) {
            String[] strArr2 = A0C;
            strArr2[3] = "CSJCqnrxZvV";
            strArr2[7] = "Hkj5q7ot6VH";
            if (z) {
                Iterator<AN> it2 = this.A04.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    String[] strArr3 = A0C;
                    if (strArr3[0].charAt(22) == strArr3[2].charAt(22)) {
                        String[] strArr4 = A0C;
                        strArr4[1] = "CqJcwx9zuxyuReRUn3Ztwbm9rESV0hnU";
                        strArr4[4] = "BsXcrNWYLVI0RgolRvCIuekTJNQNO1r0";
                        if (!zHasNext) {
                            break;
                        } else {
                            it2.next().AAb(this.A00);
                        }
                    } else if (!zHasNext) {
                        break;
                    } else {
                        it2.next().AAb(this.A00);
                    }
                }
            }
            if (this.A0B) {
                this.A03.A0W(this.A02.A06.A02);
                Iterator<AN> it3 = this.A04.iterator();
                while (it3.hasNext()) {
                    it3.next().AB9(this.A02.A05, this.A02.A06.A01);
                }
            }
            boolean z2 = this.A05;
            String[] strArr5 = A0C;
            if (strArr5[1].charAt(12) == strArr5[4].charAt(12)) {
                String[] strArr6 = A0C;
                strArr6[6] = "ZmCtUBpIkW4VOgBlZsMYRrBehzT";
                strArr6[5] = "Qd2F";
                if (z2) {
                    Iterator<AN> it4 = this.A04.iterator();
                    while (it4.hasNext()) {
                        it4.next().AA9(this.A02.A08);
                    }
                }
                if (this.A07) {
                    Iterator<AN> it5 = this.A04.iterator();
                    while (it5.hasNext()) {
                        it5.next().AAZ(this.A06, this.A02.A00);
                    }
                }
                if (this.A09) {
                    for (AN listener : this.A04) {
                        listener.AAw();
                    }
                    return;
                }
                return;
            }
        }
        throw new RuntimeException();
    }
}
