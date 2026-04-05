package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.StrictMode;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class cu implements AdsLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ant f21576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ed f21578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dz f21579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dn f21580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<AdsLoader.AdsLoadedListener> f21581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, AdsRequest> f21582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, StreamRequest> f21583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final es f21584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImaSdkSettings f21585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final TestingConfiguration f21586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final StreamDisplayContainer f21587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AdDisplayContainer f21588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f21589n;

    public cu(Context context, Uri uri, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer, TestingConfiguration testingConfiguration) {
        this(new ed(context, uri, imaSdkSettings, testingConfiguration), context, imaSdkSettings, testingConfiguration, adDisplayContainer, null);
        this.f21578c.j();
    }

    public cu(Context context, Uri uri, ImaSdkSettings imaSdkSettings, StreamDisplayContainer streamDisplayContainer, TestingConfiguration testingConfiguration) {
        this(new ed(context, uri, imaSdkSettings, testingConfiguration), context, imaSdkSettings, testingConfiguration, null, streamDisplayContainer);
        this.f21578c.j();
    }

    private cu(ed edVar, Context context, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, AdDisplayContainer adDisplayContainer, StreamDisplayContainer streamDisplayContainer) {
        this.f21579d = new co(this);
        this.f21580e = new dn();
        this.f21581f = new ArrayList(1);
        this.f21582g = new HashMap();
        this.f21583h = new HashMap();
        this.f21589n = new Object();
        this.f21578c = edVar;
        this.f21577b = context;
        this.f21585j = imaSdkSettings == null ? ImaSdkFactory.getInstance().createImaSdkSettings() : imaSdkSettings;
        this.f21586k = testingConfiguration;
        this.f21588m = adDisplayContainer;
        this.f21587l = streamDisplayContainer;
        es esVar = new es(edVar, context);
        this.f21584i = esVar;
        edVar.g(esVar);
        if (adDisplayContainer != null) {
            adDisplayContainer.claim();
        }
        if (streamDisplayContainer != null) {
            streamDisplayContainer.claim();
        }
    }

    public static /* synthetic */ cs e(cu cuVar) {
        ActivityInfo activityInfo;
        PackageManager packageManager = cuVar.f21577b.getPackageManager();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads.interactivemedia.v3")), 65536);
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo != null) {
                return cs.create(packageInfo.versionCode, activityInfo.packageName);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static /* synthetic */ com.google.ads.interactivemedia.v3.impl.data.at i(cu cuVar) {
        SharedPreferences sharedPreferencesA = a.x.b.a(cuVar.f21577b);
        if (sharedPreferencesA == null) {
            return null;
        }
        try {
            return com.google.ads.interactivemedia.v3.impl.data.at.create(sharedPreferencesA.contains("IABTCF_gdprApplies") ? String.valueOf(sharedPreferencesA.getInt("IABTCF_gdprApplies", 0)) : BuildConfig.FLAVOR, sharedPreferencesA.getString("IABTCF_TCString", BuildConfig.FLAVOR), sharedPreferencesA.getString("IABTCF_AddtlConsent", BuildConfig.FLAVOR), sharedPreferencesA.getString("IABUSPrivacy_String", BuildConfig.FLAVOR));
        } catch (ClassCastException e2) {
            pn.e("Failed to read TCF Consent settings from SharedPreferences.", e2);
            return null;
        }
    }

    public static /* synthetic */ String l(cu cuVar) {
        if (cuVar.f21577b.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            pn.g("Host application doesn't have ACCESS_NETWORK_STATE permission");
            return "android:0";
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) cuVar.f21577b.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo == null ? "android:0" : String.format(Locale.US, "android:%d:%d", Integer.valueOf(activeNetworkInfo.getType()), Integer.valueOf(activeNetworkInfo.getSubtype()));
    }

    public static /* synthetic */ void o(cu cuVar, AdsManagerLoadedEvent adsManagerLoadedEvent) {
        Iterator<AdsLoader.AdsLoadedListener> it = cuVar.f21581f.iterator();
        while (it.hasNext()) {
            it.next().onAdsManagerLoaded(adsManagerLoadedEvent);
        }
    }

    private final String r() {
        TestingConfiguration testingConfiguration = this.f21586k;
        if (testingConfiguration == null || !testingConfiguration.ignoreStrictModeFalsePositives()) {
            return UUID.randomUUID().toString();
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
        String string = UUID.randomUUID().toString();
        StrictMode.setThreadPolicy(threadPolicy);
        return string;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f21580e.a(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void addAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.f21581f.add(adsLoadedListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void contentComplete() {
        this.f21578c.o(new dw(du.adsLoader, dv.contentComplete, "*"));
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final ImaSdkSettings getSettings() {
        return this.f21585j;
    }

    public final void p() {
        this.f21578c.j();
    }

    public final void q() {
        synchronized (this.f21589n) {
            if (this.f21576a == null) {
                try {
                    this.f21576a = new ant(this.f21577b);
                } catch (RuntimeException unused) {
                    this.f21576a = null;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void release() {
        AdDisplayContainer adDisplayContainer = this.f21588m;
        if (adDisplayContainer != null) {
            adDisplayContainer.destroy();
        }
        StreamDisplayContainer streamDisplayContainer = this.f21587l;
        if (streamDisplayContainer != null) {
            streamDisplayContainer.destroy();
        }
        ed edVar = this.f21578c;
        if (edVar != null) {
            edVar.l();
        }
        this.f21582g.clear();
        this.f21581f.clear();
        this.f21583h.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f21580e.d(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void removeAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.f21581f.remove(adsLoadedListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void requestAds(AdsRequest adsRequest) {
        String strR = r();
        if (adsRequest == null) {
            this.f21580e.c(new cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsRequest cannot be null.")));
            return;
        }
        AdDisplayContainer adDisplayContainer = this.f21588m;
        if (adDisplayContainer == null) {
            this.f21580e.c(new cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad display container must be provided.")));
            return;
        }
        if (adDisplayContainer.getAdContainer() == null) {
            this.f21580e.c(new cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad display container must have a UI container.")));
            return;
        }
        if (art.c(adsRequest.getAdTagUrl()) && art.c(adsRequest.getAdsResponse())) {
            this.f21580e.c(new cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad tag url must non-null and non empty.")));
            return;
        }
        if (this.f21588m.getPlayer() == null) {
            AdDisplayContainer adDisplayContainer2 = this.f21588m;
            adDisplayContainer2.setPlayer(ImaSdkFactory.createSdkOwnedPlayer(this.f21577b, adDisplayContainer2.getAdContainer()));
        }
        this.f21582g.put(strR, adsRequest);
        this.f21578c.e(this.f21579d, strR);
        this.f21578c.d(this.f21588m, strR);
        new cp(this, adsRequest, strR).execute(adsRequest.getAdTagUrl());
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final String requestStream(StreamRequest streamRequest) {
        dn dnVar;
        cj cjVar;
        String strR = r();
        if (streamRequest == null) {
            dnVar = this.f21580e;
            cjVar = new cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "StreamRequest cannot be null."));
        } else {
            StreamDisplayContainer streamDisplayContainer = this.f21587l;
            if (streamDisplayContainer == null) {
                dnVar = this.f21580e;
                cjVar = new cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Stream display container must be provided."));
            } else {
                if (streamDisplayContainer.getVideoStreamPlayer() != null) {
                    this.f21583h.put(strR, streamRequest);
                    this.f21578c.e(this.f21579d, strR);
                    this.f21578c.d(this.f21587l, strR);
                    new ct(this, streamRequest, strR).execute(new Void[0]);
                    return strR;
                }
                dnVar = this.f21580e;
                cjVar = new cj(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Stream requests must specify a player."));
            }
        }
        dnVar.c(cjVar);
        return strR;
    }
}
