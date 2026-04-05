package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SG implements InterfaceC03681r {
    public static byte[] A07;
    public static final String A08;
    public long A00 = -1;
    public C0679Ew A01;
    public boolean A02;
    public boolean A03;
    public final X2 A04;
    public final InterstitialAdExtendedListener A05;
    public final C03691s A06;

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) + IMediaPlayer.MEDIA_ERROR_TIMED_OUT);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{-59, -14, -92, -27, -24, -92, -16, -13, -27, -24, -92, -19, -9, -92, -27, -16, -10, -23, -27, -24, -3, -92, -19, -14, -92, -12, -10, -13, -21, -10, -23, -9, -9, -78, -92, -35, -13, -7, -92, -9, -20, -13, -7, -16, -24, -92, -5, -27, -19, -8, -92, -22, -13, -10, -92, -27, -24, -48, -13, -27, -24, -23, -24, -84, -83, -92, -8, -13, -92, -26, -23, -92, -25, -27, -16, -16, -23, -24, -4, 33, 39, 24, 37, 38, 39, 28, 39, 28, DateTimeFieldType.SECOND_OF_DAY, 31, -45, 31, 34, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, -45, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 31, 31, 24, DateTimeFieldType.MILLIS_OF_SECOND, -45, 42, 27, 28, 31, 24, -45, 38, 27, 34, 42, 28, 33, 26, -45, 28, 33, 39, 24, 37, 38, 39, 28, 39, 28, DateTimeFieldType.SECOND_OF_DAY, 31, -31, DateTimeFieldType.HALFDAY_OF_DAY, 28, DateTimeFieldType.SECOND_OF_MINUTE};
    }

    static {
        A06();
        A08 = SG.class.getSimpleName();
    }

    public SG(C03691s c03691s, InterfaceC03761z interfaceC03761z, String str) {
        this.A06 = c03691s;
        this.A04 = c03691s.A05();
        this.A05 = new SP(str, interfaceC03761z, this);
    }

    public final long A09() {
        C0679Ew c0679Ew = this.A01;
        if (c0679Ew != null) {
            return c0679Ew.A0F();
        }
        return -1L;
    }

    public final void A0A() {
        C0679Ew c0679Ew = this.A01;
        if (c0679Ew != null) {
            c0679Ew.A0R(new SF(this));
            this.A01.A0W(true);
            this.A01 = null;
            this.A03 = false;
            this.A02 = false;
        }
    }

    public final void A0B(@Nullable EnumSet<CacheFlag> enumSet, @Nullable String str) {
        this.A00 = System.currentTimeMillis();
        if (!this.A03 && this.A01 != null) {
            Log.w(A08, A05(0, 78, 22));
        }
        this.A03 = false;
        if (this.A02 && !JT.A0c(this.A04)) {
            this.A04.A04().A86(A05(130, 3, 62), C05228d.A0B, new C05238e(A05(78, 52, 69)));
            AdErrorType adErrorType = AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A04.A0A().A2d(C0848Lr.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A05.onError(this.A06.A01(), new AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        C0679Ew c0679Ew = this.A01;
        if (c0679Ew != null) {
            c0679Ew.A0R(new SC(this));
            this.A01.A0L();
            this.A01 = null;
        }
        C03611k c03611k = new C03611k(this.A06.A09(), KF.A01(this.A04.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, KC.A08, 1, enumSet);
        c03611k.A05(this.A06.A07());
        c03611k.A06(this.A06.A08());
        c03611k.A03(this.A06.A03());
        this.A01 = new C0679Ew(this.A04, c03611k);
        this.A01.A0R(new SE(this));
        this.A01.A0T(str);
    }

    public final boolean A0C() {
        C0679Ew c0679Ew = this.A01;
        return c0679Ew == null || c0679Ew.A0X();
    }

    public final boolean A0D() {
        return this.A03;
    }

    public final boolean A0E() {
        AdError adError = AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A03) {
            this.A04.A0A().A2d(C0848Lr.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A05.onError(this.A06.A01(), adError);
            return false;
        }
        C0679Ew c0679Ew = this.A01;
        if (c0679Ew == null) {
            this.A04.A04().A86(A05(130, 3, 62), C05228d.A0H, new C05238e(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A04.A0A().A2d(C0848Lr.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A05.onError(this.A06.A01(), adError);
            return false;
        }
        c0679Ew.A0K();
        this.A02 = true;
        this.A03 = false;
        return true;
    }
}
