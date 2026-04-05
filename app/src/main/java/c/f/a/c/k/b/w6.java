package c.f.a.c.k.b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class w6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f14415c;

    public w6(f7 f7Var, AtomicReference atomicReference) {
        this.f14415c = f7Var;
        this.f14414b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14414b) {
            try {
                this.f14414b.set(Long.valueOf(this.f14415c.f14413a.z().s(this.f14415c.f14413a.f().p(), m3.N)));
            } finally {
                this.f14414b.notify();
            }
        }
    }
}
