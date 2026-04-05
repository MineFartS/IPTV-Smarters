package c.f.c.q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import c.f.c.q.f0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class f0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f16183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f16184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue<a> f16185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c0 f16186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16187f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f16188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.a.c.o.j<Void> f16189b = new c.f.a.c.o.j<>();

        public a(Intent intent) {
            this.f16188a = intent;
        }

        public void a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable(this) { // from class: c.f.c.q.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final f0.a f16175b;

                {
                    this.f16175b = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f16175b.d();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            c().c(scheduledExecutorService, new c.f.a.c.o.d(scheduledFutureSchedule) { // from class: c.f.c.q.e0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ScheduledFuture f16177a;

                {
                    this.f16177a = scheduledFutureSchedule;
                }

                @Override // c.f.a.c.o.d
                public void a(c.f.a.c.o.i iVar) {
                    this.f16177a.cancel(false);
                }
            });
        }

        public void b() {
            this.f16189b.e(null);
        }

        public c.f.a.c.o.i<Void> c() {
            return this.f16189b.a();
        }

        public final /* synthetic */ void d() {
            String action = this.f16188a.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
            sb.append("Service took too long to process intent: ");
            sb.append(action);
            sb.append(" App may get closed.");
            Log.w("FirebaseInstanceId", sb.toString());
            b();
        }
    }

    public f0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new c.f.a.c.f.t.q.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public f0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f16185d = new ArrayDeque();
        this.f16187f = false;
        Context applicationContext = context.getApplicationContext();
        this.f16182a = applicationContext;
        this.f16183b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f16184c = scheduledExecutorService;
    }

    public final void a() {
        while (!this.f16185d.isEmpty()) {
            this.f16185d.poll().b();
        }
    }

    public final synchronized void b() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "flush queue called");
        }
        while (!this.f16185d.isEmpty()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "found intent to be delivered");
            }
            c0 c0Var = this.f16186e;
            if (c0Var == null || !c0Var.isBinderAlive()) {
                d();
                return;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
            }
            this.f16186e.b(this.f16185d.poll());
        }
    }

    public synchronized c.f.a.c.o.i<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.a(this.f16184c);
        this.f16185d.add(aVar);
        b();
        return aVar.c();
    }

    public final void d() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            boolean z = this.f16187f;
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!z);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        if (this.f16187f) {
            return;
        }
        this.f16187f = true;
        try {
            if (c.f.a.c.f.s.a.b().a(this.f16182a, this.f16183b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseInstanceId", "binding to the service failed");
            }
        } catch (SecurityException e2) {
            Log.e("FirebaseInstanceId", "Exception while binding the service", e2);
        }
        this.f16187f = false;
        a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        this.f16187f = false;
        if (iBinder instanceof c0) {
            this.f16186e = (c0) iBinder;
            b();
            return;
        }
        String strValueOf2 = String.valueOf(iBinder);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 28);
        sb2.append("Invalid service connection: ");
        sb2.append(strValueOf2);
        Log.e("FirebaseInstanceId", sb2.toString());
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        b();
    }
}
