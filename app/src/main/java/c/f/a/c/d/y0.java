package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<y0> CREATOR = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12227b;

    public y0() {
        this(0);
    }

    public y0(int i2) {
        this.f12227b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof y0) && this.f12227b == ((y0) obj).f12227b;
    }

    public final int hashCode() {
        return c.f.a.c.f.q.n.b(Integer.valueOf(this.f12227b));
    }

    public final String toString() {
        int i2 = this.f12227b;
        return String.format("joinOptions(connectionType=%s)", i2 != 0 ? i2 != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 2, this.f12227b);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
