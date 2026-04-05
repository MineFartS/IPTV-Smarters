package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S8 implements InterfaceC03661p {
    public static byte[] A04;
    public static String[] A05;
    public EnumC03651o A00 = EnumC03651o.A03;
    public EnumC03651o A01 = EnumC03651o.A03;
    public final SB A02;
    public final X2 A03;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A05;
            if (strArr[7].charAt(1) != strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "d2XCtNqKB2PlkmIVLWNasBjUSsZJOiBr";
            strArr2[0] = "d2XCtNqKB2PlkmIVLWNasBjUSsZJOiBr";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 29);
            i5++;
        }
    }

    public static void A01() {
        A04 = new byte[]{-73, 11, 6, -73, 118, 104, -95, -73, -67, 104, -85, -87, -74, 104, -85, -80, -87, -74, -81, -83, 104, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, 104, -115, -70, -70, -73, -70, 104, -75, -73, -84, -83, 104, -86, -63, 104, -69, -83, -68, -68, -79, -74, -81, 104, -119, -84, -101, -83, -68, -68, -79, -74, -81, -69, 118, -69, -83, -68, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, -115, -70, -70, -73, -70, -107, -73, -84, -83, 112, 113, 112, 108, 107, -97, -114, -109, -113, -104, -115, -113, 120, -113, -98, -95, -103, -100, -107, -103, -59, -62, -64, 115, -41, -14, -17, -18, -25, -96, -23, -18, -12, -27, -14, -18, -31, -20, -96, -12, -14, -31, -18, -13, -23, -12, -23, -17, -18, -82, -15, 0, -7, -67, -64, -78, -75, 121, 122, -63, -74, -67, -59, 118, 119, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 3, -4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -69, 4, DateTimeFieldType.HOUR_OF_HALFDAY, -69, -4, 7, DateTimeFieldType.HALFDAY_OF_DAY, 0, -4, -1, DateTimeFieldType.SECOND_OF_DAY, -69, -25, -22, -36, -33, -28, -23, -30, -57, -69, -25, -22, -36, -33, -32, -33, -69, 10, DateTimeFieldType.HALFDAY_OF_DAY, -69, -18, -29, -22, -14, -28, -23, -30, -45, -57, -64, -45, 127, -56, -46, 127, -64, -53, -47, -60, -64, -61, -40, 127, -78, -89, -82, -74, -88, -83, -90, -14, -26, -33, -14, -98, -25, -15, -98, -20, -19, -14, -98, -54, -51, -65, -62, -61, -62};
    }

    public static void A02() {
        A05 = new String[]{"iEaWyjzULIZCFnp1nESlU5XZjwcvRjHd", "KbGYZiX8Pduw0KfpYwrRe1NWFWC1OMxy", "fhu9engps4P6WEn4zln6smGq5lQXex4h", "tbT6PfDqIL055", "rKa5gX4b0", "TAsNWcfBygYGmj6nueBPL3we7Mc4FYi0", "mn5595Nd0", "gAb4cPpeQcskkpTdmUE6rt9G8rZq3FNo"};
    }

    public S8(X2 x2, SB sb) {
        this.A03 = x2;
        this.A02 = sb;
    }

    private void A03(EnumC03651o enumC03651o, EnumC03651o enumC03651o2) {
        String strA00 = A00(113, 26, 99);
        String str = A00(108, 5, 54) + enumC03651o + A00(0, 4, 122) + enumC03651o2;
        this.A03.A04().A86(A00(139, 3, 115), C05228d.A0T, new C05238e(strA00, str));
        this.A03.A0A().AE2(strA00 + ' ' + str);
    }

    private void A04(String str, String str2, boolean z) {
        AdSettings.IntegrationErrorMode integrationErrorModeA00 = C03621l.A00(this.A03);
        String str3 = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String strA00 = A00(139, 3, 115);
        String strA002 = A00(91, 17, 13);
        if (!z) {
            Log.e(strA002, str3);
            this.A03.A04().A86(strA00, C05228d.A0R, new C05238e(str3));
            this.A03.A0A().AE1(str3);
            return;
        }
        int i2 = C03641n.A00[integrationErrorModeA00.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.A02.A05();
                this.A02.A06(10, AdErrorType.INCORRECT_STATE_ERROR, str3);
                this.A03.A0A().AE1(str3);
                Log.e(strA002, str3);
                this.A03.A04().A86(strA00, C05228d.A0R, new C05238e(str3));
            }
            Log.e(strA002, str3);
            return;
        }
        throw new C03671q(str3 + A00(4, 87, 43));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03661p
    public final boolean A52() {
        boolean z = (this.A00 == EnumC03651o.A03 || this.A00 == EnumC03651o.A05) && this.A01 != EnumC03651o.A08;
        if (z) {
            this.A00 = EnumC03651o.A07;
        } else {
            A04(A00(142, 6, 52), A00(154, 42, 126), false);
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03661p
    public final boolean A53() {
        boolean z = this.A00 == EnumC03651o.A06 && (this.A01 != EnumC03651o.A08 || JT.A0c(this.A03));
        if (z) {
            this.A00 = EnumC03651o.A03;
            this.A01 = EnumC03651o.A08;
        } else {
            EnumC03651o enumC03651o = this.A00;
            EnumC03651o enumC03651o2 = EnumC03651o.A06;
            String strA00 = A00(148, 6, 49);
            if (enumC03651o != enumC03651o2) {
                A04(strA00, A00(219, 18, 97), true);
            } else {
                A04(strA00, A00(196, 23, 66), false);
            }
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03661p
    public final EnumC03651o A5J() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03661p
    public final void ACw(EnumC03651o enumC03651o) {
        this.A00 = enumC03651o;
        this.A01 = enumC03651o;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03661p
    public final void ACz(AdError adError) {
        this.A00 = EnumC03651o.A05;
        this.A01 = EnumC03651o.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03661p
    public final void AD3() {
        if (this.A00 != EnumC03651o.A07) {
            A03(this.A00, EnumC03651o.A06);
        }
        this.A00 = EnumC03651o.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03661p
    public final void AD9() {
        if (this.A01 != EnumC03651o.A08) {
            A03(this.A00, EnumC03651o.A09);
        }
        this.A01 = EnumC03651o.A09;
    }
}
