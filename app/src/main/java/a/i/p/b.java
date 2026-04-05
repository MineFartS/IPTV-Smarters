package a.i.p;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f1927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f1928b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            if (i2 < 24) {
                try {
                    f1928b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e2) {
                    throw new IllegalStateException(e2);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f1927a = cls.getMethod("getScript", String.class);
            f1928b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception e3) {
            f1927a = null;
            f1928b = null;
            Log.w("ICUCompat", e3);
        }
    }

    public static String a(Locale locale) {
        String string = locale.toString();
        try {
            Method method = f1928b;
            if (method != null) {
                return (String) method.invoke(null, string);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return string;
    }

    public static String b(String str) {
        try {
            Method method = f1927a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    public static String c(Locale locale) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i2 >= 21) {
            try {
                return ((Locale) f1928b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        }
        String strA = a(locale);
        if (strA != null) {
            return b(strA);
        }
        return null;
    }
}
