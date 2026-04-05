package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class and implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final and f20215b = new and();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f20216a = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f20217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HandlerThread f20218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Choreographer f20219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20220f;

    private and() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f20218d = handlerThread;
        handlerThread.start();
        Handler handlerU = amn.u(handlerThread.getLooper(), this);
        this.f20217c = handlerU;
        handlerU.sendEmptyMessage(0);
    }

    public static and a() {
        return f20215b;
    }

    public final void b() {
        this.f20217c.sendEmptyMessage(1);
    }

    public final void c() {
        this.f20217c.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.f20216a = j2;
        Choreographer choreographer = this.f20219e;
        ajr.b(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            this.f20219e = Choreographer.getInstance();
            return true;
        }
        if (i2 == 1) {
            int i3 = this.f20220f + 1;
            this.f20220f = i3;
            if (i3 == 1) {
                Choreographer choreographer = this.f20219e;
                ajr.b(choreographer);
                choreographer.postFrameCallback(this);
            }
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        int i4 = this.f20220f - 1;
        this.f20220f = i4;
        if (i4 == 0) {
            Choreographer choreographer2 = this.f20219e;
            ajr.b(choreographer2);
            choreographer2.removeFrameCallback(this);
            this.f20216a = -9223372036854775807L;
        }
        return true;
    }
}
