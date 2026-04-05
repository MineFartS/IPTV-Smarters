package c.h.a.j;

import android.content.Context;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import o.l;
import o.m;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.h.a.k.f.j f17331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17332b;

    public class a implements o.d<SearchTMDBTVShowsCallback> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<SearchTMDBTVShowsCallback> bVar, Throwable th) {
            f.this.f17331a.b();
            f.this.f17331a.c(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<SearchTMDBTVShowsCallback> bVar, l<SearchTMDBTVShowsCallback> lVar) {
            f.this.f17331a.b();
            if (lVar.d()) {
                f.this.f17331a.M(lVar.a());
            } else if (lVar.a() == null) {
                f.this.f17331a.c("Invalid Request");
            }
        }
    }

    public class b implements o.d<TMDBTVShowsInfoCallback> {
        public b() {
        }

        @Override // o.d
        public void a(o.b<TMDBTVShowsInfoCallback> bVar, Throwable th) {
            f.this.f17331a.b();
            f.this.f17331a.c(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<TMDBTVShowsInfoCallback> bVar, l<TMDBTVShowsInfoCallback> lVar) {
            f.this.f17331a.b();
            if (lVar.d()) {
                f.this.f17331a.T(lVar.a());
            } else if (lVar.a() == null) {
                f.this.f17331a.c("Invalid Request");
            }
        }
    }

    public class c implements o.d<TMDBTrailerCallback> {
        public c() {
        }

        @Override // o.d
        public void a(o.b<TMDBTrailerCallback> bVar, Throwable th) {
            f.this.f17331a.b();
            f.this.f17331a.c(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<TMDBTrailerCallback> bVar, l<TMDBTrailerCallback> lVar) {
            f.this.f17331a.b();
            if (lVar.d()) {
                f.this.f17331a.a0(lVar.a());
            } else if (lVar.a() == null) {
                f.this.f17331a.c("Invalid Request");
            }
        }
    }

    public class d implements o.d<TMDBCastsCallback> {
        public d() {
        }

        @Override // o.d
        public void a(o.b<TMDBCastsCallback> bVar, Throwable th) {
            f.this.f17331a.b();
            f.this.f17331a.c(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<TMDBCastsCallback> bVar, l<TMDBCastsCallback> lVar) {
            f.this.f17331a.b();
            if (lVar.d()) {
                f.this.f17331a.f0(lVar.a());
            } else if (lVar.a() == null) {
                f.this.f17331a.c("Invalid Request");
            }
        }
    }

    public f(c.h.a.k.f.j jVar, Context context) {
        this.f17331a = jVar;
        this.f17332b = context;
    }

    public void b(int i2) {
        this.f17331a.a();
        m mVarB0 = c.h.a.h.n.e.b0(this.f17332b);
        if (mVarB0 != null) {
            ((c.h.a.i.r.a) mVarB0.d(c.h.a.i.r.a.class)).u(i2, "f584f73e8848d9ace559deee1e5a849f").x(new d());
        }
    }

    public void c(int i2) {
        this.f17331a.a();
        m mVarB0 = c.h.a.h.n.e.b0(this.f17332b);
        if (mVarB0 != null) {
            ((c.h.a.i.r.a) mVarB0.d(c.h.a.i.r.a.class)).h(i2, "f584f73e8848d9ace559deee1e5a849f").x(new b());
        }
    }

    public void d(String str) {
        this.f17331a.a();
        m mVarB0 = c.h.a.h.n.e.b0(this.f17332b);
        if (mVarB0 != null) {
            try {
                ((c.h.a.i.r.a) mVarB0.d(c.h.a.i.r.a.class)).A("f584f73e8848d9ace559deee1e5a849f", str).x(new a());
            } catch (Exception unused) {
            }
        }
    }

    public void e(int i2) {
        this.f17331a.a();
        m mVarB0 = c.h.a.h.n.e.b0(this.f17332b);
        if (mVarB0 != null) {
            ((c.h.a.i.r.a) mVarB0.d(c.h.a.i.r.a.class)).r(i2, "f584f73e8848d9ace559deee1e5a849f").x(new c());
        }
    }
}
