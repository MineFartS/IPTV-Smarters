package c.f.a.d.x;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class e {
    public static String a(long j2) {
        return b(j2, Locale.getDefault());
    }

    public static String b(long j2, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.b(locale).format(new Date(j2)) : s.f(locale).format(new Date(j2));
    }

    public static String c(Context context, long j2) {
        return DateUtils.formatDateTime(context, j2 - ((long) TimeZone.getDefault().getOffset(j2)), 36);
    }

    public static String d(long j2) {
        return e(j2, Locale.getDefault());
    }

    public static String e(long j2, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.m(locale).format(new Date(j2)) : s.f(locale).format(new Date(j2));
    }
}
