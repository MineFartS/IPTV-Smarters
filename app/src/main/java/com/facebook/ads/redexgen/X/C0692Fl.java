package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0692Fl extends RO<C0R> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 53);
            String[] strArr = A01;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "RdAktgh8TRx4T7uGZoOvXD5Nm8OQ26SP";
            strArr2[4] = "NAulEfMGB5fp7nDMqJdUUmABB5JXpKUM";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{DateTimeFieldType.HOUR_OF_DAY, 10, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_HOUR};
    }

    public static void A02() {
        A01 = new String[]{"jR7SgdIzlKHk76CXDj7yskV4BbEyGCpu", "dz14xHNKN2eKa", "osoaj0nOm4U0DksUsx9ydi6yveTqdDmo", "CW4NBbEoC8f", "oKML8tkCm175rZI2zBYjmvrxKy9flX2h", "0JuTJ32H1trbcwgA0tUu0T5MtnfghwR4", "xx3SSYxbJNPIpDYr1BHpXDm7lAtLM5T8", "wtTCE0DbZnhIRkOUKlXj85m9jjBjTzDL"};
    }

    public C0692Fl(String str) {
        super(str);
    }

    public final C0X A03(@Nullable C0R c0r) {
        String strA00;
        if (c0r == null) {
            strA00 = A00(0, 4, 74);
        } else {
            strA00 = A00(0, 0, 56) + c0r.A03();
        }
        C0X c0x = new C0X(this, strA00);
        if (A01[7].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "ciTvicHW32i";
        strArr[1] = "sW1NMqe52ANNy";
        return c0x;
    }
}
