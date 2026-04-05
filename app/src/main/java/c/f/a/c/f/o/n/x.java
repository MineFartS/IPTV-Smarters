package c.f.a.c.f.o.n;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f12528a;

    public x(Handler handler) {
        this.f12528a = handler;
    }

    public static Executor a(Handler handler) {
        return new x(handler);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12528a.post(runnable);
    }
}
