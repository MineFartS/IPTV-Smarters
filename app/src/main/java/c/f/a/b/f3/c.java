package c.f.a.b.f3;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import c.f.a.b.v0;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.renderer.DefaultRenderer;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f8063a = new b().o(BuildConfig.FLAVOR).a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0<c> f8064b = new v0() { // from class: c.f.a.b.f3.a
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f8065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f8066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Layout.Alignment f8067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bitmap f8068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f8069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f8072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f8074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f8075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f8076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8077o;
    public final int p;
    public final float q;
    public final int r;
    public final float s;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f8078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f8079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Layout.Alignment f8080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Layout.Alignment f8081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8083f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8084g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f8085h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8086i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8087j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f8088k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f8089l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f8090m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f8091n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f8092o;
        public int p;
        public float q;

        public b() {
            this.f8078a = null;
            this.f8079b = null;
            this.f8080c = null;
            this.f8081d = null;
            this.f8082e = -3.4028235E38f;
            this.f8083f = Integer.MIN_VALUE;
            this.f8084g = Integer.MIN_VALUE;
            this.f8085h = -3.4028235E38f;
            this.f8086i = Integer.MIN_VALUE;
            this.f8087j = Integer.MIN_VALUE;
            this.f8088k = -3.4028235E38f;
            this.f8089l = -3.4028235E38f;
            this.f8090m = -3.4028235E38f;
            this.f8091n = false;
            this.f8092o = DefaultRenderer.BACKGROUND_COLOR;
            this.p = Integer.MIN_VALUE;
        }

        public b(c cVar) {
            this.f8078a = cVar.f8065c;
            this.f8079b = cVar.f8068f;
            this.f8080c = cVar.f8066d;
            this.f8081d = cVar.f8067e;
            this.f8082e = cVar.f8069g;
            this.f8083f = cVar.f8070h;
            this.f8084g = cVar.f8071i;
            this.f8085h = cVar.f8072j;
            this.f8086i = cVar.f8073k;
            this.f8087j = cVar.p;
            this.f8088k = cVar.q;
            this.f8089l = cVar.f8074l;
            this.f8090m = cVar.f8075m;
            this.f8091n = cVar.f8076n;
            this.f8092o = cVar.f8077o;
            this.p = cVar.r;
            this.q = cVar.s;
        }

        public c a() {
            return new c(this.f8078a, this.f8080c, this.f8081d, this.f8079b, this.f8082e, this.f8083f, this.f8084g, this.f8085h, this.f8086i, this.f8087j, this.f8088k, this.f8089l, this.f8090m, this.f8091n, this.f8092o, this.p, this.q);
        }

        public b b() {
            this.f8091n = false;
            return this;
        }

        @Pure
        public int c() {
            return this.f8084g;
        }

        @Pure
        public int d() {
            return this.f8086i;
        }

        @Pure
        public CharSequence e() {
            return this.f8078a;
        }

        public b f(Bitmap bitmap) {
            this.f8079b = bitmap;
            return this;
        }

        public b g(float f2) {
            this.f8090m = f2;
            return this;
        }

        public b h(float f2, int i2) {
            this.f8082e = f2;
            this.f8083f = i2;
            return this;
        }

        public b i(int i2) {
            this.f8084g = i2;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f8081d = alignment;
            return this;
        }

        public b k(float f2) {
            this.f8085h = f2;
            return this;
        }

        public b l(int i2) {
            this.f8086i = i2;
            return this;
        }

        public b m(float f2) {
            this.q = f2;
            return this;
        }

        public b n(float f2) {
            this.f8089l = f2;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f8078a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f8080c = alignment;
            return this;
        }

        public b q(float f2, int i2) {
            this.f8088k = f2;
            this.f8087j = i2;
            return this;
        }

        public b r(int i2) {
            this.p = i2;
            return this;
        }

        public b s(int i2) {
            this.f8092o = i2;
            this.f8091n = true;
            return this;
        }
    }

    public c(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7) {
        if (charSequence == null) {
            c.f.a.b.j3.g.e(bitmap);
        } else {
            c.f.a.b.j3.g.a(bitmap == null);
        }
        this.f8065c = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f8066d = alignment;
        this.f8067e = alignment2;
        this.f8068f = bitmap;
        this.f8069g = f2;
        this.f8070h = i2;
        this.f8071i = i3;
        this.f8072j = f3;
        this.f8073k = i4;
        this.f8074l = f5;
        this.f8075m = f6;
        this.f8076n = z;
        this.f8077o = i6;
        this.p = i5;
        this.q = f4;
        this.r = i7;
        this.s = f7;
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return TextUtils.equals(this.f8065c, cVar.f8065c) && this.f8066d == cVar.f8066d && this.f8067e == cVar.f8067e && ((bitmap = this.f8068f) != null ? !((bitmap2 = cVar.f8068f) == null || !bitmap.sameAs(bitmap2)) : cVar.f8068f == null) && this.f8069g == cVar.f8069g && this.f8070h == cVar.f8070h && this.f8071i == cVar.f8071i && this.f8072j == cVar.f8072j && this.f8073k == cVar.f8073k && this.f8074l == cVar.f8074l && this.f8075m == cVar.f8075m && this.f8076n == cVar.f8076n && this.f8077o == cVar.f8077o && this.p == cVar.p && this.q == cVar.q && this.r == cVar.r && this.s == cVar.s;
    }

    public int hashCode() {
        return c.f.b.a.h.b(this.f8065c, this.f8066d, this.f8067e, this.f8068f, Float.valueOf(this.f8069g), Integer.valueOf(this.f8070h), Integer.valueOf(this.f8071i), Float.valueOf(this.f8072j), Integer.valueOf(this.f8073k), Float.valueOf(this.f8074l), Float.valueOf(this.f8075m), Boolean.valueOf(this.f8076n), Integer.valueOf(this.f8077o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r), Float.valueOf(this.s));
    }
}
