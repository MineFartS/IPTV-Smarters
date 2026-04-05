package c.f.a.a.j;

import c.f.a.a.j.l;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f6149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.a.c<?> f6151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.a.e<?, byte[]> f6152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.a.b f6153e;

    /* JADX INFO: renamed from: c.f.a.a.j.b$b, reason: collision with other inner class name */
    public static final class C0119b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m f6154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f6155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c.f.a.a.c<?> f6156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.f.a.a.e<?, byte[]> f6157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c.f.a.a.b f6158e;

        @Override // c.f.a.a.j.l.a
        public l a() {
            m mVar = this.f6154a;
            String str = BuildConfig.FLAVOR;
            if (mVar == null) {
                str = BuildConfig.FLAVOR + " transportContext";
            }
            if (this.f6155b == null) {
                str = str + " transportName";
            }
            if (this.f6156c == null) {
                str = str + " event";
            }
            if (this.f6157d == null) {
                str = str + " transformer";
            }
            if (this.f6158e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new b(this.f6154a, this.f6155b, this.f6156c, this.f6157d, this.f6158e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c.f.a.a.j.l.a
        public l.a b(c.f.a.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f6158e = bVar;
            return this;
        }

        @Override // c.f.a.a.j.l.a
        public l.a c(c.f.a.a.c<?> cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f6156c = cVar;
            return this;
        }

        @Override // c.f.a.a.j.l.a
        public l.a d(c.f.a.a.e<?, byte[]> eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f6157d = eVar;
            return this;
        }

        @Override // c.f.a.a.j.l.a
        public l.a e(m mVar) {
            if (mVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f6154a = mVar;
            return this;
        }

        @Override // c.f.a.a.j.l.a
        public l.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f6155b = str;
            return this;
        }
    }

    public b(m mVar, String str, c.f.a.a.c<?> cVar, c.f.a.a.e<?, byte[]> eVar, c.f.a.a.b bVar) {
        this.f6149a = mVar;
        this.f6150b = str;
        this.f6151c = cVar;
        this.f6152d = eVar;
        this.f6153e = bVar;
    }

    @Override // c.f.a.a.j.l
    public c.f.a.a.b b() {
        return this.f6153e;
    }

    @Override // c.f.a.a.j.l
    public c.f.a.a.c<?> c() {
        return this.f6151c;
    }

    @Override // c.f.a.a.j.l
    public c.f.a.a.e<?, byte[]> e() {
        return this.f6152d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f6149a.equals(lVar.f()) && this.f6150b.equals(lVar.g()) && this.f6151c.equals(lVar.c()) && this.f6152d.equals(lVar.e()) && this.f6153e.equals(lVar.b());
    }

    @Override // c.f.a.a.j.l
    public m f() {
        return this.f6149a;
    }

    @Override // c.f.a.a.j.l
    public String g() {
        return this.f6150b;
    }

    public int hashCode() {
        return ((((((((this.f6149a.hashCode() ^ 1000003) * 1000003) ^ this.f6150b.hashCode()) * 1000003) ^ this.f6151c.hashCode()) * 1000003) ^ this.f6152d.hashCode()) * 1000003) ^ this.f6153e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f6149a + ", transportName=" + this.f6150b + ", event=" + this.f6151c + ", transformer=" + this.f6152d + ", encoding=" + this.f6153e + "}";
    }
}
