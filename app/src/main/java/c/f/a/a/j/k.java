package c.f.a.a.j;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class k implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f6183a;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f6184b;

        public a(Runnable runnable) {
            this.f6184b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f6184b.run();
            } catch (Exception e2) {
                c.f.a.a.j.w.a.c("Executor", "Background execution failure.", e2);
            }
        }
    }

    public k(Executor executor) {
        this.f6183a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f6183a.execute(new a(runnable));
    }
}
