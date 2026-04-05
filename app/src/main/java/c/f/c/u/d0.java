package c.f.c.u;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class d0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f16364b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f16365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f16366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f16367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.c.q.s f16368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PowerManager.WakeLock f16369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f16370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f16371i;

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d0 f16372a;

        public a(d0 d0Var) {
            this.f16372a = d0Var;
        }

        public void a() {
            if (d0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            d0.this.f16367e.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            d0 d0Var = this.f16372a;
            if (d0Var == null) {
                return;
            }
            if (d0Var.i()) {
                if (d0.j()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f16372a.f16370h.l(this.f16372a, 0L);
                context.unregisterReceiver(this);
                this.f16372a = null;
            }
        }
    }

    public d0(c0 c0Var, Context context, c.f.c.q.s sVar, long j2) {
        this.f16370h = c0Var;
        this.f16367e = context;
        this.f16371i = j2;
        this.f16368f = sVar;
        this.f16369g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String e(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    public static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f16364b) {
            Boolean bool = f16366d;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f16366d = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        Log.d("FirebaseMessaging", e(str));
        return false;
    }

    public static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f16364b) {
            Boolean bool = f16365c;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f16365c = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f16367e     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L20
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L12
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L20
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L1e
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1e
            r0 = 1
        L1c:
            monitor-exit(r2)
            return r0
        L1e:
            r0 = 0
            goto L1c
        L20:
            r0 = move-exception
            monitor-exit(r2)
            goto L24
        L23:
            throw r0
        L24:
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.c.u.d0.i():boolean");
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.f16367e)) {
            this.f16369g.acquire(b.f16343a);
        }
        try {
            try {
                this.f16370h.m(true);
                if (!this.f16368f.g()) {
                    this.f16370h.m(false);
                    if (h(this.f16367e)) {
                        try {
                            this.f16369g.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (f(this.f16367e) && !i()) {
                    new a(this).a();
                    if (h(this.f16367e)) {
                        try {
                            this.f16369g.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.f16370h.p()) {
                    this.f16370h.m(false);
                } else {
                    this.f16370h.q(this.f16371i);
                }
                if (h(this.f16367e)) {
                    try {
                        this.f16369g.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } catch (IOException e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.e("FirebaseMessaging", strValueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(strValueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.f16370h.m(false);
                if (h(this.f16367e)) {
                    try {
                        this.f16369g.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th) {
            if (h(this.f16367e)) {
                try {
                    this.f16369g.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
