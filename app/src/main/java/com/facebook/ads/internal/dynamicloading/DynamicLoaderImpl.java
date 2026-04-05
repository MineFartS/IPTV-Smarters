package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InstreamVideoAdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdChoicesViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.api.AdSettingsApi;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkAdsApi;
import com.facebook.ads.internal.api.BidderTokenProviderApi;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.InitApi;
import com.facebook.ads.internal.api.InstreamVideoAdViewApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.api.NativeAdViewApi;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.api.NativeBannerAdViewApi;
import com.facebook.ads.internal.api.NativeComponentTagApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.AdSharedPreferences;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.redexgen.X.AnonymousClass52;
import com.facebook.ads.redexgen.X.AnonymousClass54;
import com.facebook.ads.redexgen.X.AnonymousClass57;
import com.facebook.ads.redexgen.X.AnonymousClass58;
import com.facebook.ads.redexgen.X.AnonymousClass59;
import com.facebook.ads.redexgen.X.AnonymousClass90;
import com.facebook.ads.redexgen.X.C04344i;
import com.facebook.ads.redexgen.X.C04404o;
import com.facebook.ads.redexgen.X.C04434r;
import com.facebook.ads.redexgen.X.C04484w;
import com.facebook.ads.redexgen.X.C04665p;
import com.facebook.ads.redexgen.X.C0803Ju;
import com.facebook.ads.redexgen.X.C0804Jv;
import com.facebook.ads.redexgen.X.C0805Jw;
import com.facebook.ads.redexgen.X.C1320bj;
import com.facebook.ads.redexgen.X.C1339c5;
import com.facebook.ads.redexgen.X.C5C;
import com.facebook.ads.redexgen.X.C5L;
import com.facebook.ads.redexgen.X.C5M;
import com.facebook.ads.redexgen.X.K8;
import com.facebook.ads.redexgen.X.KC;
import com.facebook.ads.redexgen.X.TA;
import com.facebook.ads.redexgen.X.TO;
import com.facebook.ads.redexgen.X.TP;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class DynamicLoaderImpl implements DynamicLoader {
    public static AdSettingsApi A00;
    public static AudienceNetworkAdsApi A01;
    public static NativeAdViewApi A02;
    public static NativeBannerAdViewApi A03;
    public static C04665p A04;
    public static String[] A05;
    public static final InitApi A06;

    public static void A00() {
        A05 = new String[]{BuildConfig.FLAVOR, "hl0DpOFqxM1jfK98LJTADvCdgffrETQN", "QW5nZBv4w8ebawOaJAju5UC6DpXIEYNP", "lDXIr49IIqC5d9soZ9ZlhOdK7Sq4PNcS", "1TLrXBQAGAxZIydv1bacR9cCDSxOiDhT", "HKpyy44hPf1TiYKwXHdFJYATCyhvdc4i", "5Vop4gtsdytJgHep4xjnsMChzM034SFi", "0HGMkPnlBdCz3NKZQL2lJn"};
    }

    static {
        A00();
        A06 = new InitApi() { // from class: com.facebook.ads.redexgen.X.53
            @Override // com.facebook.ads.internal.api.InitApi
            public final void initialize(Context context, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i2) {
                AnonymousClass90.A0H(AnonymousClass52.A07(context), multithreadedBundleWrapper, initListener, i2);
            }

            @Override // com.facebook.ads.internal.api.InitApi
            public final boolean isInitialized() {
                return AnonymousClass90.A0J();
            }

            @Override // com.facebook.ads.internal.api.InitApi
            public final void maybeAttachCrashListener(Context context) {
                AnonymousClass90.A08(AnonymousClass52.A07(context));
            }

            @Override // com.facebook.ads.internal.api.InitApi
            public final void onAdEventManagerCreated(Context context) {
                AnonymousClass90.A09(AnonymousClass52.A07(context));
            }

            @Override // com.facebook.ads.internal.api.InitApi
            public final void onAdLoadInvoked(Context context) {
                AnonymousClass90.A0A(AnonymousClass52.A07(context));
            }

            @Override // com.facebook.ads.internal.api.InitApi
            public final void onContentProviderCreated(Context context) {
                AnonymousClass90.A0B(AnonymousClass52.A07(context));
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdChoicesViewApi createAdChoicesViewApi(AdChoicesView adChoicesView, Context context, NativeAdBase nativeAdBase) {
        return new C04404o(adChoicesView, context, nativeAdBase);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i2, AdOptionsView adOptionsView) {
        return new TA(context, nativeAdBase, nativeAdLayout, orientation, i2, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        return new TA(context, nativeAdBase, nativeAdLayout, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSettingsApi createAdSettingsApi() {
        if (A00 == null) {
            A00 = new AdSettingsApi() { // from class: com.facebook.ads.redexgen.X.4q
                public static byte[] A00;
                public static String[] A01;
                public static final String A02;
                public static final Collection<String> A03;
                public static volatile boolean A04;

                public static String A00(int i2, int i3, int i4) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
                    for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                        bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 48);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A00 = new byte[]{124, 119, 101, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 9, 4, 31, 30, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 24, 30, 4, DateTimeFieldType.MINUTE_OF_DAY, 31, 4, DateTimeFieldType.MINUTE_OF_HOUR, 26, 8, DateTimeFieldType.MINUTE_OF_HOUR, 4, DateTimeFieldType.CLOCKHOUR_OF_DAY, 30, 2, 107, 90, 76, 75, 31, 82, 80, 91, 90, 31, 91, 90, 73, 86, 92, 90, 31, 87, 94, 76, 87, 5, 31, 45, DateTimeFieldType.MINUTE_OF_DAY, 31, DateTimeFieldType.SECOND_OF_DAY, 90, DateTimeFieldType.HOUR_OF_HALFDAY, 31, 9, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 29, 90, 3, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 90, 27, 10, 10, 90, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, 90, 60, 27, 25, 31, 24, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_DAY, 93, 9, 90, 27, 30, 90, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, 9, 90, 3, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 90, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 9, DateTimeFieldType.HOUR_OF_HALFDAY, 90, 9, 10, 31, 25, DateTimeFieldType.MINUTE_OF_HOUR, 28, 3, 90, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, 31, 90, 30, 31, 12, DateTimeFieldType.MINUTE_OF_HOUR, 25, 31, 90, DateTimeFieldType.MINUTE_OF_DAY, 27, 9, DateTimeFieldType.MINUTE_OF_DAY, 31, 30, 90, 51, 62, 90, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 90, 31, DateTimeFieldType.SECOND_OF_DAY, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 31, 90, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, 31, 90, 30, 31, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 12, 31, 8, 3, 90, DateTimeFieldType.SECOND_OF_MINUTE, 28, 90, DateTimeFieldType.HOUR_OF_HALFDAY, 31, 9, DateTimeFieldType.HOUR_OF_HALFDAY, 90, 27, 30, 9, 86, 90, 27, 30, 30, 90, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, 31, 90, 28, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 29, 90, 25, DateTimeFieldType.SECOND_OF_MINUTE, 30, 31, 90, 24, 31, 28, DateTimeFieldType.SECOND_OF_MINUTE, 8, 31, 90, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 27, 30, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 29, 90, 27, DateTimeFieldType.SECOND_OF_DAY, 90, 27, 30, 64, 90, 59, 30, 41, 31, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 29, 9, 84, 27, 30, 30, 46, 31, 9, DateTimeFieldType.HOUR_OF_HALFDAY, 62, 31, 12, DateTimeFieldType.MINUTE_OF_HOUR, 25, 31, 82, 88, 26, 27, 8, DateTimeFieldType.MILLIS_OF_SECOND, 29, 27, 55, 26, 54, 31, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 60, 52, 52, 60, 55, 62, 4, 40, 63, 48, 114, 101, 106, 102, 114, 127, 104, 40, 38, 96, 41, 61, 48, 39, 103, 105, 43, 47};
                }

                public static void A02() {
                    A01 = new String[]{"TFkOB7WAPr6F4oSDAD2lBM3orjMmpCql", "qm70b4Ur0FRBuwfAT3tN36vqG0Nf4UFd", "zPpQ1cnfbXvczPvVr", "8IvLkkrNdMNEKNCoxjkf6IUs19Br2Jri", "GW45NL8mXfcvSmeq7", "yk6fztNbTNbTdYOeWP4a4qU6KiJuVBGT", "Yi7aT5eKgI7tScmdPed7vydq7f2NoqCT", "ldtlhzHQs0POAzCz5K2SoOIZIeNjlq2l"};
                }

                static {
                    A02();
                    A01();
                    A02 = AdInternalSettings.class.getSimpleName();
                    A03 = new HashSet();
                    A03.add(A00(262, 3, 49));
                    A03.add(A00(252, 10, 107));
                    A03.add(A00(265, 7, 32));
                    A03.add(A00(272, 8, 111));
                    A04 = false;
                }

                public static void A03(String str) {
                    if (A04) {
                        return;
                    }
                    A04 = true;
                    Log.i(A02, A00(25, 23, 15) + str);
                    Log.i(A02, A00(48, 192, 74) + str + A00(0, 3, 110));
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final boolean isTestMode(Context context) {
                    if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isExplicitTestMode() || A03.contains(Build.PRODUCT)) {
                        return true;
                    }
                    MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
                    String strA00 = A00(3, 22, 107);
                    String string = multithreadedBundleWrapper.getString(strA00, null);
                    if (string == null) {
                        SharedPreferences sharedPreferences = AdSharedPreferences.getSharedPreferences(context);
                        String strA002 = A00(240, 12, 78);
                        string = sharedPreferences.getString(strA002, null);
                        if (TextUtils.isEmpty(string)) {
                            UUID uuidRandomUUID = UUID.randomUUID();
                            if (A01[6].charAt(4) == 'r') {
                                throw new RuntimeException();
                            }
                            String[] strArr = A01;
                            strArr[4] = "ACuTT9OHS44wxpENU";
                            strArr[2] = "rDA9ItLQjR7JTNF9w";
                            string = uuidRandomUUID.toString();
                            sharedPreferences.edit().putString(strA002, string).apply();
                        }
                        AdInternalSettings.sSettingsBundle.putString(strA00, string);
                    }
                    if (AdInternalSettings.getTestDevicesList().contains(string)) {
                        return true;
                    }
                    A03(string);
                    return false;
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final void turnOnDebugger() {
                    KL.A02();
                }
            };
        }
        AdSettingsApi adSettingsApi = A00;
        String[] strArr = A05;
        if (strArr[5].charAt(22) == strArr[3].charAt(22)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "zPBUQH";
        strArr2[7] = "zPBUQH";
        return adSettingsApi;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSizeApi createAdSizeApi(int i2) {
        return KC.A00(i2);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        return (AdViewApi) C04344i.A00(new C04434r(context, str, adSize, adViewParentApi, adView), AdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws Exception {
        try {
            return (AdViewApi) C04344i.A00(new C04434r(context, str, str2, adViewParentApi, adView), AdViewApi.class);
        } catch (K8 e2) {
            throw new Exception(e2.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkActivityApi createAudienceNetworkActivity(final AudienceNetworkActivity audienceNetworkActivity, final AudienceNetworkActivityApi audienceNetworkActivityApi) {
        final C04484w c04484w = new C04484w(audienceNetworkActivity, audienceNetworkActivityApi);
        return new AudienceNetworkActivityApi(audienceNetworkActivity, audienceNetworkActivityApi, c04484w) { // from class: com.facebook.ads.redexgen.X.4x
            public static byte[] A04;
            public static String[] A05;
            public boolean A00;
            public final AudienceNetworkActivity A01;
            public final AudienceNetworkActivityApi A02;
            public final C04484w A03;

            static {
                A02();
                A01();
            }

            public static String A00(int i2, int i3, int i4) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
                for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                    bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 71);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A04 = new byte[]{12, 8, 7, 59, 42, 47, 43, 52, 41, 43, DateTimeFieldType.SECOND_OF_DAY, 43, 58, 61, 53, 56, 49, DateTimeFieldType.MINUTE_OF_HOUR, 44, 35, 54, 46, 35, 33, 50, 35, 34, -34, 35, 54, 33, 35, 46, 50, 39, 45, 44, -20, -70, -57, -72, -70, -68, -51, -62, -49, -62, -51, -46};
            }

            public static void A02() {
                A05 = new String[]{"kVVxbIvKBpFLpNMn249evg7U1t5DMrkR", "HNBIISUKPJt5lzvo", "tha", "s0U2IqORDUirQkjYFZUhzDbmHPDS66DK", "4XQ6Ra6x1CsG5mP0jlsGo4Oc8x5GsOh7", "mYQ1yQiLRLlGaSwEYEmmcgt3b9ncmm6M", "URRMMekVjcz4ECsO2XmiMnA4WEVCe5QQ", "lW2qNIOuJVr9bvm7hZsN45J1F7Bnv3JY"};
            }

            {
                this.A01 = audienceNetworkActivity;
                this.A02 = audienceNetworkActivityApi;
                this.A03 = c04484w;
            }

            private void A03(Throwable th) {
                this.A00 = true;
                this.A03.A0K();
                finish(8);
                X2 x2A0J = this.A03.A0J();
                if (x2A0J != null) {
                    x2A0J.A04().A86(A00(38, 11, 18), C05228d.A04, new C05238e(th));
                    return;
                }
                String strA00 = A00(0, 17, 127);
                if (A05[3].charAt(1) != '0') {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[6] = "roakWe6n8CepWvGQKms2st32sM0MtJhe";
                strArr[6] = "roakWe6n8CepWvGQKms2st32sM0MtJhe";
                Log.e(strA00, A00(17, 21, 119), th);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void finish(int i2) {
                this.A03.finish(i2);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onBackPressed() {
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A03.onBackPressed();
                } catch (Throwable th) {
                    String[] strArr = A05;
                    if (strArr[4].charAt(24) == strArr[5].charAt(24)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A05;
                    strArr2[7] = "o2QAVIvbVP3X0FiUaWNt1f6t7dHcTRBl";
                    strArr2[0] = "vmYtMIbIQwew4451MpW2UPrO9wIbxS87";
                    A03(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onConfigurationChanged(Configuration configuration) {
                try {
                } catch (Throwable th) {
                    A03(th);
                }
                if (this.A00) {
                    this.A02.onConfigurationChanged(configuration);
                } else {
                    this.A03.onConfigurationChanged(configuration);
                    this.A02.onConfigurationChanged(configuration);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onCreate(Bundle bundle) {
                this.A02.onCreate(bundle);
                try {
                    this.A03.onCreate(bundle);
                } catch (Throwable th) {
                    A03(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onDestroy() {
                try {
                } catch (Throwable th) {
                    A03(th);
                }
                if (this.A00) {
                    this.A02.onDestroy();
                } else {
                    this.A03.onDestroy();
                    this.A02.onDestroy();
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onPause() {
                try {
                } catch (Throwable th) {
                    A03(th);
                }
                if (this.A00) {
                    this.A02.onPause();
                } else {
                    this.A03.onPause();
                    this.A02.onPause();
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onResume() {
                this.A02.onResume();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A03.onResume();
                } catch (Throwable th) {
                    A03(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onSaveInstanceState(Bundle bundle) {
                this.A02.onSaveInstanceState(bundle);
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A03.onSaveInstanceState(bundle);
                } catch (Throwable th) {
                    String[] strArr = A05;
                    if (strArr[4].charAt(24) == strArr[5].charAt(24)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A05;
                    strArr2[6] = "46sQaeWUXFUhhsRkoBzMlxezgaVtku4l";
                    strArr2[6] = "46sQaeWUXFUhhsRkoBzMlxezgaVtku4l";
                    A03(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onStart() {
                this.A02.onStart();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A03.onStart();
                } catch (Throwable th) {
                    A03(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onStop() {
                this.A02.onStop();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A03.onStop();
                } catch (Throwable th) {
                    A03(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                try {
                } catch (Throwable th) {
                    A03(th);
                }
                if (this.A00) {
                    return this.A02.onTouchEvent(motionEvent);
                }
                this.A03.onTouchEvent(motionEvent);
                return this.A02.onTouchEvent(motionEvent);
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkAdsApi createAudienceNetworkAdsApi() {
        if (A01 == null) {
            A01 = new AudienceNetworkAdsApi() { // from class: com.facebook.ads.redexgen.X.4z
                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final int getAdFormatForPlacement(String str) throws Throwable {
                    if (C0822Kp.A02(this)) {
                        return 0;
                    }
                    try {
                        return AnonymousClass99.A00(str).intValue();
                    } catch (Throwable th) {
                        C0822Kp.A00(th, this);
                        return 0;
                    }
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void initialize(Context context, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener) throws Throwable {
                    if (C0822Kp.A02(this)) {
                        return;
                    }
                    if (initListener == null) {
                        try {
                            initListener = new AudienceNetworkAds.InitListener() { // from class: com.facebook.ads.redexgen.X.4y
                                @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                                public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                                }
                            };
                        } catch (Throwable th) {
                            C0822Kp.A00(th, this);
                            return;
                        }
                    }
                    DynamicLoaderFactory.makeLoader(context).getInitApi().initialize(context, multithreadedBundleWrapper, initListener, 1);
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final boolean isInitialized() throws Throwable {
                    if (C0822Kp.A02(this)) {
                        return false;
                    }
                    try {
                        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
                        if (dynamicLoader == null) {
                            return false;
                        }
                        return dynamicLoader.getInitApi().isInitialized();
                    } catch (Throwable th) {
                        C0822Kp.A00(th, this);
                        return false;
                    }
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void onContentProviderCreated(Context context) throws Throwable {
                    if (C0822Kp.A02(this)) {
                        return;
                    }
                    try {
                        DynamicLoaderFactory.makeLoader(context).getInitApi().onContentProviderCreated(context);
                    } catch (Throwable th) {
                        C0822Kp.A00(th, this);
                    }
                }
            };
        }
        return A01;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public BidderTokenProviderApi createBidderTokenProviderApi() {
        return getBidderTokenProviderApi();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi() {
        return new C1339c5();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InstreamVideoAdViewApi createInstreamVideoAdViewApi(InstreamVideoAdView instreamVideoAdView, Context context, Bundle bundle) {
        return (InstreamVideoAdViewApi) C04344i.A00(new C5L(instreamVideoAdView, context, bundle), InstreamVideoAdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InstreamVideoAdViewApi createInstreamVideoAdViewApi(InstreamVideoAdView instreamVideoAdView, Context context, String str, AdSize adSize) {
        return (InstreamVideoAdViewApi) C04344i.A00(new C5L(instreamVideoAdView, context, str, adSize), InstreamVideoAdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InterstitialAdApi createInterstitialAd(Context context, String str, InterstitialAd interstitialAd) {
        return (InterstitialAdApi) C04344i.A00(new AnonymousClass54(context, str, interstitialAd), InterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewApi createMediaViewApi() {
        return new TO();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewVideoRendererApi createMediaViewVideoRendererApi() {
        return new AnonymousClass57();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AnonymousClass58 createNativeAdApi(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new AnonymousClass58(nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AnonymousClass58 createNativeAdApi(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new AnonymousClass58(nativeAdBase, nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(Context context, String str) {
        return new C1320bj(context, str, C1320bj.A0I(), false);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(NativeAdBaseApi nativeAdBaseApi) {
        return new C1320bj((C1320bj) nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBase createNativeAdBaseFromBidPayload(Context context, String str, String str2) throws Exception {
        try {
            return C1320bj.A0A(context, str, str2);
        } catch (K8 e2) {
            throw new Exception(e2.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    @Nullable
    public NativeAdImageApi createNativeAdImageApi(JSONObject jSONObject) {
        return C0803Ju.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdLayoutApi createNativeAdLayoutApi() {
        return new TP();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    @Nullable
    public C0804Jv createNativeAdRatingApi(JSONObject jSONObject) {
        return C0804Jv.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdScrollViewApi createNativeAdScrollViewApi(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, @Nullable NativeAdScrollView.AdViewProvider adViewProvider, int i2, @Nullable NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i3) {
        return new AnonymousClass59(nativeAdScrollView, context, nativeAdsManager, adViewProvider, i2, type, nativeAdViewAttributes, i3);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewApi createNativeAdViewApi() {
        if (A02 == null) {
            A02 = new NativeAdViewApi() { // from class: com.facebook.ads.redexgen.X.5A
                public static String[] A00;

                static {
                    A02();
                }

                public static void A02() {
                    A00 = new String[]{"4lhDSJeQx8ImoxNIMYyIsOpW4XJuQDgf", "lqCKp7vrLkXGNxXrvc6I3m7c", "zCZ5ygsfQGVhB3Y237HbJ1q9o76yX", "bq9vw23WcXUY1kk1BWsR1Wz1yPOY5uBm", BuildConfig.FLAVOR, "Hv6Nwq3QZSzEF0Nb8JqXMZqCHWYzLqUn", "tYYpfGiIizklMQ8", "46C5bVFnHWUcfGRcMiONp8ja9wt0MV54"};
                }

                public static View A00(X2 x2, NativeAd nativeAd, NativeAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    C0805Jw c0805Jw = (C0805Jw) nativeAdViewAttributes.getInternalAttributes();
                    C1320bj c1320bjA0J = C1320bj.A0J(nativeAd.getInternalNativeAd());
                    c1320bjA0J.A1P(EnumC0806Jx.A00(type.getEnumCode()));
                    c1320bjA0J.A1O(c0805Jw);
                    C0639De c0639De = new C0639De();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(x2, c0639De);
                    c0639De.A05(nativeAdLayout, x2, nativeAd, c0805Jw);
                    nativeAdLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (C0856Lz.A01 * type.getHeight())));
                    return nativeAdLayout;
                }

                public static View A01(X2 x2, NativeAd nativeAd, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    C1320bj c1320bjA0J = C1320bj.A0J(nativeAd.getInternalNativeAd());
                    C0805Jw c0805Jw = (C0805Jw) nativeAdViewAttributes.getInternalAttributes();
                    c1320bjA0J.A1P(EnumC0806Jx.A0B);
                    c1320bjA0J.A1O(c0805Jw);
                    C0639De c0639De = new C0639De();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(x2, c0639De);
                    c0639De.A05(nativeAdLayout, x2, nativeAd, c0805Jw);
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd) {
                    return render(context, nativeAd, (NativeAdViewAttributes) null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
                    return render(context, nativeAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(AnonymousClass52.A02(context), nativeAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        X2 x2A02 = AnonymousClass52.A02(context);
                        if (A00[1].length() == 17) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A00;
                        strArr[0] = "2CJ6YuIajjVObDWBrmgwGQhi0qiA6kO3";
                        strArr[3] = "BzZMljeHsN6l5z4UR6G3olqVRWzg5ScF";
                        return C0858Mb.A00(x2A02, th);
                    }
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeAd nativeAd, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A01(AnonymousClass52.A02(context), nativeAd, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return C0858Mb.A00(AnonymousClass52.A02(context), th);
                    }
                }
            };
        }
        return A02;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewAttributesApi createNativeAdViewAttributesApi() {
        return new C0805Jw();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewTypeApi createNativeAdViewTypeApi(final int i2) {
        return new NativeAdViewTypeApi(i2) { // from class: com.facebook.ads.redexgen.X.5B
            public final EnumC0806Jx A00;

            {
                this.A00 = EnumC0806Jx.A00(i2);
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getHeight() {
                return this.A00.A03();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getValue() {
                return this.A00.A04();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getWidth() {
                return this.A00.A05();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdsManagerApi createNativeAdsManagerApi(Context context, String str, int i2) {
        return (NativeAdsManagerApi) C04344i.A00(new C5C(context, str, i2), NativeAdsManagerApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdApi createNativeBannerAdApi(NativeBannerAd nativeBannerAd, NativeAdBaseApi nativeAdBaseApi) {
        return new NativeBannerAdApi(nativeAdBaseApi) { // from class: com.facebook.ads.redexgen.X.5G
            public static byte[] A01;
            public static String[] A02;
            public final C1320bj A00;

            static {
                A02();
                A01();
            }

            public static String A00(int i2, int i3, int i4) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                    bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 40);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{43, 47, 44, 24, 9, 4, 8, 3, DateTimeFieldType.HOUR_OF_HALFDAY, 8, 35, 8, 25, 26, 2, 31, 6};
                String[] strArr = A02;
                if (strArr[3].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[1] = "g9VMJ7KVDiHxjzY4mov6XPU8OVFxG";
                strArr2[1] = "g9VMJ7KVDiHxjzY4mov6XPU8OVFxG";
            }

            public static void A02() {
                A02 = new String[]{"GHtEJsCBxF6ZG8G1CCL5RBmKmDCxDlHG", "8TFtHG5", "ovYsObbmHQ4MgJZYSDt7UbSE4I8Jd3xL", "OStrwIklzSQSoVp6y3SnTe0L", "CizBuXx6tKQSK5P8xVf5ORSYZ1", "CxGaKpsxgS6bhWDX5B71lG4aeRzyf4w9", "ZUquOnXGk9BCY4cqa0yz5KxW6oH5Pvvn", "wvrH4lpYI8UyLhNBrrW8XGK9bs66R2Pk"};
            }

            {
                this.A00 = C1320bj.A0J(nativeAdBaseApi);
                this.A00.A1Q(KD.A05);
            }

            private void A03(ImageView imageView, NativeAdBaseApi nativeAdBaseApi2) {
                C1320bj c1320bjA0J = C1320bj.A0J(nativeAdBaseApi2);
                TW tw = new TW(this, imageView, c1320bjA0J);
                C0803Ju c0803JuA10 = c1320bjA0J.getAdIcon();
                if (c0803JuA10 != null) {
                    Bitmap bitmapA0I = c1320bjA0J.A0w().A0I(c0803JuA10.getUrl());
                    X2 x2A02 = AnonymousClass52.A02(imageView.getContext());
                    if (bitmapA0I != null) {
                        Drawable drawableA05 = C1320bj.A05(x2A02, bitmapA0I, c1320bjA0J.A1V(), c1320bjA0J.A16());
                        C1320bj.A0Z(drawableA05, imageView);
                        imageView.post(new TX(this, c1320bjA0J, drawableA05));
                        return;
                    } else {
                        TW tw2 = null;
                        new C5D(x2A02, tw, c1320bjA0J.A1V(), tw2).execute(new C5F(c0803JuA10.getUrl(), c1320bjA0J.A16(), tw2));
                        return;
                    }
                }
                InterfaceC1316bf interfaceC1316bfA11 = c1320bjA0J.A11();
                AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
                c1320bjA0J.A0x().A0A().A2d(-1L, adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
                if (interfaceC1316bfA11 != null) {
                    interfaceC1316bfA11.A9b(K7.A01(adErrorType));
                }
                Log.e(A00(0, 17, 69), adErrorType.getDefaultErrorMessage());
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView) {
                registerViewForInteraction(view, imageView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView, @Nullable List<View> list) {
                if (imageView != null) {
                    A03(imageView, this.A00);
                }
                if (list != null) {
                    this.A00.A1G(view, imageView, list);
                } else {
                    this.A00.A1F(view, imageView);
                }
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView) {
                registerViewForInteraction(view, mediaView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable List<View> list) {
                if (mediaView != null) {
                    TO to = (TO) mediaView.getMediaViewApi();
                    C1320bj c1320bj = this.A00;
                    String[] strArr = A02;
                    if (strArr[3].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[2] = "js1TYeoyNOBe6miaJaLofzAsC6CsUfwk";
                    strArr2[0] = "W1hafLFlhK2580scubVHArACmFSZlS1F";
                    to.A0J(c1320bj, true);
                }
                if (list != null) {
                    this.A00.A1I(view, mediaView, list);
                } else {
                    this.A00.A1H(view, mediaView);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdViewApi createNativeBannerAdViewApi() {
        if (A03 == null) {
            A03 = new NativeBannerAdViewApi() { // from class: com.facebook.ads.redexgen.X.5H
                public static View A00(X2 x2, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    C1320bj.A0J(nativeBannerAd.getInternalNativeAd()).A1P(EnumC0806Jx.A00(type.getEnumCode()));
                    EQ eq = new EQ();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(x2, eq);
                    eq.A05(x2, nativeBannerAd, (C0805Jw) nativeAdViewAttributes.getInternalAttributes(), nativeAdLayout);
                    nativeAdLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (C0856Lz.A01 * type.getHeight())));
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type) {
                    return render(context, nativeBannerAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(AnonymousClass52.A02(context), nativeBannerAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return C0858Mb.A00(AnonymousClass52.A02(context), th);
                    }
                }
            };
        }
        return A03;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeComponentTagApi createNativeComponentTagApi() {
        return new NativeComponentTagApi() { // from class: com.facebook.ads.redexgen.X.5I
            @Override // com.facebook.ads.internal.api.NativeComponentTagApi
            public final void tagView(View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
                if (view != null && nativeComponentTag != null) {
                    LX.A03(view, nativeComponentTag);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedVideoAdApi createRewardedVideoAd(Context context, String str, RewardedVideoAd rewardedVideoAd) {
        return (RewardedVideoAdApi) C04344i.A00(new C5M(context, str, rewardedVideoAd), RewardedVideoAdApi.class);
    }

    public static C04665p getBidderTokenProviderApi() {
        if (A04 == null) {
            A04 = new C04665p();
        }
        return A04;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InitApi getInitApi() {
        return A06;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public void maybeInitInternally(Context context) {
        AnonymousClass90.A0C(AnonymousClass52.A07(context));
    }
}
