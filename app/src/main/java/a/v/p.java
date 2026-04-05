package a.v;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3604g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3605a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3607c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3606b = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3608d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3609e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3610f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3611g = -1;

        public p a() {
            return new p(this.f3605a, this.f3606b, this.f3607c, this.f3608d, this.f3609e, this.f3610f, this.f3611g);
        }

        public a b(int i2) {
            this.f3608d = i2;
            return this;
        }

        public a c(int i2) {
            this.f3609e = i2;
            return this;
        }

        public a d(boolean z) {
            this.f3605a = z;
            return this;
        }

        public a e(int i2) {
            this.f3610f = i2;
            return this;
        }

        public a f(int i2) {
            this.f3611g = i2;
            return this;
        }

        public a g(int i2, boolean z) {
            this.f3606b = i2;
            this.f3607c = z;
            return this;
        }
    }

    public p(boolean z, int i2, boolean z2, int i3, int i4, int i5, int i6) {
        this.f3598a = z;
        this.f3599b = i2;
        this.f3600c = z2;
        this.f3601d = i3;
        this.f3602e = i4;
        this.f3603f = i5;
        this.f3604g = i6;
    }

    public int a() {
        return this.f3601d;
    }

    public int b() {
        return this.f3602e;
    }

    public int c() {
        return this.f3603f;
    }

    public int d() {
        return this.f3604g;
    }

    public int e() {
        return this.f3599b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f3598a == pVar.f3598a && this.f3599b == pVar.f3599b && this.f3600c == pVar.f3600c && this.f3601d == pVar.f3601d && this.f3602e == pVar.f3602e && this.f3603f == pVar.f3603f && this.f3604g == pVar.f3604g;
    }

    public boolean f() {
        return this.f3600c;
    }

    public boolean g() {
        return this.f3598a;
    }

    public int hashCode() {
        return ((((((((((((g() ? 1 : 0) * 31) + e()) * 31) + (f() ? 1 : 0)) * 31) + a()) * 31) + b()) * 31) + c()) * 31) + d();
    }
}
