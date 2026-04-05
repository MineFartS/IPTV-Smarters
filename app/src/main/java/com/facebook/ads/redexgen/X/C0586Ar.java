package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(21)
public final class C0586Ar {
    public static byte[] A02;
    public static final C0586Ar A03;
    public final int A00;
    public final int[] A01;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-58, -70, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 10, 10, 9, 12, DateTimeFieldType.HOUR_OF_HALFDAY, -1, -2, -33, 8, -3, 9, -2, 3, 8, 1, DateTimeFieldType.HALFDAY_OF_DAY, -41, -75, -23, -40, -35, -29, -73, -43, -28, -43, -42, -35, -32, -35, -24, -35, -39, -25, -49, -31, -43, -20, -73, -36, -43, -30, -30, -39, -32, -73, -29, -23, -30, -24, -79, -72, -33, -20, -30, -16, -19, -25, -30, -84, -21, -29, -30, -25, -33, -84, -33, -31, -14, -25, -19, -20, -84, -58, -62, -53, -57, -35, -65, -45, -62, -57, -51, -35, -50, -54, -45, -59, -46, -33, -43, -29, -32, -38, -43, -97, -34, -42, -43, -38, -46, -97, -42, -23, -27, -29, -46, -97, -78, -58, -75, -70, -64, -48, -63, -67, -58, -72, -48, -60, -59, -78, -59, -74, -61, -48, -58, -44, -47, -53, -58, -112, -49, -57, -58, -53, -61, -112, -57, -38, -42, -44, -61, -112, -89, -80, -91, -79, -90, -85, -80, -87, -75, -39, -26, -36, -22, -25, -31, -36, -90, -27, -35, -36, -31, -39, -90, -35, -16, -20, -22, -39, -90, -59, -71, -48, -41, -69, -64, -71, -58, -58, -67, -60, -41, -69, -57, -51, -58, -52};
    }

    static {
        A03();
        A03 = new C0586Ar(new int[]{2}, 2);
    }

    public C0586Ar(int[] iArr, int i2) {
        if (iArr != null) {
            this.A01 = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.A01);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i2;
    }

    public static C0586Ar A00(Context context) {
        return A01(context.registerReceiver(null, new IntentFilter(A02(56, 36, 98))));
    }

    @SuppressLint({"InlinedApi"})
    public static C0586Ar A01(Intent intent) {
        if (intent == null || intent.getIntExtra(A02(92, 36, 85), 0) == 0) {
            return A03;
        }
        return new C0586Ar(intent.getIntArrayExtra(A02(128, 29, 70)), intent.getIntExtra(A02(157, 37, 92), 0));
    }

    public final boolean A04(int i2) {
        return Arrays.binarySearch(this.A01, i2) >= 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0586Ar)) {
            return false;
        }
        C0586Ar audioCapabilities = (C0586Ar) obj;
        return Arrays.equals(this.A01, audioCapabilities.A01) && this.A00 == audioCapabilities.A00;
    }

    public final int hashCode() {
        return this.A00 + (Arrays.hashCode(this.A01) * 31);
    }

    public final String toString() {
        return A02(21, 34, 88) + this.A00 + A02(0, 21, 126) + Arrays.toString(this.A01) + A02(55, 1, 63);
    }
}
