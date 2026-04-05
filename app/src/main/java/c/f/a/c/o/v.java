package c.f.a.c.o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class v<TResult> implements c0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f14603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14604b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public d<TResult> f14605c;

    public v(Executor executor, d<TResult> dVar) {
        this.f14603a = executor;
        this.f14605c = dVar;
    }

    @Override // c.f.a.c.o.c0
    public final void b(i<TResult> iVar) {
        synchronized (this.f14604b) {
            if (this.f14605c == null) {
                return;
            }
            this.f14603a.execute(new u(this, iVar));
        }
    }
}
