package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FB {
    public static String[] A04;
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    static {
        A00();
    }

    public static void A00() {
        A04 = new String[]{"QAVxR1pm4g3OMy63NQvftsN2xqVHZpJs", "AzW64QlkVBQHB9f6Xzc9fy5MjwuFwf", "EYWLKn1ZI2FgvzG2Y3WEpQG0rKYdGsmO", "8MKSyYZIic", "8HCh", "B2G9RsjiNaG6Fd9EDgK8ZSLtpMYMPZWp", "0LWAgqDnvmn5Zl5Tjazxu4DQCyM2IyoB", "wKpHaIMIJd"};
    }

    public FB(int i2) {
        this(i2, -1L);
    }

    public FB(int i2, int i3, int i4, long j2) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A03 = j2;
    }

    public FB(int i2, long j2) {
        this(i2, -1, -1, j2);
    }

    public final FB A01(int i2) {
        return this.A02 == i2 ? this : new FB(i2, this.A00, this.A01, this.A03);
    }

    public final boolean A02() {
        return this.A00 != -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FB fb = (FB) obj;
        if (this.A02 == fb.A02 && this.A00 == fb.A00) {
            int i2 = this.A01;
            int i3 = fb.A01;
            if (A04[6].charAt(12) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "oyJ32Yzo0dJhSwoxIDwlIRMSMQ1R6SLA";
            strArr[6] = "oyJ32Yzo0dJhSwoxIDwlIRMSMQ1R6SLA";
            if (i2 == i3 && this.A03 == fb.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = ((17 * 31) + this.A02) * 31;
        int result = this.A00;
        int i3 = (((i2 + result) * 31) + this.A01) * 31;
        int result2 = (int) this.A03;
        return i3 + result2;
    }
}
