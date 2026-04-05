package c.f.a.c.k.b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class r6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f14280c;

    public r6(f7 f7Var, AtomicReference atomicReference) {
        this.f14280c = f7Var;
        this.f14279b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14279b) {
            try {
                this.f14279b.set(Boolean.valueOf(this.f14280c.f14413a.z().w(this.f14280c.f14413a.f().p(), m3.L)));
            } finally {
                this.f14279b.notify();
            }
        }
    }
}
