package c.f.a.e.a.b;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class r2 implements c.f.a.e.a.e.c0<Executor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15593a = 0;

    public r2() {
    }

    public r2(byte[] bArr) {
    }

    public r2(char[] cArr) {
    }

    public r2(short[] sArr) {
    }

    public static Executor b() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(j2.f15501a);
        c.f.a.e.a.e.n.d(executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }

    public static Executor c() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(j2.f15502b);
        c.f.a.e.a.e.n.d(executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }

    public static e0 d() {
        return new e0();
    }

    public static o0 e() {
        return new o0();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c.f.a.e.a.b.e0, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [c.f.a.e.a.b.o0, java.util.concurrent.Executor] */
    @Override // c.f.a.e.a.e.c0
    public final /* bridge */ /* synthetic */ Executor a() {
        int i2 = this.f15593a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? e() : d() : c() : b();
    }
}
