package k.g0.i;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f30831a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30832b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f30833c = -1;

    public void a() {
        if (this.f30833c == -1) {
            long j2 = this.f30832b;
            if (j2 != -1) {
                this.f30833c = j2 - 1;
                this.f30831a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    public void b() {
        if (this.f30833c != -1 || this.f30832b == -1) {
            throw new IllegalStateException();
        }
        this.f30833c = System.nanoTime();
        this.f30831a.countDown();
    }

    public void c() {
        if (this.f30832b != -1) {
            throw new IllegalStateException();
        }
        this.f30832b = System.nanoTime();
    }
}
