package k;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import k.g0.f.g;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f30899a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), k.g0.c.x("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f30902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Deque<k.g0.f.c> f30903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k.g0.f.d f30904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30905g;

    /* JADX INFO: loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long jA = j.this.a(System.nanoTime());
                if (jA == -1) {
                    return;
                }
                if (jA > 0) {
                    long j2 = jA / 1000000;
                    long j3 = jA - (1000000 * j2);
                    synchronized (j.this) {
                        try {
                            j.this.wait(j2, (int) j3);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public j() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public j(int i2, long j2, TimeUnit timeUnit) {
        this.f30902d = new a();
        this.f30903e = new ArrayDeque();
        this.f30904f = new k.g0.f.d();
        this.f30900b = i2;
        this.f30901c = timeUnit.toNanos(j2);
        if (j2 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j2);
    }

    public long a(long j2) {
        synchronized (this) {
            k.g0.f.c cVar = null;
            long j3 = Long.MIN_VALUE;
            int i2 = 0;
            int i3 = 0;
            for (k.g0.f.c cVar2 : this.f30903e) {
                if (e(cVar2, j2) > 0) {
                    i3++;
                } else {
                    i2++;
                    long j4 = j2 - cVar2.f30610o;
                    if (j4 > j3) {
                        cVar = cVar2;
                        j3 = j4;
                    }
                }
            }
            long j5 = this.f30901c;
            if (j3 < j5 && i2 <= this.f30900b) {
                if (i2 > 0) {
                    return j5 - j3;
                }
                if (i3 > 0) {
                    return j5;
                }
                this.f30905g = false;
                return -1L;
            }
            this.f30903e.remove(cVar);
            k.g0.c.d(cVar.q());
            return 0L;
        }
    }

    public boolean b(k.g0.f.c cVar) {
        if (cVar.f30606k || this.f30900b == 0) {
            this.f30903e.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    @Nullable
    public Socket c(k.a aVar, k.g0.f.g gVar) {
        for (k.g0.f.c cVar : this.f30903e) {
            if (cVar.m(aVar, null) && cVar.o() && cVar != gVar.d()) {
                return gVar.m(cVar);
            }
        }
        return null;
    }

    @Nullable
    public k.g0.f.c d(k.a aVar, k.g0.f.g gVar, e0 e0Var) {
        for (k.g0.f.c cVar : this.f30903e) {
            if (cVar.m(aVar, e0Var)) {
                gVar.a(cVar);
                return cVar;
            }
        }
        return null;
    }

    public final int e(k.g0.f.c cVar, long j2) {
        List<Reference<k.g0.f.g>> list = cVar.f30609n;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference<k.g0.f.g> reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                k.g0.j.e.h().m("A connection to " + cVar.a().a().l() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f30633a);
                list.remove(i2);
                cVar.f30606k = true;
                if (list.isEmpty()) {
                    cVar.f30610o = j2 - this.f30901c;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public void f(k.g0.f.c cVar) {
        if (!this.f30905g) {
            this.f30905g = true;
            f30899a.execute(this.f30902d);
        }
        this.f30903e.add(cVar);
    }
}
