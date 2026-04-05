package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class dl implements eu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SortedSet<Float> f21653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ed f21654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f21656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VideoProgressUpdate f21657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final arq f21658f;

    public dl(ed edVar, SortedSet<Float> sortedSet, String str) {
        arq arqVar = new arq();
        this.f21656d = 0L;
        this.f21657e = new VideoProgressUpdate(0L, 0L);
        this.f21653a = sortedSet;
        this.f21658f = arqVar;
        this.f21654b = edVar;
        this.f21655c = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eu
    public final void a(VideoProgressUpdate videoProgressUpdate) {
        if (videoProgressUpdate == null || videoProgressUpdate.getDuration() < 0.0f || videoProgressUpdate.equals(this.f21657e)) {
            return;
        }
        float currentTime = this.f21657e.getCurrentTime();
        float currentTime2 = videoProgressUpdate.getCurrentTime();
        if (!(currentTime < currentTime2 ? this.f21653a.subSet(Float.valueOf(currentTime), Float.valueOf(currentTime2)) : this.f21653a.subSet(Float.valueOf(currentTime2), Float.valueOf(currentTime))).isEmpty() || this.f21653a.contains(Float.valueOf(videoProgressUpdate.getCurrentTime())) || System.currentTimeMillis() - this.f21656d >= 1000) {
            this.f21656d = System.currentTimeMillis();
            this.f21657e = videoProgressUpdate;
            this.f21654b.o(new dw(du.contentTimeUpdate, dv.contentTimeUpdate, this.f21655c, com.google.ads.interactivemedia.v3.impl.data.bj.create(videoProgressUpdate)));
        }
    }
}
