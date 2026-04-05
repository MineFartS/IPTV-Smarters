package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0961Qc {
    A05(A00(27, 7, 82)),
    A04(A00(17, 10, 36));

    public static byte[] A01;
    public static String[] A02;
    public String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 91, 75, 87, 92, 85, 90, 83, 81, 71, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 12, DateTimeFieldType.SECOND_OF_MINUTE, 10, 7, 6, 86, 87, DateTimeFieldType.SECOND_OF_MINUTE, 91, 80, 89, 86, 95, 93, 75, 62, 60, 33, 56, 39, 42, 43};
    }

    public static void A02() {
        A02 = new String[]{"eivXn7WqkaVyJ2amCalRVsu1nM81zzOL", "IY1PhTJan2YjTy3m27KNizUeB7qtWqJm", "bXOqwPMBCrH3s0bMCsL", "ZrI87R5JnQfkseZsVS85jpDDhrZappEb", "OQXnNqOlJnUzzklcWSYX2hAjXl5kV5w8", "Z35xfMoNmr9cRx2xWokc9BX7TfFFuzqW", "OPmwzWKlqSIpSWAXYRalqZxxZOaDZn32", "DtHbWGOE2Bmy5zeMr4BSgc5m3XVIvhqE"};
    }

    static {
        A02();
        A01();
    }

    EnumC0961Qc(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0961Qc[] valuesCustom() throws CloneNotSupportedException {
        Object objClone = values().clone();
        if (A02[0].charAt(13) == 'T') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "jZZ0FxASmyF6MQQ2nA29dubjFSBlMvOs";
        strArr[5] = "jZZ0FxASmyF6MQQ2nA29dubjFSBlMvOs";
        return (EnumC0961Qc[]) objClone;
    }
}
