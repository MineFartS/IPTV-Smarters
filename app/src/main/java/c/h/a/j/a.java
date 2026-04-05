package c.h.a.j;

import android.content.Context;
import android.util.Log;
import c.h.a.i.q.m;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.ActivationCallBack;
import o.l;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.h.a.k.f.a f17293b;

    /* JADX INFO: renamed from: c.h.a.j.a$a, reason: collision with other inner class name */
    public class C0230a implements o.d<ActivationCallBack> {
        public C0230a() {
        }

        @Override // o.d
        public void a(o.b<ActivationCallBack> bVar, Throwable th) {
            a aVar = a.this;
            aVar.f17293b.h0(aVar.f17292a.getResources().getString(R.string.something_wrong));
        }

        @Override // o.d
        public void b(o.b<ActivationCallBack> bVar, l<ActivationCallBack> lVar) {
            if (!lVar.d() || lVar.a() == null) {
                a aVar = a.this;
                aVar.f17293b.h0(aVar.f17292a.getResources().getString(R.string.something_wrong));
                return;
            }
            if (lVar.a().c() != null && lVar.a().c().equalsIgnoreCase("success")) {
                if (lVar.a().a() != null) {
                    m.h0(lVar.a().a().a(), a.this.f17292a);
                    m.g0(lVar.a().a().b(), a.this.f17292a);
                    a.this.f17293b.F(lVar.a(), "validateLogin");
                    Log.e("ActivationPresenter", "Respone is successfull");
                } else if (lVar.a().b() != null) {
                    c.h.a.h.n.e.l0(a.this.f17292a, lVar.a().b());
                }
            }
            if (lVar.a().c().equalsIgnoreCase("error")) {
                a.this.f17293b.h0(lVar.a().b());
                Log.e("ActivationPresenter", "Response is not sucessfull");
            }
        }
    }

    public a(c.h.a.k.f.a aVar, Context context) {
        this.f17292a = context;
        this.f17293b = aVar;
    }

    public void a(String str) {
        o.m mVarP = c.h.a.h.n.e.p(this.f17292a);
        if (mVarP != null) {
            c.h.a.i.r.a aVar = (c.h.a.i.r.a) mVarP.d(c.h.a.i.r.a.class);
            c.f.d.m mVar = new c.f.d.m();
            mVar.C("api_username", "EJzcbx8B4J2mBEa");
            mVar.C("api_password", "CutwKMP2fF3er29");
            mVar.C("activation_code", str);
            mVar.C("mac_address", c.h.a.h.n.e.v(this.f17292a));
            aVar.f(mVar).x(new C0230a());
        }
    }
}
