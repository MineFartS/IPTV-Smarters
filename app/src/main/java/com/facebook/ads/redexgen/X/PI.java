package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PI extends C4K {
    public static byte[] A0G;
    public static String[] A0H;

    @Nullable
    public InterfaceC0920Om A02;
    public List<C0919Ol> A03;
    public boolean A07;
    public final int A08;
    public final C1027Sr A09;
    public final C4S A0A;
    public final Q2 A0E;
    public final Set<Integer> A0F = new HashSet();
    public boolean A06 = true;
    public boolean A04 = true;
    public boolean A05 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final OQ A0D = new PL(this);
    public final OO A0B = new PK(this);
    public final OP A0C = new PJ(this);

    static {
        A09();
        A08();
    }

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0G = new byte[]{-26, -6, -7, -12, 4, -11, -15, -26, -2, 4, -22, -13, -26, -25, -15, -22, -23, 4, -11, -26, -9, -26, -14, 7, DateTimeFieldType.HOUR_OF_DAY, 29, 4, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 29, DateTimeFieldType.SECOND_OF_DAY, 7, 2, 3, DateTimeFieldType.HALFDAY_OF_DAY, 29, DateTimeFieldType.HOUR_OF_HALFDAY, -1, DateTimeFieldType.CLOCKHOUR_OF_DAY, -1, 11, -5, -12, -15, -6, -14, -22, 4, -15, -22, -5, -22, -15, 4, -11, -26, -9, -26, -14};
    }

    public static void A09() {
        A0H = new String[]{"vVts3290hN8iYOphvTtUHsw8p", "g", "QXZRYfiopoOIgyOb", "uRY3EBcOhcPzIFCW", "1yhQGC5wOot73mjsntHrCCOy6H7", "ngPHprqJPXgJBcmGEhNrmzVf2B4dA5Oh", "DCeBbFrEMIUsiq6", "addqTveDrmk"};
    }

    public PI(C2R c2r, int i2, List<C0919Ol> list, Q2 q2, @Nullable Bundle bundle) {
        this.A09 = c2r.getLayoutManager();
        this.A08 = i2;
        this.A03 = list;
        this.A0E = q2;
        this.A0A = new C1028Ss(c2r.getContext());
        c2r.A1k(this);
        A0I(bundle);
    }

    @Nullable
    private R6 A02(int i2, int i3) {
        return A03(i2, i3, true);
    }

    @Nullable
    private R6 A03(int i2, int i3, boolean isCompletelyVisible) {
        R6 r6 = null;
        while (i2 <= i3) {
            R6 r62 = (R6) this.A09.A1r(i2);
            if (r62 == null || r62.A0j()) {
                return null;
            }
            boolean zA0P = A0P(r62);
            if (r6 == null && r62.A0k() && zA0P) {
                Set<Integer> set = this.A0F;
                Integer numValueOf = Integer.valueOf(i2);
                String[] strArr = A0H;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0H;
                strArr2[0] = "B";
                strArr2[0] = "B";
                if (!set.contains(numValueOf) && (!isCompletelyVisible || A0R(r62))) {
                    r6 = r62;
                }
            }
            if (r62.A0k() && !zA0P) {
                A0H(i2, false);
            }
            i2++;
        }
        return r6;
    }

    private void A06() {
        if (!this.A05) {
            return;
        }
        int iA29 = this.A09.A29();
        int lastVisibleItem = this.A09.A2A();
        R6 firstAutoplayableVideo = A02(iA29, lastVisibleItem);
        if (firstAutoplayableVideo != null) {
            firstAutoplayableVideo.A0f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int iA28 = this.A09.A28();
        if (iA28 != -1 && iA28 < this.A03.size() - 1) {
            A0D(iA28 + 1);
        }
    }

    private void A0A(int i2) {
        R6 r6 = (R6) this.A09.A1r(i2);
        if (r6 == null || A0P(r6)) {
            return;
        }
        String[] strArr = A0H;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[0] = "Vxamqv9qm4zlsVVB8";
        strArr2[0] = "Vxamqv9qm4zlsVVB8";
        A0K(r6, false);
    }

    private void A0B(int i2) {
        R6 r6 = (R6) this.A09.A1r(i2);
        if (r6 == null) {
            return;
        }
        if (A0P(r6)) {
            A0K(r6, true);
        }
        if (A0Q(r6)) {
            this.A0D.setVolume(this.A03.get(((Integer) r6.getTag(-1593835536)).intValue()).A03().A0E().A09() ? 0.0f : 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i2) {
        R6 r6A03 = A03(i2 + 1, this.A09.A2A(), false);
        if (r6A03 != null) {
            r6A03.A0f();
            A0D(((Integer) r6A03.getTag(-1593835536)).intValue());
        }
    }

    private void A0D(int i2) {
        this.A0A.A0B(i2);
        this.A09.A1M(this.A0A);
    }

    private void A0E(int i2, int i3) {
        A0A(i2);
        A0A(i3);
    }

    private void A0F(int i2, int i3) {
        while (i2 <= i3) {
            A0B(i2);
            i2++;
        }
    }

    private void A0G(int recomputeFrom, int i2, int i3) {
        if (!A0O() || this.A02 == null) {
            return;
        }
        int iA28 = this.A09.A28();
        if (iA28 == -1) {
            iA28 = i3 < 0 ? recomputeFrom : i2;
        }
        this.A02.AC8(iA28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(int i2, boolean z) {
        if (z) {
            this.A0F.add(Integer.valueOf(i2));
        } else {
            this.A0F.remove(Integer.valueOf(i2));
        }
    }

    private void A0I(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 39), 0.0f);
        this.A05 = bundle.getBoolean(A05(0, 23, 39), true);
        this.A06 = bundle.getBoolean(A05(23, 20, 64), true);
    }

    public static void A0J(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    private void A0K(R6 r6, boolean z) {
        if (A0O()) {
            A0J(r6, z);
        }
        if (!z && r6.A0j()) {
            r6.A0e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0O() {
        return this.A08 == 1;
    }

    public static boolean A0P(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }

    private boolean A0Q(R6 r6) {
        if (!this.A06 || !r6.A0k()) {
            return false;
        }
        this.A06 = false;
        return true;
    }

    public static boolean A0R(R6 r6) {
        int width = (int) (r6.getWidth() * 1.3f);
        int furthestX = (int) (r6.getX() + r6.getWidth());
        return furthestX <= width;
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final void A0V(C0660Eb c0660Eb, int i2) {
        super.A0V(c0660Eb, i2);
        if (i2 == 0) {
            this.A07 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final void A0W(C0660Eb c0660Eb, int i2, int i3) {
        super.A0W(c0660Eb, i2, i3);
        this.A07 = false;
        if (this.A04) {
            this.A07 = true;
            A06();
            this.A04 = false;
        }
        int iA29 = this.A09.A29();
        int iA2A = this.A09.A2A();
        A0E(iA29, iA2A);
        A0F(iA29, iA2A);
        A0G(iA29, iA2A, i2);
    }

    public final OO A0X() {
        return this.A0B;
    }

    public final OP A0Y() {
        return this.A0C;
    }

    public final OQ A0Z() {
        return this.A0D;
    }

    public final void A0a() {
        this.A01 = -1;
        int iA2A = this.A09.A2A();
        for (int iA29 = this.A09.A29(); iA29 <= iA2A && iA29 >= 0; iA29++) {
            R6 r6 = (R6) this.A09.A1r(iA29);
            if (r6 != null && r6.A0j()) {
                this.A01 = iA29;
                r6.A0e();
                return;
            }
        }
    }

    public final void A0b() {
        R6 r6 = (R6) this.A09.A1r(this.A01);
        if (r6 != null && this.A01 >= 0) {
            r6.A0f();
        }
    }

    public final void A0c(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 39), this.A00);
        bundle.putBoolean(A05(0, 23, 39), this.A05);
        bundle.putBoolean(A05(23, 20, 64), this.A06);
    }

    public final void A0d(InterfaceC0920Om interfaceC0920Om) {
        this.A02 = interfaceC0920Om;
    }
}
