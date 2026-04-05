package k;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import k.z;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Runnable f30935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ExecutorService f30936d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30933a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30934b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Deque<z.a> f30937e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Deque<z.a> f30938f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Deque<z> f30939g = new ArrayDeque();

    public synchronized void a(z.a aVar) {
        if (this.f30938f.size() >= this.f30933a || i(aVar) >= this.f30934b) {
            this.f30937e.add(aVar);
        } else {
            this.f30938f.add(aVar);
            c().execute(aVar);
        }
    }

    public synchronized void b(z zVar) {
        this.f30939g.add(zVar);
    }

    public synchronized ExecutorService c() {
        if (this.f30936d == null) {
            this.f30936d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), k.g0.c.x("OkHttp Dispatcher", false));
        }
        return this.f30936d;
    }

    public final <T> void d(Deque<T> deque, T t, boolean z) {
        int iH;
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            if (z) {
                g();
            }
            iH = h();
            runnable = this.f30935c;
        }
        if (iH != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void e(z.a aVar) {
        d(this.f30938f, aVar, true);
    }

    public void f(z zVar) {
        d(this.f30939g, zVar, false);
    }

    public final void g() {
        if (this.f30938f.size() < this.f30933a && !this.f30937e.isEmpty()) {
            Iterator<z.a> it = this.f30937e.iterator();
            while (it.hasNext()) {
                z.a next = it.next();
                if (i(next) < this.f30934b) {
                    it.remove();
                    this.f30938f.add(next);
                    c().execute(next);
                }
                if (this.f30938f.size() >= this.f30933a) {
                    return;
                }
            }
        }
    }

    public synchronized int h() {
        return this.f30938f.size() + this.f30939g.size();
    }

    public final int i(z.a aVar) {
        Iterator<z.a> it = this.f30938f.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().l().equals(aVar.l())) {
                i2++;
            }
        }
        return i2;
    }
}
