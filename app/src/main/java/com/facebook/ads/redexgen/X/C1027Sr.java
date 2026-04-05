package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1027Sr extends C4F implements C4R {
    public static byte[] A0F;
    public static String[] A0G;
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public AbstractC04253z A04;
    public boolean A05;
    public int A06;
    public C04213u A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C04193s A0D;
    public final C04203t A0E;

    static {
        A0X();
        A0W();
    }

    public static String A0U(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0W() {
        A0F = new byte[]{30, 25, 1, DateTimeFieldType.MILLIS_OF_DAY, 27, 30, DateTimeFieldType.MINUTE_OF_HOUR, 87, 24, 5, 30, DateTimeFieldType.MINUTE_OF_DAY, 25, 3, DateTimeFieldType.MILLIS_OF_DAY, 3, 30, 24, 25, 77};
    }

    public static void A0X() {
        A0G = new String[]{"VKH6HNPW", "5SG7ZkmA1SrYT5HpW6e3lHPIEdQjCnoY", "GUFAcNFlkHbDslOxTlAKu2zM5da70L8W", "8EarDdUd0wjX", "ogiAdIZLqFL2ODTGKcli7xbzAuQZVFku", "k0c9canuweazyFazM74f3pFcokchiBr", "yJQv9VjGutzUoxdr6", "vBYUiSK7FkagYmvZS"};
    }

    public C1027Sr(Context context) {
        this(context, 1, false);
    }

    public C1027Sr(Context context, int i2, boolean z) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new C04193s(this);
        this.A0E = new C04203t();
        this.A06 = 2;
        A2F(i2);
        A0j(z);
        A1W(true);
    }

    private final int A05(int scrolled, C4N c4n, C4U c4u) {
        if (A0X() == 0 || scrolled == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A2E();
        int i2 = scrolled > 0 ? 1 : -1;
        int iAbs = Math.abs(scrolled);
        A0a(i2, iAbs, true, c4u);
        int iA09 = this.A07.A07 + A09(c4n, this.A07, c4u, false);
        if (iA09 < 0) {
            return 0;
        }
        int i3 = iAbs > iA09 ? i2 * iA09 : scrolled;
        this.A04.A0J(-i3);
        this.A07.A04 = i3;
        return i3;
    }

    private int A06(int fixOffset, C4N c4n, C4U c4u, boolean z) {
        int iA07 = this.A04.A07() - fixOffset;
        if (iA07 > 0) {
            int i2 = -A05(-iA07, c4n, c4u);
            int fixOffset2 = fixOffset + i2;
            if (z) {
                int iA072 = this.A04.A07();
                if (A0G[0].length() == 7) {
                    throw new RuntimeException();
                }
                String[] strArr = A0G;
                strArr[0] = "DiKLRwr5Jced9h1IWYQQBSe";
                strArr[0] = "DiKLRwr5Jced9h1IWYQQBSe";
                int i3 = iA072 - fixOffset2;
                if (i3 > 0) {
                    this.A04.A0J(i3);
                    return i3 + i2;
                }
            }
            return i2;
        }
        return 0;
    }

    private int A08(int fixOffset, C4N c4n, C4U c4u, boolean z) {
        int fixOffset2;
        int iA0A = fixOffset - this.A04.A0A();
        if (iA0A > 0) {
            int i2 = -A05(iA0A, c4n, c4u);
            int fixOffset3 = fixOffset + i2;
            if (z && (fixOffset2 = fixOffset3 - this.A04.A0A()) > 0) {
                this.A04.A0J(-fixOffset2);
                return i2 - fixOffset2;
            }
            return i2;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A09(com.facebook.ads.redexgen.X.C4N r10, com.facebook.ads.redexgen.X.C04213u r11, com.facebook.ads.redexgen.X.C4U r12, boolean r13) {
        /*
            r9 = this;
            int r7 = r11.A00
            int r0 = r11.A07
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r6) goto L16
            int r0 = r11.A00
            if (r0 >= 0) goto L13
            int r1 = r11.A07
            int r0 = r11.A00
            int r1 = r1 + r0
            r11.A07 = r1
        L13:
            r9.A0g(r10, r11)
        L16:
            int r5 = r11.A00
            int r0 = r11.A02
            int r5 = r5 + r0
            com.facebook.ads.redexgen.X.3t r4 = r9.A0E
        L1d:
            boolean r0 = r11.A09
            if (r0 != 0) goto L23
            if (r5 <= 0) goto L33
        L23:
            boolean r0 = r11.A05(r12)
            if (r0 == 0) goto L33
            r4.A00()
            r9.A2I(r10, r12, r11, r4)
            boolean r0 = r4.A01
            if (r0 == 0) goto L37
        L33:
            int r0 = r11.A00
            int r7 = r7 - r0
            return r7
        L37:
            int r2 = r11.A06
            int r1 = r4.A00
            int r0 = r11.A05
            int r1 = r1 * r0
            int r2 = r2 + r1
            r11.A06 = r2
            boolean r0 = r4.A03
            if (r0 == 0) goto L51
            com.facebook.ads.redexgen.X.3u r0 = r9.A07
            java.util.List<com.facebook.ads.redexgen.X.4X> r0 = r0.A08
            if (r0 != 0) goto L51
            boolean r0 = r12.A07()
            if (r0 != 0) goto L5b
        L51:
            int r1 = r11.A00
            int r0 = r4.A00
            int r1 = r1 - r0
            r11.A00 = r1
            int r0 = r4.A00
            int r5 = r5 - r0
        L5b:
            int r0 = r11.A07
            if (r0 == r6) goto L8c
            int r1 = r11.A07
            int r0 = r4.A00
            int r1 = r1 + r0
            r11.A07 = r1
            int r0 = r11.A00
            if (r0 >= 0) goto L89
            int r8 = r11.A07
            int r3 = r11.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1027Sr.A0G
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto Lab
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1027Sr.A0G
            java.lang.String r1 = "4Yaap7YPoeEmBfNVznjneaOXF1T3Chf"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "4Yaap7YPoeEmBfNVznjneaOXF1T3Chf"
            r0 = 5
            r2[r0] = r1
            int r8 = r8 + r3
            r11.A07 = r8
        L89:
            r9.A0g(r10, r11)
        L8c:
            if (r13 == 0) goto L1d
            boolean r3 = r4.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1027Sr.A0G
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto Lab
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1027Sr.A0G
            java.lang.String r1 = "BoRZmQ3r1kYFEVrzuprqJgVQBsgHE2ov"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "BoRZmQ3r1kYFEVrzuprqJgVQBsgHE2ov"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L1d
            goto L33
        Lab:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1027Sr.A09(com.facebook.ads.redexgen.X.4N, com.facebook.ads.redexgen.X.3u, com.facebook.ads.redexgen.X.4U, boolean):int");
    }

    private int A0A(C4U c4u) {
        if (A0X() != 0) {
            A2E();
            return C4Y.A00(c4u, this.A04, A0S(!this.A0B, true), A0R(!this.A0B, true), this, this.A0B);
        }
        if (A0G[5].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[5] = "JS1EmTokFkofHdCiZDqGUekHou375gK";
        strArr[5] = "JS1EmTokFkofHdCiZDqGUekHou375gK";
        return 0;
    }

    private int A0B(C4U c4u) {
        if (A0X() == 0) {
            return 0;
        }
        A2E();
        return C4Y.A02(c4u, this.A04, A0S(!this.A0B, true), A0R(!this.A0B, true), this, this.A0B, this.A05);
    }

    private int A0C(C4U c4u) {
        if (A0X() != 0) {
            A2E();
            return C4Y.A01(c4u, this.A04, A0S(!this.A0B, true), A0R(!this.A0B, true), this, this.A0B);
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[2] = "SnDsIEYZVkVP365fclIsQ2wSHS1GnuqA";
        strArr2[4] = "cd1sjhoNq3y2dBxKlbos6To2J3BafTHs";
        return 0;
    }

    private final int A0D(C4U c4u) {
        if (c4u.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0E() {
        return A0u(this.A05 ? 0 : A0X() - 1);
    }

    private View A0F() {
        return A0u(this.A05 ? A0X() - 1 : 0);
    }

    private final View A0G(int preferredBoundsFlag, int acceptableBoundsFlag) {
        byte b2;
        int i2;
        int i3;
        A2E();
        if (acceptableBoundsFlag > preferredBoundsFlag) {
            b2 = 1;
        } else {
            b2 = acceptableBoundsFlag < preferredBoundsFlag ? (byte) -1 : (byte) 0;
        }
        if (b2 == 0) {
            View viewA0u = A0u(preferredBoundsFlag);
            String[] strArr = A0G;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[5] = "tEP4S10y6AtQbDA9ff3H424KLTnX0k7";
            strArr2[5] = "tEP4S10y6AtQbDA9ff3H424KLTnX0k7";
            return viewA0u;
        }
        if (this.A04.A0F(A0u(preferredBoundsFlag)) < this.A04.A0A()) {
            i2 = 16644;
            i3 = 16388;
        } else {
            i2 = 4161;
            i3 = 4097;
        }
        if (this.A00 == 0) {
            return super.A04.A00(preferredBoundsFlag, acceptableBoundsFlag, i2, i3);
        }
        return super.A05.A00(preferredBoundsFlag, acceptableBoundsFlag, i2, i3);
    }

    private final View A0H(int acceptableBoundsFlag, int i2, boolean z, boolean z2) {
        int i3;
        A2E();
        int i4 = 0;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (z2) {
            i4 = 320;
        }
        int i5 = this.A00;
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "NnwW0AnvRBQDKBAe7Vp9NN4SqY6y39Zg";
        strArr[4] = "snWQRfIRwdJNOSPMdDWVpUmegwlUrdsl";
        if (i5 == 0) {
            return super.A04.A00(acceptableBoundsFlag, i2, i3, i4);
        }
        return super.A05.A00(acceptableBoundsFlag, i2, i3, i4);
    }

    private View A0I(C4N c4n, C4U c4u) {
        return A0G(0, A0X());
    }

    private View A0K(C4N c4n, C4U c4u) {
        return A2D(c4n, c4u, 0, A0X(), c4u.A03());
    }

    private View A0L(C4N c4n, C4U c4u) {
        return A0G(A0X() - 1, -1);
    }

    private View A0M(C4N c4n, C4U c4u) {
        return A2D(c4n, c4u, A0X() - 1, -1, c4u.A03());
    }

    private View A0N(C4N c4n, C4U c4u) {
        return this.A05 ? A0I(c4n, c4u) : A0L(c4n, c4u);
    }

    private View A0O(C4N c4n, C4U c4u) {
        return this.A05 ? A0L(c4n, c4u) : A0I(c4n, c4u);
    }

    private View A0P(C4N c4n, C4U c4u) {
        return this.A05 ? A0K(c4n, c4u) : A0M(c4n, c4u);
    }

    private View A0Q(C4N c4n, C4U c4u) {
        return this.A05 ? A0M(c4n, c4u) : A0K(c4n, c4u);
    }

    private View A0R(boolean z, boolean z2) {
        if (this.A05) {
            return A0H(0, A0X(), z, z2);
        }
        return A0H(A0X() - 1, -1, z, z2);
    }

    private View A0S(boolean z, boolean z2) {
        if (this.A05) {
            return A0H(A0X() - 1, -1, z, z2);
        }
        return A0H(0, A0X(), z, z2);
    }

    private final C04213u A0T() {
        return new C04213u();
    }

    private void A0V() {
        if (this.A00 == 1 || !A2K()) {
            this.A05 = this.A0A;
            return;
        }
        boolean z = !this.A0A;
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "rvopS3hSB7itRsuyG";
        strArr2[7] = "9RTUShXs4ZXrU4n03";
        this.A05 = z;
    }

    private void A0Y(int i2, int i3) {
        this.A07.A00 = this.A04.A07() - i3;
        this.A07.A03 = this.A05 ? -1 : 1;
        C04213u c04213u = this.A07;
        c04213u.A01 = i2;
        c04213u.A05 = 1;
        c04213u.A06 = i3;
        c04213u.A07 = Integer.MIN_VALUE;
    }

    private void A0Z(int i2, int i3) {
        this.A07.A00 = i3 - this.A04.A0A();
        C04213u c04213u = this.A07;
        c04213u.A01 = i2;
        c04213u.A03 = this.A05 ? 1 : -1;
        C04213u c04213u2 = this.A07;
        c04213u2.A05 = -1;
        c04213u2.A06 = i3;
        c04213u2.A07 = Integer.MIN_VALUE;
    }

    private void A0a(int i2, int i3, boolean z, C4U c4u) {
        int iA0A;
        this.A07.A09 = A0k();
        this.A07.A02 = A0D(c4u);
        C04213u c04213u = this.A07;
        c04213u.A05 = i2;
        if (i2 == 1) {
            c04213u.A02 += this.A04.A08();
            View viewA0E = A0E();
            C04213u c04213u2 = this.A07;
            if (!this.A05) {
                i = 1;
            }
            c04213u2.A03 = i;
            this.A07.A01 = A0q(viewA0E) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(viewA0E);
            iA0A = this.A04.A0C(viewA0E) - this.A04.A07();
        } else {
            View viewA0F = A0F();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0q(viewA0F) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(viewA0F);
            iA0A = (-this.A04.A0F(viewA0F)) + this.A04.A0A();
        }
        C04213u c04213u3 = this.A07;
        c04213u3.A00 = i3;
        if (z) {
            c04213u3.A00 -= iA0A;
        }
        this.A07.A07 = iA0A;
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[1] = "rmKnvh8FAT7bzRdUkYGsCRYa1fX1DRoz";
        strArr[1] = "rmKnvh8FAT7bzRdUkYGsCRYa1fX1DRoz";
    }

    private void A0b(C04193s c04193s) {
        A0Y(c04193s.A01, c04193s.A00);
    }

    private void A0c(C04193s c04193s) {
        A0Z(c04193s.A01, c04193s.A00);
    }

    private void A0d(C4N c4n, int i2) {
        int iA0X = A0X();
        if (i2 < 0) {
            return;
        }
        int iA06 = this.A04.A06() - i2;
        if (this.A05) {
            for (int i3 = 0; i3 < iA0X; i3++) {
                View viewA0u = A0u(i3);
                if (this.A04.A0F(viewA0u) < iA06 || this.A04.A0H(viewA0u) < iA06) {
                    A0f(c4n, 0, i3);
                    return;
                }
            }
            return;
        }
        for (int i4 = iA0X - 1; i4 >= 0; i4--) {
            View viewA0u2 = A0u(i4);
            if (this.A04.A0F(viewA0u2) < iA06 || this.A04.A0H(viewA0u2) < iA06) {
                A0f(c4n, iA0X - 1, i4);
                return;
            }
        }
    }

    private void A0e(C4N c4n, int i2) {
        if (i2 < 0) {
            return;
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[0] = "66";
        strArr2[0] = "66";
        int iA0X = A0X();
        if (this.A05) {
            for (int i3 = iA0X - 1; i3 >= 0; i3--) {
                View viewA0u = A0u(i3);
                if (this.A04.A0C(viewA0u) <= i2) {
                    AbstractC04253z abstractC04253z = this.A04;
                    String[] strArr3 = A0G;
                    if (strArr3[6].length() != strArr3[7].length()) {
                        if (abstractC04253z.A0G(viewA0u) <= i2) {
                        }
                    } else {
                        String[] strArr4 = A0G;
                        strArr4[3] = "uDZbJl3GZvnd0";
                        strArr4[3] = "uDZbJl3GZvnd0";
                        if (abstractC04253z.A0G(viewA0u) <= i2) {
                        }
                    }
                }
                A0f(c4n, iA0X - 1, i3);
                return;
            }
            return;
        }
        for (int i4 = 0; i4 < iA0X; i4++) {
            View viewA0u2 = A0u(i4);
            int iA0C = this.A04.A0C(viewA0u2);
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0G;
            strArr5[1] = "ET87P0AumYMcjI6vylu4qFXoEmTHeXod";
            strArr5[1] = "ET87P0AumYMcjI6vylu4qFXoEmTHeXod";
            if (iA0C > i2 || this.A04.A0G(viewA0u2) > i2) {
                A0f(c4n, 0, i4);
                return;
            }
        }
    }

    private void A0f(C4N c4n, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 > i2) {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                A15(i4, c4n);
            }
            return;
        }
        while (i2 > i3) {
            A15(i2, c4n);
            i2--;
        }
    }

    private void A0g(C4N c4n, C04213u c04213u) {
        if (!c04213u.A0B || c04213u.A09) {
            return;
        }
        int i2 = c04213u.A05;
        String[] strArr = A0G;
        if (strArr[6].length() == strArr[7].length()) {
            String[] strArr2 = A0G;
            strArr2[2] = "M7iaeQoExhHh03f7x1XNzmreS2Lq1zJK";
            strArr2[4] = "3weclwG7n9RXAySrMV3Jn51LrKgutG4n";
            if (i2 == -1) {
                int i3 = c04213u.A07;
                if (A0G[1].charAt(30) == 'o') {
                    String[] strArr3 = A0G;
                    strArr3[3] = "CiNTyTfZO3PW6tP";
                    strArr3[3] = "CiNTyTfZO3PW6tP";
                    A0d(c4n, i3);
                    return;
                }
            } else {
                A0e(c4n, c04213u.A07);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0h(C4N c4n, C4U c4u, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!c4u.A08() || A0X() == 0 || c4u.A07() || !A27()) {
            return;
        }
        int direction = 0;
        int i2 = 0;
        List<C4X> listA0K = c4n.A0K();
        int size = listA0K.size();
        int iA0q = A0q(A0u(0));
        for (int i3 = 0; i3 < size; i3++) {
            C4X c4x = listA0K.get(i3);
            if (!c4x.A0d()) {
                int position = c4x.A0J();
                if (((position < iA0q) != this.A05 ? (byte) -1 : (byte) 1) == -1) {
                    int position2 = this.A04.A0D(c4x.A0H);
                    direction += position2;
                } else {
                    int position3 = this.A04.A0D(c4x.A0H);
                    i2 += position3;
                }
            }
        }
        this.A07.A08 = listA0K;
        if (direction > 0) {
            View anchor = A0F();
            A0Z(A0q(anchor), scrapExtraEnd);
            C04213u c04213u = this.A07;
            c04213u.A02 = direction;
            c04213u.A00 = 0;
            c04213u.A04();
            A09(c4n, this.A07, c4u, false);
        }
        if (i2 > 0) {
            View anchor2 = A0E();
            A0Y(A0q(anchor2), scrapExtraEnd2);
            C04213u c04213u2 = this.A07;
            c04213u2.A02 = i2;
            c04213u2.A00 = 0;
            c04213u2.A04();
            A09(c4n, this.A07, c4u, false);
        }
        this.A07.A08 = null;
    }

    private void A0i(C4N c4n, C4U c4u, C04193s c04193s) {
        if (A0m(c4u, c04193s)) {
            return;
        }
        boolean zA0l = A0l(c4n, c4u, c04193s);
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[3] = "XDJ2jDWhUW9a7iN";
        strArr2[3] = "XDJ2jDWhUW9a7iN";
        if (zA0l) {
            return;
        }
        c04193s.A02();
        c04193s.A01 = this.A0C ? c4u.A03() - 1 : 0;
    }

    private final void A0j(boolean z) {
        A23(null);
        if (z == this.A0A) {
            return;
        }
        this.A0A = z;
        A0z();
    }

    private final boolean A0k() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0l(C4N c4n, C4U c4u, C04193s c04193s) {
        View viewA0Q;
        int iA0A;
        if (A0X() == 0) {
            return false;
        }
        View viewA0t = A0t();
        if (viewA0t != null && c04193s.A06(viewA0t, c4u)) {
            c04193s.A05(viewA0t);
            return true;
        }
        if (this.A08 != this.A0C) {
            return false;
        }
        if (c04193s.A02) {
            viewA0Q = A0P(c4n, c4u);
        } else {
            viewA0Q = A0Q(c4n, c4u);
        }
        if (viewA0Q == null) {
            return false;
        }
        c04193s.A04(viewA0Q);
        if (!c4u.A07() && A27()) {
            if (this.A04.A0F(viewA0Q) >= this.A04.A07() || this.A04.A0C(viewA0Q) < this.A04.A0A()) {
                if (c04193s.A02) {
                    iA0A = this.A04.A07();
                } else {
                    iA0A = this.A04.A0A();
                }
                c04193s.A00 = iA0A;
            }
        }
        return true;
    }

    private boolean A0m(C4U c4u, C04193s c04193s) {
        int i2;
        int iA0F;
        if (c4u.A07() || (i2 = this.A01) == -1) {
            return false;
        }
        if (i2 < 0 || i2 >= c4u.A03()) {
            this.A01 = -1;
            this.A02 = Integer.MIN_VALUE;
            return false;
        }
        c04193s.A01 = this.A01;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState == null || !linearLayoutManager$SavedState.A01()) {
            if (this.A02 == Integer.MIN_VALUE) {
                View viewA1r = A1r(this.A01);
                if (viewA1r != null) {
                    int iA0D = this.A04.A0D(viewA1r);
                    int childSize = this.A04.A0B();
                    if (iA0D > childSize) {
                        c04193s.A02();
                        return true;
                    }
                    int iA0F2 = this.A04.A0F(viewA1r);
                    int childSize2 = this.A04.A0A();
                    if (iA0F2 - childSize2 < 0) {
                        int childSize3 = this.A04.A0A();
                        c04193s.A00 = childSize3;
                        c04193s.A02 = false;
                        return true;
                    }
                    int iA07 = this.A04.A07();
                    int childSize4 = this.A04.A0C(viewA1r);
                    if (iA07 - childSize4 < 0) {
                        int childSize5 = this.A04.A07();
                        c04193s.A00 = childSize5;
                        c04193s.A02 = true;
                        return true;
                    }
                    if (c04193s.A02) {
                        int iA0C = this.A04.A0C(viewA1r);
                        AbstractC04253z abstractC04253z = this.A04;
                        String[] strArr = A0G;
                        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0G;
                        strArr2[3] = "ZbIhQvVoqDIGDPkO0OlvW9zioDplzu";
                        strArr2[3] = "ZbIhQvVoqDIGDPkO0OlvW9zioDplzu";
                        iA0F = iA0C + abstractC04253z.A05();
                    } else {
                        iA0F = this.A04.A0F(viewA1r);
                    }
                    c04193s.A00 = iA0F;
                } else {
                    int childSize6 = A0X();
                    if (childSize6 > 0) {
                        int iA0q = A0q(A0u(0));
                        int pos = this.A01;
                        boolean z = pos < iA0q;
                        boolean z2 = this.A05;
                        if (A0G[1].charAt(30) != 'o') {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A0G;
                        strArr3[2] = "1tNDA9T9nSDYektAgKE77gOe81bMFJSk";
                        strArr3[4] = "TZYqXNdWGZVKxzfIQyf7YZEk7yb7IRTm";
                        c04193s.A02 = z == z2;
                    }
                    c04193s.A02();
                }
                return true;
            }
            boolean z3 = this.A05;
            c04193s.A02 = z3;
            if (z3) {
                c04193s.A00 = this.A04.A07() - this.A02;
            } else {
                c04193s.A00 = this.A04.A0A() + this.A02;
            }
            return true;
        }
        c04193s.A02 = this.A03.A02;
        if (c04193s.A02) {
            c04193s.A00 = this.A04.A07() - this.A03.A00;
        } else {
            c04193s.A00 = this.A04.A0A() + this.A03.A00;
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public int A1i(int i2, C4N c4n, C4U c4u) {
        if (this.A00 == 1) {
            return 0;
        }
        return A05(i2, c4n, c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public int A1j(int i2, C4N c4n, C4U c4u) {
        if (this.A00 == 0) {
            return 0;
        }
        int iA05 = A05(i2, c4n, c4u);
        String[] strArr = A0G;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[3] = "CDnF1shpb";
        strArr2[3] = "CDnF1shpb";
        return iA05;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1k(C4U c4u) {
        return A0A(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1l(C4U c4u) {
        return A0B(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1m(C4U c4u) {
        return A0C(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1n(C4U c4u) {
        return A0A(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1o(C4U c4u) {
        return A0B(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1p(C4U c4u) {
        return A0C(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final Parcelable A1q() {
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            return new LinearLayoutManager$SavedState(linearLayoutManager$SavedState);
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = new LinearLayoutManager$SavedState();
        if (A0X() > 0) {
            A2E();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState2.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View viewA0E = A0E();
                linearLayoutManager$SavedState2.A00 = this.A04.A07() - this.A04.A0C(viewA0E);
                linearLayoutManager$SavedState2.A01 = A0q(viewA0E);
            } else {
                View viewA0F = A0F();
                linearLayoutManager$SavedState2.A01 = A0q(viewA0F);
                linearLayoutManager$SavedState2.A00 = this.A04.A0F(viewA0F) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState2.A00();
        }
        return linearLayoutManager$SavedState2;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    @Nullable
    public final View A1r(int firstChild) {
        int viewPosition = A0X();
        if (viewPosition == 0) {
            return null;
        }
        int iA0q = firstChild - A0q(A0u(0));
        if (iA0q >= 0 && iA0q < viewPosition) {
            View viewA0u = A0u(iA0q);
            if (A0q(viewA0u) == firstChild) {
                return viewA0u;
            }
        }
        View child = super.A1r(firstChild);
        return child;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public View A1s(View view, int i2, C4N c4n, C4U c4u) {
        int iA2C;
        View viewA0N;
        View viewA0E;
        A0V();
        if (A0X() == 0 || (iA2C = A2C(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        A2E();
        A2E();
        A0a(iA2C, (int) (this.A04.A0B() * 0.33333334f), false, c4u);
        C04213u c04213u = this.A07;
        c04213u.A07 = Integer.MIN_VALUE;
        c04213u.A0B = false;
        A09(c4n, c04213u, c4u, true);
        if (iA2C == -1) {
            viewA0N = A0O(c4n, c4u);
        } else {
            viewA0N = A0N(c4n, c4u);
        }
        if (iA2C == -1) {
            viewA0E = A0F();
        } else {
            viewA0E = A0E();
        }
        boolean zHasFocusable = viewA0E.hasFocusable();
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "JGtMOr7ZHjmwUVfbInfaZmEhr0nxGN38";
        strArr[4] = "jCrgpf8bwQbyd1C9u6FfAt5OnK6gBhSa";
        if (zHasFocusable) {
            if (viewA0N == null) {
                return null;
            }
            return viewA0E;
        }
        return viewA0N;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public C4G A1t() {
        return new C4G(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public void A1u(int i2) {
        this.A01 = i2;
        this.A02 = Integer.MIN_VALUE;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0z();
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final void A1v(int i2, int i3, C4U c4u, C4D c4d) {
        if (this.A00 != 0) {
            i2 = i3;
        }
        if (A0X() == 0 || i2 == 0) {
            return;
        }
        A2E();
        A0a(i2 > 0 ? 1 : -1, Math.abs(i2), true, c4u);
        A2J(c4u, this.A07, c4d);
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0019 */
    @Override // com.facebook.ads.redexgen.X.C4F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1w(int r8, com.facebook.ads.redexgen.X.C4D r9) {
        /*
            r7 = this;
            com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState r0 = r7.A03
            r6 = 0
            r5 = -1
            if (r0 == 0) goto L28
            boolean r0 = r0.A01()
            if (r0 == 0) goto L28
            com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState r0 = r7.A03
            boolean r4 = r0.A02
            com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState r0 = r7.A03
            int r2 = r0.A01
        L14:
            if (r4 == 0) goto L26
        L16:
            r1 = 0
        L17:
            int r0 = r7.A06
            if (r1 >= r0) goto L5f
            if (r2 < 0) goto L5f
            if (r2 >= r8) goto L5f
            r9.A3J(r2, r6)
            int r2 = r2 + r5
            int r1 = r1 + 1
            goto L17
        L26:
            r5 = 1
            goto L16
        L28:
            r7.A0V()
            boolean r4 = r7.A05
            int r3 = r7.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1027Sr.A0G
            r0 = 6
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L47
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L47:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1027Sr.A0G
            java.lang.String r1 = "j12HxmlCdcFNOCf90EDMVBFIs8rsuaoM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "j12HxmlCdcFNOCf90EDMVBFIs8rsuaoM"
            r0 = 1
            r2[r0] = r1
            if (r3 != r5) goto L5c
            if (r4 == 0) goto L5a
            int r2 = r8 + (-1)
            goto L14
        L5a:
            r2 = 0
            goto L14
        L5c:
            int r2 = r7.A01
            goto L14
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1027Sr.A1w(int, com.facebook.ads.redexgen.X.4D):void");
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final void A1x(Parcelable parcelable) {
        if (parcelable instanceof LinearLayoutManager$SavedState) {
            this.A03 = (LinearLayoutManager$SavedState) parcelable;
            A0z();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final void A1y(AccessibilityEvent accessibilityEvent) {
        super.A1y(accessibilityEvent);
        if (A0X() > 0) {
            accessibilityEvent.setFromIndex(A29());
            int iA2A = A2A();
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[3] = "9E5bhv9RVKulu";
            strArr[3] = "9E5bhv9RVKulu";
            accessibilityEvent.setToIndex(iA2A);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0261  */
    @Override // com.facebook.ads.redexgen.X.C4F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1z(com.facebook.ads.redexgen.X.C4N r10, com.facebook.ads.redexgen.X.C4U r11) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1027Sr.A1z(com.facebook.ads.redexgen.X.4N, com.facebook.ads.redexgen.X.4U):void");
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public void A20(C4U c4u) {
        super.A20(c4u);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final void A21(C0660Eb c0660Eb, C4N c4n) {
        super.A21(c0660Eb, c4n);
        if (this.A09) {
            A1J(c4n);
            c4n.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public void A22(C0660Eb c0660Eb, C4U c4u, int i2) {
        C1028Ss c1028Ss = new C1028Ss(c0660Eb.getContext());
        c1028Ss.A0B(i2);
        A1M(c1028Ss);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final void A23(String str) {
        if (this.A03 == null) {
            super.A23(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final boolean A24() {
        if (A0Z() != 1073741824 && A0j() != 1073741824) {
            boolean zA1X = A1X();
            if (A0G[0].length() == 7) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[0] = "ZYU5Lu8KJdo1W8";
            strArr[0] = "ZYU5Lu8KJdo1W8";
            if (zA1X) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final boolean A25() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final boolean A26() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public boolean A27() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A28() {
        View viewA0H = A0H(0, A0X(), true, false);
        if (viewA0H == null) {
            return -1;
        }
        return A0q(viewA0H);
    }

    public final int A29() {
        View viewA0H = A0H(0, A0X(), false, true);
        if (viewA0H == null) {
            return -1;
        }
        return A0q(viewA0H);
    }

    public final int A2A() {
        View viewA0H = A0H(A0X() - 1, -1, false, true);
        if (viewA0H == null) {
            return -1;
        }
        return A0q(viewA0H);
    }

    public final int A2B() {
        return this.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A2C(int r8) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1027Sr.A2C(int):int");
    }

    public View A2D(C4N c4n, C4U c4u, int boundsEnd, int i2, int i3) {
        A2E();
        View view = null;
        View view2 = null;
        int iA0A = this.A04.A0A();
        int iA07 = this.A04.A07();
        int i4 = i2 > boundsEnd ? 1 : -1;
        while (boundsEnd != i2) {
            View viewA0u = A0u(boundsEnd);
            int iA0q = A0q(viewA0u);
            if (iA0q >= 0 && iA0q < i3) {
                if (((C4G) viewA0u.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = viewA0u;
                    }
                } else if (this.A04.A0F(viewA0u) >= iA07 || this.A04.A0C(viewA0u) < iA0A) {
                    if (view2 == null) {
                        view2 = viewA0u;
                    }
                } else {
                    return viewA0u;
                }
            }
            boundsEnd += i4;
        }
        return view2 != null ? view2 : view;
    }

    public final void A2E() {
        if (this.A07 == null) {
            this.A07 = A0T();
        }
        if (this.A04 == null) {
            this.A04 = AbstractC04253z.A02(this, this.A00);
        }
    }

    public final void A2F(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(A0U(0, 20, 1) + i2);
        }
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[1] = "wMuOUB68W5cmyVCUMue198JFnL9Wkeot";
        strArr[1] = "wMuOUB68W5cmyVCUMue198JFnL9Wkeot";
        A23(null);
        if (i2 == this.A00) {
            return;
        }
        this.A00 = i2;
        this.A04 = null;
        A0z();
    }

    public final void A2G(int i2, int i3) {
        this.A01 = i2;
        this.A02 = i3;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0z();
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "tDl3kZGUKMTs";
        strArr[3] = "tDl3kZGUKMTs";
    }

    public void A2H(C4N c4n, C4U c4u, C04193s c04193s, int i2) {
    }

    public void A2I(C4N c4n, C4U c4u, C04213u c04213u, C04203t c04203t) {
        int iA0h;
        int iA0E;
        int iA0f;
        int iA0E2;
        View viewA03 = c04213u.A03(c4n);
        if (viewA03 == null) {
            c04203t.A01 = true;
            return;
        }
        C4G c4g = (C4G) viewA03.getLayoutParams();
        if (c04213u.A08 == null) {
            if (this.A05 == (c04213u.A05 == -1)) {
                A18(viewA03);
            } else {
                A1A(viewA03, 0);
            }
        } else {
            boolean z = this.A05;
            int top = c04213u.A05;
            if (z == (top == -1)) {
                A17(viewA03);
            } else {
                A19(viewA03, 0);
            }
        }
        A1B(viewA03, 0, 0);
        c04203t.A00 = this.A04.A0D(viewA03);
        if (this.A00 == 1) {
            if (A2K()) {
                iA0E2 = A0i() - A0g();
                iA0f = iA0E2 - this.A04.A0E(viewA03);
            } else {
                iA0f = A0f();
                iA0E2 = this.A04.A0E(viewA03) + iA0f;
            }
            if (c04213u.A05 == -1) {
                iA0E = c04213u.A06;
                iA0h = c04213u.A06 - c04203t.A00;
            } else {
                iA0h = c04213u.A06;
                int i2 = c04213u.A06;
                int top2 = c04203t.A00;
                iA0E = i2 + top2;
            }
        } else {
            iA0h = A0h();
            iA0E = this.A04.A0E(viewA03) + iA0h;
            int top3 = c04213u.A05;
            if (top3 == -1) {
                iA0E2 = c04213u.A06;
                int i3 = c04213u.A06;
                int top4 = c04203t.A00;
                iA0f = i3 - top4;
            } else {
                iA0f = c04213u.A06;
                int i4 = c04213u.A06;
                int top5 = c04203t.A00;
                iA0E2 = i4 + top5;
            }
        }
        A1C(viewA03, iA0f, iA0h, iA0E2, iA0E);
        if (c4g.A02() || c4g.A01()) {
            c04203t.A03 = true;
        }
        c04203t.A02 = viewA03.hasFocusable();
    }

    public void A2J(C4U c4u, C04213u c04213u, C4D c4d) {
        int i2 = c04213u.A01;
        if (i2 >= 0 && i2 < c4u.A03()) {
            c4d.A3J(i2, Math.max(0, c04213u.A07));
        }
    }

    public final boolean A2K() {
        return A0b() == 1;
    }

    @Override // com.facebook.ads.redexgen.X.C4R
    public final PointF A45(int firstChildPos) {
        if (A0X() == 0) {
            return null;
        }
        int i2 = (firstChildPos < A0q(A0u(0))) != this.A05 ? -1 : 1;
        int i3 = this.A00;
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[5] = "5EjIyJt0kzQOvAP28HqeuGPqaebz9kN";
        strArr[5] = "5EjIyJt0kzQOvAP28HqeuGPqaebz9kN";
        if (i3 == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }
}
