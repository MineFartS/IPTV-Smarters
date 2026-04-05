package c.f.a.a.j.y.j;

import c.f.a.a.j.y.j.g;
import java.util.Set;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<g.c> f6265c;

    public static final class b extends g.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f6266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f6267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<g.c> f6268c;

        @Override // c.f.a.a.j.y.j.g.b.a
        public g.b a() {
            Long l2 = this.f6266a;
            String str = BuildConfig.FLAVOR;
            if (l2 == null) {
                str = BuildConfig.FLAVOR + " delta";
            }
            if (this.f6267b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f6268c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f6266a.longValue(), this.f6267b.longValue(), this.f6268c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c.f.a.a.j.y.j.g.b.a
        public g.b.a b(long j2) {
            this.f6266a = Long.valueOf(j2);
            return this;
        }

        @Override // c.f.a.a.j.y.j.g.b.a
        public g.b.a c(Set<g.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f6268c = set;
            return this;
        }

        @Override // c.f.a.a.j.y.j.g.b.a
        public g.b.a d(long j2) {
            this.f6267b = Long.valueOf(j2);
            return this;
        }
    }

    public d(long j2, long j3, Set<g.c> set) {
        this.f6263a = j2;
        this.f6264b = j3;
        this.f6265c = set;
    }

    @Override // c.f.a.a.j.y.j.g.b
    public long b() {
        return this.f6263a;
    }

    @Override // c.f.a.a.j.y.j.g.b
    public Set<g.c> c() {
        return this.f6265c;
    }

    @Override // c.f.a.a.j.y.j.g.b
    public long d() {
        return this.f6264b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g.b)) {
            return false;
        }
        g.b bVar = (g.b) obj;
        return this.f6263a == bVar.b() && this.f6264b == bVar.d() && this.f6265c.equals(bVar.c());
    }

    public int hashCode() {
        long j2 = this.f6263a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.f6264b;
        return this.f6265c.hashCode() ^ ((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f6263a + ", maxAllowedDelay=" + this.f6264b + ", flags=" + this.f6265c + "}";
    }
}
