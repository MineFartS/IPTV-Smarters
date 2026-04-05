package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Sw implements InterfaceC04033c {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ C0660Eb A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-39, -9, 2, 2, -5, -6, -74, -9, 10, 10, -9, -7, -2, -74, 5, 4, -74, -9, -74, -7, -2, -1, 2, -6, -74, DateTimeFieldType.HALFDAY_OF_DAY, -2, -1, -7, -2, -74, -1, 9, -74, 4, 5, 10, -74, -6, -5, 10, -9, -7, -2, -5, -6, -48, -74, -75, -77, -66, -66, -73, -74, 114, -74, -73, -58, -77, -75, -70, 114, -63, -64, 114, -77, -64, 114, -77, -66, -60, -73, -77, -74, -53, 114, -74, -73, -58, -77, -75, -70, -73, -74, 114, -75, -70, -69, -66, -74, 114};
    }

    public static void A02() {
        A02 = new String[]{"m0v39bkLL0n2S0xNgN89hz2dGOcTpwho", "Je1TSnUfgjz87J45b10M9zAxXIUpZahJ", "5NPz60Ycb2xlrnlJbjQuqitLPDDjbzHA", "GN4TkK3T6zCNiBjoupvxTPY", "uEyRXI1LEgEguUOEBvXDLSZ", "uM6injuc1j2LJ4wHPsuMaMxVec9yzmkB", "WB5Y9xOLXhFok7BjZ8qu5ygjzkxXvdjS", "QTx8NC78KyDJtqbkFzNokRxLjqTFyIiz"};
    }

    public Sw(C0660Eb c0660Eb) {
        this.A00 = c0660Eb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04033c
    public final void A3U(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        C4X c4xA0G = C0660Eb.A0G(view);
        if (c4xA0G != null) {
            if (c4xA0G.A0f() || c4xA0G.A0i()) {
                c4xA0G.A0Q();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 113) + c4xA0G + this.A00.A1J());
            }
        }
        this.A00.attachViewToParent(view, i2, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04033c
    public final void A4k(int i2) {
        C4X c4xA0G;
        View viewA5f = A5f(i2);
        if (viewA5f != null && (c4xA0G = C0660Eb.A0G(viewA5f)) != null) {
            if (!c4xA0G.A0f() || c4xA0G.A0i()) {
                c4xA0G.A0U(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 45) + c4xA0G + this.A00.A1J());
            }
        }
        this.A00.detachViewFromParent(i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04033c
    public final View A5f(int i2) {
        return this.A00.getChildAt(i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04033c
    public final int A5g() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04033c
    public final C4X A5j(View view) {
        return C0660Eb.A0G(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04033c
    public final int A7U(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04033c
    public final void A9Z(View view) {
        C4X c4xA0G = C0660Eb.A0G(view);
        if (c4xA0G != null) {
            c4xA0G.A08(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04033c
    public final void A9z(View view) {
        C4X c4xA0G = C0660Eb.A0G(view);
        if (c4xA0G != null) {
            c4xA0G.A09(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04033c
    public final void ACO() {
        int i2 = A5g();
        for (int i3 = 0; i3 < i2; i3++) {
            View viewA5f = A5f(i3);
            this.A00.A1j(viewA5f);
            viewA5f.clearAnimation();
        }
        this.A00.removeAllViews();
        String[] strArr = A02;
        if (strArr[3].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[2] = "YVtNrV2twtC96zFGqk3M5li58NeZhLji";
        strArr2[2] = "YVtNrV2twtC96zFGqk3M5li58NeZhLji";
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04033c
    public final void ACS(int i2) {
        View childAt = this.A00.getChildAt(i2);
        if (childAt != null) {
            this.A00.A1j(childAt);
            childAt.clearAnimation();
        }
        C0660Eb c0660Eb = this.A00;
        if (A02[2].charAt(25) == 'R') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "BurwQQkBxJzMJJK1acCycPqXpvrCcXzS";
        strArr[2] = "BurwQQkBxJzMJJK1acCycPqXpvrCcXzS";
        c0660Eb.removeViewAt(i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04033c
    public final void addView(View view, int i2) {
        this.A00.addView(view, i2);
        this.A00.A1i(view);
    }
}
