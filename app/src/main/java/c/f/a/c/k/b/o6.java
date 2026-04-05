package c.f.a.c.k.b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f14190c;

    public o6(f7 f7Var, long j2) {
        this.f14190c = f7Var;
        this.f14189b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14190c.t(this.f14189b, true);
        this.f14190c.f14413a.R().T(new AtomicReference<>());
    }
}
