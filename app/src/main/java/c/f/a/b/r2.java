package c.f.a.b;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WifiManager f9785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WifiManager.WifiLock f9786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9788d;

    public r2(Context context) {
        this.f9785a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z) {
        if (z && this.f9786b == null) {
            WifiManager wifiManager = this.f9785a;
            if (wifiManager == null) {
                c.f.a.b.j3.z.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f9786b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f9787c = z;
        c();
    }

    public void b(boolean z) {
        this.f9788d = z;
        c();
    }

    public final void c() {
        WifiManager.WifiLock wifiLock = this.f9786b;
        if (wifiLock == null) {
            return;
        }
        if (this.f9787c && this.f9788d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
