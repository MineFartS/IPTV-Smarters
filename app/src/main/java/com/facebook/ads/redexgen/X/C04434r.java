package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04434r implements AdViewApi {
    public static byte[] A0D;
    public static String[] A0E;
    public long A00;

    @Nullable
    public View A01;

    @Nullable
    public AdListener A02;

    @Nullable
    public C0680Ex A03;
    public C0895Nn A04;

    @Nullable
    public String A05;

    @Nullable
    public String A06;
    public final DisplayMetrics A07;
    public final AdView A08;
    public final AdViewParentApi A09;
    public final DV A0A;
    public final KC A0B;
    public final String A0C;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-77, -71, -78, -30, -76, -70, -27, -71, 120, 124, -88, 123, 117, 124, 120, 124, -12, 32, -12, 36, -10, 35, 35, 37, -28, -32, -28, -30, -29, -33, -32, -28, -14, DateTimeFieldType.HOUR_OF_DAY, 30, 30, DateTimeFieldType.SECOND_OF_MINUTE, 34, -48, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, -48, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 35, 36, 34, 31, 41, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, -119, -88, -75, -75, -84, -71, 103, -88, -85, 103, -77, -74, -88, -85, 103, -71, -84, -72, -68, -84, -70, -69, -84, -85, -107, -77, -64, -64, -63, -58, 114, -72, -69, -64, -74, 114, -77, 114, -58, -73, -65, -62, -66, -77, -58, -73, 114, -58, -70, -77, -58, 114, -66, -63, -77, -74, 114, -76, -69, -74, 114, 121, 119, -59, 121, -23, -20, -37, -15, 2, -19, -48, -47, -33, -32, -34, -37, -27, -57, -54, -68, -65, -100, -65, 32, 35, DateTimeFieldType.SECOND_OF_MINUTE, 24, -11, 24, -6, 38, 35, 33, -10, 29, 24};
        if (A0E[2].charAt(11) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[7] = "i0zr3oWhaZ1ZQYjulO9yltnfKtDweGPM";
        strArr[6] = "f16HnFk6V4WfoRTY4RGQrwGHYb77b2mz";
        A0D = bArr;
    }

    public static void A03() {
        A0E = new String[]{"of0bzA7MwNGTia9F31tAkieNA09H6OOQ", "TyTQj7xFBxvma6AaZ1TUwVS6lItsexiQ", "kN9yyhhGlFuDqh5wulKzoOOSsFZblOVu", "DXKKP4SSVuW5x9unPZpKCS00jdGSX4q", "ceBkREnsnDPWKQGMERGG6oDocc2kf8dJ", "ULZujO58Hn4sCnlurEwExiI5FfKtYml", "oBzM86F4GMvLYp6iWCqbmyfPVfF4ncm8", "8s2Qgj6JQYkd4IbFNTxV1lfTN5yJUxqm"};
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public C04434r(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        this.A00 = -1L;
        if (adSize != null && adSize != AdSize.INTERSTITIAL) {
            this.A07 = adView.getContext().getResources().getDisplayMetrics();
            this.A0B = KC.A02(adSize);
            this.A0C = str;
            this.A09 = adViewParentApi;
            this.A08 = adView;
            this.A0A = AnonymousClass52.A06(context);
            this.A0A.A0A().A2j(AdPlacementType.BANNER.toString());
            C03611k c03611k = new C03611k(str, KF.A02(this.A0B), AdPlacementType.BANNER, KC.A02(adSize), 1);
            c03611k.A05(this.A05);
            c03611k.A06(this.A06);
            this.A03 = new C0680Ex(this.A0A, c03611k);
            this.A03.A0R(new TH(this));
            return;
        }
        throw new IllegalArgumentException(A01(116, 6, 72));
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public C04434r(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws K8 {
        this(context, str, A00(str2), adViewParentApi, adView);
        this.A0A.A0A().A3d();
    }

    public static AdSize A00(String str) throws K8 {
        KD kdA00 = KI.A00(str);
        if (kdA00 != null) {
            KI.A04(kdA00);
            return KF.A00(kdA00);
        }
        throw new K8(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A01(75, 41, 18), str));
    }

    private void A04(@Nullable String str) {
        this.A00 = System.currentTimeMillis();
        if (str == null) {
            this.A0A.A0A().A2g();
        } else {
            this.A0A.A0A().A2f();
        }
        C0680Ex c0680Ex = this.A03;
        String[] strArr = A0E;
        if (strArr[3].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "8EJDtH9EjlwutgZO3WtzB3nx702AY4O";
        strArr2[5] = "dTiKD7UwUCw1SvcKYJrEphBgoR9CLtC";
        if (c0680Ex != null) {
            c0680Ex.A0T(str);
        }
        this.A0A.A0A().A2e();
    }

    public final long A05() {
        return this.A00;
    }

    public final DisplayMetrics A06() {
        return this.A07;
    }

    @Nullable
    public final AdListener A07() {
        return this.A02;
    }

    public final AdView A08() {
        return this.A08;
    }

    @Nullable
    public final C0680Ex A09() {
        return this.A03;
    }

    public final DV A0A() {
        return this.A0A;
    }

    public final KC A0B() {
        return this.A0B;
    }

    public final void A0C(RelativeLayout relativeLayout, View view) {
        C0924Oq c0924OqA01;
        this.A0A.A0A().A3q(this.A06 != null);
        String str = this.A06;
        if (str != null && (c0924OqA01 = C0923Op.A01(this.A0A, str)) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            relativeLayout.addView(c0924OqA01, new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
        }
    }

    public final void A0D(C0895Nn c0895Nn) {
        this.A04 = c0895Nn;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return new C0793Jk(this);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        KL.A05(A01(122, 7, 44), A01(32, 19, 112), A01(16, 8, 127));
        this.A0A.A0A().A2k();
        C0680Ex c0680Ex = this.A03;
        if (c0680Ex != null) {
            c0680Ex.A0W(true);
            this.A03 = null;
        }
        if (Build.VERSION.SDK_INT >= 18 && this.A04 != null && JT.A0o(this.A08.getContext())) {
            C0895Nn c0895Nn = this.A04;
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "fmi4ltQko56R0Ot1hIU3uMuoiOam3SD1";
            strArr2[6] = "7H1g3sSDF1cZj7eOXlokIXc1uirRZwhG";
            c0895Nn.A08();
            View view = this.A01;
            if (view != null) {
                view.getOverlay().remove(this.A04);
            }
        }
        this.A08.removeAllViews();
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0C;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        C0680Ex c0680Ex = this.A03;
        boolean z = c0680Ex == null || c0680Ex.A0X();
        this.A0A.A0A().A4Y(z);
        return z;
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        KL.A05(A01(129, 6, 27), A01(51, 24, 7), A01(24, 8, 109));
        A04(null);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void loadAd(AdView.AdViewLoadConfig adViewLoadConfig) {
        KL.A05(A01(129, 6, 27), A01(51, 24, 7), A01(0, 8, 65));
        A04(((C0793Jk) adViewLoadConfig).A00());
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public final void loadAdFromBid(String str) {
        KL.A05(A01(135, 13, 116), A01(51, 24, 7), A01(8, 8, 5));
        A04(str);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        this.A09.onConfigurationChanged(configuration);
        View view = this.A01;
        if (view != null) {
            KF.A04(this.A07, view, this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void setAdListener(@Nullable AdListener adListener) {
        this.A0A.A0A().A2c(adListener != null);
        this.A02 = adListener;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A05 = extraHints.getHints();
        this.A06 = extraHints.getMediationData();
    }
}
