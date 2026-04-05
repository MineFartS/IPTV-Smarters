package a.l.d;

import a.p.f;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class w extends a.e0.a.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f2482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f2484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<Fragment.m> f2485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<Fragment> f2486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Fragment f2487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2488i;

    @Deprecated
    public w(n nVar) {
        this(nVar, 0);
    }

    public w(n nVar, int i2) {
        this.f2484e = null;
        this.f2485f = new ArrayList<>();
        this.f2486g = new ArrayList<>();
        this.f2487h = null;
        this.f2482c = nVar;
        this.f2483d = i2;
    }

    @Override // a.e0.a.a
    public void a(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f2484e == null) {
            this.f2484e = this.f2482c.m();
        }
        while (this.f2485f.size() <= i2) {
            this.f2485f.add(null);
        }
        this.f2485f.set(i2, fragment.isAdded() ? this.f2482c.m1(fragment) : null);
        this.f2486g.set(i2, null);
        this.f2484e.q(fragment);
        if (fragment.equals(this.f2487h)) {
            this.f2487h = null;
        }
    }

    @Override // a.e0.a.a
    public void b(ViewGroup viewGroup) {
        y yVar = this.f2484e;
        if (yVar != null) {
            if (!this.f2488i) {
                try {
                    this.f2488i = true;
                    yVar.m();
                } finally {
                    this.f2488i = false;
                }
            }
            this.f2484e = null;
        }
    }

    @Override // a.e0.a.a
    public Object g(ViewGroup viewGroup, int i2) {
        Fragment.m mVar;
        Fragment fragment;
        if (this.f2486g.size() > i2 && (fragment = this.f2486g.get(i2)) != null) {
            return fragment;
        }
        if (this.f2484e == null) {
            this.f2484e = this.f2482c.m();
        }
        Fragment fragmentP = p(i2);
        if (this.f2485f.size() > i2 && (mVar = this.f2485f.get(i2)) != null) {
            fragmentP.setInitialSavedState(mVar);
        }
        while (this.f2486g.size() <= i2) {
            this.f2486g.add(null);
        }
        fragmentP.setMenuVisibility(false);
        if (this.f2483d == 0) {
            fragmentP.setUserVisibleHint(false);
        }
        this.f2486g.set(i2, fragmentP);
        this.f2484e.b(viewGroup.getId(), fragmentP);
        if (this.f2483d == 1) {
            this.f2484e.v(fragmentP, f.c.STARTED);
        }
        return fragmentP;
    }

    @Override // a.e0.a.a
    public boolean h(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // a.e0.a.a
    public void j(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f2485f.clear();
            this.f2486g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f2485f.add((Fragment.m) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i2 = Integer.parseInt(str.substring(1));
                    Fragment fragmentP0 = this.f2482c.p0(bundle, str);
                    if (fragmentP0 != null) {
                        while (this.f2486g.size() <= i2) {
                            this.f2486g.add(null);
                        }
                        fragmentP0.setMenuVisibility(false);
                        this.f2486g.set(i2, fragmentP0);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // a.e0.a.a
    public Parcelable k() {
        Bundle bundle;
        if (this.f2485f.size() > 0) {
            bundle = new Bundle();
            Fragment.m[] mVarArr = new Fragment.m[this.f2485f.size()];
            this.f2485f.toArray(mVarArr);
            bundle.putParcelableArray("states", mVarArr);
        } else {
            bundle = null;
        }
        for (int i2 = 0; i2 < this.f2486g.size(); i2++) {
            Fragment fragment = this.f2486g.get(i2);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f2482c.d1(bundle, "f" + i2, fragment);
            }
        }
        return bundle;
    }

    @Override // a.e0.a.a
    public void l(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2487h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f2483d == 1) {
                    if (this.f2484e == null) {
                        this.f2484e = this.f2482c.m();
                    }
                    this.f2484e.v(this.f2487h, f.c.STARTED);
                } else {
                    this.f2487h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f2483d == 1) {
                if (this.f2484e == null) {
                    this.f2484e = this.f2482c.m();
                }
                this.f2484e.v(fragment, f.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f2487h = fragment;
        }
    }

    @Override // a.e0.a.a
    public void n(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment p(int i2);
}
