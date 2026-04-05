package androidx.navigation;

import a.i.h.p;
import a.p.f;
import a.p.i;
import a.p.j;
import a.p.k;
import a.p.x;
import a.v.c;
import a.v.e;
import a.v.g;
import a.v.k;
import a.v.l;
import a.v.m;
import a.v.o;
import a.v.p;
import a.v.s;
import a.v.t;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NavController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f4714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f4715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f4716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f4717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Parcelable[] f4718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4719g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f4721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f4722j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Deque<e> f4720h = new ArrayDeque();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f4723k = new t();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f4724l = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f4725m = new i() { // from class: androidx.navigation.NavController.1
        @Override // a.p.i
        public void d(k kVar, f.b bVar) {
            NavController navController = NavController.this;
            if (navController.f4716d != null) {
                Iterator<e> it = navController.f4720h.iterator();
                while (it.hasNext()) {
                    it.next().e(bVar);
                }
            }
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a.a.b f4726n = new a(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4727o = true;

    public class a extends a.a.b {
        public a(boolean z) {
            super(z);
        }

        @Override // a.a.b
        public void b() {
            NavController.this.u();
        }
    }

    public interface b {
        void a(NavController navController, a.v.k kVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.f4713a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof Activity) {
                this.f4714b = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        t tVar = this.f4723k;
        tVar.a(new m(tVar));
        this.f4723k.a(new a.v.a(this.f4713a));
    }

    public void A(int i2) {
        B(i2, null);
    }

    public void B(int i2, Bundle bundle) {
        C(k().c(i2), bundle);
    }

    public void C(l lVar, Bundle bundle) {
        l lVar2 = this.f4716d;
        if (lVar2 != null) {
            w(lVar2.v(), true);
        }
        this.f4716d = lVar;
        t(bundle);
    }

    public void D(k kVar) {
        if (kVar == this.f4721i) {
            return;
        }
        this.f4721i = kVar;
        kVar.getLifecycle().a(this.f4725m);
    }

    public void E(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.f4721i == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.f4726n.d();
        onBackPressedDispatcher.a(this.f4721i, this.f4726n);
    }

    public void F(x xVar) {
        if (this.f4722j == g.g(xVar)) {
            return;
        }
        if (!this.f4720h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.f4722j = g.g(xVar);
    }

    public final void G() {
        this.f4726n.f(this.f4727o && i() > 1);
    }

    public void a(b bVar) {
        if (!this.f4720h.isEmpty()) {
            e eVarPeekLast = this.f4720h.peekLast();
            bVar.a(this, eVarPeekLast.b(), eVarPeekLast.a());
        }
        this.f4724l.add(bVar);
    }

    public final boolean b() {
        while (!this.f4720h.isEmpty() && (this.f4720h.peekLast().b() instanceof l) && w(this.f4720h.peekLast().b().v(), true)) {
        }
        if (this.f4720h.isEmpty()) {
            return false;
        }
        a.v.k kVarB = this.f4720h.peekLast().b();
        a.v.k kVarC = null;
        if (kVarB instanceof a.v.b) {
            Iterator<e> itDescendingIterator = this.f4720h.descendingIterator();
            while (true) {
                if (!itDescendingIterator.hasNext()) {
                    break;
                }
                a.v.k kVarB2 = itDescendingIterator.next().b();
                if (!(kVarB2 instanceof l) && !(kVarB2 instanceof a.v.b)) {
                    kVarC = kVarB2;
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        Iterator<e> itDescendingIterator2 = this.f4720h.descendingIterator();
        while (itDescendingIterator2.hasNext()) {
            e next = itDescendingIterator2.next();
            f.c cVarC = next.c();
            a.v.k kVarB3 = next.b();
            if (kVarB != null && kVarB3.v() == kVarB.v()) {
                f.c cVar = f.c.RESUMED;
                if (cVarC != cVar) {
                    map.put(next, cVar);
                }
                kVarB = kVarB.C();
            } else if (kVarC == null || kVarB3.v() != kVarC.v()) {
                next.h(f.c.CREATED);
            } else {
                if (cVarC == f.c.RESUMED) {
                    next.h(f.c.STARTED);
                } else {
                    f.c cVar2 = f.c.STARTED;
                    if (cVarC != cVar2) {
                        map.put(next, cVar2);
                    }
                }
                kVarC = kVarC.C();
            }
        }
        for (e eVar : this.f4720h) {
            f.c cVar3 = (f.c) map.get(eVar);
            if (cVar3 != null) {
                eVar.h(cVar3);
            } else {
                eVar.i();
            }
        }
        e eVarPeekLast = this.f4720h.peekLast();
        Iterator<b> it = this.f4724l.iterator();
        while (it.hasNext()) {
            it.next().a(this, eVarPeekLast.b(), eVarPeekLast.a());
        }
        return true;
    }

    public void c(boolean z) {
        this.f4727o = z;
        G();
    }

    public a.v.k d(int i2) {
        l lVar = this.f4716d;
        if (lVar == null) {
            return null;
        }
        if (lVar.v() == i2) {
            return this.f4716d;
        }
        l lVarB = this.f4720h.isEmpty() ? this.f4716d : this.f4720h.getLast().b();
        return (lVarB instanceof l ? lVarB : lVarB.C()).O(i2);
    }

    public final String e(int[] iArr) {
        l lVar;
        l lVar2 = this.f4716d;
        int i2 = 0;
        while (true) {
            a.v.k kVarO = null;
            if (i2 >= iArr.length) {
                return null;
            }
            int i3 = iArr[i2];
            if (i2 != 0) {
                kVarO = lVar2.O(i3);
            } else if (this.f4716d.v() == i3) {
                kVarO = this.f4716d;
            }
            if (kVarO == null) {
                return a.v.k.t(this.f4713a, i3);
            }
            if (i2 != iArr.length - 1) {
                while (true) {
                    lVar = (l) kVarO;
                    if (!(lVar.O(lVar.R()) instanceof l)) {
                        break;
                    }
                    kVarO = lVar.O(lVar.R());
                }
                lVar2 = lVar;
            }
            i2++;
        }
    }

    public Context f() {
        return this.f4713a;
    }

    public e g() {
        if (this.f4720h.isEmpty()) {
            return null;
        }
        return this.f4720h.getLast();
    }

    public a.v.k h() {
        e eVarG = g();
        if (eVarG != null) {
            return eVarG.b();
        }
        return null;
    }

    public final int i() {
        Iterator<e> it = this.f4720h.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (!(it.next().b() instanceof l)) {
                i2++;
            }
        }
        return i2;
    }

    public l j() {
        l lVar = this.f4716d;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public o k() {
        if (this.f4715c == null) {
            this.f4715c = new o(this.f4713a, this.f4723k);
        }
        return this.f4715c;
    }

    public t l() {
        return this.f4723k;
    }

    public boolean m(Intent intent) {
        k.a aVarD;
        l lVar;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if ((intArray == null || intArray.length == 0) && intent.getData() != null && (aVarD = this.f4716d.D(new a.v.j(intent))) != null) {
            a.v.k kVarD = aVarD.d();
            int[] iArrF = kVarD.f();
            bundle.putAll(kVarD.d(aVarD.g()));
            intArray = iArrF;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strE = e(intArray);
        if (strE != null) {
            Log.i("NavController", "Could not find destination " + strE + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i2 = 268435456 & flags;
        if (i2 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            p.f(this.f4713a).b(intent).v();
            Activity activity = this.f4714b;
            if (activity != null) {
                activity.finish();
                this.f4714b.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i2 != 0) {
            if (!this.f4720h.isEmpty()) {
                w(this.f4716d.v(), true);
            }
            int i3 = 0;
            while (i3 < intArray.length) {
                int i4 = i3 + 1;
                int i5 = intArray[i3];
                a.v.k kVarD2 = d(i5);
                if (kVarD2 == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + a.v.k.t(this.f4713a, i5) + " cannot be found from the current destination " + h());
                }
                r(kVarD2, bundle, new p.a().b(0).c(0).a(), null);
                i3 = i4;
            }
            return true;
        }
        l lVar2 = this.f4716d;
        int i6 = 0;
        while (i6 < intArray.length) {
            int i7 = intArray[i6];
            a.v.k kVarO = i6 == 0 ? this.f4716d : lVar2.O(i7);
            if (kVarO == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + a.v.k.t(this.f4713a, i7) + " cannot be found in graph " + lVar2);
            }
            if (i6 != intArray.length - 1) {
                while (true) {
                    lVar = (l) kVarO;
                    if (!(lVar.O(lVar.R()) instanceof l)) {
                        break;
                    }
                    kVarO = lVar.O(lVar.R());
                }
                lVar2 = lVar;
            } else {
                r(kVarO, kVarO.d(bundle), new p.a().g(this.f4716d.v(), true).b(0).c(0).a(), null);
            }
            i6++;
        }
        this.f4719g = true;
        return true;
    }

    public void n(int i2) {
        o(i2, null);
    }

    public void o(int i2, Bundle bundle) {
        p(i2, bundle, null);
    }

    public void p(int i2, Bundle bundle, a.v.p pVar) {
        q(i2, bundle, pVar, null);
    }

    public void q(int i2, Bundle bundle, a.v.p pVar, s.a aVar) {
        int iB;
        a.v.k kVarB = this.f4720h.isEmpty() ? this.f4716d : this.f4720h.getLast().b();
        if (kVarB == null) {
            throw new IllegalStateException("no current navigation node");
        }
        c cVarG = kVarB.g(i2);
        Bundle bundle2 = null;
        if (cVarG != null) {
            if (pVar == null) {
                pVar = cVarG.c();
            }
            iB = cVarG.b();
            Bundle bundleA = cVarG.a();
            if (bundleA != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundleA);
            }
        } else {
            iB = i2;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (iB == 0 && pVar != null && pVar.e() != -1) {
            v(pVar.e(), pVar.f());
            return;
        }
        if (iB == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        a.v.k kVarD = d(iB);
        if (kVarD != null) {
            r(kVarD, bundle2, pVar, aVar);
            return;
        }
        String strT = a.v.k.t(this.f4713a, iB);
        if (cVarG == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strT + " cannot be found from the current destination " + kVarB);
        }
        throw new IllegalArgumentException("Navigation destination " + strT + " referenced from action " + a.v.k.t(this.f4713a, i2) + " cannot be found from the current destination " + kVarB);
    }

    public final void r(a.v.k kVar, Bundle bundle, a.v.p pVar, s.a aVar) {
        boolean z = false;
        boolean zW = (pVar == null || pVar.e() == -1) ? false : w(pVar.e(), pVar.f());
        s sVarE = this.f4723k.e(kVar.B());
        Bundle bundleD = kVar.d(bundle);
        a.v.k kVarB = sVarE.b(kVar, bundleD, pVar, aVar);
        if (kVarB != null) {
            if (!(kVarB instanceof a.v.b)) {
                while (!this.f4720h.isEmpty() && (this.f4720h.peekLast().b() instanceof a.v.b) && w(this.f4720h.peekLast().b().v(), true)) {
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            if (kVar instanceof l) {
                a.v.k kVar2 = kVarB;
                while (true) {
                    l lVarC = kVar2.C();
                    if (lVarC != null) {
                        arrayDeque.addFirst(new e(this.f4713a, lVarC, bundleD, this.f4721i, this.f4722j));
                        if (!this.f4720h.isEmpty() && this.f4720h.getLast().b() == lVarC) {
                            w(lVarC.v(), true);
                        }
                    }
                    if (lVarC == null || lVarC == kVar) {
                        break;
                    } else {
                        kVar2 = lVarC;
                    }
                }
            }
            a.v.k kVarB2 = arrayDeque.isEmpty() ? kVarB : ((e) arrayDeque.getFirst()).b();
            while (kVarB2 != null && d(kVarB2.v()) == null) {
                kVarB2 = kVarB2.C();
                if (kVarB2 != null) {
                    arrayDeque.addFirst(new e(this.f4713a, kVarB2, bundleD, this.f4721i, this.f4722j));
                }
            }
            a.v.k kVarB3 = arrayDeque.isEmpty() ? kVarB : ((e) arrayDeque.getLast()).b();
            while (!this.f4720h.isEmpty() && (this.f4720h.getLast().b() instanceof l) && ((l) this.f4720h.getLast().b()).P(kVarB3.v(), false) == null && w(this.f4720h.getLast().b().v(), true)) {
            }
            this.f4720h.addAll(arrayDeque);
            if (this.f4720h.isEmpty() || this.f4720h.getFirst().b() != this.f4716d) {
                this.f4720h.addFirst(new e(this.f4713a, this.f4716d, bundleD, this.f4721i, this.f4722j));
            }
            this.f4720h.add(new e(this.f4713a, kVarB, kVarB.d(bundleD), this.f4721i, this.f4722j));
        } else if (pVar != null && pVar.g()) {
            e eVarPeekLast = this.f4720h.peekLast();
            if (eVarPeekLast != null) {
                eVarPeekLast.f(bundleD);
            }
            z = true;
        }
        G();
        if (zW || kVarB != null || z) {
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.v.k] */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.v.k] */
    /* JADX WARN: Type inference failed for: r0v4, types: [a.v.k, a.v.l] */
    public boolean s() {
        int iV;
        if (i() != 1) {
            return u();
        }
        ?? H = h();
        do {
            iV = H.v();
            H = H.C();
            if (H == 0) {
                return false;
            }
        } while (H.R() == iV);
        Bundle bundle = new Bundle();
        Activity activity = this.f4714b;
        if (activity != null && activity.getIntent() != null && this.f4714b.getIntent().getData() != null) {
            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", this.f4714b.getIntent());
            k.a aVarD = this.f4716d.D(new a.v.j(this.f4714b.getIntent()));
            if (aVarD != null) {
                bundle.putAll(aVarD.d().d(aVarD.g()));
            }
        }
        new a.v.i(this).d(H.v()).c(bundle).a().v();
        Activity activity2 = this.f4714b;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    public final void t(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f4717e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String str : stringArrayList) {
                s sVarE = this.f4723k.e(str);
                Bundle bundle3 = this.f4717e.getBundle(str);
                if (bundle3 != null) {
                    sVarE.c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f4718f;
        boolean z = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                a.v.f fVar = (a.v.f) parcelable;
                a.v.k kVarD = d(fVar.c());
                if (kVarD == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + a.v.k.t(this.f4713a, fVar.c()) + " cannot be found from the current destination " + h());
                }
                Bundle bundleB = fVar.b();
                if (bundleB != null) {
                    bundleB.setClassLoader(this.f4713a.getClassLoader());
                }
                this.f4720h.add(new e(this.f4713a, kVarD, bundleB, this.f4721i, this.f4722j, fVar.e(), fVar.d()));
            }
            G();
            this.f4718f = null;
        }
        if (this.f4716d == null || !this.f4720h.isEmpty()) {
            b();
            return;
        }
        if (!this.f4719g && (activity = this.f4714b) != null && m(activity.getIntent())) {
            z = true;
        }
        if (z) {
            return;
        }
        r(this.f4716d, bundle, null, null);
    }

    public boolean u() {
        if (this.f4720h.isEmpty()) {
            return false;
        }
        return v(h().v(), true);
    }

    public boolean v(int i2, boolean z) {
        return w(i2, z) && b();
    }

    public boolean w(int i2, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f4720h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<e> itDescendingIterator = this.f4720h.descendingIterator();
        while (true) {
            if (!itDescendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            a.v.k kVarB = itDescendingIterator.next().b();
            s sVarE = this.f4723k.e(kVarB.B());
            if (z || kVarB.v() != i2) {
                arrayList.add(sVarE);
            }
            if (kVarB.v() == i2) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            Log.i("NavController", "Ignoring popBackStack to destination " + a.v.k.t(this.f4713a, i2) + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((s) it.next()).e()) {
            e eVarRemoveLast = this.f4720h.removeLast();
            if (eVarRemoveLast.getLifecycle().b().isAtLeast(f.c.CREATED)) {
                eVarRemoveLast.h(f.c.DESTROYED);
            }
            g gVar = this.f4722j;
            if (gVar != null) {
                gVar.f(eVarRemoveLast.f3538g);
            }
            z3 = true;
        }
        G();
        return z3;
    }

    public void x(b bVar) {
        this.f4724l.remove(bVar);
    }

    public void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f4713a.getClassLoader());
        this.f4717e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f4718f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f4719g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle z() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, s<? extends a.v.k>> entry : this.f4723k.f().entrySet()) {
            String key = entry.getKey();
            Bundle bundleD = entry.getValue().d();
            if (bundleD != null) {
                arrayList.add(key);
                bundle2.putBundle(key, bundleD);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.f4720h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f4720h.size()];
            int i2 = 0;
            Iterator<e> it = this.f4720h.iterator();
            while (it.hasNext()) {
                parcelableArr[i2] = new a.v.f(it.next());
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.f4719g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f4719g);
        }
        return bundle;
    }
}
