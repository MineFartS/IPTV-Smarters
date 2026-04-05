package c.f.c.s;

import c.f.c.s.l;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16244c;

    public static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f16246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f16247c;

        @Override // c.f.c.s.l.a
        public l a() {
            String str = this.f16245a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " token";
            }
            if (this.f16246b == null) {
                str2 = str2 + " tokenExpirationTimestamp";
            }
            if (this.f16247c == null) {
                str2 = str2 + " tokenCreationTimestamp";
            }
            if (str2.isEmpty()) {
                return new a(this.f16245a, this.f16246b.longValue(), this.f16247c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // c.f.c.s.l.a
        public l.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f16245a = str;
            return this;
        }

        @Override // c.f.c.s.l.a
        public l.a c(long j2) {
            this.f16247c = Long.valueOf(j2);
            return this;
        }

        @Override // c.f.c.s.l.a
        public l.a d(long j2) {
            this.f16246b = Long.valueOf(j2);
            return this;
        }
    }

    public a(String str, long j2, long j3) {
        this.f16242a = str;
        this.f16243b = j2;
        this.f16244c = j3;
    }

    @Override // c.f.c.s.l
    public String b() {
        return this.f16242a;
    }

    @Override // c.f.c.s.l
    public long c() {
        return this.f16244c;
    }

    @Override // c.f.c.s.l
    public long d() {
        return this.f16243b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f16242a.equals(lVar.b()) && this.f16243b == lVar.d() && this.f16244c == lVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.f16242a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f16243b;
        long j3 = this.f16244c;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f16242a + ", tokenExpirationTimestamp=" + this.f16243b + ", tokenCreationTimestamp=" + this.f16244c + "}";
    }
}
