package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f22387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lz f22388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioManager f22389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private mb f22390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22393h;

    public mc(Context context, Handler handler, lz lzVar) {
        Context applicationContext = context.getApplicationContext();
        this.f22386a = applicationContext;
        this.f22387b = handler;
        this.f22388c = lzVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        ajr.c(audioManager);
        this.f22389d = audioManager;
        this.f22391f = 3;
        this.f22392g = g(audioManager, 3);
        this.f22393h = i(audioManager, this.f22391f);
        mb mbVar = new mb(this);
        try {
            applicationContext.registerReceiver(mbVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f22390e = mbVar;
        } catch (RuntimeException e2) {
            alj.b("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    private static int g(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i2);
            alj.b("StreamVolumeManager", sb.toString(), e2);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        int iG = g(this.f22389d, this.f22391f);
        boolean zI = i(this.f22389d, this.f22391f);
        if (this.f22392g == iG && this.f22393h == zI) {
            return;
        }
        this.f22392g = iG;
        this.f22393h = zI;
        Iterator it = ((lv) this.f22388c).f22362a.f22372j.iterator();
        while (it.hasNext()) {
            ((qc) it.next()).ab();
        }
    }

    private static boolean i(AudioManager audioManager, int i2) {
        return amn.f20135a >= 23 ? audioManager.isStreamMute(i2) : g(audioManager, i2) == 0;
    }

    public final int a() {
        return this.f22389d.getStreamMaxVolume(this.f22391f);
    }

    public final int b() {
        if (amn.f20135a >= 28) {
            return this.f22389d.getStreamMinVolume(this.f22391f);
        }
        return 0;
    }

    public final void e() {
        mb mbVar = this.f22390e;
        if (mbVar != null) {
            try {
                this.f22386a.unregisterReceiver(mbVar);
            } catch (RuntimeException e2) {
                alj.b("StreamVolumeManager", "Error unregistering stream volume receiver", e2);
            }
            this.f22390e = null;
        }
    }

    public final void f(int i2) {
        if (this.f22391f == 3) {
            return;
        }
        this.f22391f = 3;
        h();
        lv lvVar = (lv) this.f22388c;
        qb qbVarX = lx.X(lvVar.f22362a.f22376n);
        if (qbVarX.equals(lvVar.f22362a.F)) {
            return;
        }
        lvVar.f22362a.F = qbVarX;
        Iterator it = lvVar.f22362a.f22372j.iterator();
        while (it.hasNext()) {
            ((qc) it.next()).aa();
        }
    }
}
