package c.f.a.c.d;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f11733d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f11734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11735b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11736c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public JSONObject f11737d;

        public p a() {
            return new p(this.f11734a, this.f11735b, this.f11736c, this.f11737d);
        }

        public a b(JSONObject jSONObject) {
            this.f11737d = jSONObject;
            return this;
        }

        public a c(boolean z) {
            this.f11736c = z;
            return this;
        }

        public a d(long j2) {
            this.f11734a = j2;
            return this;
        }

        public a e(int i2) {
            this.f11735b = i2;
            return this;
        }
    }

    public p(long j2, int i2, boolean z, JSONObject jSONObject) {
        this.f11730a = j2;
        this.f11731b = i2;
        this.f11732c = z;
        this.f11733d = jSONObject;
    }

    public JSONObject a() {
        return this.f11733d;
    }

    public long b() {
        return this.f11730a;
    }

    public int c() {
        return this.f11731b;
    }

    public boolean d() {
        return this.f11732c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f11730a == pVar.f11730a && this.f11731b == pVar.f11731b && this.f11732c == pVar.f11732c && c.f.a.c.f.q.n.a(this.f11733d, pVar.f11733d);
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(Long.valueOf(this.f11730a), Integer.valueOf(this.f11731b), Boolean.valueOf(this.f11732c), this.f11733d);
    }
}
