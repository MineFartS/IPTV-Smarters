package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class g extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<g> CREATOR = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11618c;

    public g(String str, String str2) {
        this.f11617b = str;
        this.f11618c = str2;
    }

    public String I() {
        return this.f11617b;
    }

    public String J() {
        return this.f11618c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c.f.a.c.f.q.n.a(this.f11617b, gVar.f11617b) && c.f.a.c.f.q.n.a(this.f11618c, gVar.f11618c);
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(this.f11617b, this.f11618c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 1, I(), false);
        c.f.a.c.f.q.w.c.s(parcel, 2, J(), false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
