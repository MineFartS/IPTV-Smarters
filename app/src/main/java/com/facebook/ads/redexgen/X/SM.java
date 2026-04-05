package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SM implements InterfaceC03711u {
    public static byte[] A04;
    public static String[] A05;
    public final SB A00;
    public final InterfaceC03661p A01;
    public final C03691s A02;
    public final X2 A03;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-77, -42, -110, -31, -44, -36, -41, -43, -26, -110, -37, -27, -110, -32, -25, -34, -34, -115, -96, -103, -113, -105, -112, -86, -112, -93, -97, -99, -116, -98, -86, -106, -112, -92, -74, -78, -79, -27, -44, -39, -43, -34, -45, -43, -66, -43, -28, -25, -33, -30, -37, -87, -82, -76, -65, -91, -78, -78, -81, -78, -65, -93, -81, -92, -91, -65, -85, -91, -71, 4, 7, 6, -1, DateTimeFieldType.MILLIS_OF_SECOND, 1, 6, DateTimeFieldType.HOUR_OF_HALFDAY, -7, 4, 1, -4, -7, 12, 1, 7, 6, DateTimeFieldType.MILLIS_OF_SECOND, 12, 1, 5, -3, DateTimeFieldType.MILLIS_OF_SECOND, 3, -3, DateTimeFieldType.HOUR_OF_DAY, -61, -37, -23, -23, -41, -35, -37, -80, -106, -66, -38, -28, -28, -38, -33, -40, -111, -45, -26, -33, -43, -35, -42, -111, -41, -32, -29, -111, -34, -42, -28, -28, -46, -40, -42, -97, -95, -94, -96, -83, -109, -96, -96, -99, -96, -83, -101, -109, -95, -95, -113, -107, -109, -83, -103, -109, -89, 4, DateTimeFieldType.MINUTE_OF_HOUR, 12};
    }

    public static void A02() {
        A05 = new String[]{"PyT2XUnl", "3EmvKqRjFYzRkizxlD8eotggUBC8U5J9", "Ib6uyfMRsh5ysHZ3i8ryXk3sO16qq9Ys", "q2kkzr74cnXMazMYxmC9c", "9U931lGThJH7Qz6wctlm6EKEWHFtvDAV", "f15MquYM06llw3BWZWASFwAp5egI2HKX", "yMUgiPhi", "t3xZZPMR"};
    }

    public SM(X2 x2, C03691s c03691s, InterfaceC03661p interfaceC03661p, SB sb) {
        this.A03 = x2;
        this.A02 = c03691s;
        this.A01 = interfaceC03661p;
        this.A00 = sb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC03711u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A7N(android.os.Message r12) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SM.A7N(android.os.Message):void");
    }
}
