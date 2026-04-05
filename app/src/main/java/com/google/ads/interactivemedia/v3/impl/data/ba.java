package com.google.ads.interactivemedia.v3.impl.data;

import android.util.Log;
import com.google.ads.interactivemedia.v3.internal.bnt;
import com.google.ads.interactivemedia.v3.internal.bnv;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class ba {
    public double adBreakDuration;
    public String adBreakTime;
    public List<Float> adCuePoints;
    public c adData;
    public double adPeriodDuration;
    public d adPodInfo;
    public int adPosition;
    public long adTimeUpdateMs;
    public double bufferedTime;
    public Map<String, CompanionData> companions;
    public List<au> cuepoints;
    public double currentTime;
    public double duration;
    public boolean enableGks;
    public int errorCode;
    public String errorMessage;
    public String eventId;
    public String innerError;
    public SortedSet<Float> internalCuePoints;
    public String ln;
    public az logData;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f18944m;
    public boolean monitorAppLifecycle;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f18945n;
    public bc networkRequest;
    public String queryId;
    public ResizeAndPositionVideoMsgData resizeAndPositionVideo;
    public double seekTime;
    public String streamId;
    public String streamUrl;
    public List<HashMap<String, String>> subtitles;
    public int totalAds;
    public String url;
    public String vastEvent;
    public String videoUrl;

    public boolean equals(Object obj) {
        return bnt.c(this, obj, new String[0]);
    }

    public int hashCode() {
        return bnv.a(this, new String[0]);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("JavaScriptMsgData[");
        for (Field field : ba.class.getFields()) {
            try {
                Object obj = field.get(this);
                sb.append(field.getName());
                sb.append(":");
                sb.append(obj);
                sb.append(",");
            } catch (IllegalAccessException e2) {
                e = e2;
                str = "IllegalAccessException occurred";
                Log.e("IMASDK", str, e);
            } catch (IllegalArgumentException e3) {
                e = e3;
                str = "IllegalArgumentException occurred";
                Log.e("IMASDK", str, e);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
