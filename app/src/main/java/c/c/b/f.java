package c.c.b;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f5206a;

    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Handler f5207a;

        public a(Handler handler) {
            this.f5207a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f5207a.post(runnable);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f5209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p f5210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Runnable f5211d;

        public b(n nVar, p pVar, Runnable runnable) {
            this.f5209b = nVar;
            this.f5210c = pVar;
            this.f5211d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5209b.J()) {
                this.f5209b.r("canceled-at-delivery");
                return;
            }
            if (this.f5210c.b()) {
                this.f5209b.o(this.f5210c.f5252a);
            } else {
                this.f5209b.i(this.f5210c.f5254c);
            }
            if (this.f5210c.f5255d) {
                this.f5209b.b("intermediate-response");
            } else {
                this.f5209b.r("done");
            }
            Runnable runnable = this.f5211d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f5206a = new a(handler);
    }

    @Override // c.c.b.q
    public void a(n<?> nVar, p<?> pVar) {
        b(nVar, pVar, null);
    }

    @Override // c.c.b.q
    public void b(n<?> nVar, p<?> pVar, Runnable runnable) {
        nVar.K();
        nVar.b("post-response");
        this.f5206a.execute(new b(nVar, pVar, runnable));
    }

    @Override // c.c.b.q
    public void c(n<?> nVar, u uVar) {
        nVar.b("post-error");
        this.f5206a.execute(new b(nVar, p.a(uVar), null));
    }
}
