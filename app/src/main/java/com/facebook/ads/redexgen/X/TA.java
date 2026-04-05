package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TA extends AnonymousClass51 implements AdOptionsViewApi {
    public static byte[] A03;
    public static final int A04;
    public static final int A05;
    public final ImageView A00;
    public final ImageView A01;
    public final AdOptionsView A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{91, 108, 121, 102, 123, 125, 41, 72, 109};
    }

    static {
        A02();
        A04 = (int) (C0856Lz.A01 * 23.0f);
        A05 = (int) (C0856Lz.A01 * 4.0f);
    }

    public TA(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i2, AdOptionsView adOptionsView) {
        this.A02 = adOptionsView;
        LinearLayout linearLayout = new LinearLayout(context);
        this.A02.addView(linearLayout);
        linearLayout.setOrientation(orientation == AdOptionsView.Orientation.HORIZONTAL ? 0 : 1);
        this.A01 = A00(M7.DEFAULT_INFO_ICON);
        this.A00 = A00(M7.AD_CHOICES_ICON);
        this.A00.setContentDescription(A01(0, 9, 116));
        linearLayout.addView(this.A01);
        linearLayout.addView(this.A00);
        setIconSizeDp(i2);
        setIconColor(-10459280);
        final C1320bj c1320bjA0J = C1320bj.A0J(nativeAdBase.getInternalNativeAd());
        c1320bjA0J.A1L(nativeAdLayout);
        c1320bjA0J.A1M(this);
        C0986Rb c0986RbA0v = c1320bjA0J.A0v();
        if (c0986RbA0v != null && c0986RbA0v.A0g() && !c0986RbA0v.A0e()) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.4p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    if (C0822Kp.A02(this)) {
                        return;
                    }
                    try {
                        c1320bjA0J.A1D();
                    } catch (Throwable th) {
                        C0822Kp.A00(th, this);
                    }
                }
            });
            LX.A04(this.A02, LX.A0B);
        }
    }

    public TA(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        this(context, nativeAdBase, nativeAdLayout, AdOptionsView.Orientation.HORIZONTAL, 23, adOptionsView);
    }

    private ImageView A00(M7 m7) {
        ImageView imageView = new ImageView(this.A02.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i2 = A05;
        imageView.setPadding(i2, i2, i2, i2);
        imageView.setImageBitmap(M8.A00(m7));
        return imageView;
    }

    public final void A03(M7 m7) {
        this.A01.setImageBitmap(M8.A00(m7));
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconColor(int i2) {
        this.A01.setColorFilter(i2);
        this.A00.setColorFilter(i2);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconSizeDp(int i2) {
        int iMax = Math.max(A04, (int) (C0856Lz.A01 * i2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMax, iMax);
        this.A01.setLayoutParams(layoutParams);
        this.A00.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass51, com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setSingleIcon(boolean z) {
        C0856Lz.A0Q(this.A01, z ? 8 : 0);
    }
}
