package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<z> CREATOR = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f12228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f12229c;

    public z(x xVar, x xVar2) {
        this.f12228b = xVar;
        this.f12229c = xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return c.f.a.c.d.v.a.f(this.f12228b, zVar.f12228b) && c.f.a.c.d.v.a.f(this.f12229c, zVar.f12229c);
    }

    public final int hashCode() {
        return c.f.a.c.f.q.n.b(this.f12228b, this.f12229c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.r(parcel, 2, this.f12228b, i2, false);
        c.f.a.c.f.q.w.c.r(parcel, 3, this.f12229c, i2, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
