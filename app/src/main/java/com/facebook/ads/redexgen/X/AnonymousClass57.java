package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.57, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass57 implements MediaViewVideoRendererApi {
    public static byte[] A0G;
    public static String[] A0H;
    public static final String A0I;
    public MediaViewVideoRenderer A00;
    public VideoAutoplayBehavior A01;
    public X2 A03;

    @Nullable
    public InterfaceC0799Jq A04;
    public C05589o A05;
    public boolean A06;
    public boolean A07;

    @Nullable
    public NativeAd A08;
    public final AbstractC0787Je A0D = new EP(this);
    public final KE A0C = new EO(this);
    public final KK A0B = new EN(this);
    public final AbstractC0773Iq A0E = new C0657Dy(this);
    public final KQ A09 = new C0643Di(this);
    public final IL A0F = new C0642Dh(this);
    public final KO A0A = new C0641Dg(this);
    public AnonymousClass51 A02 = new AnonymousClass51();

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{-30, 7, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -6, 5, 2, -3, -71, -17, 2, -2, DateTimeFieldType.CLOCKHOUR_OF_DAY, -71, -4, 8, 7, 12, DateTimeFieldType.HALFDAY_OF_DAY, 11, DateTimeFieldType.HOUR_OF_HALFDAY, -4, DateTimeFieldType.HALFDAY_OF_DAY, 8, 11, -71, 9, -6, 11, -6, 6, 12, -71, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 9, -2, -57, -34, -16, -16, -10, -12, -7, -14, -85, -8, 0, -2, -1, -85, -19, -16, -85, -5, -3, -16, -18, -16, -17, -16, -17, -85, -19, 4, -85, -20, -85, -18, -20, -9, -9, -85, -1, -6, -85, -16, -7, -14, -20, -14, -16, -34, -16, -16, -10, -73, -85, -20, -7, -17, -85, -15, -6, -9, -9, -6, 2, -16, -17, -85, -19, 4, -85, -20, -85, -18, -20, -9, -9, -85, -1, -6, -85, -17, -12, -2, -16, -7, -14, -20, -14, -16, -34, -16, -16, -10, -71, -27, -22, -12, -26, -17, -24, -30, -24, -26, -44, -26, -26, -20, -95, -28, -30, -19, -19, -26, -27, -95, -8, -22, -11, -23, -16, -10, -11, -95, -26, -17, -24, -30, -24, -26, -44, -26, -26, -20, -81, 74, 83, 76, 70, 76, 74, 56, 74, 74, 80, 5, 72, 70, 81, 81, 74, 73, 5, 92, 78, 89, 77, 84, 90, 89, 5, 73, 78, 88, 74, 83, 76, 70, 76, 74, 56, 74, 74, 80, DateTimeFieldType.MINUTE_OF_HOUR};
    }

    public static void A03() {
        A0H = new String[]{"Ds1OlE9QLNwB", "aoTFD1mdY9qS2iG1b6xBMIzf9BXXSrYm", "osndMvDCAJCV1YpU", "nBivoQhUG9UhcV9idWewaYAmGQw5UcJS", "JB025Vwse6xgHKaH4PdlPsgjNbTaZijW", "Rr8Hg5ZtJOltbAd8rryGswWrdJNm13cq", "EfdUYpEvlCzoAxPYZB8PQhxNy", "DXUiKhR"};
    }

    static {
        A03();
        A02();
        A0I = MediaViewVideoRenderer.class.getSimpleName();
    }

    public final void A04() {
        this.A00.pause(false);
        this.A05.setClientToken(null);
        this.A05.setVideoMPD(null);
        this.A05.setVideoURI((Uri) null);
        this.A05.setVideoCTA(null);
        this.A05.setNativeAd(null);
        this.A01 = VideoAutoplayBehavior.DEFAULT;
        NativeAd nativeAd = this.A08;
        if (nativeAd != null) {
            C1320bj.A0J(nativeAd.getInternalNativeAd()).A1U(false, false);
        }
        this.A08 = null;
        InterfaceC0799Jq interfaceC0799Jq = this.A04;
        if (interfaceC0799Jq != null) {
            interfaceC0799Jq.ADf();
        }
    }

    public final void A05(NativeAd nativeAd) {
        this.A08 = nativeAd;
        this.A03.A0D(((C1320bj) nativeAd.getInternalNativeAd()).A0x());
        AnonymousClass58 anonymousClass58 = (AnonymousClass58) nativeAd.getNativeAdApi();
        this.A05.setClientToken(C1320bj.A0J(nativeAd.getInternalNativeAd()).A15());
        this.A05.setVideoMPD(anonymousClass58.A02());
        this.A05.setVideoURI(anonymousClass58.A03());
        C0986Rb adapter = C1320bj.A0J(nativeAd.getInternalNativeAd()).A0v();
        if (adapter != null) {
            this.A05.setVideoProgressReportIntervalMs(adapter.A0F());
        }
        this.A05.setVideoCTA(nativeAd.getAdCallToAction());
        this.A05.setNativeAd(nativeAd);
        this.A01 = anonymousClass58.getVideoAutoplayBehavior();
        InterfaceC0799Jq interfaceC0799Jq = this.A04;
        if (interfaceC0799Jq != null) {
            interfaceC0799Jq.AD4(nativeAd);
        }
    }

    public final void A06(JZ jz) {
        this.A05.setAdEventManager(jz);
    }

    public final void A07(@Nullable InterfaceC0799Jq interfaceC0799Jq) {
        this.A04 = interfaceC0799Jq;
    }

    public final void A08(@Nullable MZ mz) {
        this.A05.setListener(mz);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void destroy() {
        this.A05.A0S();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (!this.A06) {
            String str = A0I;
            if (A0H[6].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[0] = "WtsbSHtQErqq";
            strArr[2] = "XLMSbaKAMNULMDv3";
            Log.w(str, A01(127, 40, 5));
            return;
        }
        this.A06 = false;
        if (this.A07) {
            this.A05.A0Y(PD.A00(videoStartReason), 3);
        }
        this.A00.onSeekDisengaged();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void engageSeek() {
        if (this.A06) {
            Log.w(A0I, A01(167, 40, 105));
            return;
        }
        this.A06 = true;
        this.A07 = EnumC0958Pz.A0A.equals(this.A05.getState());
        this.A05.A0b(false, 1);
        this.A00.onSeekEngaged();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @IntRange(from = 0)
    public final int getCurrentTimeMs() {
        return this.A05.getCurrentPositionInMillis();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @IntRange(from = 0)
    public final int getDuration() {
        return this.A05.getDuration();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final View getVideoView() {
        return this.A05.getVideoView();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getVolume() {
        return this.A05.getVolume();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer) {
        X2 x2A02;
        this.A00 = mediaViewVideoRenderer;
        Context context = adViewConstructorParams.getContext();
        if (context instanceof X2) {
            x2A02 = (X2) context;
        } else {
            x2A02 = AnonymousClass52.A02(context);
        }
        this.A03 = x2A02;
        int initializationType = adViewConstructorParams.getInitializationType();
        if (initializationType == 0) {
            this.A05 = new C05589o(x2A02);
        } else if (initializationType == 1) {
            this.A05 = new C05589o(x2A02, adViewConstructorParams.getAttributeSet());
        } else if (initializationType == 2) {
            this.A05 = new C05589o(x2A02, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr());
        } else if (initializationType == 3) {
            this.A05 = new C05589o(x2A02, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleRes());
        } else {
            throw new IllegalArgumentException(A01(0, 37, 29));
        }
        this.A05.setEnableBackgroundVideo(mediaViewVideoRenderer.shouldAllowBackgroundPlayback());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.A05.setLayoutParams(layoutParams);
        this.A02.addView(this.A05, -1, layoutParams);
        LX.A04(this.A05, LX.A0A);
        this.A05.getEventBus().A04(this.A0D, this.A0C, this.A0B, this.A0E, this.A09, this.A0F, this.A0A);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void pause(boolean z) {
        this.A05.A0b(z, 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void play(VideoStartReason videoStartReason) {
        this.A05.A0Y(PD.A00(videoStartReason), 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void seekTo(@IntRange(from = 0) int i2) {
        if (!this.A06) {
            Log.w(A0I, A01(37, 90, 15));
        } else {
            this.A05.A0V(i2);
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void setVolume(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.A05.setVolume(f2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final boolean shouldAutoplay() {
        C05589o c05589o = this.A05;
        if (c05589o == null || c05589o.getState() == EnumC0958Pz.A06) {
            return false;
        }
        return this.A01 == VideoAutoplayBehavior.ON || this.A01 == VideoAutoplayBehavior.DEFAULT;
    }
}
