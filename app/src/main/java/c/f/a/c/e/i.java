package c.f.a.c.e;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("MessengerIpcClient.class")
    public static i f12263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f12265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    public j f12266d = new j(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    public int f12267e = 1;

    public i(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f12265c = scheduledExecutorService;
        this.f12264b = context.getApplicationContext();
    }

    public static synchronized i c(Context context) {
        if (f12263a == null) {
            f12263a = new i(context, c.f.a.c.j.d.a.a().a(1, new c.f.a.c.f.t.q.a("MessengerIpcClient"), c.f.a.c.j.d.f.f13168b));
        }
        return f12263a;
    }

    public final synchronized int a() {
        int i2;
        i2 = this.f12267e;
        this.f12267e = i2 + 1;
        return i2;
    }

    public final c.f.a.c.o.i<Void> d(int i2, Bundle bundle) {
        return e(new r(a(), 2, bundle));
    }

    public final synchronized <T> c.f.a.c.o.i<T> e(u<T> uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(uVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(strValueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f12266d.e(uVar)) {
            j jVar = new j(this);
            this.f12266d = jVar;
            jVar.e(uVar);
        }
        return uVar.f12286b.a();
    }

    public final c.f.a.c.o.i<Bundle> f(int i2, Bundle bundle) {
        return e(new w(a(), 1, bundle));
    }
}
