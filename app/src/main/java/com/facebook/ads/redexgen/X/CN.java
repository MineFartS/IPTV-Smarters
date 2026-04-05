package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CN {
    public static byte[] A02;
    public final CP A00;
    public final CP A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-54, -66, 1, DateTimeFieldType.MILLIS_OF_DAY};
    }

    public CN(CP cp) {
        this(cp, cp);
    }

    public CN(CP cp, CP cp2) {
        this.A00 = (CP) IM.A01(cp);
        this.A01 = (CP) IM.A01(cp2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CN cn = (CN) obj;
        return this.A00.equals(cn.A00) && this.A01.equals(cn.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String strA00;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(2, 1, 88));
        sb.append(this.A00);
        if (this.A00.equals(this.A01)) {
            strA00 = A00(0, 0, 98);
        } else {
            strA00 = A00(0, 2, 80) + this.A01;
        }
        sb.append(strA00);
        sb.append(A00(3, 1, 107));
        return sb.toString();
    }
}
