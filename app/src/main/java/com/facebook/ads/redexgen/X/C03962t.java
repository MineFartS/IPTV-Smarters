package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C03962t {
    public static Field A00;
    public static boolean A01;
    public static Field A02;
    public static Field A03;
    public static boolean A04;
    public static boolean A05;
    public static byte[] A06;
    public static String[] A07;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{26, 54, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 4, 4, 30, DateTimeFieldType.SECOND_OF_MINUTE, 30, 27, 30, 3, DateTimeFieldType.HOUR_OF_HALFDAY, 51, DateTimeFieldType.MINUTE_OF_DAY, 27, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 3, DateTimeFieldType.MINUTE_OF_DAY, 81, 113, 85, 82, 116, 89, 85, 91, 84, 72, 107, 75, 111, 104, 81, 111, 98, 114, 110, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 29, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY};
    }

    public static void A03() {
        A07 = new String[]{"L3s3T89NtFpuDxLEKy", "cPbOOnF1boG888iUsBU9Kxy6grpVf", "WRFzwzYh2MAqPiUxzG9bo2kJfp2KHcHO", "9vcbGLR2T7yxWMobTpRq8bB9U", "SibURF26AGynrFSfxWD5QUR4x22xGZFQ", "yTrIgm3menGhBZg1uO8L6V5Q1", "HbZuQ189OK2eO85oLGeDxMojN", "ndmjFhTTq"};
    }

    static {
        A03();
        A02();
        A01 = false;
    }

    private final long A00() {
        return ValueAnimator.getFrameDelay();
    }

    public int A04(View view) {
        return 0;
    }

    public int A05(View view) {
        return 0;
    }

    public int A06(View view) {
        if (!A04) {
            try {
                A02 = View.class.getDeclaredField(A01(22, 10, 116));
                A02.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            A04 = true;
        }
        Field field = A02;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        String[] strArr = A07;
        if (strArr[6].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "NCc6Jqv2GO376CQKGw1IxKfvH";
        strArr2[5] = "YVXHACGvNzaMPxLwmScJLLvmY";
        return 0;
    }

    public int A07(View view) {
        if (!A05) {
            try {
                A03 = View.class.getDeclaredField(A01(32, 9, 78));
                A03.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            A05 = true;
        }
        Field field = A03;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public Display A08(View view) {
        if (A0J(view)) {
            Context context = view.getContext();
            String[] strArr = A07;
            if (strArr[4].charAt(26) != strArr[2].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "4a3eiuhXeUDn5EQ45doxduLNA";
            strArr2[5] = "KtzDkVpoyjscLRsaaF8xyCPTY";
            return ((WindowManager) context.getSystemService(A01(41, 6, 49))).getDefaultDisplay();
        }
        return null;
    }

    public C3B A09(View view, C3B c3b) {
        return c3b;
    }

    public C3B A0A(View view, C3B c3b) {
        return c3b;
    }

    public void A0B(View view) {
        view.postInvalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0C(View view) {
        if (view instanceof InterfaceC03782b) {
            ((InterfaceC03782b) view).stopNestedScroll();
        }
    }

    public void A0D(View view, int i2) {
    }

    public final void A0E(View view, @Nullable C2Y c2y) {
        view.setAccessibilityDelegate(c2y == null ? null : c2y.A00());
    }

    public void A0F(View view, InterfaceC03812e interfaceC03812e) {
    }

    public void A0G(View view, Runnable runnable) {
        view.postDelayed(runnable, A00());
    }

    public void A0H(View view, Runnable runnable, long j2) {
        view.postDelayed(runnable, A00() + j2);
    }

    public boolean A0I(View view) {
        return false;
    }

    public boolean A0J(View view) {
        return view.getWindowToken() != null;
    }

    public final boolean A0K(View view) {
        if (A01) {
            return false;
        }
        if (A00 == null) {
            try {
                A00 = View.class.getDeclaredField(A01(0, 22, 63));
                A00.setAccessible(true);
            } catch (Throwable unused) {
                A01 = true;
                return false;
            }
        }
        try {
            return A00.get(view) != null;
        } catch (Throwable unused2) {
            A01 = true;
            return false;
        }
    }
}
