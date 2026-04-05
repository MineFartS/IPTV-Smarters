package c.f.a.b.e3.g1;

import android.net.Uri;
import c.f.a.b.j3.x0;
import c.f.b.b.t;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.b.b.v<String, String> f7529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.b.b.t<j> f7530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f7535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f7537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f7538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f7539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f7540l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<String, String> f7541a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t.a<j> f7542b = new t.a<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7543c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f7544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f7545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f7546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Uri f7547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f7548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f7549i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f7550j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f7551k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f7552l;

        public b m(String str, String str2) {
            this.f7541a.put(str, str2);
            return this;
        }

        public b n(j jVar) {
            this.f7542b.d(jVar);
            return this;
        }

        public i0 o() {
            if (this.f7544d == null || this.f7545e == null || this.f7546f == null) {
                throw new IllegalStateException("One of more mandatory SDP fields are not set.");
            }
            return new i0(this);
        }

        public b p(int i2) {
            this.f7543c = i2;
            return this;
        }

        public b q(String str) {
            this.f7548h = str;
            return this;
        }

        public b r(String str) {
            this.f7551k = str;
            return this;
        }

        public b s(String str) {
            this.f7549i = str;
            return this;
        }

        public b t(String str) {
            this.f7545e = str;
            return this;
        }

        public b u(String str) {
            this.f7552l = str;
            return this;
        }

        public b v(String str) {
            this.f7550j = str;
            return this;
        }

        public b w(String str) {
            this.f7544d = str;
            return this;
        }

        public b x(String str) {
            this.f7546f = str;
            return this;
        }

        public b y(Uri uri) {
            this.f7547g = uri;
            return this;
        }
    }

    public i0(b bVar) {
        this.f7529a = c.f.b.b.v.d(bVar.f7541a);
        this.f7530b = bVar.f7542b.e();
        this.f7531c = (String) x0.i(bVar.f7544d);
        this.f7532d = (String) x0.i(bVar.f7545e);
        this.f7533e = (String) x0.i(bVar.f7546f);
        this.f7535g = bVar.f7547g;
        this.f7536h = bVar.f7548h;
        this.f7534f = bVar.f7543c;
        this.f7537i = bVar.f7549i;
        this.f7538j = bVar.f7551k;
        this.f7539k = bVar.f7552l;
        this.f7540l = bVar.f7550j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f7534f == i0Var.f7534f && this.f7529a.equals(i0Var.f7529a) && this.f7530b.equals(i0Var.f7530b) && this.f7532d.equals(i0Var.f7532d) && this.f7531c.equals(i0Var.f7531c) && this.f7533e.equals(i0Var.f7533e) && x0.b(this.f7540l, i0Var.f7540l) && x0.b(this.f7535g, i0Var.f7535g) && x0.b(this.f7538j, i0Var.f7538j) && x0.b(this.f7539k, i0Var.f7539k) && x0.b(this.f7536h, i0Var.f7536h) && x0.b(this.f7537i, i0Var.f7537i);
    }

    public int hashCode() {
        int iHashCode = (((((((((((217 + this.f7529a.hashCode()) * 31) + this.f7530b.hashCode()) * 31) + this.f7532d.hashCode()) * 31) + this.f7531c.hashCode()) * 31) + this.f7533e.hashCode()) * 31) + this.f7534f) * 31;
        String str = this.f7540l;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f7535g;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.f7538j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7539k;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f7536h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f7537i;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }
}
