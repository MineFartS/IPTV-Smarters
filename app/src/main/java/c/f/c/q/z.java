package c.f.c.q;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import c.f.c.q.y;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class z implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f16238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseInstanceId f16239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExecutorService f16240e = h.b();

    /* JADX INFO: loaded from: classes.dex */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public z f16241a;

        public a(z zVar) {
            this.f16241a = zVar;
        }

        public void a() {
            if (FirebaseInstanceId.q()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f16241a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            z zVar = this.f16241a;
            if (zVar != null && zVar.d()) {
                if (FirebaseInstanceId.q()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f16241a.f16239d.e(this.f16241a, 0L);
                this.f16241a.b().unregisterReceiver(this);
                this.f16241a = null;
            }
        }
    }

    public z(FirebaseInstanceId firebaseInstanceId, long j2) {
        this.f16239d = firebaseInstanceId;
        this.f16237b = j2;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f16238c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public Context b() {
        return this.f16239d.f().g();
    }

    public final void c(String str) {
        if ("[DEFAULT]".equals(this.f16239d.f().i())) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(this.f16239d.f().i());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(strValueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new f(b(), this.f16240e).g(intent);
        }
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean e() throws IOException {
        String string;
        y.a aVarO = this.f16239d.o();
        if (!this.f16239d.E(aVarO)) {
            return true;
        }
        try {
            String strC = this.f16239d.c();
            if (strC == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (aVarO == null || !strC.equals(aVarO.f16234b)) {
                c(strC);
            }
            return true;
        } catch (IOException e2) {
            if (p.f(e2.getMessage())) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                string = sb.toString();
            } else {
                if (e2.getMessage() != null) {
                    throw e2;
                }
                string = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseInstanceId", string);
            return false;
        } catch (SecurityException unused) {
            string = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseInstanceId", string);
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (x.b().e(b())) {
            this.f16238c.acquire();
        }
        try {
            try {
                this.f16239d.A(true);
                if (!this.f16239d.r()) {
                    this.f16239d.A(false);
                    if (!x.b().e(b())) {
                        return;
                    }
                } else if (!x.b().d(b()) || d()) {
                    if (e()) {
                        this.f16239d.A(false);
                    } else {
                        this.f16239d.D(this.f16237b);
                    }
                    if (!x.b().e(b())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!x.b().e(b())) {
                        return;
                    }
                }
            } catch (IOException e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                this.f16239d.A(false);
                if (!x.b().e(b())) {
                    return;
                }
            }
            this.f16238c.release();
        } catch (Throwable th) {
            if (x.b().e(b())) {
                this.f16238c.release();
            }
            throw th;
        }
    }
}
