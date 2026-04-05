package a.z;

import a.p.f;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavedStateRegistry f3989b = new SavedStateRegistry();

    public b(c cVar) {
        this.f3988a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public SavedStateRegistry b() {
        return this.f3989b;
    }

    public void c(Bundle bundle) {
        f lifecycle = this.f3988a.getLifecycle();
        if (lifecycle.b() != f.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(this.f3988a));
        this.f3989b.b(lifecycle, bundle);
    }

    public void d(Bundle bundle) {
        this.f3989b.c(bundle);
    }
}
