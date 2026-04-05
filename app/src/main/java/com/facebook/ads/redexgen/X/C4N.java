package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4N {
    public static byte[] A09;
    public static String[] A0A;
    public C4M A01;
    public C4V A04;
    public final /* synthetic */ C0660Eb A08;
    public final ArrayList<C4X> A05 = new ArrayList<>();
    public ArrayList<C4X> A02 = null;
    public final ArrayList<C4X> A06 = new ArrayList<>();
    public final List<C4X> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    static {
        A06();
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, 30, 30, 43, 29, 44, -14, -53, -48, -38, -33, -47, -6, 37, DateTimeFieldType.MILLIS_OF_DAY, 30, -47, DateTimeFieldType.SECOND_OF_DAY, 32, 38, 31, 37, -21, -99, -69, -58, -58, -65, -66, 122, -51, -67, -52, -69, -54, 122, -48, -61, -65, -47, 122, -47, -61, -50, -62, 122, -69, -56, 122, -61, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -120, 122, -93, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -51, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -52, -65, -49, -51, -65, -66, 122, -64, -52, -55, -57, 122, -51, -67, -52, -69, -54, -122, 122, -50, -62, -65, -45, 122, -51, -62, -55, -49, -58, -66, 122, -52, -65, -68, -55, -49, -56, -66, 122, -64, -52, -55, -57, 122, -52, -65, -67, -45, -67, -58, -65, -52, 122, -54, -55, -55, -58, -120, -7, 30, DateTimeFieldType.MINUTE_OF_HOUR, 31, 30, 35, 25, 35, 36, DateTimeFieldType.SECOND_OF_MINUTE, 30, DateTimeFieldType.MINUTE_OF_HOUR, 41, -48, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 36, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 36, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, -34, -48, -7, 30, 38, DateTimeFieldType.HOUR_OF_DAY, 28, 25, DateTimeFieldType.SECOND_OF_DAY, -48, 25, 36, DateTimeFieldType.SECOND_OF_MINUTE, 29, -48, 32, 31, 35, 25, 36, 25, 31, 30, -48, -13, 24, DateTimeFieldType.HALFDAY_OF_DAY, 25, 24, 29, DateTimeFieldType.MINUTE_OF_HOUR, 29, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 24, DateTimeFieldType.HALFDAY_OF_DAY, 35, -54, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, -40, -54, -13, 24, 32, 11, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, -54, 32, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 33, -54, DateTimeFieldType.MINUTE_OF_DAY, 25, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 28, -54, 11, DateTimeFieldType.HOUR_OF_HALFDAY, 11, 26, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 28, -54, 26, 25, 29, DateTimeFieldType.MINUTE_OF_HOUR, 30, DateTimeFieldType.MINUTE_OF_HOUR, 25, 24, -125, -88, -80, -101, -90, -93, -98, 90, -93, -82, -97, -89, 90, -86, -87, -83, -93, -82, -93, -87, -88, 90, -63, -47, -32, -49, -34, -34, -45, -46, -114, -35, -32, -114, -49, -30, -30, -49, -47, -42, -45, -46, -114, -28, -41, -45, -27, -31, -114, -37, -49, -25, -114, -36, -35, -30, -114, -48, -45, -114, -32, -45, -47, -25, -47, -38, -45, -46, -100, -114, -41, -31, -63, -47, -32, -49, -34, -88, -35, -10, -7, -87, -19, -18, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -87, -4, -15, -8, -2, -11, -19, -87, -21, -18, -87, -5, -18, -10, -8, -1, -18, -19, -87, -17, -5, -8, -10, -87, -37, -18, -20, 2, -20, -11, -18, -5, -33, -14, -18, 0, -87, -21, -18, -17, -8, -5, -18, -87, -14, -3, -87, -20, -22, -9, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -61, -87, -102, -72, -65, -81, -76, -83, 102, -70, -75, 102, -72, -85, -87, -65, -87, -78, -85, 102, -89, -76, 102, -81, -83, -76, -75, -72, -85, -86, 102, -68, -81, -85, -67, 102, -82, -75, -78, -86, -85, -72, 116, 102, -97, -75, -69, 102, -71, -82, -75, -69, -78, -86, 102, -84, -81, -72, -71, -70, 102, -87, -89, -78, -78, 102, -71, -70, -75, -74, -113, -83, -76, -75, -72, -81, -76, -83, -100, -81, -85, -67, 110, -68, -81, -85, -67, 111, 102, -88, -85, -84, -75, -72, -85, 102, -87, -89, -78, -78, -81, -76, -83, 102, -72, -85, -87, -65, -87, -78, -85, 116, -19, -21, -6, -36, -17, -21, -3, -52, -11, -8, -42, -11, -7, -17, -6, -17, -11, -12, -57, -12, -22, -38, -1, -10, -21, -90, -8, -21, -6, -5, -8, -12, -21, -22, -90, -25, -90, -4, -17, -21, -3, -90, -6, -18, -25, -6, -90, -17, -7, -90, -17, -19, -12, -11, -8, -21, -22, -76, -90, -33, -11, -5, -90, -13, -5, -7, -6, -90, -23, -25, -14, -14, -90, -7, -6, -11, -10, -49, -19, -12, -11, -8, -17, -12, -19, -90, -24, -21, -20, -11, -8, -21, -90, -8, -21, -6, -5, -8, -12, -17, -12, -19, -90, -6, -18, -17, -7, -90, -4, -17, -21, -3, -76, -78, -80, -65, -95, -76, -80, -62, -111, -70, -67, -101, -70, -66, -76, -65, -76, -70, -71, -116, -71, -81, -97, -60, -69, -80, 107, -67, -80, -65, -64, -67, -71, -80, -81, 107, -84, 107, -63, -76, -80, -62, 107, -62, -77, -76, -82, -77, 107, -81, -70, -80, -66, 107, -71, -70, -65, 107, -77, -84, -63, -80, 107, -84, 107, -95, -76, -80, -62, -109, -70, -73, -81, -80, -67, -63, -74, -50, -60, -54, -55, 117, -66, -61, -71, -70, -51, 117, -56, -67, -60, -54, -63, -71, 117, -61, -60, -55, 117, -73, -70, 117, -126, -122, 117, -74, -69, -55, -70, -57, 117, -54, -61, -67, -66, -71, -66, -61, -68, 117, -74, 117, -53, -66, -70, -52, -113, -21, -20, -39, -20, -35, -78};
    }

    public static void A06() {
        A0A = new String[]{"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    }

    public C4N(C0660Eb c0660Eb) {
        this.A08 = c0660Eb;
    }

    private final View A00(int i2, boolean z) {
        return A0J(i2, z, Long.MAX_VALUE).A0H;
    }

    private final C4X A01(int i2) {
        int size;
        int iA0E;
        ArrayList<C4X> arrayList = this.A02;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        for (int i3 = 0; i3 < size; i3++) {
            C4X c4x = this.A02.get(i3);
            if (!c4x.A0j() && c4x.A0J() == i2) {
                c4x.A0U(32);
                return c4x;
            }
        }
        if (this.A08.A04.A0C() && (iA0E = this.A08.A00.A0E(i2)) > 0 && iA0E < this.A08.A04.A0E()) {
            long jA05 = this.A08.A04.A05(iA0E);
            for (int i4 = 0; i4 < size; i4++) {
                C4X c4x2 = this.A02.get(i4);
                if (!c4x2.A0j() && c4x2.A0L() == jA05) {
                    c4x2.A0U(32);
                    return c4x2;
                }
            }
        }
        return null;
    }

    private final C4X A02(int cacheSize, boolean z) {
        View viewA09;
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4X c4x = this.A05.get(i2);
            if (!c4x.A0j() && c4x.A0J() == cacheSize && !c4x.A0c() && (this.A08.A0s.A09 || !c4x.A0d())) {
                c4x.A0U(32);
                return c4x;
            }
        }
        if (!z && (viewA09 = this.A08.A01.A09(cacheSize)) != null) {
            C4X c4xA0G = C0660Eb.A0G(viewA09);
            this.A08.A01.A0H(viewA09);
            int iA08 = this.A08.A01.A08(viewA09);
            if (iA08 != -1) {
                this.A08.A01.A0D(iA08);
                A0X(viewA09);
                c4xA0G.A0U(8224);
                return c4xA0G;
            }
            throw new IllegalStateException(A04(721, 52, 27) + c4xA0G + this.A08.A1J());
        }
        int size2 = this.A06.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C4X c4x2 = this.A06.get(i3);
            if (!c4x2.A0c() && c4x2.A0J() == cacheSize) {
                if (!z) {
                    this.A06.remove(i3);
                }
                return c4x2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.X.C4X A03(long r8, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4N.A03(long, int, boolean):com.facebook.ads.redexgen.X.4X");
    }

    private final void A07() {
        for (int i2 = this.A06.size() - 1; i2 >= 0; i2--) {
            A08(i2);
        }
        this.A06.clear();
        if (C0660Eb.A1E) {
            this.A08.A02.A03();
        }
    }

    private final void A08(int i2) {
        A0e(this.A06.get(i2), true);
        this.A06.remove(i2);
    }

    private void A09(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                if (strArr[7].charAt(8) == strArr[6].charAt(8)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                strArr2[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A09((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A0A(C4X c4x) {
        if (this.A08.A1t()) {
            View view = c4x.A0H;
            if (C2u.A00(view) == 0) {
                C2u.A09(view, 1);
            }
            if (!C2u.A0E(view)) {
                c4x.A0U(16384);
                C2u.A0A(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0B(C4X c4x) {
        if (c4x.A0H instanceof ViewGroup) {
            A09((ViewGroup) c4x.A0H, false);
        }
    }

    private final void A0C(C4X c4x) {
        if (this.A08.A07 != null) {
            throw null;
        }
        AnonymousClass43 anonymousClass43 = this.A08.A04;
        if (this.A08.A0s != null) {
            this.A08.A0t.A0C(c4x);
        }
    }

    private final boolean A0D(C4X c4x) {
        if (c4x.A0d()) {
            return this.A08.A0s.A07();
        }
        if (c4x.A03 >= 0 && c4x.A03 < this.A08.A04.A0E()) {
            if (this.A08.A0s.A07() || this.A08.A04.A04(c4x.A03) == c4x.A0I()) {
                return !this.A08.A04.A0C() || c4x.A0L() == this.A08.A04.A05(c4x.A03);
            }
            return false;
        }
        throw new IndexOutOfBoundsException(A04(205, 60, 112) + c4x + this.A08.A1J());
    }

    private boolean A0E(C4X c4x, int i2, int i3, long j2) {
        c4x.A08 = this.A08;
        int iA0I = c4x.A0I();
        long nanoTime = this.A08.getNanoTime();
        if (j2 != Long.MAX_VALUE) {
            C4M c4m = this.A01;
            String[] strArr = A0A;
            if (strArr[5].charAt(0) == strArr[3].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "We3abAYlnqMpJzTP";
            strArr2[0] = "We3abAYlnqMpJzTP";
            if (!c4m.A0B(iA0I, nanoTime, j2)) {
                return false;
            }
        }
        this.A08.A04.A0B(c4x, i2);
        this.A01.A06(c4x.A0I(), this.A08.getNanoTime() - nanoTime);
        A0A(c4x);
        if (this.A08.A0s.A07()) {
            c4x.A04 = i3;
            return true;
        }
        return true;
    }

    public final int A0F() {
        return this.A05.size();
    }

    public final View A0G(int i2) {
        return this.A05.get(i2).A0H;
    }

    public final View A0H(int i2) {
        return A00(i2, false);
    }

    public final C4M A0I() {
        if (this.A01 == null) {
            this.A01 = new C4M();
        }
        return this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0241  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.C4X A0J(int r23, boolean r24, long r25) {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4N.A0J(int, boolean, long):com.facebook.ads.redexgen.X.4X");
    }

    public final List<C4X> A0K() {
        return this.A07;
    }

    public final void A0L() {
        int size = this.A06.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A06.get(i2).A0N();
        }
        int i3 = this.A05.size();
        for (int i4 = 0; i4 < i3; i4++) {
            this.A05.get(i4).A0N();
        }
        ArrayList<C4X> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int iCharAt = str.charAt(0);
        int scrapCount = str2.charAt(0);
        if (iCharAt != scrapCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int i5 = 0; i5 < changedScrapCount; i5++) {
                this.A02.get(i5).A0N();
            }
        }
    }

    public final void A0M() {
        this.A05.clear();
        ArrayList<C4X> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0N() {
        int size = this.A06.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4G c4g = (C4G) this.A06.get(i2).A0H.getLayoutParams();
            if (c4g != null) {
                c4g.A01 = true;
            }
        }
    }

    public final void A0O() {
        if (this.A08.A04 != null && this.A08.A04.A0C()) {
            int size = this.A06.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4X c4x = this.A06.get(i2);
                if (A0A[0].length() != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (c4x != null) {
                    c4x.A0U(6);
                    c4x.A0Z(null);
                }
            }
            return;
        }
        A07();
    }

    public final void A0P() {
        int i2;
        if (this.A08.A06 != null) {
            C4F c4f = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                i2 = c4f.A00;
            }
            throw new RuntimeException();
        }
        i2 = 0;
        this.A00 = this.A03 + i2;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            int size2 = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int iCharAt = str.charAt(0);
            int i3 = str2.charAt(0);
            if (iCharAt != i3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int i4 = this.A00;
            if (size2 > i4) {
                A08(size);
            } else {
                return;
            }
        }
    }

    public final void A0Q() {
        this.A05.clear();
        A07();
    }

    public final void A0R(int i2) {
        this.A03 = i2;
        A0P();
    }

    public final void A0S(int i2, int i3) {
        int size = this.A06.size();
        for (int i4 = 0; i4 < size; i4++) {
            C4X c4x = this.A06.get(i4);
            if (c4x != null && c4x.A03 >= i2) {
                c4x.A0X(i3, true);
            }
        }
    }

    public final void A0T(int end, int inBetweenOffset) {
        int cachedCount;
        int i2;
        int i3;
        if (end < inBetweenOffset) {
            cachedCount = end;
            i2 = inBetweenOffset;
            i3 = -1;
        } else {
            cachedCount = inBetweenOffset;
            i2 = end;
            i3 = 1;
        }
        int size = this.A06.size();
        for (int i4 = 0; i4 < size; i4++) {
            C4X c4x = this.A06.get(i4);
            if (c4x != null && c4x.A03 >= cachedCount && c4x.A03 <= i2) {
                int i5 = c4x.A03;
                String[] strArr = A0A;
                if (strArr[5].charAt(0) == strArr[3].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[2] = "kvvW4F2OCwdEIl1qwIuxYVFpmp0ugJY5";
                strArr2[1] = "kzcCp2wTfEGQm2KGuN32b5oIYABnQWPG";
                if (i5 == end) {
                    c4x.A0X(inBetweenOffset - end, false);
                } else {
                    c4x.A0X(i3, false);
                }
            }
        }
    }

    public final void A0U(int cachedCount, int i2) {
        int pos;
        int i3 = cachedCount + i2;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C4X c4x = this.A06.get(size);
            if (c4x != null && (pos = c4x.A03) >= cachedCount && pos < i3) {
                c4x.A0U(2);
                A08(size);
            }
        }
    }

    public final void A0V(int cachedCount, int i2, boolean z) {
        int i3 = cachedCount + i2;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C4X c4x = this.A06.get(size);
            if (c4x != null) {
                if (c4x.A03 >= i3) {
                    c4x.A0X(-i2, z);
                } else if (c4x.A03 >= cachedCount) {
                    c4x.A0U(8);
                    A08(size);
                }
            }
        }
    }

    public final void A0W(View view) {
        C4X c4xA0G = C0660Eb.A0G(view);
        c4xA0G.A0F = null;
        c4xA0G.A0G = false;
        c4xA0G.A0P();
        A0c(c4xA0G);
    }

    public final void A0X(View view) {
        C4X c4xA0G = C0660Eb.A0G(view);
        if (c4xA0G.A0l(12) || !c4xA0G.A0g() || this.A08.A21(c4xA0G)) {
            boolean zA0c = c4xA0G.A0c();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!zA0c || c4xA0G.A0d() || this.A08.A04.A0C()) {
                c4xA0G.A0Y(this, false);
                this.A05.add(c4xA0G);
                return;
            } else {
                throw new IllegalArgumentException(A04(37, 122, 32) + this.A08.A1J());
            }
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        c4xA0G.A0Y(this, true);
        this.A02.add(c4xA0G);
    }

    public final void A0Y(View view) {
        C4X c4xA0G = C0660Eb.A0G(view);
        if (c4xA0G.A0f()) {
            this.A08.removeDetachedView(view, false);
        }
        if (c4xA0G.A0e()) {
            c4xA0G.A0T();
        } else if (c4xA0G.A0j()) {
            c4xA0G.A0P();
        }
        A0c(c4xA0G);
    }

    public final void A0Z(AnonymousClass43 anonymousClass43, AnonymousClass43 anonymousClass432, boolean z) {
        A0Q();
        A0I().A09(anonymousClass43, anonymousClass432, z);
    }

    public final void A0a(C4M c4m) {
        C4M c4m2 = this.A01;
        if (c4m2 != null) {
            c4m2.A05();
        }
        this.A01 = c4m;
        if (c4m != null) {
            this.A01.A08(this.A08.getAdapter());
        }
    }

    public final void A0b(C4V c4v) {
        this.A04 = c4v;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0c(com.facebook.ads.redexgen.X.C4X r10) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4N.A0c(com.facebook.ads.redexgen.X.4X):void");
    }

    public final void A0d(C4X c4x) {
        if (c4x.A0G) {
            this.A02.remove(c4x);
        } else {
            this.A05.remove(c4x);
        }
        c4x.A0F = null;
        c4x.A0G = false;
        c4x.A0P();
    }

    public final void A0e(C4X c4x, boolean z) {
        C0660Eb.A0u(c4x);
        if (c4x.A0l(16384)) {
            c4x.A0V(0, 16384);
            C2u.A0A(c4x.A0H, null);
        }
        if (z) {
            A0C(c4x);
        }
        c4x.A08 = null;
        A0I().A0A(c4x);
    }
}
