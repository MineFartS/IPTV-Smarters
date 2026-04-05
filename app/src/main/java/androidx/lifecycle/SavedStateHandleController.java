package androidx.lifecycle;

import a.p.f;
import a.p.i;
import a.p.k;
import a.p.t;
import a.p.v;
import a.p.x;
import a.p.y;
import a.z.c;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4644c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f4645d;

    public static final class a implements SavedStateRegistry.a {
        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(c cVar) {
            if (!(cVar instanceof y)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            x viewModelStore = ((y) cVar).getViewModelStore();
            SavedStateRegistry savedStateRegistry = cVar.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                SavedStateHandleController.c(viewModelStore.b(it.next()), savedStateRegistry, cVar.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.e(a.class);
        }
    }

    public SavedStateHandleController(String str, t tVar) {
        this.f4643b = str;
        this.f4645d = tVar;
    }

    public static void c(v vVar, SavedStateRegistry savedStateRegistry, f fVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) vVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.l()) {
            return;
        }
        savedStateHandleController.g(savedStateRegistry, fVar);
        m(savedStateRegistry, fVar);
    }

    public static SavedStateHandleController j(SavedStateRegistry savedStateRegistry, f fVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, t.a(savedStateRegistry.a(str), bundle));
        savedStateHandleController.g(savedStateRegistry, fVar);
        m(savedStateRegistry, fVar);
        return savedStateHandleController;
    }

    public static void m(final SavedStateRegistry savedStateRegistry, final f fVar) {
        f.c cVarB = fVar.b();
        if (cVarB == f.c.INITIALIZED || cVarB.isAtLeast(f.c.STARTED)) {
            savedStateRegistry.e(a.class);
        } else {
            fVar.a(new i() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // a.p.i
                public void d(k kVar, f.b bVar) {
                    if (bVar == f.b.ON_START) {
                        fVar.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        }
    }

    @Override // a.p.i
    public void d(k kVar, f.b bVar) {
        if (bVar == f.b.ON_DESTROY) {
            this.f4644c = false;
            kVar.getLifecycle().c(this);
        }
    }

    public void g(SavedStateRegistry savedStateRegistry, f fVar) {
        if (this.f4644c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f4644c = true;
        fVar.a(this);
        savedStateRegistry.d(this.f4643b, this.f4645d.b());
    }

    public t k() {
        return this.f4645d;
    }

    public boolean l() {
        return this.f4644c;
    }
}
