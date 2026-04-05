package c.f.a.c.f.t.q;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f12719b;

    public b(Runnable runnable, int i2) {
        this.f12719b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f12719b.run();
    }
}
