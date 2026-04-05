package c.f.a.c.o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class x<TResult> implements c0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f14608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14609b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public e f14610c;

    public x(Executor executor, e eVar) {
        this.f14608a = executor;
        this.f14610c = eVar;
    }

    @Override // c.f.a.c.o.c0
    public final void b(i<TResult> iVar) {
        if (iVar.o() || iVar.m()) {
            return;
        }
        synchronized (this.f14609b) {
            if (this.f14610c == null) {
                return;
            }
            this.f14608a.execute(new w(this, iVar));
        }
    }
}
