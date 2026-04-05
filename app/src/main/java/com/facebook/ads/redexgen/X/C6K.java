package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6K {
    public static String[] A03;
    public final Context A00;
    public final C6E A01;
    public final EnumC04846h A02;

    static {
        A00();
    }

    public static void A00() {
        A03 = new String[]{"COmePc5O6jQNBThxNrU00eLA0sP62Ofb", "1OlTUJms59QGnZv6uedBszpwZ8CEYVJ", "oD0bBsFyrWHU6", "C7a4pm2tyO8SrXv1cdlxK2sPFdgwB5ae", "g8qGNC4JJd68o", "wdv0nL8gPgDp5YXIgWNDO16SJnt", "h7h0bvqqYit4L8HKMEE", "ho5Id5lQMxy9uaRyjuF"};
    }

    public C6K(Context context, C6E c6e, EnumC04846h enumC04846h) {
        this.A01 = c6e;
        this.A00 = context;
        this.A02 = enumC04846h;
    }

    public final void A01(MotionEvent motionEvent) {
        int toolType;
        int toolType2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Context context = this.A00;
        String packageName = context == null ? BuildConfig.FLAVOR : context.getPackageName();
        EnumC04846h enumC04846h = this.A02;
        EnumC04846h enumC04846h2 = EnumC04846h.A0G;
        if (A03[7].length() != 16) {
            String[] strArr = A03;
            strArr[6] = "q52vtyV4o3lWIqbyVHb";
            strArr[6] = "q52vtyV4o3lWIqbyVHb";
            C04936q c04936q = enumC04846h == enumC04846h2 ? null : new C04936q(packageName);
            float f2 = 1.0f;
            char c2 = 1;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 3:
                case 5:
                case 6:
                    int pointerId = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(pointerId);
                    if (Build.VERSION.SDK_INT >= 14) {
                        toolType = motionEvent.getToolType(pointerId);
                    } else {
                        toolType = -1;
                    }
                    this.A01.A02(new C1135Ww(jElapsedRealtime, c04936q, new C6O(motionEvent.getActionMasked(), pointerId2, toolType, new float[]{motionEvent.getRawX(), motionEvent.getRawY()}, motionEvent.getSize(pointerId), Math.min(motionEvent.getPressure(pointerId), 1.0f), motionEvent.getOrientation(pointerId))), C6D.A0E);
                    return;
                case 2:
                case 4:
                    int i2 = 0;
                    while (i2 < motionEvent.getPointerCount()) {
                        int pointerId3 = motionEvent.getPointerId(i2);
                        String[] strArr2 = A03;
                        if (strArr2[2].length() == strArr2[4].length()) {
                            String[] strArr3 = A03;
                            strArr3[1] = "FtxLtPKiBWyCq8d2bMsvLwchXj4m1FL";
                            strArr3[5] = "2ZHjPJSTqIAuT8ks3iUv9R1XL7D";
                            if (Build.VERSION.SDK_INT >= 14) {
                                toolType2 = motionEvent.getToolType(i2);
                            } else {
                                toolType2 = -1;
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            float[] fArr = new float[2];
                            fArr[0] = motionEvent.getRawX();
                            fArr[c2] = motionEvent.getRawY();
                            this.A01.A02(new C1135Ww(jElapsedRealtime, c04936q, new C6O(actionMasked, pointerId3, toolType2, fArr, motionEvent.getSize(i2), Math.min(motionEvent.getPressure(i2), f2), motionEvent.getOrientation(i2))), C6D.A0E);
                            i2++;
                            f2 = 1.0f;
                            c2 = 1;
                        }
                        break;
                    }
                    return;
                default:
                    return;
            }
        }
        throw new RuntimeException();
    }
}
