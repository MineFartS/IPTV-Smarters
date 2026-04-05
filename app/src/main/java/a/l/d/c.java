package a.l.d;

import a.i.n.b;
import a.l.d.e0;
import a.l.d.f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c extends e0 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2275a;

        static {
            int[] iArr = new int[e0.e.c.values().length];
            f2275a = iArr;
            try {
                iArr[e0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2275a[e0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2275a[e0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2275a[e0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f2276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0.e f2277c;

        public b(List list, e0.e eVar) {
            this.f2276b = list;
            this.f2277c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2276b.contains(this.f2277c)) {
                this.f2276b.remove(this.f2277c);
                c.this.s(this.f2277c);
            }
        }
    }

    /* JADX INFO: renamed from: a.l.d.c$c, reason: collision with other inner class name */
    public class C0052c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f2281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e0.e f2282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ k f2283f;

        public C0052c(ViewGroup viewGroup, View view, boolean z, e0.e eVar, k kVar) {
            this.f2279b = viewGroup;
            this.f2280c = view;
            this.f2281d = z;
            this.f2282e = eVar;
            this.f2283f = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2279b.endViewTransition(this.f2280c);
            if (this.f2281d) {
                this.f2282e.e().applyState(this.f2280c);
            }
            this.f2283f.a();
        }
    }

    public class d implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Animator f2285a;

        public d(Animator animator) {
            this.f2285a = animator;
        }

        @Override // a.i.n.b.a
        public void a() {
            this.f2285a.end();
        }
    }

    public class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f2288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f2289c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f2287a.endViewTransition(eVar.f2288b);
                e.this.f2289c.a();
            }
        }

        public e(ViewGroup viewGroup, View view, k kVar) {
            this.f2287a = viewGroup;
            this.f2288b = view;
            this.f2289c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2287a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class f implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f2292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f2294c;

        public f(View view, ViewGroup viewGroup, k kVar) {
            this.f2292a = view;
            this.f2293b = viewGroup;
            this.f2294c = kVar;
        }

        @Override // a.i.n.b.a
        public void a() {
            this.f2292a.clearAnimation();
            this.f2293b.endViewTransition(this.f2292a);
            this.f2294c.a();
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0.e f2296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0.e f2297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f2298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a.f.a f2299e;

        public g(e0.e eVar, e0.e eVar2, boolean z, a.f.a aVar) {
            this.f2296b = eVar;
            this.f2297c = eVar2;
            this.f2298d = z;
            this.f2299e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.f(this.f2296b.f(), this.f2297c.f(), this.f2298d, this.f2299e, false);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f2301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Rect f2303d;

        public h(b0 b0Var, View view, Rect rect) {
            this.f2301b = b0Var;
            this.f2302c = view;
            this.f2303d = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2301b.k(this.f2302c, this.f2303d);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2305b;

        public i(ArrayList arrayList) {
            this.f2305b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.A(this.f2305b, 4);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f2307b;

        public j(m mVar) {
            this.f2307b = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2307b.a();
        }
    }

    public static class k extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f.d f2311e;

        public k(e0.e eVar, a.i.n.b bVar, boolean z) {
            super(eVar, bVar);
            this.f2310d = false;
            this.f2309c = z;
        }

        public f.d e(Context context) {
            if (this.f2310d) {
                return this.f2311e;
            }
            f.d dVarC = a.l.d.f.c(context, b().f(), b().e() == e0.e.c.VISIBLE, this.f2309c);
            this.f2311e = dVarC;
            this.f2310d = true;
            return dVarC;
        }
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0.e f2312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.i.n.b f2313b;

        public l(e0.e eVar, a.i.n.b bVar) {
            this.f2312a = eVar;
            this.f2313b = bVar;
        }

        public void a() {
            this.f2312a.d(this.f2313b);
        }

        public e0.e b() {
            return this.f2312a;
        }

        public a.i.n.b c() {
            return this.f2313b;
        }

        public boolean d() {
            e0.e.c cVar;
            e0.e.c cVarFrom = e0.e.c.from(this.f2312a.f().mView);
            e0.e.c cVarE = this.f2312a.e();
            return cVarFrom == cVarE || !(cVarFrom == (cVar = e0.e.c.VISIBLE) || cVarE == cVar);
        }
    }

    public static class m extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f2314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f2315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f2316e;

        public m(e0.e eVar, a.i.n.b bVar, boolean z, boolean z2) {
            boolean allowReturnTransitionOverlap;
            Object sharedElementReturnTransition;
            super(eVar, bVar);
            if (eVar.e() == e0.e.c.VISIBLE) {
                Fragment fragmentF = eVar.f();
                this.f2314c = z ? fragmentF.getReenterTransition() : fragmentF.getEnterTransition();
                Fragment fragmentF2 = eVar.f();
                allowReturnTransitionOverlap = z ? fragmentF2.getAllowReturnTransitionOverlap() : fragmentF2.getAllowEnterTransitionOverlap();
            } else {
                Fragment fragmentF3 = eVar.f();
                this.f2314c = z ? fragmentF3.getReturnTransition() : fragmentF3.getExitTransition();
                allowReturnTransitionOverlap = true;
            }
            this.f2315d = allowReturnTransitionOverlap;
            if (z2) {
                Fragment fragmentF4 = eVar.f();
                sharedElementReturnTransition = z ? fragmentF4.getSharedElementReturnTransition() : fragmentF4.getSharedElementEnterTransition();
            } else {
                sharedElementReturnTransition = null;
            }
            this.f2316e = sharedElementReturnTransition;
        }

        public b0 e() {
            b0 b0VarF = f(this.f2314c);
            b0 b0VarF2 = f(this.f2316e);
            if (b0VarF == null || b0VarF2 == null || b0VarF == b0VarF2) {
                return b0VarF != null ? b0VarF : b0VarF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f2314c + " which uses a different Transition  type than its shared element transition " + this.f2316e);
        }

        public final b0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            b0 b0Var = z.f2516b;
            if (b0Var != null && b0Var.e(obj)) {
                return b0Var;
            }
            b0 b0Var2 = z.f2517c;
            if (b0Var2 != null && b0Var2.e(obj)) {
                return b0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        public Object g() {
            return this.f2316e;
        }

        public Object h() {
            return this.f2314c;
        }

        public boolean i() {
            return this.f2316e != null;
        }

        public boolean j() {
            return this.f2315d;
        }
    }

    public c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @Override // a.l.d.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(java.util.List<a.l.d.e0.e> r11, boolean r12) {
        /*
            r10 = this;
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r6 = r1
            r7 = r6
        L7:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            a.l.d.e0$e r1 = (a.l.d.e0.e) r1
            androidx.fragment.app.Fragment r3 = r1.f()
            android.view.View r3 = r3.mView
            a.l.d.e0$e$c r3 = a.l.d.e0.e.c.from(r3)
            int[] r4 = a.l.d.c.a.f2275a
            a.l.d.e0$e$c r5 = r1.e()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r2) goto L3c
            r2 = 2
            if (r4 == r2) goto L3c
            r2 = 3
            if (r4 == r2) goto L3c
            r2 = 4
            if (r4 == r2) goto L36
            goto L7
        L36:
            a.l.d.e0$e$c r2 = a.l.d.e0.e.c.VISIBLE
            if (r3 == r2) goto L7
            r7 = r1
            goto L7
        L3c:
            a.l.d.e0$e$c r2 = a.l.d.e0.e.c.VISIBLE
            if (r3 != r2) goto L7
            if (r6 != 0) goto L7
            r6 = r1
            goto L7
        L44:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.util.Iterator r11 = r11.iterator()
        L57:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L95
            java.lang.Object r4 = r11.next()
            a.l.d.e0$e r4 = (a.l.d.e0.e) r4
            a.i.n.b r5 = new a.i.n.b
            r5.<init>()
            r4.j(r5)
            a.l.d.c$k r8 = new a.l.d.c$k
            r8.<init>(r4, r5, r12)
            r0.add(r8)
            a.i.n.b r5 = new a.i.n.b
            r5.<init>()
            r4.j(r5)
            a.l.d.c$m r8 = new a.l.d.c$m
            r9 = 0
            if (r12 == 0) goto L83
            if (r4 != r6) goto L86
            goto L85
        L83:
            if (r4 != r7) goto L86
        L85:
            r9 = 1
        L86:
            r8.<init>(r4, r5, r12, r9)
            r3.add(r8)
            a.l.d.c$b r5 = new a.l.d.c$b
            r5.<init>(r1, r4)
            r4.a(r5)
            goto L57
        L95:
            r2 = r10
            r4 = r1
            r5 = r12
            java.util.Map r11 = r2.x(r3, r4, r5, r6, r7)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = r11.containsValue(r12)
            r10.w(r0, r1, r12, r11)
            java.util.Iterator r11 = r1.iterator()
        La9:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lb9
            java.lang.Object r12 = r11.next()
            a.l.d.e0$e r12 = (a.l.d.e0.e) r12
            r10.s(r12)
            goto La9
        Lb9:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.d.c.f(java.util.List, boolean):void");
    }

    public void s(e0.e eVar) {
        eVar.e().applyState(eVar.f().mView);
    }

    public void t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        if (!arrayList.contains(view) && a.i.r.x.L(view) != null) {
            arrayList.add(view);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    public void u(Map<String, View> map, View view) {
        String strL = a.i.r.x.L(view);
        if (strL != null) {
            map.put(strL, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(a.f.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(a.i.r.x.L(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    public final void w(List<k> list, List<e0.e> list2, boolean z, Map<e0.e, Boolean> map) {
        StringBuilder sb;
        String str;
        f.d dVarE;
        ViewGroup viewGroupM = m();
        Context context = viewGroupM.getContext();
        ArrayList<k> arrayList = new ArrayList();
        boolean z2 = false;
        for (k kVar : list) {
            if (kVar.d() || (dVarE = kVar.e(context)) == null) {
                kVar.a();
            } else {
                Animator animator = dVarE.f2378b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    e0.e eVarB = kVar.b();
                    Fragment fragmentF = eVarB.f();
                    if (Boolean.TRUE.equals(map.get(eVarB))) {
                        if (n.G0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + fragmentF + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z3 = eVarB.e() == e0.e.c.GONE;
                        if (z3) {
                            list2.remove(eVarB);
                        }
                        View view = fragmentF.mView;
                        viewGroupM.startViewTransition(view);
                        animator.addListener(new C0052c(viewGroupM, view, z3, eVarB, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.c().d(new d(animator));
                        z2 = true;
                    }
                }
            }
        }
        for (k kVar2 : arrayList) {
            e0.e eVarB2 = kVar2.b();
            Fragment fragmentF2 = eVarB2.f();
            if (z) {
                if (n.G0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentF2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else if (z2) {
                if (n.G0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentF2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else {
                View view2 = fragmentF2.mView;
                Animation animation = (Animation) a.i.q.i.e(((f.d) a.i.q.i.e(kVar2.e(context))).f2377a);
                if (eVarB2.e() != e0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    viewGroupM.startViewTransition(view2);
                    f.e eVar = new f.e(animation, viewGroupM, view2);
                    eVar.setAnimationListener(new e(viewGroupM, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().d(new f(view2, viewGroupM, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<e0.e, Boolean> x(List<m> list, List<e0.e> list2, boolean z, e0.e eVar, e0.e eVar2) {
        Iterator<m> it;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        e0.e eVar3;
        e0.e eVar4;
        View view2;
        Object objN;
        a.f.a aVar;
        ArrayList<View> arrayList3;
        e0.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        b0 b0Var;
        e0.e eVar6;
        View view3;
        a.i.h.o enterTransitionCallback;
        a.i.h.o exitTransitionCallback;
        View view4;
        View view5;
        boolean z2 = z;
        e0.e eVar7 = eVar;
        e0.e eVar8 = eVar2;
        HashMap map = new HashMap();
        b0 b0Var2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                b0 b0VarE = mVar.e();
                if (b0Var2 == null) {
                    b0Var2 = b0VarE;
                } else if (b0VarE != null && b0Var2 != b0VarE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (b0Var2 == null) {
            for (m mVar2 : list) {
                map.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return map;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        a.f.a aVar2 = new a.f.a();
        Object obj3 = null;
        View view7 = null;
        boolean z3 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                b0Var = b0Var2;
                eVar6 = eVar8;
                view3 = view6;
                view7 = view7;
            } else {
                Object objB = b0Var2.B(b0Var2.g(mVar3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view8 = view7;
                int i2 = 0;
                while (i2 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                Fragment fragmentF = eVar.f();
                if (z2) {
                    enterTransitionCallback = fragmentF.getEnterTransitionCallback();
                    exitTransitionCallback = eVar2.f().getExitTransitionCallback();
                } else {
                    enterTransitionCallback = fragmentF.getExitTransitionCallback();
                    exitTransitionCallback = eVar2.f().getEnterTransitionCallback();
                }
                int i3 = 0;
                for (int size = sharedElementSourceNames.size(); i3 < size; size = size) {
                    aVar2.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                }
                a.f.a<String, View> aVar3 = new a.f.a<>();
                u(aVar3, eVar.f().mView);
                aVar3.p(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    throw null;
                }
                aVar2.p(aVar3.keySet());
                a.f.a<String, View> aVar4 = new a.f.a<>();
                u(aVar4, eVar2.f().mView);
                aVar4.p(sharedElementTargetNames2);
                aVar4.p(aVar2.values());
                if (exitTransitionCallback != null) {
                    throw null;
                }
                z.x(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    eVar5 = eVar;
                    aVar = aVar2;
                    arrayList3 = arrayList6;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    b0Var = b0Var2;
                    view7 = view8;
                    obj3 = null;
                    eVar6 = eVar2;
                } else {
                    z.f(eVar2.f(), eVar.f(), z2, aVar3, true);
                    HashMap map2 = map;
                    View view9 = view6;
                    Rect rect3 = rect2;
                    aVar = aVar2;
                    ArrayList<View> arrayList8 = arrayList6;
                    a.i.r.u.a(m(), new g(eVar2, eVar, z, aVar4));
                    Iterator<View> it2 = aVar3.values().iterator();
                    while (it2.hasNext()) {
                        t(arrayList5, it2.next());
                    }
                    if (sharedElementSourceNames.isEmpty()) {
                        view7 = view8;
                    } else {
                        View view10 = (View) aVar3.get(sharedElementSourceNames.get(0));
                        b0Var2.v(objB, view10);
                        view7 = view10;
                    }
                    Iterator<View> it3 = aVar4.values().iterator();
                    while (it3.hasNext()) {
                        t(arrayList8, it3.next());
                    }
                    arrayList3 = arrayList8;
                    if (sharedElementTargetNames2.isEmpty() || (view5 = (View) aVar4.get(sharedElementTargetNames2.get(0))) == null) {
                        rect = rect3;
                        view4 = view9;
                    } else {
                        rect = rect3;
                        a.i.r.u.a(m(), new h(b0Var2, view5, rect));
                        view4 = view9;
                        z3 = true;
                    }
                    b0Var2.z(objB, view4, arrayList5);
                    arrayList4 = arrayList5;
                    view3 = view4;
                    b0Var = b0Var2;
                    b0Var2.t(objB, null, null, null, null, objB, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    map = map2;
                    map.put(eVar5, bool);
                    eVar6 = eVar2;
                    map.put(eVar6, bool);
                    obj3 = objB;
                }
            }
            z2 = z;
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view6 = view3;
            eVar8 = eVar6;
            aVar2 = aVar;
            arrayList6 = arrayList3;
            b0Var2 = b0Var;
        }
        View view11 = view7;
        a.f.a aVar5 = aVar2;
        ArrayList<View> arrayList9 = arrayList6;
        e0.e eVar9 = eVar7;
        ArrayList<View> arrayList10 = arrayList5;
        Rect rect4 = rect2;
        b0 b0Var3 = b0Var2;
        e0.e eVar10 = eVar8;
        View view12 = view6;
        ArrayList arrayList11 = new ArrayList();
        Iterator<m> it4 = list.iterator();
        Object obj4 = null;
        Object objN2 = null;
        while (it4.hasNext()) {
            m next = it4.next();
            if (next.d()) {
                map.put(next.b(), Boolean.FALSE);
                next.a();
            } else {
                Object objG = b0Var3.g(next.h());
                e0.e eVarB = next.b();
                boolean z4 = obj3 != null && (eVarB == eVar9 || eVarB == eVar10);
                if (objG == null) {
                    if (!z4) {
                        map.put(eVarB, Boolean.FALSE);
                        next.a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    it = it4;
                    view = view12;
                    objN = obj4;
                    eVar3 = eVar10;
                    view2 = view11;
                } else {
                    it = it4;
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj5 = obj4;
                    t(arrayList12, eVarB.f().mView);
                    if (z4) {
                        if (eVarB == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        b0Var3.a(objG, view12);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view12;
                        eVar4 = eVarB;
                        obj2 = objN2;
                        eVar3 = eVar10;
                        obj = obj5;
                    } else {
                        b0Var3.b(objG, arrayList12);
                        view = view12;
                        obj = obj5;
                        arrayList = arrayList10;
                        obj2 = objN2;
                        arrayList2 = arrayList9;
                        eVar3 = eVar10;
                        b0Var3.t(objG, objG, arrayList12, null, null, null, null);
                        if (eVarB.e() == e0.e.c.GONE) {
                            eVar4 = eVarB;
                            list2.remove(eVar4);
                            b0Var3.r(objG, eVar4.f().mView, arrayList12);
                            a.i.r.u.a(m(), new i(arrayList12));
                        } else {
                            eVar4 = eVarB;
                        }
                    }
                    if (eVar4.e() == e0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z3) {
                            b0Var3.u(objG, rect4);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        b0Var3.v(objG, view2);
                    }
                    map.put(eVar4, Boolean.TRUE);
                    if (next.j()) {
                        objN2 = b0Var3.n(obj2, objG, null);
                        objN = obj;
                    } else {
                        objN = b0Var3.n(obj, objG, null);
                        objN2 = obj2;
                    }
                }
                eVar10 = eVar3;
                view11 = view2;
                obj4 = objN;
                view12 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
                it4 = it;
            }
        }
        ArrayList<View> arrayList13 = arrayList9;
        ArrayList<View> arrayList14 = arrayList10;
        e0.e eVar11 = eVar10;
        Object objM = b0Var3.m(objN2, obj4, obj3);
        for (m mVar4 : list) {
            if (!mVar4.d()) {
                Object objH = mVar4.h();
                e0.e eVarB2 = mVar4.b();
                boolean z5 = obj3 != null && (eVarB2 == eVar9 || eVarB2 == eVar11);
                if (objH != null || z5) {
                    if (a.i.r.x.U(m())) {
                        b0Var3.w(mVar4.b().f(), objM, mVar4.c(), new j(mVar4));
                    } else {
                        if (n.G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + eVarB2);
                        }
                        mVar4.a();
                    }
                }
            }
        }
        if (!a.i.r.x.U(m())) {
            return map;
        }
        z.A(arrayList11, 4);
        ArrayList<String> arrayListO = b0Var3.o(arrayList13);
        b0Var3.c(m(), objM);
        b0Var3.y(m(), arrayList14, arrayList13, arrayListO, aVar5);
        z.A(arrayList11, 0);
        b0Var3.A(obj3, arrayList14, arrayList13);
        return map;
    }
}
