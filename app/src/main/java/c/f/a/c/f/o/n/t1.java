package c.f.a.c.f.o.n;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f12506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1 f12508d;

    public t1(u1 u1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f12508d = u1Var;
        this.f12506b = lifecycleCallback;
        this.f12507c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12508d.f12514d > 0) {
            this.f12506b.f(this.f12508d.f12515e != null ? this.f12508d.f12515e.getBundle(this.f12507c) : null);
        }
        if (this.f12508d.f12514d >= 2) {
            this.f12506b.j();
        }
        if (this.f12508d.f12514d >= 3) {
            this.f12506b.h();
        }
        if (this.f12508d.f12514d >= 4) {
            this.f12506b.k();
        }
        if (this.f12508d.f12514d >= 5) {
            this.f12506b.g();
        }
    }
}
