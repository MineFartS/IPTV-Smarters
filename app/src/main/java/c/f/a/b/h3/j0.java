package c.f.a.b.h3;

import android.content.res.Resources;
import android.text.TextUtils;
import c.f.a.b.k1;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class j0 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f8703a;

    public j0(Resources resources) {
        this.f8703a = (Resources) c.f.a.b.j3.g.e(resources);
    }

    public static int i(k1 k1Var) {
        int iL = c.f.a.b.j3.d0.l(k1Var.f9338m);
        if (iL != -1) {
            return iL;
        }
        if (c.f.a.b.j3.d0.o(k1Var.f9335j) != null) {
            return 2;
        }
        if (c.f.a.b.j3.d0.c(k1Var.f9335j) != null) {
            return 1;
        }
        if (k1Var.r == -1 && k1Var.s == -1) {
            return (k1Var.z == -1 && k1Var.A == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // c.f.a.b.h3.f1
    public String a(k1 k1Var) {
        int i2 = i(k1Var);
        String strJ = i2 == 2 ? j(h(k1Var), g(k1Var), c(k1Var)) : i2 == 1 ? j(e(k1Var), b(k1Var), c(k1Var)) : e(k1Var);
        return strJ.length() == 0 ? this.f8703a.getString(w0.H) : strJ;
    }

    public final String b(k1 k1Var) {
        Resources resources;
        int i2;
        int i3 = k1Var.z;
        if (i3 == -1 || i3 < 1) {
            return BuildConfig.FLAVOR;
        }
        if (i3 == 1) {
            resources = this.f8703a;
            i2 = w0.u;
        } else if (i3 == 2) {
            resources = this.f8703a;
            i2 = w0.D;
        } else if (i3 == 6 || i3 == 7) {
            resources = this.f8703a;
            i2 = w0.F;
        } else if (i3 != 8) {
            resources = this.f8703a;
            i2 = w0.E;
        } else {
            resources = this.f8703a;
            i2 = w0.G;
        }
        return resources.getString(i2);
    }

    public final String c(k1 k1Var) {
        int i2 = k1Var.f9334i;
        return i2 == -1 ? BuildConfig.FLAVOR : this.f8703a.getString(w0.t, Float.valueOf(i2 / 1000000.0f));
    }

    public final String d(k1 k1Var) {
        return TextUtils.isEmpty(k1Var.f9328c) ? BuildConfig.FLAVOR : k1Var.f9328c;
    }

    public final String e(k1 k1Var) {
        String strJ = j(f(k1Var), h(k1Var));
        return TextUtils.isEmpty(strJ) ? d(k1Var) : strJ;
    }

    public final String f(k1 k1Var) {
        String str = k1Var.f9329d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return BuildConfig.FLAVOR;
        }
        return (c.f.a.b.j3.x0.f9296a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    public final String g(k1 k1Var) {
        int i2 = k1Var.r;
        int i3 = k1Var.s;
        return (i2 == -1 || i3 == -1) ? BuildConfig.FLAVOR : this.f8703a.getString(w0.v, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public final String h(k1 k1Var) {
        String string = (k1Var.f9331f & 2) != 0 ? this.f8703a.getString(w0.w) : BuildConfig.FLAVOR;
        if ((k1Var.f9331f & 4) != 0) {
            string = j(string, this.f8703a.getString(w0.z));
        }
        if ((k1Var.f9331f & 8) != 0) {
            string = j(string, this.f8703a.getString(w0.y));
        }
        return (k1Var.f9331f & 1088) != 0 ? j(string, this.f8703a.getString(w0.x)) : string;
    }

    public final String j(String... strArr) {
        String string = BuildConfig.FLAVOR;
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f8703a.getString(w0.s, string, str);
            }
        }
        return string;
    }
}
