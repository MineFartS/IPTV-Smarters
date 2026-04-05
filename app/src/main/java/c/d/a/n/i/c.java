package c.d.a.n.i;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import c.d.a.n.i.a;
import c.d.a.n.i.h;
import c.d.a.n.i.o.a;
import c.d.a.n.i.o.h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class c implements c.d.a.n.i.e, h.a, h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<c.d.a.n.c, c.d.a.n.i.d> f5533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f5534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.d.a.n.i.o.h f5535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f5536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<c.d.a.n.c, WeakReference<h<?>>> f5537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f5538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f5539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ReferenceQueue<h<?>> f5540h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExecutorService f5541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExecutorService f5542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.d.a.n.i.e f5543c;

        public a(ExecutorService executorService, ExecutorService executorService2, c.d.a.n.i.e eVar) {
            this.f5541a = executorService;
            this.f5542b = executorService2;
            this.f5543c = eVar;
        }

        public c.d.a.n.i.d a(c.d.a.n.c cVar, boolean z) {
            return new c.d.a.n.i.d(cVar, this.f5541a, this.f5542b, z, this.f5543c);
        }
    }

    public static class b implements a.InterfaceC0101a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0104a f5544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile c.d.a.n.i.o.a f5545b;

        public b(a.InterfaceC0104a interfaceC0104a) {
            this.f5544a = interfaceC0104a;
        }

        @Override // c.d.a.n.i.a.InterfaceC0101a
        public c.d.a.n.i.o.a a() {
            if (this.f5545b == null) {
                synchronized (this) {
                    if (this.f5545b == null) {
                        this.f5545b = this.f5544a.build();
                    }
                    if (this.f5545b == null) {
                        this.f5545b = new c.d.a.n.i.o.b();
                    }
                }
            }
            return this.f5545b;
        }
    }

    /* JADX INFO: renamed from: c.d.a.n.i.c$c, reason: collision with other inner class name */
    public static class C0102c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.d.a.n.i.d f5546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.d.a.r.e f5547b;

        public C0102c(c.d.a.r.e eVar, c.d.a.n.i.d dVar) {
            this.f5547b = eVar;
            this.f5546a = dVar;
        }

        public void a() {
            this.f5546a.l(this.f5547b);
        }
    }

    public static class d implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<c.d.a.n.c, WeakReference<h<?>>> f5548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReferenceQueue<h<?>> f5549b;

        public d(Map<c.d.a.n.c, WeakReference<h<?>>> map, ReferenceQueue<h<?>> referenceQueue) {
            this.f5548a = map;
            this.f5549b = referenceQueue;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            e eVar = (e) this.f5549b.poll();
            if (eVar == null) {
                return true;
            }
            this.f5548a.remove(eVar.f5550a);
            return true;
        }
    }

    public static class e extends WeakReference<h<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.d.a.n.c f5550a;

        public e(c.d.a.n.c cVar, h<?> hVar, ReferenceQueue<? super h<?>> referenceQueue) {
            super(hVar, referenceQueue);
            this.f5550a = cVar;
        }
    }

    public c(c.d.a.n.i.o.h hVar, a.InterfaceC0104a interfaceC0104a, ExecutorService executorService, ExecutorService executorService2) {
        this(hVar, interfaceC0104a, executorService, executorService2, null, null, null, null, null);
    }

    public c(c.d.a.n.i.o.h hVar, a.InterfaceC0104a interfaceC0104a, ExecutorService executorService, ExecutorService executorService2, Map<c.d.a.n.c, c.d.a.n.i.d> map, g gVar, Map<c.d.a.n.c, WeakReference<h<?>>> map2, a aVar, m mVar) {
        this.f5535c = hVar;
        this.f5539g = new b(interfaceC0104a);
        this.f5537e = map2 == null ? new HashMap<>() : map2;
        this.f5534b = gVar == null ? new g() : gVar;
        this.f5533a = map == null ? new HashMap<>() : map;
        this.f5536d = aVar == null ? new a(executorService, executorService2, this) : aVar;
        this.f5538f = mVar == null ? new m() : mVar;
        hVar.e(this);
    }

    public static void j(String str, long j2, c.d.a.n.c cVar) {
        Log.v("Engine", str + " in " + c.d.a.t.d.a(j2) + "ms, key: " + cVar);
    }

    @Override // c.d.a.n.i.o.h.a
    public void a(l<?> lVar) {
        c.d.a.t.h.a();
        this.f5538f.a(lVar);
    }

    @Override // c.d.a.n.i.e
    public void b(c.d.a.n.c cVar, h<?> hVar) {
        c.d.a.t.h.a();
        if (hVar != null) {
            hVar.e(cVar, this);
            if (hVar.c()) {
                this.f5537e.put(cVar, new e(cVar, hVar, f()));
            }
        }
        this.f5533a.remove(cVar);
    }

    @Override // c.d.a.n.i.e
    public void c(c.d.a.n.i.d dVar, c.d.a.n.c cVar) {
        c.d.a.t.h.a();
        if (dVar.equals(this.f5533a.get(cVar))) {
            this.f5533a.remove(cVar);
        }
    }

    @Override // c.d.a.n.i.h.a
    public void d(c.d.a.n.c cVar, h hVar) {
        c.d.a.t.h.a();
        this.f5537e.remove(cVar);
        if (hVar.c()) {
            this.f5535c.a(cVar, hVar);
        } else {
            this.f5538f.a(hVar);
        }
    }

    public final h<?> e(c.d.a.n.c cVar) {
        l<?> lVarB = this.f5535c.b(cVar);
        if (lVarB == null) {
            return null;
        }
        return lVarB instanceof h ? (h) lVarB : new h<>(lVarB, true);
    }

    public final ReferenceQueue<h<?>> f() {
        if (this.f5540h == null) {
            this.f5540h = new ReferenceQueue<>();
            Looper.myQueue().addIdleHandler(new d(this.f5537e, this.f5540h));
        }
        return this.f5540h;
    }

    public <T, Z, R> C0102c g(c.d.a.n.c cVar, int i2, int i3, c.d.a.n.h.c<T> cVar2, c.d.a.q.b<T, Z> bVar, c.d.a.n.g<Z> gVar, c.d.a.n.k.j.c<Z, R> cVar3, c.d.a.i iVar, boolean z, c.d.a.n.i.b bVar2, c.d.a.r.e eVar) {
        c.d.a.t.h.a();
        long jB = c.d.a.t.d.b();
        f fVarA = this.f5534b.a(cVar2.getId(), cVar, i2, i3, bVar.f(), bVar.e(), gVar, bVar.c(), cVar3, bVar.a());
        h<?> hVarI = i(fVarA, z);
        if (hVarI != null) {
            eVar.c(hVarI);
            if (Log.isLoggable("Engine", 2)) {
                j("Loaded resource from cache", jB, fVarA);
            }
            return null;
        }
        h<?> hVarH = h(fVarA, z);
        if (hVarH != null) {
            eVar.c(hVarH);
            if (Log.isLoggable("Engine", 2)) {
                j("Loaded resource from active resources", jB, fVarA);
            }
            return null;
        }
        c.d.a.n.i.d dVar = this.f5533a.get(fVarA);
        if (dVar != null) {
            dVar.e(eVar);
            if (Log.isLoggable("Engine", 2)) {
                j("Added to existing load", jB, fVarA);
            }
            return new C0102c(eVar, dVar);
        }
        c.d.a.n.i.d dVarA = this.f5536d.a(fVarA, z);
        i iVar2 = new i(dVarA, new c.d.a.n.i.a(fVarA, i2, i3, cVar2, bVar, gVar, cVar3, this.f5539g, bVar2, iVar), iVar);
        this.f5533a.put(fVarA, dVarA);
        dVarA.e(eVar);
        dVarA.m(iVar2);
        if (Log.isLoggable("Engine", 2)) {
            j("Started new load", jB, fVarA);
        }
        return new C0102c(eVar, dVarA);
    }

    public final h<?> h(c.d.a.n.c cVar, boolean z) {
        h<?> hVar = null;
        if (!z) {
            return null;
        }
        WeakReference<h<?>> weakReference = this.f5537e.get(cVar);
        if (weakReference != null) {
            hVar = weakReference.get();
            if (hVar != null) {
                hVar.a();
            } else {
                this.f5537e.remove(cVar);
            }
        }
        return hVar;
    }

    public final h<?> i(c.d.a.n.c cVar, boolean z) {
        if (!z) {
            return null;
        }
        h<?> hVarE = e(cVar);
        if (hVarE != null) {
            hVarE.a();
            this.f5537e.put(cVar, new e(cVar, hVarE, f()));
        }
        return hVarE;
    }

    public void k(l lVar) {
        c.d.a.t.h.a();
        if (!(lVar instanceof h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((h) lVar).d();
    }
}
