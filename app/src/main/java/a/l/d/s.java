package a.l.d;

import a.p.f;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class s extends a.e0.a.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f2456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f2458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Fragment f2459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2460g;

    @Deprecated
    public s(n nVar) {
        this(nVar, 0);
    }

    public s(n nVar, int i2) {
        this.f2458e = null;
        this.f2459f = null;
        this.f2456c = nVar;
        this.f2457d = i2;
    }

    public static String r(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }

    @Override // a.e0.a.a
    public void a(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f2458e == null) {
            this.f2458e = this.f2456c.m();
        }
        this.f2458e.n(fragment);
        if (fragment.equals(this.f2459f)) {
            this.f2459f = null;
        }
    }

    @Override // a.e0.a.a
    public void b(ViewGroup viewGroup) {
        y yVar = this.f2458e;
        if (yVar != null) {
            if (!this.f2460g) {
                try {
                    this.f2460g = true;
                    yVar.m();
                } finally {
                    this.f2460g = false;
                }
            }
            this.f2458e = null;
        }
    }

    @Override // a.e0.a.a
    public Object g(ViewGroup viewGroup, int i2) {
        if (this.f2458e == null) {
            this.f2458e = this.f2456c.m();
        }
        long jQ = q(i2);
        Fragment fragmentI0 = this.f2456c.i0(r(viewGroup.getId(), jQ));
        if (fragmentI0 != null) {
            this.f2458e.i(fragmentI0);
        } else {
            fragmentI0 = p(i2);
            this.f2458e.c(viewGroup.getId(), fragmentI0, r(viewGroup.getId(), jQ));
        }
        if (fragmentI0 != this.f2459f) {
            fragmentI0.setMenuVisibility(false);
            if (this.f2457d == 1) {
                this.f2458e.v(fragmentI0, f.c.STARTED);
            } else {
                fragmentI0.setUserVisibleHint(false);
            }
        }
        return fragmentI0;
    }

    @Override // a.e0.a.a
    public boolean h(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // a.e0.a.a
    public void j(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // a.e0.a.a
    public Parcelable k() {
        return null;
    }

    @Override // a.e0.a.a
    public void l(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2459f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f2457d == 1) {
                    if (this.f2458e == null) {
                        this.f2458e = this.f2456c.m();
                    }
                    this.f2458e.v(this.f2459f, f.c.STARTED);
                } else {
                    this.f2459f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f2457d == 1) {
                if (this.f2458e == null) {
                    this.f2458e = this.f2456c.m();
                }
                this.f2458e.v(fragment, f.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f2459f = fragment;
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

    public long q(int i2) {
        return i2;
    }
}
