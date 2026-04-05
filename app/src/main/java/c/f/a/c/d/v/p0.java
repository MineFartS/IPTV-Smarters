package c.f.a.c.d.v;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.c.f.q.w.c;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f12195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.f.a.c.d.d f12198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f.a.c.d.z f12200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f12201h;

    public p0() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }

    public p0(double d2, boolean z, int i2, c.f.a.c.d.d dVar, int i3, c.f.a.c.d.z zVar, double d3) {
        this.f12195b = d2;
        this.f12196c = z;
        this.f12197d = i2;
        this.f12198e = dVar;
        this.f12199f = i3;
        this.f12200g = zVar;
        this.f12201h = d3;
    }

    public final int I() {
        return this.f12197d;
    }

    public final int J() {
        return this.f12199f;
    }

    public final double K() {
        return this.f12195b;
    }

    public final boolean L() {
        return this.f12196c;
    }

    public final c.f.a.c.d.z M() {
        return this.f12200g;
    }

    public final double N() {
        return this.f12201h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (this.f12195b == p0Var.f12195b && this.f12196c == p0Var.f12196c && this.f12197d == p0Var.f12197d && a.f(this.f12198e, p0Var.f12198e) && this.f12199f == p0Var.f12199f) {
            c.f.a.c.d.z zVar = this.f12200g;
            if (a.f(zVar, zVar) && this.f12201h == p0Var.f12201h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c.f.a.c.f.q.n.b(Double.valueOf(this.f12195b), Boolean.valueOf(this.f12196c), Integer.valueOf(this.f12197d), this.f12198e, Integer.valueOf(this.f12199f), this.f12200g, Double.valueOf(this.f12201h));
    }

    public final c.f.a.c.d.d t() {
        return this.f12198e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.g(parcel, 2, this.f12195b);
        c.c(parcel, 3, this.f12196c);
        c.l(parcel, 4, this.f12197d);
        c.r(parcel, 5, this.f12198e, i2, false);
        c.l(parcel, 6, this.f12199f);
        c.r(parcel, 7, this.f12200g, i2, false);
        c.g(parcel, 8, this.f12201h);
        c.b(parcel, iA);
    }
}
