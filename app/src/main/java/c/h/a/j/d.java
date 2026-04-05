package c.h.a.j;

import android.content.Context;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.nst.iptvsmarterstvbox.model.callback.GetSeriesStreamCallback;
import com.nst.iptvsmarterstvbox.model.callback.GetSeriesStreamCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamsCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodStreamsCallback;
import java.util.List;
import o.l;
import o.m;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.h.a.k.f.h f17316b;

    public class a implements o.d<List<LiveStreamCategoriesCallback>> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<List<LiveStreamCategoriesCallback>> bVar, Throwable th) {
            d.this.f17316b.H("Failed");
            d.this.f17316b.b();
        }

        @Override // o.d
        public void b(o.b<List<LiveStreamCategoriesCallback>> bVar, l<List<LiveStreamCategoriesCallback>> lVar) {
            if (lVar.a() != null && lVar.d()) {
                d.this.f17316b.q(lVar.a());
            } else if (lVar.a() == null) {
                d.this.f17316b.H("Failed");
                d.this.f17316b.b();
            }
        }
    }

    public class b implements o.d<List<VodCategoriesCallback>> {
        public b() {
        }

        @Override // o.d
        public void a(o.b<List<VodCategoriesCallback>> bVar, Throwable th) {
            d.this.f17316b.i("Failed");
            d.this.f17316b.b();
        }

        @Override // o.d
        public void b(o.b<List<VodCategoriesCallback>> bVar, l<List<VodCategoriesCallback>> lVar) {
            if (lVar.a() != null && lVar.d()) {
                d.this.f17316b.y(lVar.a());
            } else if (lVar.a() == null) {
                d.this.f17316b.i("Failed");
                d.this.f17316b.b();
            }
        }
    }

    public class c implements o.d<List<GetSeriesStreamCategoriesCallback>> {
        public c() {
        }

        @Override // o.d
        public void a(o.b<List<GetSeriesStreamCategoriesCallback>> bVar, Throwable th) {
            d.this.f17316b.l("Failed");
            d.this.f17316b.b();
        }

        @Override // o.d
        public void b(o.b<List<GetSeriesStreamCategoriesCallback>> bVar, l<List<GetSeriesStreamCategoriesCallback>> lVar) {
            if (lVar.a() != null && lVar.d()) {
                d.this.f17316b.c0(lVar.a());
            } else if (lVar.a() == null) {
                d.this.f17316b.l("Failed");
                d.this.f17316b.b();
            }
        }
    }

    /* JADX INFO: renamed from: c.h.a.j.d$d, reason: collision with other inner class name */
    public class C0232d implements o.d<List<LiveStreamsCallback>> {
        public C0232d() {
        }

        @Override // o.d
        public void a(o.b<List<LiveStreamsCallback>> bVar, Throwable th) {
            d.this.f17316b.C("Failed");
            d.this.f17316b.b();
        }

        @Override // o.d
        public void b(o.b<List<LiveStreamsCallback>> bVar, l<List<LiveStreamsCallback>> lVar) {
            if (lVar.a() != null && lVar.d()) {
                d.this.f17316b.Z(lVar.a());
            } else if (lVar.a() == null) {
                d.this.f17316b.C("Failed");
                d.this.f17316b.b();
            }
        }
    }

    public class e implements o.d<List<VodStreamsCallback>> {
        public e() {
        }

        @Override // o.d
        public void a(o.b<List<VodStreamsCallback>> bVar, Throwable th) {
            d.this.f17316b.u("Failed");
            d.this.f17316b.b();
        }

        @Override // o.d
        public void b(o.b<List<VodStreamsCallback>> bVar, l<List<VodStreamsCallback>> lVar) {
            if (lVar.a() != null && lVar.d()) {
                d.this.f17316b.i0(lVar.a());
            } else if (lVar.a() == null) {
                d.this.f17316b.u("Failed");
                d.this.f17316b.b();
            }
        }
    }

    public class f implements o.d<List<GetSeriesStreamCallback>> {
        public f() {
        }

        @Override // o.d
        public void a(o.b<List<GetSeriesStreamCallback>> bVar, Throwable th) {
            d.this.f17316b.R("Failed");
            d.this.f17316b.b();
        }

        @Override // o.d
        public void b(o.b<List<GetSeriesStreamCallback>> bVar, l<List<GetSeriesStreamCallback>> lVar) {
            if (lVar.a() != null && lVar.d()) {
                d.this.f17316b.K(lVar.a());
            } else if (lVar.a() == null) {
                d.this.f17316b.R("Failed");
                d.this.f17316b.b();
            }
        }
    }

    public d(Context context, c.h.a.k.f.h hVar) {
        this.f17315a = context;
        this.f17316b = hVar;
    }

    public void b(String str, String str2) {
        m mVarZ = c.h.a.h.n.e.Z(this.f17315a);
        if (mVarZ != null) {
            ((c.h.a.i.r.a) mVarZ.d(c.h.a.i.r.a.class)).v(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT, str, str2, "get_live_categories").x(new a());
        }
    }

    public void c(String str, String str2) {
        m mVarZ = c.h.a.h.n.e.Z(this.f17315a);
        if (mVarZ != null) {
            ((c.h.a.i.r.a) mVarZ.d(c.h.a.i.r.a.class)).g(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT, str, str2, "get_live_streams").x(new C0232d());
        }
    }

    public void d(String str, String str2) {
        m mVarZ = c.h.a.h.n.e.Z(this.f17315a);
        if (mVarZ != null) {
            ((c.h.a.i.r.a) mVarZ.d(c.h.a.i.r.a.class)).s(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT, str, str2, "get_series").x(new f());
        }
    }

    public void e(String str, String str2) {
        m mVarZ = c.h.a.h.n.e.Z(this.f17315a);
        if (mVarZ != null) {
            ((c.h.a.i.r.a) mVarZ.d(c.h.a.i.r.a.class)).y(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT, str, str2, "get_series_categories").x(new c());
        }
    }

    public void f(String str, String str2) {
        m mVarZ = c.h.a.h.n.e.Z(this.f17315a);
        if (mVarZ != null) {
            ((c.h.a.i.r.a) mVarZ.d(c.h.a.i.r.a.class)).j(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT, str, str2, "get_vod_categories").x(new b());
        }
    }

    public void g(String str, String str2) {
        m mVarZ = c.h.a.h.n.e.Z(this.f17315a);
        if (mVarZ != null) {
            ((c.h.a.i.r.a) mVarZ.d(c.h.a.i.r.a.class)).t(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT, str, str2, "get_vod_streams").x(new e());
        }
    }
}
