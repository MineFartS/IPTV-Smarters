package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5M implements RewardedVideoAdApi, Repairable {
    public static byte[] A04;
    public static String[] A05;
    public final RewardedVideoAd A00;
    public final C03731w A01;
    public final C0674Er A02;
    public final X2 A03;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{116, 119, 122, -91, -92, 115, 120, -91, -94, -45, -87, -47, -92, -89, -87, -95, -127, -126, -77, -123, -121, -125, 127, -126, 72, 75, 75, 72, 77, 69, 75, 118, 61, 57, 111, 108, 66, 108, 108, 110, -81, -77, -35, -35, -31, -31, -31, -77, -109, -64, -65, -61, -65, -107, -65, -64, -72, -35, -29, -44, -31, -35, -48, -37, -113, -44, -31, -31, -34, -31, -99, 121, -104, -85, -67, -89, -72, -86, -85, -86, 102, -68, -81, -86, -85, -75, 102, -89, -86, 102, -86, -85, -71, -70, -72, -75, -65, -85, -86, -110, -91, -73, -95, -78, -92, -91, -92, 96, -74, -87, -92, -91, -81, 96, -95, -92, 96, -84, -81, -95, -92, 96, -78, -91, -79, -75, -91, -77, -76, -91, -92, -76, -57, -39, -61, -44, -58, -57, -58, -126, -40, -53, -58, -57, -47, -126, -61, -58, -126, -43, -54, -47, -39, -126, -59, -61, -50, -50, -57, -58, -54, -53, -39, -38, -40, -43, -33, -115, -118, 91, -118, 97, -114, -115, 112, 115, 101, 104, 69, 104, -42, -39, -53, -50, -85, -50, -80, -36, -39, -41, -84, -45, -50, -97, -108, -101, -93};
    }

    public static void A02() {
        A05 = new String[]{"q8F3UYcndC8Ej6EzPObAfC2CDIoe743", "WHSSbjkejcnDJnmz9i28DmVQ7s5doV", "7Ae3C11G9ZnRQnjC1YEsbkjNlyvjMOhJ", "xIErM25UzhDXOZX5lXVK71ghnZu2uIsx", "TpWxEHvEZyAqJcOvGEooXr2tQ3t7MLKT", "CpjtrdZmrEbCE1OZgZlStH8uGVShpb", "AnU5GMoet7ZaRK4jG6aRRqRoHnPXG1EV", "P"};
    }

    public C5M(Context context, String str, RewardedVideoAd rewardedVideoAd) {
        this.A00 = rewardedVideoAd;
        this.A03 = AnonymousClass52.A05(context);
        this.A03.A0A().A2j(AdPlacementType.REWARDED_VIDEO.toString());
        this.A01 = new C03731w(this.A03, str, this.A00);
        this.A03.A0C(this);
        this.A02 = new C0674Er(this.A01);
    }

    private final void A03(@Nullable String str, boolean z) {
        A04(str, null, z);
    }

    public final void A04(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        if (str == null) {
            this.A03.A0A().A2g();
        } else {
            X2 x2 = this.A03;
            if (A05[1].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "VbNMcinO8suVZXvBDeNnaTURWjAwCx";
            strArr[1] = "VbNMcinO8suVZXvBDeNnaTURWjAwCx";
            x2.A0A().A2f();
        }
        this.A02.A09(this.A00, str, adExperienceType, z);
        this.A03.A0A().A2e();
    }

    @Override // com.facebook.ads.FullScreenAd
    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder buildLoadAdConfig() {
        return new C5N(this);
    }

    @Override // com.facebook.ads.FullScreenAd
    public final RewardedVideoAd.RewardedVideoAdShowConfigBuilder buildShowAdConfig() {
        return new C5O();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void destroy() {
        KL.A05(A00(160, 7, 98), A00(72, 27, 66), A00(32, 8, 5));
        if (JT.A1C(this.A03)) {
            return;
        }
        this.A02.A05();
        this.A03.A0A().A2k();
    }

    public final void finalize() {
        this.A02.A04();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A0C;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0A = this.A02.A0A();
        this.A03.A0A().A4Y(zA0A);
        return zA0A;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0B();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        KL.A05(A00(174, 6, 0), A00(99, 32, 60), A00(48, 8, 89));
        A03(null, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((C5N) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(boolean z) {
        KL.A05(A00(174, 6, 0), A00(99, 32, 60), A00(167, 7, 36));
        A03(null, z);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void loadAdFromBid(String str) {
        KL.A05(A00(180, 13, 102), A00(99, 32, 60), A00(8, 8, 108));
        A03(str, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAdFromBid(String str, boolean z) {
        KL.A05(A00(180, 13, 102), A00(99, 32, 60), A00(16, 8, 74));
        A03(str, z);
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new AdError(AdError.INTERNAL_ERROR_CODE, A00(56, 16, 107) + C0839Li.A03(this.A01.A0B, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void setAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A04 = rewardedVideoAdListener;
        this.A03.A0A().A2c(rewardedVideoAdListener != null);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void setRewardData(RewardData rewardData) {
        this.A02.A08(rewardData);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        KL.A05(A00(193, 4, 40), A00(131, 29, 94), A00(0, 8, 62));
        return show(-1);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(int i2) {
        KL.A05(A00(193, 4, 40), A00(131, 29, 94), A00(40, 8, 119));
        this.A03.A0A().A2p();
        boolean zA0C = this.A02.A0C(this.A00, new C5O().withAppOrientation(i2).build());
        this.A03.A0A().A2o(zA0C);
        return zA0C;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        KL.A05(A00(193, 4, 40), A00(131, 29, 94), A00(24, 8, 17));
        this.A03.A0A().A2p();
        boolean zA0C = this.A02.A0C(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0A().A2o(zA0C);
        return zA0C;
    }
}
