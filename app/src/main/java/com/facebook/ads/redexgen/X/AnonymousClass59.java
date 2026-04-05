package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.59, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass59 implements NativeAdScrollViewApi {
    public static byte[] A07;
    public final int A00;

    @Nullable
    public final NativeAdScrollView.AdViewProvider A01;

    @Nullable
    public final NativeAdView.Type A02;
    public final NativeAdViewAttributes A03;
    public final NativeAdsManager A04;
    public final TR A05;
    public final X2 A06;

    static {
        A07();
    }

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{-61, -21, -23, -22, -106, -26, -24, -27, -20, -33, -38, -37, -106, -41, -106, -60, -41, -22, -33, -20, -37, -73, -38, -52, -33, -37, -19, -92, -54, -17, -26, -37, -94, -106, -73, -38, -52, -33, -37, -19, -58, -24, -27, -20, -33, -38, -37, -24, -106, -27, -24, -106, -41, -106, -28, -41, -22, -33, -20, -37, -73, -38, -52, -33, -37, -19, -66, -37, -33, -35, -34, -22, -70, -26, -106, -87, -68, -79, -66, -83, -119, -84, -69, -107, -87, -74, -87, -81, -83, -70, 104, -74, -73, -68, 104, -76, -73, -87, -84, -83, -84};
    }

    public AnonymousClass59(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, @Nullable NativeAdScrollView.AdViewProvider adViewProvider, int i2, @Nullable NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i3) {
        if (nativeAdsManager.isLoaded()) {
            if (type != null || adViewProvider != null || i2 > 0) {
                this.A06 = AnonymousClass52.A02(context);
                this.A04 = nativeAdsManager;
                this.A03 = nativeAdViewAttributes;
                this.A01 = adViewProvider;
                this.A02 = type;
                this.A00 = i3;
                TQ tq = new TQ(this);
                this.A05 = new TR(context);
                if (this.A02 == null) {
                    if (i2 > 0) {
                        this.A05.A01(((int) C0856Lz.A01) * i2);
                    }
                } else {
                    this.A05.A01((int) (C0856Lz.A01 * this.A02.getHeight()));
                }
                this.A05.setAdapter(tq);
                setInset(20);
                tq.A0D();
                nativeAdScrollView.addView(this.A05);
                return;
            }
            throw new IllegalArgumentException(A06(0, 74, 85));
        }
        throw new IllegalStateException(A06(74, 27, 39));
    }

    @Override // com.facebook.ads.internal.api.NativeAdScrollViewApi
    public final void setInset(int insetDp) {
        if (insetDp > 0) {
            float f2 = C0856Lz.A01;
            int iRound = Math.round(insetDp * f2);
            this.A05.setPadding(iRound, 0, iRound, 0);
            this.A05.setPageMargin(Math.round((insetDp / 2) * f2));
            this.A05.setClipToPadding(false);
        }
    }
}
