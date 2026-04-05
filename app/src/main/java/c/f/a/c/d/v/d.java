package c.f.a.c.d.v;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.c.f.q.w.c;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<d> CREATOR = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12133b;

    public d() {
        this(null);
    }

    public d(String str) {
        this.f12133b = str;
    }

    public final String I() {
        return this.f12133b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return a.f(this.f12133b, ((d) obj).f12133b);
        }
        return false;
    }

    public final int hashCode() {
        return c.f.a.c.f.q.n.b(this.f12133b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.s(parcel, 2, this.f12133b, false);
        c.b(parcel, iA);
    }
}
