package a.l.d;

import a.i.n.b;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f2346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<e> f2347b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<e> f2348c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2349d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2350e = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f2351b;

        public a(d dVar) {
            this.f2351b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e0.this.f2347b.contains(this.f2351b)) {
                this.f2351b.e().applyState(this.f2351b.f().mView);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f2353b;

        public b(d dVar) {
            this.f2353b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f2347b.remove(this.f2353b);
            e0.this.f2348c.remove(this.f2353b);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2356b;

        static {
            int[] iArr = new int[e.b.values().length];
            f2356b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2356b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2356b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f2355a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2355a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2355a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2355a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final v f2357h;

        public d(e.c cVar, e.b bVar, v vVar, a.i.n.b bVar2) {
            super(cVar, bVar, vVar.k(), bVar2);
            this.f2357h = vVar;
        }

        @Override // a.l.d.e0.e
        public void c() {
            super.c();
            this.f2357h.m();
        }

        @Override // a.l.d.e0.e
        public void l() {
            if (g() == e.b.ADDING) {
                Fragment fragmentK = this.f2357h.k();
                View viewFindFocus = fragmentK.mView.findFocus();
                if (viewFindFocus != null) {
                    fragmentK.setFocusedView(viewFindFocus);
                    if (n.G0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK);
                    }
                }
                View viewRequireView = f().requireView();
                if (viewRequireView.getParent() == null) {
                    this.f2357h.b();
                    viewRequireView.setAlpha(0.0f);
                }
                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragmentK.getPostOnViewCreatedAlpha());
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f2358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f2359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Fragment f2360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<Runnable> f2361d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final HashSet<a.i.n.b> f2362e = new HashSet<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2363f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2364g = false;

        public class a implements b.a {
            public a() {
            }

            @Override // a.i.n.b.a
            public void a() {
                e.this.b();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c from(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i2);
            }

            public static c from(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            public void applyState(View view) {
                int i2;
                int i3 = c.f2355a[ordinal()];
                if (i3 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (n.G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i3 == 2) {
                    if (n.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i2 = 0;
                } else {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        if (n.G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (n.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }

        public e(c cVar, b bVar, Fragment fragment, a.i.n.b bVar2) {
            this.f2358a = cVar;
            this.f2359b = bVar;
            this.f2360c = fragment;
            bVar2.d(new a());
        }

        public final void a(Runnable runnable) {
            this.f2361d.add(runnable);
        }

        public final void b() {
            if (h()) {
                return;
            }
            this.f2363f = true;
            if (this.f2362e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f2362e).iterator();
            while (it.hasNext()) {
                ((a.i.n.b) it.next()).a();
            }
        }

        public void c() {
            if (this.f2364g) {
                return;
            }
            if (n.G0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2364g = true;
            Iterator<Runnable> it = this.f2361d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(a.i.n.b bVar) {
            if (this.f2362e.remove(bVar) && this.f2362e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f2358a;
        }

        public final Fragment f() {
            return this.f2360c;
        }

        public b g() {
            return this.f2359b;
        }

        public final boolean h() {
            return this.f2363f;
        }

        public final boolean i() {
            return this.f2364g;
        }

        public final void j(a.i.n.b bVar) {
            l();
            this.f2362e.add(bVar);
        }

        public final void k(c cVar, b bVar) {
            b bVar2;
            int i2 = c.f2356b[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3 && this.f2358a != c.REMOVED) {
                        if (n.G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2360c + " mFinalState = " + this.f2358a + " -> " + cVar + ". ");
                        }
                        this.f2358a = cVar;
                        return;
                    }
                    return;
                }
                if (n.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2360c + " mFinalState = " + this.f2358a + " -> REMOVED. mLifecycleImpact  = " + this.f2359b + " to REMOVING.");
                }
                this.f2358a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f2358a != c.REMOVED) {
                    return;
                }
                if (n.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2360c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2359b + " to ADDING.");
                }
                this.f2358a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f2359b = bVar2;
        }

        public void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f2358a + "} {mLifecycleImpact = " + this.f2359b + "} {mFragment = " + this.f2360c + "}";
        }
    }

    public e0(ViewGroup viewGroup) {
        this.f2346a = viewGroup;
    }

    public static e0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.z0());
    }

    public static e0 o(ViewGroup viewGroup, f0 f0Var) {
        int i2 = a.l.b.f2219b;
        Object tag = viewGroup.getTag(i2);
        if (tag instanceof e0) {
            return (e0) tag;
        }
        e0 e0VarA = f0Var.a(viewGroup);
        viewGroup.setTag(i2, e0VarA);
        return e0VarA;
    }

    public final void a(e.c cVar, e.b bVar, v vVar) {
        synchronized (this.f2347b) {
            a.i.n.b bVar2 = new a.i.n.b();
            e eVarH = h(vVar.k());
            if (eVarH != null) {
                eVarH.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, vVar, bVar2);
            this.f2347b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    public void b(e.c cVar, v vVar) {
        if (n.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + vVar.k());
        }
        a(cVar, e.b.ADDING, vVar);
    }

    public void c(v vVar) {
        if (n.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + vVar.k());
        }
        a(e.c.GONE, e.b.NONE, vVar);
    }

    public void d(v vVar) {
        if (n.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + vVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, vVar);
    }

    public void e(v vVar) {
        if (n.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + vVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, vVar);
    }

    public abstract void f(List<e> list, boolean z);

    public void g() {
        if (this.f2350e) {
            return;
        }
        if (!a.i.r.x.T(this.f2346a)) {
            j();
            this.f2349d = false;
            return;
        }
        synchronized (this.f2347b) {
            if (!this.f2347b.isEmpty()) {
                ArrayList<e> arrayList = new ArrayList(this.f2348c);
                this.f2348c.clear();
                for (e eVar : arrayList) {
                    if (n.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f2348c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f2347b);
                this.f2347b.clear();
                this.f2348c.addAll(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).l();
                }
                f(arrayList2, this.f2349d);
                this.f2349d = false;
            }
        }
    }

    public final e h(Fragment fragment) {
        for (e eVar : this.f2347b) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    public final e i(Fragment fragment) {
        for (e eVar : this.f2348c) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    public void j() {
        boolean zT = a.i.r.x.T(this.f2346a);
        synchronized (this.f2347b) {
            q();
            Iterator<e> it = this.f2347b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            for (e eVar : new ArrayList(this.f2348c)) {
                if (n.G0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(zT ? BuildConfig.FLAVOR : "Container " + this.f2346a + " is not attached to window. ");
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.b();
            }
            for (e eVar2 : new ArrayList(this.f2347b)) {
                if (n.G0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zT ? BuildConfig.FLAVOR : "Container " + this.f2346a + " is not attached to window. ");
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.b();
            }
        }
    }

    public void k() {
        if (this.f2350e) {
            this.f2350e = false;
            g();
        }
    }

    public e.b l(v vVar) {
        e eVarH = h(vVar.k());
        if (eVarH != null) {
            return eVarH.g();
        }
        e eVarI = i(vVar.k());
        if (eVarI != null) {
            return eVarI.g();
        }
        return null;
    }

    public ViewGroup m() {
        return this.f2346a;
    }

    public void p() {
        synchronized (this.f2347b) {
            q();
            this.f2350e = false;
            int size = this.f2347b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f2347b.get(size);
                e.c cVarFrom = e.c.from(eVar.f().mView);
                e.c cVarE = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (cVarE == cVar && cVarFrom != cVar) {
                    this.f2350e = eVar.f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    public final void q() {
        for (e eVar : this.f2347b) {
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.from(eVar.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    public void r(boolean z) {
        this.f2349d = z;
    }
}
