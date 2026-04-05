package c.h.a.j;

import android.content.Context;
import android.util.Log;
import c.h.a.k.f.l;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.VPNServersCallback;
import o.m;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f17350b;

    public class a implements o.d<VPNServersCallback> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<VPNServersCallback> bVar, Throwable th) {
            Log.e("honey", "onFailure: ");
            i.this.f17350b.c(i.this.f17349a.getResources().getString(R.string.something_wrong));
        }

        @Override // o.d
        public void b(o.b<VPNServersCallback> bVar, o.l<VPNServersCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                i.this.f17350b.c(i.this.f17349a.getResources().getString(R.string.something_wrong));
            } else {
                i.this.f17350b.f(lVar.a());
            }
        }
    }

    public i(Context context, l lVar) {
        this.f17349a = context;
        this.f17350b = lVar;
    }

    public void c(String str) {
        this.f17350b.a();
        m mVarC0 = c.h.a.h.n.e.c0(this.f17349a);
        if (mVarC0 != null) {
            ((c.h.a.i.r.a) mVarC0.d(c.h.a.i.r.a.class)).w("getvpnserver", "5bcad13a-1d8c-40af-9ba4-1e6f6bd0970a", c.h.a.f.b.f16735b, "Ka11484fbeedb2561981887ea65a38ac4", str).x(new a());
        }
    }
}
