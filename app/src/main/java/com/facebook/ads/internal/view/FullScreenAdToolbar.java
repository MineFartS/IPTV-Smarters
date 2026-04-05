package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0789Jg;
import com.facebook.ads.redexgen.X.C0856Lz;
import com.facebook.ads.redexgen.X.C0870Mo;
import com.facebook.ads.redexgen.X.C0918Ok;
import com.facebook.ads.redexgen.X.C1H;
import com.facebook.ads.redexgen.X.C1Q;
import com.facebook.ads.redexgen.X.C1X;
import com.facebook.ads.redexgen.X.MK;
import com.facebook.ads.redexgen.X.ML;
import com.facebook.ads.redexgen.X.MM;
import com.facebook.ads.redexgen.X.MR;
import com.facebook.ads.redexgen.X.MV;
import com.facebook.ads.redexgen.X.X2;
import java.util.Arrays;
import org.achartengine.renderer.DefaultRenderer;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends MM {
    public static byte[] A07;
    public static String[] A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;

    @Nullable
    public ML A00;
    public final RelativeLayout A01;
    public final C0789Jg A02;
    public final MK A03;
    public final MR A04;
    public final C0870Mo A05;
    public final C0918Ok A06;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-26, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, 74};
    }

    public static void A04() {
        A08 = new String[]{"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    }

    static {
        A04();
        A03();
        A09 = (int) (C0856Lz.A01 * 10.0f);
        A0D = (int) (C0856Lz.A01 * 16.0f);
        int i2 = A0D;
        int i3 = A09;
        A0B = i2 - i3;
        A0C = (i2 * 2) - i3;
        A0A = (int) (C0856Lz.A01 * 4.0f);
    }

    public FullScreenAdToolbar(X2 x2, MR mr, C0789Jg c0789Jg, @ToolbarActionView$ToolbarActionMode int i2, int i3) {
        super(x2);
        this.A04 = mr;
        this.A02 = c0789Jg;
        setGravity(16);
        this.A05 = new C0870Mo(x2, i2);
        this.A05.setContentDescription(A02(0, 8, 50));
        this.A05.setActionClickListener(new MV(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i4 = A0B;
        layoutParams.setMargins(i4, i4, A0C, i4);
        addView(this.A05, layoutParams);
        this.A01 = new RelativeLayout(x2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A06 = new C0918Ok(x2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.A06.setLayoutParams(layoutParams3);
        this.A01.addView(this.A06);
        addView(this.A01, layoutParams2);
        this.A03 = new MK(x2, i3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        int i5 = A0D;
        layoutParams4.setMargins(0, i5 / 2, i5 / 2, i5 / 2);
        addView(this.A03, layoutParams4);
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final void A05(C1H c1h, boolean z) {
        int iA04 = c1h.A04(z);
        this.A06.A01(c1h.A0A(z), iA04);
        this.A03.setIconColors(iA04);
        this.A03.setContentDescription(A02(8, 9, 117));
        this.A05.setColors(iA04);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            C0856Lz.A0W(this, gradientDrawable);
            C0856Lz.A0T(this.A03, 0, DefaultRenderer.BACKGROUND_COLOR, A0A);
            return;
        }
        C0856Lz.A0P(this, 0);
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final boolean A07() {
        return this.A05.A02();
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public int getToolbarHeight() {
        return MM.A00;
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setAdReportingVisible(boolean z) {
        this.A03.setVisibility(z ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setPageDetails(C1Q c1q, String str, int i2, C1X c1x) {
        this.A05.setInitialUnskippableSeconds(i2);
        this.A06.setPageDetails(c1q);
        this.A03.setAdDetails(c1q, str, this.A02, this.A04);
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setPageDetailsVisible(boolean z) {
        this.A01.removeAllViews();
        if (z) {
            RelativeLayout relativeLayout = this.A01;
            C0918Ok c0918Ok = this.A06;
            if (A08[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(c0918Ok);
        }
        C0870Mo c0870Mo = this.A05;
        String[] strArr2 = A08;
        if (strArr2[2].length() == strArr2[3].length()) {
            c0870Mo.setToolbarMessageEnabled(!z);
            return;
        }
        String[] strArr3 = A08;
        strArr3[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
        strArr3[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
        c0870Mo.setToolbarMessageEnabled(!z);
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setProgress(float f2) {
        this.A05.setProgress(f2);
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setToolbarActionMessage(String str) {
        this.A05.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i2) {
        this.A05.setToolbarActionMode(i2);
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public void setToolbarListener(ML ml) {
        this.A00 = ml;
    }
}
