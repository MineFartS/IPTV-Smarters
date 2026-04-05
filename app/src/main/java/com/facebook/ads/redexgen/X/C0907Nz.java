package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0907Nz extends LinearLayout {
    public static String[] A05;
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    static {
        A00();
    }

    public static void A00() {
        A05 = new String[]{"JiUd07qZ", "phaLMHqUBlp6P5RZzzm", "VtPMRXbuUkVLmtGCwM", "RgvNiIo52t", "FYi9K2JmgPw1hqWSXD3EPgcEPQmLRiB", "yPPKnDMDveXTdnfoUUkFxo3t2NtgVDwK", "Cr", "5lHXxybE2bQiDNmNKuHItJ8Sueck67l"};
    }

    public C0907Nz(X2 x2, C1H c1h, int dotSize) {
        super(x2);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f2 = C0856Lz.A01;
        int i2 = (int) (8.0f * f2);
        int i3 = (int) (6.0f * f2);
        int margin = (int) (1.0f * f2);
        this.A02 = margin;
        int margin2 = c1h.A04(false);
        this.A04 = margin2;
        int margin3 = C2G.A01(this.A04, 128);
        this.A03 = margin3;
        this.A01 = new ArrayList();
        for (int i4 = 0; i4 < dotSize; i4++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i2, i2);
            int margin4 = this.A02;
            gradientDrawable.setStroke(margin4, 0);
            ImageView imageView = new ImageView(x2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i3, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A01(0);
    }

    public final void A01(int i2) {
        int i3;
        int i4;
        if (this.A00 == i2) {
            return;
        }
        this.A00 = i2;
        if (A05[2].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[4] = "BJqXxH8n0fuaHx3JVwGHjWVcPjmBGjI";
        strArr[7] = "ZUGfW6Md7SIL60yz7Eq8Bq3LU56iFcm";
        for (int i5 = 0; i5 < this.A01.size(); i5++) {
            if (i5 == i2) {
                i3 = this.A04;
                i4 = this.A04;
            } else {
                i3 = this.A03;
                i4 = 0;
            }
            GradientDrawable gradientDrawable = this.A01.get(i5);
            int borderColor = this.A02;
            gradientDrawable.setStroke(borderColor, i4);
            this.A01.get(i5).setColor(i3);
            this.A01.get(i5).invalidateSelf();
        }
    }
}
