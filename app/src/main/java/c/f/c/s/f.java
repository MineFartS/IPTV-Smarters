package c.f.c.s;

import android.text.TextUtils;
import c.f.c.s.h;
import c.f.c.s.r.d;
import c.f.c.s.r.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16255a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadFactory f16256b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.c.c f16257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.c.s.r.c f16258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.c.s.q.c f16259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f16260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.c.s.q.b f16261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f16262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f16263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExecutorService f16264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ExecutorService f16265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f16266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Set<c.f.c.s.p.a> f16267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<n> f16268n;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f16269a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f16269a.getAndIncrement())));
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16271b;

        static {
            int[] iArr = new int[f.b.values().length];
            f16271b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16271b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16271b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f16270a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16270a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public f(c.f.c.c cVar, c.f.c.r.b<c.f.c.v.i> bVar, c.f.c.r.b<c.f.c.p.f> bVar2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f16256b), cVar, new c.f.c.s.r.c(cVar.g(), bVar, bVar2), new c.f.c.s.q.c(cVar), o.c(), new c.f.c.s.q.b(cVar), new m());
    }

    public f(ExecutorService executorService, c.f.c.c cVar, c.f.c.s.r.c cVar2, c.f.c.s.q.c cVar3, o oVar, c.f.c.s.q.b bVar, m mVar) {
        this.f16263i = new Object();
        this.f16267m = new HashSet();
        this.f16268n = new ArrayList();
        this.f16257c = cVar;
        this.f16258d = cVar2;
        this.f16259e = cVar3;
        this.f16260f = oVar;
        this.f16261g = bVar;
        this.f16262h = mVar;
        this.f16264j = executorService;
        this.f16265k = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f16256b);
    }

    public static f k() {
        return l(c.f.c.c.h());
    }

    public static f l(c.f.c.c cVar) {
        c.f.a.c.f.q.o.b(cVar != null, "Null is not a valid value of FirebaseApp.");
        return (f) cVar.f(g.class);
    }

    @Override // c.f.c.s.g
    public c.f.a.c.o.i<l> a(boolean z) {
        t();
        c.f.a.c.o.i<l> iVarB = b();
        this.f16264j.execute(d.a(this, z));
        return iVarB;
    }

    public final c.f.a.c.o.i<l> b() {
        c.f.a.c.o.j jVar = new c.f.a.c.o.j();
        d(new j(this.f16260f, jVar));
        return jVar.a();
    }

    public final c.f.a.c.o.i<String> c() {
        c.f.a.c.o.j jVar = new c.f.a.c.o.j();
        d(new k(jVar));
        return jVar.a();
    }

    public final void d(n nVar) {
        synchronized (this.f16263i) {
            this.f16268n.add(nVar);
        }
    }

    public final void e(boolean z) {
        c.f.c.s.q.d dVarV;
        Exception iOException;
        c.f.c.s.q.d dVarM = m();
        try {
            if (dVarM.i() || dVarM.l()) {
                dVarV = v(dVarM);
            } else {
                if (!z && !this.f16260f.f(dVarM)) {
                    return;
                }
                dVarV = g(dVarM);
            }
            p(dVarV);
            z(dVarM, dVarV);
            if (dVarV.k()) {
                y(dVarV.d());
            }
            if (dVarV.i()) {
                iOException = new h(h.a.BAD_CONFIG);
            } else {
                if (!dVarV.j()) {
                    x(dVarV);
                    return;
                }
                iOException = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            w(iOException);
        } catch (h e2) {
            w(e2);
        }
    }

    public final void f(boolean z) {
        c.f.c.s.q.d dVarN = n();
        if (z) {
            dVarN = dVarN.p();
        }
        x(dVarN);
        this.f16265k.execute(e.a(this, z));
    }

    public final c.f.c.s.q.d g(c.f.c.s.q.d dVar) throws h {
        c.f.c.s.r.f fVarE = this.f16258d.e(h(), dVar.d(), o(), dVar.f());
        int i2 = b.f16271b[fVarE.b().ordinal()];
        if (i2 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f16260f.b());
        }
        if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i2 != 3) {
            throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
        }
        y(null);
        return dVar.r();
    }

    @Override // c.f.c.s.g
    public c.f.a.c.o.i<String> getId() {
        t();
        String strJ = j();
        if (strJ != null) {
            return c.f.a.c.o.l.e(strJ);
        }
        c.f.a.c.o.i<String> iVarC = c();
        this.f16264j.execute(c.a(this));
        return iVarC;
    }

    public String h() {
        return this.f16257c.j().b();
    }

    public String i() {
        return this.f16257c.j().c();
    }

    public final synchronized String j() {
        return this.f16266l;
    }

    public final c.f.c.s.q.d m() {
        c.f.c.s.q.d dVarC;
        synchronized (f16255a) {
            c.f.c.s.b bVarA = c.f.c.s.b.a(this.f16257c.g(), "generatefid.lock");
            try {
                dVarC = this.f16259e.c();
            } finally {
                if (bVarA != null) {
                    bVarA.b();
                }
            }
        }
        return dVarC;
    }

    public final c.f.c.s.q.d n() {
        c.f.c.s.q.d dVarC;
        synchronized (f16255a) {
            c.f.c.s.b bVarA = c.f.c.s.b.a(this.f16257c.g(), "generatefid.lock");
            try {
                dVarC = this.f16259e.c();
                if (dVarC.j()) {
                    dVarC = this.f16259e.a(dVarC.t(u(dVarC)));
                }
            } finally {
                if (bVarA != null) {
                    bVarA.b();
                }
            }
        }
        return dVarC;
    }

    public String o() {
        return this.f16257c.j().e();
    }

    public final void p(c.f.c.s.q.d dVar) {
        synchronized (f16255a) {
            c.f.c.s.b bVarA = c.f.c.s.b.a(this.f16257c.g(), "generatefid.lock");
            try {
                this.f16259e.a(dVar);
            } finally {
                if (bVarA != null) {
                    bVarA.b();
                }
            }
        }
    }

    public final void t() {
        c.f.a.c.f.q.o.f(i(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c.f.a.c.f.q.o.f(o(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c.f.a.c.f.q.o.f(h(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c.f.a.c.f.q.o.b(o.h(i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c.f.a.c.f.q.o.b(o.g(h()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String u(c.f.c.s.q.d dVar) {
        if ((!this.f16257c.i().equals("CHIME_ANDROID_SDK") && !this.f16257c.q()) || !dVar.m()) {
            return this.f16262h.a();
        }
        String strF = this.f16261g.f();
        return TextUtils.isEmpty(strF) ? this.f16262h.a() : strF;
    }

    public final c.f.c.s.q.d v(c.f.c.s.q.d dVar) throws h {
        c.f.c.s.r.d dVarD = this.f16258d.d(h(), dVar.d(), o(), i(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f16261g.i());
        int i2 = b.f16270a[dVarD.e().ordinal()];
        if (i2 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f16260f.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
    }

    public final void w(Exception exc) {
        synchronized (this.f16263i) {
            Iterator<n> it = this.f16268n.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void x(c.f.c.s.q.d dVar) {
        synchronized (this.f16263i) {
            Iterator<n> it = this.f16268n.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void y(String str) {
        this.f16266l = str;
    }

    public final synchronized void z(c.f.c.s.q.d dVar, c.f.c.s.q.d dVar2) {
        if (this.f16267m.size() != 0 && !dVar.d().equals(dVar2.d())) {
            Iterator<c.f.c.s.p.a> it = this.f16267m.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }
}
