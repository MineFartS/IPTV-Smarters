package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SJ implements InterfaceC03681r {
    public static byte[] A07;
    public static String[] A08;
    public static final String A09;
    public C0676Et A02;

    @Nullable
    public String A03;
    public final S2SRewardedVideoAdExtendedListener A05;
    public final C03731w A06;
    public int A00 = 0;
    public boolean A04 = false;
    public long A01 = -1;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{120, 87, 25, 88, 93, 25, 85, 86, 88, 93, 25, 80, 74, 25, 88, 85, 75, 92, 88, 93, 64, 25, 80, 87, 25, 73, 75, 86, 94, 75, 92, 74, 74, DateTimeFieldType.MILLIS_OF_SECOND, 25, 96, 86, 76, 25, 74, 81, 86, 76, 85, 93, 25, 78, 88, 80, 77, 25, 95, 86, 75, 25, 88, 93, 117, 86, 88, 93, 92, 93, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, 77, 86, 25, 91, 92, 25, 90, 88, 85, 85, 92, 93, 47, 24, 24, 5, 24, 74, 6, 5, 11, DateTimeFieldType.HOUR_OF_HALFDAY, 3, 4, DateTimeFieldType.HALFDAY_OF_DAY, 74, 24, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 29, 11, 24, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 74, 28, 3, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 5, 74, 11, DateTimeFieldType.HOUR_OF_HALFDAY, 92, 77, 84};
        if (A08[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[4] = "OGOVhUIoezz1oHK";
        strArr[0] = "xl2MkcRK0CWEWUY";
    }

    public static void A07() {
        A08 = new String[]{"gd6Snq8TqC5qGLc", "5Vo8FrFWo5Fl4YG5W1yHT6ZfMsOXSACT", "HYpFHiAeuVvng5d4eXQK0awgijL0SEef", "zgL9OdntC9Jt", "c4pha1QVXZPHNWU", "oPtBq8V8zceab2K03f0YSkruz1vfGvQp", "tGZii7gSURWSZ1CI0FSKqsks", "YmWpveYB3lCv"};
    }

    static {
        A07();
        A06();
        A09 = SJ.class.getSimpleName();
    }

    public SJ(C03731w c03731w, InterfaceC03761z interfaceC03761z, String str) {
        this.A06 = c03731w;
        this.A05 = new SQ(str, interfaceC03761z, this, c03731w);
    }

    private void A09(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        if (!this.A04 && this.A02 != null) {
            Log.w(A09, A04(0, 78, 100));
        }
        A0A(false);
        this.A04 = false;
        C03611k c03611k = new C03611k(this.A06.A0C, KD.A07, AdPlacementType.REWARDED_VIDEO, KC.A08, 1);
        c03611k.A07(z);
        c03611k.A05(this.A06.A06);
        c03611k.A06(this.A06.A07);
        this.A02 = new C0676Et(this.A06.A0B, c03611k);
        this.A02.A0R(new SH(this));
        this.A02.A0U(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(boolean z) {
        C0676Et c0676Et = this.A02;
        if (c0676Et != null) {
            c0676Et.A0R(new SI(this));
            this.A02.A0W(z);
            this.A02 = null;
        }
    }

    public final long A0C() {
        C0676Et c0676Et = this.A02;
        if (c0676Et != null) {
            return c0676Et.A0F();
        }
        return -1L;
    }

    public final void A0D() {
        A0A(true);
    }

    public final void A0E(RewardData rewardData) {
        this.A06.A03 = rewardData;
        if (this.A04) {
            this.A02.A0Y(rewardData);
        }
    }

    public final void A0F(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        this.A01 = System.currentTimeMillis();
        try {
            A09(str, adExperienceType, z);
        } catch (Exception e2) {
            Log.e(A09, A04(78, 31, 55), e2);
            this.A06.A0B.A04().A86(A04(109, 3, 96), C05228d.A0Q, new C05238e(e2));
            AdError adErrorInternalError = AdError.internalError(AdError.INTERNAL_ERROR_2004);
            this.A06.A0B.A0A().A2d(C0848Lr.A01(this.A01), adErrorInternalError.getErrorCode(), adErrorInternalError.getErrorMessage());
            this.A05.onError(this.A06.A01(), adErrorInternalError);
        }
    }

    public final boolean A0G() {
        C0676Et c0676Et = this.A02;
        return c0676Et == null || c0676Et.A0X();
    }

    public final boolean A0H() {
        return this.A04;
    }

    public final boolean A0I(int i2) {
        if (!this.A04) {
            this.A05.onError(this.A06.A01(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            String[] strArr = A08;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[2] = "i4TgsteijYTgF3ZXWgh52CAoLdUIST6S";
            strArr2[1] = "KfQZimx5EO3wO5BoFkpX8kIEmrokSzla";
            return false;
        }
        C0676Et c0676Et = this.A02;
        if (c0676Et != null) {
            c0676Et.A08.A02(i2);
            this.A02.A0K();
            this.A04 = false;
            return true;
        }
        this.A04 = false;
        return false;
    }
}
