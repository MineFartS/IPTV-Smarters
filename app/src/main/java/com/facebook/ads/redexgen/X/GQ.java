package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GQ implements Comparable<GQ> {
    public static byte[] A03;
    public static String[] A04;
    public final int A00;
    public final int A01;
    public final int A02;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{74};
    }

    public static void A03() {
        A04 = new String[]{"nvQKu8DODUZzpB2wBCNLkPpoRBQ2eh0", "xccBqAPL30y6NbHrQEyHQZlD73GIa83G", "RpjrEuCInQFf483LKNQrBtXeeHjkG", "qAaaebg9ykXfaLqjorYIc7xVhlpk8", "R3IamXi8r23LxADwX27vj1D35W2", "Gd7P4SO0AHL5S3OU4taFd9FZXdZ", "LURDo9IeWAnwhMbBUEplRT3enLlZH2xH", "QDBncvVI7iKMOMNKOJPlC42FDZR3i05c"};
    }

    public GQ(int i2, int i3, int i4) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull GQ gq) {
        int i2 = this.A01 - gq.A01;
        if (i2 == 0) {
            int i3 = this.A00 - gq.A00;
            if (i3 == 0) {
                return this.A02 - gq.A02;
            }
            return i3;
        }
        return i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            if (A04[0].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[7] = "nxZ14LVvmifQqYAtKoIsC3BrAoKw8mAA";
            strArr[7] = "nxZ14LVvmifQqYAtKoIsC3BrAoKw8mAA";
            if (cls == cls2) {
                GQ gq = (GQ) obj;
                return this.A01 == gq.A01 && this.A00 == gq.A00 && this.A02 == gq.A02;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = ((this.A01 * 31) + this.A00) * 31;
        int result = this.A02;
        return i2 + result;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        String strA01 = A01(0, 1, 119);
        sb.append(strA01);
        sb.append(this.A00);
        sb.append(strA01);
        sb.append(this.A02);
        return sb.toString();
    }
}
