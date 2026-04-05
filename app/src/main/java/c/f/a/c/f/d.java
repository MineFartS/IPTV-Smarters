package c.f.a.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.n;

/* JADX INFO: loaded from: classes2.dex */
public class d extends c.f.a.c.f.q.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<d> CREATOR = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final int f12307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12308d;

    public d(@RecentlyNonNull String str, int i2, long j2) {
        this.f12306b = str;
        this.f12307c = i2;
        this.f12308d = j2;
    }

    public d(@RecentlyNonNull String str, long j2) {
        this.f12306b = str;
        this.f12308d = j2;
        this.f12307c = -1;
    }

    public long I() {
        long j2 = this.f12308d;
        return j2 == -1 ? this.f12307c : j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((getName() != null && getName().equals(dVar.getName())) || (getName() == null && dVar.getName() == null)) && I() == dVar.I()) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    public String getName() {
        return this.f12306b;
    }

    public final int hashCode() {
        return c.f.a.c.f.q.n.b(getName(), Long.valueOf(I()));
    }

    @RecentlyNonNull
    public final String toString() {
        n.a aVarC = c.f.a.c.f.q.n.c(this);
        aVarC.a("name", getName());
        aVarC.a("version", Long.valueOf(I()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 1, getName(), false);
        c.f.a.c.f.q.w.c.l(parcel, 2, this.f12307c);
        c.f.a.c.f.q.w.c.o(parcel, 3, I());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
