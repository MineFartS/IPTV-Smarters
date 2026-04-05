package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes.dex */
public final class mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WifiManager f22421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f22422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22424d;

    public mi(Context context) {
        this.f22421a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private final void c() {
        WifiManager.WifiLock wifiLock = this.f22422b;
        if (wifiLock == null) {
            return;
        }
        wifiLock.release();
    }

    public final void a(boolean z) {
        this.f22423c = false;
        c();
    }

    public final void b(boolean z) {
        this.f22424d = z;
        c();
    }
}
