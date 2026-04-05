package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InstreamVideoAdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InstreamVideoAdViewApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f18916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f18917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f18918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f18919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Method f18920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Map f18921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f18922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List f18923h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List f18924i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Method f18925j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Method f18926k;

        public a(List list, List list2, Map map, List list3, Method method, Map map2, List list4, List list5, List list6, Method method2, Method method3) {
            this.f18916a = list;
            this.f18917b = list2;
            this.f18918c = map;
            this.f18919d = list3;
            this.f18920e = method;
            this.f18921f = map2;
            this.f18922g = list4;
            this.f18923h = list5;
            this.f18924i = list6;
            this.f18925j = method2;
            this.f18926k = method3;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getReturnType().isPrimitive()) {
                if (!method.getReturnType().equals(Void.TYPE)) {
                    return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
                }
                Iterator it = this.f18916a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (DynamicLoaderFallback.equalsMethods(method, (Method) it.next())) {
                        DynamicLoaderFallback.sApiProxyToAdListenersMap.put(obj, (AdListener) objArr[0]);
                        break;
                    }
                }
                Iterator it2 = this.f18917b.iterator();
                while (it2.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it2.next()) || !DynamicLoaderFallback.reportError(obj, this.f18918c))) {
                }
                Iterator it3 = this.f18919d.iterator();
                while (it3.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it3.next()) || !DynamicLoaderFallback.reportError(obj, this.f18918c))) {
                }
                if (!DynamicLoaderFallback.equalsMethods(method, this.f18920e)) {
                    return null;
                }
                DynamicLoaderFallback.reportError(this.f18921f.get(obj), this.f18918c);
                return null;
            }
            if (method.getReturnType().equals(String.class)) {
                return BuildConfig.FLAVOR;
            }
            Object objNewProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
            Iterator it4 = this.f18922g.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it4.next())) {
                    DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.f18921f.get(obj), (AdListener) objArr[0]);
                    break;
                }
            }
            Iterator it5 = this.f18923h.iterator();
            while (it5.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it5.next())) {
                    this.f18921f.put(objNewProxyInstance, obj);
                }
            }
            Iterator it6 = this.f18924i.iterator();
            while (it6.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it6.next())) {
                    for (Object obj2 : objArr) {
                        if (obj2 instanceof Ad) {
                            this.f18918c.put(objNewProxyInstance, (Ad) obj2);
                        }
                    }
                }
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.f18925j)) {
                this.f18918c.put(objArr[1], (Ad) objArr[0]);
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.f18926k)) {
                this.f18918c.put(objArr[1], (Ad) objArr[0]);
            }
            return objNewProxyInstance;
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdListener f18927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ad f18928c;

        public b(AdListener adListener, Ad ad) {
            this.f18927b = adListener;
            this.f18928c = ad;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18927b.onError(this.f18928c, new AdError(-1, DynamicLoaderFactory.DEX_LOADING_ERROR_MESSAGE));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f18929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InvocationHandler f18930b;

        public class a implements InvocationHandler {
            public a() {
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                c.this.f18929a = method;
                return null;
            }
        }

        public c() {
            this.f18930b = new a();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        public Method b() {
            return this.f18929a;
        }

        public <T> T c(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f18930b));
        }
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        c cVar = new c(null);
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.c(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList6.add(cVar.b());
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList6.add(cVar.b());
        dynamicLoader.createInstreamVideoAdViewApi(null, null, null, null);
        arrayList6.add(cVar.b());
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList6.add(cVar.b());
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList6.add(cVar.b());
        dynamicLoader.createNativeAdApi(null, null);
        Method methodB = cVar.b();
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method methodB2 = cVar.b();
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.c(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.b());
        nativeAdBaseApi.loadAd((NativeAdBase.NativeLoadAdConfig) null);
        arrayList2.add(cVar.b());
        nativeAdBaseApi.loadAd((NativeAdBase.MediaCacheFlag) null);
        arrayList.add(cVar.b());
        nativeAdBaseApi.loadAdFromBid(null);
        arrayList.add(cVar.b());
        nativeAdBaseApi.loadAdFromBid(null, null);
        arrayList.add(cVar.b());
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList5.add(cVar.b());
        nativeAdBaseApi.setAdListener(null, null);
        arrayList3.add(cVar.b());
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.c(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.b());
        interstitialAdApi.loadAd((EnumSet<CacheFlag>) null);
        arrayList.add(cVar.b());
        interstitialAdApi.loadAd((InterstitialAd.InterstitialLoadAdConfig) null);
        arrayList2.add(cVar.b());
        interstitialAdApi.loadAdFromBid(null, null);
        arrayList.add(cVar.b());
        interstitialAdApi.setAdListener(null);
        arrayList3.add(cVar.b());
        interstitialAdApi.buildLoadAdConfig();
        arrayList5.add(cVar.b());
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.c(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.b());
        rewardedVideoAdApi.loadAd((RewardedVideoAd.RewardedVideoLoadAdConfig) null);
        arrayList2.add(cVar.b());
        rewardedVideoAdApi.loadAd(false);
        arrayList.add(cVar.b());
        rewardedVideoAdApi.loadAdFromBid(null, false);
        arrayList.add(cVar.b());
        rewardedVideoAdApi.setAdListener(null);
        arrayList3.add(cVar.b());
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList5.add(cVar.b());
        InstreamVideoAdViewApi instreamVideoAdViewApi = (InstreamVideoAdViewApi) cVar.c(InstreamVideoAdViewApi.class);
        instreamVideoAdViewApi.loadAd();
        arrayList.add(cVar.b());
        instreamVideoAdViewApi.loadAd(null);
        arrayList2.add(cVar.b());
        instreamVideoAdViewApi.loadAdFromBid(null);
        arrayList.add(cVar.b());
        instreamVideoAdViewApi.setAdListener(null);
        arrayList3.add(cVar.b());
        instreamVideoAdViewApi.buildLoadAdConfig();
        arrayList5.add(cVar.b());
        AdViewApi adViewApi = (AdViewApi) cVar.c(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.b());
        adViewApi.loadAd(null);
        arrayList2.add(cVar.b());
        adViewApi.loadAdFromBid(null);
        arrayList.add(cVar.b());
        adViewApi.setAdListener(null);
        arrayList3.add(cVar.b());
        adViewApi.buildLoadAdConfig();
        arrayList5.add(cVar.b());
        ((AdView.AdViewLoadConfigBuilder) cVar.c(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList4.add(cVar.b());
        NativeAdBase.NativeAdLoadConfigBuilder nativeAdLoadConfigBuilder = (NativeAdBase.NativeAdLoadConfigBuilder) cVar.c(NativeAdBase.NativeAdLoadConfigBuilder.class);
        nativeAdLoadConfigBuilder.withAdListener(null);
        arrayList4.add(cVar.b());
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.c(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList4.add(cVar.b());
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.c(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList4.add(cVar.b());
        ((InstreamVideoAdView.InstreamVideoLoadConfigBuilder) cVar.c(InstreamVideoAdView.InstreamVideoLoadConfigBuilder.class)).withAdListener(null);
        arrayList4.add(cVar.b());
        nativeAdLoadConfigBuilder.loadAd();
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList3, arrayList, map, arrayList2, cVar.b(), map2, arrayList4, arrayList5, arrayList6, methodB, methodB2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(adListener, ad), 500L);
        return true;
    }
}
