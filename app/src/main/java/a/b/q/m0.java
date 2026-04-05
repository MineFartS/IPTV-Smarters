package a.b.q;

/* JADX INFO: loaded from: classes.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f689a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f690b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f691c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f692d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f693e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f694f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f695g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f696h = false;

    public int a() {
        return this.f695g ? this.f689a : this.f690b;
    }

    public int b() {
        return this.f689a;
    }

    public int c() {
        return this.f690b;
    }

    public int d() {
        return this.f695g ? this.f690b : this.f689a;
    }

    public void e(int i2, int i3) {
        this.f696h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f693e = i2;
            this.f689a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f694f = i3;
            this.f690b = i3;
        }
    }

    public void f(boolean z) {
        int i2;
        if (z == this.f695g) {
            return;
        }
        this.f695g = z;
        if (this.f696h) {
            if (z) {
                int i3 = this.f692d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f693e;
                }
                this.f689a = i3;
                i2 = this.f691c;
                if (i2 == Integer.MIN_VALUE) {
                }
            } else {
                int i4 = this.f691c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f693e;
                }
                this.f689a = i4;
                i2 = this.f692d;
                if (i2 == Integer.MIN_VALUE) {
                }
            }
            this.f690b = i2;
        }
        this.f689a = this.f693e;
        i2 = this.f694f;
        this.f690b = i2;
    }

    public void g(int i2, int i3) {
        this.f691c = i2;
        this.f692d = i3;
        this.f696h = true;
        if (this.f695g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f689a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f690b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f689a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f690b = i3;
        }
    }
}
