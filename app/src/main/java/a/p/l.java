package a.p;

import a.p.f;
import android.annotation.SuppressLint;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a.c.a.b.a<j, a> f2999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f.c f3000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference<k> f3001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<f.c> f3005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3006i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f.c f3007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i f3008b;

        public a(j jVar, f.c cVar) {
            this.f3008b = n.f(jVar);
            this.f3007a = cVar;
        }

        public void a(k kVar, f.b bVar) {
            f.c targetState = bVar.getTargetState();
            this.f3007a = l.k(this.f3007a, targetState);
            this.f3008b.d(kVar, bVar);
            this.f3007a = targetState;
        }
    }

    public l(k kVar) {
        this(kVar, true);
    }

    public l(k kVar, boolean z) {
        this.f2999b = new a.c.a.b.a<>();
        this.f3002e = 0;
        this.f3003f = false;
        this.f3004g = false;
        this.f3005h = new ArrayList<>();
        this.f3001d = new WeakReference<>(kVar);
        this.f3000c = f.c.INITIALIZED;
        this.f3006i = z;
    }

    public static f.c k(f.c cVar, f.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    @Override // a.p.f
    public void a(j jVar) {
        k kVar;
        f("addObserver");
        f.c cVar = this.f3000c;
        f.c cVar2 = f.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = f.c.INITIALIZED;
        }
        a aVar = new a(jVar, cVar2);
        if (this.f2999b.i(jVar, aVar) == null && (kVar = this.f3001d.get()) != null) {
            boolean z = this.f3002e != 0 || this.f3003f;
            f.c cVarE = e(jVar);
            this.f3002e++;
            while (aVar.f3007a.compareTo(cVarE) < 0 && this.f2999b.contains(jVar)) {
                n(aVar.f3007a);
                f.b bVarUpFrom = f.b.upFrom(aVar.f3007a);
                if (bVarUpFrom == null) {
                    throw new IllegalStateException("no event up from " + aVar.f3007a);
                }
                aVar.a(kVar, bVarUpFrom);
                m();
                cVarE = e(jVar);
            }
            if (!z) {
                p();
            }
            this.f3002e--;
        }
    }

    @Override // a.p.f
    public f.c b() {
        return this.f3000c;
    }

    @Override // a.p.f
    public void c(j jVar) {
        f("removeObserver");
        this.f2999b.s(jVar);
    }

    public final void d(k kVar) {
        Iterator<Map.Entry<j, a>> itDescendingIterator = this.f2999b.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.f3004g) {
            Map.Entry<j, a> next = itDescendingIterator.next();
            a value = next.getValue();
            while (value.f3007a.compareTo(this.f3000c) > 0 && !this.f3004g && this.f2999b.contains(next.getKey())) {
                f.b bVarDownFrom = f.b.downFrom(value.f3007a);
                if (bVarDownFrom == null) {
                    throw new IllegalStateException("no event down from " + value.f3007a);
                }
                n(bVarDownFrom.getTargetState());
                value.a(kVar, bVarDownFrom);
                m();
            }
        }
    }

    public final f.c e(j jVar) {
        Map.Entry<j, a> entryT = this.f2999b.t(jVar);
        f.c cVar = null;
        f.c cVar2 = entryT != null ? entryT.getValue().f3007a : null;
        if (!this.f3005h.isEmpty()) {
            cVar = this.f3005h.get(r0.size() - 1);
        }
        return k(k(this.f3000c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void f(String str) {
        if (!this.f3006i || a.c.a.a.a.d().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    public final void g(k kVar) {
        a.c.a.b.b<j, a>.d dVarF = this.f2999b.f();
        while (dVarF.hasNext() && !this.f3004g) {
            Map.Entry next = dVarF.next();
            a aVar = (a) next.getValue();
            while (aVar.f3007a.compareTo(this.f3000c) < 0 && !this.f3004g && this.f2999b.contains((j) next.getKey())) {
                n(aVar.f3007a);
                f.b bVarUpFrom = f.b.upFrom(aVar.f3007a);
                if (bVarUpFrom == null) {
                    throw new IllegalStateException("no event up from " + aVar.f3007a);
                }
                aVar.a(kVar, bVarUpFrom);
                m();
            }
        }
    }

    public void h(f.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.getTargetState());
    }

    public final boolean i() {
        if (this.f2999b.size() == 0) {
            return true;
        }
        f.c cVar = this.f2999b.d().getValue().f3007a;
        f.c cVar2 = this.f2999b.g().getValue().f3007a;
        return cVar == cVar2 && this.f3000c == cVar2;
    }

    @Deprecated
    public void j(f.c cVar) {
        f("markState");
        o(cVar);
    }

    public final void l(f.c cVar) {
        if (this.f3000c == cVar) {
            return;
        }
        this.f3000c = cVar;
        if (this.f3003f || this.f3002e != 0) {
            this.f3004g = true;
            return;
        }
        this.f3003f = true;
        p();
        this.f3003f = false;
    }

    public final void m() {
        this.f3005h.remove(r0.size() - 1);
    }

    public final void n(f.c cVar) {
        this.f3005h.add(cVar);
    }

    public void o(f.c cVar) {
        f("setCurrentState");
        l(cVar);
    }

    public final void p() {
        k kVar = this.f3001d.get();
        if (kVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zI = i();
            this.f3004g = false;
            if (zI) {
                return;
            }
            if (this.f3000c.compareTo(this.f2999b.d().getValue().f3007a) < 0) {
                d(kVar);
            }
            Map.Entry<j, a> entryG = this.f2999b.g();
            if (!this.f3004g && entryG != null && this.f3000c.compareTo(entryG.getValue().f3007a) > 0) {
                g(kVar);
            }
        }
    }
}
