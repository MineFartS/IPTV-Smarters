package c.f.a.b.j3;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f9322a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f9323b = true;

    @Pure
    public static String a(String str, Throwable th) {
        String strF = f(th);
        if (TextUtils.isEmpty(strF)) {
            return str;
        }
        return str + "\n  " + strF.replace("\n", "\n  ") + '\n';
    }

    @Pure
    public static void b(String str, String str2) {
        if (f9322a == 0) {
            Log.d(str, str2);
        }
    }

    @Pure
    public static void c(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    @Pure
    public static void d(String str, String str2) {
        if (f9322a <= 3) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void e(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    @Pure
    public static String f(Throwable th) {
        if (th == null) {
            return null;
        }
        return h(th) ? "UnknownHostException (no network)" : !f9323b ? th.getMessage() : Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    @Pure
    public static void g(String str, String str2) {
        if (f9322a <= 1) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static boolean h(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    @Pure
    public static void i(String str, String str2) {
        if (f9322a <= 2) {
            Log.w(str, str2);
        }
    }

    @Pure
    public static void j(String str, String str2, Throwable th) {
        i(str, a(str2, th));
    }
}
