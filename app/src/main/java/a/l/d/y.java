package a.l.d;

import a.p.f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f2492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f2493b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2500i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f2504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f2506o;
    public ArrayList<String> p;
    public ArrayList<String> q;
    public ArrayList<Runnable> s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<a> f2494c = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2501j = true;
    public boolean r = false;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Fragment f2508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public f.c f2513g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public f.c f2514h;

        public a() {
        }

        public a(int i2, Fragment fragment) {
            this.f2507a = i2;
            this.f2508b = fragment;
            f.c cVar = f.c.RESUMED;
            this.f2513g = cVar;
            this.f2514h = cVar;
        }

        public a(int i2, Fragment fragment, f.c cVar) {
            this.f2507a = i2;
            this.f2508b = fragment;
            this.f2513g = fragment.mMaxState;
            this.f2514h = cVar;
        }
    }

    public y(j jVar, ClassLoader classLoader) {
        this.f2492a = jVar;
        this.f2493b = classLoader;
    }

    public y b(int i2, Fragment fragment) {
        p(i2, fragment, null, 1);
        return this;
    }

    public y c(int i2, Fragment fragment, String str) {
        p(i2, fragment, str, 1);
        return this;
    }

    public y d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public y e(Fragment fragment, String str) {
        p(0, fragment, str, 1);
        return this;
    }

    public void f(a aVar) {
        this.f2494c.add(aVar);
        aVar.f2509c = this.f2495d;
        aVar.f2510d = this.f2496e;
        aVar.f2511e = this.f2497f;
        aVar.f2512f = this.f2498g;
    }

    public y g(View view, String str) {
        if (z.C()) {
            String strL = a.i.r.x.L(view);
            if (strL == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.p == null) {
                this.p = new ArrayList<>();
                this.q = new ArrayList<>();
            } else {
                if (this.q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.p.contains(strL)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + strL + "' has already been added to the transaction.");
                }
            }
            this.p.add(strL);
            this.q.add(str);
        }
        return this;
    }

    public y h(String str) {
        if (!this.f2501j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f2500i = true;
        this.f2502k = str;
        return this;
    }

    public y i(Fragment fragment) {
        f(new a(7, fragment));
        return this;
    }

    public abstract int j();

    public abstract int k();

    public abstract void l();

    public abstract void m();

    public y n(Fragment fragment) {
        f(new a(6, fragment));
        return this;
    }

    public y o() {
        if (this.f2500i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2501j = false;
        return this;
    }

    public void p(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i4 = fragment.mFragmentId;
            if (i4 != 0 && i4 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
            }
            fragment.mFragmentId = i2;
            fragment.mContainerId = i2;
        }
        f(new a(i3, fragment));
    }

    public y q(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public y r(int i2, Fragment fragment) {
        return s(i2, fragment, null);
    }

    public y s(int i2, Fragment fragment, String str) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        p(i2, fragment, str, 2);
        return this;
    }

    public y t(int i2, int i3) {
        return u(i2, i3, 0, 0);
    }

    public y u(int i2, int i3, int i4, int i5) {
        this.f2495d = i2;
        this.f2496e = i3;
        this.f2497f = i4;
        this.f2498g = i5;
        return this;
    }

    public y v(Fragment fragment, f.c cVar) {
        f(new a(10, fragment, cVar));
        return this;
    }

    public y w(Fragment fragment) {
        f(new a(8, fragment));
        return this;
    }

    public y x(boolean z) {
        this.r = z;
        return this;
    }
}
