package c.h.a.j;

import android.content.Context;
import c.h.a.k.f.m;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback;
import o.l;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f17352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17353b;

    public class a implements o.d<VodInfoCallback> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<VodInfoCallback> bVar, Throwable th) {
            j.this.f17352a.b();
            j.this.f17352a.c(th.getMessage());
            j.this.f17352a.U(th.getMessage());
        }

        @Override // o.d
        public void b(o.b<VodInfoCallback> bVar, l<VodInfoCallback> lVar) {
            j.this.f17352a.b();
            if (lVar.d()) {
                j.this.f17352a.Y(lVar.a());
            } else if (lVar.a() == null) {
                j.this.f17352a.c("Invalid Request");
            }
        }
    }

    public j(m mVar, Context context) {
        this.f17352a = mVar;
        this.f17353b = context;
    }

    public void b(String str, String str2, int i2) {
        this.f17352a.a();
        o.m mVarZ = c.h.a.h.n.e.Z(this.f17353b);
        if (mVarZ != null) {
            ((c.h.a.i.r.a) mVarZ.d(c.h.a.i.r.a.class)).p(ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT, str, str2, "get_vod_info", i2).x(new a());
        }
    }
}
