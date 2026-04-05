package com.google.ads.interactivemedia.v3.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DateTimeConstants;
import org.simpleframework.xml.strategy.Name;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class amn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f20140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f20141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f20142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f20143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static HashMap<String, String> f20144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f20145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f20146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f20147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f20148n;

    static {
        String str = Build.VERSION.CODENAME;
        int i2 = "S".equals(str) ? 31 : "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        f20135a = i2;
        String str2 = Build.DEVICE;
        f20136b = str2;
        String str3 = Build.MANUFACTURER;
        f20137c = str3;
        String str4 = Build.MODEL;
        f20138d = str4;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str4).length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        f20139e = sb.toString();
        f20140f = new byte[0];
        f20141g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f20142h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f20143i = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f20145k = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", Name.MARK, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f20146l = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f20147m = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f20148n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 151, 158, 153, 140, 139, 130, 133, DateTimeConstants.HOURS_PER_WEEK, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 243};
    }

    public static <T> T A(T t) {
        return t;
    }

    public static String B(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String C(byte[] bArr) {
        return new String(bArr, arm.f20427b);
    }

    public static String D(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, arm.f20427b);
    }

    public static String E(String str, int i2) {
        String[] strArrAf = af(str);
        if (strArrAf.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrAf) {
            if (i2 == alo.b(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String F(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int length = objArr.length;
            if (i2 >= length) {
                return sb.toString();
            }
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }

    public static String G(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return arq.c(networkCountryIso);
            }
        }
        return arq.c(Locale.getDefault().getCountry());
    }

    public static String H(Locale locale) {
        return f20135a >= 21 ? locale.toLanguageTag() : locale.toString();
    }

    public static String I(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strB = arq.b(str);
        int i2 = 0;
        String str2 = ae(strB, "-")[0];
        if (f20144j == null) {
            f20144j = as();
        }
        String str3 = f20144j.get(str2);
        if (str3 != null) {
            String strValueOf = String.valueOf(strB.substring(str2.length()));
            strB = strValueOf.length() != 0 ? str3.concat(strValueOf) : new String(str3);
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strB;
        }
        while (true) {
            String[] strArr = f20146l;
            int length = strArr.length;
            if (i2 >= 18) {
                return strB;
            }
            if (strB.startsWith(strArr[i2])) {
                String strValueOf2 = String.valueOf(strArr[i2 + 1]);
                String strValueOf3 = String.valueOf(strB.substring(strArr[i2].length()));
                return strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2);
            }
            i2 += 2;
        }
    }

    public static ExecutorService J(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.ads.interactivemedia.v3.internal.amm
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    public static void K(ajh ajhVar) {
        if (ajhVar != null) {
            try {
                ajhVar.f();
            } catch (IOException unused) {
            }
        }
    }

    public static void L(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static <T> void M(List<T> list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static void N(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static boolean O(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean P(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (O(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean Q(int i2) {
        return i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean R(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean S(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean T(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || TransferTable.COLUMN_FILE.equals(scheme);
    }

    public static boolean U(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean V(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static byte[] W(String str) {
        return str.getBytes(arm.f20427b);
    }

    public static byte[] X(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static <T> T[] Y(T[] tArr) {
        return tArr;
    }

    public static <T> T[] Z(T[] tArr, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        return tArr2;
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static <T> T[] aa(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    public static <T> T[] ab(T[] tArr, int i2) {
        ajr.d(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static String[] ac() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrAd = f20135a >= 24 ? ad(configuration.getLocales().toLanguageTags(), ",") : new String[]{H(configuration.locale)};
        for (int i2 = 0; i2 < strArrAd.length; i2++) {
            strArrAd[i2] = I(strArrAd[i2]);
        }
        return strArrAd;
    }

    public static String[] ad(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] ae(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] af(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : ad(str.trim(), "(\\s*,\\s*)");
    }

    public static long ag(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j2 ^ j4) & (j3 ^ j4)) < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static int ah(long[] jArr, long j2, boolean z) {
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            return iBinarySearch ^ (-1);
        }
        do {
            iBinarySearch++;
            if (iBinarySearch >= jArr.length) {
                break;
            }
        } while (jArr[iBinarySearch] == j2);
        return !z ? iBinarySearch : iBinarySearch - 1;
    }

    public static <T extends Comparable<? super T>> int ai(List<? extends Comparable<? super T>> list, T t, boolean z) {
        int i2;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t) == 0);
            i2 = iBinarySearch + 1;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static int aj(int[] iArr, int i2) {
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            return -(iBinarySearch + 2);
        }
        do {
            iBinarySearch--;
            if (iBinarySearch < 0) {
                break;
            }
        } while (iArr[iBinarySearch] == i2);
        return iBinarySearch;
    }

    public static int ak(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            i2 = iBinarySearch + 1;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static int al(byte[] bArr, int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = f20147m[(i3 >>> 24) ^ (bArr[i4] & 255)] ^ (i3 << 8);
        }
        return i3;
    }

    public static int am(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i2 < i3) {
            i4 = f20148n[i4 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i4;
    }

    public static String an(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        String str2 = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(55 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("IMA SDK ExoPlayer");
        sb.append("/");
        sb.append(str);
        sb.append(" (Linux;Android ");
        sb.append(str2);
        sb.append(") ExoPlayerLib/2.14.0");
        return sb.toString();
    }

    public static void ao(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void ap(long[] jArr, long j2) {
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j3;
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long j4 = 1000000 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
            return;
        }
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = 1000000.0d / d2;
        while (i2 < jArr.length) {
            double d4 = jArr[i2];
            Double.isNaN(d4);
            jArr[i2] = (long) (d4 * d3);
            i2++;
        }
    }

    public static long aq(long j2, long j3) {
        long j4 = j2 - j3;
        if (((j2 ^ j4) & (j3 ^ j2)) < 0) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    private static String ar(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            alj.a("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e2);
            return null;
        }
    }

    private static HashMap<String, String> as() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f20145k.length;
        HashMap<String, String> map = new HashMap<>(length + 86);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f20145k;
            int length3 = strArr.length;
            if (i2 >= 86) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static int b(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int c(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int d(int i2) {
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i3 = f20135a;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int e(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static int f(String str, int i2) {
        int i3 = 0;
        for (String str2 : af(str)) {
            if (i2 == alo.b(str2)) {
                i3++;
            }
        }
        return i3;
    }

    public static int g(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int h(int i2, int i3) {
        if (i2 != 2) {
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                if (i2 != 268435456) {
                    if (i2 == 536870912) {
                        return i3 * 3;
                    }
                    if (i2 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i3 * 4;
        }
        return i3 + i3;
    }

    public static int i(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && arq.d("rtsp", scheme)) {
            return 3;
        }
        String path = uri.getPath();
        if (path == null) {
            return 4;
        }
        String strB = arq.b(path);
        if (!strB.endsWith(".mpd")) {
            if (!strB.endsWith(".m3u8")) {
                Matcher matcher = f20143i.matcher(strB);
                if (!matcher.matches()) {
                    return 4;
                }
                String strGroup = matcher.group(2);
                if (strGroup == null) {
                    return 1;
                }
                if (!strGroup.contains("format=mpd-time-csf")) {
                    if (!strGroup.contains("format=m3u8-aapl")) {
                        return 1;
                    }
                }
            }
            return 2;
        }
        return 0;
    }

    public static long j(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static long k(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long l(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = j2;
        double d3 = f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 * d3);
    }

    public static long m(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
    }

    public static long n(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = j2;
        double d3 = f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public static long o(String str) throws lb {
        Matcher matcher = f20141g.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            throw new lb(strValueOf.length() != 0 ? "Invalid date/time format: ".concat(strValueOf) : new String("Invalid date/time format: "));
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i2 = -i2;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String strValueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(strValueOf2.length() != 0 ? "0.".concat(strValueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - ((long) (i2 * DateTimeConstants.MILLIS_PER_MINUTE)) : timeInMillis;
    }

    public static long p(String str) {
        Matcher matcher = f20142h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d6 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j2 : j2;
    }

    public static long q(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return j2 * (j3 / j4);
        }
        double d2 = j2;
        double d3 = j3;
        double d4 = j4;
        Double.isNaN(d3);
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (long) (d2 * (d3 / d4));
    }

    public static long r(int i2, int i3) {
        return s(i3) | (s(i2) << 32);
    }

    public static long s(int i2) {
        return ((long) i2) & 4294967295L;
    }

    public static Point t(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        ajr.b(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        int i2 = f20135a;
        if (i2 <= 29 && defaultDisplay.getDisplayId() == 0 && U(context)) {
            if ("Sony".equals(f20137c) && f20138d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            String strAr = ar(i2 < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(strAr)) {
                try {
                    String[] strArrAd = ad(strAr.trim(), "x");
                    if (strArrAd.length == 2) {
                        int i3 = Integer.parseInt(strArrAd[0]);
                        int i4 = Integer.parseInt(strArrAd[1]);
                        if (i3 > 0 && i4 > 0) {
                            return new Point(i3, i4);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String strValueOf = String.valueOf(strAr);
                Log.e("Util", strValueOf.length() != 0 ? "Invalid display size: ".concat(strValueOf) : new String("Invalid display size: "));
            }
        }
        Point point = new Point();
        int i5 = f20135a;
        if (i5 >= 23) {
            Display.Mode mode = defaultDisplay.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        if (i5 >= 17) {
            defaultDisplay.getRealSize(point);
            return point;
        }
        defaultDisplay.getSize(point);
        return point;
    }

    public static Handler u(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Handler v() {
        return w(null);
    }

    public static Handler w(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        ajr.c(looperMyLooper);
        return u(looperMyLooper, callback);
    }

    public static Handler x() {
        return u(y(), null);
    }

    public static Looper y() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static ke z(int i2, int i3, int i4) {
        kd kdVar = new kd();
        kdVar.ae("audio/raw");
        kdVar.H(i3);
        kdVar.af(i4);
        kdVar.Y(i2);
        return kdVar.s();
    }
}
