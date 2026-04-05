package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1233aK extends MM {
    public static byte[] A06;
    public static String[] A07;
    public static final int A08;
    public static final int A09;

    @Nullable
    public ML A00;
    public final X2 A01;
    public final C0789Jg A02;
    public final MK A03;
    public final C1231aI A04;
    public final MR A05;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[4].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[4] = "L2RboTZhxjQ9awTRnLbhSQGg6v";
            strArr[4] = "L2RboTZhxjQ9awTRnLbhSQGg6v";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 127);
            i5++;
        }
    }

    public static void A03() {
        A06 = new byte[]{-19, -2, DateTimeFieldType.HOUR_OF_HALFDAY, -6, -6, -6, -6, -6, -6, 25, 74, 61, -8, 81, 71, 77, -8, 75, 77, 74, 61, -8, 81, 71, 77, -8, 79, 57, 70, 76, -8, 76, 71, -8, 75, 67, 65, 72, -8, 76, 64, 61, -8, 57, 60, DateTimeFieldType.MILLIS_OF_SECOND, -8, 49, 71, 77, -8, 79, 65, 68, 68, -8, 68, 71, 75, 61, -8, 81, 71, 77, 74, -8, 74, 61, 79, 57, 74, 60, 6, 36, 77, 80, 84, 70, 1, 34, 69, -22, -3, 11, DateTimeFieldType.HALFDAY_OF_DAY, 5, -3, -72, -39, -4, -11, DateTimeFieldType.HALFDAY_OF_DAY, 11, DateTimeFieldType.MINUTE_OF_DAY, -62, -29, 6, 66, 90, 88, 95, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 48, 83, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 80, 93, 83, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 59, 94, 98, 84, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 65, 84, 102, 80, 97, 83};
    }

    public static void A04() {
        A07 = new String[]{"DSMXyIjmw5HclhajbHNu0bHfM2UoxQfV", "VI8qELbWvj15goD4sBQF3Ikg1AZrbLrB", "e65oiusvVwGlpJBKbHqtCRVJnI6YlHd3", "IRi9ljHD5lnLVRZZd0Abks", "cwd6", "joZNq3IpHeg70E", "Xkn9HJi", "Qn9IhJ0zzYM2Lk7aXz3vW7M0LF"};
    }

    static {
        A04();
        A03();
        A09 = (int) (C0856Lz.A01 * 16.0f);
        A08 = Color.parseColor(A02(0, 9, 75));
    }

    public C1233aK(X2 x2, MR mr, C0789Jg c0789Jg, int i2, int i3) {
        super(x2);
        this.A01 = x2;
        this.A05 = mr;
        this.A02 = c0789Jg;
        setGravity(16);
        this.A04 = new C1231aI(x2, i2);
        this.A04.setBackgroundColor(A08);
        this.A04.setContentDescription(A02(73, 8, 98));
        this.A04.setActionClickListener(new MO(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        View view = new View(x2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A03 = new MK(x2, i3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        int i4 = A09;
        layoutParams3.setMargins(i4, 0, i4, 0);
        this.A03.setBackgroundColor(A08);
        if (JT.A1L(x2)) {
            addView(this.A03, layoutParams3);
            addView(view, layoutParams2);
            addView(this.A04, layoutParams);
        } else {
            addView(this.A04, layoutParams);
            addView(view, layoutParams2);
            addView(this.A03, layoutParams3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final void A05(C1H c1h, boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final void A06(InterfaceC0868Ml interfaceC0868Ml) {
        Activity activityA09 = this.A01.A09();
        if (activityA09 != null) {
            DialogC1236aN dialogC1236aN = new DialogC1236aN(this.A01, activityA09);
            setUpSkipDialog(dialogC1236aN, interfaceC0868Ml);
            dialogC1236aN.show();
        }
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final boolean A07() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public int getToolbarHeight() {
        return MM.A00;
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setAdReportingVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setPageDetails(C1Q c1q, String str, int i2, C1X c1x) {
        this.A04.setInitialUnskippableSeconds(i2);
        this.A03.setAdDetails(c1q, str, this.A02, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setProgress(float f2) {
        this.A04.setProgress(f2);
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setToolbarActionMode(int i2) {
        this.A04.setToolbarActionMode(i2);
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setToolbarListener(ML ml) {
        this.A00 = ml;
    }

    private void setUpSkipDialog(DialogC1236aN dialogC1236aN, InterfaceC0868Ml interfaceC0868Ml) {
        dialogC1236aN.A08(A02(97, 23, 112));
        dialogC1236aN.A05(A02(9, 64, 89));
        dialogC1236aN.A06(A02(90, 7, 35));
        dialogC1236aN.A07(A02(81, 9, 25));
        dialogC1236aN.A03(new MP(this, interfaceC0868Ml, dialogC1236aN));
        dialogC1236aN.A04(new MQ(this, interfaceC0868Ml, dialogC1236aN));
    }
}
