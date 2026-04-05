package c.f.a.e.a.i;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f15775a = new CountDownLatch(1);

    public /* synthetic */ r(byte[] bArr) {
    }

    @Override // c.f.a.e.a.i.b
    public final void a(Object obj) {
        this.f15775a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f15775a.await();
    }

    @Override // c.f.a.e.a.i.a
    public final void onFailure(Exception exc) {
        this.f15775a.countDown();
    }
}
