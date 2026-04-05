package c.f.a.c.o;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class d0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14571a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    public Queue<c0<TResult>> f14572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f14573c;

    public final void a(c0<TResult> c0Var) {
        synchronized (this.f14571a) {
            if (this.f14572b == null) {
                this.f14572b = new ArrayDeque();
            }
            this.f14572b.add(c0Var);
        }
    }

    public final void b(i<TResult> iVar) {
        c0<TResult> c0VarPoll;
        synchronized (this.f14571a) {
            if (this.f14572b != null && !this.f14573c) {
                this.f14573c = true;
                while (true) {
                    synchronized (this.f14571a) {
                        c0VarPoll = this.f14572b.poll();
                        if (c0VarPoll == null) {
                            this.f14573c = false;
                            return;
                        }
                    }
                    c0VarPoll.b(iVar);
                }
            }
        }
    }
}
