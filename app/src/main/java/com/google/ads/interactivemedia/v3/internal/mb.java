package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class mb extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f22385a;

    public /* synthetic */ mb(mc mcVar) {
        this.f22385a = mcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Handler handler = this.f22385a.f22387b;
        final mc mcVar = this.f22385a;
        handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ma
            @Override // java.lang.Runnable
            public final void run() {
                mcVar.h();
            }
        });
    }
}
