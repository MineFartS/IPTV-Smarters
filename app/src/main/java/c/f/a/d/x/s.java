package c.f.a.d.x;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicReference<r> f15345a = new AtomicReference<>();

    public static long a(long j2) {
        Calendar calendarK = k();
        calendarK.setTimeInMillis(j2);
        return d(calendarK).getTimeInMillis();
    }

    @TargetApi(24)
    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    @TargetApi(24)
    public static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        return instanceForSkeleton;
    }

    public static Calendar d(Calendar calendar) {
        Calendar calendarL = l(calendar);
        Calendar calendarK = k();
        calendarK.set(calendarL.get(1), calendarL.get(2), calendarL.get(5));
        return calendarK;
    }

    public static java.text.DateFormat e(int i2, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i2, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    public static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    public static r g() {
        r rVar = f15345a.get();
        return rVar == null ? r.c() : rVar;
    }

    public static TimeZone h() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar i() {
        Calendar calendarA = g().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(h());
        return calendarA;
    }

    @TargetApi(24)
    public static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar k() {
        return l(null);
    }

    public static Calendar l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    public static DateFormat m(Locale locale) {
        return c("yMMMEd", locale);
    }
}
