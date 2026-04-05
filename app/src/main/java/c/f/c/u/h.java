package c.f.c.u;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class h {
    public static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c.f.a.c.f.t.q.a("Firebase-Messaging-Trigger-Topics-Io"));
    }

    public static ScheduledExecutorService b() {
        return new ScheduledThreadPoolExecutor(1, new c.f.a.c.f.t.q.a("Firebase-Messaging-Init"));
    }

    public static ExecutorService c() {
        c.f.a.c.j.f.d.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c.f.a.c.f.t.q.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static ExecutorService d() {
        return Executors.newSingleThreadExecutor(new c.f.a.c.f.t.q.a("Firebase-Messaging-Network-Io"));
    }

    public static ScheduledExecutorService e() {
        return new ScheduledThreadPoolExecutor(1, new c.f.a.c.f.t.q.a("Firebase-Messaging-Topics-Io"));
    }

    public static Executor f() {
        return a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
