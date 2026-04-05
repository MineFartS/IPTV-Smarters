package c.f.a.d.x;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Comparable<l>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f15321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f15327h;

    public static class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return l.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i2) {
            return new l[i2];
        }
    }

    public l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = s.d(calendar);
        this.f15321b = calendarD;
        this.f15322c = calendarD.get(2);
        this.f15323d = calendarD.get(1);
        this.f15324e = calendarD.getMaximum(7);
        this.f15325f = calendarD.getActualMaximum(5);
        this.f15326g = calendarD.getTimeInMillis();
    }

    public static l c(int i2, int i3) {
        Calendar calendarK = s.k();
        calendarK.set(1, i2);
        calendarK.set(2, i3);
        return new l(calendarK);
    }

    public static l d(long j2) {
        Calendar calendarK = s.k();
        calendarK.setTimeInMillis(j2);
        return new l(calendarK);
    }

    public static l o() {
        return new l(s.i());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        return this.f15321b.compareTo(lVar.f15321b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f15322c == lVar.f15322c && this.f15323d == lVar.f15323d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15322c), Integer.valueOf(this.f15323d)});
    }

    public int p() {
        int firstDayOfWeek = this.f15321b.get(7) - this.f15321b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f15324e : firstDayOfWeek;
    }

    public long q(int i2) {
        Calendar calendarD = s.d(this.f15321b);
        calendarD.set(5, i2);
        return calendarD.getTimeInMillis();
    }

    public int r(long j2) {
        Calendar calendarD = s.d(this.f15321b);
        calendarD.setTimeInMillis(j2);
        return calendarD.get(5);
    }

    public String t(Context context) {
        if (this.f15327h == null) {
            this.f15327h = e.c(context, this.f15321b.getTimeInMillis());
        }
        return this.f15327h;
    }

    public long u() {
        return this.f15321b.getTimeInMillis();
    }

    public l w(int i2) {
        Calendar calendarD = s.d(this.f15321b);
        calendarD.add(2, i2);
        return new l(calendarD);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f15323d);
        parcel.writeInt(this.f15322c);
    }

    public int y(l lVar) {
        if (this.f15321b instanceof GregorianCalendar) {
            return ((lVar.f15323d - this.f15323d) * 12) + (lVar.f15322c - this.f15322c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
