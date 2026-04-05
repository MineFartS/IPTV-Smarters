package c.f.a.c.j.c;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends c.f.a.c.d.u.t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.c.d.u.c f12842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f12843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ge f12844f;

    public g(Context context, c.f.a.c.d.u.c cVar, o oVar) {
        super(context, cVar.O().isEmpty() ? c.f.a.c.d.f.a(cVar.L()) : c.f.a.c.d.f.b(cVar.L(), cVar.O()));
        this.f12842d = cVar;
        this.f12843e = oVar;
        this.f12844f = new f();
    }

    @Override // c.f.a.c.d.u.t
    public final c.f.a.c.d.u.q a(String str) {
        return new c.f.a.c.d.u.d(c(), b(), str, this.f12842d, this.f12844f, new c.f.a.c.d.u.u.k.m(c(), this.f12842d, this.f12843e));
    }

    @Override // c.f.a.c.d.u.t
    public final boolean d() {
        return this.f12842d.M();
    }
}
