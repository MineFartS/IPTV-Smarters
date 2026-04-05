package a.i.o;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class g {

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1902b;

        /* JADX INFO: renamed from: a.i.o.g$a$a, reason: collision with other inner class name */
        public static class C0036a extends Thread {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f1903b;

            public C0036a(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f1903b = i2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f1903b);
                super.run();
            }
        }

        public a(String str, int i2) {
            this.f1901a = str;
            this.f1902b = i2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0036a(runnable, this.f1901a, this.f1902b);
        }
    }

    public static class b<T> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Callable<T> f1904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a.i.q.a<T> f1905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Handler f1906d;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.i.q.a f1907b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f1908c;

            public a(a.i.q.a aVar, Object obj) {
                this.f1907b = aVar;
                this.f1908c = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f1907b.accept(this.f1908c);
            }
        }

        public b(Handler handler, Callable<T> callable, a.i.q.a<T> aVar) {
            this.f1904b = callable;
            this.f1905c = aVar;
            this.f1906d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f1904b.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f1906d.post(new a(this.f1905c, tCall));
        }
    }

    public static ThreadPoolExecutor a(String str, int i2, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static <T> void b(Executor executor, Callable<T> callable, a.i.q.a<T> aVar) {
        executor.execute(new b(a.i.o.b.a(), callable, aVar));
    }

    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i2) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
