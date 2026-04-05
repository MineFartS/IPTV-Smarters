package c.f.c.q;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f16190a = new g();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
