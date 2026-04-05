package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4M {
    public static String[] A02;
    public SparseArray<C4L> A00 = new SparseArray<>();
    public int A01 = 0;

    static {
        A02();
    }

    public static void A02() {
        A02 = new String[]{"hO0SXlIn7n5HXEBLx", "jESNVpuYnHPlnh4DZ", "CDLwN7DwmtArlNd144q1QIOvLDqs4yZF", "JntNhgZ58kYFXbwiJ6hzeVdvPNGn00kF", "yTsWpbzmHeCmcQEDkb0QkT5J3TV6CkfD", "Lh9pded4Clz2", "gnDNjs3GBImfOnnM5uEQWokXBd1c", "C4tnEN178k9sL9bIxtVolUttiI5dEdE5"};
    }

    private final long A00(long j2, long j3) {
        if (j2 == 0) {
            return j3;
        }
        long j4 = j2 / 4;
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "GTVZcsVJP0WVKaHbsMtSVk9gu6Gyk4Ss";
        strArr2[4] = "GTVZcsVJP0WVKaHbsMtSVk9gu6Gyk4Ss";
        return (j4 * 3) + (j3 / 4);
    }

    private C4L A01(int i2) {
        C4L c4l = this.A00.get(i2);
        if (c4l == null) {
            C4L c4l2 = new C4L();
            this.A00.put(i2, c4l2);
            return c4l2;
        }
        return c4l;
    }

    private final void A03() {
        for (int i2 = 0; i2 < this.A00.size(); i2++) {
            this.A00.valueAt(i2).A03.clear();
        }
    }

    public final C4X A04(int i2) {
        C4L c4l = this.A00.get(i2);
        if (c4l != null && !c4l.A03.isEmpty()) {
            ArrayList<C4X> arrayList = c4l.A03;
            if (A02[4].charAt(1) != 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "6zOEmNGiTAHU1v9SGa3";
            strArr[6] = "6zOEmNGiTAHU1v9SGa3";
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A05() {
        this.A01--;
    }

    public final void A06(int i2, long j2) {
        C4L c4lA01 = A01(i2);
        c4lA01.A01 = A00(c4lA01.A01, j2);
    }

    public final void A07(int i2, long j2) {
        C4L c4lA01 = A01(i2);
        c4lA01.A02 = A00(c4lA01.A02, j2);
    }

    public final void A08(AnonymousClass43 anonymousClass43) {
        this.A01++;
    }

    public final void A09(AnonymousClass43 anonymousClass43, AnonymousClass43 anonymousClass432, boolean z) {
        if (anonymousClass43 != null) {
            A05();
        }
        if (!z && this.A01 == 0) {
            A03();
        }
        if (anonymousClass432 != null) {
            A08(anonymousClass432);
        }
    }

    public final void A0A(C4X c4x) {
        int iA0I = c4x.A0I();
        ArrayList<C4X> arrayList = A01(iA0I).A03;
        if (this.A00.get(iA0I).A00 <= arrayList.size()) {
            return;
        }
        c4x.A0R();
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "TnDeXYrDbfmyODeGX";
        strArr2[5] = "ziritv0xfrad";
        arrayList.add(c4x);
    }

    public final boolean A0B(int i2, long j2, long j3) {
        long j4 = A01(i2).A01;
        return j4 == 0 || j2 + j4 < j3;
    }

    public final boolean A0C(int i2, long j2, long j3) {
        long j4 = A01(i2).A02;
        return j4 == 0 || j2 + j4 < j3;
    }
}
