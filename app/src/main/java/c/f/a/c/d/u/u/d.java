package c.f.a.c.d.u.u;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import c.f.a.c.d.u.u.i;
import c.f.a.c.f.o.k;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.c.d.v.b f11948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f11950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<Integer> f11951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f11952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LruCache<Integer, c.f.a.c.d.o> f11953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<Integer> f11954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Deque<Integer> f11955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f11957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TimerTask f11958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.f.a.c.f.o.g<i.c> f11959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.f.a.c.f.o.g<i.c> f11960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Set<a> f11961n;

    public static abstract class a {
        public void a(int i2, int i3) {
        }

        public void b() {
        }

        public void c(int[] iArr) {
        }

        public void d(int[] iArr) {
        }

        public void e() {
        }

        public void f() {
        }
    }

    public class b extends i.a {
        public b() {
        }

        @Override // c.f.a.c.d.u.u.i.a
        public final void g() {
            long jR = d.this.r();
            d dVar = d.this;
            if (jR != dVar.f11949b) {
                dVar.f11949b = jR;
                dVar.a();
                d dVar2 = d.this;
                if (dVar2.f11949b != 0) {
                    dVar2.d();
                }
            }
        }

        @Override // c.f.a.c.d.u.u.i.a
        public final void h(int[] iArr) {
            List<Integer> listJ = c.f.a.c.d.v.a.j(iArr);
            if (d.this.f11951d.equals(listJ)) {
                return;
            }
            d.this.u();
            d.this.f11953f.evictAll();
            d.this.f11954g.clear();
            d dVar = d.this;
            dVar.f11951d = listJ;
            dVar.t();
            d.this.w();
            d.this.v();
        }

        @Override // c.f.a.c.d.u.u.i.a
        public final void i(int[] iArr, int i2) {
            int size;
            int length = iArr.length;
            if (i2 == 0) {
                size = d.this.f11951d.size();
            } else {
                size = d.this.f11952e.get(i2, -1);
                if (size == -1) {
                    d.this.d();
                    return;
                }
            }
            d.this.u();
            d.this.f11951d.addAll(size, c.f.a.c.d.v.a.j(iArr));
            d.this.t();
            d.this.i(size, length);
            d.this.v();
        }

        @Override // c.f.a.c.d.u.u.i.a
        public final void j(c.f.a.c.d.o[] oVarArr) {
            HashSet hashSet = new HashSet();
            d.this.f11954g.clear();
            for (c.f.a.c.d.o oVar : oVarArr) {
                int iL = oVar.L();
                d.this.f11953f.put(Integer.valueOf(iL), oVar);
                int i2 = d.this.f11952e.get(iL, -1);
                if (i2 == -1) {
                    d.this.d();
                    return;
                }
                hashSet.add(Integer.valueOf(i2));
            }
            Iterator<Integer> it = d.this.f11954g.iterator();
            while (it.hasNext()) {
                int i3 = d.this.f11952e.get(it.next().intValue(), -1);
                if (i3 != -1) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            d.this.f11954g.clear();
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList);
            d.this.u();
            d.this.y(c.f.a.c.d.v.a.g(arrayList));
            d.this.v();
        }

        @Override // c.f.a.c.d.u.u.i.a
        public final void k(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                d.this.f11953f.remove(Integer.valueOf(i2));
                int i3 = d.this.f11952e.get(i2, -1);
                if (i3 == -1) {
                    d.this.d();
                    return;
                }
                arrayList.add(Integer.valueOf(i3));
            }
            Collections.sort(arrayList);
            d.this.u();
            d.this.y(c.f.a.c.d.v.a.g(arrayList));
            d.this.v();
        }

        @Override // c.f.a.c.d.u.u.i.a
        public final void l(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                d.this.f11953f.remove(Integer.valueOf(i2));
                int i3 = d.this.f11952e.get(i2, -1);
                if (i3 == -1) {
                    d.this.d();
                    return;
                } else {
                    d.this.f11952e.delete(i2);
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Collections.sort(arrayList);
            d.this.u();
            d.this.f11951d.removeAll(c.f.a.c.d.v.a.j(iArr));
            d.this.t();
            d.this.A(c.f.a.c.d.v.a.g(arrayList));
            d.this.v();
        }
    }

    public d(i iVar) {
        this(iVar, 20, 20);
    }

    public d(i iVar, int i2, int i3) {
        this.f11961n = new HashSet();
        this.f11948a = new c.f.a.c.d.v.b("MediaQueue");
        this.f11950c = iVar;
        this.f11956i = Math.max(20, 1);
        this.f11951d = new ArrayList();
        this.f11952e = new SparseIntArray();
        this.f11954g = new ArrayList();
        this.f11955h = new ArrayDeque(20);
        this.f11957j = new c.f.a.c.j.c.w0(Looper.getMainLooper());
        this.f11958k = new v0(this);
        iVar.N(new b());
        C(20);
        this.f11949b = r();
        d();
    }

    public final void A(int[] iArr) {
        Iterator<a> it = this.f11961n.iterator();
        while (it.hasNext()) {
            it.next().c(iArr);
        }
    }

    public final void C(int i2) {
        this.f11953f = new x0(this, i2);
    }

    public final void a() {
        u();
        this.f11951d.clear();
        this.f11952e.clear();
        this.f11953f.evictAll();
        this.f11954g.clear();
        n();
        this.f11955h.clear();
        o();
        p();
        w();
        v();
    }

    public int b(int i2) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return this.f11952e.get(i2, -1);
    }

    public int c(int i2) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (i2 < 0 || i2 >= this.f11951d.size()) {
            return 0;
        }
        return this.f11951d.get(i2).intValue();
    }

    public final void d() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (this.f11949b != 0 && this.f11960m == null) {
            o();
            p();
            c.f.a.c.f.o.g<i.c> gVarJ0 = this.f11950c.j0();
            this.f11960m = gVarJ0;
            gVarJ0.d(new k(this) { // from class: c.f.a.c.d.u.u.u0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f12114a;

                {
                    this.f12114a = this;
                }

                @Override // c.f.a.c.f.o.k
                public final void a(c.f.a.c.f.o.j jVar) {
                    this.f12114a.l((i.c) jVar);
                }
            });
        }
    }

    public final void h(i.c cVar) {
        Status statusC = cVar.C();
        int iJ = statusC.J();
        if (iJ != 0) {
            this.f11948a.g(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(iJ), statusC.K()), new Object[0]);
        }
        this.f11959l = null;
        if (this.f11955h.isEmpty()) {
            return;
        }
        m();
    }

    public final void i(int i2, int i3) {
        Iterator<a> it = this.f11961n.iterator();
        while (it.hasNext()) {
            it.next().a(i2, i3);
        }
    }

    public final void l(i.c cVar) {
        Status statusC = cVar.C();
        int iJ = statusC.J();
        if (iJ != 0) {
            this.f11948a.g(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(iJ), statusC.K()), new Object[0]);
        }
        this.f11960m = null;
        if (this.f11955h.isEmpty()) {
            return;
        }
        m();
    }

    public final void m() {
        n();
        this.f11957j.postDelayed(this.f11958k, 500L);
    }

    public final void n() {
        this.f11957j.removeCallbacks(this.f11958k);
    }

    public final void o() {
        c.f.a.c.f.o.g<i.c> gVar = this.f11960m;
        if (gVar != null) {
            gVar.c();
            this.f11960m = null;
        }
    }

    public final void p() {
        c.f.a.c.f.o.g<i.c> gVar = this.f11959l;
        if (gVar != null) {
            gVar.c();
            this.f11959l = null;
        }
    }

    public final long r() {
        c.f.a.c.d.q qVarL = this.f11950c.l();
        if (qVarL == null || qVarL.o0()) {
            return 0L;
        }
        return qVarL.n0();
    }

    public final void s() {
        if (this.f11955h.isEmpty() || this.f11959l != null || this.f11949b == 0) {
            return;
        }
        c.f.a.c.f.o.g<i.c> gVarQ0 = this.f11950c.q0(c.f.a.c.d.v.a.g(this.f11955h));
        this.f11959l = gVarQ0;
        gVarQ0.d(new k(this) { // from class: c.f.a.c.d.u.u.w0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f12116a;

            {
                this.f12116a = this;
            }

            @Override // c.f.a.c.f.o.k
            public final void a(c.f.a.c.f.o.j jVar) {
                this.f12116a.h((i.c) jVar);
            }
        });
        this.f11955h.clear();
    }

    public final void t() {
        this.f11952e.clear();
        for (int i2 = 0; i2 < this.f11951d.size(); i2++) {
            this.f11952e.put(this.f11951d.get(i2).intValue(), i2);
        }
    }

    public final void u() {
        Iterator<a> it = this.f11961n.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public final void v() {
        Iterator<a> it = this.f11961n.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public final void w() {
        Iterator<a> it = this.f11961n.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public final void y(int[] iArr) {
        Iterator<a> it = this.f11961n.iterator();
        while (it.hasNext()) {
            it.next().d(iArr);
        }
    }
}
