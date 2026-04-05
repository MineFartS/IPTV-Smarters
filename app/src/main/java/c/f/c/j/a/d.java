package c.f.c.j.a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f16055a = new d();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
