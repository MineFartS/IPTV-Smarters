package c.f.c.p;

import android.content.Context;
import c.f.c.k.q;
import c.f.c.k.w;
import c.f.c.p.f;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadFactory f16156a = c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.f.c.r.b<g> f16157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<e> f16158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f16159d;

    public d(Context context, Set<e> set) {
        this(new w(a.a(context)), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f16156a));
    }

    public d(c.f.c.r.b<g> bVar, Set<e> set, Executor executor) {
        this.f16157b = bVar;
        this.f16158c = set;
        this.f16159d = executor;
    }

    public static c.f.c.k.d<f> b() {
        return c.f.c.k.d.a(f.class).b(q.i(Context.class)).b(q.j(e.class)).f(b.b()).d();
    }

    public static /* synthetic */ f c(c.f.c.k.e eVar) {
        return new d((Context) eVar.a(Context.class), eVar.d(e.class));
    }

    public static /* synthetic */ Thread e(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // c.f.c.p.f
    public f.a a(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zD = this.f16157b.get().d(str, jCurrentTimeMillis);
        boolean zC = this.f16157b.get().c(jCurrentTimeMillis);
        return (zD && zC) ? f.a.COMBINED : zC ? f.a.GLOBAL : zD ? f.a.SDK : f.a.NONE;
    }
}
