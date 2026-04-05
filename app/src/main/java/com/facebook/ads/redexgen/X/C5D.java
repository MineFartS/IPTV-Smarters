package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C5D extends AsyncTask<C5F, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04;
    public final C5E A00;
    public final X2 A01;
    public final boolean A02;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, 63};
    }

    public static void A03() {
        A04 = new String[]{"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    }

    public C5D(X2 x2, C5E c5e, boolean z) {
        this.A01 = x2;
        this.A00 = c5e;
        this.A02 = z;
    }

    public /* synthetic */ C5D(X2 x2, C5E c5e, boolean z, TW tw) {
        this(x2, c5e, z);
    }

    @SuppressLint({"CatchGeneralException"})
    private final Drawable A00(C5F... c5fArr) throws Throwable {
        if (!C0822Kp.A02(this) && c5fArr != null) {
            try {
                if (c5fArr.length >= 1) {
                    String str = c5fArr[0].A01;
                    String str2 = c5fArr[0].A00;
                    Bitmap bitmapA0J = null;
                    try {
                        bitmapA0J = new C7C(this.A01).A0J(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A04().A86(A01(0, 7, 42), C05228d.A1C, new C05238e(th));
                    }
                    if (bitmapA0J != null) {
                        return C1320bj.A05(this.A01, bitmapA0J, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                C0822Kp.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    private final void A04(Drawable drawable) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A9l(drawable);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    @SuppressLint({"CatchGeneralException"})
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C5F[] c5fArr) throws Throwable {
        if (C0822Kp.A02(this)) {
            return null;
        }
        try {
            return A00(c5fArr);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(drawable);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}
