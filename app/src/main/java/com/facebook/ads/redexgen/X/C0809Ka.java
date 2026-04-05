package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0809Ka {
    public static byte[] A08;
    public static String[] A09;
    public static final M2 A0A;
    public static final Executor A0B;
    public KX A01;
    public KZ A02;

    @Nullable
    public String A03;
    public Map<String, String> A04;
    public final X2 A05;
    public long A00 = -1;
    public final Kb A06 = Kb.A00();
    public final String A07 = C0812Ke.A00();

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A08 = new byte[]{57, 62, 59, 60, 57, 51, 62, 58, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, 11, 121, 101, DateTimeFieldType.HOUR_OF_DAY, 11, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, DateTimeFieldType.SECOND_OF_DAY, 53, 122, 28, 51, 54, 54, 122, 63, 40, 40, 53, 40, 122, 57, 53, 62, 63, 122, 1, 127, 41, 7, 122, 127, 41, 38, 7, 72, 6, DateTimeFieldType.HALFDAY_OF_DAY, 28, 31, 7, 26, 3, 72, 11, 7, 6, 6, DateTimeFieldType.HALFDAY_OF_DAY, 11, 28, 1, 7, 6, 88, 90, 81, 90, 77, 86, 92, 40, 35, 50, 49, 41, 52, 45, 55, 54, 31, 48, 53, 53, DateTimeFieldType.HOUR_OF_DAY, 54, 54, 50};
    }

    public static void A0D() {
        A09 = new String[]{"jHqhq9rNYSSw", "oXXasJZKheaqJc0eeEDaqL9fqatR6yjH", "HZfV4vlkHnOHSqnfuZFUyeF6uFp1ZMa", "ctGGwCiuI8x2mhpb6iYaTSYvEv38GMVI", "hooRY0JbS2MOmGEMLhPLLpjKFYik6yA6", "UUaZIloNsnWPLtNmJ6BLiWitv8uuoCfe", "8CdfBsPlUzO8votQ5auuotJRUMhSpJIA", "YHWLBZkCs2mlLEga5omnGJot9WkTYHBz"};
    }

    static {
        A0D();
        A0C();
        A0A = new M2();
        A0B = Executors.newCachedThreadPool(A0A);
    }

    public C0809Ka(X2 x2) {
        this.A05 = x2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Q8 A04(long j2) {
        return new C1281b6(this, j2);
    }

    private void A0B() {
        X2 x2 = this.A05;
        if (x2 == null || !QP.A0C(x2)) {
            return;
        }
        C05238e c05238e = new C05238e(A06(8, 5, 107));
        c05238e.A03(1);
        this.A05.A04().A86(A06(107, 7, 22), C05228d.A1b, c05238e);
    }

    private void A0E(int i2, String str) {
        String strA06 = A06(114, 10, 9);
        KL.A05(strA06, A06(37, 16, 122), A06(0, 8, 90));
        KL.A04(strA06, String.format(Locale.US, A06(53, 26, 10), Integer.valueOf(i2), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(K7 k7) {
        KZ kz = this.A02;
        if (kz != null) {
            kz.A9b(k7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(K7 k7) {
        ExecutorC0851Lu.A00(new C1264ap(this, k7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(C1256ah c1256ah) {
        KZ kz = this.A02;
        if (kz != null) {
            kz.AB5(c1256ah);
        }
    }

    private void A0N(C1256ah c1256ah) {
        InterfaceC0967Qi interfaceC0967QiA0C;
        ExecutorC0851Lu.A00(new C1267as(this, c1256ah));
        if (JT.A1M(this.A05) && (interfaceC0967QiA0C = C1140Xb.A02().A0C()) != null) {
            interfaceC0967QiA0C.A5A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str, long j2) {
        String str2;
        try {
            C0811Kd c0811KdA06 = this.A06.A06(this.A05, str, j2, this.A03);
            C05408v c05408vA00 = c0811KdA06.A00();
            C04675q.A06(this.A05.A00(), str);
            if (c05408vA00 != null) {
                JT.A0L(this.A05).A1l(c05408vA00.A08());
                DynamicLoaderFactory.makeLoader(this.A05).getInitApi().maybeAttachCrashListener(this.A05);
                AnonymousClass23.A0P(this.A05.A00(), c05408vA00.A06());
                KW.A06(c05408vA00.A05().A0B(), this.A01);
                MD.A01(this.A05, A0B, c05408vA00);
                C05238e c05238e = new C05238e(A06(30, 7, 123) + LV.A02());
                c05238e.A04(1);
                c05238e.A07(false);
                this.A05.A04().A8S(A06(100, 7, 111), C05228d.A1D, c05238e);
            }
            int i2 = KY.A00[c0811KdA06.A01().ordinal()];
            if (i2 == 1) {
                C1256ah c1256ah = (C1256ah) c0811KdA06;
                if (c05408vA00 != null) {
                    if (c05408vA00.A05().A0E()) {
                        KW.A08(str, this.A01);
                    }
                    if (this.A04 != null) {
                        str2 = this.A04.get(A06(13, 17, 93));
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(c0811KdA06.A02()) && !TextUtils.isEmpty(str2)) {
                        new JR(this.A05, str2, c0811KdA06.A02()).A0C();
                    }
                }
                this.A05.A0A().A2n(C0848Lr.A01(this.A00));
                A0N(c1256ah);
                return;
            }
            if (i2 != 2) {
                AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                this.A05.A0A().A2m(C0848Lr.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                A0G(K7.A02(adErrorType, str));
                return;
            }
            C1255ag c1255ag = (C1255ag) c0811KdA06;
            String finalErrMessage = c1255ag.A04();
            AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1255ag.A03(), AdErrorType.ERROR_MESSAGE);
            A0E(c1255ag.A03(), finalErrMessage);
            if (finalErrMessage == null) {
                finalErrMessage = str;
            }
            this.A05.A0A().A2m(C0848Lr.A01(this.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), finalErrMessage, adErrorTypeAdErrorTypeFromCode.isPublicError());
            A0G(K7.A02(adErrorTypeAdErrorTypeFromCode, finalErrMessage));
        } catch (Exception e2) {
            String errorMessage = e2.getMessage();
            AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
            C0S c0sA0A = this.A05.A0A();
            long jA01 = C0848Lr.A01(this.A00);
            int errorCode = adErrorType2.getErrorCode();
            boolean zIsPublicError = adErrorType2.isPublicError();
            if (A09[2].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[3] = "KiE48ndyzelvmzNW6bdZaRvZ6MMpVlPo";
            strArr[1] = "apnThSuxD28F5jipUISQB7XXqWmqfDCi";
            c0sA0A.A2m(jA01, errorCode, errorMessage, zIsPublicError);
            A0G(K7.A02(adErrorType2, errorMessage));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(String str, long j2) {
        A0B.execute(new C1283b8(this, str, j2));
    }

    public final void A0Q(KX kx) {
        this.A00 = System.currentTimeMillis();
        if (C0846Lp.A00(this.A05) == EnumC0845Lo.A07) {
            A0B();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String strA06 = A06(79, 21, 56);
            this.A05.A0A().A2m(C0848Lr.A01(this.A00), adErrorType.getErrorCode(), strA06, adErrorType.isPublicError());
            A0G(new K7(adErrorType, strA06));
            return;
        }
        this.A01 = kx;
        C05318m.A0B(this.A05);
        if (KW.A09(kx)) {
            String strA02 = KW.A02(kx);
            if (strA02 != null) {
                this.A05.A0A().ADj();
                A0P(strA02, 0L);
                return;
            } else {
                AdErrorType adErrorType2 = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A05.A0A().A2m(C0848Lr.A01(this.A00), adErrorType2.getErrorCode(), adErrorType2.getDefaultErrorMessage(), adErrorType2.isPublicError());
                A0G(K7.A02(adErrorType2, null));
                return;
            }
        }
        A0B.execute(new C1285bA(this, kx));
    }

    public final void A0R(KZ kz) {
        this.A02 = kz;
    }
}
