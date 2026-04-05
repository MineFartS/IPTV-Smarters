package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class J1 {
    public static byte[] A00;
    public static String[] A01;
    public static final int A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final Pattern A07;
    public static final Pattern A08;
    public static final Pattern A09;
    public static final int[] A0A;

    public static String A0M(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 109);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0X() {
        A00 = new byte[]{-40, -32, 4, 33, 38, 45, 48, -13, -7, 38, 28, 42, 39, 33, 28, -40, -51, -48, 3, -23, -43, -18, 9, -43, DateTimeFieldType.HOUR_OF_HALFDAY, -40, -43, -31, 5, 35, -38, 37, -47, -6, 46, 54, 46, 54, 46, 54, 46, 54, -5, 46, -1, -6, 46, 54, 46, 54, -5, 46, -1, -6, 46, 54, 46, 54, -5, 45, 38, 70, 47, -6, 46, 54, 46, 54, -5, 12, -6, 46, 54, 46, 54, -5, 12, -6, 46, 54, 46, 54, -5, -6, 45, 46, 0, -2, 47, -6, 46, 54, -3, -5, -5, DateTimeFieldType.HOUR_OF_DAY, -6, 45, 44, 76, 47, 78, -6, -6, 46, -3, 78, 46, -1, -5, -6, 46, 54, DateTimeFieldType.HOUR_OF_DAY, 46, 54, -5, 12, DateTimeFieldType.HOUR_OF_DAY, -6, 46, 54, 46, 54, -5, -5, -5, DateTimeFieldType.HOUR_OF_DAY, -16, -25, -8, -20, -57, -14, -75, -77, -21, -26, 25, DateTimeFieldType.CLOCKHOUR_OF_DAY, -15, DateTimeFieldType.HALFDAY_OF_DAY, 2, 26, 6, DateTimeFieldType.MINUTE_OF_HOUR, -19, 10, 3, -48, -45, -49, -39, -49, -43, -28, -22, -15, 39, 76, 84, 63, 74, 71, 66, -2, 66, 63, 82, 67, DateTimeFieldType.HALFDAY_OF_DAY, 82, 71, 75, 67, -2, 68, 77, 80, 75, 63, 82, 24, -2, -26, -27, -41, -66, -55, 0, -44, -98, -93, -97, -75, -58, -98, -98, -47, -90, -93, -81, -45, -96, -97, -49, -97, -75, -98, -98, -47, -90, -93, -81, -45, -96, -97, -61, -97, -75, -98, -98, -47, -90, -93, -81, -45, -96, -97, -70, -97, -75, -98, -54, -98, -98, -47, -90, -93, -81, -45, -96, -97, -66, -97, -75, -98, -98, -47, -90, -93, -81, -45, -96, -97, -61, -97, -75, -98, -98, -47, -90, -93, -81, -92, -45, -96, -97, -55, -97, -75, -97, -75, -102, 76, 79, 82, 75};
    }

    public static void A0Y() {
        A01 = new String[]{"OUVH8uooqfZhRjAIdfTByGEz8oRZsv97", "zwLe5czFvrzgWLxx1jU82T7WkmJFGmFa", "eY5LtUfPqkDg74OjVCyNlMlM5clj8vGG", "7e2Wg6fQOHKlG3pOdXEcbT27Kf8nm98Y", "00xy", "XMUm", "8d2GFVLCqYdUjn", "V0KiqMMFF26dnG06XaQkCu6KzWv5VLPl"};
    }

    static {
        A0Y();
        A0X();
        A02 = (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') ? 26 : Build.VERSION.SDK_INT;
        A03 = Build.DEVICE;
        A05 = Build.MANUFACTURER;
        A06 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append(A03);
        String strA0M = A0M(130, 2, 95);
        sb.append(strA0M);
        sb.append(A06);
        sb.append(strA0M);
        sb.append(A05);
        sb.append(strA0M);
        sb.append(A02);
        A04 = sb.toString();
        A08 = Pattern.compile(A0M(33, 95, 101));
        A09 = Pattern.compile(A0M(190, 84, 9));
        A07 = Pattern.compile(A0M(16, 17, 59));
        A0A = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static float A00(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int A01(int i2) {
        if (i2 == 0) {
            return 16777216;
        }
        if (i2 == 1) {
            return 3538944;
        }
        if (i2 == 2) {
            return 13107200;
        }
        if (i2 == 3 || i2 == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    public static int A02(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 == 24) {
            return Integer.MIN_VALUE;
        }
        if (A01[7].charAt(9) == 'R') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "o2RW8OxNxplgokuXxXMfYyyzs2crag93";
        strArr[2] = "CC3jMXKkKFYgIdmJh2HVAiafoYaw56yD";
        if (i2 != 32) {
            return 0;
        }
        return 1073741824;
    }

    public static int A03(int i2) {
        switch (i2) {
        }
        return 3;
    }

    public static int A04(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int A05(int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            if (i2 != 1073741824) {
                if (i2 == 2) {
                    return i3 * 2;
                }
                if (i2 == 3) {
                    return i3;
                }
                if (A01[0].charAt(22) != 'E') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "xmFnlLfDlkmgoCJzWXOPDTkVceE7vC5Q";
                strArr[2] = "vdv9qgJMAF7gDXTK0FDhsaXIVyCj2cDL";
                if (i2 != 4) {
                    throw new IllegalArgumentException();
                }
            }
            return i3 * 4;
        }
        return i3 * 3;
    }

    public static int A06(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int A07(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static int A08(String str) {
        int result = str.length();
        IM.A03(result <= 4);
        int i2 = 0;
        for (int i3 = 0; i3 < result; i3++) {
            int i4 = str.charAt(i3);
            i2 = (i2 << 8) | i4;
        }
        return i2;
    }

    public static int A09(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = (i4 << 8) ^ A0A[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255];
            i2++;
        }
        return i4;
    }

    public static int A0A(long[] jArr, long j2, boolean z, boolean z2) {
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            iBinarySearch ^= -1;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            if (z) {
                iBinarySearch--;
            }
        }
        return z2 ? Math.min(jArr.length - 1, iBinarySearch) : iBinarySearch;
    }

    public static int A0B(long[] jArr, long j2, boolean z, boolean z2) {
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            iBinarySearch = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (A01[7].charAt(9) == 'R') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "bjYgwsFaniVg3KmdX152FYnlIJpDqbBS";
                strArr[2] = "rh3pSGiNWBYg5ggjhnEOewx4qEYSrmXe";
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            if (z) {
                iBinarySearch++;
            }
        }
        return z2 ? Math.max(0, iBinarySearch) : iBinarySearch;
    }

    public static long A0C(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = j2 * ((double) f2);
        String[] strArr = A01;
        if (strArr[1].charAt(11) != strArr[2].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "Ir2i9910xeYGEf";
        strArr2[6] = "Ir2i9910xeYGEf";
        return Math.round(d2);
    }

    public static long A0D(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 / ((double) f2));
    }

    public static long A0E(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static long A0F(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long A0G(long multiplicationFactor, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            long divisionFactor = multiplicationFactor / (j3 / j2);
            return divisionFactor;
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return multiplicationFactor * (j2 / j3);
        }
        double d2 = j2;
        String[] strArr = A01;
        if (strArr[1].charAt(11) != strArr[2].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "AZlDHNUOPlHgc7R7na69mBD3Abcl9cBo";
        strArr2[2] = "277QpyU1yDygazm68FxNRmoTloUVz7mm";
        return (long) (multiplicationFactor * (d2 / j3));
    }

    public static long A0H(long result, long j2, long j3) {
        long j4 = result + j2;
        if (((result ^ j4) & (j2 ^ j4)) < 0) {
            return j3;
        }
        return j4;
    }

    public static long A0I(long result, long j2, long j3) {
        long j4 = result - j2;
        if (((result ^ j2) & (result ^ j4)) < 0) {
            return j3;
        }
        return j4;
    }

    public static long A0J(long maxPositionUs, C0570Aa c0570Aa, long j2, long j3) {
        if (C0570Aa.A04.equals(c0570Aa)) {
            return maxPositionUs;
        }
        long jA0I = A0I(maxPositionUs, c0570Aa.A01, Long.MIN_VALUE);
        long jA0H = A0H(maxPositionUs, c0570Aa.A00, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = jA0I <= j2 && j2 <= jA0H;
        if (jA0I > j3 || j3 > jA0H) {
            z = false;
        }
        if (z2 && z) {
            if (Math.abs(j2 - maxPositionUs) <= Math.abs(j3 - maxPositionUs)) {
                return j2;
            }
            return j3;
        }
        if (z2) {
            return j2;
        }
        if (z) {
            return j3;
        }
        return jA0I;
    }

    public static long A0K(String str) throws AI {
        int i2;
        Matcher matcher = A08.matcher(str);
        if (matcher.matches()) {
            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase(A0M(189, 1, 57))) {
                i2 = 0;
            } else {
                i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if (A0M(132, 1, 45).equals(matcher.group(11))) {
                    i2 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(A0M(155, 3, 48)));
            gregorianCalendar.clear();
            int i3 = Integer.parseInt(matcher.group(1));
            int timezoneShift = Integer.parseInt(matcher.group(2));
            gregorianCalendar.set(i3, timezoneShift - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                int timezoneShift2 = new BigDecimal(A0M(134, 2, 24) + matcher.group(8)).movePointRight(3).intValue();
                gregorianCalendar.set(14, timezoneShift2);
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i2 != 0) {
                long time = DateTimeConstants.MILLIS_PER_MINUTE * i2;
                return timeInMillis - time;
            }
            return timeInMillis;
        }
        throw new AI(A0M(158, 26, 113) + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long A0L(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.J1.A0L(java.lang.String):long");
    }

    public static String A0N(Context context, String str) {
        String packageName;
        try {
            packageName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            packageName = A0M(136, 1, 63);
        }
        return str + A0M(133, 1, 86) + packageName + A0M(0, 16, 75) + Build.VERSION.RELEASE + A0M(128, 2, 90) + A0M(137, 18, 52);
    }

    @Nullable
    public static String A0O(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return A0P(str);
        }
    }

    public static String A0P(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String A0Q(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    public static String A0R(String str) {
        int percentCharacterCount = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < percentCharacterCount; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = percentCharacterCount - (i2 * 2);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = A07.matcher(str);
        int iEnd = 0;
        while (i2 > 0 && matcher.find()) {
            int startOfNotEscaped = Integer.parseInt(matcher.group(1), 16);
            char c2 = (char) startOfNotEscaped;
            int startOfNotEscaped2 = matcher.start();
            sb.append((CharSequence) str, iEnd, startOfNotEscaped2);
            sb.append(c2);
            iEnd = matcher.end();
            i2--;
        }
        if (iEnd < percentCharacterCount) {
            sb.append((CharSequence) str, iEnd, percentCharacterCount);
        }
        int length = sb.length();
        String[] strArr = A01;
        if (strArr[1].charAt(11) != strArr[2].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "60ez1RHojKn5oOlO8qVtxWEnppO7SBlh";
        strArr2[0] = "60ez1RHojKn5oOlO8qVtxWEnppO7SBlh";
        if (length != i4) {
            return null;
        }
        return sb.toString();
    }

    public static String A0S(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String A0T(byte[] bArr) {
        return new String(bArr, Charset.forName(A0M(184, 5, 36)));
    }

    public static String A0U(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, Charset.forName(A0M(184, 5, 36)));
    }

    public static String A0V(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < objArr.length - 1) {
                sb.append(A0M(130, 2, 95));
            }
        }
        return sb.toString();
    }

    public static ExecutorService A0W(String str) {
        return Executors.newSingleThreadExecutor(new J0(str));
    }

    public static void A0Z(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void A0a(InterfaceC0740Hh interfaceC0740Hh) {
        if (interfaceC0740Hh != null) {
            try {
                interfaceC0740Hh.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0c(Throwable th) throws Throwable {
        A0d(th);
    }

    public static <T extends Throwable> void A0d(Throwable th) throws Throwable {
        throw th;
    }

    public static void A0e(long[] jArr, long j2, long j3) {
        if (j3 < j2 || j3 % j2 != 0) {
            if (j3 < j2 && j2 % j3 == 0) {
                long j4 = j2 / j3;
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    jArr[i2] = jArr[i2] * j4;
                }
                return;
            }
            double d2 = j2 / j3;
            for (int i3 = 0; i3 < jArr.length; i3++) {
                jArr[i3] = (long) (jArr[i3] * d2);
            }
            return;
        }
        long j5 = j3 / j2;
        for (int i4 = 0; i4 < jArr.length; i4++) {
            jArr[i4] = jArr[i4] / j5;
            String[] strArr = A01;
            if (strArr[1].charAt(11) != strArr[2].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "s0FY2QjhDMSgaIZxb47pyGCkoKsYBuuX";
            strArr2[2] = "OmWU9dpRSkGgYNmEJrV8zsr2Naib8MwM";
        }
    }

    public static boolean A0f(int i2) {
        return i2 == Integer.MIN_VALUE || i2 == 1073741824;
    }

    public static boolean A0g(int i2) {
        return i2 == 3 || i2 == 2 || i2 == Integer.MIN_VALUE || i2 == 1073741824 || i2 == 4;
    }

    public static boolean A0h(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean A0i(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String strA0M = A0M(274, 4, 121);
            if (A01[0].charAt(22) != 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "8R32";
            strArr[5] = "dLkW";
            if (!strA0M.equals(scheme)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0j(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A0k(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] A0l(java.lang.String r6) {
        /*
            int r0 = r6.length()
            int r0 = r0 / 2
            byte[] r5 = new byte[r0]
            r4 = 0
        L9:
            int r0 = r5.length
            if (r4 >= r0) goto L2b
            int r3 = r4 * 2
            char r0 = r6.charAt(r3)
            r2 = 16
            int r0 = java.lang.Character.digit(r0, r2)
            int r1 = r0 << 4
            int r0 = r3 + 1
            char r0 = r6.charAt(r0)
            int r0 = java.lang.Character.digit(r0, r2)
            int r1 = r1 + r0
            byte r0 = (byte) r1
            r5[r4] = r0
            int r4 = r4 + 1
            goto L9
        L2b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.J1.A0l(java.lang.String):byte[]");
    }

    public static byte[] A0m(String str) {
        return str.getBytes(Charset.forName(A0M(184, 5, 36)));
    }

    public static int[] A0n(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int i2 = list.size();
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = list.get(i3).intValue();
        }
        return iArr;
    }

    public static <T> T[] A0o(T[] tArr, int i2) {
        IM.A03(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static String[] A0p(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A0q(String str, String str2) {
        return str.split(str2, 2);
    }
}
