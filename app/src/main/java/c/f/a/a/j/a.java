package c.f.a.a.j;

import c.f.a.a.j.h;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f6137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f6140f;

    public static final class b extends h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f6141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f6142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g f6143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f6144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f6145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map<String, String> f6146f;

        @Override // c.f.a.a.j.h.a
        public h d() {
            String str = this.f6141a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " transportName";
            }
            if (this.f6143c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f6144d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f6145e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f6146f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new a(this.f6141a, this.f6142b, this.f6143c, this.f6144d.longValue(), this.f6145e.longValue(), this.f6146f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // c.f.a.a.j.h.a
        public Map<String, String> e() {
            Map<String, String> map = this.f6146f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // c.f.a.a.j.h.a
        public h.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f6146f = map;
            return this;
        }

        @Override // c.f.a.a.j.h.a
        public h.a g(Integer num) {
            this.f6142b = num;
            return this;
        }

        @Override // c.f.a.a.j.h.a
        public h.a h(g gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f6143c = gVar;
            return this;
        }

        @Override // c.f.a.a.j.h.a
        public h.a i(long j2) {
            this.f6144d = Long.valueOf(j2);
            return this;
        }

        @Override // c.f.a.a.j.h.a
        public h.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f6141a = str;
            return this;
        }

        @Override // c.f.a.a.j.h.a
        public h.a k(long j2) {
            this.f6145e = Long.valueOf(j2);
            return this;
        }
    }

    public a(String str, Integer num, g gVar, long j2, long j3, Map<String, String> map) {
        this.f6135a = str;
        this.f6136b = num;
        this.f6137c = gVar;
        this.f6138d = j2;
        this.f6139e = j3;
        this.f6140f = map;
    }

    @Override // c.f.a.a.j.h
    public Map<String, String> c() {
        return this.f6140f;
    }

    @Override // c.f.a.a.j.h
    public Integer d() {
        return this.f6136b;
    }

    @Override // c.f.a.a.j.h
    public g e() {
        return this.f6137c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6135a.equals(hVar.j()) && ((num = this.f6136b) != null ? num.equals(hVar.d()) : hVar.d() == null) && this.f6137c.equals(hVar.e()) && this.f6138d == hVar.f() && this.f6139e == hVar.k() && this.f6140f.equals(hVar.c());
    }

    @Override // c.f.a.a.j.h
    public long f() {
        return this.f6138d;
    }

    public int hashCode() {
        int iHashCode = (this.f6135a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f6136b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f6137c.hashCode()) * 1000003;
        long j2 = this.f6138d;
        int i2 = (iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f6139e;
        return ((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f6140f.hashCode();
    }

    @Override // c.f.a.a.j.h
    public String j() {
        return this.f6135a;
    }

    @Override // c.f.a.a.j.h
    public long k() {
        return this.f6139e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f6135a + ", code=" + this.f6136b + ", encodedPayload=" + this.f6137c + ", eventMillis=" + this.f6138d + ", uptimeMillis=" + this.f6139e + ", autoMetadata=" + this.f6140f + "}";
    }
}
