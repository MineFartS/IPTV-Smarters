package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1162Xx implements N3 {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ N1 A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -31, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
        strArr2[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    public static void A02() {
        A02 = new String[]{"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    }

    public C1162Xx(N1 n1) {
        this.A00 = n1;
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final void A42() {
        if (this.A00.A06 != null) {
            this.A00.A06.A3s(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final void A43() {
        this.A00.A0L();
        if (this.A00.A07 != null) {
            this.A00.A07.AAn(true);
        }
        this.A00.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final void A7I() {
        if (this.A00.A03 == null) {
            A43();
            return;
        }
        N1.A01(this.A00);
        if (this.A00.A03.A02() == null) {
            N1 n1 = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            strArr[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            n1.A0B();
            return;
        }
        N1 n12 = this.A00;
        n12.A0D(n12.A03.A02());
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final void A7s() {
        if (!TextUtils.isEmpty(AnonymousClass23.A0C(this.A00.A04.A00()))) {
            LH.A09(new LH(), this.A00.A04, Uri.parse(AnonymousClass23.A0C(this.A00.A04.A00())), this.A00.A08);
        }
        this.A00.A02.A05();
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final void A7t() {
        this.A00.A0L();
        if (this.A00.A07 != null) {
            this.A00.A07.AAn(true);
        }
        if (!TextUtils.isEmpty(AnonymousClass23.A06(this.A00.A04.A00()))) {
            LH.A09(new LH(), this.A00.A04, Uri.parse(AnonymousClass23.A06(this.A00.A04.A00())), this.A00.A08);
        }
        this.A00.A02.A07();
        this.A00.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final void AAE(AnonymousClass24 anonymousClass24) {
        N1.A00(this.A00);
        this.A00.A01 = anonymousClass24;
        this.A00.A0D(this.A00.A01 == AnonymousClass24.A03 ? AnonymousClass23.A03(this.A00.A04.A00()) : AnonymousClass23.A04(this.A00.A04.A00()));
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final void AAM(AnonymousClass26 anonymousClass26) {
        N1.A00(this.A00);
        this.A00.A02.A08(anonymousClass26.A01());
        if (!anonymousClass26.A05().isEmpty()) {
            this.A00.A0D(anonymousClass26);
        } else {
            this.A00.A0C(anonymousClass26);
        }
    }
}
