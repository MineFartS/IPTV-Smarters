package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.amazonaws.services.s3.internal.Constants;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1028Ss extends C4S {
    public static byte[] A06;
    public static String[] A07;
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    static {
        A07();
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{41, 12, 11, 0, 4, DateTimeFieldType.MILLIS_OF_SECOND, 54, 8, 10, 10, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 54, 6, DateTimeFieldType.MILLIS_OF_SECOND, 10, 9, 9, 0, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_MINUTE, 35, 57, 108, 63, 36, 35, 57, 32, 40, 108, 35, 58, 41, 62, 62, 37, 40, 41, 108, 47, 35, 33, 60, 57, 56, 41, 31, 47, 62, 35, 32, 32, 26, 41, 47, 56, 35, 62, 10, 35, 62, 28, 35, 63, 37, 56, 37, 35, 34, 108, 59, 36, 41, 34, 108, 56, 36, 41, 108, 0, 45, 53, 35, 57, 56, 1, 45, 34, 45, 43, 41, 62, 108, 40, 35, 41, 63, 108, 34, 35, 56, 108, 37, 33, 60, 32, 41, 33, 41, 34, 56, 108, 42, 55, 56, 41, 121, 41, 43, 60, 63, 60, 43, 60, 55, 58, 60, 121, 42, 49, 54, 44, 53, 61, 121, 59, 60, 121, 54, 55, 60, 121, 54, 63, 121, 45, 49, 60, 121, 58, 54, 55, 42, 45, 56, 55, 45, 42, 121, 61, 60, 63, 48, 55, 60, 61, 121, 48, 55, 121, 10, 52, 54, 54, 45, 49, 10, 58, 43, 54, 53, 53, 60, 43, 117, 121, 42, 45, 56, 43, 45, 48, 55, 62, 121, 46, 48, 45, 49, 121, 10, DateTimeFieldType.MILLIS_OF_SECOND, 24, 9, 6};
    }

    public static void A07() {
        A07 = new String[]{"vpHxNEEeQqkPH9sKp8BAFlo", "ddQd8aXmX57TCv5syYSnMf6Vla22KopM", "0YXj", "UC9R5IJXbgu82zo5LhenPlKKwn23Fltm", "uFeOec4n0AGL9Kfrmk6ECW0KKbKvD", "RgZAHFrUyN4TqtmKiyvyL8Y", "g7LT7F9fn5p79lPzLzvRECTowfucfQY3", "UaBPk1errz52kF5dIu80Mei9ciV9Nkpb"};
    }

    public C1028Ss(Context context) {
        this.A03 = A0K(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    private final int A03(View view, int top) {
        C4F c4fA09 = A09();
        if (c4fA09 == null || !c4fA09.A26()) {
            return 0;
        }
        C4G c4g = (C4G) view.getLayoutParams();
        int start = c4fA09.A0p(view) - c4g.topMargin;
        int end = c4fA09.A0k(view) + c4g.bottomMargin;
        return A0O(start, end, c4fA09.A0h(), c4fA09.A0Y() - c4fA09.A0e(), top);
    }

    private final void A08(C4Q c4q) {
        PointF pointFA0Q = A0Q(A08());
        if (pointFA0Q == null || (pointFA0Q.x == 0.0f && pointFA0Q.y == 0.0f)) {
            c4q.A04(A08());
            A0A();
            return;
        }
        A0C(pointFA0Q);
        this.A02 = pointFA0Q;
        this.A00 = (int) (pointFA0Q.x * 10000.0f);
        this.A01 = (int) (pointFA0Q.y * 10000.0f);
        c4q.A05((int) (this.A00 * 1.2f), (int) (this.A01 * 1.2f), (int) (A0M(Constants.MAXIMUM_UPLOAD_PARTS) * 1.2f), this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public final void A0H() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public final void A0I(int i2, int i3, C4U c4u, C4Q c4q) {
        if (A07() == 0) {
            A0A();
            return;
        }
        this.A00 = A01(this.A00, i2);
        this.A01 = A01(this.A01, i3);
        if (this.A00 == 0 && this.A01 == 0) {
            A08(c4q);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public void A0J(View view, C4U c4u, C4Q c4q) {
        int iA0P = A0P(view, A0L());
        int iA03 = A03(view, A00());
        int iA0N = A0N((int) Math.sqrt((iA0P * iA0P) + (iA03 * iA03)));
        if (iA0N > 0) {
            c4q.A05(-iA0P, -iA03, iA0N, this.A04);
        }
    }

    public float A0K(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0L() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0M(int i2) {
        return (int) Math.ceil(Math.abs(i2) * this.A03);
    }

    public final int A0N(int i2) {
        return (int) Math.ceil(((double) A0M(i2)) / 0.3356d);
    }

    public final int A0O(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                return i5 - i3;
            }
            throw new IllegalArgumentException(A04(113, 93, 122));
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        String[] strArr = A07;
        if (strArr[3].charAt(24) != strArr[6].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "99CH8cQKDxQi0SdQwcjuhFHBueIBqbiA";
        strArr2[4] = "Y2Wuw9nWVBLC0K9LHKlenTQ1gtNyD";
        return 0;
    }

    public int A0P(View view, int left) {
        C4F c4fA09 = A09();
        if (c4fA09 == null || !c4fA09.A25()) {
            return 0;
        }
        C4G c4g = (C4G) view.getLayoutParams();
        int start = c4fA09.A0l(view) - c4g.leftMargin;
        int end = c4fA09.A0o(view) + c4g.rightMargin;
        return A0O(start, end, c4fA09.A0f(), c4fA09.A0i() - c4fA09.A0g(), left);
    }

    @Nullable
    public PointF A0Q(int i2) {
        Object objA09 = A09();
        if (objA09 instanceof C4R) {
            return ((C4R) objA09).A45(i2);
        }
        Log.w(A04(0, 20, 70), A04(20, 93, 111) + C4R.class.getCanonicalName());
        return null;
    }
}
