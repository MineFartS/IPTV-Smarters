package a.q.b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<Params, Progress, Result> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadFactory f3066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f3067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Executor f3068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f3069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile Executor f3070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h<Params, Result> f3071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FutureTask<Result> f3072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile g f3073i = g.PENDING;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f3074j = new AtomicBoolean();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f3075k = new AtomicBoolean();

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f3076a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f3076a.getAndIncrement());
        }
    }

    public class b extends h<Params, Result> {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() {
            d.this.f3075k.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b(this.f3082a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                d.this.m(get());
            } catch (InterruptedException e2) {
                Log.w("AsyncTask", e2);
            } catch (CancellationException unused) {
                d.this.m(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: a.q.b.d$d, reason: collision with other inner class name */
    public static /* synthetic */ class C0066d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3079a;

        static {
            int[] iArr = new int[g.values().length];
            f3079a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3079a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class e<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f3080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Data[] f3081b;

        public e(d dVar, Data... dataArr) {
            this.f3080a = dVar;
            this.f3081b = dataArr;
        }
    }

    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i2 = message.what;
            if (i2 == 1) {
                eVar.f3080a.d(eVar.f3081b[0]);
            } else {
                if (i2 != 2) {
                    return;
                }
                eVar.f3080a.k(eVar.f3081b);
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static abstract class h<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Params[] f3082a;
    }

    static {
        a aVar = new a();
        f3066b = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f3067c = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f3068d = threadPoolExecutor;
        f3070f = threadPoolExecutor;
    }

    public d() {
        b bVar = new b();
        this.f3071g = bVar;
        this.f3072h = new c(bVar);
    }

    public static Handler e() {
        f fVar;
        synchronized (d.class) {
            if (f3069e == null) {
                f3069e = new f();
            }
            fVar = f3069e;
        }
        return fVar;
    }

    public final boolean a(boolean z) {
        this.f3074j.set(true);
        return this.f3072h.cancel(z);
    }

    public abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.f3073i == g.PENDING) {
            this.f3073i = g.RUNNING;
            j();
            this.f3071g.f3082a = paramsArr;
            executor.execute(this.f3072h);
            return this;
        }
        int i2 = C0066d.f3079a[this.f3073i.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.f3073i = g.FINISHED;
    }

    public final boolean f() {
        return this.f3074j.get();
    }

    public void g() {
    }

    public void h(Result result) {
        g();
    }

    public void i(Result result) {
    }

    public void j() {
    }

    public void k(Progress... progressArr) {
    }

    public Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public void m(Result result) {
        if (this.f3075k.get()) {
            return;
        }
        l(result);
    }
}
