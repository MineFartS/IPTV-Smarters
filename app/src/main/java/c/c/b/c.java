package c.c.b;

import android.os.Process;
import c.c.b.b;
import c.c.b.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f5191b = v.f5259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue<n<?>> f5192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue<n<?>> f5193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.c.b.b f5194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f5195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f5196g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f5197h = new b(this);

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f5198b;

        public a(n nVar) {
            this.f5198b = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.this.f5193d.put(this.f5198b);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static class b implements n.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, List<n<?>>> f5200a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f5201b;

        public b(c cVar) {
            this.f5201b = cVar;
        }

        @Override // c.c.b.n.b
        public synchronized void a(n<?> nVar) {
            String strV = nVar.v();
            List<n<?>> listRemove = this.f5200a.remove(strV);
            if (listRemove != null && !listRemove.isEmpty()) {
                if (v.f5259b) {
                    v.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), strV);
                }
                n<?> nVarRemove = listRemove.remove(0);
                this.f5200a.put(strV, listRemove);
                nVarRemove.Q(this);
                try {
                    this.f5201b.f5193d.put(nVarRemove);
                } catch (InterruptedException e2) {
                    v.c("Couldn't add request to queue. %s", e2.toString());
                    Thread.currentThread().interrupt();
                    this.f5201b.e();
                }
            }
        }

        @Override // c.c.b.n.b
        public void b(n<?> nVar, p<?> pVar) {
            List<n<?>> listRemove;
            b.a aVar = pVar.f5253b;
            if (aVar == null || aVar.a()) {
                a(nVar);
                return;
            }
            String strV = nVar.v();
            synchronized (this) {
                listRemove = this.f5200a.remove(strV);
            }
            if (listRemove != null) {
                if (v.f5259b) {
                    v.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), strV);
                }
                Iterator<n<?>> it = listRemove.iterator();
                while (it.hasNext()) {
                    this.f5201b.f5195f.a(it.next(), pVar);
                }
            }
        }

        public final synchronized boolean d(n<?> nVar) {
            String strV = nVar.v();
            if (!this.f5200a.containsKey(strV)) {
                this.f5200a.put(strV, null);
                nVar.Q(this);
                if (v.f5259b) {
                    v.b("new request, sending to network %s", strV);
                }
                return false;
            }
            List<n<?>> arrayList = this.f5200a.get(strV);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            nVar.b("waiting-for-response");
            arrayList.add(nVar);
            this.f5200a.put(strV, arrayList);
            if (v.f5259b) {
                v.b("Request for cacheKey=%s is in flight, putting on hold.", strV);
            }
            return true;
        }
    }

    public c(BlockingQueue<n<?>> blockingQueue, BlockingQueue<n<?>> blockingQueue2, c.c.b.b bVar, q qVar) {
        this.f5192c = blockingQueue;
        this.f5193d = blockingQueue2;
        this.f5194e = bVar;
        this.f5195f = qVar;
    }

    public final void c() throws InterruptedException {
        d(this.f5192c.take());
    }

    public void d(n<?> nVar) throws InterruptedException {
        nVar.b("cache-queue-take");
        if (nVar.J()) {
            nVar.r("cache-discard-canceled");
            return;
        }
        b.a aVar = this.f5194e.get(nVar.v());
        if (aVar == null) {
            nVar.b("cache-miss");
            if (this.f5197h.d(nVar)) {
                return;
            }
            this.f5193d.put(nVar);
            return;
        }
        if (aVar.a()) {
            nVar.b("cache-hit-expired");
            nVar.P(aVar);
            if (this.f5197h.d(nVar)) {
                return;
            }
            this.f5193d.put(nVar);
            return;
        }
        nVar.b("cache-hit");
        p<?> pVarO = nVar.O(new k(aVar.f5183a, aVar.f5189g));
        nVar.b("cache-hit-parsed");
        if (aVar.b()) {
            nVar.b("cache-hit-refresh-needed");
            nVar.P(aVar);
            pVarO.f5255d = true;
            if (!this.f5197h.d(nVar)) {
                this.f5195f.b(nVar, pVarO, new a(nVar));
                return;
            }
        }
        this.f5195f.a(nVar, pVarO);
    }

    public void e() {
        this.f5196g = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f5191b) {
            v.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f5194e.initialize();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f5196g) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
