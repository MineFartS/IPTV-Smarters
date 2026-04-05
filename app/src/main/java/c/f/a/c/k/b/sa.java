package c.f.a.c.k.b;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f14306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f14307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f14308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f14309f;

    public sa(String str, int i2) {
        this.f14304a = str;
        this.f14305b = i2;
    }

    public static Boolean d(String str, c.f.a.c.j.h.x0 x0Var, boolean z, String str2, List<String> list, String str3, y3 y3Var) {
        boolean zStartsWith;
        if (x0Var == c.f.a.c.j.h.x0.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && x0Var != c.f.a.c.j.h.x0.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        c.f.a.c.j.h.q0 q0Var = c.f.a.c.j.h.q0.UNKNOWN_COMPARISON_TYPE;
        switch (x0Var.ordinal()) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (y3Var != null) {
                        y3Var.r().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                zStartsWith = str.startsWith(str2);
                break;
            case 3:
                zStartsWith = str.endsWith(str2);
                break;
            case 4:
                zStartsWith = str.contains(str2);
                break;
            case 5:
                zStartsWith = str.equals(str2);
                break;
            case 6:
                zStartsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(zStartsWith);
    }

    public static Boolean e(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public static Boolean f(String str, c.f.a.c.j.h.y0 y0Var, y3 y3Var) {
        List<String> list;
        c.f.a.c.f.q.o.i(y0Var);
        if (str == null || !y0Var.w() || y0Var.x() == c.f.a.c.j.h.x0.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        c.f.a.c.j.h.x0 x0VarX = y0Var.x();
        c.f.a.c.j.h.x0 x0Var = c.f.a.c.j.h.x0.IN_LIST;
        if (x0VarX == x0Var) {
            if (y0Var.D() == 0) {
                return null;
            }
        } else if (!y0Var.y()) {
            return null;
        }
        c.f.a.c.j.h.x0 x0VarX2 = y0Var.x();
        boolean zB = y0Var.B();
        String strZ = (zB || x0VarX2 == c.f.a.c.j.h.x0.REGEXP || x0VarX2 == x0Var) ? y0Var.z() : y0Var.z().toUpperCase(Locale.ENGLISH);
        if (y0Var.D() == 0) {
            list = null;
        } else {
            List<String> listC = y0Var.C();
            if (!zB) {
                ArrayList arrayList = new ArrayList(listC.size());
                Iterator<String> it = listC.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listC = Collections.unmodifiableList(arrayList);
            }
            list = listC;
        }
        return d(str, x0VarX2, zB, strZ, list, x0VarX2 == c.f.a.c.j.h.x0.REGEXP ? strZ : null, y3Var);
    }

    public static Boolean g(long j2, c.f.a.c.j.h.r0 r0Var) {
        try {
            return j(new BigDecimal(j2), r0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(double d2, c.f.a.c.j.h.r0 r0Var) {
        try {
            return j(new BigDecimal(d2), r0Var, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean i(String str, c.f.a.c.j.h.r0 r0Var) {
        if (!z9.B(str)) {
            return null;
        }
        try {
            return j(new BigDecimal(str), r0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean j(java.math.BigDecimal r9, c.f.a.c.j.h.r0 r10, double r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.sa.j(java.math.BigDecimal, c.f.a.c.j.h.r0, double):java.lang.Boolean");
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
