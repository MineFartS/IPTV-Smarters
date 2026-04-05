package c.f.a.c.d.u.u;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class b extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<b> CREATOR = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11942d;

    public b(int i2, int i3, int i4) {
        this.f11940b = i2;
        this.f11941c = i3;
        this.f11942d = i4;
    }

    public int I() {
        return this.f11942d;
    }

    public int J() {
        return this.f11940b;
    }

    public int K() {
        return this.f11941c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 2, J());
        c.f.a.c.f.q.w.c.l(parcel, 3, K());
        c.f.a.c.f.q.w.c.l(parcel, 4, I());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
