package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1281b6 implements Q8 {
    public static byte[] A02;
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0809Ka A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 90, 12, 9, 88, 12, DateTimeFieldType.HALFDAY_OF_DAY, 88, 92, 12, 90, 95, DateTimeFieldType.HALFDAY_OF_DAY, 9, DateTimeFieldType.CLOCKHOUR_OF_DAY, 9, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, 31, 34, 57, 63, 42, 46, 51, 53, 52, 96, 122, 83, 101, 114, 118, 101, 114, 32, 101, 114, 114, 111, 114, 32, 111, 99, 99, 117, 114, 114, 101, 100, 117, 67, 84, 80, 67, 84, 6, 84, 67, 86, 74, 79, 67, 66, 6, 85, 83, 69, 69, 67, 85, 85, 64, 83, 74, 74, 95, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 63, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 12, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, 8, 25, 61, 60, DateTimeFieldType.MILLIS_OF_SECOND, 32, 32, 61, 32};
    }

    public C1281b6(C0809Ka c0809Ka, long j2) {
        this.A01 = c0809Ka;
        this.A00 = j2;
    }

    private final void A02(QK qk) {
        KW.A07(this.A01.A01);
        try {
            Q6 q6A00 = qk.A00();
            if (q6A00 != null) {
                String strA5V = q6A00.A5V();
                C0811Kd c0811KdA06 = this.A01.A06.A06(this.A01.A05, strA5V, this.A00, this.A01.A03);
                if (c0811KdA06.A01() == EnumC0810Kc.A03) {
                    C1255ag c1255ag = (C1255ag) c0811KdA06;
                    String strA04 = c1255ag.A04();
                    AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1255ag.A03(), AdErrorType.ERROR_MESSAGE);
                    if (strA04 != null) {
                        strA5V = strA04;
                    }
                    this.A01.A05.A0A().A2m(C0848Lr.A01(this.A01.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA5V, adErrorTypeAdErrorTypeFromCode.isPublicError());
                    this.A01.A0G(K7.A02(adErrorTypeAdErrorTypeFromCode, strA5V));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = qk.getMessage();
            this.A01.A05.A0A().A2m(C0848Lr.A01(this.A01.A00), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
            this.A01.A0G(K7.A02(adErrorType, message));
        } catch (JSONException e2) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String message2 = qk.getMessage();
            C0S c0sA0A = this.A01.A05.A0A();
            long jA01 = C0848Lr.A01(this.A01.A00);
            int errorCode = adErrorType2.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String errorMessage = A00(15, 15, 14);
            sb.append(errorMessage);
            String errorMessage2 = e2.getMessage();
            sb.append(errorMessage2);
            c0sA0A.A2m(jA01, errorCode, sb.toString(), adErrorType2.isPublicError());
            this.A01.A0G(K7.A02(adErrorType2, message2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q8
    public final void A9G(Q6 q6) {
        KL.A05(A00(78, 10, 40), A00(51, 27, 114), A00(8, 7, 59));
        if (q6 != null) {
            String strA5V = q6.A5V();
            KW.A07(this.A01.A01);
            this.A01.A0P(strA5V, this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q8
    public final void A9c(Exception exc) {
        KL.A05(A00(88, 7, 6), A00(30, 21, 84), A00(0, 8, 104));
        if (QK.class.equals(exc.getClass())) {
            A02((QK) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String message = exc.getMessage();
        this.A01.A05.A0A().A2m(C0848Lr.A01(this.A01.A00), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
        this.A01.A0G(K7.A02(adErrorType, message));
    }
}
