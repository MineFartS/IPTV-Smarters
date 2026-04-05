package androidx.savedstate;

import a.p.f;
import a.p.i;
import a.p.k;
import a.z.c;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f4962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Recreator.a f4964d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.c.a.b.b<String, b> f4961a = new a.c.a.b.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4965e = true;

    public interface a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (!this.f4963c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f4962b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f4962b.remove(str);
        if (this.f4962b.isEmpty()) {
            this.f4962b = null;
        }
        return bundle2;
    }

    public void b(f fVar, Bundle bundle) {
        if (this.f4963c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f4962b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        fVar.a(new i() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // a.p.i
            public void d(k kVar, f.b bVar) {
                SavedStateRegistry savedStateRegistry;
                boolean z;
                if (bVar == f.b.ON_START) {
                    savedStateRegistry = SavedStateRegistry.this;
                    z = true;
                } else {
                    if (bVar != f.b.ON_STOP) {
                        return;
                    }
                    savedStateRegistry = SavedStateRegistry.this;
                    z = false;
                }
                savedStateRegistry.f4965e = z;
            }
        });
        this.f4963c = true;
    }

    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4962b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        a.c.a.b.b<String, b>.d dVarF = this.f4961a.f();
        while (dVarF.hasNext()) {
            Map.Entry next = dVarF.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String str, b bVar) {
        if (this.f4961a.i(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e(Class<? extends a> cls) {
        if (!this.f4965e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f4964d == null) {
            this.f4964d = new Recreator.a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            this.f4964d.b(cls.getName());
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}
