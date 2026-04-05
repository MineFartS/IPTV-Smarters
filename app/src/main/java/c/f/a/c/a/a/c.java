package c.f.a.c.a.a;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<a> f11524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CountDownLatch f11526d = new CountDownLatch(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11527e = false;

    public c(a aVar, long j2) {
        this.f11524b = new WeakReference<>(aVar);
        this.f11525c = j2;
        start();
    }

    public final void a() {
        a aVar = this.f11524b.get();
        if (aVar != null) {
            aVar.e();
            this.f11527e = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f11526d.await(this.f11525c, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
