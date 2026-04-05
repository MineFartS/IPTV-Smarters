package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.aty;
import com.google.ads.interactivemedia.v3.internal.aud;
import com.google.ads.interactivemedia.v3.internal.cs;
import com.google.ads.interactivemedia.v3.internal.cx;
import com.google.ads.interactivemedia.v3.internal.cy;
import com.google.ads.interactivemedia.v3.internal.cz;
import com.google.ads.interactivemedia.v3.internal.fo;

/* JADX INFO: loaded from: classes.dex */
public final class y extends ay {
    private final aud<String, String> adTagParameters;
    private final String adTagUrl;
    private final String adsResponse;
    private final String apiKey;
    private final String assetKey;
    private final String authToken;
    private final aud<String, String> companionSlots;
    private final at consentSettings;
    private final Float contentDuration;
    private final aty<String> contentKeywords;
    private final String contentSourceId;
    private final String contentTitle;
    private final String contentUrl;
    private final String customAssetKey;
    private final String env;
    private final aud<String, String> extraParameters;
    private final String format;
    private final fo identifierInfo;
    private final Boolean isTv;
    private final Integer linearAdSlotHeight;
    private final Integer linearAdSlotWidth;
    private final String liveStreamEventId;
    private final Float liveStreamPrefetchSeconds;
    private final cs marketAppInfo;
    private final String msParameter;
    private final String network;
    private final String networkCode;
    private final String oAuthToken;
    private final Boolean omidAdSessionsOnStartedOnly;
    private final String projectNumber;
    private final String region;
    private final ImaSdkSettings settings;
    private final String streamActivityMonitorId;
    private final Boolean supportsExternalNavigation;
    private final Boolean supportsIconClickFallback;
    private final Boolean supportsNativeNetworking;
    private final Boolean supportsResizing;
    private final Boolean useQAStreamBaseUrl;
    private final Boolean usesCustomVideoPlayback;
    private final Float vastLoadTimeout;
    private final cy videoContinuousPlay;
    private final String videoId;
    private final cx videoPlayActivation;
    private final cz videoPlayMuted;

    private y(String str, aud<String, String> audVar, String str2, String str3, String str4, String str5, aud<String, String> audVar2, Float f2, aty<String> atyVar, String str6, String str7, String str8, at atVar, String str9, String str10, aud<String, String> audVar3, String str11, fo foVar, Boolean bool, Integer num, Integer num2, String str12, Float f3, cs csVar, String str13, String str14, String str15, String str16, Boolean bool2, String str17, String str18, ImaSdkSettings imaSdkSettings, Boolean bool3, Boolean bool4, Boolean bool5, String str19, Boolean bool6, Boolean bool7, Boolean bool8, Float f4, String str20, cx cxVar, cy cyVar, cz czVar) {
        this.adTagUrl = str;
        this.adTagParameters = audVar;
        this.adsResponse = str2;
        this.apiKey = str3;
        this.assetKey = str4;
        this.authToken = str5;
        this.companionSlots = audVar2;
        this.contentDuration = f2;
        this.contentKeywords = atyVar;
        this.contentTitle = str6;
        this.contentUrl = str7;
        this.contentSourceId = str8;
        this.consentSettings = atVar;
        this.customAssetKey = str9;
        this.env = str10;
        this.extraParameters = audVar3;
        this.format = str11;
        this.identifierInfo = foVar;
        this.isTv = bool;
        this.linearAdSlotWidth = num;
        this.linearAdSlotHeight = num2;
        this.liveStreamEventId = str12;
        this.liveStreamPrefetchSeconds = f3;
        this.marketAppInfo = csVar;
        this.msParameter = str13;
        this.network = str14;
        this.networkCode = str15;
        this.oAuthToken = str16;
        this.omidAdSessionsOnStartedOnly = bool2;
        this.projectNumber = str17;
        this.region = str18;
        this.settings = imaSdkSettings;
        this.supportsExternalNavigation = bool3;
        this.supportsIconClickFallback = bool4;
        this.supportsNativeNetworking = bool5;
        this.streamActivityMonitorId = str19;
        this.supportsResizing = bool6;
        this.useQAStreamBaseUrl = bool7;
        this.usesCustomVideoPlayback = bool8;
        this.vastLoadTimeout = f4;
        this.videoId = str20;
        this.videoPlayActivation = cxVar;
        this.videoContinuousPlay = cyVar;
        this.videoPlayMuted = czVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public aud<String, String> adTagParameters() {
        return this.adTagParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String adTagUrl() {
        return this.adTagUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String adsResponse() {
        return this.adsResponse;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String apiKey() {
        return this.apiKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String assetKey() {
        return this.assetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String authToken() {
        return this.authToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public aud<String, String> companionSlots() {
        return this.companionSlots;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public at consentSettings() {
        return this.consentSettings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Float contentDuration() {
        return this.contentDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public aty<String> contentKeywords() {
        return this.contentKeywords;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String contentSourceId() {
        return this.contentSourceId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String contentTitle() {
        return this.contentTitle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String contentUrl() {
        return this.contentUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String customAssetKey() {
        return this.customAssetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String env() {
        return this.env;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ay) {
            ay ayVar = (ay) obj;
            String str = this.adTagUrl;
            if (str != null ? str.equals(ayVar.adTagUrl()) : ayVar.adTagUrl() == null) {
                aud<String, String> audVar = this.adTagParameters;
                if (audVar != null ? audVar.equals(ayVar.adTagParameters()) : ayVar.adTagParameters() == null) {
                    String str2 = this.adsResponse;
                    if (str2 != null ? str2.equals(ayVar.adsResponse()) : ayVar.adsResponse() == null) {
                        String str3 = this.apiKey;
                        if (str3 != null ? str3.equals(ayVar.apiKey()) : ayVar.apiKey() == null) {
                            String str4 = this.assetKey;
                            if (str4 != null ? str4.equals(ayVar.assetKey()) : ayVar.assetKey() == null) {
                                String str5 = this.authToken;
                                if (str5 != null ? str5.equals(ayVar.authToken()) : ayVar.authToken() == null) {
                                    aud<String, String> audVar2 = this.companionSlots;
                                    if (audVar2 != null ? audVar2.equals(ayVar.companionSlots()) : ayVar.companionSlots() == null) {
                                        Float f2 = this.contentDuration;
                                        if (f2 != null ? f2.equals(ayVar.contentDuration()) : ayVar.contentDuration() == null) {
                                            aty<String> atyVar = this.contentKeywords;
                                            if (atyVar != null ? atyVar.equals(ayVar.contentKeywords()) : ayVar.contentKeywords() == null) {
                                                String str6 = this.contentTitle;
                                                if (str6 != null ? str6.equals(ayVar.contentTitle()) : ayVar.contentTitle() == null) {
                                                    String str7 = this.contentUrl;
                                                    if (str7 != null ? str7.equals(ayVar.contentUrl()) : ayVar.contentUrl() == null) {
                                                        String str8 = this.contentSourceId;
                                                        if (str8 != null ? str8.equals(ayVar.contentSourceId()) : ayVar.contentSourceId() == null) {
                                                            at atVar = this.consentSettings;
                                                            if (atVar != null ? atVar.equals(ayVar.consentSettings()) : ayVar.consentSettings() == null) {
                                                                String str9 = this.customAssetKey;
                                                                if (str9 != null ? str9.equals(ayVar.customAssetKey()) : ayVar.customAssetKey() == null) {
                                                                    String str10 = this.env;
                                                                    if (str10 != null ? str10.equals(ayVar.env()) : ayVar.env() == null) {
                                                                        aud<String, String> audVar3 = this.extraParameters;
                                                                        if (audVar3 != null ? audVar3.equals(ayVar.extraParameters()) : ayVar.extraParameters() == null) {
                                                                            String str11 = this.format;
                                                                            if (str11 != null ? str11.equals(ayVar.format()) : ayVar.format() == null) {
                                                                                fo foVar = this.identifierInfo;
                                                                                if (foVar != null ? foVar.equals(ayVar.identifierInfo()) : ayVar.identifierInfo() == null) {
                                                                                    Boolean bool = this.isTv;
                                                                                    if (bool != null ? bool.equals(ayVar.isTv()) : ayVar.isTv() == null) {
                                                                                        Integer num = this.linearAdSlotWidth;
                                                                                        if (num != null ? num.equals(ayVar.linearAdSlotWidth()) : ayVar.linearAdSlotWidth() == null) {
                                                                                            Integer num2 = this.linearAdSlotHeight;
                                                                                            if (num2 != null ? num2.equals(ayVar.linearAdSlotHeight()) : ayVar.linearAdSlotHeight() == null) {
                                                                                                String str12 = this.liveStreamEventId;
                                                                                                if (str12 != null ? str12.equals(ayVar.liveStreamEventId()) : ayVar.liveStreamEventId() == null) {
                                                                                                    Float f3 = this.liveStreamPrefetchSeconds;
                                                                                                    if (f3 != null ? f3.equals(ayVar.liveStreamPrefetchSeconds()) : ayVar.liveStreamPrefetchSeconds() == null) {
                                                                                                        cs csVar = this.marketAppInfo;
                                                                                                        if (csVar != null ? csVar.equals(ayVar.marketAppInfo()) : ayVar.marketAppInfo() == null) {
                                                                                                            String str13 = this.msParameter;
                                                                                                            if (str13 != null ? str13.equals(ayVar.msParameter()) : ayVar.msParameter() == null) {
                                                                                                                String str14 = this.network;
                                                                                                                if (str14 != null ? str14.equals(ayVar.network()) : ayVar.network() == null) {
                                                                                                                    String str15 = this.networkCode;
                                                                                                                    if (str15 != null ? str15.equals(ayVar.networkCode()) : ayVar.networkCode() == null) {
                                                                                                                        String str16 = this.oAuthToken;
                                                                                                                        if (str16 != null ? str16.equals(ayVar.oAuthToken()) : ayVar.oAuthToken() == null) {
                                                                                                                            Boolean bool2 = this.omidAdSessionsOnStartedOnly;
                                                                                                                            if (bool2 != null ? bool2.equals(ayVar.omidAdSessionsOnStartedOnly()) : ayVar.omidAdSessionsOnStartedOnly() == null) {
                                                                                                                                String str17 = this.projectNumber;
                                                                                                                                if (str17 != null ? str17.equals(ayVar.projectNumber()) : ayVar.projectNumber() == null) {
                                                                                                                                    String str18 = this.region;
                                                                                                                                    if (str18 != null ? str18.equals(ayVar.region()) : ayVar.region() == null) {
                                                                                                                                        ImaSdkSettings imaSdkSettings = this.settings;
                                                                                                                                        if (imaSdkSettings != null ? imaSdkSettings.equals(ayVar.settings()) : ayVar.settings() == null) {
                                                                                                                                            Boolean bool3 = this.supportsExternalNavigation;
                                                                                                                                            if (bool3 != null ? bool3.equals(ayVar.supportsExternalNavigation()) : ayVar.supportsExternalNavigation() == null) {
                                                                                                                                                Boolean bool4 = this.supportsIconClickFallback;
                                                                                                                                                if (bool4 != null ? bool4.equals(ayVar.supportsIconClickFallback()) : ayVar.supportsIconClickFallback() == null) {
                                                                                                                                                    Boolean bool5 = this.supportsNativeNetworking;
                                                                                                                                                    if (bool5 != null ? bool5.equals(ayVar.supportsNativeNetworking()) : ayVar.supportsNativeNetworking() == null) {
                                                                                                                                                        String str19 = this.streamActivityMonitorId;
                                                                                                                                                        if (str19 != null ? str19.equals(ayVar.streamActivityMonitorId()) : ayVar.streamActivityMonitorId() == null) {
                                                                                                                                                            Boolean bool6 = this.supportsResizing;
                                                                                                                                                            if (bool6 != null ? bool6.equals(ayVar.supportsResizing()) : ayVar.supportsResizing() == null) {
                                                                                                                                                                Boolean bool7 = this.useQAStreamBaseUrl;
                                                                                                                                                                if (bool7 != null ? bool7.equals(ayVar.useQAStreamBaseUrl()) : ayVar.useQAStreamBaseUrl() == null) {
                                                                                                                                                                    Boolean bool8 = this.usesCustomVideoPlayback;
                                                                                                                                                                    if (bool8 != null ? bool8.equals(ayVar.usesCustomVideoPlayback()) : ayVar.usesCustomVideoPlayback() == null) {
                                                                                                                                                                        Float f4 = this.vastLoadTimeout;
                                                                                                                                                                        if (f4 != null ? f4.equals(ayVar.vastLoadTimeout()) : ayVar.vastLoadTimeout() == null) {
                                                                                                                                                                            String str20 = this.videoId;
                                                                                                                                                                            if (str20 != null ? str20.equals(ayVar.videoId()) : ayVar.videoId() == null) {
                                                                                                                                                                                cx cxVar = this.videoPlayActivation;
                                                                                                                                                                                if (cxVar != null ? cxVar.equals(ayVar.videoPlayActivation()) : ayVar.videoPlayActivation() == null) {
                                                                                                                                                                                    cy cyVar = this.videoContinuousPlay;
                                                                                                                                                                                    if (cyVar != null ? cyVar.equals(ayVar.videoContinuousPlay()) : ayVar.videoContinuousPlay() == null) {
                                                                                                                                                                                        cz czVar = this.videoPlayMuted;
                                                                                                                                                                                        cz czVarVideoPlayMuted = ayVar.videoPlayMuted();
                                                                                                                                                                                        if (czVar != null ? czVar.equals(czVarVideoPlayMuted) : czVarVideoPlayMuted == null) {
                                                                                                                                                                                            return true;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public aud<String, String> extraParameters() {
        return this.extraParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String format() {
        return this.format;
    }

    public int hashCode() {
        String str = this.adTagUrl;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        aud<String, String> audVar = this.adTagParameters;
        int iHashCode2 = (iHashCode ^ (audVar == null ? 0 : audVar.hashCode())) * 1000003;
        String str2 = this.adsResponse;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.apiKey;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.assetKey;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.authToken;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        aud<String, String> audVar2 = this.companionSlots;
        int iHashCode7 = (iHashCode6 ^ (audVar2 == null ? 0 : audVar2.hashCode())) * 1000003;
        Float f2 = this.contentDuration;
        int iHashCode8 = (iHashCode7 ^ (f2 == null ? 0 : f2.hashCode())) * 1000003;
        aty<String> atyVar = this.contentKeywords;
        int iHashCode9 = (iHashCode8 ^ (atyVar == null ? 0 : atyVar.hashCode())) * 1000003;
        String str6 = this.contentTitle;
        int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.contentUrl;
        int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.contentSourceId;
        int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        at atVar = this.consentSettings;
        int iHashCode13 = (iHashCode12 ^ (atVar == null ? 0 : atVar.hashCode())) * 1000003;
        String str9 = this.customAssetKey;
        int iHashCode14 = (iHashCode13 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.env;
        int iHashCode15 = (iHashCode14 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        aud<String, String> audVar3 = this.extraParameters;
        int iHashCode16 = (iHashCode15 ^ (audVar3 == null ? 0 : audVar3.hashCode())) * 1000003;
        String str11 = this.format;
        int iHashCode17 = (iHashCode16 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        fo foVar = this.identifierInfo;
        int iHashCode18 = (iHashCode17 ^ (foVar == null ? 0 : foVar.hashCode())) * 1000003;
        Boolean bool = this.isTv;
        int iHashCode19 = (iHashCode18 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Integer num = this.linearAdSlotWidth;
        int iHashCode20 = (iHashCode19 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.linearAdSlotHeight;
        int iHashCode21 = (iHashCode20 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str12 = this.liveStreamEventId;
        int iHashCode22 = (iHashCode21 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        Float f3 = this.liveStreamPrefetchSeconds;
        int iHashCode23 = (iHashCode22 ^ (f3 == null ? 0 : f3.hashCode())) * 1000003;
        cs csVar = this.marketAppInfo;
        int iHashCode24 = (iHashCode23 ^ (csVar == null ? 0 : csVar.hashCode())) * 1000003;
        String str13 = this.msParameter;
        int iHashCode25 = (iHashCode24 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        String str14 = this.network;
        int iHashCode26 = (iHashCode25 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        String str15 = this.networkCode;
        int iHashCode27 = (iHashCode26 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        String str16 = this.oAuthToken;
        int iHashCode28 = (iHashCode27 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        Boolean bool2 = this.omidAdSessionsOnStartedOnly;
        int iHashCode29 = (iHashCode28 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        String str17 = this.projectNumber;
        int iHashCode30 = (iHashCode29 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
        String str18 = this.region;
        int iHashCode31 = (iHashCode30 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
        ImaSdkSettings imaSdkSettings = this.settings;
        int iHashCode32 = (iHashCode31 ^ (imaSdkSettings == null ? 0 : imaSdkSettings.hashCode())) * 1000003;
        Boolean bool3 = this.supportsExternalNavigation;
        int iHashCode33 = (iHashCode32 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Boolean bool4 = this.supportsIconClickFallback;
        int iHashCode34 = (iHashCode33 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.supportsNativeNetworking;
        int iHashCode35 = (iHashCode34 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        String str19 = this.streamActivityMonitorId;
        int iHashCode36 = (iHashCode35 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
        Boolean bool6 = this.supportsResizing;
        int iHashCode37 = (iHashCode36 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
        Boolean bool7 = this.useQAStreamBaseUrl;
        int iHashCode38 = (iHashCode37 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
        Boolean bool8 = this.usesCustomVideoPlayback;
        int iHashCode39 = (iHashCode38 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
        Float f4 = this.vastLoadTimeout;
        int iHashCode40 = (iHashCode39 ^ (f4 == null ? 0 : f4.hashCode())) * 1000003;
        String str20 = this.videoId;
        int iHashCode41 = (iHashCode40 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
        cx cxVar = this.videoPlayActivation;
        int iHashCode42 = (iHashCode41 ^ (cxVar == null ? 0 : cxVar.hashCode())) * 1000003;
        cy cyVar = this.videoContinuousPlay;
        int iHashCode43 = (iHashCode42 ^ (cyVar == null ? 0 : cyVar.hashCode())) * 1000003;
        cz czVar = this.videoPlayMuted;
        return iHashCode43 ^ (czVar != null ? czVar.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public fo identifierInfo() {
        return this.identifierInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Boolean isTv() {
        return this.isTv;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Integer linearAdSlotHeight() {
        return this.linearAdSlotHeight;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Integer linearAdSlotWidth() {
        return this.linearAdSlotWidth;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String liveStreamEventId() {
        return this.liveStreamEventId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Float liveStreamPrefetchSeconds() {
        return this.liveStreamPrefetchSeconds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public cs marketAppInfo() {
        return this.marketAppInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String msParameter() {
        return this.msParameter;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String network() {
        return this.network;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String networkCode() {
        return this.networkCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String oAuthToken() {
        return this.oAuthToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Boolean omidAdSessionsOnStartedOnly() {
        return this.omidAdSessionsOnStartedOnly;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String projectNumber() {
        return this.projectNumber;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String region() {
        return this.region;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public ImaSdkSettings settings() {
        return this.settings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String streamActivityMonitorId() {
        return this.streamActivityMonitorId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Boolean supportsExternalNavigation() {
        return this.supportsExternalNavigation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Boolean supportsIconClickFallback() {
        return this.supportsIconClickFallback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Boolean supportsNativeNetworking() {
        return this.supportsNativeNetworking;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Boolean supportsResizing() {
        return this.supportsResizing;
    }

    public String toString() {
        String str = this.adTagUrl;
        String strValueOf = String.valueOf(this.adTagParameters);
        String str2 = this.adsResponse;
        String str3 = this.apiKey;
        String str4 = this.assetKey;
        String str5 = this.authToken;
        String strValueOf2 = String.valueOf(this.companionSlots);
        String strValueOf3 = String.valueOf(this.contentDuration);
        String strValueOf4 = String.valueOf(this.contentKeywords);
        String str6 = this.contentTitle;
        String str7 = this.contentUrl;
        String str8 = this.contentSourceId;
        String strValueOf5 = String.valueOf(this.consentSettings);
        String str9 = this.customAssetKey;
        String str10 = this.env;
        String strValueOf6 = String.valueOf(this.extraParameters);
        String str11 = this.format;
        String strValueOf7 = String.valueOf(this.identifierInfo);
        String strValueOf8 = String.valueOf(this.isTv);
        String strValueOf9 = String.valueOf(this.linearAdSlotWidth);
        String strValueOf10 = String.valueOf(this.linearAdSlotHeight);
        String str12 = this.liveStreamEventId;
        String strValueOf11 = String.valueOf(this.liveStreamPrefetchSeconds);
        String strValueOf12 = String.valueOf(this.marketAppInfo);
        String str13 = this.msParameter;
        String str14 = this.network;
        String str15 = this.networkCode;
        String str16 = this.oAuthToken;
        String strValueOf13 = String.valueOf(this.omidAdSessionsOnStartedOnly);
        String str17 = this.projectNumber;
        String str18 = this.region;
        String strValueOf14 = String.valueOf(this.settings);
        String strValueOf15 = String.valueOf(this.supportsExternalNavigation);
        String strValueOf16 = String.valueOf(this.supportsIconClickFallback);
        String strValueOf17 = String.valueOf(this.supportsNativeNetworking);
        String str19 = this.streamActivityMonitorId;
        String strValueOf18 = String.valueOf(this.supportsResizing);
        String strValueOf19 = String.valueOf(this.useQAStreamBaseUrl);
        String strValueOf20 = String.valueOf(this.usesCustomVideoPlayback);
        String strValueOf21 = String.valueOf(this.vastLoadTimeout);
        String str20 = this.videoId;
        String strValueOf22 = String.valueOf(this.videoPlayActivation);
        String strValueOf23 = String.valueOf(this.videoContinuousPlay);
        String strValueOf24 = String.valueOf(this.videoPlayMuted);
        int length = String.valueOf(str).length() + 767 + strValueOf.length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + strValueOf2.length() + strValueOf3.length() + strValueOf4.length() + String.valueOf(str6).length();
        int length2 = String.valueOf(str7).length();
        int length3 = String.valueOf(str8).length();
        int length4 = strValueOf5.length();
        int length5 = String.valueOf(str9).length();
        int length6 = String.valueOf(str10).length();
        int length7 = strValueOf6.length();
        int length8 = String.valueOf(str11).length();
        int length9 = strValueOf7.length();
        int length10 = strValueOf8.length();
        int length11 = strValueOf9.length();
        int length12 = strValueOf10.length();
        int length13 = String.valueOf(str12).length();
        int length14 = strValueOf11.length();
        int length15 = strValueOf12.length();
        int length16 = String.valueOf(str13).length();
        int length17 = String.valueOf(str14).length();
        int length18 = String.valueOf(str15).length();
        int length19 = String.valueOf(str16).length();
        int length20 = strValueOf13.length();
        int length21 = String.valueOf(str17).length();
        int length22 = String.valueOf(str18).length();
        int length23 = strValueOf14.length();
        int length24 = strValueOf15.length();
        int length25 = strValueOf16.length();
        int length26 = strValueOf17.length();
        int length27 = String.valueOf(str19).length();
        int length28 = strValueOf18.length();
        int length29 = strValueOf19.length();
        int length30 = strValueOf20.length();
        int length31 = strValueOf21.length();
        int length32 = String.valueOf(str20).length();
        int length33 = strValueOf22.length();
        StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + length19 + length20 + length21 + length22 + length23 + length24 + length25 + length26 + length27 + length28 + length29 + length30 + length31 + length32 + length33 + strValueOf23.length() + strValueOf24.length());
        sb.append("GsonAdsRequest{adTagUrl=");
        sb.append(str);
        sb.append(", adTagParameters=");
        sb.append(strValueOf);
        sb.append(", adsResponse=");
        sb.append(str2);
        sb.append(", apiKey=");
        sb.append(str3);
        sb.append(", assetKey=");
        sb.append(str4);
        sb.append(", authToken=");
        sb.append(str5);
        sb.append(", companionSlots=");
        sb.append(strValueOf2);
        sb.append(", contentDuration=");
        sb.append(strValueOf3);
        sb.append(", contentKeywords=");
        sb.append(strValueOf4);
        sb.append(", contentTitle=");
        sb.append(str6);
        sb.append(", contentUrl=");
        sb.append(str7);
        sb.append(", contentSourceId=");
        sb.append(str8);
        sb.append(", consentSettings=");
        sb.append(strValueOf5);
        sb.append(", customAssetKey=");
        sb.append(str9);
        sb.append(", env=");
        sb.append(str10);
        sb.append(", extraParameters=");
        sb.append(strValueOf6);
        sb.append(", format=");
        sb.append(str11);
        sb.append(", identifierInfo=");
        sb.append(strValueOf7);
        sb.append(", isTv=");
        sb.append(strValueOf8);
        sb.append(", linearAdSlotWidth=");
        sb.append(strValueOf9);
        sb.append(", linearAdSlotHeight=");
        sb.append(strValueOf10);
        sb.append(", liveStreamEventId=");
        sb.append(str12);
        sb.append(", liveStreamPrefetchSeconds=");
        sb.append(strValueOf11);
        sb.append(", marketAppInfo=");
        sb.append(strValueOf12);
        sb.append(", msParameter=");
        sb.append(str13);
        sb.append(", network=");
        sb.append(str14);
        sb.append(", networkCode=");
        sb.append(str15);
        sb.append(", oAuthToken=");
        sb.append(str16);
        sb.append(", omidAdSessionsOnStartedOnly=");
        sb.append(strValueOf13);
        sb.append(", projectNumber=");
        sb.append(str17);
        sb.append(", region=");
        sb.append(str18);
        sb.append(", settings=");
        sb.append(strValueOf14);
        sb.append(", supportsExternalNavigation=");
        sb.append(strValueOf15);
        sb.append(", supportsIconClickFallback=");
        sb.append(strValueOf16);
        sb.append(", supportsNativeNetworking=");
        sb.append(strValueOf17);
        sb.append(", streamActivityMonitorId=");
        sb.append(str19);
        sb.append(", supportsResizing=");
        sb.append(strValueOf18);
        sb.append(", useQAStreamBaseUrl=");
        sb.append(strValueOf19);
        sb.append(", usesCustomVideoPlayback=");
        sb.append(strValueOf20);
        sb.append(", vastLoadTimeout=");
        sb.append(strValueOf21);
        sb.append(", videoId=");
        sb.append(str20);
        sb.append(", videoPlayActivation=");
        sb.append(strValueOf22);
        sb.append(", videoContinuousPlay=");
        sb.append(strValueOf23);
        sb.append(", videoPlayMuted=");
        sb.append(strValueOf24);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Boolean useQAStreamBaseUrl() {
        return this.useQAStreamBaseUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Boolean usesCustomVideoPlayback() {
        return this.usesCustomVideoPlayback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public Float vastLoadTimeout() {
        return this.vastLoadTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public cy videoContinuousPlay() {
        return this.videoContinuousPlay;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public String videoId() {
        return this.videoId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public cx videoPlayActivation() {
        return this.videoPlayActivation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public cz videoPlayMuted() {
        return this.videoPlayMuted;
    }
}
