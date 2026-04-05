package c.f.a.c.f;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.q.n1;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12315a = j.f12335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f12316b = new f();

    @RecentlyNonNull
    public static f f() {
        return f12316b;
    }

    public int a(@RecentlyNonNull Context context) {
        return j.b(context);
    }

    @RecentlyNullable
    public Intent b(Context context, int i2, String str) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            return n1.a("com.google.android.gms");
        }
        if (context != null && c.f.a.c.f.t.h.f(context)) {
            return n1.c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f12315a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(c.f.a.c.f.u.c.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return n1.b("com.google.android.gms", sb.toString());
    }

    @RecentlyNullable
    public PendingIntent c(@RecentlyNonNull Context context, int i2, int i3) {
        return d(context, i2, i3, null);
    }

    @RecentlyNullable
    public PendingIntent d(@RecentlyNonNull Context context, int i2, int i3, String str) {
        Intent intentB = b(context, i2, str);
        if (intentB == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, intentB, 134217728);
    }

    public String e(int i2) {
        return j.c(i2);
    }

    public int g(@RecentlyNonNull Context context) {
        return h(context, f12315a);
    }

    public int h(@RecentlyNonNull Context context, int i2) {
        int iG = j.g(context, i2);
        if (j.h(context, iG)) {
            return 18;
        }
        return iG;
    }

    public boolean i(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return j.l(context, str);
    }

    public boolean j(int i2) {
        return j.j(i2);
    }

    public void k(@RecentlyNonNull Context context, int i2) throws g, h {
        j.a(context, i2);
    }
}
