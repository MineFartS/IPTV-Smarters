package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.AdSize;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KF {
    public static String[] A00;
    public static final Map<KC, KD> A01;

    public static void A03() {
        A00 = new String[]{"aUzGFJWT9JUej7dfFIRBXB2Am5SKhp0L", "Lg", "z6uS01sVSQZKuOHXwfbCrotAFRq98Mhk", "s6upF4yW2rVlVN4uyEeLi2N0Ec6ZN78T", "eH22UAfKgSlQJvnKnPkmgNwQr7bKVvHo", "ohZIQy", "XInXF4zeGGrmw79hhTd", "dMAEap8Em2lp2DdLAyvSKUklRkWZ0JXT"};
    }

    static {
        A03();
        A01 = new HashMap();
        A01.put(KC.A09, KD.A09);
        A01.put(KC.A07, KD.A0B);
        A01.put(KC.A06, KD.A0A);
    }

    public static AdSize A00(KD kd) {
        for (Map.Entry<KC, KD> entry : A01.entrySet()) {
            if (entry.getValue() == kd) {
                KC key = entry.getKey();
                if (A00[5].length() == 27) {
                    throw new RuntimeException();
                }
                String[] strArr = A00;
                strArr[2] = "sySRfG1wiaC9q3S7uTxa3ZVw3iXf1vjk";
                strArr[2] = "sySRfG1wiaC9q3S7uTxa3ZVw3iXf1vjk";
                return key.A06();
            }
        }
        return AdSize.BANNER_320_50;
    }

    public static KD A01(DisplayMetrics displayMetrics) {
        int i2 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int i3 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (LV.A04(i2, i3)) {
            return KD.A0E;
        }
        if (i3 > i2) {
            return KD.A0G;
        }
        return KD.A0D;
    }

    public static KD A02(KC kc) {
        KD kd = A01.get(kc);
        if (kd == null) {
            return KD.A0C;
        }
        return kd;
    }

    public static void A04(DisplayMetrics displayMetrics, View view, KC kc) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) >= kc.getWidth() ? displayMetrics.widthPixels : (int) Math.ceil(kc.getWidth() * displayMetrics.density), (int) Math.ceil(kc.getHeight() * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
