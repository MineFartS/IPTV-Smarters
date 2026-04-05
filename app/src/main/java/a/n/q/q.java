package a.n.q;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a[] f2895a = {new a()};

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2896a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2897b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2898c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2899d = 50.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2900e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2901f;

        public final int a() {
            int i2 = this.f2897b;
            return i2 != -1 ? i2 : this.f2896a;
        }

        public final int b() {
            return this.f2898c;
        }

        public final float c() {
            return this.f2899d;
        }

        public final int d() {
            return this.f2896a;
        }

        public boolean e() {
            return this.f2901f;
        }

        public final void f(int i2) {
            this.f2898c = i2;
        }

        public final void g(float f2) {
            if ((f2 < 0.0f || f2 > 100.0f) && f2 != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f2899d = f2;
        }

        public final void h(boolean z) {
            this.f2900e = z;
        }

        public final void i(int i2) {
            this.f2896a = i2;
        }
    }

    public a[] a() {
        return this.f2895a;
    }
}
