package c.f.a.c.j.h;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f13616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f13617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(d0 d0Var, Activity activity) {
        super(d0Var.f13254b, true);
        this.f13617g = d0Var;
        this.f13616f = activity;
    }

    @Override // c.f.a.c.j.h.v
    public final void a() {
        this.f13617g.f13254b.f13299k.onActivityStarted(c.f.a.c.g.b.K2(this.f13616f), this.f13573c);
    }
}
