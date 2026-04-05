package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y8 implements BF {
    public static byte[] A01;
    public final /* synthetic */ Y9 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{44, 32, 114, 70, 87, 90, 92, 103, 65, 82, 80, 88, 67, 109, 100, 101, 120, 99, 100, 109, 42, 99, 103, 122, 101, 121, 121, 99, 104, 102, 115, 42, 102, 107, 120, 109, 111, 42, 107, 127, 110, 99, 101, 42, 102, 107, 126, 111, 100, 105, 115, 48, 42, 33, 2, 7, 0, 27, 29, 7, 1, 82, DateTimeFieldType.MINUTE_OF_HOUR, 7, DateTimeFieldType.MILLIS_OF_DAY, 27, 29, 82, 6, 27, 31, DateTimeFieldType.MILLIS_OF_SECOND, 1, 6, DateTimeFieldType.MINUTE_OF_HOUR, 31, 2, 82, 90, DateTimeFieldType.SECOND_OF_DAY, 0, DateTimeFieldType.MINUTE_OF_HOUR, 31, DateTimeFieldType.MILLIS_OF_SECOND, 82, 2, 29, 1, 27, 6, 27, 29, 28, 82, 31, 27, 1, 31, DateTimeFieldType.MINUTE_OF_HOUR, 6, DateTimeFieldType.HOUR_OF_DAY, 26, 91, 72, 82, 88, 123, 126, 121, 98, 100, 126, 120, 43, 106, 126, 111, 98, 100, 43, 127, 98, 102, 110, 120, 127, 106, 102, 123, 43, 35, 120, 114, 120, 127, 110, 102, 43, 104, 103, 100, 104, 96, 43, 102, 98, 120, 102, 106, 127, 104, 99, 34, 49, 43};
    }

    public Y8(Y9 y9) {
        this.A00 = y9;
    }

    public /* synthetic */ Y8(Y9 y9, BI bi) {
        this(y9);
    }

    @Override // com.facebook.ads.redexgen.X.BF
    public final void A9y(long j2) {
        Log.w(A00(2, 10, 37), A00(12, 41, 28) + j2);
    }

    @Override // com.facebook.ads.redexgen.X.BF
    public final void AAc(long j2, long j3, long j4, long j5) {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(53, 52, 100));
        sb.append(j2);
        String strA00 = A00(0, 2, 22);
        sb.append(strA00);
        sb.append(j3);
        sb.append(strA00);
        sb.append(j4);
        sb.append(strA00);
        sb.append(j5);
        sb.append(strA00);
        sb.append(this.A00.A03());
        sb.append(strA00);
        sb.append(this.A00.A04());
        String string = sb.toString();
        if (!Y9.A0q) {
            Log.w(A00(2, 10, 37), string);
            return;
        }
        throw new BL(string, null);
    }

    @Override // com.facebook.ads.redexgen.X.BF
    public final void AB6(long j2, long j3, long j4, long j5) {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(105, 50, 29));
        sb.append(j2);
        String strA00 = A00(0, 2, 22);
        sb.append(strA00);
        sb.append(j3);
        sb.append(strA00);
        sb.append(j4);
        sb.append(strA00);
        sb.append(j5);
        sb.append(strA00);
        sb.append(this.A00.A03());
        sb.append(strA00);
        sb.append(this.A00.A04());
        String string = sb.toString();
        if (!Y9.A0q) {
            Log.w(A00(2, 10, 37), string);
            return;
        }
        throw new BL(string, null);
    }

    @Override // com.facebook.ads.redexgen.X.BF
    public final void ABD(int i2, long j2) {
        if (this.A00.A0R == null) {
            return;
        }
        this.A00.A0R.ABE(i2, j2, SystemClock.elapsedRealtime() - this.A00.A0E);
    }
}
