package c.f.a.c.o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class t<TResult> implements c0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f14598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14599b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public c f14600c;

    public t(Executor executor, c cVar) {
        this.f14598a = executor;
        this.f14600c = cVar;
    }

    @Override // c.f.a.c.o.c0
    public final void b(i<TResult> iVar) {
        if (iVar.m()) {
            synchronized (this.f14599b) {
                if (this.f14600c == null) {
                    return;
                }
                this.f14598a.execute(new s(this));
            }
        }
    }
}
