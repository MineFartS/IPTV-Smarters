package m.a.a;

import java.lang.Thread;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f31128b;

    public k(b bVar) {
        this.f31128b = bVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f31128b.e()) {
                return;
            }
            a();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
