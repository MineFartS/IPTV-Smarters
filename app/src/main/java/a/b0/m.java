package a.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f961b = {2, 1, 3, 4};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f962c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ThreadLocal<a.f.a<Animator, d>> f963d = new ThreadLocal<>();
    public p H;
    public e I;
    public a.f.a<String, String> J;
    public ArrayList<s> x;
    public ArrayList<s> y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f964e = getClass().getName();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f965f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f966g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TimeInterpolator f967h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<Integer> f968i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<View> f969j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<String> f970k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<Class<?>> f971l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<Integer> f972m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<View> f973n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<Class<?>> f974o = null;
    public ArrayList<String> p = null;
    public ArrayList<Integer> q = null;
    public ArrayList<View> r = null;
    public ArrayList<Class<?>> s = null;
    public t t = new t();
    public t u = new t();
    public q v = null;
    public int[] w = f961b;
    public ViewGroup z = null;
    public boolean A = false;
    public ArrayList<Animator> B = new ArrayList<>();
    public int C = 0;
    public boolean D = false;
    public boolean E = false;
    public ArrayList<f> F = null;
    public ArrayList<Animator> G = new ArrayList<>();
    public g K = f962c;

    public static class a extends g {
        @Override // a.b0.g
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.f.a f975b;

        public b(a.f.a aVar) {
            this.f975b = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f975b.remove(animator);
            m.this.B.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.this.B.add(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.this.q();
            animator.removeListener(this);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s f980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public m0 f981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public m f982e;

        public d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.f978a = view;
            this.f979b = str;
            this.f980c = sVar;
            this.f981d = m0Var;
            this.f982e = mVar;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    public static a.f.a<Animator, d> C() {
        a.f.a<Animator, d> aVar = f963d.get();
        if (aVar != null) {
            return aVar;
        }
        a.f.a<Animator, d> aVar2 = new a.f.a<>();
        f963d.set(aVar2);
        return aVar2;
    }

    public static boolean M(s sVar, s sVar2, String str) {
        Object obj = sVar.f996a.get(str);
        Object obj2 = sVar2.f996a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public static void e(t tVar, View view, s sVar) {
        tVar.f999a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f1000b.indexOfKey(id) >= 0) {
                tVar.f1000b.put(id, null);
            } else {
                tVar.f1000b.put(id, view);
            }
        }
        String strL = a.i.r.x.L(view);
        if (strL != null) {
            if (tVar.f1002d.containsKey(strL)) {
                tVar.f1002d.put(strL, null);
            } else {
                tVar.f1002d.put(strL, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f1001c.h(itemIdAtPosition) < 0) {
                    a.i.r.x.x0(view, true);
                    tVar.f1001c.k(itemIdAtPosition, view);
                    return;
                }
                View viewF = tVar.f1001c.f(itemIdAtPosition);
                if (viewF != null) {
                    a.i.r.x.x0(viewF, false);
                    tVar.f1001c.k(itemIdAtPosition, null);
                }
            }
        }
    }

    public g A() {
        return this.K;
    }

    public p B() {
        return this.H;
    }

    public long D() {
        return this.f965f;
    }

    public List<Integer> E() {
        return this.f968i;
    }

    public List<String> F() {
        return this.f970k;
    }

    public List<Class<?>> G() {
        return this.f971l;
    }

    public List<View> H() {
        return this.f969j;
    }

    public String[] I() {
        return null;
    }

    public s J(View view, boolean z) {
        q qVar = this.v;
        if (qVar != null) {
            return qVar.J(view, z);
        }
        return (z ? this.t : this.u).f999a.get(view);
    }

    public boolean K(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] strArrI = I();
        if (strArrI == null) {
            Iterator<String> it = sVar.f996a.keySet().iterator();
            while (it.hasNext()) {
                if (M(sVar, sVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrI) {
            if (!M(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public boolean L(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f972m;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f973n;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f974o;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f974o.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.p != null && a.i.r.x.L(view) != null && this.p.contains(a.i.r.x.L(view))) {
            return false;
        }
        if ((this.f968i.size() == 0 && this.f969j.size() == 0 && (((arrayList = this.f971l) == null || arrayList.isEmpty()) && ((arrayList2 = this.f970k) == null || arrayList2.isEmpty()))) || this.f968i.contains(Integer.valueOf(id)) || this.f969j.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f970k;
        if (arrayList6 != null && arrayList6.contains(a.i.r.x.L(view))) {
            return true;
        }
        if (this.f971l != null) {
            for (int i3 = 0; i3 < this.f971l.size(); i3++) {
                if (this.f971l.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void N(a.f.a<View, s> aVar, a.f.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View viewValueAt = sparseArray.valueAt(i2);
            if (viewValueAt != null && L(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && L(view)) {
                s sVar = aVar.get(viewValueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.x.add(sVar);
                    this.y.add(sVar2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void O(a.f.a<View, s> aVar, a.f.a<View, s> aVar2) {
        s sVarRemove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewJ = aVar.j(size);
            if (viewJ != null && L(viewJ) && (sVarRemove = aVar2.remove(viewJ)) != null && L(sVarRemove.f997b)) {
                this.x.add(aVar.l(size));
                this.y.add(sVarRemove);
            }
        }
    }

    public final void P(a.f.a<View, s> aVar, a.f.a<View, s> aVar2, a.f.f<View> fVar, a.f.f<View> fVar2) {
        View viewF;
        int iN = fVar.n();
        for (int i2 = 0; i2 < iN; i2++) {
            View viewO = fVar.o(i2);
            if (viewO != null && L(viewO) && (viewF = fVar2.f(fVar.j(i2))) != null && L(viewF)) {
                s sVar = aVar.get(viewO);
                s sVar2 = aVar2.get(viewF);
                if (sVar != null && sVar2 != null) {
                    this.x.add(sVar);
                    this.y.add(sVar2);
                    aVar.remove(viewO);
                    aVar2.remove(viewF);
                }
            }
        }
    }

    public final void R(a.f.a<View, s> aVar, a.f.a<View, s> aVar2, a.f.a<String, View> aVar3, a.f.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View viewN = aVar3.n(i2);
            if (viewN != null && L(viewN) && (view = aVar4.get(aVar3.j(i2))) != null && L(view)) {
                s sVar = aVar.get(viewN);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.x.add(sVar);
                    this.y.add(sVar2);
                    aVar.remove(viewN);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void S(t tVar, t tVar2) {
        a.f.a<View, s> aVar = new a.f.a<>(tVar.f999a);
        a.f.a<View, s> aVar2 = new a.f.a<>(tVar2.f999a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.w;
            if (i2 >= iArr.length) {
                c(aVar, aVar2);
                return;
            }
            int i3 = iArr[i2];
            if (i3 == 1) {
                O(aVar, aVar2);
            } else if (i3 == 2) {
                R(aVar, aVar2, tVar.f1002d, tVar2.f1002d);
            } else if (i3 == 3) {
                N(aVar, aVar2, tVar.f1000b, tVar2.f1000b);
            } else if (i3 == 4) {
                P(aVar, aVar2, tVar.f1001c, tVar2.f1001c);
            }
            i2++;
        }
    }

    public void T(View view) {
        if (this.E) {
            return;
        }
        a.f.a<Animator, d> aVarC = C();
        int size = aVarC.size();
        m0 m0VarD = c0.d(view);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            d dVarN = aVarC.n(i2);
            if (dVarN.f978a != null && m0VarD.equals(dVarN.f981d)) {
                a.b0.a.b(aVarC.j(i2));
            }
        }
        ArrayList<f> arrayList = this.F;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.F.clone();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((f) arrayList2.get(i3)).b(this);
            }
        }
        this.D = true;
    }

    public void W(ViewGroup viewGroup) {
        d dVar;
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
        S(this.t, this.u);
        a.f.a<Animator, d> aVarC = C();
        int size = aVarC.size();
        m0 m0VarD = c0.d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animatorJ = aVarC.j(i2);
            if (animatorJ != null && (dVar = aVarC.get(animatorJ)) != null && dVar.f978a != null && m0VarD.equals(dVar.f981d)) {
                s sVar = dVar.f980c;
                View view = dVar.f978a;
                s sVarJ = J(view, true);
                s sVarY = y(view, true);
                if (sVarJ == null && sVarY == null) {
                    sVarY = this.u.f999a.get(view);
                }
                if (!(sVarJ == null && sVarY == null) && dVar.f982e.K(sVar, sVarY)) {
                    if (animatorJ.isRunning() || animatorJ.isStarted()) {
                        animatorJ.cancel();
                    } else {
                        aVarC.remove(animatorJ);
                    }
                }
            }
        }
        p(viewGroup, this.t, this.u, this.x, this.y);
        b0();
    }

    public m X(f fVar) {
        ArrayList<f> arrayList = this.F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.F.size() == 0) {
            this.F = null;
        }
        return this;
    }

    public m Y(View view) {
        this.f969j.remove(view);
        return this;
    }

    public void Z(View view) {
        if (this.D) {
            if (!this.E) {
                a.f.a<Animator, d> aVarC = C();
                int size = aVarC.size();
                m0 m0VarD = c0.d(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    d dVarN = aVarC.n(i2);
                    if (dVarN.f978a != null && m0VarD.equals(dVarN.f981d)) {
                        a.b0.a.c(aVarC.j(i2));
                    }
                }
                ArrayList<f> arrayList = this.F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.F.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((f) arrayList2.get(i3)).e(this);
                    }
                }
            }
            this.D = false;
        }
    }

    public m a(f fVar) {
        if (this.F == null) {
            this.F = new ArrayList<>();
        }
        this.F.add(fVar);
        return this;
    }

    public final void a0(Animator animator, a.f.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            f(animator);
        }
    }

    public m b(View view) {
        this.f969j.add(view);
        return this;
    }

    public void b0() {
        j0();
        a.f.a<Animator, d> aVarC = C();
        for (Animator animator : this.G) {
            if (aVarC.containsKey(animator)) {
                j0();
                a0(animator, aVarC);
            }
        }
        this.G.clear();
        q();
    }

    public final void c(a.f.a<View, s> aVar, a.f.a<View, s> aVar2) {
        for (int i2 = 0; i2 < aVar.size(); i2++) {
            s sVarN = aVar.n(i2);
            if (L(sVarN.f997b)) {
                this.x.add(sVarN);
                this.y.add(null);
            }
        }
        for (int i3 = 0; i3 < aVar2.size(); i3++) {
            s sVarN2 = aVar2.n(i3);
            if (L(sVarN2.f997b)) {
                this.y.add(sVarN2);
                this.x.add(null);
            }
        }
    }

    public void cancel() {
        for (int size = this.B.size() - 1; size >= 0; size--) {
            this.B.get(size).cancel();
        }
        ArrayList<f> arrayList = this.F;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.F.clone();
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((f) arrayList2.get(i2)).d(this);
        }
    }

    public m d0(long j2) {
        this.f966g = j2;
        return this;
    }

    public void e0(e eVar) {
        this.I = eVar;
    }

    public void f(Animator animator) {
        if (animator == null) {
            q();
            return;
        }
        if (r() >= 0) {
            animator.setDuration(r());
        }
        if (D() >= 0) {
            animator.setStartDelay(D() + animator.getStartDelay());
        }
        if (w() != null) {
            animator.setInterpolator(w());
        }
        animator.addListener(new c());
        animator.start();
    }

    public m f0(TimeInterpolator timeInterpolator) {
        this.f967h = timeInterpolator;
        return this;
    }

    public abstract void g(s sVar);

    public void g0(g gVar) {
        if (gVar == null) {
            gVar = f962c;
        }
        this.K = gVar;
    }

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f972m;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.f973n;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f974o;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.f974o.get(i2).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z) {
                        k(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f998c.add(this);
                    j(sVar);
                    e(z ? this.t : this.u, view, sVar);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.q;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.r;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.s;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    if (this.s.get(i3).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                h(viewGroup.getChildAt(i4), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public void h0(p pVar) {
    }

    public m i0(long j2) {
        this.f965f = j2;
        return this;
    }

    public void j(s sVar) {
        if (this.H != null && !sVar.f996a.isEmpty()) {
            throw null;
        }
    }

    public void j0() {
        if (this.C == 0) {
            ArrayList<f> arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.F.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            this.E = false;
        }
        this.C++;
    }

    public abstract void k(s sVar);

    public String k0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f966g != -1) {
            str2 = str2 + "dur(" + this.f966g + ") ";
        }
        if (this.f965f != -1) {
            str2 = str2 + "dly(" + this.f965f + ") ";
        }
        if (this.f967h != null) {
            str2 = str2 + "interp(" + this.f967h + ") ";
        }
        if (this.f968i.size() <= 0 && this.f969j.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f968i.size() > 0) {
            for (int i2 = 0; i2 < this.f968i.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f968i.get(i2);
            }
        }
        if (this.f969j.size() > 0) {
            for (int i3 = 0; i3 < this.f969j.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f969j.get(i3);
            }
        }
        return str3 + ")";
    }

    public void l(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        a.f.a<String, String> aVar;
        m(z);
        if ((this.f968i.size() > 0 || this.f969j.size() > 0) && (((arrayList = this.f970k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f971l) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f968i.size(); i2++) {
                View viewFindViewById = viewGroup.findViewById(this.f968i.get(i2).intValue());
                if (viewFindViewById != null) {
                    s sVar = new s(viewFindViewById);
                    if (z) {
                        k(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f998c.add(this);
                    j(sVar);
                    e(z ? this.t : this.u, viewFindViewById, sVar);
                }
            }
            for (int i3 = 0; i3 < this.f969j.size(); i3++) {
                View view = this.f969j.get(i3);
                s sVar2 = new s(view);
                if (z) {
                    k(sVar2);
                } else {
                    g(sVar2);
                }
                sVar2.f998c.add(this);
                j(sVar2);
                e(z ? this.t : this.u, view, sVar2);
            }
        } else {
            h(viewGroup, z);
        }
        if (z || (aVar = this.J) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add(this.t.f1002d.remove(this.J.j(i4)));
        }
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) arrayList3.get(i5);
            if (view2 != null) {
                this.t.f1002d.put(this.J.n(i5), view2);
            }
        }
    }

    public void m(boolean z) {
        t tVar;
        if (z) {
            this.t.f999a.clear();
            this.t.f1000b.clear();
            tVar = this.t;
        } else {
            this.u.f999a.clear();
            this.u.f1000b.clear();
            tVar = this.u;
        }
        tVar.f1001c.b();
    }

    @Override // 
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.G = new ArrayList<>();
            mVar.t = new t();
            mVar.u = new t();
            mVar.x = null;
            mVar.y = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(android.view.ViewGroup r20, a.b0.t r21, a.b0.t r22, java.util.ArrayList<a.b0.s> r23, java.util.ArrayList<a.b0.s> r24) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b0.m.p(android.view.ViewGroup, a.b0.t, a.b0.t, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void q() {
        int i2 = this.C - 1;
        this.C = i2;
        if (i2 == 0) {
            ArrayList<f> arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.F.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((f) arrayList2.get(i3)).c(this);
                }
            }
            for (int i4 = 0; i4 < this.t.f1001c.n(); i4++) {
                View viewO = this.t.f1001c.o(i4);
                if (viewO != null) {
                    a.i.r.x.x0(viewO, false);
                }
            }
            for (int i5 = 0; i5 < this.u.f1001c.n(); i5++) {
                View viewO2 = this.u.f1001c.o(i5);
                if (viewO2 != null) {
                    a.i.r.x.x0(viewO2, false);
                }
            }
            this.E = true;
        }
    }

    public long r() {
        return this.f966g;
    }

    public String toString() {
        return k0(BuildConfig.FLAVOR);
    }

    public e u() {
        return this.I;
    }

    public TimeInterpolator w() {
        return this.f967h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r3 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r8 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r7 = r6.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r7 = r6.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        return r7.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a.b0.s y(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            a.b0.q r0 = r6.v
            if (r0 == 0) goto L9
            a.b0.s r7 = r0.y(r7, r8)
            return r7
        L9:
            if (r8 == 0) goto Le
            java.util.ArrayList<a.b0.s> r0 = r6.x
            goto L10
        Le:
            java.util.ArrayList<a.b0.s> r0 = r6.y
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = -1
            r4 = 0
        L1a:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r0.get(r4)
            a.b0.s r5 = (a.b0.s) r5
            if (r5 != 0) goto L25
            return r1
        L25:
            android.view.View r5 = r5.f997b
            if (r5 != r7) goto L2b
            r3 = r4
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            if (r3 < 0) goto L3e
            if (r8 == 0) goto L35
            java.util.ArrayList<a.b0.s> r7 = r6.y
            goto L37
        L35:
            java.util.ArrayList<a.b0.s> r7 = r6.x
        L37:
            java.lang.Object r7 = r7.get(r3)
            r1 = r7
            a.b0.s r1 = (a.b0.s) r1
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b0.m.y(android.view.View, boolean):a.b0.s");
    }

    public String z() {
        return this.f964e;
    }
}
