package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.amazonaws.event.ProgressEvent;
import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4F {
    public static byte[] A0I;
    public static String[] A0J;
    public int A00;
    public C04043d A01;

    @Nullable
    public C4S A02;
    public C0660Eb A03;
    public boolean A08;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final InterfaceC04264a A0G = new C1034Sz(this);
    public final InterfaceC04264a A0H = new T0(this);
    public C04284c A04 = new C04284c(this.A0G);
    public C04284c A05 = new C04284c(this.A0H);
    public boolean A09 = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A0F = true;
    public boolean A0E = true;

    static {
        A09();
        A08();
    }

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        byte[] bArr = {-2, 33, 33, 34, 33, -35, DateTimeFieldType.MINUTE_OF_HOUR, 38, 34, 52, -35, 37, 30, 48, -35, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 34, 32, 54, 32, 41, 34, 47, DateTimeFieldType.MINUTE_OF_HOUR, 38, 34, 52, -35, 30, 48, -35, 45, 30, 47, 34, 43, 49, -35, 31, 50, 49, -35, 51, 38, 34, 52, -35, 38, 48, -35, 43, 44, 49, -35, 30, -35, 47, 34, 30, 41, -35, 32, 37, 38, 41, 33, -21, -35, DateTimeFieldType.MINUTE_OF_DAY, 43, 35, 38, 41, 49, 34, 47, 34, 33, -35, 38, 43, 33, 34, 53, -9, -35, -5, 8, 8, 9, DateTimeFieldType.HOUR_OF_HALFDAY, -70, 7, 9, DateTimeFieldType.CLOCKHOUR_OF_DAY, -1, -70, -5, -70, -3, 2, 3, 6, -2, -70, 0, 12, 9, 7, -70, 8, 9, 8, -57, -1, DateTimeFieldType.MINUTE_OF_DAY, 3, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 3, 8, 1, -70, 3, 8, -2, -1, DateTimeFieldType.MINUTE_OF_DAY, -44, -80, -61, -63, -41, -63, -54, -61, -48, -76, -57, -61, -43, 9, 31, 37, -48, 29, 37, 35, 36, -48, 31, 38, DateTimeFieldType.SECOND_OF_MINUTE, 34, 34, 25, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, -48, 31, 30, -4, DateTimeFieldType.HOUR_OF_DAY, 41, 31, 37, 36, -13, 24, 25, 28, DateTimeFieldType.SECOND_OF_DAY, 34, DateTimeFieldType.SECOND_OF_MINUTE, 30, -40, 2, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 41, DateTimeFieldType.MINUTE_OF_HOUR, 28, DateTimeFieldType.SECOND_OF_MINUTE, 34, -48, 34, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 41, DateTimeFieldType.MINUTE_OF_HOUR, 28, DateTimeFieldType.SECOND_OF_MINUTE, 34, -36, -48, 3, 36, DateTimeFieldType.HOUR_OF_DAY, 36, DateTimeFieldType.SECOND_OF_MINUTE, -48, 35, 36, DateTimeFieldType.HOUR_OF_DAY, 36, DateTimeFieldType.SECOND_OF_MINUTE, -39, -48, -78, -56, -50, 121, -58, -50, -52, -51, 121, -56, -49, -66, -53, -53, -62, -67, -66, 121, -52, -58, -56, -56, -51, -63, -84, -68, -53, -56, -59, -59, -83, -56, -87, -56, -52, -62, -51, -62, -56, -57, 121, -51, -56, 121, -52, -50, -55, -55, -56, -53, -51, 121, -52, -58, -56, -56, -51, -63, 121, -52, -68, -53, -56, -59, -59, -62, -57, -64};
        String[] strArr = A0J;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[6] = "kyP20liVKsmkdJ";
        strArr2[6] = "kyP20liVKsmkdJ";
        A0I = bArr;
    }

    public static void A09() {
        A0J = new String[]{"NGwI4w5wjKKwr8vIXUEBgcadgt82Mvhc", "UEWVJJvMFTFlt7hH7ERCIJOXwkHPD", "VrTEPZjwbsMyuvHOm", "2WwBzOWctlsBfaK16SO", "SN9IkStz5", "kDHla2kaeJhueA2usdy0jZceB2KGO", "Oz8ehwpCKAgd43CqPtwSSE9zN5", "pRsAYaXPUkY6EiG3qKZOmbtQ8"};
    }

    public abstract C4G A1t();

    public static int A00(int mode, int size, int i2) {
        int mode2 = View.MeasureSpec.getMode(mode);
        int size2 = View.MeasureSpec.getSize(mode);
        if (mode2 == Integer.MIN_VALUE) {
            return Math.min(size2, Math.max(size, i2));
        }
        if (mode2 != 1073741824) {
            return Math.max(size, i2);
        }
        return size2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(int r6, int r7, int r8, int r9, boolean r10) {
        /*
            int r6 = r6 - r8
            r0 = 0
            int r6 = java.lang.Math.max(r0, r6)
            r3 = 0
            r2 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -2
            r0 = -1
            if (r10 == 0) goto L2b
            if (r9 < 0) goto L5b
            r3 = r9
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4F.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L8c
        L25:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2b:
            if (r9 < 0) goto L31
            r3 = r9
            r2 = 1073741824(0x40000000, float:2.0)
            goto L9a
        L31:
            if (r9 != r0) goto L36
            r3 = r6
            r2 = r7
            goto L9a
        L36:
            if (r9 != r1) goto L9a
            r3 = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C4F.A0J
            r0 = 0
            r1 = r1[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            r0 = 112(0x70, float:1.57E-43)
            if (r1 == r0) goto L25
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4F.A0J
            java.lang.String r1 = "mbdH64CAyADsqDHKi"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "uvhJn14mL"
            r0 = 4
            r2[r0] = r1
            if (r7 == r4) goto L58
            if (r7 != r5) goto L8a
        L58:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L9a
        L5b:
            if (r9 != r0) goto L6a
            if (r7 == r4) goto L67
            if (r7 == 0) goto L64
            if (r7 == r5) goto L67
            goto L9a
        L64:
            r3 = 0
            r2 = 0
            goto L9a
        L67:
            r3 = r6
            r2 = r7
            goto L9a
        L6a:
            if (r9 != r1) goto L9a
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C4F.A0J
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 8
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4F.A0J
            java.lang.String r1 = "MUtJOOU4WeR0TtYG1JH"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "MUtJOOU4WeR0TtYG1JH"
            r0 = 7
            r2[r0] = r1
            r2 = 0
            goto L9a
        L88:
            r2 = 0
            goto L9a
        L8a:
            r2 = 0
            goto L9a
        L8c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4F.A0J
            java.lang.String r1 = "ru0BYCJI67FO4KgBABZqajada"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "ru0BYCJI67FO4KgBABZqajada"
            r0 = 6
            r2[r0] = r1
            r2 = 1073741824(0x40000000, float:2.0)
        L9a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4F.A01(int, int, int, int, boolean):int");
    }

    private final int A02(View view) {
        return ((C4G) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C4G) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C4G) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C4G) view.getLayoutParams()).A03.top;
    }

    private final int A06(C4N c4n, C4U c4u) {
        return 0;
    }

    private final void A0A(int i2) {
        A0D(i2, A0u(i2));
    }

    private final void A0B(int i2) {
        if (A0u(i2) != null) {
            this.A01.A0E(i2);
        }
    }

    private final void A0C(int i2, int i3) {
        View viewA0u = A0u(i2);
        if (viewA0u != null) {
            A0A(i2);
            A0F(viewA0u, i3);
        } else {
            throw new IllegalArgumentException(A07(85, 44, 79) + i2 + this.A03.toString());
        }
    }

    private void A0D(int i2, View view) {
        this.A01.A0D(i2);
    }

    private final void A0E(View view) {
        this.A01.A0G(view);
    }

    private final void A0F(View view, int i2) {
        A0G(view, i2, (C4G) view.getLayoutParams());
    }

    private final void A0G(View view, int i2, C4G c4g) {
        C4X c4xA0G = C0660Eb.A0G(view);
        if (c4xA0G.A0d()) {
            this.A03.A0t.A0A(c4xA0G);
        } else {
            C04314f c04314f = this.A03.A0t;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[0] = "mtQ3Ck4zhf6OC1ISSa3eadAcnNcPftbe";
            strArr2[0] = "mtQ3Ck4zhf6OC1ISSa3eadAcnNcPftbe";
            c04314f.A0B(c4xA0G);
        }
        this.A01.A0I(view, i2, c4g, c4xA0G.A0d());
    }

    private void A0H(View view, int currentIndex, boolean z) {
        C4X c4xA0G = C0660Eb.A0G(view);
        if (z || c4xA0G.A0d()) {
            this.A03.A0t.A0A(c4xA0G);
        } else {
            this.A03.A0t.A0B(c4xA0G);
        }
        C4G c4g = (C4G) view.getLayoutParams();
        if (c4xA0G.A0j() || c4xA0G.A0e()) {
            if (c4xA0G.A0e()) {
                c4xA0G.A0T();
            } else {
                c4xA0G.A0P();
            }
            this.A01.A0I(view, currentIndex, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            C0660Eb c0660Eb = this.A03;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[7] = "5ABI9jSeQ";
            strArr2[7] = "5ABI9jSeQ";
            if (parent == c0660Eb) {
                int iA08 = this.A01.A08(view);
                if (currentIndex == -1) {
                    currentIndex = this.A01.A06();
                }
                if (iA08 != -1) {
                    if (iA08 != currentIndex) {
                        this.A03.A06.A0C(iA08, currentIndex);
                    }
                } else {
                    throw new IllegalStateException(A07(0, 85, 114) + this.A03.indexOfChild(view) + this.A03.A1J());
                }
            } else {
                this.A01.A0J(view, currentIndex, false);
                c4g.A01 = true;
                C4S c4s = this.A02;
                if (c4s != null && c4s.A0G()) {
                    this.A02.A0D(view);
                }
            }
        }
        if (c4g.A02) {
            c4xA0G.A0H.invalidate();
            c4g.A02 = false;
        }
    }

    private final void A0I(View view, Rect rect) {
        C0660Eb.A0q(view, rect);
    }

    private void A0K(C4N c4n, int i2, View view) {
        C4X c4xA0G = C0660Eb.A0G(view);
        if (c4xA0G.A0i()) {
            return;
        }
        if (c4xA0G.A0c() && !c4xA0G.A0d() && !this.A03.A04.A0C()) {
            A0B(i2);
            c4n.A0c(c4xA0G);
        } else {
            A0A(i2);
            c4n.A0X(view);
            this.A03.A0t.A0D(c4xA0G);
        }
    }

    private final void A0L(C4N c4n, C4U c4u, AccessibilityEvent accessibilityEvent) {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (A0J[6].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[2] = "A1LbQwkKC8kdEmdjm";
        strArr[4] = "mpAFCzQjd";
        if (!c0660Eb.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (A0J[7].length() != 8) {
            String[] strArr2 = A0J;
            strArr2[0] = "LKoEdNrfwYhRE769hHSL4lsoF7TmWWKx";
            strArr2[0] = "LKoEdNrfwYhRE769hHSL4lsoF7TmWWKx";
            if (this.A03.A04 == null) {
                return;
            }
        } else if (this.A03.A04 == null) {
            return;
        }
        accessibilityEvent.setItemCount(this.A03.A04.A0E());
    }

    private final void A0M(C4N c4n, C4U c4u, C3J c3j) {
        if (this.A03.canScrollVertically(-1) || this.A03.canScrollHorizontally(-1)) {
            c3j.A0O(8192);
            c3j.A0S(true);
        }
        if (this.A03.canScrollVertically(1) || this.A03.canScrollHorizontally(1)) {
            c3j.A0O(ProgressEvent.PART_FAILED_EVENT_CODE);
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[2] = "WKK7ZU1nOyoZ4isR3";
            strArr2[4] = "S1xUaVTVF";
            c3j.A0S(true);
        }
        c3j.A0Q(C3G.A00(A0s(c4n, c4u), A0r(c4n, c4u), A0Q(c4n, c4u), A06(c4n, c4u)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(C4S c4s) {
        if (this.A02 == c4s) {
            this.A02 = null;
        }
    }

    private final boolean A0O() {
        C4S c4s = this.A02;
        return c4s != null && c4s.A0G();
    }

    public static boolean A0P(int specMode, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && specMode != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= specMode;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == specMode;
        }
        return true;
    }

    private final boolean A0Q(C4N c4n, C4U c4u) {
        return false;
    }

    private final boolean A0R(C4N c4n, C4U c4u, int hScroll, Bundle bundle) {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb == null) {
            return false;
        }
        int iA0Y = 0;
        int iA0g = 0;
        if (hScroll == 4096) {
            if (c0660Eb.canScrollVertically(1)) {
                iA0Y = (A0Y() - A0h()) - A0e();
            }
            if (this.A03.canScrollHorizontally(1)) {
                int iA0i = A0i();
                int iA0f = A0f();
                if (A0J[7].length() == 8) {
                    throw new RuntimeException();
                }
                String[] strArr = A0J;
                strArr[7] = "6TTpYbQ6a4";
                strArr[7] = "6TTpYbQ6a4";
                iA0g = (iA0i - iA0f) - A0g();
            }
        } else if (hScroll == 8192) {
            if (c0660Eb.canScrollVertically(-1)) {
                iA0Y = -((A0Y() - A0h()) - A0e());
            }
            if (this.A03.canScrollHorizontally(-1)) {
                iA0g = -((A0i() - A0f()) - A0g());
            }
        }
        if (iA0Y == 0 && iA0g == 0) {
            return false;
        }
        this.A03.scrollBy(iA0g, iA0Y);
        return true;
    }

    private final boolean A0S(C4N c4n, C4U c4u, View view, int i2, Bundle bundle) {
        return false;
    }

    private boolean A0T(C0660Eb c0660Eb, int parentLeft, int parentTop) {
        View focusedChild = c0660Eb.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int iA0f = A0f();
        int iA0h = A0h();
        int iA0i = A0i() - A0g();
        int iA0Y = A0Y() - A0e();
        Rect rect = this.A03.A0p;
        A0I(focusedChild, rect);
        if (rect.left - parentLeft >= iA0i || rect.right - parentLeft <= iA0f || rect.top - parentTop >= iA0Y || rect.bottom - parentTop <= iA0h) {
            return false;
        }
        if (A0J[3].length() == 28) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[0] = "D1nd79aIos3YYe4Hq7EzCaafqnQh2NEe";
        strArr[0] = "D1nd79aIos3YYe4Hq7EzCaafqnQh2NEe";
        return true;
    }

    @Deprecated
    private final boolean A0U(C0660Eb c0660Eb, View view, View view2) {
        return A0O() || c0660Eb.A1v();
    }

    private int[] A0V(C0660Eb c0660Eb, View view, Rect rect, boolean z) {
        int[] iArr = new int[2];
        int childRight = A0f();
        int childBottom = A0h();
        int offScreenTop = A0i() - A0g();
        int offScreenRight = A0Y() - A0e();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = view.getTop();
        int childLeft = rect.top;
        int i2 = top + childLeft;
        int childLeft2 = view.getScrollY();
        int i3 = i2 - childLeft2;
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + i3;
        int childLeft3 = left - childRight;
        int iMin = Math.min(0, childLeft3);
        int childLeft4 = i3 - childBottom;
        int iMin2 = Math.min(0, childLeft4);
        int childLeft5 = iWidth - offScreenTop;
        int iMax = Math.max(0, childLeft5);
        int iMax2 = Math.max(0, iHeight - offScreenRight);
        int parentBottom = A0b();
        if (parentBottom == 1) {
            if (iMax == 0) {
                iMax = Math.max(iMin, iWidth - offScreenTop);
            }
        } else {
            iMax = iMin != 0 ? iMin : Math.min(left - childRight, iMax);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i3 - childBottom, iMax2);
        }
        iArr[0] = iMax;
        iArr[1] = iMin2;
        return iArr;
    }

    public final int A0W() {
        return -1;
    }

    public final int A0X() {
        C04043d c04043d = this.A01;
        if (c04043d != null) {
            return c04043d.A06();
        }
        return 0;
    }

    public final int A0Y() {
        return this.A0A;
    }

    public final int A0Z() {
        return this.A0B;
    }

    public final int A0a() {
        C0660Eb c0660Eb = this.A03;
        AnonymousClass43 adapter = c0660Eb != null ? c0660Eb.getAdapter() : null;
        if (adapter != null) {
            return adapter.A0E();
        }
        return 0;
    }

    public final int A0b() {
        return C2u.A01(this.A03);
    }

    public final int A0c() {
        return C2u.A02(this.A03);
    }

    public final int A0d() {
        return C2u.A03(this.A03);
    }

    public final int A0e() {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb != null) {
            return c0660Eb.getPaddingBottom();
        }
        return 0;
    }

    public final int A0f() {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb != null) {
            return c0660Eb.getPaddingLeft();
        }
        return 0;
    }

    public final int A0g() {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb != null) {
            return c0660Eb.getPaddingRight();
        }
        return 0;
    }

    public final int A0h() {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb != null) {
            return c0660Eb.getPaddingTop();
        }
        return 0;
    }

    public final int A0i() {
        return this.A0C;
    }

    public final int A0j() {
        return this.A0D;
    }

    public final int A0k(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0l(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0m(View view) {
        Rect rect = ((C4G) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0n(View view) {
        Rect rect = ((C4G) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0o(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0p(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0q(View view) {
        return ((C4G) view.getLayoutParams()).A00();
    }

    public int A0r(C4N c4n, C4U c4u) {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb == null || c0660Eb.A04 == null || !A25()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    public int A0s(C4N c4n, C4U c4u) {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb == null || c0660Eb.A04 == null || !A26()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View A0t() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Eb r0 = r6.A03
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            android.view.View r3 = r0.getFocusedChild()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4F.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4F.A0J
            java.lang.String r1 = "iiKud1wfkCloFGZ1U"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "iiKud1wfkCloFGZ1U"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L56
            com.facebook.ads.redexgen.X.3d r4 = r6.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4F.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L57
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4F.A0J
            java.lang.String r1 = "7ET4ZuKdeEmot2qkcvXky1gJdqYIXUUX"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "7ET4ZuKdeEmot2qkcvXky1gJdqYIXUUX"
            r0 = 0
            r2[r0] = r1
            boolean r0 = r4.A0L(r3)
            if (r0 == 0) goto L6a
        L56:
            return r5
        L57:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4F.A0J
            java.lang.String r1 = "xPYIlKgRfeB9qWlMIQGlIgoODb"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "xPYIlKgRfeB9qWlMIQGlIgoODb"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r4.A0L(r3)
            if (r0 == 0) goto L6a
            goto L56
        L6a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4F.A0t():android.view.View");
    }

    public final View A0u(int i2) {
        C04043d c04043d = this.A01;
        if (c04043d != null) {
            return c04043d.A0A(i2);
        }
        return null;
    }

    public final View A0v(View view, int i2) {
        return null;
    }

    public C4G A0w(Context context, AttributeSet attributeSet) {
        return new C4G(context, attributeSet);
    }

    public C4G A0x(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C4G) {
            return new C4G((C4G) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4G((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4G(layoutParams);
    }

    public final void A0y() {
        C4S c4s = this.A02;
        if (c4s != null) {
            c4s.A0A();
        }
    }

    public final void A0z() {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb != null) {
            c0660Eb.requestLayout();
        }
    }

    public final void A10(int i2) {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb != null) {
            c0660Eb.A1U(i2);
        }
    }

    public final void A11(int i2) {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb != null) {
            c0660Eb.A1V(i2);
        }
    }

    public final void A12(int i2, int i3) {
        this.A0C = View.MeasureSpec.getSize(i2);
        this.A0D = View.MeasureSpec.getMode(i2);
        if (this.A0D == 0 && !C0660Eb.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i3);
        this.A0B = View.MeasureSpec.getMode(i3);
        if (this.A0B == 0 && !C0660Eb.A1B) {
            this.A0A = 0;
        }
    }

    public final void A13(int minX, int minY) {
        int maxX = A0X();
        if (maxX == 0) {
            this.A03.A1b(minX, minY);
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < maxX; i6++) {
            View viewA0u = A0u(i6);
            Rect rect = this.A03.A0p;
            A0I(viewA0u, rect);
            int maxY = rect.left;
            if (maxY < i2) {
                i2 = rect.left;
            }
            int maxY2 = rect.right;
            if (maxY2 > i4) {
                i4 = rect.right;
            }
            int maxY3 = rect.top;
            if (maxY3 < i3) {
                i3 = rect.top;
            }
            int maxY4 = rect.bottom;
            if (maxY4 > i5) {
                i5 = rect.bottom;
            }
        }
        this.A03.A0p.set(i2, i3, i4, i5);
        String[] strArr = A0J;
        String str = strArr[2];
        String str2 = strArr[4];
        int length = str.length();
        int maxY5 = str2.length();
        if (length == maxY5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[2] = "hT857kPIBtMq0qM94";
        strArr2[4] = "qfhhOTku3";
        A16(this.A03.A0p, minX, minY);
    }

    public final void A14(int i2, int i3) {
        this.A03.setMeasuredDimension(i2, i3);
    }

    public final void A15(int i2, C4N c4n) {
        View viewA0u = A0u(i2);
        A0B(i2);
        c4n.A0Y(viewA0u);
    }

    public void A16(Rect rect, int i2, int i3) {
        A14(A00(i2, rect.width() + A0f() + A0g(), A0d()), A00(i3, rect.height() + A0h() + A0e(), A0c()));
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view) {
        A1A(view, -1);
    }

    public final void A19(View view, int i2) {
        A0H(view, i2, true);
    }

    public final void A1A(View view, int i2) {
        A0H(view, i2, false);
    }

    public final void A1B(View view, int i2, int i3) {
        C4G c4g = (C4G) view.getLayoutParams();
        Rect rectA1F = this.A03.A1F(view);
        int i4 = i2 + rectA1F.left + rectA1F.right;
        int i5 = i3 + rectA1F.top + rectA1F.bottom;
        int iA01 = A01(A0i(), A0j(), A0f() + A0g() + c4g.leftMargin + c4g.rightMargin + i4, c4g.width, A25());
        int iA012 = A01(A0Y(), A0Z(), A0h() + A0e() + c4g.topMargin + c4g.bottomMargin + i5, c4g.height, A26());
        if (A1b(view, iA01, iA012, c4g)) {
            view.measure(iA01, iA012);
        }
    }

    public final void A1C(View view, int i2, int i3, int i4, int i5) {
        C4G c4g = (C4G) view.getLayoutParams();
        Rect rect = c4g.A03;
        view.layout(rect.left + i2 + c4g.leftMargin, rect.top + i3 + c4g.topMargin, (i4 - rect.right) - c4g.rightMargin, (i5 - rect.bottom) - c4g.bottomMargin);
    }

    public final void A1D(View view, C3J c3j) {
        C4X c4xA0G = C0660Eb.A0G(view);
        if (c4xA0G != null && !c4xA0G.A0d() && !this.A01.A0L(c4xA0G.A0H)) {
            A1L(this.A03.A0r, this.A03.A0s, view, c3j);
        }
    }

    public final void A1E(View view, C4N c4n) {
        A0E(view);
        c4n.A0Y(view);
    }

    public final void A1F(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C4G) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.A03 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int iFloor = (int) Math.floor(rectF.left);
            int iFloor2 = (int) Math.floor(rectF.top);
            float f2 = rectF.right;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[7] = "WbBFuKAltYM";
            strArr2[7] = "WbBFuKAltYM";
            rect.set(iFloor, iFloor2, (int) Math.ceil(f2), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1G(C3J c3j) {
        A0M(this.A03.A0r, this.A03.A0s, c3j);
    }

    public final void A1H(C4N c4n) {
        int iA0F = c4n.A0F();
        for (int i2 = iA0F - 1; i2 >= 0; i2--) {
            View viewA0G = c4n.A0G(i2);
            C4X c4xA0G = C0660Eb.A0G(viewA0G);
            if (!c4xA0G.A0i()) {
                c4xA0G.A0a(false);
                if (c4xA0G.A0f()) {
                    this.A03.removeDetachedView(viewA0G, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0E(c4xA0G);
                }
                c4xA0G.A0a(true);
                c4n.A0W(viewA0G);
            }
        }
        c4n.A0M();
        if (iA0F > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1I(C4N c4n) {
        for (int iA0X = A0X() - 1; iA0X >= 0; iA0X--) {
            View v = A0u(iA0X);
            A0K(c4n, iA0X, v);
        }
    }

    public final void A1J(C4N c4n) {
        for (int iA0X = A0X() - 1; iA0X >= 0; iA0X--) {
            if (!C0660Eb.A0G(A0u(iA0X)).A0i()) {
                A15(iA0X, c4n);
            }
        }
    }

    public void A1K(C4N c4n, C4U c4u, int i2, int i3) {
        this.A03.A1b(i2, i3);
    }

    public void A1L(C4N c4n, C4U c4u, View view, C3J c3j) {
        int iA0q = A26() ? A0q(view) : 0;
        int iA0q2 = A25() ? A0q(view) : 0;
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[3] = "h476R5jl";
        strArr2[3] = "h476R5jl";
        c3j.A0R(C3H.A00(iA0q, 1, iA0q2, 1, false, false));
    }

    public final void A1M(C4S c4s) {
        C4S c4s2 = this.A02;
        if (c4s2 != null && c4s != c4s2 && c4s2.A0G()) {
            this.A02.A0A();
        }
        this.A02 = c4s;
        this.A02.A0E(this.A03, this);
    }

    public void A1N(C0660Eb c0660Eb) {
    }

    public final void A1O(C0660Eb c0660Eb) {
        this.A07 = true;
    }

    public final void A1P(C0660Eb c0660Eb) {
        A12(View.MeasureSpec.makeMeasureSpec(c0660Eb.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c0660Eb.getHeight(), 1073741824));
    }

    public final void A1Q(C0660Eb c0660Eb) {
        if (c0660Eb == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = c0660Eb;
            this.A01 = c0660Eb.A01;
            this.A0C = c0660Eb.getWidth();
            this.A0A = c0660Eb.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public void A1R(C0660Eb c0660Eb, int i2, int i3) {
    }

    public void A1S(C0660Eb c0660Eb, int i2, int i3) {
    }

    public void A1T(C0660Eb c0660Eb, int i2, int i3, int i4) {
    }

    public void A1U(C0660Eb c0660Eb, int i2, int i3, Object obj) {
    }

    public final void A1V(C0660Eb c0660Eb, C4N c4n) {
        this.A07 = false;
        A21(c0660Eb, c4n);
    }

    public final void A1W(boolean z) {
        this.A06 = z;
    }

    public final boolean A1X() {
        int i2 = A0X();
        for (int i3 = 0; i3 < i2; i3++) {
            ViewGroup.LayoutParams layoutParams = A0u(i3).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1Y() {
        C0660Eb c0660Eb = this.A03;
        return c0660Eb != null && c0660Eb.A0B;
    }

    public final boolean A1Z() {
        return this.A0E;
    }

    public final boolean A1a(int i2, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, i2, bundle);
    }

    public final boolean A1b(View view, int i2, int i3, C4G c4g) {
        return (!view.isLayoutRequested() && this.A0F && A0P(view.getWidth(), i2, c4g.width) && A0P(view.getHeight(), i3, c4g.height)) ? false : true;
    }

    public final boolean A1c(View view, int i2, Bundle bundle) {
        return A0S(this.A03.A0r, this.A03.A0s, view, i2, bundle);
    }

    public boolean A1d(C4G c4g) {
        return c4g != null;
    }

    public final boolean A1e(C0660Eb c0660Eb, View view, Rect rect, boolean z) {
        return A1f(c0660Eb, view, rect, z, false);
    }

    public final boolean A1f(C0660Eb c0660Eb, View view, Rect rect, boolean z, boolean z2) {
        int[] iArrA0V = A0V(c0660Eb, view, rect, z);
        int i2 = iArrA0V[0];
        int i3 = iArrA0V[1];
        if ((z2 && !A0T(c0660Eb, i2, i3)) || (i2 == 0 && i3 == 0)) {
            return false;
        }
        if (z) {
            c0660Eb.scrollBy(i2, i3);
        } else {
            c0660Eb.A1f(i2, i3);
        }
        return true;
    }

    public final boolean A1g(C0660Eb c0660Eb, C4U c4u, View view, View view2) {
        return A0U(c0660Eb, view, view2);
    }

    public final boolean A1h(C0660Eb c0660Eb, ArrayList<View> arrayList, int i2, int i3) {
        return false;
    }

    public int A1i(int i2, C4N c4n, C4U c4u) {
        return 0;
    }

    public int A1j(int i2, C4N c4n, C4U c4u) {
        return 0;
    }

    public int A1k(C4U c4u) {
        return 0;
    }

    public int A1l(C4U c4u) {
        return 0;
    }

    public int A1m(C4U c4u) {
        return 0;
    }

    public int A1n(C4U c4u) {
        return 0;
    }

    public int A1o(C4U c4u) {
        return 0;
    }

    public int A1p(C4U c4u) {
        return 0;
    }

    public Parcelable A1q() {
        return null;
    }

    @Nullable
    public View A1r(int i2) {
        int iA0X = A0X();
        for (int i3 = 0; i3 < iA0X; i3++) {
            View viewA0u = A0u(i3);
            C4X c4xA0G = C0660Eb.A0G(viewA0u);
            if (c4xA0G != null && c4xA0G.A0J() == i2 && !c4xA0G.A0i() && (this.A03.A0s.A07() || !c4xA0G.A0d())) {
                return viewA0u;
            }
        }
        return null;
    }

    @Nullable
    public View A1s(View view, int i2, C4N c4n, C4U c4u) {
        return null;
    }

    public void A1u(int i2) {
    }

    public void A1v(int i2, int i3, C4U c4u, C4D c4d) {
    }

    public void A1w(int i2, C4D c4d) {
    }

    public void A1x(Parcelable parcelable) {
    }

    public void A1y(AccessibilityEvent accessibilityEvent) {
        A0L(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1z(C4N c4n, C4U c4u) {
        Log.e(A07(129, 12, 19), A07(141, 67, 101));
    }

    public void A20(C4U c4u) {
    }

    @CallSuper
    public void A21(C0660Eb c0660Eb, C4N c4n) {
    }

    public void A22(C0660Eb c0660Eb, C4U c4u, int i2) {
        Log.e(A07(129, 12, 19), A07(208, 68, 14));
    }

    public void A23(String str) {
        C0660Eb c0660Eb = this.A03;
        if (c0660Eb != null) {
            c0660Eb.A1q(str);
        }
    }

    public boolean A24() {
        return false;
    }

    public boolean A25() {
        return false;
    }

    public boolean A26() {
        return false;
    }

    public boolean A27() {
        return false;
    }
}
