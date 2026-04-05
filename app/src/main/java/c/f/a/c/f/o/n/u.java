package c.f.a.c.f.o.n;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends o1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a.f.b<b<?>> f12509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f12510h;

    public u(i iVar, g gVar, c.f.a.c.f.e eVar) {
        super(iVar, eVar);
        this.f12509g = new a.f.b<>();
        this.f12510h = gVar;
        this.f24257b.d("ConnectionlessLifecycleHelper", this);
    }

    public static void t(Activity activity, g gVar, b<?> bVar) {
        i iVarC = LifecycleCallback.c(activity);
        u uVar = (u) iVarC.e("ConnectionlessLifecycleHelper", u.class);
        if (uVar == null) {
            uVar = new u(iVarC, gVar, c.f.a.c.f.e.n());
        }
        c.f.a.c.f.q.o.j(bVar, "ApiKey cannot be null");
        uVar.f12509g.add(bVar);
        gVar.p(uVar);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // c.f.a.c.f.o.n.o1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // c.f.a.c.f.o.n.o1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f12510h.q(this);
    }

    @Override // c.f.a.c.f.o.n.o1
    public final void o(c.f.a.c.f.b bVar, int i2) {
        this.f12510h.A(bVar, i2);
    }

    @Override // c.f.a.c.f.o.n.o1
    public final void p() {
        this.f12510h.s();
    }

    public final a.f.b<b<?>> u() {
        return this.f12509g;
    }

    public final void v() {
        if (this.f12509g.isEmpty()) {
            return;
        }
        this.f12510h.p(this);
    }
}
