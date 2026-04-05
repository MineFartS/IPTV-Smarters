package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import c.f.a.e.a.b.b0;
import c.f.a.e.a.b.j1;

/* JADX INFO: loaded from: classes2.dex */
public class AssetPackExtractionService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f24646b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f24646b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        j1.h(getApplicationContext()).b(this);
    }
}
