package c.d.a.o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class n extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.d.a.j f5879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.d.a.o.a f5880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f5881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet<n> f5882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f5883f;

    public class b implements l {
        public b() {
        }
    }

    public n() {
        this(new c.d.a.o.a());
    }

    @SuppressLint({"ValidFragment"})
    public n(c.d.a.o.a aVar) {
        this.f5881d = new b();
        this.f5882e = new HashSet<>();
        this.f5880c = aVar;
    }

    public final void l(n nVar) {
        this.f5882e.add(nVar);
    }

    public c.d.a.o.a n() {
        return this.f5880c;
    }

    public c.d.a.j o() {
        return this.f5879b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            n nVarI = k.f().i(getActivity().getSupportFragmentManager());
            this.f5883f = nVarI;
            if (nVarI != this) {
                nVarI.l(this);
            }
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f5880c.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        n nVar = this.f5883f;
        if (nVar != null) {
            nVar.r(this);
            this.f5883f = null;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        c.d.a.j jVar = this.f5879b;
        if (jVar != null) {
            jVar.s();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f5880c.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f5880c.d();
    }

    public l q() {
        return this.f5881d;
    }

    public final void r(n nVar) {
        this.f5882e.remove(nVar);
    }

    public void u(c.d.a.j jVar) {
        this.f5879b = jVar;
    }
}
