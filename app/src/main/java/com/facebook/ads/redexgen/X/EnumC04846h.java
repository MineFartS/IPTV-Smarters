package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import com.amazonaws.event.ProgressEvent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC04846h {
    A05(1),
    A0B(2),
    A08(4),
    A0A(8),
    A0N(16),
    A0F(32),
    A06(64),
    A0E(128),
    A0C(256),
    A0D(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED),
    A0M(1024),
    A0J(2048),
    A0K(ProgressEvent.PART_FAILED_EVENT_CODE),
    A09(8192),
    A0I(16384),
    A0G(32768),
    A0H(65536),
    A0L(131072),
    A07(262144);

    public static byte[] A01;
    public static String[] A02;
    public static final Map<Integer, EnumC04846h> A03;
    public int A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 73);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{3, 1, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.SECOND_OF_DAY, 7, 93, 82, 88, 78, 83, 85, 88, 67, 82, 93, 72, 85, 74, 89, 30, 25, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 27, DateTimeFieldType.MINUTE_OF_DAY, 3, 8, DateTimeFieldType.SECOND_OF_MINUTE, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 37, 46, 40, 42, 34, 51, 53, 46, 36, 59, 44, 55, 61, 53, 60, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, 1, 3, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 34, 63, 40, 39, 43, 47, 37, 69, 81, 85, 65, 76, 95, 66, 89, 95, 67, 79, 78, 84, 69, 88, 84, 29, 9, DateTimeFieldType.HALFDAY_OF_DAY, 25, DateTimeFieldType.SECOND_OF_DAY, 7, 26, 1, 7, 12, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 29, 11, 12, 25, DateTimeFieldType.SECOND_OF_MINUTE, 8, 8, 28, 24, 12, 1, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 27, 12, 1, 24, 8, 110, 104, 116, 120, 105, 102, 115, 110, 113, 98, 25, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, 31, 2, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_HOUR, 26, 26, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 8, 25, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 25, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 8, DateTimeFieldType.SECOND_OF_MINUTE, 10, 25, 28, 29, 0, 26, 7, DateTimeFieldType.MILLIS_OF_DAY, 7, DateTimeFieldType.MILLIS_OF_DAY, 5, DateTimeFieldType.MILLIS_OF_DAY, 25, 24, 30, DateTimeFieldType.MINUTE_OF_HOUR, 8, 3, 30, DateTimeFieldType.MINUTE_OF_DAY, 5, DateTimeFieldType.SECOND_OF_DAY, 7, 8, 2, 9, 11, 25, DateTimeFieldType.SECOND_OF_MINUTE, 7, 11, DateTimeFieldType.MILLIS_OF_DAY, 10, 3, 25, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 3, DateTimeFieldType.SECOND_OF_DAY, 84, 66, 73, 84, 78, 83, 78, 81, 66, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HOUR_OF_HALFDAY, 4, DateTimeFieldType.HOUR_OF_HALFDAY, 8, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 24, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, 2, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, 6, 1};
    }

    public static void A04() {
        A02 = new String[]{"0BJ5h", "uImWw", "eQs5ApErathnGGN0d7eChKCrZd8SdVGS", "kPzS2riknK7ja7wZhtH9DjUAaupVVGy6", "IlkU", "Bv", "wT", "cW"};
    }

    static {
        A04();
        A03();
        A03 = new HashMap();
        for (EnumC04846h type : valuesCustom()) {
            A03.put(Integer.valueOf(type.A00), type);
        }
    }

    EnumC04846h(int i2) {
        this.A00 = i2;
    }

    @Nullable
    public static EnumC04846h A00(int i2) {
        if (A03.containsKey(Integer.valueOf(i2))) {
            return A03.get(Integer.valueOf(i2));
        }
        return null;
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException", "EmptyCatchBlock"})
    public static EnumSet<EnumC04846h> A02(int i2) throws Exception {
        EnumSet<EnumC04846h> enumSetNoneOf = EnumSet.noneOf(EnumC04846h.class);
        if (i2 <= 0) {
            return enumSetNoneOf;
        }
        EnumC04846h[] enumC04846hArrValuesCustom = valuesCustom();
        while (i2 != 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2);
            i2 ^= Integer.lowestOneBit(i2);
            if (iNumberOfTrailingZeros < enumC04846hArrValuesCustom.length) {
                enumSetNoneOf.add(enumC04846hArrValuesCustom[iNumberOfTrailingZeros]);
            }
        }
        return enumSetNoneOf;
    }

    public final int A05() {
        return this.A00;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC04846h[] valuesCustom() {
        EnumC04846h[] enumC04846hArr = (EnumC04846h[]) values().clone();
        if (A02[6].length() == 6) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "eRZf21luPciybvl5gLFfDWdEin7TzD8T";
        strArr[3] = "eRZf21luPciybvl5gLFfDWdEin7TzD8T";
        return enumC04846hArr;
    }
}
