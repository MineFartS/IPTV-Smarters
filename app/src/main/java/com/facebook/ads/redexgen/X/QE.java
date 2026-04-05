package com.facebook.ads.redexgen.X;

import com.amazonaws.services.s3.internal.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QE {
    public static byte[] A07;
    public Q5 A05;
    public int A04 = DateTimeConstants.MILLIS_PER_MINUTE;
    public int A03 = 100;
    public int A00 = Constants.MAXIMUM_UPLOAD_PARTS;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{49, 29, 4, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_DAY, 9, DateTimeFieldType.HOUR_OF_DAY, 92, DateTimeFieldType.HOUR_OF_HALFDAY, 25, 8, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 25, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 92, DateTimeFieldType.HOUR_OF_DAY, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 92, 30, 25, 92, 30, 25, 8, 11, 25, 25, DateTimeFieldType.MINUTE_OF_DAY, 92, 77, 92, 29, DateTimeFieldType.MINUTE_OF_DAY, 24, 92, 77, 68};
    }

    public final QE A02(int i2) {
        this.A00 = i2;
        return this;
    }

    public final QE A03(int i2) {
        if (i2 >= 1 && i2 <= 18) {
            this.A01 = i2;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 56));
    }

    public final QE A04(int i2) {
        this.A02 = i2;
        return this;
    }

    public final QE A05(int i2) {
        this.A03 = i2;
        return this;
    }

    public final QE A06(int i2) {
        this.A04 = i2;
        return this;
    }

    public final QE A07(Q5 q5) {
        this.A05 = q5;
        return this;
    }

    public final QE A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final QF A09() {
        return new QF(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
