package c.f.a.b.f3.t;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8314e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f8320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f8321l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f8324o;
    public Layout.Alignment p;
    public b r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8315f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8316g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8317h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8318i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8319j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8322m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8323n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public g A(String str) {
        this.f8321l = str;
        return this;
    }

    public g B(boolean z) {
        this.f8318i = z ? 1 : 0;
        return this;
    }

    public g C(boolean z) {
        this.f8315f = z ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    public g E(int i2) {
        this.f8323n = i2;
        return this;
    }

    public g F(int i2) {
        this.f8322m = i2;
        return this;
    }

    public g G(float f2) {
        this.s = f2;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f8324o = alignment;
        return this;
    }

    public g I(boolean z) {
        this.q = z ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.r = bVar;
        return this;
    }

    public g K(boolean z) {
        this.f8316g = z ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f8314e) {
            return this.f8313d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f8312c) {
            return this.f8311b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f8310a;
    }

    public float e() {
        return this.f8320k;
    }

    public int f() {
        return this.f8319j;
    }

    public String g() {
        return this.f8321l;
    }

    public Layout.Alignment h() {
        return this.p;
    }

    public int i() {
        return this.f8323n;
    }

    public int j() {
        return this.f8322m;
    }

    public float k() {
        return this.s;
    }

    public int l() {
        int i2 = this.f8317h;
        if (i2 == -1 && this.f8318i == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f8318i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f8324o;
    }

    public boolean n() {
        return this.q == 1;
    }

    public b o() {
        return this.r;
    }

    public boolean p() {
        return this.f8314e;
    }

    public boolean q() {
        return this.f8312c;
    }

    public final g r(g gVar, boolean z) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8312c && gVar.f8312c) {
                w(gVar.f8311b);
            }
            if (this.f8317h == -1) {
                this.f8317h = gVar.f8317h;
            }
            if (this.f8318i == -1) {
                this.f8318i = gVar.f8318i;
            }
            if (this.f8310a == null && (str = gVar.f8310a) != null) {
                this.f8310a = str;
            }
            if (this.f8315f == -1) {
                this.f8315f = gVar.f8315f;
            }
            if (this.f8316g == -1) {
                this.f8316g = gVar.f8316g;
            }
            if (this.f8323n == -1) {
                this.f8323n = gVar.f8323n;
            }
            if (this.f8324o == null && (alignment2 = gVar.f8324o) != null) {
                this.f8324o = alignment2;
            }
            if (this.p == null && (alignment = gVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = gVar.q;
            }
            if (this.f8319j == -1) {
                this.f8319j = gVar.f8319j;
                this.f8320k = gVar.f8320k;
            }
            if (this.r == null) {
                this.r = gVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = gVar.s;
            }
            if (z && !this.f8314e && gVar.f8314e) {
                u(gVar.f8313d);
            }
            if (z && this.f8322m == -1 && (i2 = gVar.f8322m) != -1) {
                this.f8322m = i2;
            }
        }
        return this;
    }

    public boolean s() {
        return this.f8315f == 1;
    }

    public boolean t() {
        return this.f8316g == 1;
    }

    public g u(int i2) {
        this.f8313d = i2;
        this.f8314e = true;
        return this;
    }

    public g v(boolean z) {
        this.f8317h = z ? 1 : 0;
        return this;
    }

    public g w(int i2) {
        this.f8311b = i2;
        this.f8312c = true;
        return this;
    }

    public g x(String str) {
        this.f8310a = str;
        return this;
    }

    public g y(float f2) {
        this.f8320k = f2;
        return this;
    }

    public g z(int i2) {
        this.f8319j = i2;
        return this;
    }
}
