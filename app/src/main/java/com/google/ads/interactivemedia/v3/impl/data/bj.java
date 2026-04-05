package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.internal.ark;

/* JADX INFO: loaded from: classes.dex */
@ark(a = am.class)
public abstract class bj {
    private static final String DEFAULT_TIME_UNIT = "ms";

    public static bj create(VideoProgressUpdate videoProgressUpdate) {
        return new am(videoProgressUpdate.getCurrentTimeMs(), videoProgressUpdate.getDurationMs(), DEFAULT_TIME_UNIT);
    }

    public abstract long currentTime();

    public abstract long duration();

    public abstract String timeUnit();
}
