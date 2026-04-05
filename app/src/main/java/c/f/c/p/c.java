package c.f.c.p;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f16155a = new c();

    public static ThreadFactory a() {
        return f16155a;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return d.e(runnable);
    }
}
