package c.k.b;

import android.graphics.Bitmap;
import android.net.Uri;
import c.k.b.t;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f18783a = TimeUnit.SECONDS.toNanos(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f18787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<e0> f18790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f18793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f18795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f18796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f18797o;
    public final float p;
    public final boolean q;
    public final Bitmap.Config r;
    public final t.f s;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f18798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f18803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f18804g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f18805h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f18806i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f18807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f18808k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f18809l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List<e0> f18810m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Bitmap.Config f18811n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public t.f f18812o;

        public b(Uri uri, int i2, Bitmap.Config config) {
            this.f18798a = uri;
            this.f18799b = i2;
            this.f18811n = config;
        }

        public w a() {
            boolean z = this.f18804g;
            if (z && this.f18803f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f18803f && this.f18801d == 0 && this.f18802e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z && this.f18801d == 0 && this.f18802e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f18812o == null) {
                this.f18812o = t.f.NORMAL;
            }
            return new w(this.f18798a, this.f18799b, this.f18800c, this.f18810m, this.f18801d, this.f18802e, this.f18803f, this.f18804g, this.f18805h, this.f18806i, this.f18807j, this.f18808k, this.f18809l, this.f18811n, this.f18812o);
        }

        public b b() {
            if (this.f18804g) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.f18803f = true;
            return this;
        }

        public b c() {
            if (this.f18803f) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.f18804g = true;
            return this;
        }

        public boolean d() {
            return (this.f18798a == null && this.f18799b == 0) ? false : true;
        }

        public boolean e() {
            return (this.f18801d == 0 && this.f18802e == 0) ? false : true;
        }

        public b f(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i3 == 0 && i2 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f18801d = i2;
            this.f18802e = i3;
            return this;
        }
    }

    public w(Uri uri, int i2, String str, List<e0> list, int i3, int i4, boolean z, boolean z2, boolean z3, float f2, float f3, float f4, boolean z4, Bitmap.Config config, t.f fVar) {
        this.f18787e = uri;
        this.f18788f = i2;
        this.f18789g = str;
        this.f18790h = list == null ? null : Collections.unmodifiableList(list);
        this.f18791i = i3;
        this.f18792j = i4;
        this.f18793k = z;
        this.f18794l = z2;
        this.f18795m = z3;
        this.f18796n = f2;
        this.f18797o = f3;
        this.p = f4;
        this.q = z4;
        this.r = config;
        this.s = fVar;
    }

    public String a() {
        Uri uri = this.f18787e;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f18788f);
    }

    public boolean b() {
        return this.f18790h != null;
    }

    public boolean c() {
        return (this.f18791i == 0 && this.f18792j == 0) ? false : true;
    }

    public String d() {
        StringBuilder sb;
        long jNanoTime = System.nanoTime() - this.f18785c;
        if (jNanoTime > f18783a) {
            sb = new StringBuilder();
            sb.append(g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(jNanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    public boolean e() {
        return c() || this.f18796n != 0.0f;
    }

    public boolean f() {
        return e() || b();
    }

    public String g() {
        return "[R" + this.f18784b + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i2 = this.f18788f;
        if (i2 > 0) {
            sb.append(i2);
        } else {
            sb.append(this.f18787e);
        }
        List<e0> list = this.f18790h;
        if (list != null && !list.isEmpty()) {
            for (e0 e0Var : this.f18790h) {
                sb.append(' ');
                sb.append(e0Var.key());
            }
        }
        if (this.f18789g != null) {
            sb.append(" stableKey(");
            sb.append(this.f18789g);
            sb.append(')');
        }
        if (this.f18791i > 0) {
            sb.append(" resize(");
            sb.append(this.f18791i);
            sb.append(',');
            sb.append(this.f18792j);
            sb.append(')');
        }
        if (this.f18793k) {
            sb.append(" centerCrop");
        }
        if (this.f18794l) {
            sb.append(" centerInside");
        }
        if (this.f18796n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f18796n);
            if (this.q) {
                sb.append(" @ ");
                sb.append(this.f18797o);
                sb.append(',');
                sb.append(this.p);
            }
            sb.append(')');
        }
        if (this.r != null) {
            sb.append(' ');
            sb.append(this.r);
        }
        sb.append('}');
        return sb.toString();
    }
}
