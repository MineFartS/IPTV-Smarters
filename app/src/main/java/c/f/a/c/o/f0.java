package c.f.a.c.o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f14574a = new c.f.a.c.j.j.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14574a.post(runnable);
    }
}
