package c.f.a.c.j.h;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f13234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f13235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, Activity activity) {
        super(d0Var.f13254b, true);
        this.f13235g = d0Var;
        this.f13234f = activity;
    }

    @Override // c.f.a.c.j.h.v
    public final void a() {
        this.f13235g.f13254b.f13299k.onActivityDestroyed(c.f.a.c.g.b.K2(this.f13234f), this.f13573c);
    }
}
