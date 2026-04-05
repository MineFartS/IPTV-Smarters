package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0936Pd extends AnimatorListenerAdapter {
    public static String[] A01;
    public final /* synthetic */ H1 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"3J5cDVad4mW9vkElMc3OsUS7r8EZlE39", "h6bRkPy553bCAy1amrHUM8RqxgIOW2o8", "fpksqhdo9EiL3TJLaFmG7oCu1r9K", "lJjW0qitu5NILdXsS3BRz5RQsDn5loSa", "jrjPtqo2TtT08iP8QxuH9QitSJIqaNJp", "hUMcZshotDkSaD7wdQ9kJfmyHpwJvjMA", "tSCKCWomP5vbOsQQ1Yiozev7D3nD5ATQ", "aWL5kyBMd9kZhCXXBXyyL0Q3N4I1ZWNc"};
    }

    public C0936Pd(H1 h1) {
        this.A00 = h1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00.A04) {
            View view = this.A00.A03;
            String[] strArr = A01;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "5h3ewWtRejeXOmvUGpWApkn5USeyTQr7";
            strArr2[6] = "VmmYRwr0EoTUCeedPY4atWiJqM07FMep";
            C0856Lz.A0K(view);
        }
        this.A00.A03.setAlpha(0.0f);
        this.A00.A01 = PY.A05;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = PY.A03;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }
}
