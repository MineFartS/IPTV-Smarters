package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentProgressProvider f21740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f21741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<eu> f21742c;

    public ev() {
        this.f21742c = new ArrayList(1);
        this.f21741b = new Handler(Looper.getMainLooper());
    }

    public ev(ContentProgressProvider contentProgressProvider) {
        this();
        this.f21740a = contentProgressProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        VideoProgressUpdate videoProgressUpdateF = f();
        Iterator<eu> it = this.f21742c.iterator();
        while (it.hasNext()) {
            it.next().a(videoProgressUpdateF);
        }
        this.f21741b.postDelayed(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.et
            @Override // java.lang.Runnable
            public final void run() {
                this.f21739a.g();
            }
        }, 200L);
    }

    public final void b(eu euVar) {
        this.f21742c.add(euVar);
    }

    public final void c(eu euVar) {
        this.f21742c.remove(euVar);
    }

    public final void d() {
        e();
        g();
    }

    public final void e() {
        this.f21741b.removeCallbacksAndMessages(null);
    }

    public final VideoProgressUpdate f() {
        VideoProgressUpdate contentProgress = this.f21740a.getContentProgress();
        if (contentProgress != null) {
            return contentProgress;
        }
        Log.w("IMASDK", "ContentProgressProvider.getContentProgress() is null. Use VideoProgressUpdate.VIDEO_TIME_NOT_READY instead.");
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }
}
