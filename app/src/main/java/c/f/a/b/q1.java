package c.f.a.b;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f9729a = new b().F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0<q1> f9730b = new v0() { // from class: c.f.a.b.f0
    };
    public final CharSequence A;
    public final CharSequence B;
    public final CharSequence C;
    public final Integer D;
    public final Integer E;
    public final CharSequence F;
    public final CharSequence G;
    public final Bundle H;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f9731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f9732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f9733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f9734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f9735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f9736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f9737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f9738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f2 f9739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f2 f9740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f9741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f9742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Uri f9743o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final Boolean s;

    @Deprecated
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final Integer z;

    public static final class b {
        public Integer A;
        public Integer B;
        public CharSequence C;
        public CharSequence D;
        public Bundle E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f9744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f9745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f9746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f9747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f9748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f9749f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CharSequence f9750g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Uri f9751h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public f2 f9752i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public f2 f9753j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f9754k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f9755l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Uri f9756m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Integer f9757n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Integer f9758o;
        public Integer p;
        public Boolean q;
        public Integer r;
        public Integer s;
        public Integer t;
        public Integer u;
        public Integer v;
        public Integer w;
        public CharSequence x;
        public CharSequence y;
        public CharSequence z;

        public b() {
        }

        public b(q1 q1Var) {
            this.f9744a = q1Var.f9731c;
            this.f9745b = q1Var.f9732d;
            this.f9746c = q1Var.f9733e;
            this.f9747d = q1Var.f9734f;
            this.f9748e = q1Var.f9735g;
            this.f9749f = q1Var.f9736h;
            this.f9750g = q1Var.f9737i;
            this.f9751h = q1Var.f9738j;
            this.f9752i = q1Var.f9739k;
            this.f9753j = q1Var.f9740l;
            this.f9754k = q1Var.f9741m;
            this.f9755l = q1Var.f9742n;
            this.f9756m = q1Var.f9743o;
            this.f9757n = q1Var.p;
            this.f9758o = q1Var.q;
            this.p = q1Var.r;
            this.q = q1Var.s;
            this.r = q1Var.u;
            this.s = q1Var.v;
            this.t = q1Var.w;
            this.u = q1Var.x;
            this.v = q1Var.y;
            this.w = q1Var.z;
            this.x = q1Var.A;
            this.y = q1Var.B;
            this.z = q1Var.C;
            this.A = q1Var.D;
            this.B = q1Var.E;
            this.C = q1Var.F;
            this.D = q1Var.G;
            this.E = q1Var.H;
        }

        public q1 F() {
            return new q1(this);
        }

        public b G(byte[] bArr, int i2) {
            if (this.f9754k == null || c.f.a.b.j3.x0.b(Integer.valueOf(i2), 3) || !c.f.a.b.j3.x0.b(this.f9755l, 3)) {
                this.f9754k = (byte[]) bArr.clone();
                this.f9755l = Integer.valueOf(i2);
            }
            return this;
        }

        public b H(c.f.a.b.b3.a aVar) {
            for (int i2 = 0; i2 < aVar.e(); i2++) {
                aVar.d(i2).populateMediaMetadata(this);
            }
            return this;
        }

        public b I(List<c.f.a.b.b3.a> list) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                c.f.a.b.b3.a aVar = list.get(i2);
                for (int i3 = 0; i3 < aVar.e(); i3++) {
                    aVar.d(i3).populateMediaMetadata(this);
                }
            }
            return this;
        }

        public b J(CharSequence charSequence) {
            this.f9747d = charSequence;
            return this;
        }

        public b K(CharSequence charSequence) {
            this.f9746c = charSequence;
            return this;
        }

        public b L(CharSequence charSequence) {
            this.f9745b = charSequence;
            return this;
        }

        public b M(CharSequence charSequence) {
            this.y = charSequence;
            return this;
        }

        public b N(CharSequence charSequence) {
            this.z = charSequence;
            return this;
        }

        public b O(CharSequence charSequence) {
            this.f9750g = charSequence;
            return this;
        }

        public b P(Integer num) {
            this.t = num;
            return this;
        }

        public b Q(Integer num) {
            this.s = num;
            return this;
        }

        public b R(Integer num) {
            this.r = num;
            return this;
        }

        public b S(Integer num) {
            this.w = num;
            return this;
        }

        public b T(Integer num) {
            this.v = num;
            return this;
        }

        public b U(Integer num) {
            this.u = num;
            return this;
        }

        public b V(CharSequence charSequence) {
            this.f9744a = charSequence;
            return this;
        }

        public b W(Integer num) {
            this.f9758o = num;
            return this;
        }

        public b X(Integer num) {
            this.f9757n = num;
            return this;
        }

        public b Y(CharSequence charSequence) {
            this.x = charSequence;
            return this;
        }
    }

    public q1(b bVar) {
        this.f9731c = bVar.f9744a;
        this.f9732d = bVar.f9745b;
        this.f9733e = bVar.f9746c;
        this.f9734f = bVar.f9747d;
        this.f9735g = bVar.f9748e;
        this.f9736h = bVar.f9749f;
        this.f9737i = bVar.f9750g;
        this.f9738j = bVar.f9751h;
        this.f9739k = bVar.f9752i;
        this.f9740l = bVar.f9753j;
        this.f9741m = bVar.f9754k;
        this.f9742n = bVar.f9755l;
        this.f9743o = bVar.f9756m;
        this.p = bVar.f9757n;
        this.q = bVar.f9758o;
        this.r = bVar.p;
        this.s = bVar.q;
        this.t = bVar.r;
        this.u = bVar.r;
        this.v = bVar.s;
        this.w = bVar.t;
        this.x = bVar.u;
        this.y = bVar.v;
        this.z = bVar.w;
        this.A = bVar.x;
        this.B = bVar.y;
        this.C = bVar.z;
        this.D = bVar.A;
        this.E = bVar.B;
        this.F = bVar.C;
        this.G = bVar.D;
        this.H = bVar.E;
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q1.class != obj.getClass()) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return c.f.a.b.j3.x0.b(this.f9731c, q1Var.f9731c) && c.f.a.b.j3.x0.b(this.f9732d, q1Var.f9732d) && c.f.a.b.j3.x0.b(this.f9733e, q1Var.f9733e) && c.f.a.b.j3.x0.b(this.f9734f, q1Var.f9734f) && c.f.a.b.j3.x0.b(this.f9735g, q1Var.f9735g) && c.f.a.b.j3.x0.b(this.f9736h, q1Var.f9736h) && c.f.a.b.j3.x0.b(this.f9737i, q1Var.f9737i) && c.f.a.b.j3.x0.b(this.f9738j, q1Var.f9738j) && c.f.a.b.j3.x0.b(this.f9739k, q1Var.f9739k) && c.f.a.b.j3.x0.b(this.f9740l, q1Var.f9740l) && Arrays.equals(this.f9741m, q1Var.f9741m) && c.f.a.b.j3.x0.b(this.f9742n, q1Var.f9742n) && c.f.a.b.j3.x0.b(this.f9743o, q1Var.f9743o) && c.f.a.b.j3.x0.b(this.p, q1Var.p) && c.f.a.b.j3.x0.b(this.q, q1Var.q) && c.f.a.b.j3.x0.b(this.r, q1Var.r) && c.f.a.b.j3.x0.b(this.s, q1Var.s) && c.f.a.b.j3.x0.b(this.u, q1Var.u) && c.f.a.b.j3.x0.b(this.v, q1Var.v) && c.f.a.b.j3.x0.b(this.w, q1Var.w) && c.f.a.b.j3.x0.b(this.x, q1Var.x) && c.f.a.b.j3.x0.b(this.y, q1Var.y) && c.f.a.b.j3.x0.b(this.z, q1Var.z) && c.f.a.b.j3.x0.b(this.A, q1Var.A) && c.f.a.b.j3.x0.b(this.B, q1Var.B) && c.f.a.b.j3.x0.b(this.C, q1Var.C) && c.f.a.b.j3.x0.b(this.D, q1Var.D) && c.f.a.b.j3.x0.b(this.E, q1Var.E) && c.f.a.b.j3.x0.b(this.F, q1Var.F) && c.f.a.b.j3.x0.b(this.G, q1Var.G);
    }

    public int hashCode() {
        return c.f.b.a.h.b(this.f9731c, this.f9732d, this.f9733e, this.f9734f, this.f9735g, this.f9736h, this.f9737i, this.f9738j, this.f9739k, this.f9740l, Integer.valueOf(Arrays.hashCode(this.f9741m)), this.f9742n, this.f9743o, this.p, this.q, this.r, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
    }
}
