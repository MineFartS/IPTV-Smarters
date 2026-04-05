package c.h.a.j;

import android.content.Context;
import android.util.Log;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.BillingAddOrderCallback;
import minefarts.iptvsmarters.model.callback.BillingCheckGPACallback;
import minefarts.iptvsmarters.model.callback.BillingGetDevicesCallback;
import minefarts.iptvsmarters.model.callback.BillingIsPurchasedCallback;
import minefarts.iptvsmarters.model.callback.BillingLoginClientCallback;
import minefarts.iptvsmarters.model.callback.BillingUpdateDevicesCallback;
import minefarts.iptvsmarters.model.callback.RegisterClientCallback;
import o.l;
import o.m;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.h.a.k.f.d f17296b;

    public class a implements o.d<RegisterClientCallback> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<RegisterClientCallback> bVar, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
        }

        @Override // o.d
        public void b(o.b<RegisterClientCallback> bVar, l<RegisterClientCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
            } else {
                b.this.f17296b.S(lVar.a());
            }
        }
    }

    /* JADX INFO: renamed from: c.h.a.j.b$b, reason: collision with other inner class name */
    public class C0231b implements o.d<BillingLoginClientCallback> {
        public C0231b() {
        }

        @Override // o.d
        public void a(o.b<BillingLoginClientCallback> bVar, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
        }

        @Override // o.d
        public void b(o.b<BillingLoginClientCallback> bVar, l<BillingLoginClientCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
            } else {
                b.this.f17296b.e0(lVar.a());
            }
        }
    }

    public class c implements o.d<BillingIsPurchasedCallback> {
        public c() {
        }

        @Override // o.d
        public void a(o.b<BillingIsPurchasedCallback> bVar, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
        }

        @Override // o.d
        public void b(o.b<BillingIsPurchasedCallback> bVar, l<BillingIsPurchasedCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
            } else {
                b.this.f17296b.V(lVar.a());
            }
        }
    }

    public class d implements o.d<BillingAddOrderCallback> {
        public d() {
        }

        @Override // o.d
        public void a(o.b<BillingAddOrderCallback> bVar, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
        }

        @Override // o.d
        public void b(o.b<BillingAddOrderCallback> bVar, l<BillingAddOrderCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
            } else {
                b.this.f17296b.E(lVar.a());
            }
        }
    }

    public class e implements o.d<BillingCheckGPACallback> {
        public e() {
        }

        @Override // o.d
        public void a(o.b<BillingCheckGPACallback> bVar, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
        }

        @Override // o.d
        public void b(o.b<BillingCheckGPACallback> bVar, l<BillingCheckGPACallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
            } else {
                b.this.f17296b.z(lVar.a());
            }
        }
    }

    public class f implements o.d<BillingGetDevicesCallback> {
        public f() {
        }

        @Override // o.d
        public void a(o.b<BillingGetDevicesCallback> bVar, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
        }

        @Override // o.d
        public void b(o.b<BillingGetDevicesCallback> bVar, l<BillingGetDevicesCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
            } else {
                b.this.f17296b.d(lVar.a());
            }
        }
    }

    public class g implements o.d<BillingUpdateDevicesCallback> {
        public g() {
        }

        @Override // o.d
        public void a(o.b<BillingUpdateDevicesCallback> bVar, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
        }

        @Override // o.d
        public void b(o.b<BillingUpdateDevicesCallback> bVar, l<BillingUpdateDevicesCallback> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                b.this.f17296b.c(b.this.f17295a.getResources().getString(R.string.something_wrong));
            } else {
                b.this.f17296b.g0(lVar.a());
            }
        }
    }

    public b(Context context, c.h.a.k.f.d dVar) {
        this.f17295a = context;
        this.f17296b = dVar;
    }

    public void c(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, String str8) {
        this.f17296b.a();
        m mVarA0 = c.h.a.h.n.e.a0(this.f17295a);
        if (mVarA0 != null) {
            ((c.h.a.i.r.a) mVarA0.d(c.h.a.i.r.a.class)).a("Vu6HilnbLo63", str, str5, "T6Vk3rLFQBeu3n6s", c.h.a.f.b.f16735b, str4, str2, "addorder", str3, i2, str6, str7, str8).x(new d());
        }
    }

    public void d(String str, String str2) {
        m mVarA0 = c.h.a.h.n.e.a0(this.f17295a);
        if (mVarA0 != null) {
            ((c.h.a.i.r.a) mVarA0.d(c.h.a.i.r.a.class)).l("Vu6HilnbLo63", str2, str, "T6Vk3rLFQBeu3n6s", c.h.a.f.b.f16735b, "checkgpa").x(new e());
        }
    }

    public void e(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7) {
        this.f17296b.a();
        m mVarA0 = c.h.a.h.n.e.a0(this.f17295a);
        if (mVarA0 != null) {
            ((c.h.a.i.r.a) mVarA0.d(c.h.a.i.r.a.class)).b("Vu6HilnbLo63", str, str5, "T6Vk3rLFQBeu3n6s", c.h.a.f.b.f16735b, str4, str2, "checkorder", str3, i2, str6, str7).x(new c());
        }
    }

    public void f(String str, String str2, String str3, int i2) {
        this.f17296b.a();
        m mVarA0 = c.h.a.h.n.e.a0(this.f17295a);
        if (mVarA0 != null) {
            ((c.h.a.i.r.a) mVarA0.d(c.h.a.i.r.a.class)).k("Vu6HilnbLo63", str, str3, "T6Vk3rLFQBeu3n6s", c.h.a.f.b.f16735b, str2, i2, "alldevices").x(new f());
        }
    }

    public void g(String str, String str2, String str3, String str4, String str5) {
        this.f17296b.a();
        m mVarA0 = c.h.a.h.n.e.a0(this.f17295a);
        if (mVarA0 != null) {
            ((c.h.a.i.r.a) mVarA0.d(c.h.a.i.r.a.class)).m("Vu6HilnbLo63", str, str5, "T6Vk3rLFQBeu3n6s", c.h.a.f.b.f16735b, str4, str2, "login", str3).x(new C0231b());
        }
    }

    public void h(String str, String str2, String str3, String str4, String str5) {
        this.f17296b.a();
        m mVarA0 = c.h.a.h.n.e.a0(this.f17295a);
        if (mVarA0 != null) {
            ((c.h.a.i.r.a) mVarA0.d(c.h.a.i.r.a.class)).z(str, str5, "Vu6HilnbLo63", c.h.a.f.b.f16735b, str2, "T6Vk3rLFQBeu3n6s", "register", str3, str4).x(new a());
        }
    }

    public void i(String str, String str2, int i2, String str3, String str4, String str5) {
        this.f17296b.a();
        m mVarA0 = c.h.a.h.n.e.a0(this.f17295a);
        if (mVarA0 != null) {
            ((c.h.a.i.r.a) mVarA0.d(c.h.a.i.r.a.class)).q("Vu6HilnbLo63", str, str2, "T6Vk3rLFQBeu3n6s", c.h.a.f.b.f16735b, i2, "updatedevice", str3, str4, str5).x(new g());
        }
    }
}
