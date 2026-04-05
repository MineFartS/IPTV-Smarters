package c.f.c.s.r;

import c.f.c.s.r.f;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.b f16315c;

    /* JADX INFO: renamed from: c.f.c.s.r.b$b, reason: collision with other inner class name */
    public static final class C0197b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f16317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f.b f16318c;

        @Override // c.f.c.s.r.f.a
        public f a() {
            Long l2 = this.f16317b;
            String str = BuildConfig.FLAVOR;
            if (l2 == null) {
                str = BuildConfig.FLAVOR + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f16316a, this.f16317b.longValue(), this.f16318c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c.f.c.s.r.f.a
        public f.a b(f.b bVar) {
            this.f16318c = bVar;
            return this;
        }

        @Override // c.f.c.s.r.f.a
        public f.a c(String str) {
            this.f16316a = str;
            return this;
        }

        @Override // c.f.c.s.r.f.a
        public f.a d(long j2) {
            this.f16317b = Long.valueOf(j2);
            return this;
        }
    }

    public b(String str, long j2, f.b bVar) {
        this.f16313a = str;
        this.f16314b = j2;
        this.f16315c = bVar;
    }

    @Override // c.f.c.s.r.f
    public f.b b() {
        return this.f16315c;
    }

    @Override // c.f.c.s.r.f
    public String c() {
        return this.f16313a;
    }

    @Override // c.f.c.s.r.f
    public long d() {
        return this.f16314b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f16313a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f16314b == fVar.d()) {
                f.b bVar = this.f16315c;
                f.b bVarB = fVar.b();
                if (bVar == null) {
                    if (bVarB == null) {
                        return true;
                    }
                } else if (bVar.equals(bVarB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f16313a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f16314b;
        int i2 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        f.b bVar = this.f16315c;
        return i2 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f16313a + ", tokenExpirationTimestamp=" + this.f16314b + ", responseCode=" + this.f16315c + "}";
    }
}
