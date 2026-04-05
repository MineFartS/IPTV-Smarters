package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.UUID;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RZ implements InterfaceC03380n, C1Y {
    public static byte[] A0B;
    public static String[] A0C;
    public long A00;
    public RewardData A01;
    public InterfaceC03480x A02;
    public C03490y A03;
    public C1000Rp A04;
    public X2 A05;
    public String A06;

    @Nullable
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    static {
        A06();
        A05();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {78, 108, 99, 42, 121, 45, 126, 121, 108, 127, 121, 45, 76, 120, 105, 100, 104, 99, 110, 104, 67, 104, 121, 122, 98, 127, 102, 76, 110, 121, 100, 123, 100, 121, 116, 35, 45, 64, 108, 102, 104, 45, 126, 120, 127, 104, 45, 121, 101, 108, 121, 45, 100, 121, 42, 126, 45, 100, 99, 45, 116, 98, 120, 127, 45, 76, 99, 105, 127, 98, 100, 105, 64, 108, 99, 100, 107, 104, 126, 121, 35, 117, 96, 97, 45, 107, 100, 97, 104, 35, 73, 77, 78, 122, 107, 102, 106, 97, 108, 106, 65, 106, 123, 120, 96, 125, 100, 68, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 93, 82, 87, 91, 80, 74, 106, 81, 85, 91, 80, DateTimeFieldType.HOUR_OF_DAY, 25, 24, DateTimeFieldType.SECOND_OF_MINUTE, 29, 8, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 56, 29, 8, 29, 52, 40, 37, 39, 33, 41, 33, 42, 48, DateTimeFieldType.HALFDAY_OF_DAY, 32, 4, 6, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 29, 26, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 59, 6, 29, DateTimeFieldType.HOUR_OF_DAY, 26, 0, DateTimeFieldType.SECOND_OF_MINUTE, 0, 29, 27, 26, 63, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 117, 98, 118, 114, 98, 116, 115, 83, 110, 106, 98, 29, 6, 1, 25, 29, DateTimeFieldType.HALFDAY_OF_DAY, 33, 12, 38, 57, 53, 39, 4, 41, 32, 53, 80, 78, 73, 67, 72, 80};
        if (A0C[1].charAt(29) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "6qgGoSyjmuhDFT94hunOHzgd3UUS7LMQ";
        strArr[0] = "q1PjRK7gg6WFD8n4pAFO870HLaNMi7ir";
        A0B = bArr;
    }

    public static void A06() {
        A0C = new String[]{"PgLDGrk3t3a26fQCrT3IpIrRB5PMNBKm", "uls9HIPpriPjzjIXJVTR7HWmS4IMGzWu", "f2YRmtND2fanruA3kJYGXgN9aGwgjawI", "EZdssni07U2TMPMup9RmA63S0tAhTBNo", "xilKUxawUAlWzUTJOedtCKHAHwNBDRxA", "SxIuirRfQS0L7ik0LzQXw", "dF8CYh", "NQmOIXzIEfwTEqDrM9Z7TuMEUTKSiMNX"};
    }

    private int A00() {
        int rotation = ((WindowManager) this.A05.getSystemService(A03(205, 6, 47))).getDefaultDisplay().getRotation();
        EnumC0898Nq adOrientation = A02();
        if (adOrientation == EnumC0898Nq.A06) {
            return -1;
        }
        if (adOrientation == EnumC0898Nq.A04) {
            if (rotation != 2 && rotation != 3) {
                return 0;
            }
            if (A0C[1].charAt(29) == 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "WCZdwi0h9oyTFk4ywD5LtkOxTOpQ29Yc";
            strArr[7] = "4yy96Y2PoNFTEE84mLwUlYETryPZgGhE";
            return 8;
        }
        if (rotation != 2) {
            return 1;
        }
        return 9;
    }

    private final EnumC0814Kg A01() {
        return this.A04.A0A();
    }

    private EnumC0898Nq A02() {
        return this.A04.A0B();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A07(Intent intent) {
        C1000Rp c1000Rp = this.A04;
        RewardData rewardData = this.A01;
        c1000Rp.A0E(intent, rewardData, C0932Oz.A03(rewardData, this.A0A, this.A06));
    }

    private final void A08(X2 x2, InterfaceC03480x interfaceC03480x, Map<String, Object> map, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        this.A04 = new C1000Rp(x2, map, this, str);
        this.A04.A0F(x2, enumSet);
    }

    private void A09(EnumC0814Kg enumC0814Kg) {
        if (enumC0814Kg.equals(EnumC0814Kg.A06)) {
            this.A05.A0A().ADA(EnumC03280d.A03);
            return;
        }
        if (enumC0814Kg.equals(EnumC0814Kg.A07)) {
            this.A05.A0A().ADA(EnumC03280d.A06);
            return;
        }
        if (enumC0814Kg.equals(EnumC0814Kg.A09)) {
            this.A05.A0A().ADA(EnumC03280d.A08);
            return;
        }
        if (enumC0814Kg.equals(EnumC0814Kg.A08)) {
            this.A05.A0A().ADA(EnumC03280d.A07);
            return;
        }
        if (!enumC0814Kg.equals(EnumC0814Kg.A03)) {
            return;
        }
        if (this.A04.A0G()) {
            C0S c0sA0A = this.A05.A0A();
            String[] strArr = A0C;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[2] = "SZ1DhKHJxqFOmux8c4F7iNiG5ZFRRvjL";
            strArr2[2] = "SZ1DhKHJxqFOmux8c4F7iNiG5ZFRRvjL";
            c0sA0A.ADA(EnumC03280d.A05);
            return;
        }
        this.A05.A0A().ADA(EnumC03280d.A04);
    }

    public final void A0A(X2 x2, InterfaceC03480x interfaceC03480x, Map<String, Object> map, EnumSet<CacheFlag> enumSet, @Nullable String str, @Nullable String str2, @Nullable RewardData rewardData) {
        String strA03;
        this.A05 = x2;
        this.A02 = interfaceC03480x;
        this.A08 = (String) map.get(A03(143, 11, 76));
        String str3 = this.A08;
        if (str3 != null) {
            strA03 = str3.split(A03(107, 1, 19))[0];
        } else {
            if (A0C[2].charAt(13) != 'u') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[1] = "jgXU3SqF8Uv0ED4x1YEVN8i2uqYthAt6";
            strArr[1] = "jgXU3SqF8Uv0ED4x1YEVN8i2uqYthAt6";
            strA03 = A03(0, 0, 5);
        }
        this.A06 = strA03;
        this.A00 = ((Long) map.get(A03(178, 11, 15))).longValue();
        this.A07 = str2;
        this.A01 = rewardData;
        A08(x2, interfaceC03480x, map, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            InterfaceC03480x interfaceC03480x = this.A02;
            if (interfaceC03480x != null) {
                interfaceC03480x.A9s(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent adActivityIntentA04 = LB.A04(this.A05);
        adActivityIntentA04.putExtra(A03(154, 24, 124), A00());
        adActivityIntentA04.putExtra(A03(189, 8, 96), this.A0A);
        adActivityIntentA04.putExtra(A03(143, 11, 76), this.A08);
        adActivityIntentA04.putExtra(A03(178, 11, 15), this.A00);
        EnumC0814Kg enumC0814KgA01 = A01();
        A09(enumC0814KgA01);
        adActivityIntentA04.putExtra(A03(197, 8, 88), enumC0814KgA01);
        String str = this.A07;
        if (str != null) {
            adActivityIntentA04.putExtra(A03(130, 13, 116), str);
        }
        A07(adActivityIntentA04);
        adActivityIntentA04.addFlags(268435456);
        adActivityIntentA04.putExtra(A03(119, 11, 54), this.A04.A0C());
        try {
            LB.A0A(this.A05, adActivityIntentA04);
            return true;
        } catch (ActivityNotFoundException e2) {
            this.A05.A04().A86(A03(108, 11, 76), C05228d.A05, new C05238e(e2));
            Log.e(A03(90, 17, 7), A03(0, 90, 5), e2);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03380n
    @Nullable
    public final String A5l() {
        return this.A04.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03380n
    public final AdPlacementType A6l() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void A8p(AdError adError) {
        InterfaceC03480x interfaceC03480x = this.A02;
        if (interfaceC03480x != null) {
            interfaceC03480x.A9s(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void A8q() {
        A04();
        this.A02.A9r(this);
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void ACD() {
        this.A03 = new C03490y(this.A05, this.A0A, this, this.A02);
        this.A03.A03();
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void ADe() {
        C03490y c03490y = this.A03;
        if (c03490y != null) {
            c03490y.A04();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03380n
    public final void onDestroy() {
        C1000Rp c1000Rp = this.A04;
        if (c1000Rp != null) {
            c1000Rp.A0D();
        }
    }
}
