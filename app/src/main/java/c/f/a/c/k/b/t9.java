package c.f.a.c.k.b;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class t9 implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ la f14332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x9 f14333b;

    public t9(x9 x9Var, la laVar) {
        this.f14333b = x9Var;
        this.f14332a = laVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        c.f.a.c.j.h.ha.a();
        if (!this.f14333b.W().w(null, m3.I0) || (this.f14333b.m0(this.f14332a.f14070b).h() && g.c(this.f14332a.w).h())) {
            return this.f14333b.C(this.f14332a).O();
        }
        this.f14333b.c().w().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
