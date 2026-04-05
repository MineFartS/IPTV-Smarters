package c.f.a.c.k.b;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class x4<V> extends FutureTask<V> implements Comparable<x4<V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z4 f14437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(z4 z4Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f14437e = z4Var;
        c.f.a.c.f.q.o.i(str);
        long andIncrement = z4.f14497c.getAndIncrement();
        this.f14434b = andIncrement;
        this.f14436d = str;
        this.f14435c = z;
        if (andIncrement == Long.MAX_VALUE) {
            z4Var.f14413a.c().o().a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(z4 z4Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f14437e = z4Var;
        c.f.a.c.f.q.o.i("Task exception on worker thread");
        long andIncrement = z4.f14497c.getAndIncrement();
        this.f14434b = andIncrement;
        this.f14436d = "Task exception on worker thread";
        this.f14435c = z;
        if (andIncrement == Long.MAX_VALUE) {
            z4Var.f14413a.c().o().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        x4 x4Var = (x4) obj;
        boolean z = this.f14435c;
        if (z != x4Var.f14435c) {
            return !z ? 1 : -1;
        }
        long j2 = this.f14434b;
        long j3 = x4Var.f14434b;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.f14437e.f14413a.c().p().b("Two tasks share the same index. index", Long.valueOf(this.f14434b));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f14437e.f14413a.c().o().b(this.f14436d, th);
        super.setException(th);
    }
}
