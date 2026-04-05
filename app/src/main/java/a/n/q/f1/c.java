package a.n.q.f1;

import android.content.res.Resources;
import android.os.Build;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f2806a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Locale f2807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f2808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f2809c;

        public a(Locale locale, Resources resources) {
            this.f2807a = locale;
            this.f2808b = DateFormatSymbols.getInstance(locale).getShortMonths();
            Calendar calendar = Calendar.getInstance(locale);
            this.f2809c = c.a(calendar.getMinimum(5), calendar.getMaximum(5), "%02d");
        }
    }

    static {
        f2806a = Build.VERSION.SDK_INT >= 18;
    }

    public static String[] a(int i2, int i3, String str) {
        String[] strArr = new String[(i3 - i2) + 1];
        for (int i4 = i2; i4 <= i3; i4++) {
            int i5 = i4 - i2;
            if (str != null) {
                strArr[i5] = String.format(str, Integer.valueOf(i4));
            } else {
                strArr[i5] = String.valueOf(i4);
            }
        }
        return strArr;
    }

    public static Calendar b(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public static a c(Locale locale, Resources resources) {
        return new a(locale, resources);
    }
}
