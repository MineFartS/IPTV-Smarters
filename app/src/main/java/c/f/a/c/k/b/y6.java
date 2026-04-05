package c.f.a.c.k.b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class y6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f14482c;

    public y6(f7 f7Var, AtomicReference atomicReference) {
        this.f14482c = f7Var;
        this.f14481b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14481b) {
            try {
                this.f14481b.set(Double.valueOf(this.f14482c.f14413a.z().v(this.f14482c.f14413a.f().p(), m3.P)));
            } finally {
                this.f14481b.notify();
            }
        }
    }
}
