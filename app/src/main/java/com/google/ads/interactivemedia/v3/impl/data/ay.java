package com.google.ads.interactivemedia.v3.impl.data;

import android.os.Build;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.internal.aty;
import com.google.ads.interactivemedia.v3.internal.aub;
import com.google.ads.interactivemedia.v3.internal.aud;
import com.google.ads.interactivemedia.v3.internal.ci;
import com.google.ads.interactivemedia.v3.internal.cs;
import com.google.ads.interactivemedia.v3.internal.cx;
import com.google.ads.interactivemedia.v3.internal.cy;
import com.google.ads.interactivemedia.v3.internal.cz;
import com.google.ads.interactivemedia.v3.internal.da;
import com.google.ads.interactivemedia.v3.internal.df;
import com.google.ads.interactivemedia.v3.internal.ew;
import com.google.ads.interactivemedia.v3.internal.fj;
import com.google.ads.interactivemedia.v3.internal.fo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ay {
    public static ax builder() {
        return new x();
    }

    public static ay create(AdsRequest adsRequest, String str, at atVar, String str2, ImaSdkSettings imaSdkSettings, cs csVar, boolean z, fo foVar, AdDisplayContainer adDisplayContainer) {
        String adTagUrl = adsRequest.getAdTagUrl();
        String adsResponse = adsRequest.getAdsResponse();
        Map<String, String> extraParameters = adsRequest.getExtraParameters();
        da daVar = (da) adsRequest;
        cx cxVarA = daVar.a();
        cz czVarC = daVar.c();
        cy cyVarB = daVar.b();
        Float fD = daVar.d();
        List<String> listI = daVar.i();
        String strG = daVar.g();
        String strH = daVar.h();
        Float f2 = daVar.f();
        Float fE = daVar.e();
        Map<String, String> companionSlots = getCompanionSlots((ci) adDisplayContainer);
        ViewGroup adContainer = adDisplayContainer.getAdContainer();
        ax axVarBuilder = builder();
        axVarBuilder.adTagUrl(adTagUrl);
        axVarBuilder.adsResponse(adsResponse);
        axVarBuilder.companionSlots(companionSlots);
        axVarBuilder.consentSettings(atVar);
        axVarBuilder.contentDuration(fD);
        axVarBuilder.contentKeywords(listI);
        axVarBuilder.contentTitle(strG);
        axVarBuilder.contentUrl(strH);
        axVarBuilder.env(str);
        axVarBuilder.extraParameters(extraParameters);
        axVarBuilder.identifierInfo(foVar);
        Boolean boolValueOf = Boolean.valueOf(z);
        axVarBuilder.isTv(boolValueOf);
        axVarBuilder.linearAdSlotWidth(Integer.valueOf(adContainer.getWidth()));
        axVarBuilder.linearAdSlotHeight(Integer.valueOf(adContainer.getHeight()));
        axVarBuilder.liveStreamPrefetchSeconds(fE);
        axVarBuilder.marketAppInfo(csVar);
        axVarBuilder.network(str2);
        axVarBuilder.omidAdSessionsOnStartedOnly(Boolean.TRUE);
        axVarBuilder.settings(imaSdkSettings);
        axVarBuilder.supportsExternalNavigation(Boolean.valueOf(!z));
        axVarBuilder.supportsIconClickFallback(boolValueOf);
        axVarBuilder.supportsNativeNetworking(Boolean.valueOf(supportsNativeNetworkRequests()));
        axVarBuilder.supportsResizing(Boolean.valueOf(adDisplayContainer.getPlayer() instanceof ResizablePlayer));
        axVarBuilder.usesCustomVideoPlayback(Boolean.valueOf(!(adDisplayContainer.getPlayer() instanceof fj)));
        axVarBuilder.vastLoadTimeout(f2);
        axVarBuilder.videoContinuousPlay(cyVarB);
        axVarBuilder.videoPlayActivation(cxVarA);
        axVarBuilder.videoPlayMuted(czVarC);
        return axVarBuilder.build();
    }

    public static ay createFromStreamRequest(StreamRequest streamRequest, String str, at atVar, String str2, ImaSdkSettings imaSdkSettings, cs csVar, boolean z, String str3, fo foVar, StreamDisplayContainer streamDisplayContainer) {
        Map<String, String> companionSlots = getCompanionSlots((ew) streamDisplayContainer);
        ViewGroup adContainer = streamDisplayContainer.getAdContainer();
        String str4 = streamRequest.getFormat() == StreamRequest.StreamFormat.DASH ? "dash" : "hls";
        ax axVarBuilder = builder();
        axVarBuilder.adTagParameters(streamRequest.getAdTagParameters());
        axVarBuilder.apiKey(streamRequest.getApiKey());
        axVarBuilder.assetKey(streamRequest.getAssetKey());
        axVarBuilder.authToken(streamRequest.getAuthToken());
        axVarBuilder.companionSlots(companionSlots);
        axVarBuilder.consentSettings(atVar);
        axVarBuilder.contentSourceId(streamRequest.getContentSourceId());
        axVarBuilder.contentUrl(streamRequest.getContentUrl());
        axVarBuilder.customAssetKey(streamRequest.getCustomAssetKey());
        axVarBuilder.env(str);
        axVarBuilder.format(str4);
        axVarBuilder.identifierInfo(foVar);
        Boolean boolValueOf = Boolean.valueOf(z);
        axVarBuilder.isTv(boolValueOf);
        axVarBuilder.linearAdSlotWidth(Integer.valueOf(adContainer.getWidth()));
        axVarBuilder.linearAdSlotHeight(Integer.valueOf(adContainer.getHeight()));
        axVarBuilder.liveStreamEventId(streamRequest.getLiveStreamEventId());
        axVarBuilder.marketAppInfo(csVar);
        axVarBuilder.msParameter(str3);
        axVarBuilder.network(str2);
        axVarBuilder.networkCode(streamRequest.getNetworkCode());
        axVarBuilder.oAuthToken(streamRequest.getOAuthToken());
        axVarBuilder.omidAdSessionsOnStartedOnly(Boolean.TRUE);
        axVarBuilder.projectNumber(streamRequest.getProjectNumber());
        axVarBuilder.region(streamRequest.getRegion());
        axVarBuilder.settings(imaSdkSettings);
        axVarBuilder.streamActivityMonitorId(streamRequest.getStreamActivityMonitorId());
        axVarBuilder.supportsExternalNavigation(Boolean.valueOf(!z));
        axVarBuilder.supportsIconClickFallback(boolValueOf);
        axVarBuilder.supportsNativeNetworking(Boolean.valueOf(supportsNativeNetworkRequests()));
        axVarBuilder.supportsResizing(Boolean.valueOf(streamDisplayContainer.getVideoStreamPlayer() instanceof ResizablePlayer));
        axVarBuilder.useQAStreamBaseUrl(streamRequest.getUseQAStreamBaseUrl());
        axVarBuilder.videoId(streamRequest.getVideoId());
        return axVarBuilder.build();
    }

    private static Map<String, String> getCompanionSlots(df dfVar) {
        Map<String, CompanionAdSlot> mapA = dfVar.a();
        if (mapA == null || mapA.isEmpty()) {
            return null;
        }
        aub aubVar = new aub();
        for (String str : ((aud) mapA).keySet()) {
            CompanionAdSlot companionAdSlot = mapA.get(str);
            int width = companionAdSlot.getWidth();
            int height = companionAdSlot.getHeight();
            StringBuilder sb = new StringBuilder(23);
            sb.append(width);
            sb.append("x");
            sb.append(height);
            aubVar.b(str, sb.toString());
        }
        return aubVar.a();
    }

    private static boolean supportsNativeNetworkRequests() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public abstract aud<String, String> adTagParameters();

    public abstract String adTagUrl();

    public abstract String adsResponse();

    public abstract String apiKey();

    public abstract String assetKey();

    public abstract String authToken();

    public abstract aud<String, String> companionSlots();

    public abstract at consentSettings();

    public abstract Float contentDuration();

    public abstract aty<String> contentKeywords();

    public abstract String contentSourceId();

    public abstract String contentTitle();

    public abstract String contentUrl();

    public abstract String customAssetKey();

    public abstract String env();

    public abstract aud<String, String> extraParameters();

    public abstract String format();

    public abstract fo identifierInfo();

    public abstract Boolean isTv();

    public abstract Integer linearAdSlotHeight();

    public abstract Integer linearAdSlotWidth();

    public abstract String liveStreamEventId();

    public abstract Float liveStreamPrefetchSeconds();

    public abstract cs marketAppInfo();

    public abstract String msParameter();

    public abstract String network();

    public abstract String networkCode();

    public abstract String oAuthToken();

    public abstract Boolean omidAdSessionsOnStartedOnly();

    public abstract String projectNumber();

    public abstract String region();

    public abstract ImaSdkSettings settings();

    public abstract String streamActivityMonitorId();

    public abstract Boolean supportsExternalNavigation();

    public abstract Boolean supportsIconClickFallback();

    public abstract Boolean supportsNativeNetworking();

    public abstract Boolean supportsResizing();

    public abstract Boolean useQAStreamBaseUrl();

    public abstract Boolean usesCustomVideoPlayback();

    public abstract Float vastLoadTimeout();

    public abstract cy videoContinuousPlay();

    public abstract String videoId();

    public abstract cx videoPlayActivation();

    public abstract cz videoPlayMuted();
}
