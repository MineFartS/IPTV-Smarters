package c.f.c.u;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import c.f.c.q.c0;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class g extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Binder f16378c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16380e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f16377b = h.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16379d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16381f = 0;

    public class a implements c0.a {
        public a() {
        }

        @Override // c.f.c.q.c0.a
        public c.f.a.c.o.i<Void> a(Intent intent) {
            return g.this.h(intent);
        }
    }

    public final void b(Intent intent) {
        if (intent != null) {
            c.f.c.q.a0.b(intent);
        }
        synchronized (this.f16379d) {
            int i2 = this.f16381f - 1;
            this.f16381f = i2;
            if (i2 == 0) {
                i(this.f16380e);
            }
        }
    }

    public abstract Intent c(Intent intent);

    public abstract void d(Intent intent);

    public abstract boolean e(Intent intent);

    public final /* synthetic */ void f(Intent intent, c.f.a.c.o.i iVar) {
        b(intent);
    }

    public final /* synthetic */ void g(Intent intent, c.f.a.c.o.j jVar) {
        try {
            d(intent);
        } finally {
            jVar.c(null);
        }
    }

    public final c.f.a.c.o.i<Void> h(final Intent intent) {
        if (e(intent)) {
            return c.f.a.c.o.l.e(null);
        }
        final c.f.a.c.o.j jVar = new c.f.a.c.o.j();
        this.f16377b.execute(new Runnable(this, intent, jVar) { // from class: c.f.c.u.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final g f16361b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Intent f16362c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final c.f.a.c.o.j f16363d;

            {
                this.f16361b = this;
                this.f16362c = intent;
                this.f16363d = jVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16361b.g(this.f16362c, this.f16363d);
            }
        });
        return jVar.a();
    }

    public boolean i(int i2) {
        return stopSelfResult(i2);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f16378c == null) {
            this.f16378c = new c.f.c.q.c0(new a());
        }
        return this.f16378c;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f16377b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i2, int i3) {
        synchronized (this.f16379d) {
            this.f16380e = i3;
            this.f16381f++;
        }
        Intent intentC = c(intent);
        if (intentC == null) {
            b(intent);
            return 2;
        }
        c.f.a.c.o.i<Void> iVarH = h(intentC);
        if (iVarH.n()) {
            b(intent);
            return 2;
        }
        iVarH.c(e.f16374a, new c.f.a.c.o.d(this, intent) { // from class: c.f.c.u.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f16375a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Intent f16376b;

            {
                this.f16375a = this;
                this.f16376b = intent;
            }

            @Override // c.f.a.c.o.d
            public void a(c.f.a.c.o.i iVar) {
                this.f16375a.f(this.f16376b, iVar);
            }
        });
        return 3;
    }
}
