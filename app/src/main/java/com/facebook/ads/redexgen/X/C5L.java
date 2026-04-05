package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSize;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InstreamVideoAdListener;
import com.facebook.ads.InstreamVideoAdView;
import com.facebook.ads.internal.api.InstreamVideoAdViewApi;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5L implements InstreamVideoAdViewApi {
    public static byte[] A04;
    public static String[] A05;
    public int A00 = 500;

    @Nullable
    public InstreamVideoAdListener A01;
    public String A02;
    public final InstreamVideoAdView A03;

    static {
        A07();
        A06();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A05;
            if (strArr[6].charAt(3) != strArr[3].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "bYPi2HoIo573ERs6Og";
            strArr2[2] = "bYPi2HoIo573ERs6Og";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i6 = (bArrCopyOfRange[i5] ^ i4) ^ 77;
            if (A05[7].charAt(27) != 'y') {
                bArrCopyOfRange[i5] = (byte) i6;
                i5++;
            } else {
                String[] strArr3 = A05;
                strArr3[4] = "Sq7y2tR8gj3HEmbU4XyPno6pT93W16mH";
                strArr3[1] = "rlsHXzRCfeM7omVYo9FzTVqRdgDeQr7y";
                bArrCopyOfRange[i5] = (byte) i6;
                i5++;
            }
        }
    }

    public static void A06() {
        A04 = new byte[]{63, 59, 56, 12, 29, DateTimeFieldType.CLOCKHOUR_OF_DAY, 28, DateTimeFieldType.MILLIS_OF_SECOND, 26, 28, 55, 28, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.MINUTE_OF_DAY, 82, 117, 104, 111, 105, 126, 122, 118, 59, 122, 127, 104, 59, 115, 122, 109, 126, 59, 121, 126, 126, 117, 59, 127, 126, 107, 105, 126, 120, 122, 111, 126, 127, 26, 6, 11, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 7, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, 30, 35, 46};
    }

    public static void A07() {
        A05 = new String[]{"6YpFKdnZeUBeF7WDSrmaBMCe7HfOYc57", "miC7MzRxLOQa8wWv8sWGlou8AtO76hIB", "EJYl55CP9SMopSurFu", "kl7ibQwe1AQrx3uU2dVSWI2DzUKGSgrF", "EFp21MRWMeffSOWLDRlroYRFZ3OkgZhA", "uHVX0UZuCSrp0FEw298Vi8IcCSvhvS7m", "9XwifO049Mr55FVFIGgFeLBRq5lcoRC5", "6c78zY1geKIDJJzmV6tL7kXg2jKyThsy"};
    }

    public C5L(InstreamVideoAdView instreamVideoAdView, Context context, Bundle bundle) {
        this.A03 = instreamVideoAdView;
        this.A02 = bundle.getString(A03(50, 11, 39), A03(0, 0, 124));
    }

    public C5L(InstreamVideoAdView instreamVideoAdView, Context context, String str, AdSize adSize) {
        this.A03 = instreamVideoAdView;
        this.A02 = str;
    }

    private void A04() {
        C0821Ko.A01(new TZ(this), this.A00);
        this.A00 *= 2;
    }

    public static void A05() {
        Log.w(A03(0, 17, 52), A03(17, 33, 86));
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final InstreamVideoAdView.InstreamVideoLoadConfigBuilder buildLoadAdConfig() {
        A05();
        return new InstreamVideoAdView.InstreamVideoLoadConfigBuilder() { // from class: com.facebook.ads.redexgen.X.5K
            @Override // com.facebook.ads.Ad.LoadConfigBuilder
            public final InstreamVideoAdView.InstreamVideoLoadAdConfig build() {
                return new InstreamVideoAdView.InstreamVideoLoadAdConfig() { // from class: com.facebook.ads.redexgen.X.5J
                };
            }

            @Override // com.facebook.ads.InstreamVideoAdView.InstreamVideoLoadConfigBuilder
            public final InstreamVideoAdView.InstreamVideoLoadConfigBuilder withAdListener(InstreamVideoAdListener instreamVideoAdListener) {
                this.A00.A01 = instreamVideoAdListener;
                return this;
            }

            @Override // com.facebook.ads.Ad.LoadConfigBuilder
            public final InstreamVideoAdView.InstreamVideoLoadConfigBuilder withBid(String str) {
                return this;
            }
        };
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi, com.facebook.ads.Ad
    public final void destroy() {
        A05();
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        A05();
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    @Nullable
    public final Bundle getSaveInstanceState() {
        A05();
        return null;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        A05();
        return true;
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final boolean isAdLoaded() {
        A05();
        return false;
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi, com.facebook.ads.Ad
    public final void loadAd() {
        A05();
        A04();
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final void loadAd(InstreamVideoAdView.InstreamVideoLoadAdConfig instreamVideoLoadAdConfig) {
        A05();
        A04();
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi, com.facebook.ads.Ad
    public final void loadAdFromBid(String str) {
        A05();
        A04();
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final void setAdListener(@Nullable InstreamVideoAdListener instreamVideoAdListener) {
        A05();
        this.A01 = instreamVideoAdListener;
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi, com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        A05();
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final void setIsAdLoaded(boolean z) {
    }

    @Override // com.facebook.ads.internal.api.InstreamVideoAdViewApi
    public final boolean show() {
        A05();
        C0821Ko.A00(new TY(this));
        return false;
    }
}
