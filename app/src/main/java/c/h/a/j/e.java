package c.h.a.j;

import android.content.Context;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBPersonInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import o.l;
import o.m;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.h.a.k.f.i f17323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17324b;

    public class a implements o.d<SearchTMDBMoviesCallback> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<SearchTMDBMoviesCallback> bVar, Throwable th) {
            e.this.f17323a.b();
            e.this.f17323a.c(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<SearchTMDBMoviesCallback> bVar, l<SearchTMDBMoviesCallback> lVar) {
            e.this.f17323a.b();
            if (lVar.d()) {
                e.this.f17323a.L(lVar.a());
            } else if (lVar.a() == null) {
                e.this.f17323a.c("Invalid Request");
            }
        }
    }

    public class b implements o.d<TMDBCastsCallback> {
        public b() {
        }

        @Override // o.d
        public void a(o.b<TMDBCastsCallback> bVar, Throwable th) {
            e.this.f17323a.b();
            e.this.f17323a.c(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<TMDBCastsCallback> bVar, l<TMDBCastsCallback> lVar) {
            e.this.f17323a.b();
            if (lVar.d()) {
                e.this.f17323a.x(lVar.a());
            } else if (lVar.a() == null) {
                e.this.f17323a.c("Invalid Request");
            }
        }
    }

    public class c implements o.d<TMDBCastsCallback> {
        public c() {
        }

        @Override // o.d
        public void a(o.b<TMDBCastsCallback> bVar, Throwable th) {
            e.this.f17323a.b();
            e.this.f17323a.c(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<TMDBCastsCallback> bVar, l<TMDBCastsCallback> lVar) {
            e.this.f17323a.b();
            if (lVar.d()) {
                e.this.f17323a.j0(lVar.a());
            } else if (lVar.a() == null) {
                e.this.f17323a.c("Invalid Request");
            }
        }
    }

    public class d implements o.d<TMDBGenreCallback> {
        public d() {
        }

        @Override // o.d
        public void a(o.b<TMDBGenreCallback> bVar, Throwable th) {
            e.this.f17323a.b();
            e.this.f17323a.c(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<TMDBGenreCallback> bVar, l<TMDBGenreCallback> lVar) {
            e.this.f17323a.b();
            if (lVar.d()) {
                e.this.f17323a.s(lVar.a());
            } else if (lVar.a() == null) {
                e.this.f17323a.c("Invalid Request");
            }
        }
    }

    /* JADX INFO: renamed from: c.h.a.j.e$e, reason: collision with other inner class name */
    public class C0233e implements o.d<TMDBTrailerCallback> {
        public C0233e() {
        }

        @Override // o.d
        public void a(o.b<TMDBTrailerCallback> bVar, Throwable th) {
            e.this.f17323a.b();
            e.this.f17323a.c(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<TMDBTrailerCallback> bVar, l<TMDBTrailerCallback> lVar) {
            e.this.f17323a.b();
            if (lVar.d()) {
                e.this.f17323a.k0(lVar.a());
            } else if (lVar.a() == null) {
                e.this.f17323a.c("Invalid Request");
            }
        }
    }

    public class f implements o.d<TMDBPersonInfoCallback> {
        public f() {
        }

        @Override // o.d
        public void a(o.b<TMDBPersonInfoCallback> bVar, Throwable th) {
            e.this.f17323a.b();
            e.this.f17323a.c(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<TMDBPersonInfoCallback> bVar, l<TMDBPersonInfoCallback> lVar) {
            e.this.f17323a.b();
            if (lVar.d()) {
                e.this.f17323a.A(lVar.a());
            } else if (lVar.a() == null) {
                e.this.f17323a.c("Invalid Request");
            }
        }
    }

    public e(c.h.a.k.f.i iVar, Context context) {
        this.f17323a = iVar;
        this.f17324b = context;
    }

    public void b(int i2) {
        this.f17323a.a();
        m mVarB0 = c.h.a.h.n.e.b0(this.f17324b);
        if (mVarB0 != null) {
            ((c.h.a.i.r.a) mVarB0.d(c.h.a.i.r.a.class)).o(i2, "f584f73e8848d9ace559deee1e5a849f").x(new b());
        }
    }

    public void c(int i2) {
        this.f17323a.a();
        m mVarB0 = c.h.a.h.n.e.b0(this.f17324b);
        if (mVarB0 != null) {
            ((c.h.a.i.r.a) mVarB0.d(c.h.a.i.r.a.class)).o(i2, "f584f73e8848d9ace559deee1e5a849f").x(new c());
        }
    }

    public void d(int i2) {
        this.f17323a.a();
        m mVarB0 = c.h.a.h.n.e.b0(this.f17324b);
        if (mVarB0 != null) {
            ((c.h.a.i.r.a) mVarB0.d(c.h.a.i.r.a.class)).e(i2, "f584f73e8848d9ace559deee1e5a849f").x(new d());
        }
    }

    public void e(String str) {
        this.f17323a.a();
        m mVarB0 = c.h.a.h.n.e.b0(this.f17324b);
        if (mVarB0 != null) {
            ((c.h.a.i.r.a) mVarB0.d(c.h.a.i.r.a.class)).c("f584f73e8848d9ace559deee1e5a849f", str).x(new a());
        }
    }

    public void f(String str) {
        this.f17323a.a();
        m mVarB0 = c.h.a.h.n.e.b0(this.f17324b);
        if (mVarB0 != null) {
            ((c.h.a.i.r.a) mVarB0.d(c.h.a.i.r.a.class)).x(str, "f584f73e8848d9ace559deee1e5a849f", "images").x(new f());
        }
    }

    public void g(int i2) {
        this.f17323a.a();
        m mVarB0 = c.h.a.h.n.e.b0(this.f17324b);
        if (mVarB0 != null) {
            ((c.h.a.i.r.a) mVarB0.d(c.h.a.i.r.a.class)).i(i2, "f584f73e8848d9ace559deee1e5a849f").x(new C0233e());
        }
    }
}
