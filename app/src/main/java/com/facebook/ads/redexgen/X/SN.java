package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SN implements InterfaceC03711u {
    public static byte[] A04;
    public static String[] A05;
    public final SB A00;
    public final InterfaceC03661p A01;
    public final C03731w A02;
    public final X2 A03;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{57, 28, 88, DateTimeFieldType.MILLIS_OF_SECOND, 26, DateTimeFieldType.MINUTE_OF_DAY, 29, 27, 12, 88, DateTimeFieldType.HOUR_OF_DAY, 11, 88, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 56, 47, 52, 62, 54, 63, 37, 63, 34, 46, 40, 59, 41, 37, 49, 63, 35, 9, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 58, 43, 38, 42, 33, 44, 42, 1, 42, 59, 56, 32, 61, 36, 98, 101, 127, 116, 110, 121, 121, 100, 121, 116, 104, 100, 111, 110, 116, 96, 110, 114, DateTimeFieldType.HOUR_OF_HALFDAY, 9, DateTimeFieldType.MINUTE_OF_HOUR, 24, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_DAY, 24, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 3, 2, 8, 24, 3, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 6, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, 8, 9, 24, 12, 2, 30, 111, 108, 109, 100, 124, 106, 109, 117, 98, 111, 106, 103, 98, 119, 106, 108, 109, 124, 119, 106, 110, 102, 124, 104, 102, 122, 59, DateTimeFieldType.MINUTE_OF_HOUR, 5, 5, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 76, 86, 96, 68, 94, 94, 68, 67, 74, DateTimeFieldType.HALFDAY_OF_DAY, 79, 88, 67, 73, 65, 72, DateTimeFieldType.HALFDAY_OF_DAY, 75, 66, 95, DateTimeFieldType.HALFDAY_OF_DAY, 64, 72, 94, 94, 76, 74, 72, 8, 44, 54, 54, 44, 43, 34, 101, 39, 48, 43, 33, 41, 32, 101, 35, 42, 55, 101, 40, 32, 54, 54, 36, 34, 32, 107, 90, 93, 91, 86, 76, 91, 91, 70, 91, 86, 68, 76, 90, 90, 72, 78, 76, 86, 66, 76, 80, 5, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY};
        String[] strArr = A05;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "11z8nLjTbJ8kXGgkHyQ0qsLYj80GB6ec";
        strArr2[2] = "E5wc";
    }

    public static void A02() {
        A05 = new String[]{"l1o30ubgNMqwIxdsvAhdwl", "uEolzpc8zYF03u8DLAeDfs0A9wQx2vsd", "zKwy", "mFz9Za5MD8BXE4Lkxv", "Wms6Ep20", BuildConfig.FLAVOR, "s6yiLC", "izOiniaIEQHycLDhhOkzL"};
    }

    public SN(X2 x2, C03731w c03731w, InterfaceC03661p interfaceC03661p, SB sb) {
        this.A03 = x2;
        this.A02 = c03731w;
        this.A01 = interfaceC03661p;
        this.A00 = sb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03711u
    public final void A7N(Message message) {
        RewardedVideoAd rewardedVideoAdA01 = this.A02.A01();
        String strA00 = A00(203, 3, 16);
        if (rewardedVideoAdA01 == null) {
            this.A03.A04().A86(strA00, C05228d.A0A, new C05238e(A00(0, 17, 12)));
            return;
        }
        int i2 = message.what;
        String strA002 = A00(120, 9, 2);
        String strA003 = A00(17, 17, 14);
        if (i2 != 10) {
            if (i2 == 2100) {
                this.A01.AD3();
                Bundle bundle = message.getData().getBundle(strA003);
                if (bundle != null) {
                    this.A02.A01 = bundle.getLong(A00(94, 26, 87));
                    this.A02.A00 = bundle.getInt(A00(69, 25, 51));
                } else {
                    this.A03.A04().A86(strA00, C05228d.A0K, new C05238e(A00(129, 26, 89), strA002 + message));
                }
                this.A02.A02(null);
            } else if (i2 != 2103) {
                if (i2 == 2106) {
                    this.A01.AD9();
                    this.A02.A02(null);
                } else if (i2 != 2010) {
                }
            }
            RewardedVideoAdListener rewardedVideoAdListener = this.A02.A04;
            String[] strArr = A05;
            if (strArr[6].length() != strArr[7].length()) {
                String[] strArr2 = A05;
                strArr2[6] = "eimvHB";
                strArr2[7] = "9nAYjps8XJWkdVKe7ORqJ";
                if (rewardedVideoAdListener == null) {
                    return;
                }
                int i3 = message.what;
                if (i3 == 2100) {
                    this.A02.A04.onAdLoaded(rewardedVideoAdA01);
                    return;
                }
                if (i3 != 2110) {
                    switch (i3) {
                        case 2104:
                            this.A02.A04.onAdClicked(rewardedVideoAdA01);
                            return;
                        case 2105:
                            this.A02.A04.onLoggingImpression(rewardedVideoAdA01);
                            String[] strArr3 = A05;
                            if (strArr3[0].length() != strArr3[5].length()) {
                                String[] strArr4 = A05;
                                strArr4[6] = "WCvtTN";
                                strArr4[7] = "y4UVYSvKEMUJHaNV8tet5";
                                return;
                            }
                            return;
                        case 2106:
                            if (this.A02.A04 instanceof RewardedVideoAdExtendedListener) {
                                RewardedVideoAdListener rewardedVideoAdListener2 = this.A02.A04;
                                String[] strArr5 = A05;
                                if (strArr5[3].length() != strArr5[4].length()) {
                                    String[] strArr6 = A05;
                                    strArr6[1] = "xBcXcH1FIqV1K6GDcI0Fko4DemMWRriz";
                                    strArr6[2] = "Y9fB";
                                    ((RewardedVideoAdExtendedListener) rewardedVideoAdListener2).onRewardedVideoActivityDestroyed();
                                    return;
                                }
                            } else {
                                return;
                            }
                        default:
                            switch (i3) {
                                case 3000:
                                    this.A02.A04.onRewardedVideoCompleted();
                                    return;
                                case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                                    if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                                        ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerSuccess();
                                        return;
                                    }
                                    return;
                                case 3002:
                                    if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                                        ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerFailed();
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                    }
                } else {
                    this.A02.A04.onRewardedVideoClosed();
                    return;
                }
            }
            throw new RuntimeException();
        }
        Bundle data = message.getData();
        String[] strArr7 = A05;
        if (strArr7[1].length() == strArr7[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr8 = A05;
        strArr8[1] = "xhuyCPLYH2PKP53E98JhdsnjasrGKyBu";
        strArr8[2] = "IOLF";
        Bundle bundle2 = data.getBundle(strA003);
        if (bundle2 != null) {
            int i4 = bundle2.getInt(A00(51, 18, 95));
            String string = bundle2.getString(A00(182, 21, 125));
            AdError adError = new AdError(i4, string);
            this.A01.ACz(adError);
            if (this.A02.A04 != null) {
                this.A02.A04.onError(rewardedVideoAdA01, adError);
            } else {
                Log.e(A00(34, 17, 59), string);
            }
        } else {
            this.A01.ACw(EnumC03651o.A05);
            this.A03.A04().A86(strA00, C05228d.A0K, new C05238e(A00(155, 27, 49), strA002 + message));
        }
        this.A02.A02(null);
    }
}
