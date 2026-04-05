package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KX {
    public static byte[] A0F;
    public static String[] A0G;
    public int A00;

    @Nullable
    public AdExperienceType A01;
    public C8C A02;
    public KA A03;
    public KD A04;

    @Nullable
    public C0834Lc A05;

    @Nullable
    public String A06;
    public String A07;

    @Nullable
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final AdPlacementType A0C;
    public final KI A0D;

    @Nullable
    public final String A0E;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{-38, -68, -52, -49, -22, -48, -29, -37, -48, -35, -44, -48, -39, -50, -48, -22, -33, -28, -37, -48, -91, -88, -61, -74, -87, -76, -77, -74, -72, -83, -78, -85, -61, -89, -77, -78, -86, -83, -85, -61, -80, -91, -73, -72, -61, -71, -76, -88, -91, -72, -87, -61, -72, -83, -79, -87, DateTimeFieldType.MINUTE_OF_HOUR, 26, DateTimeFieldType.SECOND_OF_MINUTE, 48, 26, DateTimeFieldType.SECOND_OF_MINUTE, 10, DateTimeFieldType.HOUR_OF_DAY, 12, 39, 28, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HALFDAY_OF_DAY, 39, 28, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, -31, -22, -25, -29, -20, -14, -3, -16, -29, -17, -13, -29, -15, -14, -3, -25, -30, -29, -17, -16, -16, -31, -72, -71, -63, -61, -45, -75, -72, -45, -67, -72, -49, -30, -34, -36, -53, -23, -46, -45, -40, -34, -35, DateTimeFieldType.HOUR_OF_HALFDAY, 11, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 26, -15, -20, -18, -23, -5, -10, -8, -13, DateTimeFieldType.HOUR_OF_DAY, -8, -2, -13, -7, -65, -55, -43, -61, -53, -62, -54, -65, -43, -73, -70, -43, -69, -50, -58, -69, -56, -65, -69, -60, -71, -69, -2, -6, DateTimeFieldType.MINUTE_OF_DAY, 5, -8, 6, 7, 5, -4, -10, 7, -8, -9, -11, -4, -12, 6, -24, -21, -6, 6, -7, -20, -8, -4, -20, -6, -5, -20, -21, -39, -43, -54, -52, -50, -42, -50, -41, -35, -24, -46, -51, 24, DateTimeFieldType.SECOND_OF_DAY, 9, 11, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 28, 39, 28, 33, 24, DateTimeFieldType.HALFDAY_OF_DAY, -84, -97, -85, -81, -97, -83, -82, -71, -82, -93, -89, -97, -56, -55, -74, -72, -64, -44, -55, -57, -74, -72, -70, 41, 26, 34, 37, 33, DateTimeFieldType.MILLIS_OF_DAY, 41, 26, 52, 30, 25, 29, DateTimeFieldType.HOUR_OF_HALFDAY, 28, 29, 40, DateTimeFieldType.MILLIS_OF_DAY, 24, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, -46, -60, -65, -49, -61};
    }

    public static void A02() {
        A0G = new String[]{"D9utVieqpHmzq", "1reJ20tywIkt8c03XFg68iFkPgUpcQh9", "1hiVgm3FzyAWthqubctijKn7iSl8t7OZ", "2MGbhVYWK6vnLzanQZMPK5FLJbU6N2Mg", "tHlP6Jv5sj70nCQXOaNATx3kiWqPf1Tp", "kSrICwDX6P2QTtBsWrInLj9wi3Ca9feR", "Z5GcmA6HHHf7tKUPWv2sbOMAsuTj15Gl", "CZogAanemwBaq"};
    }

    public KX(C8C c8c, String str, @Nullable C0834Lc c0834Lc, KD kd, @Nullable String str2, int i2, boolean z, boolean z2, KI ki, @Nullable String str3, @Nullable String str4, @Nullable AdExperienceType adExperienceType) {
        this.A02 = c8c;
        this.A07 = str;
        this.A05 = c0834Lc;
        this.A04 = kd;
        this.A0E = str2;
        this.A00 = i2;
        this.A0B = z;
        this.A09 = z2;
        this.A0D = ki;
        this.A03 = KA.A00(kd);
        this.A0C = this.A03.A03();
        this.A08 = str3;
        this.A06 = str4;
        this.A01 = adExperienceType;
    }

    private void A03(Map<String, String> params, String str, String str2) {
        params.put(str, str2);
    }

    public final int A04() {
        return this.A00;
    }

    public final KA A05() {
        return this.A03;
    }

    public final KD A06() {
        return this.A04;
    }

    @Nullable
    public final C0834Lc A07() {
        return this.A05;
    }

    public final String A08() {
        return this.A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> A09(java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.KX.A09(java.util.Map):java.util.Map");
    }
}
