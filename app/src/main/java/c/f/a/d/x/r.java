package c.f.a.d.x;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f15342a = new r(null, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f15343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeZone f15344c;

    public r(Long l2, TimeZone timeZone) {
        this.f15343b = l2;
        this.f15344c = timeZone;
    }

    public static r c() {
        return f15342a;
    }

    public Calendar a() {
        return b(this.f15344c);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = this.f15343b;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        return calendar;
    }
}
