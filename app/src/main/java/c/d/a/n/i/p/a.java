package c.d.a.n.i.p;

import android.os.Process;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class a extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f5650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5651b;

    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5652a = 0;

        /* JADX INFO: renamed from: c.d.a.n.i.p.a$b$a, reason: collision with other inner class name */
        public class C0107a extends Thread {
            public C0107a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            C0107a c0107a = new C0107a(runnable, "fifo-pool-thread-" + this.f5652a);
            this.f5652a = this.f5652a + 1;
            return c0107a;
        }
    }

    public static class c<T> extends FutureTask<T> implements Comparable<c<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5655c;

        public c(Runnable runnable, T t, int i2) {
            super(runnable, t);
            if (!(runnable instanceof c.d.a.n.i.p.b)) {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            }
            this.f5654b = ((c.d.a.n.i.p.b) runnable).a();
            this.f5655c = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c<?> cVar) {
            int i2 = this.f5654b - cVar.f5654b;
            return i2 == 0 ? this.f5655c - cVar.f5655c : i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5655c == cVar.f5655c && this.f5654b == cVar.f5654b;
        }

        public int hashCode() {
            return (this.f5654b * 31) + this.f5655c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d IGNORE;
        public static final d LOG;
        public static final d THROW;

        /* JADX INFO: renamed from: c.d.a.n.i.p.a$d$a, reason: collision with other inner class name */
        public enum C0108a extends d {
            public C0108a(String str, int i2) {
                super(str, i2);
            }

            @Override // c.d.a.n.i.p.a.d
            public void handle(Throwable th) {
                if (Log.isLoggable("PriorityExecutor", 6)) {
                    Log.e("PriorityExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        public enum b extends d {
            public b(String str, int i2) {
                super(str, i2);
            }

            @Override // c.d.a.n.i.p.a.d
            public void handle(Throwable th) {
                super.handle(th);
                throw new RuntimeException(th);
            }
        }

        static {
            d dVar = new d("IGNORE", 0);
            IGNORE = dVar;
            C0108a c0108a = new C0108a("LOG", 1);
            LOG = c0108a;
            b bVar = new b("THROW", 2);
            THROW = bVar;
            $VALUES = new d[]{dVar, c0108a, bVar};
        }

        private d(String str, int i2) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public void handle(Throwable th) {
        }
    }

    public a(int i2) {
        this(i2, d.LOG);
    }

    public a(int i2, int i3, long j2, TimeUnit timeUnit, ThreadFactory threadFactory, d dVar) {
        super(i2, i3, j2, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.f5650a = new AtomicInteger();
        this.f5651b = dVar;
    }

    public a(int i2, d dVar) {
        this(i2, i2, 0L, TimeUnit.MILLISECONDS, new b(), dVar);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (!future.isDone() || future.isCancelled()) {
                return;
            }
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e2) {
                this.f5651b.handle(e2);
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new c(runnable, t, this.f5650a.getAndIncrement());
    }
}
