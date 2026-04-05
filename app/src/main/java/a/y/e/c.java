package a.y.e;

import a.i.r.x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static TimeInterpolator f3818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f3819i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f3820j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<j> f3821k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<i> f3822l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.e0>> f3823m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<ArrayList<j>> f3824n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<ArrayList<i>> f3825o = new ArrayList<>();
    public ArrayList<RecyclerView.e0> p = new ArrayList<>();
    public ArrayList<RecyclerView.e0> q = new ArrayList<>();
    public ArrayList<RecyclerView.e0> r = new ArrayList<>();
    public ArrayList<RecyclerView.e0> s = new ArrayList<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3826b;

        public a(ArrayList arrayList) {
            this.f3826b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f3826b) {
                c.this.U(jVar.f3860a, jVar.f3861b, jVar.f3862c, jVar.f3863d, jVar.f3864e);
            }
            this.f3826b.clear();
            c.this.f3824n.remove(this.f3826b);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3828b;

        public b(ArrayList arrayList) {
            this.f3828b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3828b.iterator();
            while (it.hasNext()) {
                c.this.T((i) it.next());
            }
            this.f3828b.clear();
            c.this.f3825o.remove(this.f3828b);
        }
    }

    /* JADX INFO: renamed from: a.y.e.c$c, reason: collision with other inner class name */
    public class RunnableC0090c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3830b;

        public RunnableC0090c(ArrayList arrayList) {
            this.f3830b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3830b.iterator();
            while (it.hasNext()) {
                c.this.S((RecyclerView.e0) it.next());
            }
            this.f3830b.clear();
            c.this.f3823m.remove(this.f3830b);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f3832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f3834d;

        public d(RecyclerView.e0 e0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3832b = e0Var;
            this.f3833c = viewPropertyAnimator;
            this.f3834d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3833c.setListener(null);
            this.f3834d.setAlpha(1.0f);
            c.this.H(this.f3832b);
            c.this.r.remove(this.f3832b);
            c.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.I(this.f3832b);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f3836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3838d;

        public e(RecyclerView.e0 e0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3836b = e0Var;
            this.f3837c = view;
            this.f3838d = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3837c.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3838d.setListener(null);
            c.this.B(this.f3836b);
            c.this.p.remove(this.f3836b);
            c.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.C(this.f3836b);
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f3840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f3841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f3842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f3843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3844f;

        public f(RecyclerView.e0 e0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3840b = e0Var;
            this.f3841c = i2;
            this.f3842d = view;
            this.f3843e = i3;
            this.f3844f = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3841c != 0) {
                this.f3842d.setTranslationX(0.0f);
            }
            if (this.f3843e != 0) {
                this.f3842d.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3844f.setListener(null);
            c.this.F(this.f3840b);
            c.this.q.remove(this.f3840b);
            c.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.G(this.f3840b);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f3846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f3848d;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3846b = iVar;
            this.f3847c = viewPropertyAnimator;
            this.f3848d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3847c.setListener(null);
            this.f3848d.setAlpha(1.0f);
            this.f3848d.setTranslationX(0.0f);
            this.f3848d.setTranslationY(0.0f);
            c.this.D(this.f3846b.f3854a, true);
            c.this.s.remove(this.f3846b.f3854a);
            c.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.E(this.f3846b.f3854a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f3850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f3852d;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3850b = iVar;
            this.f3851c = viewPropertyAnimator;
            this.f3852d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3851c.setListener(null);
            this.f3852d.setAlpha(1.0f);
            this.f3852d.setTranslationX(0.0f);
            this.f3852d.setTranslationY(0.0f);
            c.this.D(this.f3850b.f3855b, false);
            c.this.s.remove(this.f3850b.f3855b);
            c.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.E(this.f3850b.f3855b, false);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.e0 f3854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.e0 f3855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3857d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3859f;

        public i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            this.f3854a = e0Var;
            this.f3855b = e0Var2;
        }

        public i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i2, int i3, int i4, int i5) {
            this(e0Var, e0Var2);
            this.f3856c = i2;
            this.f3857d = i3;
            this.f3858e = i4;
            this.f3859f = i5;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3854a + ", newHolder=" + this.f3855b + ", fromX=" + this.f3856c + ", fromY=" + this.f3857d + ", toX=" + this.f3858e + ", toY=" + this.f3859f + '}';
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.e0 f3860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3864e;

        public j(RecyclerView.e0 e0Var, int i2, int i3, int i4, int i5) {
            this.f3860a = e0Var;
            this.f3861b = i2;
            this.f3862c = i3;
            this.f3863d = i4;
            this.f3864e = i5;
        }
    }

    @Override // a.y.e.p
    public boolean A(RecyclerView.e0 e0Var) {
        b0(e0Var);
        this.f3819i.add(e0Var);
        return true;
    }

    public void S(RecyclerView.e0 e0Var) {
        View view = e0Var.f4855b;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.p.add(e0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(e0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    public void T(i iVar) {
        RecyclerView.e0 e0Var = iVar.f3854a;
        View view = e0Var == null ? null : e0Var.f4855b;
        RecyclerView.e0 e0Var2 = iVar.f3855b;
        View view2 = e0Var2 != null ? e0Var2.f4855b : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.s.add(iVar.f3854a);
            duration.translationX(iVar.f3858e - iVar.f3856c);
            duration.translationY(iVar.f3859f - iVar.f3857d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.s.add(iVar.f3855b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public void U(RecyclerView.e0 e0Var, int i2, int i3, int i4, int i5) {
        View view = e0Var.f4855b;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.q.add(e0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(e0Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
    }

    public final void V(RecyclerView.e0 e0Var) {
        View view = e0Var.f4855b;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.r.add(e0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(e0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    public void W(List<RecyclerView.e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f4855b.animate().cancel();
        }
    }

    public void X() {
        if (p()) {
            return;
        }
        i();
    }

    public final void Y(List<i> list, RecyclerView.e0 e0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (a0(iVar, e0Var) && iVar.f3854a == null && iVar.f3855b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void Z(i iVar) {
        RecyclerView.e0 e0Var = iVar.f3854a;
        if (e0Var != null) {
            a0(iVar, e0Var);
        }
        RecyclerView.e0 e0Var2 = iVar.f3855b;
        if (e0Var2 != null) {
            a0(iVar, e0Var2);
        }
    }

    public final boolean a0(i iVar, RecyclerView.e0 e0Var) {
        boolean z = false;
        if (iVar.f3855b == e0Var) {
            iVar.f3855b = null;
        } else {
            if (iVar.f3854a != e0Var) {
                return false;
            }
            iVar.f3854a = null;
            z = true;
        }
        e0Var.f4855b.setAlpha(1.0f);
        e0Var.f4855b.setTranslationX(0.0f);
        e0Var.f4855b.setTranslationY(0.0f);
        D(e0Var, z);
        return true;
    }

    public final void b0(RecyclerView.e0 e0Var) {
        if (f3818h == null) {
            f3818h = new ValueAnimator().getInterpolator();
        }
        e0Var.f4855b.animate().setInterpolator(f3818h);
        j(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.e0 e0Var, List<Object> list) {
        return !list.isEmpty() || super.g(e0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.e0 e0Var) {
        View view = e0Var.f4855b;
        view.animate().cancel();
        int size = this.f3821k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f3821k.get(size).f3860a == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                F(e0Var);
                this.f3821k.remove(size);
            }
        }
        Y(this.f3822l, e0Var);
        if (this.f3819i.remove(e0Var)) {
            view.setAlpha(1.0f);
            H(e0Var);
        }
        if (this.f3820j.remove(e0Var)) {
            view.setAlpha(1.0f);
            B(e0Var);
        }
        for (int size2 = this.f3825o.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f3825o.get(size2);
            Y(arrayList, e0Var);
            if (arrayList.isEmpty()) {
                this.f3825o.remove(size2);
            }
        }
        for (int size3 = this.f3824n.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f3824n.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f3860a == e0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    F(e0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3824n.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3823m.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.e0> arrayList3 = this.f3823m.get(size5);
            if (arrayList3.remove(e0Var)) {
                view.setAlpha(1.0f);
                B(e0Var);
                if (arrayList3.isEmpty()) {
                    this.f3823m.remove(size5);
                }
            }
        }
        this.r.remove(e0Var);
        this.p.remove(e0Var);
        this.s.remove(e0Var);
        this.q.remove(e0Var);
        X();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f3821k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f3821k.get(size);
            View view = jVar.f3860a.f4855b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            F(jVar.f3860a);
            this.f3821k.remove(size);
        }
        for (int size2 = this.f3819i.size() - 1; size2 >= 0; size2--) {
            H(this.f3819i.get(size2));
            this.f3819i.remove(size2);
        }
        int size3 = this.f3820j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.e0 e0Var = this.f3820j.get(size3);
            e0Var.f4855b.setAlpha(1.0f);
            B(e0Var);
            this.f3820j.remove(size3);
        }
        for (int size4 = this.f3822l.size() - 1; size4 >= 0; size4--) {
            Z(this.f3822l.get(size4));
        }
        this.f3822l.clear();
        if (p()) {
            for (int size5 = this.f3824n.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f3824n.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f3860a.f4855b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    F(jVar2.f3860a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3824n.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3823m.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.e0> arrayList2 = this.f3823m.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.e0 e0Var2 = arrayList2.get(size8);
                    e0Var2.f4855b.setAlpha(1.0f);
                    B(e0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3823m.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3825o.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f3825o.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    Z(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3825o.remove(arrayList3);
                    }
                }
            }
            W(this.r);
            W(this.q);
            W(this.p);
            W(this.s);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f3820j.isEmpty() && this.f3822l.isEmpty() && this.f3821k.isEmpty() && this.f3819i.isEmpty() && this.q.isEmpty() && this.r.isEmpty() && this.p.isEmpty() && this.s.isEmpty() && this.f3824n.isEmpty() && this.f3823m.isEmpty() && this.f3825o.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v() {
        boolean z = !this.f3819i.isEmpty();
        boolean z2 = !this.f3821k.isEmpty();
        boolean z3 = !this.f3822l.isEmpty();
        boolean z4 = !this.f3820j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.e0> it = this.f3819i.iterator();
            while (it.hasNext()) {
                V(it.next());
            }
            this.f3819i.clear();
            if (z2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f3821k);
                this.f3824n.add(arrayList);
                this.f3821k.clear();
                a aVar = new a(arrayList);
                if (z) {
                    x.i0(arrayList.get(0).f3860a.f4855b, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f3822l);
                this.f3825o.add(arrayList2);
                this.f3822l.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    x.i0(arrayList2.get(0).f3854a.f4855b, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.e0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f3820j);
                this.f3823m.add(arrayList3);
                this.f3820j.clear();
                RunnableC0090c runnableC0090c = new RunnableC0090c(arrayList3);
                if (z || z2 || z3) {
                    x.i0(arrayList3.get(0).f4855b, runnableC0090c, (z ? o() : 0L) + Math.max(z2 ? n() : 0L, z3 ? m() : 0L));
                } else {
                    runnableC0090c.run();
                }
            }
        }
    }

    @Override // a.y.e.p
    public boolean x(RecyclerView.e0 e0Var) {
        b0(e0Var);
        e0Var.f4855b.setAlpha(0.0f);
        this.f3820j.add(e0Var);
        return true;
    }

    @Override // a.y.e.p
    public boolean y(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i2, int i3, int i4, int i5) {
        if (e0Var == e0Var2) {
            return z(e0Var, i2, i3, i4, i5);
        }
        float translationX = e0Var.f4855b.getTranslationX();
        float translationY = e0Var.f4855b.getTranslationY();
        float alpha = e0Var.f4855b.getAlpha();
        b0(e0Var);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        e0Var.f4855b.setTranslationX(translationX);
        e0Var.f4855b.setTranslationY(translationY);
        e0Var.f4855b.setAlpha(alpha);
        if (e0Var2 != null) {
            b0(e0Var2);
            e0Var2.f4855b.setTranslationX(-i6);
            e0Var2.f4855b.setTranslationY(-i7);
            e0Var2.f4855b.setAlpha(0.0f);
        }
        this.f3822l.add(new i(e0Var, e0Var2, i2, i3, i4, i5));
        return true;
    }

    @Override // a.y.e.p
    public boolean z(RecyclerView.e0 e0Var, int i2, int i3, int i4, int i5) {
        View view = e0Var.f4855b;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) e0Var.f4855b.getTranslationY());
        b0(e0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            F(e0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.f3821k.add(new j(e0Var, translationX, translationY, i4, i5));
        return true;
    }
}
