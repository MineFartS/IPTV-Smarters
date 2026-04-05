package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pg f22687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f22688b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioTrack.StreamEventCallback f22689c = new pe(this);

    public pf(pg pgVar) {
        this.f22687a = pgVar;
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.f22688b;
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.ads.interactivemedia.v3.internal.pd
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f22689c);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f22689c);
        this.f22688b.removeCallbacksAndMessages(null);
    }
}
