package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.cs;
import com.google.ads.interactivemedia.v3.internal.cx;
import com.google.ads.interactivemedia.v3.internal.cy;
import com.google.ads.interactivemedia.v3.internal.cz;
import com.google.ads.interactivemedia.v3.internal.fo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface ax {
    ax adTagParameters(Map<String, String> map);

    ax adTagUrl(String str);

    ax adsResponse(String str);

    ax apiKey(String str);

    ax assetKey(String str);

    ax authToken(String str);

    ay build();

    ax companionSlots(Map<String, String> map);

    ax consentSettings(at atVar);

    ax contentDuration(Float f2);

    ax contentKeywords(List<String> list);

    ax contentSourceId(String str);

    ax contentTitle(String str);

    ax contentUrl(String str);

    ax customAssetKey(String str);

    ax env(String str);

    ax extraParameters(Map<String, String> map);

    ax format(String str);

    ax identifierInfo(fo foVar);

    ax isTv(Boolean bool);

    ax linearAdSlotHeight(Integer num);

    ax linearAdSlotWidth(Integer num);

    ax liveStreamEventId(String str);

    ax liveStreamPrefetchSeconds(Float f2);

    ax marketAppInfo(cs csVar);

    ax msParameter(String str);

    ax network(String str);

    ax networkCode(String str);

    ax oAuthToken(String str);

    ax omidAdSessionsOnStartedOnly(Boolean bool);

    ax projectNumber(String str);

    ax region(String str);

    ax settings(ImaSdkSettings imaSdkSettings);

    ax streamActivityMonitorId(String str);

    ax supportsExternalNavigation(Boolean bool);

    ax supportsIconClickFallback(Boolean bool);

    ax supportsNativeNetworking(Boolean bool);

    ax supportsResizing(Boolean bool);

    ax useQAStreamBaseUrl(Boolean bool);

    ax usesCustomVideoPlayback(Boolean bool);

    ax vastLoadTimeout(Float f2);

    ax videoContinuousPlay(cy cyVar);

    ax videoId(String str);

    ax videoPlayActivation(cx cxVar);

    ax videoPlayMuted(cz czVar);
}
