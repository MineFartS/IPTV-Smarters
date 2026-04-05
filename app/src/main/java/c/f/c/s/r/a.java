package c.f.c.s.r;

import c.f.c.s.r.d;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f16306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d.b f16307e;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f16311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d.b f16312e;

        @Override // c.f.c.s.r.d.a
        public d a() {
            return new a(this.f16308a, this.f16309b, this.f16310c, this.f16311d, this.f16312e);
        }

        @Override // c.f.c.s.r.d.a
        public d.a b(f fVar) {
            this.f16311d = fVar;
            return this;
        }

        @Override // c.f.c.s.r.d.a
        public d.a c(String str) {
            this.f16309b = str;
            return this;
        }

        @Override // c.f.c.s.r.d.a
        public d.a d(String str) {
            this.f16310c = str;
            return this;
        }

        @Override // c.f.c.s.r.d.a
        public d.a e(d.b bVar) {
            this.f16312e = bVar;
            return this;
        }

        @Override // c.f.c.s.r.d.a
        public d.a f(String str) {
            this.f16308a = str;
            return this;
        }
    }

    public a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f16303a = str;
        this.f16304b = str2;
        this.f16305c = str3;
        this.f16306d = fVar;
        this.f16307e = bVar;
    }

    @Override // c.f.c.s.r.d
    public f b() {
        return this.f16306d;
    }

    @Override // c.f.c.s.r.d
    public String c() {
        return this.f16304b;
    }

    @Override // c.f.c.s.r.d
    public String d() {
        return this.f16305c;
    }

    @Override // c.f.c.s.r.d
    public d.b e() {
        return this.f16307e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f16303a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f16304b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f16305c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f16306d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f16307e;
                        d.b bVarE = dVar.e();
                        if (bVar == null) {
                            if (bVarE == null) {
                                return true;
                            }
                        } else if (bVar.equals(bVarE)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // c.f.c.s.r.d
    public String f() {
        return this.f16303a;
    }

    public int hashCode() {
        String str = this.f16303a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f16304b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16305c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f16306d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f16307e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f16303a + ", fid=" + this.f16304b + ", refreshToken=" + this.f16305c + ", authToken=" + this.f16306d + ", responseCode=" + this.f16307e + "}";
    }
}
