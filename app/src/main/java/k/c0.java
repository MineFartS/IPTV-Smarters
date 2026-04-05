package k;

import java.io.Closeable;
import javax.annotation.Nullable;
import k.s;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f30486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f30487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final r f30490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f30491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final d0 f30492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final c0 f30493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final c0 f30494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final c0 f30495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f30496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f30497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile d f30498n;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0 f30499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public y f30500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f30502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public r f30503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public s.a f30504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d0 f30505g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c0 f30506h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public c0 f30507i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public c0 f30508j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f30509k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f30510l;

        public a() {
            this.f30501c = -1;
            this.f30504f = new s.a();
        }

        public a(c0 c0Var) {
            this.f30501c = -1;
            this.f30499a = c0Var.f30486b;
            this.f30500b = c0Var.f30487c;
            this.f30501c = c0Var.f30488d;
            this.f30502d = c0Var.f30489e;
            this.f30503e = c0Var.f30490f;
            this.f30504f = c0Var.f30491g.d();
            this.f30505g = c0Var.f30492h;
            this.f30506h = c0Var.f30493i;
            this.f30507i = c0Var.f30494j;
            this.f30508j = c0Var.f30495k;
            this.f30509k = c0Var.f30496l;
            this.f30510l = c0Var.f30497m;
        }

        public a a(String str, String str2) {
            this.f30504f.a(str, str2);
            return this;
        }

        public a b(@Nullable d0 d0Var) {
            this.f30505g = d0Var;
            return this;
        }

        public c0 c() {
            if (this.f30499a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f30500b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f30501c >= 0) {
                if (this.f30502d != null) {
                    return new c0(this);
                }
                throw new IllegalStateException("message == null");
            }
            throw new IllegalStateException("code < 0: " + this.f30501c);
        }

        public a d(@Nullable c0 c0Var) {
            if (c0Var != null) {
                f("cacheResponse", c0Var);
            }
            this.f30507i = c0Var;
            return this;
        }

        public final void e(c0 c0Var) {
            if (c0Var.f30492h != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final void f(String str, c0 c0Var) {
            if (c0Var.f30492h != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (c0Var.f30493i != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (c0Var.f30494j != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (c0Var.f30495k == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        public a g(int i2) {
            this.f30501c = i2;
            return this;
        }

        public a h(@Nullable r rVar) {
            this.f30503e = rVar;
            return this;
        }

        public a i(s sVar) {
            this.f30504f = sVar.d();
            return this;
        }

        public a j(String str) {
            this.f30502d = str;
            return this;
        }

        public a k(@Nullable c0 c0Var) {
            if (c0Var != null) {
                f("networkResponse", c0Var);
            }
            this.f30506h = c0Var;
            return this;
        }

        public a l(@Nullable c0 c0Var) {
            if (c0Var != null) {
                e(c0Var);
            }
            this.f30508j = c0Var;
            return this;
        }

        public a m(y yVar) {
            this.f30500b = yVar;
            return this;
        }

        public a n(long j2) {
            this.f30510l = j2;
            return this;
        }

        public a o(a0 a0Var) {
            this.f30499a = a0Var;
            return this;
        }

        public a p(long j2) {
            this.f30509k = j2;
            return this;
        }
    }

    public c0(a aVar) {
        this.f30486b = aVar.f30499a;
        this.f30487c = aVar.f30500b;
        this.f30488d = aVar.f30501c;
        this.f30489e = aVar.f30502d;
        this.f30490f = aVar.f30503e;
        this.f30491g = aVar.f30504f.d();
        this.f30492h = aVar.f30505g;
        this.f30493i = aVar.f30506h;
        this.f30494j = aVar.f30507i;
        this.f30495k = aVar.f30508j;
        this.f30496l = aVar.f30509k;
        this.f30497m = aVar.f30510l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30492h.close();
    }

    @Nullable
    public d0 d() {
        return this.f30492h;
    }

    public d i() {
        d dVar = this.f30498n;
        if (dVar != null) {
            return dVar;
        }
        d dVarK = d.k(this.f30491g);
        this.f30498n = dVarK;
        return dVarK;
    }

    public int l() {
        return this.f30488d;
    }

    public r m() {
        return this.f30490f;
    }

    @Nullable
    public String n(String str) {
        return o(str, null);
    }

    @Nullable
    public String o(String str, @Nullable String str2) {
        String strA = this.f30491g.a(str);
        return strA != null ? strA : str2;
    }

    public s p() {
        return this.f30491g;
    }

    public boolean q() {
        int i2 = this.f30488d;
        return i2 >= 200 && i2 < 300;
    }

    public a r() {
        return new a(this);
    }

    public long s() {
        return this.f30497m;
    }

    public a0 t() {
        return this.f30486b;
    }

    public String toString() {
        return "Response{protocol=" + this.f30487c + ", code=" + this.f30488d + ", message=" + this.f30489e + ", url=" + this.f30486b.h() + '}';
    }

    public long u() {
        return this.f30496l;
    }
}
