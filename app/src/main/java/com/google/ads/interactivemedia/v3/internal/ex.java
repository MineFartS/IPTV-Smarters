package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.CuePoint;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ex extends dg implements StreamManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<CuePoint> f21745b;

    public ex(String str, ed edVar, StreamDisplayContainer streamDisplayContainer, fa faVar, ch chVar, es esVar, dn dnVar, Context context, String str2, boolean z) {
        super(str, edVar, faVar, streamDisplayContainer, chVar, esVar, dnVar, context, z, new fq());
        this.f21745b = new ArrayList();
        this.f21744a = str2;
        faVar.k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dg, com.google.ads.interactivemedia.v3.internal.eb
    public final void b(ea eaVar) {
        fa faVar = (fa) c();
        AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int iOrdinal = eaVar.f21684a.ordinal();
        if (iOrdinal == 3) {
            faVar.n();
        } else if (iOrdinal == 4) {
            this.f21745b = eaVar.f21687d;
        } else if (iOrdinal == 14) {
            double d2 = eaVar.f21689f;
            StringBuilder sb = new StringBuilder(54);
            sb.append("Seek time when ad is skipped: ");
            sb.append(d2);
            Log.i("IMASDK", sb.toString());
            faVar.l(Math.round(eaVar.f21689f * 1000.0d));
        } else if (iOrdinal != 15) {
            switch (iOrdinal) {
                case 23:
                    faVar.e();
                    break;
                case 24:
                    faVar.b();
                    break;
                case 25:
                    faVar.j();
                    break;
                case 26:
                    faVar.i();
                    break;
            }
        } else {
            faVar.m(eaVar.f21685b);
        }
        super.b(eaVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dg, com.google.ads.interactivemedia.v3.api.BaseManager
    public final void destroy() {
        super.destroy();
        m(dv.contentComplete);
        k();
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final double getContentTimeForStreamTime(double d2) {
        double startTime = d2;
        for (CuePoint cuePoint : this.f21745b) {
            if (cuePoint.getStartTime() > cuePoint.getEndTime()) {
                return 0.0d;
            }
            double endTime = cuePoint.getEndTime();
            double endTime2 = cuePoint.getEndTime();
            if (d2 >= endTime) {
                startTime -= endTime2 - cuePoint.getStartTime();
            } else if (d2 < endTime2 && d2 > cuePoint.getStartTime()) {
                startTime -= d2 - cuePoint.getStartTime();
            }
        }
        return startTime;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final long getContentTimeMsForStreamTimeMs(long j2) {
        long startTimeMs = j2;
        for (CuePoint cuePoint : this.f21745b) {
            if (cuePoint.getStartTimeMs() > cuePoint.getEndTimeMs()) {
                return 0L;
            }
            long endTimeMs = cuePoint.getEndTimeMs();
            long endTimeMs2 = cuePoint.getEndTimeMs();
            if (j2 >= endTimeMs) {
                startTimeMs -= endTimeMs2 - cuePoint.getStartTimeMs();
            } else if (j2 < endTimeMs2 && j2 > cuePoint.getStartTimeMs()) {
                startTimeMs -= j2 - cuePoint.getStartTimeMs();
            }
        }
        return startTimeMs;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final List<CuePoint> getCuePoints() {
        return Collections.unmodifiableList(this.f21745b);
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final CuePoint getPreviousCuePointForStreamTime(double d2) {
        CuePoint cuePoint = null;
        for (CuePoint cuePoint2 : this.f21745b) {
            if (cuePoint2.getStartTime() < d2) {
                cuePoint = cuePoint2;
            }
        }
        return cuePoint;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final CuePoint getPreviousCuePointForStreamTimeMs(long j2) {
        CuePoint cuePoint = null;
        for (CuePoint cuePoint2 : this.f21745b) {
            if (cuePoint2.getStartTimeMs() < j2) {
                cuePoint = cuePoint2;
            }
        }
        return cuePoint;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final String getStreamId() {
        return this.f21744a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final double getStreamTimeForContentTime(double d2) {
        double endTime = d2;
        double startTime = 0.0d;
        double endTime2 = 0.0d;
        for (CuePoint cuePoint : this.f21745b) {
            if (cuePoint.getStartTime() > cuePoint.getEndTime()) {
                return 0.0d;
            }
            startTime += cuePoint.getStartTime() - endTime2;
            if (startTime > d2) {
                return endTime;
            }
            endTime += cuePoint.getEndTime() - cuePoint.getStartTime();
            endTime2 = cuePoint.getEndTime();
        }
        return endTime;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final long getStreamTimeMsForContentTimeMs(long j2) {
        long endTimeMs = j2;
        long startTimeMs = 0;
        long endTimeMs2 = 0;
        for (CuePoint cuePoint : this.f21745b) {
            if (cuePoint.getStartTimeMs() > cuePoint.getEndTimeMs()) {
                return 0L;
            }
            startTimeMs += cuePoint.getStartTimeMs() - endTimeMs2;
            if (startTimeMs > j2) {
                return endTimeMs;
            }
            endTimeMs += cuePoint.getEndTimeMs() - cuePoint.getStartTimeMs();
            endTimeMs2 = cuePoint.getEndTimeMs();
        }
        return endTimeMs;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final boolean isCustomPlaybackUsed() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final void replaceAdTagParameters(Map<String, String> map) {
        if (map == null) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("adTagParameters", map);
        l(du.adsManager, dv.replaceAdTagParameters, map2);
    }
}
