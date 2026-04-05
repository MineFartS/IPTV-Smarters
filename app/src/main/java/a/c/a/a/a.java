package a.c.a.a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile a f1017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f1018b = new ExecutorC0014a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Executor f1019c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f1020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f1021e;

    /* JADX INFO: renamed from: a.c.a.a.a$a, reason: collision with other inner class name */
    public static class ExecutorC0014a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().c(runnable);
        }
    }

    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().a(runnable);
        }
    }

    public a() {
        a.c.a.a.b bVar = new a.c.a.a.b();
        this.f1021e = bVar;
        this.f1020d = bVar;
    }

    public static a d() {
        if (f1017a != null) {
            return f1017a;
        }
        synchronized (a.class) {
            if (f1017a == null) {
                f1017a = new a();
            }
        }
        return f1017a;
    }

    @Override // a.c.a.a.c
    public void a(Runnable runnable) {
        this.f1020d.a(runnable);
    }

    @Override // a.c.a.a.c
    public boolean b() {
        return this.f1020d.b();
    }

    @Override // a.c.a.a.c
    public void c(Runnable runnable) {
        this.f1020d.c(runnable);
    }
}
