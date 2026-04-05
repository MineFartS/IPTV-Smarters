package c.f.a.c.f.q;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.c.f.q.i;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f12623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.c.f.b f12624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12626f;

    public l0(int i2, IBinder iBinder, c.f.a.c.f.b bVar, boolean z, boolean z2) {
        this.f12622b = i2;
        this.f12623c = iBinder;
        this.f12624d = bVar;
        this.f12625e = z;
        this.f12626f = z2;
    }

    public final i I() {
        IBinder iBinder = this.f12623c;
        if (iBinder == null) {
            return null;
        }
        return i.a.c1(iBinder);
    }

    public final c.f.a.c.f.b J() {
        return this.f12624d;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f12624d.equals(l0Var.f12624d) && n.a(I(), l0Var.I());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, this.f12622b);
        c.f.a.c.f.q.w.c.k(parcel, 2, this.f12623c, false);
        c.f.a.c.f.q.w.c.r(parcel, 3, this.f12624d, i2, false);
        c.f.a.c.f.q.w.c.c(parcel, 4, this.f12625e);
        c.f.a.c.f.q.w.c.c(parcel, 5, this.f12626f);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
