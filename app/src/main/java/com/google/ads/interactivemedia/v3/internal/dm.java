package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.CuePoint;

/* JADX INFO: loaded from: classes.dex */
public final class dm implements CuePoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f21659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f21660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21661c;

    public dm(double d2, double d3, boolean z) {
        this.f21659a = d2;
        this.f21660b = d3;
        this.f21661c = z;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final double getEndTime() {
        return this.f21660b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final long getEndTimeMs() {
        return (long) Math.floor(this.f21660b * 1000.0d);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final double getStartTime() {
        return this.f21659a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final long getStartTimeMs() {
        return (long) Math.floor(this.f21659a * 1000.0d);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final boolean isPlayed() {
        return this.f21661c;
    }
}
