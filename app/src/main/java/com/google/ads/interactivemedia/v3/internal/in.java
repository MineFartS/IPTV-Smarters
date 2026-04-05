package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class in extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ip f21966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io f21967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f21968c;

    public in(ip ipVar, Handler handler, io ioVar) {
        this.f21966a = ipVar;
        this.f21968c = handler;
        this.f21967b = ioVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f21968c.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
