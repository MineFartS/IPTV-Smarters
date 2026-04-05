package c.f.a.c.k.b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class v6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f14392c;

    public v6(f7 f7Var, AtomicReference atomicReference) {
        this.f14392c = f7Var;
        this.f14391b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14391b) {
            try {
                this.f14391b.set(this.f14392c.f14413a.z().r(this.f14392c.f14413a.f().p(), m3.M));
            } finally {
                this.f14391b.notify();
            }
        }
    }
}
