package c.f.a.e.a.b;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j2 implements ThreadFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15503c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadFactory f15502b = new j2(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadFactory f15501a = new j2();

    public j2() {
    }

    public j2(byte[] bArr) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.f15503c != 0 ? new Thread(runnable, "AssetPackBackgroundExecutor") : new Thread(runnable, "UpdateListenerExecutor");
    }
}
