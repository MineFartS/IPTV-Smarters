package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public final class mh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PowerManager f22417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f22418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22420d;

    public mh(Context context) {
        this.f22417a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private final void c() {
        PowerManager.WakeLock wakeLock = this.f22418b;
        if (wakeLock == null) {
            return;
        }
        wakeLock.release();
    }

    public final void a(boolean z) {
        this.f22419c = false;
        c();
    }

    public final void b(boolean z) {
        this.f22420d = z;
        c();
    }
}
