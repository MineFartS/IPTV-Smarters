package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04043d {
    public static byte[] A03;
    public static String[] A04;
    public final InterfaceC04033c A01;
    public final C04023b A00 = new C04023b();
    public final List<View> A02 = new ArrayList();

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A04[5].charAt(2) != 'B') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[1] = "YzFnrN17WwgSKMGcQI3u7PJ5Pdf81qGi";
        strArr[1] = "YzFnrN17WwgSKMGcQI3u7PJ5Pdf81qGi";
        A03 = new byte[]{-81, -93, -21, -20, -25, -25, -24, -15, -93, -17, -20, -10, -9, -67, -23, -25, -18, -34, -29, -36, -107, -23, -28, -107, -22, -29, -35, -34, -39, -38, -107, -42, -107, -21, -34, -38, -20, -107, -23, -35, -42, -23, -107, -20, -42, -24, -107, -29, -28, -23, -107, -35, -34, -39, -39, -38, -29, -35, -48, -52, -34, -121, -48, -38, -121, -43, -42, -37, -121, -56, -121, -54, -49, -48, -45, -53, -109, -121, -54, -56, -43, -43, -42, -37, -121, -49, -48, -53, -52, -121};
    }

    public static void A03() {
        A04 = new String[]{"QoGKHhEqLDc7cPbroRD", "LQzzwNJ4o6QHlfYkxXGOUA5ejYw8qpDj", "6ipC3ASGLl4rMOedI", "OPBJh0aCf", "l4bQelOwEyQeTpTSi", "DWBJmVB67PV4ItRyT2e9caL16z1NK91I", "0G1mJvoVA", "nRnK55wdJbrp31Rh0MWe0TNMbF4aeg8Y"};
    }

    public C04043d(InterfaceC04033c interfaceC04033c) {
        this.A01 = interfaceC04033c;
    }

    private int A00(int limit) {
        if (limit < 0) {
            return -1;
        }
        int iA5g = this.A01.A5g();
        int i2 = limit;
        while (i2 < iA5g) {
            int removedBefore = limit - (i2 - this.A00.A04(i2));
            if (removedBefore == 0) {
                while (this.A00.A09(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += removedBefore;
        }
        return -1;
    }

    private void A04(View view) {
        this.A02.add(view);
        this.A01.A9Z(view);
    }

    private boolean A05(View view) {
        if (this.A02.remove(view)) {
            this.A01.A9z(view);
            return true;
        }
        return false;
    }

    public final int A06() {
        return this.A01.A5g() - this.A02.size();
    }

    public final int A07() {
        return this.A01.A5g();
    }

    public final int A08(View view) {
        int iA7U = this.A01.A7U(view);
        if (iA7U == -1 || this.A00.A09(iA7U)) {
            return -1;
        }
        return iA7U - this.A00.A04(iA7U);
    }

    public final View A09(int i2) {
        int size = this.A02.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.A02.get(i3);
            C4X c4xA5j = this.A01.A5j(view);
            if (c4xA5j.A0J() == i2 && !c4xA5j.A0c() && !c4xA5j.A0d()) {
                return view;
            }
        }
        return null;
    }

    public final View A0A(int i2) {
        return this.A01.A5f(A00(i2));
    }

    public final View A0B(int i2) {
        return this.A01.A5f(i2);
    }

    public final void A0C() {
        this.A00.A05();
        for (int size = this.A02.size() - 1; size >= 0; size--) {
            this.A01.A9z(this.A02.get(size));
            this.A02.remove(size);
        }
        this.A01.ACO();
    }

    public final void A0D(int i2) {
        int iA00 = A00(i2);
        this.A00.A0A(iA00);
        this.A01.A4k(iA00);
    }

    public final void A0E(int i2) {
        int iA00 = A00(i2);
        View viewA5f = this.A01.A5f(iA00);
        if (viewA5f == null) {
            return;
        }
        if (this.A00.A0A(iA00)) {
            A05(viewA5f);
        }
        this.A01.ACS(iA00);
        if (A04[4].length() == 16) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[7] = "KJlsfCUfVwwQNNRDjM0AzdkkAy1m1QjD";
        strArr[7] = "KJlsfCUfVwwQNNRDjM0AzdkkAy1m1QjD";
    }

    public final void A0F(View view) {
        int iA7U = this.A01.A7U(view);
        if (iA7U >= 0) {
            this.A00.A07(iA7U);
            A04(view);
        } else {
            throw new IllegalArgumentException(A01(57, 33, 25) + view);
        }
    }

    public final void A0G(View view) {
        int iA7U = this.A01.A7U(view);
        if (iA7U < 0) {
            return;
        }
        if (this.A00.A0A(iA7U)) {
            A05(view);
        }
        this.A01.ACS(iA7U);
    }

    public final void A0H(View view) {
        int iA7U = this.A01.A7U(view);
        if (iA7U >= 0) {
            if (this.A00.A09(iA7U)) {
                this.A00.A06(iA7U);
                A05(view);
                return;
            } else {
                throw new RuntimeException(A01(14, 43, 39) + view);
            }
        }
        throw new IllegalArgumentException(A01(57, 33, 25) + view);
    }

    public final void A0I(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iA00;
        if (i2 < 0) {
            iA00 = this.A01.A5g();
        } else {
            iA00 = A00(i2);
        }
        C04023b c04023b = this.A00;
        if (A04[5].charAt(2) != 'B') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[1] = "KHr0McsaN13zWmBdzhmfm62h5mt8zSB0";
        strArr[1] = "KHr0McsaN13zWmBdzhmfm62h5mt8zSB0";
        c04023b.A08(iA00, z);
        if (z) {
            A04(view);
        }
        this.A01.A3U(view, iA00, layoutParams);
    }

    public final void A0J(View view, int i2, boolean z) {
        int iA00;
        if (i2 < 0) {
            iA00 = this.A01.A5g();
        } else {
            iA00 = A00(i2);
        }
        this.A00.A08(iA00, z);
        if (z) {
            A04(view);
        }
        this.A01.addView(view, iA00);
    }

    public final void A0K(View view, boolean z) {
        A0J(view, -1, z);
    }

    public final boolean A0L(View view) {
        return this.A02.contains(view);
    }

    public final boolean A0M(View view) {
        int iA7U = this.A01.A7U(view);
        if (iA7U == -1) {
            A05(view);
            if (A04[5].charAt(2) != 'B') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "HipCYWSrBpzIS13Odtj";
            strArr[0] = "HipCYWSrBpzIS13Odtj";
            return true;
        }
        if (this.A00.A09(iA7U)) {
            this.A00.A0A(iA7U);
            A05(view);
            this.A01.ACS(iA7U);
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.A00.toString() + A01(0, 14, 53) + this.A02.size();
    }
}
