package c.f.c.u;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f16352a = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInstanceId f16353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f16354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.c.q.s f16355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.c.q.p f16356e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f16358g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f16360i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, ArrayDeque<c.f.a.c.o.j<Void>>> f16357f = new a.f.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16359h = false;

    public c0(FirebaseInstanceId firebaseInstanceId, c.f.c.q.s sVar, a0 a0Var, c.f.c.q.p pVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f16353b = firebaseInstanceId;
        this.f16355d = sVar;
        this.f16360i = a0Var;
        this.f16356e = pVar;
        this.f16354c = context;
        this.f16358g = scheduledExecutorService;
    }

    public static <T> T a(c.f.a.c.o.i<T> iVar) throws IOException {
        try {
            return (T) c.f.a.c.o.l.b(iVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e3);
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static c.f.a.c.o.i<c0> d(c.f.c.c cVar, FirebaseInstanceId firebaseInstanceId, c.f.c.q.s sVar, c.f.c.r.b<c.f.c.v.i> bVar, c.f.c.r.b<c.f.c.p.f> bVar2, c.f.c.s.g gVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        return e(firebaseInstanceId, sVar, new c.f.c.q.p(cVar, sVar, bVar, bVar2, gVar), context, scheduledExecutorService);
    }

    public static c.f.a.c.o.i<c0> e(final FirebaseInstanceId firebaseInstanceId, final c.f.c.q.s sVar, final c.f.c.q.p pVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return c.f.a.c.o.l.c(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseInstanceId, sVar, pVar) { // from class: c.f.c.u.b0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f16344a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ScheduledExecutorService f16345b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final FirebaseInstanceId f16346c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final c.f.c.q.s f16347d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final c.f.c.q.p f16348e;

            {
                this.f16344a = context;
                this.f16345b = scheduledExecutorService;
                this.f16346c = firebaseInstanceId;
                this.f16347d = sVar;
                this.f16348e = pVar;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return c0.i(this.f16344a, this.f16345b, this.f16346c, this.f16347d, this.f16348e);
            }
        });
    }

    public static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public static final /* synthetic */ c0 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, c.f.c.q.s sVar, c.f.c.q.p pVar) {
        return new c0(firebaseInstanceId, sVar, a0.a(context, scheduledExecutorService), pVar, context, scheduledExecutorService);
    }

    public final void b(String str) throws IOException {
        c.f.c.q.q qVar = (c.f.c.q.q) a(this.f16353b.i());
        a(this.f16356e.j(qVar.getId(), qVar.getToken(), str));
    }

    public final void c(String str) throws IOException {
        c.f.c.q.q qVar = (c.f.c.q.q) a(this.f16353b.i());
        a(this.f16356e.k(qVar.getId(), qVar.getToken(), str));
    }

    public boolean f() {
        return this.f16360i.b() != null;
    }

    public synchronized boolean h() {
        return this.f16359h;
    }

    public final void j(z zVar) {
        synchronized (this.f16357f) {
            String strE = zVar.e();
            if (this.f16357f.containsKey(strE)) {
                ArrayDeque<c.f.a.c.o.j<Void>> arrayDeque = this.f16357f.get(strE);
                c.f.a.c.o.j<Void> jVarPoll = arrayDeque.poll();
                if (jVarPoll != null) {
                    jVarPoll.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f16357f.remove(strE);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k(c.f.c.u.z r7) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.c.u.c0.k(c.f.c.u.z):boolean");
    }

    public void l(Runnable runnable, long j2) {
        this.f16358g.schedule(runnable, j2, TimeUnit.SECONDS);
    }

    public synchronized void m(boolean z) {
        this.f16359h = z;
    }

    public final void n() {
        if (h()) {
            return;
        }
        q(0L);
    }

    public void o() {
        if (f()) {
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (g() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            c.f.c.u.a0 r0 = r2.f16360i     // Catch: java.lang.Throwable -> L2b
            c.f.c.u.z r0 = r0.b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = g()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            c.f.c.u.a0 r1 = r2.f16360i
            r1.d(r0)
            r2.j(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2e:
            throw r0
        L2f:
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.c.u.c0.p():boolean");
    }

    public void q(long j2) {
        l(new d0(this, this.f16354c, this.f16355d, Math.min(Math.max(30L, j2 + j2), f16352a)), j2);
        m(true);
    }
}
