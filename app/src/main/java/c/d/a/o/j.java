package c.d.a.o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(11)
public class j extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.o.a f5865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f5866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.d.a.j f5867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet<j> f5868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f5869f;

    public class b implements l {
        public b() {
        }
    }

    public j() {
        this(new c.d.a.o.a());
    }

    @SuppressLint({"ValidFragment"})
    public j(c.d.a.o.a aVar) {
        this.f5866c = new b();
        this.f5868e = new HashSet<>();
        this.f5865b = aVar;
    }

    public final void a(j jVar) {
        this.f5868e.add(jVar);
    }

    public c.d.a.o.a b() {
        return this.f5865b;
    }

    public c.d.a.j c() {
        return this.f5867d;
    }

    public l d() {
        return this.f5866c;
    }

    public final void e(j jVar) {
        this.f5868e.remove(jVar);
    }

    public void f(c.d.a.j jVar) {
        this.f5867d = jVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            j jVarH = k.f().h(getActivity().getFragmentManager());
            this.f5869f = jVarH;
            if (jVarH != this) {
                jVarH.a(this);
            }
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f5865b.b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        j jVar = this.f5869f;
        if (jVar != null) {
            jVar.e(this);
            this.f5869f = null;
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        c.d.a.j jVar = this.f5867d;
        if (jVar != null) {
            jVar.s();
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f5865b.c();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f5865b.d();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        c.d.a.j jVar = this.f5867d;
        if (jVar != null) {
            jVar.t(i2);
        }
    }
}
