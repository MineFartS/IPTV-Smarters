package com.facebook.ads.redexgen.X;

import android.util.Pair;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0573Ae {
    public static String[] A00;
    public static final AbstractC0573Ae A01;

    public static void A00() {
        A00 = new String[]{"jU13W9NSebta1ZmimveRwiImSwvynw8G", "bR9yhpeYgYLfxjGn405sIF1CLUaNKRNv", "y6GS60dgSiOKDJGhj3wt9T6pcdF3KRzS", "kAdv6lw0fV2hZ8Ef8nLl5eDcrpXJ", "gDoO0sRHxUPo6SrSL989dqr7yWBZykVP", "xoqdGlgoaRmw7wZuwViSR5WxyeJjGGpo", "tn8QhSSQsmhaZqBgPW05rXLjjsf9pF2E", "LT5aPkpwV7"};
    }

    public abstract int A01();

    public abstract int A02();

    public abstract int A05(Object obj);

    public abstract C0571Ac A0B(int i2, C0571Ac c0571Ac, boolean z);

    public abstract C0572Ad A0E(int i2, C0572Ad c0572Ad, boolean z, long j2);

    static {
        A00();
        A01 = new Y3();
    }

    public int A03(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == A07(z)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == A07(z) ? A06(z) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    public final int A04(int nextWindowIndex, C0571Ac c0571Ac, C0572Ad c0572Ad, int i2, boolean z) {
        int i3 = A0A(nextWindowIndex, c0571Ac).A00;
        if (A0C(i3, c0572Ad).A01 == nextWindowIndex) {
            int iA03 = A03(i3, i2, z);
            if (iA03 == -1) {
                return -1;
            }
            return A0C(iA03, c0572Ad).A00;
        }
        return nextWindowIndex + 1;
    }

    public int A06(boolean z) {
        return A0F() ? -1 : 0;
    }

    public int A07(boolean z) {
        if (A0F()) {
            return -1;
        }
        return A02() - 1;
    }

    public final Pair<Integer, Long> A08(C0572Ad c0572Ad, C0571Ac c0571Ac, int i2, long j2) {
        return A09(c0572Ad, c0571Ac, i2, j2, 0L);
    }

    public final Pair<Integer, Long> A09(C0572Ad c0572Ad, C0571Ac c0571Ac, int i2, long j2, long j3) {
        IM.A00(i2, 0, A02());
        A0E(i2, c0572Ad, false, j3);
        if (j2 == -9223372036854775807L) {
            j2 = c0572Ad.A01();
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = c0572Ad.A00;
        long jA03 = c0572Ad.A03() + j2;
        long jA07 = A0A(i3, c0571Ac).A07();
        while (jA07 != -9223372036854775807L) {
            if (A00[7].length() == 24) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "t4u2YUU8OEdoMFYJ2jQWzxX4wha";
            strArr[7] = "t4u2YUU8OEdoMFYJ2jQWzxX4wha";
            if (jA03 < jA07 || i3 >= c0572Ad.A01) {
                break;
            }
            jA03 -= jA07;
            i3++;
            jA07 = A0A(i3, c0571Ac).A07();
        }
        return Pair.create(Integer.valueOf(i3), Long.valueOf(jA03));
    }

    public final C0571Ac A0A(int i2, C0571Ac c0571Ac) {
        return A0B(i2, c0571Ac, false);
    }

    public final C0572Ad A0C(int i2, C0572Ad c0572Ad) {
        return A0D(i2, c0572Ad, false);
    }

    public final C0572Ad A0D(int i2, C0572Ad c0572Ad, boolean z) {
        return A0E(i2, c0572Ad, z, 0L);
    }

    public final boolean A0F() {
        return A02() == 0;
    }

    public final boolean A0G(int i2, C0571Ac c0571Ac, C0572Ad c0572Ad, int i3, boolean z) {
        return A04(i2, c0571Ac, c0572Ad, i3, z) == -1;
    }
}
