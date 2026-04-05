package c.f.c.q;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f16195a = new j();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
