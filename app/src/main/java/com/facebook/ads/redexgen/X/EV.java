package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EV implements Runnable {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ C0662Ed A00;
    public final /* synthetic */ DownloadAction[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {56, DateTimeFieldType.MINUTE_OF_HOUR, 11, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 29, 24, 49, 29, DateTimeFieldType.MINUTE_OF_DAY, 29, 27, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 121, 76, 91, 90, 64, 90, 93, 64, 71, 78, 9, 72, 74, 93, 64, 70, 71, 90, 9, 79, 72, 64, 69, 76, 77, 7};
        if (A03[6].charAt(27) == 't') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "P9OfQ9yL9WD45vqgxteLJEc4LCKor8r2";
        strArr[3] = "P9OfQ9yL9WD45vqgxteLJEc4LCKor8r2";
        A02 = bArr;
    }

    public static void A02() {
        A03 = new String[]{"ygrR2oCQuDV4", "DNKcGXijWm6BAbsHYB9tJVHVwOJf9ZE7", "LXio5gucrx5pRKqWpkHtzDtUlmJWag3t", "79sxQvyKDcGCor525oKKoplIPAz2exYS", "G4RdIjdfwRebxnJM9f1GRZk4OR8ZnwMf", "KNt7Wd51BXMZnN1lzx9YZQc0XvITGZGG", "KZ351c6FjYQvk7DZPBJOKLteXh4ScOon", "e5Lfk6CJXwKq"};
    }

    public EV(C0662Ed c0662Ed, DownloadAction[] downloadActionArr) {
        this.A00 = c0662Ed;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.A09.A03(this.A01);
            } catch (IOException e2) {
                Log.e(A00(0, 15, 80), A00(15, 26, 5), e2);
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            String[] strArr = A03;
            if (strArr[2].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "LLc1NddejmN7rNF53s5OYYgeggfBVRnl";
            strArr2[5] = "LLc1NddejmN7rNF53s5OYYgeggfBVRnl";
        }
    }
}
