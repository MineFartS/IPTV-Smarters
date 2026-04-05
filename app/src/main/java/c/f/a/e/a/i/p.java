package c.f.a.e.a.i;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f15769a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15769a.post(runnable);
    }
}
