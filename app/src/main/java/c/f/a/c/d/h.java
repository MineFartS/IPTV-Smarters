package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class h extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<h> CREATOR = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f11624e;

    public h() {
        this(false, c.f.a.c.d.v.a.e(Locale.getDefault()), false, null);
    }

    public h(boolean z, String str, boolean z2, g gVar) {
        this.f11621b = z;
        this.f11622c = str;
        this.f11623d = z2;
        this.f11624e = gVar;
    }

    public boolean I() {
        return this.f11623d;
    }

    public g J() {
        return this.f11624e;
    }

    public String K() {
        return this.f11622c;
    }

    public boolean L() {
        return this.f11621b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f11621b == hVar.f11621b && c.f.a.c.d.v.a.f(this.f11622c, hVar.f11622c) && this.f11623d == hVar.f11623d && c.f.a.c.d.v.a.f(this.f11624e, hVar.f11624e);
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(Boolean.valueOf(this.f11621b), this.f11622c, Boolean.valueOf(this.f11623d), this.f11624e);
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.f11621b), this.f11622c, Boolean.valueOf(this.f11623d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.c(parcel, 2, L());
        c.f.a.c.f.q.w.c.s(parcel, 3, K(), false);
        c.f.a.c.f.q.w.c.c(parcel, 4, I());
        c.f.a.c.f.q.w.c.r(parcel, 5, J(), i2, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
