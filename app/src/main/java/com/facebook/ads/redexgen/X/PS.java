package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PS extends AbstractRunnableC0829Kx {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ AnonymousClass80 A00;

    static {
        A03();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "csAIefbP6dEHufce3C5MSz";
            strArr2[7] = "csAIefbP6dEHufce3C5MSz";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 117);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{67, 86, 81, 82, 92, DateTimeFieldType.HALFDAY_OF_DAY, 91, 82, 99, 82, 95, DateTimeFieldType.HALFDAY_OF_DAY, 96, 97, 78, 95, 97, 82, 81, DateTimeFieldType.HALFDAY_OF_DAY, 93, 89, 78, 102, 86, 91, 84};
    }

    public static void A03() {
        A02 = new String[]{"aQtlI1Us5cYHMsIV", "ql6TdDFLVKaOF", "ILd0cBh", "B0sTrIURZDTgtQOqZ9wP44Me", "PUGSIMdaF2lm0BEktB", "ig45kctSq2tkP", "eb7l2wEenDPHh06UHeaR81tCSX", "F61vU5UciYvMkd8uRJU0Fm"};
    }

    public PS(AnonymousClass80 anonymousClass80) {
        this.A00 = anonymousClass80;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        if (!this.A00.A07) {
            this.A00.A0H(A00(0, 27, 120));
        }
    }
}
