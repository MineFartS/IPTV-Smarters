package c.f.a.c.k.b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class x6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f14440c;

    public x6(f7 f7Var, AtomicReference atomicReference) {
        this.f14440c = f7Var;
        this.f14439b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14439b) {
            try {
                this.f14439b.set(Integer.valueOf(this.f14440c.f14413a.z().t(this.f14440c.f14413a.f().p(), m3.O)));
            } finally {
                this.f14439b.notify();
            }
        }
    }
}
