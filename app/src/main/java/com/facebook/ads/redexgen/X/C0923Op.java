package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Op, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0923Op {
    public static boolean A00;
    public static byte[] A01;
    public static String[] A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[2].charAt(4) == 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "V4DWKv2CalsHghC0GoFw5ZQ5aRA0odCa";
            strArr[5] = "V4DWKv2CalsHghC0GoFw5ZQ5aRA0odCa";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 71);
            i5++;
        }
    }

    public static void A03() {
        A01 = new byte[]{-1, 36, 46, 43, 39, 28, 52, 8, 32, 47, 45, 36, 30, 46, -37, 36, 46, -37, 41, 48, 39, 39, -23, 9, 28, 42, 38, 44, 41, 26, 28, 42, -41, 32, 42, -41, 37, 44, 35, 35, -27, -65, -54, -43, -46, -51, -54, -35, -46, -40, -41, -119, -49, -54, -46, -43, -50, -51, -105, -34, -32, -35};
    }

    public static void A04() {
        A02 = new String[]{"Y0rICHp14ARSNu9MlXOQlrQKpJ7V2hwf", "9bmfgm9m8nITbmWk0ICcMAG3MrS", "cwEc0HiI6y8ZhWJ4MUGuUSsWKgKIPOUb", "CeguwAwwe", "1UN8Pz5pD", "KG5kSs2s3o8nfvSCZiVMOrQyfdZTA2DP", "BO8EwxINC4bfwl9QwPIiUjcYWt5Jq71N", "VnsxrIf3KddrD6MinhDJfsdqz9CBs5tu"};
    }

    static {
        A04();
        A03();
        A00 = true;
    }

    @Nullable
    public static BitmapDrawable A00(X2 x2, @Nullable String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(str, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (bitmapDecodeByteArray != null && (!A00 || A06(x2, bitmapDecodeByteArray))) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapDecodeByteArray);
                bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                Resources resources = x2.getResources();
                if (resources != null) {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A05(x2, A02(0, 23, 116));
                    }
                } else {
                    A05(x2, A02(23, 18, 112));
                }
                return bitmapDrawable;
            }
            return null;
        } catch (Throwable th) {
            x2.A04().A86(A02(59, 3, 42), C05228d.A1Z, new C05238e(th));
            return null;
        }
    }

    @Nullable
    public static C0924Oq A01(X2 x2, @Nullable String str) {
        BitmapDrawable bitmapDrawableA00;
        try {
            if (TextUtils.isEmpty(str) || (bitmapDrawableA00 = A00(x2, str)) == null) {
                return null;
            }
            C0924Oq c0924Oq = new C0924Oq(x2);
            if (Build.VERSION.SDK_INT >= 16) {
                c0924Oq.setBackground(bitmapDrawableA00);
            } else {
                c0924Oq.setBackgroundDrawable(bitmapDrawableA00);
            }
            c0924Oq.setClickable(false);
            c0924Oq.setFocusable(false);
            return c0924Oq;
        } catch (Throwable th) {
            x2.A04().A86(A02(59, 3, 42), C05228d.A1Z, new C05238e(th));
            return null;
        }
    }

    public static void A05(X2 x2, String str) {
        x2.A04().A86(A02(59, 3, 42), C05228d.A1Z, new C05238e(str));
    }

    @VisibleForTesting
    public static boolean A06(X2 x2, Bitmap bitmap) {
        int i2 = 0;
        while (true) {
            int width = bitmap.getWidth();
            if (A02[2].charAt(4) == 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "44dBdHmZhYYzc5DiIB6SXSnn6xfqMO61";
            strArr[2] = "44dBdHmZhYYzc5DiIB6SXSnn6xfqMO61";
            if (i2 < width) {
                for (int i3 = 0; i3 < bitmap.getHeight(); i3++) {
                    if (Color.alpha(bitmap.getPixel(i2, i3)) / 255.0f > 0.03f) {
                        A05(x2, A02(41, 18, 34));
                        return false;
                    }
                }
                i2++;
            } else {
                return true;
            }
        }
    }
}
