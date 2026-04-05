package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.v3.api.CuePoint;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdEvent.AdEventType f21684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.ads.interactivemedia.v3.impl.data.c f21685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f21686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<CuePoint> f21687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdProgressInfo f21688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f21689f;

    public ea(AdEvent.AdEventType adEventType, com.google.ads.interactivemedia.v3.impl.data.c cVar) {
        this.f21684a = adEventType;
        this.f21685b = cVar;
    }

    public final boolean equals(Object obj) {
        return bnt.c(this, obj, new String[0]);
    }

    public final int hashCode() {
        return bnv.a(this, new String[0]);
    }
}
