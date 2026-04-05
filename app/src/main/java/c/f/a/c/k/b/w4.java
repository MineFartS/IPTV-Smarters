package c.f.a.c.k.b;

import java.lang.Thread;

/* JADX INFO: loaded from: classes2.dex */
public final class w4 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z4 f14412b;

    public w4(z4 z4Var, String str) {
        this.f14412b = z4Var;
        c.f.a.c.f.q.o.i(str);
        this.f14411a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f14412b.f14413a.c().o().b(this.f14411a, th);
    }
}
