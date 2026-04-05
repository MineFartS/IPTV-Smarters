package com.google.ads.interactivemedia.v3.api;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface StreamManager extends BaseManager {
    @Deprecated
    double getContentTimeForStreamTime(double d2);

    long getContentTimeMsForStreamTimeMs(long j2);

    List<CuePoint> getCuePoints();

    @Deprecated
    CuePoint getPreviousCuePointForStreamTime(double d2);

    CuePoint getPreviousCuePointForStreamTimeMs(long j2);

    String getStreamId();

    @Deprecated
    double getStreamTimeForContentTime(double d2);

    long getStreamTimeMsForContentTimeMs(long j2);

    void replaceAdTagParameters(Map<String, String> map);
}
