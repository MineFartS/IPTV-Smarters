package c.f.a.d.x;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.d.x.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15279b;

    public static class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    public f(long j2) {
        this.f15279b = j2;
    }

    public /* synthetic */ f(long j2, a aVar) {
        this(j2);
    }

    public static f b(long j2) {
        return new f(j2);
    }

    @Override // c.f.a.d.x.a.c
    public boolean a(long j2) {
        return j2 >= this.f15279b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f15279b == ((f) obj).f15279b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15279b)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f15279b);
    }
}
