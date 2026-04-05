package c.f.a.c.j.h;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f13208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ va f13209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f13210h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, Activity activity, va vaVar) {
        super(d0Var.f13254b, true);
        this.f13210h = d0Var;
        this.f13208f = activity;
        this.f13209g = vaVar;
    }

    @Override // c.f.a.c.j.h.v
    public final void a() {
        this.f13210h.f13254b.f13299k.onActivitySaveInstanceState(c.f.a.c.g.b.K2(this.f13208f), this.f13209g, this.f13573c);
    }
}
