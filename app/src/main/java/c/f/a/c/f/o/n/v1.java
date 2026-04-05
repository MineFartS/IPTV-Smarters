package c.f.a.c.f.o.n;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f12519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w1 f12521d;

    public v1(w1 w1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f12521d = w1Var;
        this.f12519b = lifecycleCallback;
        this.f12520c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12521d.f12526d > 0) {
            this.f12519b.f(this.f12521d.f12527e != null ? this.f12521d.f12527e.getBundle(this.f12520c) : null);
        }
        if (this.f12521d.f12526d >= 2) {
            this.f12519b.j();
        }
        if (this.f12521d.f12526d >= 3) {
            this.f12519b.h();
        }
        if (this.f12521d.f12526d >= 4) {
            this.f12519b.k();
        }
        if (this.f12521d.f12526d >= 5) {
            this.f12519b.g();
        }
    }
}
