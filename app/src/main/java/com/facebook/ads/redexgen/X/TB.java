package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TB implements MR {
    public static String[] A01;
    public final WeakReference<C04484w> A00;

    static {
        A01();
    }

    public static void A01() {
        A01 = new String[]{"JdxG2e87fiw1QxhKtyp6wy4hCZ34K54h", "5l6PiVFmWkFi4LSRmzN6ZIbVVY4PyA16", "qh41B7qjlQhNnOsbjTqj3JtjZfsrgLHf", "L6JKyztUTZrhaC2oSi2AGhNMneOalgfU", "mLvzPn8zSeH", "6Oneq6t5dYPlbDhRy7qxaYTJsizasisX", "J8", "lXMgpjBtmdYXVX4s4nwhe"};
    }

    public TB(C04484w c04484w) {
        this.A00 = new WeakReference<>(c04484w);
    }

    private void A02(C04484w c04484w) {
        C0924Oq c0924Oq = c04484w.A0C;
        if (c0924Oq != null) {
            c04484w.A06.bringChildToFront(c0924Oq);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A3K(View view, int i2, RelativeLayout.LayoutParams layoutParams) {
        C04484w c04484w = this.A00.get();
        if (c04484w != null) {
            c04484w.A06.addView(view, i2, layoutParams);
            A02(c04484w);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A3L(View view, RelativeLayout.LayoutParams layoutParams) {
        C04484w c04484w = this.A00.get();
        if (c04484w != null) {
            c04484w.A06.addView(view, layoutParams);
            A02(c04484w);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public void A3s(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public void A3t(String str, C9D c9d) {
        if (this.A00.get() != null) {
            this.A00.get().A0G(str, c9d);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A7r(String str, C1Q c1q) {
        if (this.A00.get() != null) {
            C04484w c04484w = this.A00.get();
            String[] strArr = A01;
            if (strArr[0].charAt(19) != strArr[1].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "LaehfLm13EgRqqa58La6JsJDVjNkKsjm";
            strArr2[1] = "U7opStToMRhy5hKGwjx6Oh4Ofub1lgfJ";
            c04484w.A0F(str, c1q);
        }
    }
}
