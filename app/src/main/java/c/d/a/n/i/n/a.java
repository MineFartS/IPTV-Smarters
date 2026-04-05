package c.d.a.n.i.n;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5594a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e<C0103a, Bitmap> f5595b = new e<>();

    /* JADX INFO: renamed from: c.d.a.n.i.n.a$a, reason: collision with other inner class name */
    public static class C0103a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f5596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bitmap.Config f5599d;

        public C0103a(b bVar) {
            this.f5596a = bVar;
        }

        @Override // c.d.a.n.i.n.h
        public void a() {
            this.f5596a.c(this);
        }

        public void b(int i2, int i3, Bitmap.Config config) {
            this.f5597b = i2;
            this.f5598c = i3;
            this.f5599d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0103a)) {
                return false;
            }
            C0103a c0103a = (C0103a) obj;
            return this.f5597b == c0103a.f5597b && this.f5598c == c0103a.f5598c && this.f5599d == c0103a.f5599d;
        }

        public int hashCode() {
            int i2 = ((this.f5597b * 31) + this.f5598c) * 31;
            Bitmap.Config config = this.f5599d;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return a.g(this.f5597b, this.f5598c, this.f5599d);
        }
    }

    public static class b extends c.d.a.n.i.n.b<C0103a> {
        @Override // c.d.a.n.i.n.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C0103a a() {
            return new C0103a(this);
        }

        public C0103a e(int i2, int i3, Bitmap.Config config) {
            C0103a c0103aB = b();
            c0103aB.b(i2, i3, config);
            return c0103aB;
        }
    }

    public static String g(int i2, int i3, Bitmap.Config config) {
        return "[" + i2 + "x" + i3 + "], " + config;
    }

    public static String h(Bitmap bitmap) {
        return g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // c.d.a.n.i.n.g
    public void a(Bitmap bitmap) {
        this.f5595b.d(this.f5594a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // c.d.a.n.i.n.g
    public Bitmap b(int i2, int i3, Bitmap.Config config) {
        return this.f5595b.a(this.f5594a.e(i2, i3, config));
    }

    @Override // c.d.a.n.i.n.g
    public String c(int i2, int i3, Bitmap.Config config) {
        return g(i2, i3, config);
    }

    @Override // c.d.a.n.i.n.g
    public int d(Bitmap bitmap) {
        return c.d.a.t.h.e(bitmap);
    }

    @Override // c.d.a.n.i.n.g
    public String e(Bitmap bitmap) {
        return h(bitmap);
    }

    @Override // c.d.a.n.i.n.g
    public Bitmap removeLast() {
        return this.f5595b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f5595b;
    }
}
