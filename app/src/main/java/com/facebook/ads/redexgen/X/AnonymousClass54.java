package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.54, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass54 implements InterstitialAdApi, Repairable {
    public static byte[] A04;
    public static String[] A05;
    public final InterstitialAd A00;
    public final C03691s A01;
    public final C0675Es A02;
    public final X2 A03;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = bArrCopyOfRange[i5] - i4;
            if (A05[0].charAt(22) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[4] = "dLq0XFJawohP2A9uDPm8W8ZKhW9iXRhW";
            strArr[4] = "dLq0XFJawohP2A9uDPm8W8ZKhW9iXRhW";
            bArrCopyOfRange[i5] = (byte) (i6 - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-30, -28, -33, -24, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, -31, -28, -69, -23, -23, -71, -75, -25, -71, -72, 37, 84, 84, 36, 40, 37, 34, 37, -49, -12, -6, -21, -8, -12, -25, -14, -90, -21, -8, -8, -11, -8, -76, -112, -29, 8, DateTimeFieldType.HOUR_OF_HALFDAY, -1, 12, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 3, DateTimeFieldType.HOUR_OF_HALFDAY, 3, -5, 6, -70, -5, -2, -70, -2, -1, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 12, 9, DateTimeFieldType.MINUTE_OF_HOUR, -1, -2, -56, -19, -13, -28, -15, -14, -13, -24, -13, -24, -32, -21, -97, -32, -29, -97, -21, -18, -32, -29, -97, -15, -28, -16, -12, -28, -14, -13, -28, -29, -18, DateTimeFieldType.MINUTE_OF_HOUR, 25, 10, DateTimeFieldType.MILLIS_OF_SECOND, 24, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 6, DateTimeFieldType.HOUR_OF_DAY, -59, 6, 9, -59, 24, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 28, -59, 8, 6, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 10, 9, -10, -9, 5, 6, 4, 1, 11, -28, -17, -52, -17, -31, -28, -63, -28, 49, 38, 45, 53};
    }

    public static void A02() {
        A05 = new String[]{"S822El9zG6GuADGrtluuLX363osWhxiG", "ZFI3hp6NIHNPBZ8p7tKJKM6DxTur89gU", "rKe2xKovfMLHVnc2kJBHIfRtW7KI2joW", "CTsEdbmp9bu3ZhSS7yZH02ALmjP1FNtP", "mPYAOoIIU9PuPwOlU3lFT13mhy9mIxzC", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "HqZNdyzgU2LJRhG9zHJvoyCPzWSUAGCn"};
    }

    public AnonymousClass54(Context context, String str, InterstitialAd interstitialAd) {
        this.A00 = interstitialAd;
        this.A03 = AnonymousClass52.A03(context);
        this.A03.A0A().A2j(AdPlacementType.INTERSTITIAL.toString());
        this.A01 = new C03691s(this.A03, interstitialAd, str);
        this.A03.A0C(this);
        this.A02 = new C0675Es(this.A01);
    }

    public final void A03(RewardData rewardData) {
        this.A01.A0E(rewardData);
    }

    public final void A04(EnumSet<CacheFlag> enumSet, @Nullable String str) {
        KL.A05(A00(129, 8, 2), A00(65, 30, 1), A00(0, 8, 49));
        if (str == null) {
            this.A03.A0A().A2g();
        } else {
            this.A03.A0A().A2f();
        }
        this.A02.A08(this.A00, enumSet, str);
        this.A03.A0A().A2e();
    }

    @Override // com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new AnonymousClass55(this);
    }

    @Override // com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new AnonymousClass56();
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        KL.A05(A00(122, 7, 20), A00(40, 25, 28), A00(16, 8, 113));
        if (JT.A1C(this.A03)) {
            return;
        }
        this.A02.A05();
        this.A03.A0A().A2k();
    }

    public final void finalize() {
        this.A02.A04();
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A09();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA09 = this.A02.A09();
        this.A03.A0A().A4Y(zA09);
        return zA09;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0A();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        loadAd(CacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((AnonymousClass55) interstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(EnumSet<CacheFlag> enumSet) {
        A04(enumSet, null);
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public final void loadAdFromBid(String str) {
        A04(CacheFlag.ALL, str);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAdFromBid(EnumSet<CacheFlag> cacheFlags, String str) {
        A04(cacheFlags, str);
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        if (this.A01.A02() != null) {
            this.A01.A02().onError(this.A00, new AdError(AdError.INTERNAL_ERROR_CODE, A00(24, 16, 8) + C0839Li.A03(this.A03, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void setAdListener(InterstitialAdListener interstitialAdListener) {
        this.A03.A0A().A2c(interstitialAdListener != null);
        this.A01.A0D(interstitialAdListener);
        if (A05[0].charAt(22) != '3') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[4] = "rYQ6gTbtajntBm3fXVm84HcfyQ9ACN8J";
        strArr[4] = "rYQ6gTbtajntBm3fXVm84HcfyQ9ACN8J";
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A0H(extraHints.getHints());
        this.A01.A0I(extraHints.getMediationData());
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void setRewardedAdListener(RewardedAdListener rewardedAdListener) {
        this.A01.A0F(rewardedAdListener);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        KL.A05(A00(137, 4, 64), A00(95, 27, 39), A00(8, 8, 7));
        this.A03.A0A().A2p();
        boolean zA0B = this.A02.A0B(this.A00, new AnonymousClass56());
        this.A03.A0A().A2o(zA0B);
        return zA0B;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A03.A0A().A2p();
        boolean zA0B = this.A02.A0B(this.A00, interstitialShowAdConfig);
        this.A03.A0A().A2o(zA0B);
        return zA0B;
    }
}
