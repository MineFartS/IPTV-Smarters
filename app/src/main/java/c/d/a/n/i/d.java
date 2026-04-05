package c.d.a.n.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.d.a.n.i.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class d implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5551a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f5552b = new Handler(Looper.getMainLooper(), new c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c.d.a.r.e> f5553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f5554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f5555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.d.a.n.c f5556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ExecutorService f5557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f5558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l<?> f5561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Exception f5563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Set<c.d.a.r.e> f5565o;
    public i p;
    public h<?> q;
    public volatile Future<?> r;

    public static class b {
        public <R> h<R> a(l<R> lVar, boolean z) {
            return new h<>(lVar, z);
        }
    }

    public static class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (1 != i2 && 2 != i2) {
                return false;
            }
            d dVar = (d) message.obj;
            if (1 == i2) {
                dVar.j();
            } else {
                dVar.i();
            }
            return true;
        }
    }

    public d(c.d.a.n.c cVar, ExecutorService executorService, ExecutorService executorService2, boolean z, e eVar) {
        this(cVar, executorService, executorService2, z, eVar, f5551a);
    }

    public d(c.d.a.n.c cVar, ExecutorService executorService, ExecutorService executorService2, boolean z, e eVar, b bVar) {
        this.f5553c = new ArrayList();
        this.f5556f = cVar;
        this.f5557g = executorService;
        this.f5558h = executorService2;
        this.f5559i = z;
        this.f5555e = eVar;
        this.f5554d = bVar;
    }

    @Override // c.d.a.r.e
    public void a(Exception exc) {
        this.f5563m = exc;
        f5552b.obtainMessage(2, this).sendToTarget();
    }

    @Override // c.d.a.r.e
    public void c(l<?> lVar) {
        this.f5561k = lVar;
        f5552b.obtainMessage(1, this).sendToTarget();
    }

    public void e(c.d.a.r.e eVar) {
        c.d.a.t.h.a();
        if (this.f5562l) {
            eVar.c(this.q);
        } else if (this.f5564n) {
            eVar.a(this.f5563m);
        } else {
            this.f5553c.add(eVar);
        }
    }

    @Override // c.d.a.n.i.i.a
    public void f(i iVar) {
        this.r = this.f5558h.submit(iVar);
    }

    public final void g(c.d.a.r.e eVar) {
        if (this.f5565o == null) {
            this.f5565o = new HashSet();
        }
        this.f5565o.add(eVar);
    }

    public void h() {
        if (this.f5564n || this.f5562l || this.f5560j) {
            return;
        }
        this.p.b();
        Future<?> future = this.r;
        if (future != null) {
            future.cancel(true);
        }
        this.f5560j = true;
        this.f5555e.c(this, this.f5556f);
    }

    public final void i() {
        if (this.f5560j) {
            return;
        }
        if (this.f5553c.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
        this.f5564n = true;
        this.f5555e.b(this.f5556f, null);
        for (c.d.a.r.e eVar : this.f5553c) {
            if (!k(eVar)) {
                eVar.a(this.f5563m);
            }
        }
    }

    public final void j() {
        if (this.f5560j) {
            this.f5561k.b();
            return;
        }
        if (this.f5553c.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
        h<?> hVarA = this.f5554d.a(this.f5561k, this.f5559i);
        this.q = hVarA;
        this.f5562l = true;
        hVarA.a();
        this.f5555e.b(this.f5556f, this.q);
        for (c.d.a.r.e eVar : this.f5553c) {
            if (!k(eVar)) {
                this.q.a();
                eVar.c(this.q);
            }
        }
        this.q.d();
    }

    public final boolean k(c.d.a.r.e eVar) {
        Set<c.d.a.r.e> set = this.f5565o;
        return set != null && set.contains(eVar);
    }

    public void l(c.d.a.r.e eVar) {
        c.d.a.t.h.a();
        if (this.f5562l || this.f5564n) {
            g(eVar);
            return;
        }
        this.f5553c.remove(eVar);
        if (this.f5553c.isEmpty()) {
            h();
        }
    }

    public void m(i iVar) {
        this.p = iVar;
        this.r = this.f5557g.submit(iVar);
    }
}
