package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdProgressInfo;

/* JADX INFO: loaded from: classes.dex */
public final class cn implements AdProgressInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f21557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f21558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f21561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f21562f;

    public cn(double d2, double d3, int i2, int i3, double d4, double d5) {
        this.f21557a = d2;
        this.f21558b = d3;
        this.f21559c = i2;
        this.f21560d = i3;
        this.f21561e = d4;
        this.f21562f = d5;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getAdBreakDuration() {
        return this.f21561e;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getAdPeriodDuration() {
        return this.f21562f;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final int getAdPosition() {
        return this.f21559c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getCurrentTime() {
        return this.f21557a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getDuration() {
        return this.f21558b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final int getTotalAds() {
        return this.f21560d;
    }
}
