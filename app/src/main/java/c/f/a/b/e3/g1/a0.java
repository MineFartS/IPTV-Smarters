package c.f.a.b.e3.g1;

import android.net.Uri;
import c.f.a.b.e3.g1.v;
import c.f.a.b.j3.x0;
import c.f.a.b.w1;
import c.f.b.b.t;
import c.f.b.b.w0;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7482a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f7483b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f7484c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f7485d = Pattern.compile("([\\w$-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f7486e = Pattern.compile("Digest realm=\"([\\w\\s@.]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"(\\w+)\"(?:,\\s?opaque=\"(\\w+)\")?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f7487f = Pattern.compile("Basic realm=\"([\\w\\s@.]+)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f7488g = new String(new byte[]{10});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f7489h = new String(new byte[]{DateTimeFieldType.HALFDAY_OF_DAY, 10});

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7491b;

        public a(String str, String str2) {
            this.f7490a = str;
            this.f7491b = str2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7493b;

        public b(String str, long j2) {
            this.f7492a = str;
            this.f7493b = j2;
        }
    }

    public static byte[] a(List<String> list) {
        return c.f.b.a.g.f(f7489h).c(list).getBytes(y.f7726b);
    }

    public static byte[] b(String str) {
        return str.getBytes(y.f7726b);
    }

    public static boolean c(String str) {
        return f7482a.matcher(str).matches() || f7483b.matcher(str).matches();
    }

    public static long d(String str) {
        try {
            Matcher matcher = f7484c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) c.f.a.b.j3.g.e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e2) {
            throw w1.c(str, e2);
        }
    }

    public static int e(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            throw w1.c(str, e2);
        }
    }

    public static int f(String str) {
        str.hashCode();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static c.f.b.b.t<Integer> g(String str) {
        if (str == null) {
            return c.f.b.b.t.J();
        }
        t.a aVar = new t.a();
        for (String str2 : x0.U0(str, ",\\s?")) {
            aVar.d(Integer.valueOf(f(str2)));
        }
        return aVar.e();
    }

    public static e0 h(List<String> list) {
        Matcher matcher = f7483b.matcher(list.get(0));
        c.f.a.b.j3.g.a(matcher.matches());
        int i2 = Integer.parseInt((String) c.f.a.b.j3.g.e(matcher.group(1)));
        int iIndexOf = list.indexOf(BuildConfig.FLAVOR);
        c.f.a.b.j3.g.a(iIndexOf > 0);
        return new e0(i2, new v.b().c(list.subList(1, iIndexOf)).e(), c.f.b.a.g.f(f7489h).c(list.subList(iIndexOf + 1, list.size())));
    }

    public static b i(String str) throws w1 {
        Matcher matcher = f7485d.matcher(str);
        if (!matcher.matches()) {
            throw w1.c(str, null);
        }
        String str2 = (String) c.f.a.b.j3.g.e(matcher.group(1));
        long j2 = 60000;
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j2 = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e2) {
                throw w1.c(str, e2);
            }
        }
        return new b(str2, j2);
    }

    public static a j(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] strArrV0 = x0.V0(userInfo, ":");
        return new a(strArrV0[0], strArrV0[1]);
    }

    public static s k(String str) throws w1 {
        Matcher matcher = f7486e.matcher(str);
        if (matcher.find()) {
            return new s(2, (String) c.f.a.b.j3.g.e(matcher.group(1)), (String) c.f.a.b.j3.g.e(matcher.group(3)), c.f.b.a.n.c(matcher.group(4)));
        }
        Matcher matcher2 = f7487f.matcher(str);
        if (matcher2.matches()) {
            return new s(1, (String) c.f.a.b.j3.g.e(matcher2.group(1)), BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        }
        throw w1.c("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri l(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) c.f.a.b.j3.g.e(uri.getAuthority());
        c.f.a.b.j3.g.a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(x0.U0(str, "@")[1]).build();
    }

    public static c.f.b.b.t<String> m(d0 d0Var) {
        t.a aVar = new t.a();
        aVar.d(x0.D("%s %s %s", o(d0Var.f7506b), d0Var.f7505a, "RTSP/1.0"));
        c.f.b.b.u<String, String> uVarB = d0Var.f7507c.b();
        w0<String> it = uVarB.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            c.f.b.b.t<String> tVar = uVarB.get(next);
            for (int i2 = 0; i2 < tVar.size(); i2++) {
                aVar.d(x0.D("%s: %s", next, tVar.get(i2)));
            }
        }
        aVar.d(BuildConfig.FLAVOR);
        aVar.d(d0Var.f7508d);
        return aVar.e();
    }

    public static String[] n(String str) {
        String str2 = f7489h;
        if (!str.contains(str2)) {
            str2 = f7488g;
        }
        return x0.U0(str, str2);
    }

    public static String o(int i2) {
        switch (i2) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
