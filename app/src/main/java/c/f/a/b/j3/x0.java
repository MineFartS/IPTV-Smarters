package c.f.a.b.j3;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import c.f.a.b.k1;
import c.f.a.b.p1;
import c.f.a.b.w1;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.simpleframework.xml.strategy.Name;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f9296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f9297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f9298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f9299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f9300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f9301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f9302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f9303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f9304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f9305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static HashMap<String, String> f9306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f9307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f9308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f9309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f9310o;

    static {
        String str = Build.VERSION.CODENAME;
        int i2 = "S".equals(str) ? 31 : "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        f9296a = i2;
        String str2 = Build.DEVICE;
        f9297b = str2;
        String str3 = Build.MANUFACTURER;
        f9298c = str3;
        String str4 = Build.MODEL;
        f9299d = str4;
        f9300e = str2 + ", " + str4 + ", " + str3 + ", " + i2;
        f9301f = new byte[0];
        f9302g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f9303h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f9304i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f9305j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f9307l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", Name.MARK, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f9308m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f9309n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f9310o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 151, 158, 153, 140, 139, 130, 133, DateTimeConstants.HOURS_PER_WEEK, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 243};
    }

    public static Handler A(Handler.Callback callback) {
        return w(Q(), callback);
    }

    public static boolean A0(Activity activity, p1... p1VarArr) {
        if (f9296a < 23) {
            return false;
        }
        for (p1 p1Var : p1VarArr) {
            p1.g gVar = p1Var.f9643d;
            if (gVar != null) {
                if (t0(gVar.f9685a)) {
                    return O0(activity);
                }
                for (int i2 = 0; i2 < p1Var.f9643d.f9691g.size(); i2++) {
                    if (t0(p1Var.f9643d.f9691g.get(i2).f9693a)) {
                        return O0(activity);
                    }
                }
            }
        }
        return false;
    }

    public static HashMap<String, String> B() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f9307l.length);
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
            String[] strArr = f9307l;
            if (i2 >= strArr.length) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static <T> void B0(List<T> list, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(list.remove(i2 + i5));
        }
        list.addAll(Math.min(i4, list.size()), arrayDeque);
    }

    public static Uri C(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f9305j.matcher(c.f.b.a.b.e(path));
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static ExecutorService C0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: c.f.a.b.j3.f
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return x0.w0(str, runnable);
            }
        });
    }

    public static String D(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String D0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strE = c.f.b.a.b.e(str);
        String str2 = V0(strE, "-")[0];
        if (f9306k == null) {
            f9306k = B();
        }
        String str3 = f9306k.get(str2);
        if (str3 != null) {
            strE = str3 + strE.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? y0(strE) : strE;
    }

    public static String E(byte[] bArr) {
        return new String(bArr, c.f.b.a.d.f15784c);
    }

    public static <T> T[] E0(T[] tArr, T t) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t;
        return (T[]) j(objArrCopyOf);
    }

    public static String F(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, c.f.b.a.d.f15784c);
    }

    public static <T> T[] F0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static String G(int i2) {
        if (i2 == 0) {
            return "application/dash+xml";
        }
        if (i2 == 1) {
            return "application/vnd.ms-sstr+xml";
        }
        if (i2 != 2) {
            return null;
        }
        return "application/x-mpegURL";
    }

    public static <T> T[] G0(T[] tArr, int i2) {
        g.a(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static int H(int i2) {
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
                int i3 = f9296a;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static <T> T[] H0(T[] tArr, int i2, int i3) {
        g.a(i2 >= 0);
        g.a(i3 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i2, i3);
    }

    public static int I(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static long I0(String str) throws w1 {
        Matcher matcher = f9302g.matcher(str);
        if (!matcher.matches()) {
            throw w1.a("Invalid date/time format: " + str, null);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - ((long) (i2 * DateTimeConstants.MILLIS_PER_MINUTE)) : timeInMillis;
    }

    public static byte[] J(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((Character.digit(str.charAt(i3), 16) << 4) + Character.digit(str.charAt(i3 + 1), 16));
        }
        return bArr;
    }

    public static long J0(String str) {
        Matcher matcher = f9303h.matcher(str);
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

    public static int K(String str, int i2) {
        int i3 = 0;
        for (String str2 : W0(str)) {
            if (i2 == d0.n(str2)) {
                i3++;
            }
        }
        return i3;
    }

    public static boolean K0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static String L(String str, int i2) {
        String[] strArrW0 = W0(str);
        if (strArrW0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrW0) {
            if (i2 == d0.n(str2)) {
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

    public static boolean L0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static String M(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static byte[] M0(c.f.a.b.i3.p pVar) {
        byte[] bArrCopyOf = new byte[1024];
        int iB = 0;
        int i2 = 0;
        while (iB != -1) {
            if (i2 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            iB = pVar.b(bArrCopyOf, i2, bArrCopyOf.length - i2);
            if (iB != -1) {
                i2 += iB;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i2);
    }

    public static String N(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return c.f.b.a.b.f(networkCountryIso);
            }
        }
        return c.f.b.a.b.f(Locale.getDefault().getCountry());
    }

    public static <T> void N0(List<T> list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static Point O(Context context) {
        DisplayManager displayManager;
        Display display = (f9296a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) g.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return P(context, display);
    }

    public static boolean O0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    public static Point P(Context context, Display display) {
        int i2 = f9296a;
        if (i2 <= 29 && display.getDisplayId() == 0 && v0(context)) {
            if ("Sony".equals(f9298c) && f9299d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            String strJ0 = j0(i2 < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(strJ0)) {
                try {
                    String[] strArrU0 = U0(strJ0.trim(), "x");
                    if (strArrU0.length == 2) {
                        int i3 = Integer.parseInt(strArrU0[0]);
                        int i4 = Integer.parseInt(strArrU0[1]);
                        if (i3 > 0 && i4 > 0) {
                            return new Point(i3, i4);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                z.d("Util", "Invalid display size: " + strJ0);
            }
        }
        Point point = new Point();
        int i5 = f9296a;
        if (i5 >= 23) {
            T(display, point);
        } else if (i5 >= 17) {
            S(display, point);
        } else {
            R(display, point);
        }
        return point;
    }

    public static long P0(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return j2 * (j3 / j4);
        }
        double d2 = j3;
        double d3 = j4;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = j2;
        Double.isNaN(d4);
        return (long) (d4 * (d2 / d3));
    }

    public static Looper Q() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static long[] Q0(List<Long> list, long j2, long j3) {
        int size = list.size();
        long[] jArr = new long[size];
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() / j4;
                i2++;
            }
        } else if (j3 >= j2 || j2 % j3 != 0) {
            double d2 = j2;
            double d3 = j3;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = d2 / d3;
            while (i2 < size) {
                double dLongValue = list.get(i2).longValue();
                Double.isNaN(dLongValue);
                jArr[i2] = (long) (dLongValue * d4);
                i2++;
            }
        } else {
            long j5 = j2 / j3;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() * j5;
                i2++;
            }
        }
        return jArr;
    }

    public static void R(Display display, Point point) {
        display.getSize(point);
    }

    public static void R0(long[] jArr, long j2, long j3) {
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
            return;
        }
        if (j3 < j2 && j2 % j3 == 0) {
            long j5 = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j5;
                i2++;
            }
            return;
        }
        double d2 = j2;
        double d3 = j3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        while (i2 < jArr.length) {
            double d5 = jArr[i2];
            Double.isNaN(d5);
            jArr[i2] = (long) (d5 * d4);
            i2++;
        }
    }

    public static void S(Display display, Point point) {
        display.getRealSize(point);
    }

    public static void S0(Throwable th) throws Throwable {
        T0(th);
    }

    public static void T(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static <T extends Throwable> void T0(Throwable th) throws Throwable {
        throw th;
    }

    public static UUID U(String str) {
        String strE = c.f.b.a.b.e(str);
        strE.hashCode();
        switch (strE) {
            case "playready":
                return c.f.a.b.w0.f10308e;
            case "widevine":
                return c.f.a.b.w0.f10307d;
            case "clearkey":
                return c.f.a.b.w0.f10306c;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static String[] U0(String str, String str2) {
        return str.split(str2, -1);
    }

    public static int V(String str) {
        String[] strArrU0;
        int length;
        if (str == null || (length = (strArrU0 = U0(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrU0[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrU0[length - 2]);
        try {
            int i2 = Integer.parseInt((String) g.e(str2));
            return z ? -i2 : i2;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String[] V0(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String W(Locale locale) {
        return f9296a >= 21 ? X(locale) : locale.toString();
    }

    public static String[] W0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : U0(str.trim(), "(\\s*,\\s*)");
    }

    public static String X(Locale locale) {
        return locale.toLanguageTag();
    }

    public static ComponentName X0(Context context, Intent intent) {
        return f9296a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static long Y(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = j2;
        double d3 = f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 * d3);
    }

    public static long Y0(long j2, long j3, long j4) {
        long j5 = j2 - j3;
        return ((j2 ^ j5) & (j3 ^ j2)) < 0 ? j4 : j5;
    }

    public static long Z(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
    }

    public static boolean Z0(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static long a(long j2, long j3, long j4) {
        long j5 = j2 + j3;
        return ((j2 ^ j5) & (j3 ^ j5)) < 0 ? j4 : j5;
    }

    public static int a0(int i2) {
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

    public static byte[] a1(InputStream inputStream) throws IOException {
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

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static k1 b0(int i2, int i3, int i4) {
        return new k1.b().e0("audio/raw").H(i3).f0(i4).Y(i2).E();
    }

    public static String b1(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i2] & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 16));
        }
        return sb.toString();
    }

    public static <T extends Comparable<? super T>> int c(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i2;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i2 = iBinarySearch ^ (-1);
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t) == 0);
            i2 = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z2 ? Math.min(list.size() - 1, i2) : i2;
    }

    public static int c0(int i2, int i3) {
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
        return i3 * 2;
    }

    public static long c1(int i2, int i3) {
        return d1(i3) | (d1(i2) << 32);
    }

    public static int d(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = iBinarySearch ^ (-1);
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            i2 = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    public static long d0(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = j2;
        double d3 = f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public static long d1(int i2) {
        return ((long) i2) & 4294967295L;
    }

    public static int e(a0 a0Var, long j2, boolean z, boolean z2) {
        int i2;
        int iC = a0Var.c() - 1;
        int i3 = 0;
        while (i3 <= iC) {
            int i4 = (i3 + iC) >>> 1;
            if (a0Var.b(i4) < j2) {
                i3 = i4 + 1;
            } else {
                iC = i4 - 1;
            }
        }
        if (z && (i2 = iC + 1) < a0Var.c() && a0Var.b(i2) == j2) {
            return i2;
        }
        if (z2 && iC == -1) {
            return 0;
        }
        return iC;
    }

    public static int e0(int i2) {
        if (i2 == 13) {
            return 1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static CharSequence e1(CharSequence charSequence, int i2) {
        return charSequence.length() <= i2 ? charSequence : charSequence.subSequence(0, i2);
    }

    public static <T extends Comparable<? super T>> int f(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
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
            i2 = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static String f0(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        String str = j2 < 0 ? "-" : BuildConfig.FLAVOR;
        long jAbs = (Math.abs(j2) + 500) / 1000;
        long j3 = jAbs % 60;
        long j4 = (jAbs / 60) % 60;
        long j5 = jAbs / 3600;
        sb.setLength(0);
        return (j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)) : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3))).toString();
    }

    public static String f1(String str) {
        int length = str.length();
        int iEnd = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 * 2);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = f9304i.matcher(str);
        while (i2 > 0 && matcher.find()) {
            char c2 = (char) Integer.parseInt((String) g.e(matcher.group(1)), 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c2);
            iEnd = matcher.end();
            i2--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    public static int g(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i2);
            i3 = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static String[] g0() {
        String[] strArrH0 = h0();
        for (int i2 = 0; i2 < strArrH0.length; i2++) {
            strArrH0[i2] = D0(strArrH0[i2]);
        }
        return strArrH0;
    }

    public static void g1(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static int h(long[] jArr, long j2, boolean z, boolean z2) {
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
            i2 = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static String[] h0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f9296a >= 24 ? i0(configuration) : new String[]{W(configuration.locale)};
    }

    @EnsuresNonNull({"#1"})
    public static <T> T i(T t) {
        return t;
    }

    public static String[] i0(Configuration configuration) {
        return U0(configuration.getLocales().toLanguageTags(), ",");
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] j(T[] tArr) {
        return tArr;
    }

    public static String j0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            z.e("Util", "Failed to read system property " + str, e2);
            return null;
        }
    }

    public static int k(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static byte[] k0(String str) {
        return str.getBytes(c.f.b.a.d.f15784c);
    }

    public static long l(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static int l0(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && c.f.b.a.b.a("rtsp", scheme)) {
            return 3;
        }
        String path = uri.getPath();
        if (path == null) {
            return 4;
        }
        return n0(path);
    }

    public static boolean m(p1... p1VarArr) {
        if (f9296a < 24) {
            return true;
        }
        for (p1 p1Var : p1VarArr) {
            p1.g gVar = p1Var.f9643d;
            if (gVar != null) {
                if (u0(gVar.f9685a)) {
                    return false;
                }
                for (int i2 = 0; i2 < p1Var.f9643d.f9691g.size(); i2++) {
                    if (u0(p1Var.f9643d.f9691g.get(i2).f9693a)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static int m0(Uri uri, String str) {
        if (TextUtils.isEmpty(str)) {
            return l0(uri);
        }
        return n0(InstructionFileId.DOT + str);
    }

    public static void n(c.f.a.b.i3.p pVar) {
        if (pVar != null) {
            try {
                pVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int n0(String str) {
        String strE = c.f.b.a.b.e(str);
        if (strE.endsWith(".mpd")) {
            return 0;
        }
        if (strE.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = f9305j.matcher(strE);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup == null) {
            return 1;
        }
        if (strGroup.contains("format=mpd-time-csf")) {
            return 0;
        }
        return strGroup.contains("format=m3u8-aapl") ? 2 : 1;
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int o0(Uri uri, String str) {
        if (str == null) {
            return l0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static int p(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static boolean p0(i0 i0Var, i0 i0Var2, Inflater inflater) {
        if (i0Var.a() <= 0) {
            return false;
        }
        if (i0Var2.b() < i0Var.a()) {
            i0Var2.c(i0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(i0Var.d(), i0Var.e(), i0Var.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(i0Var2.d(), iInflate, i0Var2.b() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (iInflate == i0Var2.b()) {
                        i0Var2.c(i0Var2.b() * 2);
                    }
                } else {
                    i0Var2.O(iInflate);
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static float q(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static boolean q0(int i2) {
        return i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static int r(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static boolean r0(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static long s(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean s0(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean t(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (b(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean t0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || TransferTable.COLUMN_FILE.equals(scheme);
    }

    public static int u(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = f9309n[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static boolean u0(Uri uri) {
        return "http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) g.e(uri.getHost()));
    }

    public static int v(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = f9310o[i4 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i4;
    }

    public static boolean v0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Handler w(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static /* synthetic */ Thread w0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Handler x() {
        return y(null);
    }

    public static int x0(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static Handler y(Handler.Callback callback) {
        return w((Looper) g.i(Looper.myLooper()), callback);
    }

    public static String y0(String str) {
        int i2 = 0;
        while (true) {
            String[] strArr = f9308m;
            if (i2 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i2])) {
                return strArr[i2 + 1] + str.substring(strArr[i2].length());
            }
            i2 += 2;
        }
    }

    public static Handler z() {
        return A(null);
    }

    public static boolean z0(Activity activity, Uri... uriArr) {
        if (f9296a < 23) {
            return false;
        }
        for (Uri uri : uriArr) {
            if (t0(uri)) {
                return O0(activity);
            }
        }
        return false;
    }
}
