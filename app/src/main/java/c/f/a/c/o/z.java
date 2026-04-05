package c.f.a.c.o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class z<TResult> implements c0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f14613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14614b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public f<? super TResult> f14615c;

    public z(Executor executor, f<? super TResult> fVar) {
        this.f14613a = executor;
        this.f14615c = fVar;
    }

    @Override // c.f.a.c.o.c0
    public final void b(i<TResult> iVar) {
        if (iVar.o()) {
            synchronized (this.f14614b) {
                if (this.f14615c == null) {
                    return;
                }
                this.f14613a.execute(new y(this, iVar));
            }
        }
    }
}
