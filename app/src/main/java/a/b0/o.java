package a.b0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static m f983a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadLocal<WeakReference<a.f.a<ViewGroup, ArrayList<m>>>> f984b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<ViewGroup> f985c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m f986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ViewGroup f987c;

        /* JADX INFO: renamed from: a.b0.o$a$a, reason: collision with other inner class name */
        public class C0013a extends n {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.f.a f988b;

            public C0013a(a.f.a aVar) {
                this.f988b = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // a.b0.m.f
            public void c(m mVar) {
                ((ArrayList) this.f988b.get(a.this.f987c)).remove(mVar);
                mVar.X(this);
            }
        }

        public a(m mVar, ViewGroup viewGroup) {
            this.f986b = mVar;
            this.f987c = viewGroup;
        }

        public final void a() {
            this.f987c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f987c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!o.f985c.remove(this.f987c)) {
                return true;
            }
            a.f.a<ViewGroup, ArrayList<m>> aVarC = o.c();
            ArrayList<m> arrayList = aVarC.get(this.f987c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarC.put(this.f987c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f986b);
            this.f986b.a(new C0013a(aVarC));
            this.f986b.l(this.f987c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).Z(this.f987c);
                }
            }
            this.f986b.W(this.f987c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            o.f985c.remove(this.f987c);
            ArrayList<m> arrayList = o.c().get(this.f987c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().Z(this.f987c);
                }
            }
            this.f986b.m(true);
        }
    }

    public static void a(ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(ViewGroup viewGroup, m mVar) {
        if (f985c.contains(viewGroup) || !a.i.r.x.U(viewGroup)) {
            return;
        }
        f985c.add(viewGroup);
        if (mVar == null) {
            mVar = f983a;
        }
        m mVarClone = mVar.clone();
        e(viewGroup, mVarClone);
        l.c(viewGroup, null);
        d(viewGroup, mVarClone);
    }

    public static a.f.a<ViewGroup, ArrayList<m>> c() {
        a.f.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<a.f.a<ViewGroup, ArrayList<m>>> weakReference = f984b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        a.f.a<ViewGroup, ArrayList<m>> aVar2 = new a.f.a<>();
        f984b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    public static void d(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void e(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().T(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.l(viewGroup, true);
        }
        l lVarB = l.b(viewGroup);
        if (lVarB != null) {
            lVarB.a();
        }
    }
}
