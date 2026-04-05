package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0663Ee extends T8 {
    public static String[] A02;

    @Nullable
    public AbstractC04253z A00;

    @Nullable
    public AbstractC04253z A01;

    static {
        A05();
    }

    public static void A05() {
        A02 = new String[]{"C44Ajl3kvJruV1G0pt7gVRuztfjSJyFq", "J5x5lFquh7whloqA7FngbvBzLsCb", "NWBvU5bW0Pue", "3", "BTAVkHunqM91yRRN2KcoYuZCergWfboL", "2NY5ANPTvwBPWrnTgdotgLNYCmp8", "bg7eF9CjngMlwdFplTojabi", "lLeEucKPPYu6Z0yxrpg2o1MG4v3W39r2"};
    }

    private int A00(@NonNull C4F c4f, @NonNull View view, AbstractC04253z abstractC04253z) {
        int iA06;
        int iA0F = abstractC04253z.A0F(view) + (abstractC04253z.A0D(view) / 2);
        if (c4f.A1Y()) {
            iA06 = abstractC04253z.A0A() + (abstractC04253z.A0B() / 2);
        } else {
            iA06 = abstractC04253z.A06() / 2;
        }
        return iA0F - iA06;
    }

    @Nullable
    private View A01(C4F c4f, AbstractC04253z abstractC04253z) {
        int iA06;
        int absClosest = c4f.A0X();
        if (absClosest == 0) {
            return null;
        }
        View child = null;
        if (c4f.A1Y()) {
            int iA0A = abstractC04253z.A0A();
            int iA0B = abstractC04253z.A0B();
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            strArr[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            iA06 = iA0A + (iA0B / 2);
        } else {
            iA06 = abstractC04253z.A06() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < absClosest; i3++) {
            View viewA0u = c4f.A0u(i3);
            int iA0F = abstractC04253z.A0F(viewA0u);
            int i4 = abstractC04253z.A0D(viewA0u);
            int childCenter = Math.abs((iA0F + (i4 / 2)) - iA06);
            if (childCenter < i2) {
                i2 = childCenter;
                child = viewA0u;
            }
        }
        return child;
    }

    @Nullable
    private View A02(C4F c4f, AbstractC04253z abstractC04253z) {
        int i2 = c4f.A0X();
        if (i2 == 0) {
            return null;
        }
        View view = null;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < i2; i4++) {
            View viewA0u = c4f.A0u(i4);
            int iA0F = abstractC04253z.A0F(viewA0u);
            if (iA0F < i3) {
                i3 = iA0F;
                int childStart = A02[3].length();
                if (childStart != 1) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[3] = "0";
                strArr[3] = "0";
                view = viewA0u;
            }
        }
        return view;
    }

    @NonNull
    private AbstractC04253z A03(@NonNull C4F c4f) {
        AbstractC04253z abstractC04253z = this.A00;
        if (abstractC04253z == null || abstractC04253z.A02 != c4f) {
            this.A00 = AbstractC04253z.A00(c4f);
        }
        return this.A00;
    }

    @NonNull
    private AbstractC04253z A04(@NonNull C4F c4f) {
        AbstractC04253z abstractC04253z = this.A01;
        if (abstractC04253z == null || abstractC04253z.A02 != c4f) {
            this.A01 = AbstractC04253z.A01(c4f);
        }
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    @Override // com.facebook.ads.redexgen.X.T8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0E(com.facebook.ads.redexgen.X.C4F r10, int r11, int r12) {
        /*
            r9 = this;
            int r8 = r10.A0a()
            r4 = -1
            if (r8 != 0) goto L8
            return r4
        L8:
            r1 = 0
            boolean r0 = r10.A26()
            if (r0 == 0) goto L1a
            com.facebook.ads.redexgen.X.3z r0 = r9.A04(r10)
            android.view.View r1 = r9.A02(r10, r0)
        L17:
            if (r1 != 0) goto L47
            return r4
        L1a:
            boolean r0 = r10.A25()
            if (r0 == 0) goto L17
            com.facebook.ads.redexgen.X.3z r3 = r9.A03(r10)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0663Ee.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L36
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L36:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0663Ee.A02
            java.lang.String r1 = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo"
            r0 = 4
            r2[r0] = r1
            android.view.View r1 = r9.A02(r10, r3)
            goto L17
        L47:
            int r3 = r10.A0q(r1)
            if (r3 != r4) goto L4e
            return r4
        L4e:
            boolean r0 = r10.A25()
            r7 = 0
            if (r0 == 0) goto Lab
            if (r11 <= 0) goto La9
            r6 = 1
        L58:
            r5 = 0
            boolean r0 = r10 instanceof com.facebook.ads.redexgen.X.C4R
            if (r0 == 0) goto L8e
            com.facebook.ads.redexgen.X.4R r10 = (com.facebook.ads.redexgen.X.C4R) r10
            int r0 = r8 + (-1)
            android.graphics.PointF r4 = r10.A45(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0663Ee.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L9a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0663Ee.A02
            java.lang.String r1 = "yuw4mNpzW34AqVSRehlxNeo"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "wkUUhZpWZ02e"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L8e
        L7f:
            float r0 = r4.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L8c
            float r0 = r4.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8d
        L8c:
            r7 = 1
        L8d:
            r5 = r7
        L8e:
            if (r5 == 0) goto L95
            if (r6 == 0) goto L94
            int r3 = r3 + (-1)
        L94:
            return r3
        L95:
            if (r6 == 0) goto L94
            int r3 = r3 + 1
            goto L94
        L9a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0663Ee.A02
            java.lang.String r1 = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU"
            r0 = 0
            r2[r0] = r1
            if (r4 == 0) goto L8e
            goto L7f
        La9:
            r6 = 0
            goto L58
        Lab:
            if (r12 <= 0) goto Laf
            r6 = 1
            goto L58
        Laf:
            r6 = 0
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0663Ee.A0E(com.facebook.ads.redexgen.X.4F, int, int):int");
    }

    @Override // com.facebook.ads.redexgen.X.T8
    @Nullable
    public final View A0F(C4F c4f) {
        if (c4f.A26()) {
            return A01(c4f, A04(c4f));
        }
        if (c4f.A25()) {
            return A01(c4f, A03(c4f));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.T8
    public final C1028Ss A0G(C4F c4f) {
        if (!(c4f instanceof C4R)) {
            return null;
        }
        return new C0664Ef(this, super.A00.getContext());
    }

    @Override // com.facebook.ads.redexgen.X.T8
    @Nullable
    public final int[] A0J(@NonNull C4F c4f, @NonNull View view) {
        int[] iArr = new int[2];
        if (c4f.A25()) {
            iArr[0] = A00(c4f, view, A03(c4f));
        } else {
            iArr[0] = 0;
        }
        boolean zA26 = c4f.A26();
        String[] strArr = A02;
        if (strArr[1].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        strArr2[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        if (zA26) {
            iArr[1] = A00(c4f, view, A04(c4f));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
