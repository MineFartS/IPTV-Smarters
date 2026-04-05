package a.l.d;

import a.p.f;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
public class c0 implements a.z.c, a.p.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fragment f2317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.p.x f2318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a.p.l f2319d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a.z.b f2320e = null;

    public c0(Fragment fragment, a.p.x xVar) {
        this.f2317b = fragment;
        this.f2318c = xVar;
    }

    public void a(f.b bVar) {
        this.f2319d.h(bVar);
    }

    public void b() {
        if (this.f2319d == null) {
            this.f2319d = new a.p.l(this);
            this.f2320e = a.z.b.a(this);
        }
    }

    public boolean c() {
        return this.f2319d != null;
    }

    public void d(Bundle bundle) {
        this.f2320e.c(bundle);
    }

    public void e(Bundle bundle) {
        this.f2320e.d(bundle);
    }

    public void f(f.c cVar) {
        this.f2319d.o(cVar);
    }

    @Override // a.p.k
    public a.p.f getLifecycle() {
        b();
        return this.f2319d;
    }

    @Override // a.z.c
    public SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.f2320e.b();
    }

    @Override // a.p.y
    public a.p.x getViewModelStore() {
        b();
        return this.f2318c;
    }
}
