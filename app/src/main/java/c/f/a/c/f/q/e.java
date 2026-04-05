package c.f.a.c.f.q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes2.dex */
public class e extends c.f.a.c.f.q.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<e> CREATOR = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f12577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f12580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f12582g;

    public e(@RecentlyNonNull q qVar, boolean z, boolean z2, int[] iArr, int i2, int[] iArr2) {
        this.f12577b = qVar;
        this.f12578c = z;
        this.f12579d = z2;
        this.f12580e = iArr;
        this.f12581f = i2;
        this.f12582g = iArr2;
    }

    public int I() {
        return this.f12581f;
    }

    @RecentlyNullable
    public int[] J() {
        return this.f12580e;
    }

    @RecentlyNullable
    public int[] K() {
        return this.f12582g;
    }

    public boolean L() {
        return this.f12578c;
    }

    public boolean M() {
        return this.f12579d;
    }

    @RecentlyNonNull
    public q N() {
        return this.f12577b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.r(parcel, 1, N(), i2, false);
        c.f.a.c.f.q.w.c.c(parcel, 2, L());
        c.f.a.c.f.q.w.c.c(parcel, 3, M());
        c.f.a.c.f.q.w.c.m(parcel, 4, J(), false);
        c.f.a.c.f.q.w.c.l(parcel, 5, I());
        c.f.a.c.f.q.w.c.m(parcel, 6, K(), false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
