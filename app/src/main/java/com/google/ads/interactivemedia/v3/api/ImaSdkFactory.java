package com.google.ads.interactivemedia.v3.api;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.v3.impl.data.av;
import com.google.ads.interactivemedia.v3.impl.data.aw;
import com.google.ads.interactivemedia.v3.impl.data.g;
import com.google.ads.interactivemedia.v3.internal.Cdo;
import com.google.ads.interactivemedia.v3.internal.ars;
import com.google.ads.interactivemedia.v3.internal.ci;
import com.google.ads.interactivemedia.v3.internal.cu;
import com.google.ads.interactivemedia.v3.internal.da;
import com.google.ads.interactivemedia.v3.internal.dh;
import com.google.ads.interactivemedia.v3.internal.dp;
import com.google.ads.interactivemedia.v3.internal.ew;
import com.google.ads.interactivemedia.v3.internal.ey;
import com.google.ads.interactivemedia.v3.internal.fi;

/* JADX INFO: loaded from: classes.dex */
public class ImaSdkFactory {
    private static ImaSdkFactory instance;

    private ImaSdkFactory() {
    }

    public static AdDisplayContainer createAdDisplayContainer(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
        ars.g(viewGroup);
        ars.g(videoAdPlayer);
        return new ci(viewGroup, videoAdPlayer);
    }

    private AdsLoader createAdsLoader(Context context, Uri uri, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, AdDisplayContainer adDisplayContainer) {
        cu cuVar = new cu(context, uri, imaSdkSettings, adDisplayContainer, testingConfiguration);
        cuVar.p();
        return cuVar;
    }

    private AdsLoader createAdsLoader(Context context, Uri uri, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, StreamDisplayContainer streamDisplayContainer) {
        cu cuVar = new cu(context, uri, imaSdkSettings, streamDisplayContainer, testingConfiguration);
        cuVar.p();
        return cuVar;
    }

    private AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, AdDisplayContainer adDisplayContainer) {
        return createAdsLoader(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, testingConfiguration, adDisplayContainer);
    }

    private AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, StreamDisplayContainer streamDisplayContainer) {
        return createAdsLoader(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, testingConfiguration, streamDisplayContainer);
    }

    public static AdDisplayContainer createAudioAdDisplayContainer(Context context, VideoAdPlayer videoAdPlayer) {
        ars.g(context);
        ars.g(videoAdPlayer);
        return new ci(context, videoAdPlayer);
    }

    @Deprecated
    public static VideoAdPlayer createSdkOwnedPlayer(Context context, ViewGroup viewGroup) {
        ars.g(context);
        ars.g(viewGroup);
        return new fi(context, viewGroup);
    }

    public static StreamDisplayContainer createStreamDisplayContainer(ViewGroup viewGroup, VideoStreamPlayer videoStreamPlayer) {
        ars.g(viewGroup);
        ars.g(videoStreamPlayer);
        return new ew(viewGroup, videoStreamPlayer);
    }

    public static ImaSdkFactory getInstance() {
        if (instance == null) {
            instance = new ImaSdkFactory();
        }
        return instance;
    }

    private Uri readJsCoreUri(ImaSdkSettings imaSdkSettings) {
        return (imaSdkSettings == null || !imaSdkSettings.isDebugMode()) ? Cdo.f21663a : Cdo.f21664b;
    }

    @Deprecated
    public AdDisplayContainer createAdDisplayContainer() {
        return new ci((ViewGroup) null, (VideoAdPlayer) null);
    }

    public AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
        return new cu(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, adDisplayContainer, (TestingConfiguration) null);
    }

    public AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, StreamDisplayContainer streamDisplayContainer) {
        return new cu(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, streamDisplayContainer, (TestingConfiguration) null);
    }

    public AdsRenderingSettings createAdsRenderingSettings() {
        return new g();
    }

    public AdsRequest createAdsRequest() {
        return new da();
    }

    @Deprecated
    public AdDisplayContainer createAudioAdDisplayContainer(Context context) {
        ars.g(context);
        return new ci(context, (VideoAdPlayer) null);
    }

    public StreamRequest createCloudPodStreamRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        ey eyVar = new ey();
        eyVar.f(str);
        eyVar.d(str2);
        eyVar.a(str3);
        eyVar.e(str4);
        eyVar.i(str5);
        eyVar.h(str6);
        eyVar.g(str7);
        return eyVar;
    }

    public CompanionAdSlot createCompanionAdSlot() {
        return new dh();
    }

    public FriendlyObstruction createFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        av avVarBuilder = aw.builder();
        avVarBuilder.view(view);
        avVarBuilder.purpose(friendlyObstructionPurpose);
        avVarBuilder.detailedReason(str);
        return avVarBuilder.build();
    }

    public ImaSdkSettings createImaSdkSettings() {
        return new dp();
    }

    public StreamRequest createLiveStreamRequest(String str, String str2) {
        ey eyVar = new ey();
        eyVar.b(str);
        eyVar.a(str2);
        return eyVar;
    }

    public StreamRequest createPodStreamRequest(String str, String str2, String str3) {
        ey eyVar = new ey();
        eyVar.f(str);
        eyVar.d(str2);
        eyVar.a(str3);
        return eyVar;
    }

    @Deprecated
    public StreamDisplayContainer createStreamDisplayContainer() {
        return new ew(null, null);
    }

    public StreamRequest createVodStreamRequest(String str, String str2, String str3) {
        ey eyVar = new ey();
        eyVar.c(str);
        eyVar.j(str2);
        eyVar.a(str3);
        return eyVar;
    }
}
