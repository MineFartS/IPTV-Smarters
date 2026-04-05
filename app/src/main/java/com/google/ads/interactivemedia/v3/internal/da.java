package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class da implements AdsRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f21610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ContentProgressProvider f21612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private cx f21613e = cx.UNKNOWN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private cz f21614f = cz.UNKNOWN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private cy f21615g = cy.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Float f21616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f21617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f21618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f21619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Float f21620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Float f21621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient Object f21622n;

    public final cx a() {
        return this.f21613e;
    }

    public final cy b() {
        return this.f21615g;
    }

    public final cz c() {
        return this.f21614f;
    }

    public final Float d() {
        return this.f21616h;
    }

    public final Float e() {
        return this.f21621m;
    }

    public final Float f() {
        return this.f21620l;
    }

    public final String g() {
        return this.f21618j;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getAdTagUrl() {
        return this.f21609a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getAdsResponse() {
        return this.f21611c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final ContentProgressProvider getContentProgressProvider() {
        return this.f21612d;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getExtraParameter(String str) {
        Map<String, String> map = this.f21610b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final Map<String, String> getExtraParameters() {
        return this.f21610b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final Object getUserRequestContext() {
        return this.f21622n;
    }

    public final String h() {
        return this.f21619k;
    }

    public final List<String> i() {
        return this.f21617i;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdTagUrl(String str) {
        this.f21609a = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdWillAutoPlay(boolean z) {
        this.f21613e = z ? cx.AUTO : cx.CLICK;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdWillPlayMuted(boolean z) {
        this.f21614f = z ? cz.MUTED : cz.UNMUTED;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdsResponse(String str) {
        this.f21611c = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentDuration(float f2) {
        this.f21616h = Float.valueOf(f2);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentKeywords(List<String> list) {
        this.f21617i = list;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentProgressProvider(ContentProgressProvider contentProgressProvider) {
        this.f21612d = contentProgressProvider;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentTitle(String str) {
        this.f21618j = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentUrl(String str) {
        this.f21619k = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContinuousPlayback(boolean z) {
        this.f21615g = z ? cy.ON : cy.OFF;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setExtraParameter(String str, String str2) {
        if (this.f21610b == null) {
            this.f21610b = new HashMap();
        }
        this.f21610b.put(str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setLiveStreamPrefetchSeconds(float f2) {
        this.f21621m = Float.valueOf(f2);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setUserRequestContext(Object obj) {
        this.f21622n = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setVastLoadTimeout(float f2) {
        this.f21620l = Float.valueOf(f2);
    }
}
