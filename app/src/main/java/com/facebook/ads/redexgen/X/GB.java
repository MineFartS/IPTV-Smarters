package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GB extends AsyncTask<QJ, Void, Q6> implements QG {
    public static byte[] A04;
    public static String[] A05;
    public Q8 A00;
    public G7 A01;
    public Exception A02;
    public Executor A03;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, 25, -14, 30, 30, 26, -4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 27, 31, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 29, 30, -2, 11, 29, DateTimeFieldType.SECOND_OF_MINUTE, -54, 30, 11, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 29, -54, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 34, 11, DateTimeFieldType.HALFDAY_OF_DAY, 30, DateTimeFieldType.MILLIS_OF_DAY, 35, -54, 25, 24, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -54, 11, 28, DateTimeFieldType.HOUR_OF_DAY, 31, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 24, 30, -54, 25, DateTimeFieldType.CLOCKHOUR_OF_DAY, -54, 30, 35, 26, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -54, -14, 30, 30, 26, -4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 27, 31, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 29, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 27, 27, DateTimeFieldType.MILLIS_OF_SECOND, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, 74, 79, 65, -4, 69, 79, -4, 74, 81, 72, 72, -67, -48, -34, -37, -38, -39, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, 117, -112, -34};
    }

    public static void A03() {
        A05 = new String[]{"ISBjHjbUPhJT7DGB2JvjH8pRJ4THrNWM", "OPg7gsPnZP3QsQWue6lzrISH1J86h", "XeTxlXzdRCOD7SBCy0O7kO4k", "wF1PTlVBDnka4lPn0WIHxf3evs", "myOhX4xCY5Mi9IbsU0pUOVW5bZkAtWyQ", "1AepsAli0TWWKf1w83zMf6wttDUWZa9Z", "XTBsgsEzxuO7TTQvYMtR1VxTZpUl2a6R", "C8VCTESPpZtI8Zr0pzMJK5rADprlDNCz"};
    }

    public GB(G7 g7, Q8 q8, Executor executor) {
        this.A01 = g7;
        this.A00 = q8;
        this.A03 = executor;
    }

    private final Q6 A00(QJ... qjArr) throws Throwable {
        if (C0822Kp.A02(this)) {
            return null;
        }
        try {
            if (qjArr != null) {
                try {
                    if (qjArr.length > 0) {
                        Q6 q6A0J = this.A01.A0J(qjArr[0]);
                        if (q6A0J != null) {
                            String.format(Locale.US, A01(108, 21, 6), Integer.valueOf(q6A0J.A79()), q6A0J.getUrl(), q6A0J.A5V());
                        }
                        if (q6A0J != null) {
                            return q6A0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 119));
                    }
                } catch (Exception e2) {
                    this.A02 = e2;
                    String.format(Locale.US, A01(64, 23, 98), e2.getMessage());
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            String[] strArr = A05;
            if (strArr[6].charAt(29) != strArr[5].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "7Z9SEUfEEdRKQwGPWQmPRdvkxtWIqa6k";
            strArr2[5] = "25jJFjyuRcytvXC4wurkJewgVtIZaaql";
            return null;
        }
    }

    private final void A04(Q6 q6) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A9G(q6);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QG
    public final void A50(QJ qj) {
        super.executeOnExecutor(this.A03, qj);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Q6 doInBackground(QJ[] qjArr) throws Throwable {
        if (C0822Kp.A02(this)) {
            return null;
        }
        try {
            return A00(qjArr);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.A9c(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Q6 q6) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(q6);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
