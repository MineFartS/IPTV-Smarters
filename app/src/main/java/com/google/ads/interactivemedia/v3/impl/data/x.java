package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.aty;
import com.google.ads.interactivemedia.v3.internal.aud;
import com.google.ads.interactivemedia.v3.internal.cs;
import com.google.ads.interactivemedia.v3.internal.cx;
import com.google.ads.interactivemedia.v3.internal.cy;
import com.google.ads.interactivemedia.v3.internal.cz;
import com.google.ads.interactivemedia.v3.internal.fo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x implements ax {
    private aud<String, String> adTagParameters;
    private String adTagUrl;
    private String adsResponse;
    private String apiKey;
    private String assetKey;
    private String authToken;
    private aud<String, String> companionSlots;
    private at consentSettings;
    private Float contentDuration;
    private aty<String> contentKeywords;
    private String contentSourceId;
    private String contentTitle;
    private String contentUrl;
    private String customAssetKey;
    private String env;
    private aud<String, String> extraParameters;
    private String format;
    private fo identifierInfo;
    private Boolean isTv;
    private Integer linearAdSlotHeight;
    private Integer linearAdSlotWidth;
    private String liveStreamEventId;
    private Float liveStreamPrefetchSeconds;
    private cs marketAppInfo;
    private String msParameter;
    private String network;
    private String networkCode;
    private String oAuthToken;
    private Boolean omidAdSessionsOnStartedOnly;
    private String projectNumber;
    private String region;
    private ImaSdkSettings settings;
    private String streamActivityMonitorId;
    private Boolean supportsExternalNavigation;
    private Boolean supportsIconClickFallback;
    private Boolean supportsNativeNetworking;
    private Boolean supportsResizing;
    private Boolean useQAStreamBaseUrl;
    private Boolean usesCustomVideoPlayback;
    private Float vastLoadTimeout;
    private cy videoContinuousPlay;
    private String videoId;
    private cx videoPlayActivation;
    private cz videoPlayMuted;

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax adTagParameters(Map<String, String> map) {
        this.adTagParameters = map == null ? null : aud.d(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax adTagUrl(String str) {
        this.adTagUrl = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax adsResponse(String str) {
        this.adsResponse = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax apiKey(String str) {
        this.apiKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax assetKey(String str) {
        this.assetKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax authToken(String str) {
        this.authToken = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ay build() {
        return new y(this.adTagUrl, this.adTagParameters, this.adsResponse, this.apiKey, this.assetKey, this.authToken, this.companionSlots, this.contentDuration, this.contentKeywords, this.contentTitle, this.contentUrl, this.contentSourceId, this.consentSettings, this.customAssetKey, this.env, this.extraParameters, this.format, this.identifierInfo, this.isTv, this.linearAdSlotWidth, this.linearAdSlotHeight, this.liveStreamEventId, this.liveStreamPrefetchSeconds, this.marketAppInfo, this.msParameter, this.network, this.networkCode, this.oAuthToken, this.omidAdSessionsOnStartedOnly, this.projectNumber, this.region, this.settings, this.supportsExternalNavigation, this.supportsIconClickFallback, this.supportsNativeNetworking, this.streamActivityMonitorId, this.supportsResizing, this.useQAStreamBaseUrl, this.usesCustomVideoPlayback, this.vastLoadTimeout, this.videoId, this.videoPlayActivation, this.videoContinuousPlay, this.videoPlayMuted);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax companionSlots(Map<String, String> map) {
        this.companionSlots = map == null ? null : aud.d(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax consentSettings(at atVar) {
        this.consentSettings = atVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax contentDuration(Float f2) {
        this.contentDuration = f2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax contentKeywords(List<String> list) {
        this.contentKeywords = list == null ? null : aty.l(list);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax contentSourceId(String str) {
        this.contentSourceId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax contentTitle(String str) {
        this.contentTitle = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax contentUrl(String str) {
        this.contentUrl = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax customAssetKey(String str) {
        this.customAssetKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax env(String str) {
        this.env = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax extraParameters(Map<String, String> map) {
        this.extraParameters = map == null ? null : aud.d(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax format(String str) {
        this.format = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax identifierInfo(fo foVar) {
        this.identifierInfo = foVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax isTv(Boolean bool) {
        this.isTv = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax linearAdSlotHeight(Integer num) {
        this.linearAdSlotHeight = num;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax linearAdSlotWidth(Integer num) {
        this.linearAdSlotWidth = num;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax liveStreamEventId(String str) {
        this.liveStreamEventId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax liveStreamPrefetchSeconds(Float f2) {
        this.liveStreamPrefetchSeconds = f2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax marketAppInfo(cs csVar) {
        this.marketAppInfo = csVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax msParameter(String str) {
        this.msParameter = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax network(String str) {
        this.network = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax networkCode(String str) {
        this.networkCode = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax oAuthToken(String str) {
        this.oAuthToken = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax omidAdSessionsOnStartedOnly(Boolean bool) {
        this.omidAdSessionsOnStartedOnly = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax projectNumber(String str) {
        this.projectNumber = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax region(String str) {
        this.region = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax settings(ImaSdkSettings imaSdkSettings) {
        this.settings = imaSdkSettings;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax streamActivityMonitorId(String str) {
        this.streamActivityMonitorId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax supportsExternalNavigation(Boolean bool) {
        this.supportsExternalNavigation = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax supportsIconClickFallback(Boolean bool) {
        this.supportsIconClickFallback = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax supportsNativeNetworking(Boolean bool) {
        this.supportsNativeNetworking = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax supportsResizing(Boolean bool) {
        this.supportsResizing = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax useQAStreamBaseUrl(Boolean bool) {
        this.useQAStreamBaseUrl = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax usesCustomVideoPlayback(Boolean bool) {
        this.usesCustomVideoPlayback = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax vastLoadTimeout(Float f2) {
        this.vastLoadTimeout = f2;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax videoContinuousPlay(cy cyVar) {
        this.videoContinuousPlay = cyVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax videoId(String str) {
        this.videoId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax videoPlayActivation(cx cxVar) {
        this.videoPlayActivation = cxVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax videoPlayMuted(cz czVar) {
        this.videoPlayMuted = czVar;
        return this;
    }
}
