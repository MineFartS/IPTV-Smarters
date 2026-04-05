package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TO extends AnonymousClass51 implements MediaViewApi, Repairable, C8A {
    public static byte[] A0D;
    public static String[] A0E;
    public static final String A0F;
    public View A00;
    public ImageView A01;
    public MediaView A02;

    @Nullable
    public MediaViewListener A03;
    public MediaViewVideoRenderer A04;
    public C0660Eb A05;
    public AdComponentViewParentApi A06;
    public X2 A07;
    public C1U A08;
    public C0894Nm A09;

    @Nullable
    public C0924Oq A0A;
    public boolean A0B;
    public boolean A0C;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0D = new byte[]{56, 26, 9, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 8, 30, DateTimeFieldType.MILLIS_OF_SECOND, 91, 9, 30, DateTimeFieldType.SECOND_OF_MINUTE, 31, 30, 9, 30, 9, 91, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 91, 25, 30, 91, 8, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 91, 25, 30, 29, DateTimeFieldType.SECOND_OF_DAY, 9, 30, 91, DateTimeFieldType.SECOND_OF_MINUTE, 26, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 30, 58, 31, 85, 26, 30, 29, 41, 56, 53, 57, 50, 63, 57, DateTimeFieldType.MINUTE_OF_DAY, 57, 40, 43, 51, 46, 55, 64, 100, 104, 110, 108, 41, 123, 108, 103, 109, 108, 123, 108, 123, 41, 100, 124, 122, 125, 41, 107, 108, 41, 122, 108, 125, 41, 107, 108, 111, 102, 123, 108, 41, 103, 104, 125, 96, 127, 108, 72, 109, 39, 96, 68, 72, 78, 76, 9, 91, 76, 71, 77, 76, 91, 76, 91, 9, 68, 92, 90, 93, 9, 75, 76, 9, 90, 76, 93, 9, 75, 76, 79, 70, 91, 76, 9, 71, 72, 93, 64, 95, 76, 107, 72, 71, 71, 76, 91, 104, 77, 7, DateTimeFieldType.MINUTE_OF_DAY, 53, 45, 58, 55, 50, 63, 123, DateTimeFieldType.HALFDAY_OF_DAY, 50, 62, 44, 123, 56, 52, 53, 40, 47, 41, 46, 56, 47, 52, 41, 123, 43, 58, 41, 58, 54, 40, 123, 47, 34, 43, 62, 117, 1, 46, 59, 38, 57, 42, 111, DateTimeFieldType.HOUR_OF_HALFDAY, 43, 111, 6, 44, 32, 33, 111, 38, 60, 111, 33, 58, 35, 35, 97, 11, 52, 57, 56, 50, 125, 47, 56, 51, 57, 56, 47, 56, 47, 125, 48, 40, 46, 41, 125, 63, 56, 125, 46, 56, 41, 125, 63, 56, 59, 50, 47, 56, 125, 51, 60, 41, 52, 43, 56, 28, 57, 115, 26, 11, DateTimeFieldType.MINUTE_OF_DAY, 117, 106, 103, 102, 108, 86, 113, 111, 62};
    }

    public static void A06() {
        A0E = new String[]{"5egxRyJvv3hsImr6xVPVZGZzS", "S92E58UIdGCmPOb4LYA51SRur0tU5vPU", "gB2LJBWgacco1yi3dwEv6yCRJyLib4yq", "IRYDxixZynQ1VjnPzR0JfxvjieAE", "Yx6PPUM30uHFy3rHO75LIsUaVykI", "YSQgGTlHzzB", "fqdcFq1cD4m6uZ0nLvDLKOa7nCA9CaYH", "MqJIv4BM2hfR6AMSoGkEEGT8SPZgcE8o"};
    }

    static {
        A06();
        A05();
        A0F = MediaView.class.getSimpleName();
    }

    private void A03() {
        if (!this.A0C) {
            C0660Eb c0660Eb = this.A05;
            String[] strArr = A0E;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[5] = "HiqmuX4YAHl";
            strArr2[0] = "JtgDxExoVYEb5OmxUIRsQ7gjV";
            if (c0660Eb != null) {
                C0856Lz.A0M(this.A08);
            }
            float f2 = C0856Lz.A01;
            int iRound = Math.round(4.0f * f2);
            int iRound2 = Math.round(12.0f * f2);
            this.A08.setChildSpacing(iRound);
            this.A08.setPadding(0, iRound2, 0, iRound2);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A02.addView(this.A08, layoutParams);
            return;
        }
        throw new IllegalStateException(A02(0, 46, 84));
    }

    private void A04() {
        LX.A04(this.A02, LX.A0A);
        LX.A04(this.A09, LX.A0A);
        LX.A04(this.A04, LX.A0A);
        LX.A04(this.A05, LX.A0A);
    }

    private final void A07(View view, ViewGroup.LayoutParams layoutParams) {
        A02(false);
        this.A02.addView(view, layoutParams);
        A02(true);
    }

    private void A08(View view, C1320bj c1320bj) {
        C0924Oq c0924Oq = this.A0A;
        if (c0924Oq != null) {
            MediaView mediaView = this.A02;
            String[] strArr = A0E;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[6] = "tYahJlzELN2bWoIKGOvNb4V2q4om3tal";
            strArr2[2] = "knO8IZUpKtredd0Q2IkvjJrJQGpJW1Qq";
            mediaView.removeView(c0924Oq);
        }
        if (!c1320bj.A1V()) {
            return;
        }
        String strA16 = c1320bj.A16();
        Context context = this.A02.getContext();
        String[] strArr3 = A0E;
        if (strArr3[5].length() != strArr3[0].length()) {
            String[] strArr4 = A0E;
            strArr4[4] = "LedcnhOkj71a4gNr9a9uwwPVwkpS";
            strArr4[3] = "bOPNktfa058vxRDYU7HJ2aiUk3a2";
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        C0924Oq c0924OqA01 = C0923Op.A01(this.A07, strA16);
        if (A0E[7].charAt(21) != 'L') {
            String[] strArr5 = A0E;
            strArr5[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            strArr5[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            this.A0A = c0924OqA01;
            if (this.A0A == null) {
                return;
            }
        } else {
            this.A0A = c0924OqA01;
            if (this.A0A == null) {
                return;
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(5, view.getId());
        layoutParams.addRule(7, view.getId());
        layoutParams.addRule(6, view.getId());
        layoutParams.addRule(8, view.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
        }
        A07(this.A0A, layoutParams);
        this.A06.bringChildToFront(this.A0A);
    }

    private void A09(ImageView imageView) {
        if (!this.A0C) {
            ImageView imageView2 = this.A01;
            String[] strArr = A0E;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[6] = "9onWrVOda1qlu0pAvyXYf5LKITz29A5r";
            strArr2[2] = "G6pev0JETY7bhqmEZOziJsmCoQM1bBBX";
            if (imageView2 != null) {
                C0856Lz.A0M(imageView2);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A02.addView(imageView, layoutParams);
            imageView.setId(C0856Lz.A00());
            this.A01 = imageView;
            return;
        }
        throw new IllegalStateException(A02(106, 49, 6));
    }

    @TargetApi(21)
    private final void A0A(X2 x2, AttributeSet attributeSet, int i2, int i3, MediaView mediaView) {
        this.A02 = mediaView;
        A09(new ImageView(x2, attributeSet, i2, i3));
        A0F(new C0894Nm(x2, attributeSet, i2, i3));
        this.A08 = new C1U(x2, attributeSet, i2);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(x2, attributeSet, i2, i3));
        A04();
    }

    private final void A0B(X2 x2, AttributeSet attributeSet, int i2, MediaView mediaView) {
        this.A02 = mediaView;
        A09(new ImageView(x2, attributeSet, i2));
        A0F(new C0894Nm(x2, attributeSet, i2));
        this.A08 = new C1U(x2, attributeSet, i2);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(x2, attributeSet, i2));
        A04();
    }

    private final void A0C(X2 x2, AttributeSet attributeSet, MediaView mediaView) {
        this.A02 = mediaView;
        A09(new ImageView(x2, attributeSet));
        A0F(new C0894Nm(x2, attributeSet));
        this.A08 = new C1U(x2, attributeSet);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(x2, attributeSet));
        A04();
    }

    private final void A0D(X2 x2, MediaView mediaView) {
        this.A02 = mediaView;
        A09(new ImageView(x2));
        A0F(new C0894Nm(x2));
        this.A08 = new C1U(x2);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(x2));
        A04();
    }

    private void A0E(C1320bj c1320bj, boolean z, C0803Ju c0803Ju) {
        XE xeA05 = new XE(this.A01, this.A07).A05();
        if (z) {
            xeA05.A07(new TJ(this, c1320bj));
        }
        xeA05.A08(c0803Ju.getUrl());
    }

    private void A0F(C0894Nm c0894Nm) {
        if (!this.A0C) {
            C0894Nm c0894Nm2 = this.A09;
            if (c0894Nm2 != null) {
                this.A02.removeView(c0894Nm2);
            }
            c0894Nm.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A02.addView(c0894Nm, layoutParams);
            this.A09 = c0894Nm;
            return;
        }
        throw new IllegalStateException(A02(63, 43, 38));
    }

    private boolean A0G(NativeAd nativeAd) {
        List<NativeAd> listA04 = ((AnonymousClass58) nativeAd.getNativeAdApi()).A04();
        if (listA04 == null) {
            return false;
        }
        for (NativeAd childNativeAd : listA04) {
            if (childNativeAd.getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    private boolean A0H(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(((AnonymousClass58) nativeAd.getNativeAdApi()).A03());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x010a, code lost:
    
        if (r7 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x010c, code lost:
    
        r3.A0x().A0A().ADA(com.facebook.ads.redexgen.X.EnumC03280d.A08);
        r3.A1T(r9.A0B);
        r9.A00 = r9.A04.getMediaViewVideoRendererApi().getVideoView();
        r9.A09.setVisibility(8);
        r9.A09.setImage(null, null);
        r0 = r9.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0136, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0138, code lost:
    
        r0.setVisibility(8);
        r5 = com.facebook.ads.redexgen.X.TO.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x014b, code lost:
    
        if (r5[5].length() == r5[0].length()) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x014d, code lost:
    
        r5 = com.facebook.ads.redexgen.X.TO.A0E;
        r5[4] = "yqBcm6jNekaOStoZQ6HlGjXfWvjo";
        r5[3] = "wDgm0JyWXySbfCdb16XoSedMN32V";
        r9.A05.setAdapter(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x015e, code lost:
    
        bringChildToFront(r9.A04);
        r9.A04.setNativeAd(r10);
        ((com.facebook.ads.redexgen.X.AnonymousClass57) r9.A04.getMediaViewVideoRendererApi()).A05(r10);
        r9.A04.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x017c, code lost:
    
        if (r3.getAdCoverImage() == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x017e, code lost:
    
        new com.facebook.ads.redexgen.X.XE(r9.A02, r9.A07).A06(r9.A02.getHeight(), r9.A02.getWidth()).A07(new com.facebook.ads.redexgen.X.TL(r9, r3)).A08(r3.getAdCoverImage().getUrl());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01af, code lost:
    
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b1, code lost:
    
        android.util.Log.i(com.facebook.ads.redexgen.X.TO.A0F, A02(261, 9, 44) + ((com.facebook.ads.redexgen.X.AnonymousClass58) r10.getNativeAdApi()).A03());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01d9, code lost:
    
        A08(r9.A04, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01ec, code lost:
    
        if (r7 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01f4, code lost:
    
        if (r10.getAdCoverImage() == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01f6, code lost:
    
        r3.A0x().A0A().ADA(com.facebook.ads.redexgen.X.EnumC03280d.A06);
        r9.A00 = r9.A09.getBodyImageView();
        r9.A04.setVisibility(8);
        r9.A04.unsetNativeAd();
        ((com.facebook.ads.redexgen.X.AnonymousClass57) r9.A04.getMediaViewVideoRendererApi()).A04();
        r0 = r9.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0222, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0224, code lost:
    
        r0.setVisibility(8);
        r9.A05.setAdapter(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x022c, code lost:
    
        bringChildToFront(r9.A09);
        r9.A09.setVisibility(0);
        new com.facebook.ads.redexgen.X.XE(r9.A09, r9.A07).A06(r9.A02.getHeight(), r9.A02.getWidth()).A07(new com.facebook.ads.redexgen.X.TM(r9, r3)).A08(r3.getAdCoverImage().getUrl());
        A08(r9.A09, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0275, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0I(com.facebook.ads.NativeAd r10) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.TO.A0I(com.facebook.ads.NativeAd):void");
    }

    public final void A0J(NativeAdBaseApi nativeAdBaseApi, boolean z) {
        X2 x2A0x = ((C1320bj) nativeAdBaseApi).A0x();
        this.A07.A0D(x2A0x);
        x2A0x.A0C(this);
        this.A0C = true;
        C1320bj c1320bjA0J = C1320bj.A0J(nativeAdBaseApi);
        c1320bjA0J.A1J(this.A02);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A04.setVisibility(8);
        this.A04.unsetNativeAd();
        ((AnonymousClass57) this.A04.getMediaViewVideoRendererApi()).A04();
        C0660Eb c0660Eb = this.A05;
        if (c0660Eb != null) {
            c0660Eb.setVisibility(8);
            this.A05.setAdapter(null);
        }
        this.A01.setVisibility(0);
        bringChildToFront(this.A01);
        this.A00 = this.A01;
        C0803Ju adIcon = c1320bjA0J.getAdIcon();
        if (adIcon != null) {
            Bitmap bitmapA0I = c1320bjA0J.A0w().A0I(adIcon.getUrl());
            if (bitmapA0I != null) {
                this.A01.setImageBitmap(bitmapA0I);
                if (z) {
                    this.A02.post(new TI(this, c1320bjA0J));
                }
            } else {
                A0E(c1320bjA0J, z, adIcon);
            }
        } else {
            InterfaceC1316bf interfaceC1316bfA11 = c1320bjA0J.A11();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            x2A0x.A0A().A2d(c1320bjA0J.A0u(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (interfaceC1316bfA11 != null) {
                interfaceC1316bfA11.A9b(K7.A01(adErrorType));
            }
            Log.e(A02(46, 17, 115), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                this.A07.A04().A86(A02(258, 3, 84), C05228d.A0L, new C05238e(A02(192, 23, 96)));
            }
        }
        A08(this.A01, c1320bjA0J);
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final X2 A5H() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass51, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view == this.A05 || view == this.A04 || view == this.A09 || view == this.A01) {
            this.A06.bringChildToFront(view);
            C0924Oq c0924Oq = this.A0A;
            if (c0924Oq != null) {
                this.A06.bringChildToFront(c0924Oq);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A04.pause(false);
        this.A04.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A02.getVisibility() == 0) {
            return this.A02.getHeight();
        }
        if (this.A04.getVisibility() == 0) {
            return this.A04.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (A0E[1].charAt(24) == 't') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
        strArr[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
        return 0;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageWidth();
        }
        if (this.A02.getVisibility() == 0) {
            return this.A02.getWidth();
        }
        if (this.A04.getVisibility() == 0) {
            return this.A04.getMediaViewVideoRendererApi().getVideoView().getWidth();
        }
        String[] strArr = A0E;
        if (strArr[6].charAt(12) == strArr[2].charAt(12)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[5] = "pFreRfYdfw1";
        strArr2[0] = "pVUprXCJsnglf8IlGtX2XFBaJ";
        return 0;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        this.A07 = AnonymousClass52.A02(adViewConstructorParams.getContext());
        this.A07.A0C(this);
        int initializationType = adViewConstructorParams.getInitializationType();
        if (initializationType == 0) {
            A0D(this.A07, mediaView);
        } else if (initializationType == 1) {
            A0C(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
        } else if (initializationType == 2) {
            A0B(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), mediaView);
        } else if (initializationType == 3) {
            A0A(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
        } else {
            throw new IllegalArgumentException(A02(155, 37, 116));
        }
        A02(true);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass51, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        int width = this.A02.getWidth();
        int height = this.A02.getHeight();
        if (width > 0 && height > 0) {
            this.A02.repair(th);
            this.A02.getLayoutParams().width = width;
            MediaView mediaView = this.A02;
            if (A0E[1].charAt(24) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[5] = "Mgb6bOJjyiN";
            strArr[0] = "MTEeDXbdwkPsq4eW7ABfM3WBi";
            mediaView.getLayoutParams().height = height;
            this.A02.setBackgroundColor(DefaultRenderer.TEXT_COLOR);
            return;
        }
        this.A02.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A03 = mediaViewListener;
        if (mediaViewListener == null) {
            ((AnonymousClass57) this.A04.getMediaViewVideoRendererApi()).A08(null);
        } else {
            ((AnonymousClass57) this.A04.getMediaViewVideoRendererApi()).A08(new TN(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0C) {
            MediaViewVideoRenderer mediaViewVideoRenderer2 = this.A04;
            if (A0E[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "ifAS5bhxfK6Gg4eu5Yemnhg9EBEfp9jT";
            strArr[2] = "R5YDbsM1msNnvJcIFydw3DY2O0brJ9d9";
            if (mediaViewVideoRenderer2 != null) {
                this.A02.removeView(mediaViewVideoRenderer2);
                this.A04.getMediaViewVideoRendererApi().destroy();
            }
            ((AnonymousClass57) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A06(this.A07.A06());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((TO) this.A02.getMediaViewApi()).A07(mediaViewVideoRenderer, layoutParams);
            this.A04 = mediaViewVideoRenderer;
            this.A0B = !(this.A04 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(C0856Lz.A00());
            return;
        }
        throw new IllegalStateException(A02(215, 43, 114));
    }
}
