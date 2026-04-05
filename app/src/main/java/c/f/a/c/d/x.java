package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<x> CREATOR = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12224d;

    public x(float f2, float f3, float f4) {
        this.f12222b = f2;
        this.f12223c = f3;
        this.f12224d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f12222b == xVar.f12222b && this.f12223c == xVar.f12223c && this.f12224d == xVar.f12224d;
    }

    public final int hashCode() {
        return c.f.a.c.f.q.n.b(Float.valueOf(this.f12222b), Float.valueOf(this.f12223c), Float.valueOf(this.f12224d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.i(parcel, 2, this.f12222b);
        c.f.a.c.f.q.w.c.i(parcel, 3, this.f12223c);
        c.f.a.c.f.q.w.c.i(parcel, 4, this.f12224d);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
