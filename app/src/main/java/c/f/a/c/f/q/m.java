package c.f.a.c.f.q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class m extends c.f.a.c.f.q.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<m> CREATOR = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12640i;

    public m(int i2, int i3, int i4, long j2, long j3, String str, String str2, int i5) {
        this.f12633b = i2;
        this.f12634c = i3;
        this.f12635d = i4;
        this.f12636e = j2;
        this.f12637f = j3;
        this.f12638g = str;
        this.f12639h = str2;
        this.f12640i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, this.f12633b);
        c.f.a.c.f.q.w.c.l(parcel, 2, this.f12634c);
        c.f.a.c.f.q.w.c.l(parcel, 3, this.f12635d);
        c.f.a.c.f.q.w.c.o(parcel, 4, this.f12636e);
        c.f.a.c.f.q.w.c.o(parcel, 5, this.f12637f);
        c.f.a.c.f.q.w.c.s(parcel, 6, this.f12638g, false);
        c.f.a.c.f.q.w.c.s(parcel, 7, this.f12639h, false);
        c.f.a.c.f.q.w.c.l(parcel, 8, this.f12640i);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
