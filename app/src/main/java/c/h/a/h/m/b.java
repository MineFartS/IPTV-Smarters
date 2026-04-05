package c.h.a.h.m;

import android.content.Context;
import android.util.Log;
import android.view.View;
import c.f.a.c.d.o;
import c.f.a.c.d.q;
import c.f.a.c.d.u.s;
import c.f.a.c.d.u.u.i;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f16951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f16952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<o> f16953c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16954d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s<c.f.a.c.d.u.d> f16955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i.a f16956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f16959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o f16960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f16961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16962l;

    /* JADX INFO: renamed from: c.h.a.h.m.b$b, reason: collision with other inner class name */
    public class C0219b extends i.a {
        public C0219b() {
        }

        @Override // c.f.a.c.d.u.u.i.a
        public void d() {
            q qVarL;
            i iVarR = b.this.r();
            if (iVarR == null || (qVarL = iVarR.l()) == null) {
                return;
            }
            b.this.f16960j = qVarL.Y(qVarL.V());
            Log.d("QueueDataProvider", "onRemoteMediaPreloadStatusUpdated() with item=" + b.this.f16960j);
            if (b.this.f16961k != null) {
                b.this.f16961k.a();
            }
        }

        @Override // c.f.a.c.d.u.u.i.a
        public void e() {
            m();
            if (b.this.f16961k != null) {
                b.this.f16961k.a();
            }
            Log.d("QueueDataProvider", "Queue was updated");
        }

        @Override // c.f.a.c.d.u.u.i.a
        public void g() {
            m();
            if (b.this.f16961k != null) {
                b.this.f16961k.a();
            }
        }

        public final void m() {
            List<o> listA0;
            b bVar;
            boolean z;
            q qVarL;
            i iVarR = b.this.r();
            if (iVarR == null || (qVarL = iVarR.l()) == null) {
                listA0 = null;
            } else {
                listA0 = qVarL.a0();
                b.this.f16957g = qVarL.b0();
                b.this.f16959i = qVarL.Y(qVarL.L());
            }
            b.this.f16953c.clear();
            if (listA0 == null) {
                Log.d("QueueDataProvider", "Queue is cleared");
                return;
            }
            Log.d("QueueDataProvider", "Queue is updated with a list of size: " + listA0.size());
            if (listA0.size() > 0) {
                b.this.f16953c.addAll(listA0);
                bVar = b.this;
                z = false;
            } else {
                bVar = b.this;
                z = true;
            }
            bVar.f16962l = z;
        }
    }

    public class c implements s<c.f.a.c.d.u.d> {
        public c() {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void i(c.f.a.c.d.u.d dVar, int i2) {
            b.this.j();
            if (b.this.f16961k != null) {
                b.this.f16961k.a();
            }
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void o(c.f.a.c.d.u.d dVar) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m(c.f.a.c.d.u.d dVar, int i2) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void l(c.f.a.c.d.u.d dVar, boolean z) {
            b.this.A();
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void h(c.f.a.c.d.u.d dVar, String str) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void k(c.f.a.c.d.u.d dVar, int i2) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void j(c.f.a.c.d.u.d dVar, String str) {
            b.this.A();
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void n(c.f.a.c.d.u.d dVar) {
        }

        @Override // c.f.a.c.d.u.s
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void g(c.f.a.c.d.u.d dVar, int i2) {
        }
    }

    public interface d {
        void a();
    }

    public b(Context context) {
        c cVar = new c();
        this.f16955e = cVar;
        this.f16956f = new C0219b();
        this.f16962l = true;
        Context applicationContext = context.getApplicationContext();
        this.f16952b = applicationContext;
        this.f16957g = 0;
        this.f16958h = false;
        this.f16959i = null;
        c.f.a.c.d.u.b.e(applicationContext).c().a(cVar, c.f.a.c.d.u.d.class);
        A();
    }

    public static synchronized b n(Context context) {
        if (f16951a == null) {
            f16951a = new b(context);
        }
        return f16951a;
    }

    public final void A() {
        List<o> listA0;
        i iVarR = r();
        if (iVarR != null) {
            iVarR.N(this.f16956f);
            q qVarL = iVarR.l();
            if (qVarL == null || (listA0 = qVarL.a0()) == null || listA0.isEmpty()) {
                return;
            }
            this.f16953c.clear();
            this.f16953c.addAll(listA0);
            this.f16957g = qVarL.b0();
            this.f16959i = qVarL.Y(qVarL.L());
            this.f16962l = false;
            this.f16960j = qVarL.Y(qVarL.V());
        }
    }

    public void j() {
        this.f16953c.clear();
        this.f16962l = true;
        this.f16959i = null;
    }

    public int k() {
        return this.f16953c.size();
    }

    public o l() {
        return this.f16959i;
    }

    public int m() {
        return this.f16959i.L();
    }

    public o o(int i2) {
        return this.f16953c.get(i2);
    }

    public List<o> p() {
        return this.f16953c;
    }

    public int q(int i2) {
        if (this.f16953c.isEmpty()) {
            return -1;
        }
        for (int i3 = 0; i3 < this.f16953c.size(); i3++) {
            if (this.f16953c.get(i3).L() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public final i r() {
        c.f.a.c.d.u.d dVarC = c.f.a.c.d.u.b.e(this.f16952b).c().c();
        if (dVarC != null && dVarC.c()) {
            return dVarC.p();
        }
        Log.w("QueueDataProvider", "Trying to get a RemoteMediaClient when no CastSession is started.");
        return null;
    }

    public o s() {
        Log.d("QueueDataProvider", "[upcoming] getUpcomingItem() returning " + this.f16960j);
        return this.f16960j;
    }

    public boolean t() {
        return this.f16962l;
    }

    public void u(int i2, int i3) {
        i iVarR;
        if (i2 == i3 || (iVarR = r()) == null) {
            return;
        }
        iVarR.I(this.f16953c.get(i2).L(), i3, null);
        this.f16953c.add(i3, this.f16953c.remove(i2));
    }

    public void v(View view, o oVar) {
        i iVarR = r();
        if (iVarR == null) {
            return;
        }
        iVarR.F(oVar.L(), null);
    }

    public void w(View view, o oVar) {
        i iVarR = r();
        if (iVarR == null) {
            return;
        }
        int iQ = q(oVar.L());
        int iK = k() - iQ;
        int[] iArr = new int[iK];
        for (int i2 = 0; i2 < iK; i2++) {
            iArr[i2] = this.f16953c.get(i2 + iQ).L();
        }
        iVarR.M(iArr, null);
    }

    public void x() {
        synchronized (this.f16954d) {
            if (this.f16953c.isEmpty()) {
                return;
            }
            i iVarR = r();
            if (iVarR == null) {
                return;
            }
            int[] iArr = new int[this.f16953c.size()];
            for (int i2 = 0; i2 < this.f16953c.size(); i2++) {
                iArr[i2] = this.f16953c.get(i2).L();
            }
            iVarR.M(iArr, null);
            this.f16953c.clear();
        }
    }

    public void y(int i2) {
        synchronized (this.f16954d) {
            i iVarR = r();
            if (iVarR == null) {
                return;
            }
            iVarR.L(this.f16953c.get(i2).L(), null);
        }
    }

    public void z(d dVar) {
        this.f16961k = dVar;
    }
}
