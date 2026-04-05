package androidx.navigation.fragment;

import a.l.d.d;
import a.l.d.n;
import a.p.f;
import a.p.i;
import a.p.k;
import a.v.b;
import a.v.p;
import a.v.s;
import a.v.x.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
@s.b("dialog")
public final class DialogFragmentNavigator extends s<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f4731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4732c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet<String> f4733d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f4734e = new i() { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1
        @Override // a.p.i
        public void d(k kVar, f.b bVar) {
            if (bVar == f.b.ON_STOP) {
                d dVar = (d) kVar;
                if (dVar.C().isShowing()) {
                    return;
                }
                NavHostFragment.n(dVar).u();
            }
        }
    };

    public static class a extends a.v.k implements b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f4736k;

        public a(s<? extends a> sVar) {
            super(sVar);
        }

        @Override // a.v.k
        public void F(Context context, AttributeSet attributeSet) {
            super.F(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, c.f3671c);
            String string = typedArrayObtainAttributes.getString(c.f3672d);
            if (string != null) {
                O(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final String N() {
            String str = this.f4736k;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        public final a O(String str) {
            this.f4736k = str;
            return this;
        }
    }

    public DialogFragmentNavigator(Context context, n nVar) {
        this.f4730a = context;
        this.f4731b = nVar;
    }

    @Override // a.v.s
    public void c(Bundle bundle) {
        if (bundle != null) {
            this.f4732c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            for (int i2 = 0; i2 < this.f4732c; i2++) {
                d dVar = (d) this.f4731b.i0("androidx-nav-fragment:navigator:dialog:" + i2);
                if (dVar != null) {
                    dVar.getLifecycle().a(this.f4734e);
                } else {
                    this.f4733d.add("androidx-nav-fragment:navigator:dialog:" + i2);
                }
            }
        }
    }

    @Override // a.v.s
    public Bundle d() {
        if (this.f4732c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f4732c);
        return bundle;
    }

    @Override // a.v.s
    public boolean e() {
        if (this.f4732c == 0) {
            return false;
        }
        if (this.f4731b.L0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        n nVar = this.f4731b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i2 = this.f4732c - 1;
        this.f4732c = i2;
        sb.append(i2);
        Fragment fragmentI0 = nVar.i0(sb.toString());
        if (fragmentI0 != null) {
            fragmentI0.getLifecycle().c(this.f4734e);
            ((d) fragmentI0).q();
        }
        return true;
    }

    @Override // a.v.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this);
    }

    @Override // a.v.s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a.v.k b(a aVar, Bundle bundle, p pVar, s.a aVar2) {
        if (this.f4731b.L0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String strN = aVar.N();
        if (strN.charAt(0) == '.') {
            strN = this.f4730a.getPackageName() + strN;
        }
        Fragment fragmentA = this.f4731b.r0().a(this.f4730a.getClassLoader(), strN);
        if (!d.class.isAssignableFrom(fragmentA.getClass())) {
            throw new IllegalArgumentException("Dialog destination " + aVar.N() + " is not an instance of DialogFragment");
        }
        d dVar = (d) fragmentA;
        dVar.setArguments(bundle);
        dVar.getLifecycle().a(this.f4734e);
        n nVar = this.f4731b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i2 = this.f4732c;
        this.f4732c = i2 + 1;
        sb.append(i2);
        dVar.J(nVar, sb.toString());
        return aVar;
    }

    public void h(Fragment fragment) {
        if (this.f4733d.remove(fragment.getTag())) {
            fragment.getLifecycle().a(this.f4734e);
        }
    }
}
