package c.f.a.d.p0;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.d.p0.a f15212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.d.p0.a f15213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15218h;

    public static class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i2) {
            return new c[i2];
        }
    }

    public c() {
        this(0);
    }

    public c(int i2) {
        this(0, 0, 10, i2);
    }

    public c(int i2, int i3, int i4, int i5) {
        this.f15215e = i2;
        this.f15216f = i3;
        this.f15217g = i4;
        this.f15214d = i5;
        this.f15218h = d(i2);
        this.f15212b = new c.f.a.d.p0.a(59);
        this.f15213c = new c.f.a.d.p0.a(i5 == 1 ? 24 : 12);
    }

    public c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static String b(Resources resources, CharSequence charSequence) {
        return c(resources, charSequence, "%02d");
    }

    public static String c(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public static int d(int i2) {
        return i2 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15215e == cVar.f15215e && this.f15216f == cVar.f15216f && this.f15214d == cVar.f15214d && this.f15217g == cVar.f15217g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15214d), Integer.valueOf(this.f15215e), Integer.valueOf(this.f15216f), Integer.valueOf(this.f15217g)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f15215e);
        parcel.writeInt(this.f15216f);
        parcel.writeInt(this.f15217g);
        parcel.writeInt(this.f15214d);
    }
}
