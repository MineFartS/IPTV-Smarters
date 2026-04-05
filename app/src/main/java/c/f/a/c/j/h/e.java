package c.f.a.c.j.h;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f13285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f13286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f13287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f13288i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e0 e0Var, Activity activity, String str, String str2) {
        super(e0Var, true);
        this.f13288i = e0Var;
        this.f13285f = activity;
        this.f13286g = str;
        this.f13287h = str2;
    }

    @Override // c.f.a.c.j.h.v
    public final void a() {
        this.f13288i.f13299k.setCurrentScreen(c.f.a.c.g.b.K2(this.f13285f), this.f13286g, this.f13287h, this.f13572b);
    }
}
