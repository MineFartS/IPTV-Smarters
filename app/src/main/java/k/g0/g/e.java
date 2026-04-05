package k.g0.g;

import java.util.List;
import java.util.regex.Pattern;
import k.c0;
import k.l;
import k.m;
import k.s;
import k.t;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f30639a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

    public static long a(s sVar) {
        return h(sVar.a("Content-Length"));
    }

    public static long b(c0 c0Var) {
        return a(c0Var.p());
    }

    public static boolean c(c0 c0Var) {
        if (c0Var.t().f().equals("HEAD")) {
            return false;
        }
        int iL = c0Var.l();
        return (((iL >= 100 && iL < 200) || iL == 204 || iL == 304) && b(c0Var) == -1 && !"chunked".equalsIgnoreCase(c0Var.n("Transfer-Encoding"))) ? false : true;
    }

    public static int d(String str, int i2) {
        try {
            long j2 = Long.parseLong(str);
            if (j2 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j2 < 0) {
                return 0;
            }
            return (int) j2;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static void e(m mVar, t tVar, s sVar) {
        if (mVar == m.f30932a) {
            return;
        }
        List<l> listF = l.f(tVar, sVar);
        if (listF.isEmpty()) {
            return;
        }
        mVar.a(tVar, listF);
    }

    public static int f(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }

    public static int g(String str, int i2) {
        char cCharAt;
        while (i2 < str.length() && ((cCharAt = str.charAt(i2)) == ' ' || cCharAt == '\t')) {
            i2++;
        }
        return i2;
    }

    public static long h(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
