package com.facebook.ads.redexgen.X;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YZ implements CI {
    public static byte[] A06;
    public static final Constructor<? extends CF> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{4, 51, 51, 46, 51, 97, 40, 47, 50, 53, 32, 47, 53, 40, 32, 53, 40, 47, 38, 97, 7, DateTimeFieldType.HALFDAY_OF_DAY, 0, 2, 97, 36, 57, 53, 36, 47, 50, 40, 46, 47, 37, 30, DateTimeFieldType.SECOND_OF_MINUTE, 8, 0, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 4, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, 80, DateTimeFieldType.SECOND_OF_MINUTE, 2, 2, 31, 2, 80, DateTimeFieldType.MINUTE_OF_HOUR, 2, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_DAY, 4, 25, 30, DateTimeFieldType.MILLIS_OF_SECOND, 80, 54, 60, 49, 51, 80, DateTimeFieldType.SECOND_OF_MINUTE, 8, 4, 2, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 4, 31, 2, 98, 110, 108, 47, 103, 96, 98, 100, 99, 110, 110, 106, 47, 96, 101, 114, 47, 104, 111, 117, 100, 115, 111, 96, 109, 47, 100, 121, 110, 113, 109, 96, 120, 100, 115, 51, 47, 100, 121, 117, 47, 103, 109, 96, 98, 47, 71, 109, 96, 98, 68, 121, 117, 115, 96, 98, 117, 110, 115};
    }

    static {
        A01();
        Constructor<? extends CF> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, 74)).asSubclass(CF.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException(A00(0, 34, 10), e2);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.X.CI
    public final synchronized CF[] A4I() {
        CF[] cfArr;
        cfArr = new CF[A07 == null ? 12 : 13];
        cfArr[0] = new C1179Yo(this.A01);
        cfArr[1] = new C1189Yy(this.A00);
        cfArr[2] = new Z0(this.A03);
        cfArr[3] = new C1182Yr(this.A02);
        cfArr[4] = new ZF();
        cfArr[5] = new ZC();
        cfArr[6] = new ZY(this.A05, this.A04);
        cfArr[7] = new C1172Yh();
        cfArr[8] = new Z6();
        cfArr[9] = new ZS();
        cfArr[10] = new C1191Za();
        cfArr[11] = new C1169Ye();
        if (A07 != null) {
            try {
                cfArr[12] = A07.newInstance(new Object[0]);
            } catch (Exception e2) {
                throw new IllegalStateException(A00(34, 40, 59), e2);
            }
        }
        return cfArr;
    }
}
