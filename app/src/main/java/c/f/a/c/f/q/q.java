package c.f.a.c.f.q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class q extends c.f.a.c.f.q.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<q> CREATOR = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12660f;

    public q(int i2, boolean z, boolean z2, int i3, int i4) {
        this.f12656b = i2;
        this.f12657c = z;
        this.f12658d = z2;
        this.f12659e = i3;
        this.f12660f = i4;
    }

    public int I() {
        return this.f12659e;
    }

    public int J() {
        return this.f12660f;
    }

    public boolean K() {
        return this.f12657c;
    }

    public boolean L() {
        return this.f12658d;
    }

    public int M() {
        return this.f12656b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, M());
        c.f.a.c.f.q.w.c.c(parcel, 2, K());
        c.f.a.c.f.q.w.c.c(parcel, 3, L());
        c.f.a.c.f.q.w.c.l(parcel, 4, I());
        c.f.a.c.f.q.w.c.l(parcel, 5, J());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
