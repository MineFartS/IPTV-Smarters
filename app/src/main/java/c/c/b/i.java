package c.c.b;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class i extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue<n<?>> f5214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f5215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f5216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f5217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f5218f = false;

    public i(BlockingQueue<n<?>> blockingQueue, h hVar, b bVar, q qVar) {
        this.f5214b = blockingQueue;
        this.f5215c = hVar;
        this.f5216d = bVar;
        this.f5217e = qVar;
    }

    @TargetApi(14)
    public final void a(n<?> nVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(nVar.G());
        }
    }

    public final void b(n<?> nVar, u uVar) {
        this.f5217e.c(nVar, nVar.N(uVar));
    }

    public final void c() {
        d(this.f5214b.take());
    }

    public void d(n<?> nVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            nVar.b("network-queue-take");
            if (nVar.J()) {
                nVar.r("network-discard-cancelled");
                nVar.L();
                return;
            }
            a(nVar);
            k kVarA = this.f5215c.a(nVar);
            nVar.b("network-http-complete");
            if (kVarA.f5223e && nVar.I()) {
                nVar.r("not-modified");
                nVar.L();
                return;
            }
            p<?> pVarO = nVar.O(kVarA);
            nVar.b("network-parse-complete");
            if (nVar.U() && pVarO.f5253b != null) {
                this.f5216d.a(nVar.v(), pVarO.f5253b);
                nVar.b("network-cache-written");
            }
            nVar.K();
            this.f5217e.a(nVar, pVarO);
            nVar.M(pVarO);
        } catch (u e2) {
            e2.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            b(nVar, e2);
            nVar.L();
        } catch (Exception e3) {
            v.d(e3, "Unhandled exception %s", e3.toString());
            u uVar = new u(e3);
            uVar.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.f5217e.c(nVar, uVar);
            nVar.L();
        }
    }

    public void e() {
        this.f5218f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f5218f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
