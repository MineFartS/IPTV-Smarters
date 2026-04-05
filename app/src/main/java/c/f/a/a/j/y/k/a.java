package c.f.a.a.j.y.k;

import c.f.a.a.j.y.k.d;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6319f;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f6320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f6321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f6322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f6323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f6324e;

        @Override // c.f.a.a.j.y.k.d.a
        public d a() {
            Long l2 = this.f6320a;
            String str = BuildConfig.FLAVOR;
            if (l2 == null) {
                str = BuildConfig.FLAVOR + " maxStorageSizeInBytes";
            }
            if (this.f6321b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f6322c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f6323d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f6324e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f6320a.longValue(), this.f6321b.intValue(), this.f6322c.intValue(), this.f6323d.longValue(), this.f6324e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c.f.a.a.j.y.k.d.a
        public d.a b(int i2) {
            this.f6322c = Integer.valueOf(i2);
            return this;
        }

        @Override // c.f.a.a.j.y.k.d.a
        public d.a c(long j2) {
            this.f6323d = Long.valueOf(j2);
            return this;
        }

        @Override // c.f.a.a.j.y.k.d.a
        public d.a d(int i2) {
            this.f6321b = Integer.valueOf(i2);
            return this;
        }

        @Override // c.f.a.a.j.y.k.d.a
        public d.a e(int i2) {
            this.f6324e = Integer.valueOf(i2);
            return this;
        }

        @Override // c.f.a.a.j.y.k.d.a
        public d.a f(long j2) {
            this.f6320a = Long.valueOf(j2);
            return this;
        }
    }

    public a(long j2, int i2, int i3, long j3, int i4) {
        this.f6315b = j2;
        this.f6316c = i2;
        this.f6317d = i3;
        this.f6318e = j3;
        this.f6319f = i4;
    }

    @Override // c.f.a.a.j.y.k.d
    public int b() {
        return this.f6317d;
    }

    @Override // c.f.a.a.j.y.k.d
    public long c() {
        return this.f6318e;
    }

    @Override // c.f.a.a.j.y.k.d
    public int d() {
        return this.f6316c;
    }

    @Override // c.f.a.a.j.y.k.d
    public int e() {
        return this.f6319f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6315b == dVar.f() && this.f6316c == dVar.d() && this.f6317d == dVar.b() && this.f6318e == dVar.c() && this.f6319f == dVar.e();
    }

    @Override // c.f.a.a.j.y.k.d
    public long f() {
        return this.f6315b;
    }

    public int hashCode() {
        long j2 = this.f6315b;
        int i2 = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f6316c) * 1000003) ^ this.f6317d) * 1000003;
        long j3 = this.f6318e;
        return this.f6319f ^ ((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f6315b + ", loadBatchSize=" + this.f6316c + ", criticalSectionEnterTimeoutMs=" + this.f6317d + ", eventCleanUpAge=" + this.f6318e + ", maxBlobByteSizePerRow=" + this.f6319f + "}";
    }
}
