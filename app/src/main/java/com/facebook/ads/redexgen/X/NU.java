package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(19)
public final class NU extends LinearLayout {
    public static byte[] A05;
    public static String[] A06;
    public static final int A07;
    public static final int A08;
    public static final Uri A09;
    public static final View.OnTouchListener A0A;
    public ImageView A00;
    public ImageView A01;
    public NT A02;
    public C0882Na A03;
    public String A04;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 39);
            String[] strArr = A06;
            if (strArr[3].charAt(13) == strArr[1].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "2vQcPj1ELj1bu";
            strArr2[0] = "7aOELiI6quiDs";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{81, 126, 125, 97, 119, DateTimeFieldType.MILLIS_OF_SECOND, 40, 61, 54, 120, 54, 57, 44, 49, 46, 61, 120, 58, 42, 55, 47, 43, 61, 42, 0, 3, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 91, 3, DateTimeFieldType.HALFDAY_OF_DAY, 0, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 10, 32, 47, 37, 51, 46, 40, 37, 111, 40, 47, 53, 36, 47, 53, 111, 32, 34, 53, 40, 46, 47, 111, DateTimeFieldType.MILLIS_OF_SECOND, 8, 4, DateTimeFieldType.MILLIS_OF_DAY, 7, 11, 9, 74, 5, 10, 0, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.HALFDAY_OF_DAY, 0, 74, 7, 12, DateTimeFieldType.MILLIS_OF_DAY, 11, 9, 1, 27, 7, 7, 3, 73, 92, 92, 4, 4, 4, 93, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 28, 28, 24, 93, DateTimeFieldType.CLOCKHOUR_OF_DAY, 28, 30};
    }

    public static void A05() {
        A06 = new String[]{"knq4crm7fvqQP", "POuWJNR6FFtqsTvB6KeDXgsqVDDrfXB5", "10LYd3PkBnL3JTlwXO74lkb8laVhyfxM", "yGvyB2PsIdOlgSHN7xWAdIyeKrkcUuSJ", "30OsfDGqNeLBXhmKwxFpv8WuoKRgKdOB", "v4mwmIuaROl", "LuFvPWZsJ2RrZ", "py7QobRXpH9AZVstdVJJOkEIejHuBaN9"};
    }

    static {
        A05();
        A04();
        A07 = Color.rgb(224, 224, 224);
        A09 = Uri.parse(A02(79, 23, 84));
        A0A = new NQ();
        A08 = Color.argb(34, 0, 0, 0);
    }

    public NU(X2 x2) {
        super(x2);
        A06(x2);
    }

    private void A06(X2 x2) {
        float f2 = getResources().getDisplayMetrics().density;
        int i2 = (int) (50.0f * f2);
        int i3 = (int) (4.0f * f2);
        C0856Lz.A0P(this, -1);
        setGravity(16);
        this.A00 = new ImageView(x2);
        this.A00.setContentDescription(A02(0, 5, 53));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        this.A00.setScaleType(ImageView.ScaleType.CENTER);
        this.A00.setImageBitmap(M8.A00(M7.BROWSER_CLOSE));
        this.A00.setOnTouchListener(A0A);
        this.A00.setOnClickListener(new NR(this));
        addView(this.A00, layoutParams);
        this.A03 = new C0882Na(x2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A03.setPadding(0, i3, 0, i3);
        addView(this.A03, layoutParams2);
        this.A01 = new ImageView(x2);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
        this.A01.setContentDescription(A02(5, 19, 127));
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setOnTouchListener(A0A);
        this.A01.setOnClickListener(new NS(this, x2));
        addView(this.A01, layoutParams3);
        setupDefaultNativeBrowser(x2);
    }

    public void setListener(NT nt) {
        this.A02 = nt;
    }

    public void setTitle(String str) {
        this.A03.setTitle(str);
    }

    public void setUrl(String str) {
        this.A04 = str;
        if (TextUtils.isEmpty(str) || A02(24, 11, 70).equals(str)) {
            this.A03.setSubtitle(null);
            this.A01.setEnabled(false);
            this.A01.setColorFilter(new PorterDuffColorFilter(A07, PorterDuff.Mode.SRC_IN));
        } else {
            this.A03.setSubtitle(str);
            this.A01.setEnabled(true);
            this.A01.setColorFilter((ColorFilter) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setupDefaultNativeBrowser(com.facebook.ads.redexgen.X.X2 r7) {
        /*
            r6 = this;
            android.content.pm.PackageManager r5 = r7.getPackageManager()
            android.content.Intent r4 = new android.content.Intent
            android.net.Uri r3 = com.facebook.ads.redexgen.X.NU.A09
            r2 = 35
            r1 = 26
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r0 = A02(r2, r1, r0)
            r4.<init>(r0, r3)
            r0 = 65536(0x10000, float:9.1835E-41)
            java.util.List r2 = r5.queryIntentActivities(r4, r0)
            int r0 = r2.size()
            if (r0 != 0) goto L2f
            android.widget.ImageView r1 = r6.A01
            r0 = 8
            r1.setVisibility(r0)
            r1 = 0
        L29:
            android.widget.ImageView r0 = r6.A01
            r0.setImageBitmap(r1)
            return
        L2f:
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L71
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r3 = r0.packageName
            r2 = 61
            r1 = 18
            r0 = 67
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L71
            com.facebook.ads.redexgen.X.M7 r3 = com.facebook.ads.redexgen.X.M7.BROWSER_LAUNCH_CHROME
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.NU.A06
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 31
            if (r1 == r0) goto L78
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.NU.A06
            java.lang.String r1 = "ER9o4D5KfsgKq"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "PVCMoHz4n3Ffn"
            r0 = 0
            r2[r0] = r1
            android.graphics.Bitmap r1 = com.facebook.ads.redexgen.X.M8.A00(r3)
            goto L29
        L71:
            com.facebook.ads.redexgen.X.M7 r0 = com.facebook.ads.redexgen.X.M7.BROWSER_LAUNCH_NATIVE
            android.graphics.Bitmap r1 = com.facebook.ads.redexgen.X.M8.A00(r0)
            goto L29
        L78:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.NU.setupDefaultNativeBrowser(com.facebook.ads.redexgen.X.X2):void");
    }
}
