package a.l.d;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f2515a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f2516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f2517c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f2518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f2519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.i.n.b f2520d;

        public a(g gVar, Fragment fragment, a.i.n.b bVar) {
            this.f2518b = gVar;
            this.f2519c = fragment;
            this.f2520d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2518b.a(this.f2519c, this.f2520d);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2521b;

        public b(ArrayList arrayList) {
            this.f2521b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.A(this.f2521b, 4);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f2522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f2523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.i.n.b f2524d;

        public c(g gVar, Fragment fragment, a.i.n.b bVar) {
            this.f2522b = gVar;
            this.f2523c = fragment;
            this.f2524d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2522b.a(this.f2523c, this.f2524d);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f2525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f2526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f2527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Fragment f2528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2529f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2530g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2531h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Object f2532i;

        public d(Object obj, b0 b0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2525b = obj;
            this.f2526c = b0Var;
            this.f2527d = view;
            this.f2528e = fragment;
            this.f2529f = arrayList;
            this.f2530g = arrayList2;
            this.f2531h = arrayList3;
            this.f2532i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f2525b;
            if (obj != null) {
                this.f2526c.p(obj, this.f2527d);
                this.f2530g.addAll(z.k(this.f2526c, this.f2525b, this.f2528e, this.f2529f, this.f2527d));
            }
            if (this.f2531h != null) {
                if (this.f2532i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f2527d);
                    this.f2526c.q(this.f2532i, this.f2531h, arrayList);
                }
                this.f2531h.clear();
                this.f2531h.add(this.f2527d);
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f2533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f2534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f2535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a.f.a f2536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ View f2537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b0 f2538g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Rect f2539h;

        public e(Fragment fragment, Fragment fragment2, boolean z, a.f.a aVar, View view, b0 b0Var, Rect rect) {
            this.f2533b = fragment;
            this.f2534c = fragment2;
            this.f2535d = z;
            this.f2536e = aVar;
            this.f2537f = view;
            this.f2538g = b0Var;
            this.f2539h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.f(this.f2533b, this.f2534c, this.f2535d, this.f2536e, false);
            View view = this.f2537f;
            if (view != null) {
                this.f2538g.k(view, this.f2539h);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f2540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.f.a f2541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f2542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f2543e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2544f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ View f2545g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Fragment f2546h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Fragment f2547i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f2548j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2549k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f2550l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Rect f2551m;

        public f(b0 b0Var, a.f.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2540b = b0Var;
            this.f2541c = aVar;
            this.f2542d = obj;
            this.f2543e = hVar;
            this.f2544f = arrayList;
            this.f2545g = view;
            this.f2546h = fragment;
            this.f2547i = fragment2;
            this.f2548j = z;
            this.f2549k = arrayList2;
            this.f2550l = obj2;
            this.f2551m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.f.a<String, View> aVarH = z.h(this.f2540b, this.f2541c, this.f2542d, this.f2543e);
            if (aVarH != null) {
                this.f2544f.addAll(aVarH.values());
                this.f2544f.add(this.f2545g);
            }
            z.f(this.f2546h, this.f2547i, this.f2548j, aVarH, false);
            Object obj = this.f2542d;
            if (obj != null) {
                this.f2540b.A(obj, this.f2549k, this.f2544f);
                View viewS = z.s(aVarH, this.f2543e, this.f2550l, this.f2548j);
                if (viewS != null) {
                    this.f2540b.k(viewS, this.f2551m);
                }
            }
        }
    }

    public interface g {
        void a(Fragment fragment, a.i.n.b bVar);

        void b(Fragment fragment, a.i.n.b bVar);
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Fragment f2552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a.l.d.a f2554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Fragment f2555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a.l.d.a f2557f;
    }

    static {
        f2516b = Build.VERSION.SDK_INT >= 21 ? new a0() : null;
        f2517c = w();
    }

    public static void A(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    public static void B(Context context, a.l.d.g gVar, ArrayList<a.l.d.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            a.l.d.a aVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = sparseArray.keyAt(i5);
                a.f.a<String, String> aVarD = d(iKeyAt, arrayList, arrayList2, i2, i3);
                h hVar = (h) sparseArray.valueAt(i5);
                if (gVar.d() && (viewGroup = (ViewGroup) gVar.c(iKeyAt)) != null) {
                    if (z) {
                        o(viewGroup, hVar, view, aVarD, gVar2);
                    } else {
                        n(viewGroup, hVar, view, aVarD, gVar2);
                    }
                }
            }
        }
    }

    public static boolean C() {
        return (f2516b == null && f2517c == null) ? false : true;
    }

    public static void a(ArrayList<View> arrayList, a.f.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewN = aVar.n(size);
            if (collection.contains(a.i.r.x.L(viewN))) {
                arrayList.add(viewN);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(a.l.d.a r8, a.l.d.y.a r9, android.util.SparseArray<a.l.d.z.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.d.z.b(a.l.d.a, a.l.d.y$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(a.l.d.a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.f2494c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(aVar, aVar.f2494c.get(i2), sparseArray, false, z);
        }
    }

    public static a.f.a<String, String> d(int i2, ArrayList<a.l.d.a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        a.f.a<String, String> aVar = new a.f.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            a.l.d.a aVar2 = arrayList.get(i5);
            if (aVar2.G(i2)) {
                boolean zBooleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = aVar2.p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.p;
                        arrayList4 = aVar2.q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.p;
                        arrayList3 = aVar2.q;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(a.l.d.a aVar, SparseArray<h> sparseArray, boolean z) {
        if (aVar.t.o0().d()) {
            for (int size = aVar.f2494c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f2494c.get(size), sparseArray, true, z);
            }
        }
    }

    public static void f(Fragment fragment, Fragment fragment2, boolean z, a.f.a<String, View> aVar, boolean z2) {
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(aVar.j(i2));
                arrayList.add(aVar.n(i2));
            }
            throw null;
        }
    }

    public static boolean g(b0 b0Var, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!b0Var.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static a.f.a<String, View> h(b0 b0Var, a.f.a<String, String> aVar, Object obj, h hVar) {
        a.i.h.o enterTransitionCallback;
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f2552a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        a.f.a<String, View> aVar2 = new a.f.a<>();
        b0Var.j(aVar2, view);
        a.l.d.a aVar3 = hVar.f2554c;
        if (hVar.f2553b) {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = aVar3.p;
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = aVar3.q;
        }
        if (arrayList != null) {
            aVar2.p(arrayList);
            aVar2.p(aVar.values());
        }
        if (enterTransitionCallback != null) {
            throw null;
        }
        x(aVar, aVar2);
        return aVar2;
    }

    public static a.f.a<String, View> i(b0 b0Var, a.f.a<String, String> aVar, Object obj, h hVar) {
        a.i.h.o exitTransitionCallback;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f2555d;
        a.f.a<String, View> aVar2 = new a.f.a<>();
        b0Var.j(aVar2, fragment.requireView());
        a.l.d.a aVar3 = hVar.f2557f;
        if (hVar.f2556e) {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = aVar3.q;
        } else {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = aVar3.p;
        }
        if (arrayList != null) {
            aVar2.p(arrayList);
        }
        if (exitTransitionCallback != null) {
            throw null;
        }
        aVar.p(aVar2.keySet());
        return aVar2;
    }

    public static b0 j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        b0 b0Var = f2516b;
        if (b0Var != null && g(b0Var, arrayList)) {
            return b0Var;
        }
        b0 b0Var2 = f2517c;
        if (b0Var2 != null && g(b0Var2, arrayList)) {
            return b0Var2;
        }
        if (b0Var == null && b0Var2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> k(b0 b0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            b0Var.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        b0Var.b(obj, arrayList2);
        return arrayList2;
    }

    public static Object l(b0 b0Var, ViewGroup viewGroup, View view, a.f.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objT;
        a.f.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f2552a;
        Fragment fragment2 = hVar.f2555d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f2553b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            objT = null;
        } else {
            objT = t(b0Var, fragment, fragment2, z);
            aVar2 = aVar;
        }
        a.f.a<String, View> aVarI = i(b0Var, aVar2, objT, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            b0Var.z(obj3, view, arrayList);
            z(b0Var, obj3, obj2, aVarI, hVar.f2556e, hVar.f2557f);
            if (obj != null) {
                b0Var.u(obj, rect);
            }
        } else {
            rect = null;
        }
        a.i.r.u.a(viewGroup, new f(b0Var, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    public static Object m(b0 b0Var, ViewGroup viewGroup, View view, a.f.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f2552a;
        Fragment fragment2 = hVar.f2555d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f2553b;
        Object objT = aVar.isEmpty() ? null : t(b0Var, fragment, fragment2, z);
        a.f.a<String, View> aVarI = i(b0Var, aVar, objT, hVar);
        a.f.a<String, View> aVarH = h(b0Var, aVar, objT, hVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            b0Var.z(obj3, view, arrayList);
            z(b0Var, obj3, obj2, aVarI, hVar.f2556e, hVar.f2557f);
            Rect rect2 = new Rect();
            View viewS = s(aVarH, hVar, obj, z);
            if (viewS != null) {
                b0Var.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewS;
        } else {
            view2 = null;
            rect = null;
        }
        a.i.r.u.a(viewGroup, new e(fragment, fragment2, z, aVarH, view2, b0Var, rect));
        return obj3;
    }

    public static void n(ViewGroup viewGroup, h hVar, View view, a.f.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f2552a;
        Fragment fragment2 = hVar.f2555d;
        b0 b0VarJ = j(fragment2, fragment);
        if (b0VarJ == null) {
            return;
        }
        boolean z = hVar.f2553b;
        boolean z2 = hVar.f2556e;
        Object objQ = q(b0VarJ, fragment, z);
        Object objR = r(b0VarJ, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objL = l(b0VarJ, viewGroup, view, aVar, hVar, arrayList, arrayList2, objQ, objR);
        if (objQ == null && objL == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(b0VarJ, obj, fragment2, arrayList, view);
        if (arrayListK == null || arrayListK.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        b0VarJ.a(objQ, view);
        Object objU = u(b0VarJ, objQ, obj2, objL, fragment, hVar.f2553b);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList.size() > 0)) {
            a.i.n.b bVar = new a.i.n.b();
            gVar.b(fragment2, bVar);
            b0VarJ.w(fragment2, objU, bVar, new c(gVar, fragment2, bVar));
        }
        if (objU != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            b0VarJ.t(objU, objQ, arrayList3, obj2, arrayListK, objL, arrayList2);
            y(b0VarJ, viewGroup, fragment, view, arrayList2, objQ, arrayList3, obj2, arrayListK);
            b0VarJ.x(viewGroup, arrayList2, aVar);
            b0VarJ.c(viewGroup, objU);
            b0VarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    public static void o(ViewGroup viewGroup, h hVar, View view, a.f.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f2552a;
        Fragment fragment2 = hVar.f2555d;
        b0 b0VarJ = j(fragment2, fragment);
        if (b0VarJ == null) {
            return;
        }
        boolean z = hVar.f2553b;
        boolean z2 = hVar.f2556e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objQ = q(b0VarJ, fragment, z);
        Object objR = r(b0VarJ, fragment2, z2);
        Object objM = m(b0VarJ, viewGroup, view, aVar, hVar, arrayList2, arrayList, objQ, objR);
        if (objQ == null && objM == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(b0VarJ, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListK2 = k(b0VarJ, objQ, fragment, arrayList, view);
        A(arrayListK2, 4);
        Object objU = u(b0VarJ, objQ, obj, objM, fragment, z);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList2.size() > 0)) {
            a.i.n.b bVar = new a.i.n.b();
            gVar.b(fragment2, bVar);
            b0VarJ.w(fragment2, objU, bVar, new a(gVar, fragment2, bVar));
        }
        if (objU != null) {
            v(b0VarJ, obj, fragment2, arrayListK);
            ArrayList<String> arrayListO = b0VarJ.o(arrayList);
            b0VarJ.t(objU, objQ, arrayListK2, obj, arrayListK, objM, arrayList);
            b0VarJ.c(viewGroup, objU);
            b0VarJ.y(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            A(arrayListK2, 0);
            b0VarJ.A(objM, arrayList2, arrayList);
        }
    }

    public static h p(h hVar, SparseArray<h> sparseArray, int i2) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i2, hVar2);
        return hVar2;
    }

    public static Object q(b0 b0Var, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return b0Var.g(z ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    public static Object r(b0 b0Var, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return b0Var.g(z ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    public static View s(a.f.a<String, View> aVar, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a.l.d.a aVar2 = hVar.f2554c;
        if (obj == null || aVar == null || (arrayList = aVar2.p) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.p : aVar2.q).get(0));
    }

    public static Object t(b0 b0Var, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return b0Var.B(b0Var.g(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    public static Object u(b0 b0Var, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? b0Var.n(obj2, obj, obj3) : b0Var.m(obj2, obj, obj3);
    }

    public static void v(b0 b0Var, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            b0Var.r(obj, fragment.getView(), arrayList);
            a.i.r.u.a(fragment.mContainer, new b(arrayList));
        }
    }

    public static b0 w() {
        try {
            return (b0) Class.forName("a.b0.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void x(a.f.a<String, String> aVar, a.f.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.n(size))) {
                aVar.l(size);
            }
        }
    }

    public static void y(b0 b0Var, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        a.i.r.u.a(viewGroup, new d(obj, b0Var, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    public static void z(b0 b0Var, Object obj, Object obj2, a.f.a<String, View> aVar, boolean z, a.l.d.a aVar2) {
        ArrayList<String> arrayList = aVar2.p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? aVar2.q : aVar2.p).get(0));
        b0Var.v(obj, view);
        if (obj2 != null) {
            b0Var.v(obj2, view);
        }
    }
}
