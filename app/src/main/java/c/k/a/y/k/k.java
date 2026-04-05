package c.k.a.y.k;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f18525a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18526b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18527c = -1;

    public void a() {
        if (this.f18527c == -1) {
            long j2 = this.f18526b;
            if (j2 != -1) {
                this.f18527c = j2 - 1;
                this.f18525a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    public void b() {
        if (this.f18527c != -1 || this.f18526b == -1) {
            throw new IllegalStateException();
        }
        this.f18527c = System.nanoTime();
        this.f18525a.countDown();
    }

    public void c() {
        if (this.f18526b != -1) {
            throw new IllegalStateException();
        }
        this.f18526b = System.nanoTime();
    }
}
