package c.f.a.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PowerManager f9759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f9760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9762d;

    public q2(Context context) {
        this.f9759a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z) {
        if (z && this.f9760b == null) {
            PowerManager powerManager = this.f9759a;
            if (powerManager == null) {
                c.f.a.b.j3.z.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f9760b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f9761c = z;
        c();
    }

    public void b(boolean z) {
        this.f9762d = z;
        c();
    }

    @SuppressLint({"WakelockTimeout"})
    public final void c() {
        PowerManager.WakeLock wakeLock = this.f9760b;
        if (wakeLock == null) {
            return;
        }
        if (this.f9761c && this.f9762d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
