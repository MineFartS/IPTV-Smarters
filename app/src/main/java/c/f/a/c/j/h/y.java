package c.f.a.c.j.h;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f13638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f13639g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(d0 d0Var, Activity activity) {
        super(d0Var.f13254b, true);
        this.f13639g = d0Var;
        this.f13638f = activity;
    }

    @Override // c.f.a.c.j.h.v
    public final void a() {
        this.f13639g.f13254b.f13299k.onActivityResumed(c.f.a.c.g.b.K2(this.f13638f), this.f13573c);
    }
}
