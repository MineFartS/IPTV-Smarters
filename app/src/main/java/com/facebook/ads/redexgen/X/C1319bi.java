package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1319bi extends IA {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{120, 86, DateTimeFieldType.HOUR_OF_HALFDAY, 75, 86, 29, 0, DateTimeFieldType.MILLIS_OF_SECOND, 39, 81, 87, 82, 80, 37, 87, 81, 37, 29, 82, 80, 37, 87, 81, 37, 29, 82, 80, 37, 87, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 72, 37, 87, 28, 1, DateTimeFieldType.MILLIS_OF_DAY, 93, 107, 29, 27, 30, 28, 105, 27, 29, 105, 81, 30, 28, 105, 27, 29, 105, 81, 30, 28, 105, 27, 67, 7, 105, 27, 80, 77, 90, DateTimeFieldType.HOUR_OF_DAY, 85, 35, 87, 111, 32, 34, 87, 37, 35, 87, 111, 32, 34, 87, 37, 35, 87, 111, 32, 34, 87, 37, 125, 56, 87, 37, 110, 115, 100, 47};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(8, 29, 107), 32);
        A02 = Pattern.compile(A06(37, 29, 39), 32);
        A03 = Pattern.compile(A06(66, 30, 25), 32);
    }

    public C1319bi(String str, long j2, long j3, long j4, @Nullable File file) {
        super(str, j2, j3, j4, file);
    }

    @Nullable
    public static C1319bi A00(File file, IE ie) {
        String name = file.getName();
        if (!name.endsWith(A06(1, 7, 106))) {
            file = A05(file, ie);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A03.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        long length = file.length();
        int id = Integer.parseInt(matcher.group(1));
        String strA0D = ie.A0D(id);
        if (strA0D == null) {
            return null;
        }
        String key = matcher.group(2);
        long j2 = Long.parseLong(key);
        String key2 = matcher.group(3);
        return new C1319bi(strA0D, j2, length, Long.parseLong(key2), file);
    }

    public static C1319bi A01(String str, long j2) {
        return new C1319bi(str, j2, -1L, -9223372036854775807L, null);
    }

    public static C1319bi A02(String str, long j2) {
        return new C1319bi(str, j2, -1L, -9223372036854775807L, null);
    }

    public static C1319bi A03(String str, long j2, long j3) {
        return new C1319bi(str, j2, j3, -9223372036854775807L, null);
    }

    public static File A04(File file, int i2, long j2, long j3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        String strA06 = A06(0, 1, 68);
        sb.append(strA06);
        sb.append(j2);
        sb.append(strA06);
        sb.append(j3);
        sb.append(A06(1, 7, 106));
        return new File(file, sb.toString());
    }

    @Nullable
    public static File A05(File file, IE ie) {
        String strGroup;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            strGroup = J1.A0R(matcher.group(1));
            if (strGroup == null) {
                return null;
            }
        } else {
            matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            strGroup = matcher.group(1);
        }
        File fileA04 = A04(file.getParentFile(), ie.A09(strGroup), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (file.renameTo(fileA04)) {
            return fileA04;
        }
        return null;
    }

    public final C1319bi A08(int i2) {
        IM.A04(this.A05);
        long now = System.currentTimeMillis();
        return new C1319bi(this.A04, this.A02, this.A01, now, A04(this.A03.getParentFile(), i2, this.A02, now));
    }
}
