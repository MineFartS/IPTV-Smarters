package c.f.a.c.d;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f11637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f11638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JSONObject f11639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f11641g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11642a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f11643b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f11644c = 1.0d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long[] f11645d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public JSONObject f11646e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f11647f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f11648g = null;

        public j a() {
            return new j(this.f11642a, this.f11643b, this.f11644c, this.f11645d, this.f11646e, this.f11647f, this.f11648g);
        }

        public a b(boolean z) {
            this.f11642a = z;
            return this;
        }

        public a c(long j2) {
            this.f11643b = j2;
            return this;
        }
    }

    public j(boolean z, long j2, double d2, long[] jArr, JSONObject jSONObject, String str, String str2) {
        this.f11635a = z;
        this.f11636b = j2;
        this.f11637c = d2;
        this.f11638d = jArr;
        this.f11639e = jSONObject;
        this.f11640f = str;
        this.f11641g = str2;
    }

    public long[] a() {
        return this.f11638d;
    }

    public boolean b() {
        return this.f11635a;
    }

    public String c() {
        return this.f11640f;
    }

    public String d() {
        return this.f11641g;
    }

    public JSONObject e() {
        return this.f11639e;
    }

    public long f() {
        return this.f11636b;
    }

    public double g() {
        return this.f11637c;
    }
}
