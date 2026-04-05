package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1T {
    public static byte[] A01;
    public static final /* synthetic */ C1T[] A02;
    public static final C1T A03;
    public static final C1T A04;
    public static final C1T A05;
    public final String A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{24, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_DAY, 27, 1, DateTimeFieldType.HOUR_OF_HALFDAY, 12, 27, 29, 31, 29, DateTimeFieldType.MILLIS_OF_DAY, 27, 3, 1, 28, 11, 10, 12, 3, 1, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 27, DateTimeFieldType.MILLIS_OF_DAY, 119, 101, 98, 118, 105, 101, 119, 127, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 0);
        A05 = new C1T(strA01, 0, strA01);
        String strA012 = A01(13, 14, 115);
        A04 = new C1T(strA012, 1, strA012);
        String strA013 = A01(0, 13, 126);
        A03 = new C1T(strA013, 2, strA013);
        A02 = new C1T[]{A05, A04, A03};
    }

    public C1T(String str, int i2, String str2) {
        this.A00 = str2;
    }

    public static C1T A00(String str) {
        for (C1T c1t : values()) {
            if (c1t.A00.equalsIgnoreCase(str)) {
                return c1t;
            }
        }
        return A03;
    }

    public static C1T valueOf(String str) {
        return (C1T) Enum.valueOf(C1T.class, str);
    }

    public static C1T[] values() {
        return (C1T[]) A02.clone();
    }
}
