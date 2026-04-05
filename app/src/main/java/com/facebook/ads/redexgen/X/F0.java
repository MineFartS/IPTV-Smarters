package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.joda.time.DateTimeFieldType;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F0 extends AbstractC0992Rh implements InterfaceC03470w {
    public static byte[] A0C;
    public static String[] A0D;
    public long A00;
    public AnonymousClass12 A01;
    public AnonymousClass13 A02;
    public AnonymousClass16 A03;
    public X2 A04;
    public C0789Jg A05;
    public EnumC0814Kg A06;
    public String A07;

    @Nullable
    public String A08;
    public String A09;
    public final String A0A = UUID.randomUUID().toString();
    public final AtomicBoolean A0B = new AtomicBoolean();

    static {
        A06();
        A05();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0C = new byte[]{56, 52, 54, 54, 48, 57, 48, 39, 58, 56, 48, 33, 48, 39, 10, 39, 58, 33, 52, 33, 60, 58, 59, 110, 97, 100, 104, 99, 121, 89, 98, 102, 104, 99, DateTimeFieldType.HOUR_OF_HALFDAY, 11, 30, 11, 77, 76, 79, 64, 71, 64, 93, 64, 70, 71, DateTimeFieldType.HOUR_OF_DAY, 25, 24, DateTimeFieldType.SECOND_OF_MINUTE, 29, 8, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 56, 29, 8, 29, 87, 75, 70, 68, 66, 74, 66, 73, 83, 110, 67, 6, 4, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.CLOCKHOUR_OF_DAY, 31, 24, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 57, 4, 31, DateTimeFieldType.MINUTE_OF_HOUR, 24, 2, DateTimeFieldType.MILLIS_OF_SECOND, 2, 31, 25, 24, 61, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 104, 127, 107, 111, 127, 105, 110, 78, 115, 119, 127, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 28, 10, 25, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 56, DateTimeFieldType.HOUR_OF_HALFDAY, 25, 29, DateTimeFieldType.HOUR_OF_HALFDAY, 25, 62, 57, 39, 87, 64, 82, 68, 87, 65, 64, 65, 115, 76, 65, 64, 74, 100, 65, 97, 68, 81, 68, 103, 80, 75, 65, 73, 64, 123, 108, 126, 104, 123, 109, 108, 109, 86, 127, 96, 109, 108, 102, 80, 75, 76, 84, 80, 64, 108, 65, 88, 71, 75, 89, 122, 87, 94, 75};
    }

    public static void A06() {
        A0D = new String[]{"YJVWhBFSVFKs7NrWmWULGh", "0GvTyPfIpVaCupDTXIuhVv", "vKmpQ0k2zgunQxdAFsx7Wlk6dmYtSCUc", "dqRYVPDeGy45RCRFCWIUPRHRtp9NBigI", "NSweCua6lZ8ChPFZ3cKnaOBscLcsrWLc", "HenZyTRrHhMHTWT00jKprDJGPW9d4C4V", "lvvcgtkpn6JHhS0LrJ19j3FN0lJsZZOv", "GmBDkEWrzwPugE8SLtTHysECIxUFQGpg"};
    }

    private void A03() {
        C2F c2fA00 = C2F.A00(this.A04);
        AnonymousClass13 anonymousClass13 = this.A02;
        c2fA00.A07(anonymousClass13, anonymousClass13.A01());
    }

    private void A04() {
        if (this.A02 != null) {
            try {
                C2F.A00(this.A04).A06(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A07(Intent intent) {
        int i2 = super.A00;
        String strA01 = A01(72, 24, 8);
        if (i2 != -1) {
            ContentResolver contentResolver = this.A04.getContentResolver();
            if (A0D[3].charAt(29) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[7] = "ryaiaZaF8EzuUPZd67FeoIG9jUALGHZG";
            strArr[6] = "XITZtpYy2wf6QHmOozCOnY6Xlkm3ca51";
            if (Settings.System.getInt(contentResolver, A01(1, 22, 43), 0) != 1) {
                int i3 = super.A00;
                if (A0D[2].charAt(2) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[1] = "mo2n49jFbf8CHvb7nubztA";
                strArr2[0] = "3h0LYrxRFByrgEG7Z48zJG";
                intent.putExtra(strA01, i3);
                return;
            }
        }
        if (!JT.A0b(this.A04)) {
            intent.putExtra(strA01, 6);
        }
    }

    private void A08(boolean z) {
        if (this.A06 == EnumC0814Kg.A0B) {
            A0A(z);
            return;
        }
        EnumC0814Kg enumC0814Kg = this.A06;
        String[] strArr = A0D;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[4] = "1yOiFacRiwJanRzqDJ6A5hJ77lYfziAe";
        strArr2[5] = "McEelBumOV7dKb1zb6BdvUT5HG6VvrgI";
        if (enumC0814Kg == EnumC0814Kg.A0A) {
            A09(z);
        } else {
            A0A(z);
        }
    }

    private void A09(boolean z) {
        C0987Rc c0987Rc = new C0987Rc(this, this);
        C7C c7c = new C7C(this.A04);
        C03541d c03541d = new C03541d(this, this.A03, A01(147, 14, 119), c7c);
        if (c03541d.A09()) {
            c7c.A0X(new C0789Jg(this.A03.A0Q(), this.A04.A06()));
            c03541d.A08();
        } else {
            C03591i.A03(this.A04, this.A03, z, c0987Rc);
        }
    }

    private void A0A(boolean z) {
        C7C c7c = new C7C(this.A04);
        c7c.A0X(this.A05);
        AnonymousClass16 anonymousClass16 = this.A03;
        String strA01 = A01(147, 14, 119);
        C03541d c03541d = new C03541d(this, anonymousClass16, strA01, c7c);
        if (c03541d.A09()) {
            c03541d.A08();
            return;
        }
        C0997Rm c0997Rm = (C0997Rm) this.A03;
        if (TextUtils.isEmpty(c0997Rm.A0M().A0E().A08())) {
            this.A01.AAu(this, AdError.INTERNAL_ERROR);
        } else {
            C03601j.A02(c7c, c0997Rm);
            c7c.A0Q(new F1(this, z, this), new AnonymousClass75(c0997Rm.A0U(), strA01));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0992Rh
    public final int A0B() {
        AnonymousClass16 anonymousClass16 = this.A03;
        if (anonymousClass16 != null) {
            return anonymousClass16.A0J();
        }
        String[] strArr = A0D;
        if (strArr[4].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[3] = "zy8kAWNFspHhc9OUOOhBHMIK4AaCMilm";
        strArr2[3] = "zy8kAWNFspHhc9OUOOhBHMIK4AaCMilm";
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0992Rh
    public final boolean A0C() {
        if (!this.A0B.get()) {
            return false;
        }
        String strA03 = C0932Oz.A03(super.A01, this.A0A, this.A07);
        this.A03.A0a(super.A01);
        this.A03.A0d(strA03);
        AdActivityIntent adActivityIntentA04 = LB.A04(this.A04);
        adActivityIntentA04.putExtra(A01(169, 8, 80), this.A06);
        adActivityIntentA04.putExtra(A01(122, 25, 91), this.A03);
        adActivityIntentA04.putExtra(A01(161, 8, 91), this.A0A);
        if (strA03 != null) {
            adActivityIntentA04.putExtra(A01(107, 15, 21), strA03);
        }
        adActivityIntentA04.putExtra(A01(61, 11, 89), this.A09);
        adActivityIntentA04.putExtra(A01(96, 11, 100), this.A00);
        String str = this.A08;
        if (str != null) {
            adActivityIntentA04.putExtra(A01(48, 13, 2), str);
        }
        A07(adActivityIntentA04);
        adActivityIntentA04.setFlags(adActivityIntentA04.getFlags() | 268435456);
        adActivityIntentA04.putExtra(A01(23, 11, 115), this.A03.A0Q());
        LB.A0A(this.A04, adActivityIntentA04);
        return true;
    }

    public final void A0D(X2 x2, AnonymousClass12 anonymousClass12, Map<String, Object> map, boolean z, @Nullable String str, @Nullable String str2) {
        String strA01;
        this.A0B.set(false);
        this.A04 = x2;
        this.A01 = anonymousClass12;
        this.A09 = (String) map.get(A01(61, 11, 89));
        this.A00 = ((Long) map.get(A01(96, 11, 100))).longValue();
        this.A08 = str2;
        String str3 = this.A09;
        if (str3 == null) {
            strA01 = A01(0, 0, 20);
        } else {
            if (A0D[2].charAt(2) != 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[7] = "e6RM8yaPLIljQgE3BUpQbpnA92TvZvU8";
            strArr[6] = "ffjbG0C858y3IrNljjKglLsYE4qM5rpD";
            strA01 = str3.split(A01(0, 1, 25))[0];
        }
        this.A07 = strA01;
        this.A03 = C0997Rm.A01((JSONObject) map.get(A01(34, 4, 20)));
        this.A03.A0b(str);
        this.A03.A0Z(((C05418w) map.get(A01(38, 10, 87))).A06());
        this.A05 = new C0789Jg(this.A03.A0Q(), x2.A06());
        if (!TextUtils.isEmpty(this.A03.A0R()) && Build.VERSION.SDK_INT >= 21) {
            this.A06 = EnumC0814Kg.A04;
            this.A04.A0A().ADA(EnumC03280d.A05);
        } else {
            int iA0I = this.A03.A0I();
            if (iA0I == 0) {
                this.A06 = EnumC0814Kg.A0B;
                this.A04.A0A().ADA(EnumC03280d.A08);
            } else if (iA0I == 1) {
                this.A06 = EnumC0814Kg.A0A;
                this.A04.A0A().ADA(EnumC03280d.A07);
            }
        }
        this.A02 = new AnonymousClass13(this.A0A, this, anonymousClass12);
        A03();
        A08(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03380n
    public final String A5l() {
        return this.A03.A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03470w
    public final void A9A() {
        this.A0B.set(true);
        this.A01.AAr(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03470w
    public final void A9B() {
        this.A01.AAu(this, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03380n
    public final void onDestroy() {
        A04();
    }
}
