package c.f.c.u;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f16374a = new e();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
