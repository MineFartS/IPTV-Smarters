package c.f.a.b.f3.v;

import android.text.TextUtils;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8337a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8338b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f8339c = new i0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StringBuilder f8340d = new StringBuilder();

    public static boolean b(i0 i0Var) {
        int iE = i0Var.e();
        int iF = i0Var.f();
        byte[] bArrD = i0Var.d();
        if (iE + 2 > iF) {
            return false;
        }
        int i2 = iE + 1;
        if (bArrD[iE] != 47) {
            return false;
        }
        int i3 = i2 + 1;
        if (bArrD[i2] != 42) {
            return false;
        }
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= iF) {
                i0Var.Q(iF - i0Var.e());
                return true;
            }
            if (((char) bArrD[i3]) == '*' && ((char) bArrD[i4]) == '/') {
                i3 = i4 + 1;
                iF = i3;
            } else {
                i3 = i4;
            }
        }
    }

    public static boolean c(i0 i0Var) {
        char cK = k(i0Var, i0Var.e());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        i0Var.Q(1);
        return true;
    }

    public static void e(String str, f fVar) {
        int i2;
        Matcher matcher = f8338b.matcher(c.f.b.a.b.e(str));
        if (!matcher.matches()) {
            z.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        i2 = 2;
        String str2 = (String) c.f.a.b.j3.g.e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                i2 = 3;
            case "em":
                fVar.t(i2);
                fVar.s(Float.parseFloat((String) c.f.a.b.j3.g.e(matcher.group(1))));
                return;
            case "px":
                fVar.t(1);
                fVar.s(Float.parseFloat((String) c.f.a.b.j3.g.e(matcher.group(1))));
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public static String f(i0 i0Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iE = i0Var.e();
        int iF = i0Var.f();
        while (iE < iF && !z) {
            char c2 = (char) i0Var.d()[iE];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                iE++;
                sb.append(c2);
            }
        }
        i0Var.Q(iE - i0Var.e());
        return sb.toString();
    }

    public static String g(i0 i0Var, StringBuilder sb) {
        n(i0Var);
        if (i0Var.a() == 0) {
            return null;
        }
        String strF = f(i0Var, sb);
        if (!BuildConfig.FLAVOR.equals(strF)) {
            return strF;
        }
        return BuildConfig.FLAVOR + ((char) i0Var.D());
    }

    public static String h(i0 i0Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iE = i0Var.e();
            String strG = g(i0Var, sb);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                i0Var.P(iE);
                z = true;
            } else {
                sb2.append(strG);
            }
        }
        return sb2.toString();
    }

    public static String i(i0 i0Var, StringBuilder sb) {
        n(i0Var);
        if (i0Var.a() < 5 || !"::cue".equals(i0Var.A(5))) {
            return null;
        }
        int iE = i0Var.e();
        String strG = g(i0Var, sb);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            i0Var.P(iE);
            return BuildConfig.FLAVOR;
        }
        String strL = "(".equals(strG) ? l(i0Var) : null;
        if (")".equals(g(i0Var, sb))) {
            return strL;
        }
        return null;
    }

    public static void j(i0 i0Var, f fVar, StringBuilder sb) {
        n(i0Var);
        String strF = f(i0Var, sb);
        if (!BuildConfig.FLAVOR.equals(strF) && ":".equals(g(i0Var, sb))) {
            n(i0Var);
            String strH = h(i0Var, sb);
            if (strH == null || BuildConfig.FLAVOR.equals(strH)) {
                return;
            }
            int iE = i0Var.e();
            String strG = g(i0Var, sb);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    i0Var.P(iE);
                }
            }
            if ("color".equals(strF)) {
                fVar.q(c.f.a.b.j3.k.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                fVar.n(c.f.a.b.j3.k.b(strH));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    fVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        fVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z = false;
                }
                fVar.p(z);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    fVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                fVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    fVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    fVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, fVar);
            }
        }
    }

    public static char k(i0 i0Var, int i2) {
        return (char) i0Var.d()[i2];
    }

    public static String l(i0 i0Var) {
        int iE = i0Var.e();
        int iF = i0Var.f();
        boolean z = false;
        while (iE < iF && !z) {
            int i2 = iE + 1;
            z = ((char) i0Var.d()[iE]) == ')';
            iE = i2;
        }
        return i0Var.A((iE - 1) - i0Var.e()).trim();
    }

    public static void m(i0 i0Var) {
        while (!TextUtils.isEmpty(i0Var.p())) {
        }
    }

    public static void n(i0 i0Var) {
        while (true) {
            for (boolean z = true; i0Var.a() > 0 && z; z = false) {
                if (c(i0Var) || b(i0Var)) {
                    break;
                }
            }
            return;
        }
    }

    public final void a(f fVar, String str) {
        if (BuildConfig.FLAVOR.equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f8337a.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                fVar.z((String) c.f.a.b.j3.g.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrU0 = x0.U0(str, "\\.");
        String str2 = strArrU0[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            fVar.y(str2.substring(0, iIndexOf2));
            fVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            fVar.y(str2);
        }
        if (strArrU0.length > 1) {
            fVar.w((String[]) x0.H0(strArrU0, 1, strArrU0.length));
        }
    }

    public List<f> d(i0 i0Var) {
        this.f8340d.setLength(0);
        int iE = i0Var.e();
        m(i0Var);
        this.f8339c.N(i0Var.d(), i0Var.e());
        this.f8339c.P(iE);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f8339c, this.f8340d);
            if (strI == null || !"{".equals(g(this.f8339c, this.f8340d))) {
                return arrayList;
            }
            f fVar = new f();
            a(fVar, strI);
            String str = null;
            boolean z = false;
            while (!z) {
                int iE2 = this.f8339c.e();
                String strG = g(this.f8339c, this.f8340d);
                boolean z2 = strG == null || "}".equals(strG);
                if (!z2) {
                    this.f8339c.P(iE2);
                    j(this.f8339c, fVar, this.f8340d);
                }
                str = strG;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(fVar);
            }
        }
    }
}
