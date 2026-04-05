package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.StreamRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ey implements StreamRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f21751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f21752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f21754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f21755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, String> f21756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f21757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f21758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f21759n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f21760o;
    private StreamRequest.StreamFormat p;
    private Boolean q;
    private transient Object r;

    public final void a(String str) {
        this.f21747b = str;
    }

    public final void b(String str) {
        this.f21746a = str;
    }

    public final void c(String str) {
        this.f21748c = str;
    }

    public final void d(String str) {
        this.f21751f = str;
    }

    public final void e(String str) {
        this.f21752g = str;
    }

    public final void f(String str) {
        this.f21750e = str;
    }

    public final void g(String str) {
        this.f21755j = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Map<String, String> getAdTagParameters() {
        return this.f21756k;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getApiKey() {
        return this.f21747b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getAssetKey() {
        return this.f21746a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getAuthToken() {
        return this.f21759n;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getContentSourceId() {
        return this.f21748c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getContentUrl() {
        return this.f21758m;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getCustomAssetKey() {
        return this.f21751f;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final StreamRequest.StreamFormat getFormat() {
        return this.p;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getLiveStreamEventId() {
        return this.f21752g;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getManifestSuffix() {
        return this.f21757l;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getNetworkCode() {
        return this.f21750e;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getOAuthToken() {
        return this.f21755j;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getProjectNumber() {
        return this.f21754i;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getRegion() {
        return this.f21753h;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getStreamActivityMonitorId() {
        return this.f21760o;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Boolean getUseQAStreamBaseUrl() {
        return this.q;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Object getUserRequestContext() {
        return this.r;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getVideoId() {
        return this.f21749d;
    }

    public final void h(String str) {
        this.f21754i = str;
    }

    public final void i(String str) {
        this.f21753h = str;
    }

    public final void j(String str) {
        this.f21749d = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setAdTagParameters(Map<String, String> map) {
        this.f21756k = map;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setAuthToken(String str) {
        this.f21759n = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setContentUrl(String str) {
        this.f21758m = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setFormat(StreamRequest.StreamFormat streamFormat) {
        this.p = streamFormat;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setManifestSuffix(String str) {
        this.f21757l = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setStreamActivityMonitorId(String str) {
        this.f21760o = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setUseQAStreamBaseUrl(Boolean bool) {
        this.q = bool;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setUserRequestContext(Object obj) {
        this.r = obj;
    }
}
