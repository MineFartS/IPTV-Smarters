package c.h.a.j;

import android.content.Context;
import c.h.a.k.f.k;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import o.l;
import o.m;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f17338b;

    public class a implements o.d<c.f.d.j> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<c.f.d.j> bVar, Throwable th) {
            g.this.f17338b.b();
            g.this.f17338b.c(th.getMessage());
            g.this.f17338b.m(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<c.f.d.j> bVar, l<c.f.d.j> lVar) {
            if (lVar.a() != null) {
                g.this.f17338b.b0(lVar.a());
            }
        }
    }

    public g(Context context, k kVar) {
        this.f17337a = context;
        this.f17338b = kVar;
    }

    public void b(String str, String str2, String str3) {
        m mVarZ = c.h.a.h.n.e.Z(this.f17337a);
        if (mVarZ != null) {
            ((c.h.a.i.r.a) mVarZ.d(c.h.a.i.r.a.class)).B(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT, str, str2, "get_series_info", str3).x(new a());
        }
    }
}
