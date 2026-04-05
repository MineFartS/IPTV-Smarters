package a.b0;

import a.b0.m;
import a.i.n.b;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public class e extends a.l.d.b0 {

    public class a extends m.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f904a;

        public a(Rect rect) {
            this.f904a = rect;
        }
    }

    public class b implements m.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f907c;

        public b(View view, ArrayList arrayList) {
            this.f906b = view;
            this.f907c = arrayList;
        }

        @Override // a.b0.m.f
        public void a(m mVar) {
            mVar.X(this);
            mVar.a(this);
        }

        @Override // a.b0.m.f
        public void b(m mVar) {
        }

        @Override // a.b0.m.f
        public void c(m mVar) {
            mVar.X(this);
            this.f906b.setVisibility(8);
            int size = this.f907c.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f907c.get(i2)).setVisibility(0);
            }
        }

        @Override // a.b0.m.f
        public void d(m mVar) {
        }

        @Override // a.b0.m.f
        public void e(m mVar) {
        }
    }

    public class c extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ArrayList f912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Object f913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ArrayList f914g;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f909b = obj;
            this.f910c = arrayList;
            this.f911d = obj2;
            this.f912e = arrayList2;
            this.f913f = obj3;
            this.f914g = arrayList3;
        }

        @Override // a.b0.n, a.b0.m.f
        public void a(m mVar) {
            Object obj = this.f909b;
            if (obj != null) {
                e.this.q(obj, this.f910c, null);
            }
            Object obj2 = this.f911d;
            if (obj2 != null) {
                e.this.q(obj2, this.f912e, null);
            }
            Object obj3 = this.f913f;
            if (obj3 != null) {
                e.this.q(obj3, this.f914g, null);
            }
        }

        @Override // a.b0.m.f
        public void c(m mVar) {
            mVar.X(this);
        }
    }

    public class d implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f916a;

        public d(m mVar) {
            this.f916a = mVar;
        }

        @Override // a.i.n.b.a
        public void a() {
            this.f916a.cancel();
        }
    }

    /* JADX INFO: renamed from: a.b0.e$e, reason: collision with other inner class name */
    public class C0012e implements m.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f918b;

        public C0012e(Runnable runnable) {
            this.f918b = runnable;
        }

        @Override // a.b0.m.f
        public void a(m mVar) {
        }

        @Override // a.b0.m.f
        public void b(m mVar) {
        }

        @Override // a.b0.m.f
        public void c(m mVar) {
            this.f918b.run();
        }

        @Override // a.b0.m.f
        public void d(m mVar) {
        }

        @Override // a.b0.m.f
        public void e(m mVar) {
        }
    }

    public class f extends m.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f920a;

        public f(Rect rect) {
            this.f920a = rect;
        }
    }

    public static boolean C(m mVar) {
        return (a.l.d.b0.l(mVar.E()) && a.l.d.b0.l(mVar.F()) && a.l.d.b0.l(mVar.G())) ? false : true;
    }

    @Override // a.l.d.b0
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.H().clear();
            qVar.H().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }

    @Override // a.l.d.b0
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.n0((m) obj);
        return qVar;
    }

    @Override // a.l.d.b0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).b(view);
        }
    }

    @Override // a.l.d.b0
    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        int i2 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int iQ0 = qVar.q0();
            while (i2 < iQ0) {
                b(qVar.p0(i2), arrayList);
                i2++;
            }
            return;
        }
        if (C(mVar) || !a.l.d.b0.l(mVar.H())) {
            return;
        }
        int size = arrayList.size();
        while (i2 < size) {
            mVar.b(arrayList.get(i2));
            i2++;
        }
    }

    @Override // a.l.d.b0
    public void c(ViewGroup viewGroup, Object obj) {
        o.b(viewGroup, (m) obj);
    }

    @Override // a.l.d.b0
    public boolean e(Object obj) {
        return obj instanceof m;
    }

    @Override // a.l.d.b0
    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // a.l.d.b0
    public Object m(Object obj, Object obj2, Object obj3) {
        m mVarX0 = (m) obj;
        m mVar = (m) obj2;
        m mVar2 = (m) obj3;
        if (mVarX0 != null && mVar != null) {
            mVarX0 = new q().n0(mVarX0).n0(mVar).x0(1);
        } else if (mVarX0 == null) {
            mVarX0 = mVar != null ? mVar : null;
        }
        if (mVar2 == null) {
            return mVarX0;
        }
        q qVar = new q();
        if (mVarX0 != null) {
            qVar.n0(mVarX0);
        }
        qVar.n0(mVar2);
        return qVar;
    }

    @Override // a.l.d.b0
    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.n0((m) obj);
        }
        if (obj2 != null) {
            qVar.n0((m) obj2);
        }
        if (obj3 != null) {
            qVar.n0((m) obj3);
        }
        return qVar;
    }

    @Override // a.l.d.b0
    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).Y(view);
        }
    }

    @Override // a.l.d.b0
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i2 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int iQ0 = qVar.q0();
            while (i2 < iQ0) {
                q(qVar.p0(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (C(mVar)) {
            return;
        }
        List<View> listH = mVar.H();
        if (listH.size() == arrayList.size() && listH.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i2 < size) {
                mVar.b(arrayList2.get(i2));
                i2++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                mVar.Y(arrayList.get(size2));
            }
        }
    }

    @Override // a.l.d.b0
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).a(new b(view, arrayList));
    }

    @Override // a.l.d.b0
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // a.l.d.b0
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).e0(new f(rect));
        }
    }

    @Override // a.l.d.b0
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).e0(new a(rect));
        }
    }

    @Override // a.l.d.b0
    public void w(Fragment fragment, Object obj, a.i.n.b bVar, Runnable runnable) {
        m mVar = (m) obj;
        bVar.d(new d(mVar));
        mVar.a(new C0012e(runnable));
    }

    @Override // a.l.d.b0
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> listH = qVar.H();
        listH.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.l.d.b0.d(listH, arrayList.get(i2));
        }
        listH.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }
}
