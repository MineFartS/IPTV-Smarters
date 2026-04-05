package androidx.lifecycle;

import a.p.f;
import a.p.i;
import a.p.k;
import a.p.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4622a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4623b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.c.a.b.b<q<? super T>, LiveData<T>.c> f4624c = new a.c.a.b.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4625d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f4627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Object f4628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f4632k;

    public class LifecycleBoundObserver extends LiveData<T>.c implements i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final k f4633f;

        public LifecycleBoundObserver(k kVar, q<? super T> qVar) {
            super(qVar);
            this.f4633f = kVar;
        }

        @Override // a.p.i
        public void d(k kVar, f.b bVar) {
            f.c cVarB = this.f4633f.getLifecycle().b();
            if (cVarB == f.c.DESTROYED) {
                LiveData.this.m(this.f4637b);
                return;
            }
            f.c cVar = null;
            while (cVar != cVarB) {
                c(k());
                cVar = cVarB;
                cVarB = this.f4633f.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public void g() {
            this.f4633f.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean j(k kVar) {
            return this.f4633f == kVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return this.f4633f.getLifecycle().b().isAtLeast(f.c.STARTED);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f4623b) {
                obj = LiveData.this.f4628g;
                LiveData.this.f4628g = LiveData.f4622a;
            }
            LiveData.this.n(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(q<? super T> qVar) {
            super(qVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return true;
        }
    }

    public abstract class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q<? super T> f4637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4639d = -1;

        public c(q<? super T> qVar) {
            this.f4637b = qVar;
        }

        public void c(boolean z) {
            if (z == this.f4638c) {
                return;
            }
            this.f4638c = z;
            LiveData.this.c(z ? 1 : -1);
            if (this.f4638c) {
                LiveData.this.e(this);
            }
        }

        public void g() {
        }

        public boolean j(k kVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        Object obj = f4622a;
        this.f4628g = obj;
        this.f4632k = new a();
        this.f4627f = obj;
        this.f4629h = -1;
    }

    public static void b(String str) {
        if (a.c.a.a.a.d().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void c(int i2) {
        int i3 = this.f4625d;
        this.f4625d = i2 + i3;
        if (this.f4626e) {
            return;
        }
        this.f4626e = true;
        while (true) {
            try {
                int i4 = this.f4625d;
                if (i3 == i4) {
                    return;
                }
                boolean z = i3 == 0 && i4 > 0;
                boolean z2 = i3 > 0 && i4 == 0;
                if (z) {
                    j();
                } else if (z2) {
                    k();
                }
                i3 = i4;
            } finally {
                this.f4626e = false;
            }
        }
    }

    public final void d(LiveData<T>.c cVar) {
        if (cVar.f4638c) {
            if (!cVar.k()) {
                cVar.c(false);
                return;
            }
            int i2 = cVar.f4639d;
            int i3 = this.f4629h;
            if (i2 >= i3) {
                return;
            }
            cVar.f4639d = i3;
            cVar.f4637b.a((Object) this.f4627f);
        }
    }

    public void e(LiveData<T>.c cVar) {
        if (this.f4630i) {
            this.f4631j = true;
            return;
        }
        this.f4630i = true;
        do {
            this.f4631j = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                a.c.a.b.b<q<? super T>, LiveData<T>.c>.d dVarF = this.f4624c.f();
                while (dVarF.hasNext()) {
                    d((c) dVarF.next().getValue());
                    if (this.f4631j) {
                        break;
                    }
                }
            }
        } while (this.f4631j);
        this.f4630i = false;
    }

    public T f() {
        T t = (T) this.f4627f;
        if (t != f4622a) {
            return t;
        }
        return null;
    }

    public boolean g() {
        return this.f4625d > 0;
    }

    public void h(k kVar, q<? super T> qVar) {
        b("observe");
        if (kVar.getLifecycle().b() == f.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(kVar, qVar);
        LiveData<T>.c cVarI = this.f4624c.i(qVar, lifecycleBoundObserver);
        if (cVarI != null && !cVarI.j(kVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarI != null) {
            return;
        }
        kVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void i(q<? super T> qVar) {
        b("observeForever");
        b bVar = new b(qVar);
        LiveData<T>.c cVarI = this.f4624c.i(qVar, bVar);
        if (cVarI instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarI != null) {
            return;
        }
        bVar.c(true);
    }

    public void j() {
    }

    public void k() {
    }

    public void l(T t) {
        boolean z;
        synchronized (this.f4623b) {
            z = this.f4628g == f4622a;
            this.f4628g = t;
        }
        if (z) {
            a.c.a.a.a.d().c(this.f4632k);
        }
    }

    public void m(q<? super T> qVar) {
        b("removeObserver");
        LiveData<T>.c cVarS = this.f4624c.s(qVar);
        if (cVarS == null) {
            return;
        }
        cVarS.g();
        cVarS.c(false);
    }

    public void n(T t) {
        b("setValue");
        this.f4629h++;
        this.f4627f = t;
        e(null);
    }
}
