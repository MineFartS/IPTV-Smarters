package c.f.a.b.i3;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8856a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8857b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j2, long j3) {
        if (j2 == 0 && j3 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j2);
        sb.append("-");
        if (j3 != -1) {
            sb.append((j2 + j3) - 1);
        }
        return sb.toString();
    }

    public static long b(String str, String str2) {
        long j2;
        if (TextUtils.isEmpty(str)) {
            j2 = -1;
        } else {
            try {
                j2 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                c.f.a.b.j3.z.d("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j2 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j2;
        }
        Matcher matcher = f8856a.matcher(str2);
        if (!matcher.matches()) {
            return j2;
        }
        try {
            long j3 = (Long.parseLong((String) c.f.a.b.j3.g.e(matcher.group(2))) - Long.parseLong((String) c.f.a.b.j3.g.e(matcher.group(1)))) + 1;
            if (j2 < 0) {
                return j3;
            }
            if (j2 == j3) {
                return j2;
            }
            c.f.a.b.j3.z.i("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j2, j3);
        } catch (NumberFormatException unused2) {
            c.f.a.b.j3.z.d("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j2;
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f8857b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) c.f.a.b.j3.g.e(matcher.group(1)));
        }
        return -1L;
    }
}
