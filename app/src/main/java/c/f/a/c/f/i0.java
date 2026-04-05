package c.f.a.c.f;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f12333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12334f;

    public i0(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f12330b = str;
        this.f12331c = z;
        this.f12332d = z2;
        this.f12333e = (Context) c.f.a.c.g.b.I2(a.AbstractBinderC0161a.c1(iBinder));
        this.f12334f = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, c.f.a.c.g.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 1, this.f12330b, false);
        c.f.a.c.f.q.w.c.c(parcel, 2, this.f12331c);
        c.f.a.c.f.q.w.c.c(parcel, 3, this.f12332d);
        c.f.a.c.f.q.w.c.k(parcel, 4, c.f.a.c.g.b.K2(this.f12333e), false);
        c.f.a.c.f.q.w.c.c(parcel, 5, this.f12334f);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
