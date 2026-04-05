package c.f.a.c.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.g;
import c.f.a.c.f.q.o;
import c.f.a.c.j.a.e;
import c.f.a.c.j.a.f;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public c.f.a.c.f.a f11514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public f f11515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f11516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("mAutoDisconnectTaskLock")
    public c f11518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    public final Context f11519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11520g;

    /* JADX INFO: renamed from: c.f.a.c.a.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class C0150a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f11522b;

        public C0150a(String str, boolean z) {
            this.f11521a = str;
            this.f11522b = z;
        }

        @RecentlyNullable
        public String a() {
            return this.f11521a;
        }

        public boolean b() {
            return this.f11522b;
        }

        @RecentlyNonNull
        public String toString() {
            String str = this.f11521a;
            boolean z = this.f11522b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public a(@RecentlyNonNull Context context) {
        this(context, 30000L, false, false);
    }

    public a(@RecentlyNonNull Context context, long j2, boolean z, boolean z2) {
        Context applicationContext;
        this.f11517d = new Object();
        o.i(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f11519f = context;
        this.f11516c = false;
        this.f11520g = j2;
    }

    @RecentlyNonNull
    public static C0150a a(@RecentlyNonNull Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.f(false);
            C0150a c0150aB = aVar.b();
            aVar.g(c0150aB, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, BuildConfig.FLAVOR, null);
            return c0150aB;
        } finally {
        }
    }

    public static void c(boolean z) {
    }

    @RecentlyNonNull
    public C0150a b() {
        C0150a c0150a;
        o.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f11516c) {
                o.i(this.f11514a);
                o.i(this.f11515b);
                c0150a = new C0150a(this.f11515b.l(), this.f11515b.V(true));
            } else {
                synchronized (this.f11517d) {
                    c cVar = this.f11518e;
                    if (cVar == null || !cVar.f11527e) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    f(false);
                    if (!this.f11516c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    o.i(this.f11514a);
                    o.i(this.f11515b);
                    try {
                        c0150a = new C0150a(this.f11515b.l(), this.f11515b.V(true));
                    } catch (RemoteException e2) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
        }
        h();
        return c0150a;
    }

    public void d() {
        f(true);
    }

    public final void e() {
        o.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f11519f == null || this.f11514a == null) {
                return;
            }
            try {
                if (this.f11516c) {
                    c.f.a.c.f.s.a.b().c(this.f11519f, this.f11514a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f11516c = false;
            this.f11515b = null;
            this.f11514a = null;
        }
    }

    public final void f(boolean z) {
        o.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f11516c) {
                e();
            }
            Context context = this.f11519f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int iH = c.f.a.c.f.f.f().h(context, 12451000);
                if (iH != 0 && iH != 2) {
                    throw new IOException("Google Play services not available");
                }
                c.f.a.c.f.a aVar = new c.f.a.c.f.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!c.f.a.c.f.s.a.b().a(context, intent, aVar, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.f11514a = aVar;
                    try {
                        this.f11515b = e.J(aVar.a(10000L, TimeUnit.MILLISECONDS));
                        this.f11516c = true;
                        if (z) {
                            h();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } finally {
                    IOException iOException = new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new g(9);
            }
        }
    }

    public final void finalize() throws Throwable {
        e();
        super.finalize();
    }

    public final boolean g(C0150a c0150a, boolean z, float f2, long j2, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c0150a != null) {
            map.put("limit_ad_tracking", true != c0150a.b() ? "0" : "1");
            String strA = c0150a.a();
            if (strA != null) {
                map.put("ad_id_size", Integer.toString(strA.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j2));
        new b(this, map).start();
        return true;
    }

    public final void h() {
        synchronized (this.f11517d) {
            c cVar = this.f11518e;
            if (cVar != null) {
                cVar.f11526d.countDown();
                try {
                    this.f11518e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j2 = this.f11520g;
            if (j2 > 0) {
                this.f11518e = new c(this, j2);
            }
        }
    }
}
