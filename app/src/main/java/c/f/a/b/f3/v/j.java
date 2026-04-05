package c.f.a.b.f3.v;

import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.w1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8384a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(i0 i0Var) {
        String strP;
        while (true) {
            String strP2 = i0Var.p();
            if (strP2 == null) {
                return null;
            }
            if (f8384a.matcher(strP2).matches()) {
                do {
                    strP = i0Var.p();
                    if (strP != null) {
                    }
                } while (!strP.isEmpty());
            } else {
                Matcher matcher = h.f8359a.matcher(strP2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(i0 i0Var) {
        String strP = i0Var.p();
        return strP != null && strP.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] strArrV0 = x0.V0(str, "\\.");
        long j2 = 0;
        for (String str2 : x0.U0(strArrV0[0], ":")) {
            j2 = (j2 * 60) + Long.parseLong(str2);
        }
        long j3 = j2 * 1000;
        if (strArrV0.length == 2) {
            j3 += Long.parseLong(strArrV0[1]);
        }
        return j3 * 1000;
    }

    public static void e(i0 i0Var) throws w1 {
        int iE = i0Var.e();
        if (b(i0Var)) {
            return;
        }
        i0Var.P(iE);
        throw w1.a("Expected WEBVTT. Got " + i0Var.p(), null);
    }
}
