package c.f.c.s.q;

import c.f.c.s.q.c;
import c.f.c.s.q.d;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f16284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f16287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f16288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16289h;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.a f16291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f16293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f16294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f16295f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f16296g;

        public b() {
        }

        public b(d dVar) {
            this.f16290a = dVar.d();
            this.f16291b = dVar.g();
            this.f16292c = dVar.b();
            this.f16293d = dVar.f();
            this.f16294e = Long.valueOf(dVar.c());
            this.f16295f = Long.valueOf(dVar.h());
            this.f16296g = dVar.e();
        }

        @Override // c.f.c.s.q.d.a
        public d a() {
            c.a aVar = this.f16291b;
            String str = BuildConfig.FLAVOR;
            if (aVar == null) {
                str = BuildConfig.FLAVOR + " registrationStatus";
            }
            if (this.f16294e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f16295f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f16290a, this.f16291b, this.f16292c, this.f16293d, this.f16294e.longValue(), this.f16295f.longValue(), this.f16296g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c.f.c.s.q.d.a
        public d.a b(String str) {
            this.f16292c = str;
            return this;
        }

        @Override // c.f.c.s.q.d.a
        public d.a c(long j2) {
            this.f16294e = Long.valueOf(j2);
            return this;
        }

        @Override // c.f.c.s.q.d.a
        public d.a d(String str) {
            this.f16290a = str;
            return this;
        }

        @Override // c.f.c.s.q.d.a
        public d.a e(String str) {
            this.f16296g = str;
            return this;
        }

        @Override // c.f.c.s.q.d.a
        public d.a f(String str) {
            this.f16293d = str;
            return this;
        }

        @Override // c.f.c.s.q.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f16291b = aVar;
            return this;
        }

        @Override // c.f.c.s.q.d.a
        public d.a h(long j2) {
            this.f16295f = Long.valueOf(j2);
            return this;
        }
    }

    public a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4) {
        this.f16283b = str;
        this.f16284c = aVar;
        this.f16285d = str2;
        this.f16286e = str3;
        this.f16287f = j2;
        this.f16288g = j3;
        this.f16289h = str4;
    }

    @Override // c.f.c.s.q.d
    public String b() {
        return this.f16285d;
    }

    @Override // c.f.c.s.q.d
    public long c() {
        return this.f16287f;
    }

    @Override // c.f.c.s.q.d
    public String d() {
        return this.f16283b;
    }

    @Override // c.f.c.s.q.d
    public String e() {
        return this.f16289h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f16283b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f16284c.equals(dVar.g()) && ((str = this.f16285d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f16286e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f16287f == dVar.c() && this.f16288g == dVar.h()) {
                String str4 = this.f16289h;
                String strE = dVar.e();
                if (str4 == null) {
                    if (strE == null) {
                        return true;
                    }
                } else if (str4.equals(strE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c.f.c.s.q.d
    public String f() {
        return this.f16286e;
    }

    @Override // c.f.c.s.q.d
    public c.a g() {
        return this.f16284c;
    }

    @Override // c.f.c.s.q.d
    public long h() {
        return this.f16288g;
    }

    public int hashCode() {
        String str = this.f16283b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f16284c.hashCode()) * 1000003;
        String str2 = this.f16285d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16286e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j2 = this.f16287f;
        int i2 = (iHashCode3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f16288g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f16289h;
        return i3 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // c.f.c.s.q.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f16283b + ", registrationStatus=" + this.f16284c + ", authToken=" + this.f16285d + ", refreshToken=" + this.f16286e + ", expiresInSecs=" + this.f16287f + ", tokenCreationEpochInSecs=" + this.f16288g + ", fisError=" + this.f16289h + "}";
    }
}
