package c.f.a.c.o;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f14586a = new CountDownLatch(1);

    public /* synthetic */ m(h0 h0Var) {
    }

    @Override // c.f.a.c.o.f
    public final void a(Object obj) {
        this.f14586a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f14586a.await();
    }

    @Override // c.f.a.c.o.c
    public final void c() {
        this.f14586a.countDown();
    }

    public final boolean d(long j2, TimeUnit timeUnit) {
        return this.f14586a.await(j2, timeUnit);
    }

    @Override // c.f.a.c.o.e
    public final void onFailure(Exception exc) {
        this.f14586a.countDown();
    }
}
