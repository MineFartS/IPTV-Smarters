package c.f.a.c.f.o.n;

import android.util.Log;
import c.f.a.c.f.o.a;
import c.f.a.c.f.q.c;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements c.InterfaceC0159c, y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.f f12410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<?> f12411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.f.a.c.f.q.i f12412c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set<Scope> f12413d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12414e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f12415f;

    public g0(g gVar, a.f fVar, b<?> bVar) {
        this.f12415f = gVar;
        this.f12410a = fVar;
        this.f12411b = bVar;
    }

    public static /* synthetic */ boolean e(g0 g0Var, boolean z) {
        g0Var.f12414e = true;
        return true;
    }

    @Override // c.f.a.c.f.q.c.InterfaceC0159c
    public final void a(c.f.a.c.f.b bVar) {
        this.f12415f.u.post(new f0(this, bVar));
    }

    @Override // c.f.a.c.f.o.n.y0
    public final void b(c.f.a.c.f.q.i iVar, Set<Scope> set) {
        if (iVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new c.f.a.c.f.b(4));
        } else {
            this.f12412c = iVar;
            this.f12413d = set;
            h();
        }
    }

    @Override // c.f.a.c.f.o.n.y0
    public final void c(c.f.a.c.f.b bVar) {
        d0 d0Var = (d0) this.f12415f.q.get(this.f12411b);
        if (d0Var != null) {
            d0Var.o(bVar);
        }
    }

    public final void h() {
        c.f.a.c.f.q.i iVar;
        if (!this.f12414e || (iVar = this.f12412c) == null) {
            return;
        }
        this.f12410a.getRemoteService(iVar, this.f12413d);
    }
}
