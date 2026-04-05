package com.facebook.ads.redexgen.X;

import android.R;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.amazonaws.services.s3.internal.Constants;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class H8 extends RelativeLayout implements PE {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public C9F A03;
    public C9F A04;
    public C9F A05;
    public C9F A06;

    @Nullable
    public C0854Lx A07;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A08 = new byte[]{-71, -69, -72, -80, -69, -82, -68, -68};
    }

    static {
        A05();
        A09 = (int) (C0856Lz.A01 * 6.0f);
    }

    public H8(X2 x2) {
        this(x2, A09, -12549889, 0);
    }

    public H8(X2 x2, int i2, int i3, int i4) {
        super(x2);
        this.A00 = -1;
        this.A06 = new AbstractC0785Jc() { // from class: com.facebook.ads.redexgen.X.6X
            public static String[] A01;

            static {
                A00();
            }

            public static void A00() {
                A01 = new String[]{"5cZwmFwOCvoIimHKJKs7c8Wrfuwl5", "kR6Rx7ETQGlVhfpD5OxJcFg21Ovz094i", "oaAjYFLN3m9AYmyloxlSIBJp6ETHW3KF", "dCQrNLE74jmKWuOaqJJ4Sbhiwuuv5ad", "onBgfHhqxGhqxLvpU2wfKqg3mDsyExyq", "SCROov7hAW1gh5oss5LLtyUv0yBfa", "SAPoZVZ00ZwZwmL71sxtzrpJli3hIy2X", "TEn6j3AzMnGgqeyMrOghHZKrMbMLSMuC"};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final void A04(C05127n c05127n) {
                if (this.A00.A07 != null) {
                    H8 h8 = this.A00;
                    String[] strArr = A01;
                    if (strArr[2].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A01;
                    strArr2[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    strArr2[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    h8.A04();
                }
            }
        };
        this.A04 = new KK() { // from class: com.facebook.ads.redexgen.X.5m
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(C05137o c05137o) {
                this.A00.A03();
            }
        };
        this.A05 = new KE() { // from class: com.facebook.ads.redexgen.X.4b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(KJ kj) {
                if (this.A00.A07 == null) {
                    return;
                }
                this.A00.A04();
            }
        };
        this.A03 = new KQ() { // from class: com.facebook.ads.redexgen.X.4T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(C7q c7q) {
                if (this.A00.A07 == null) {
                    return;
                }
                this.A00.A02();
            }
        };
        this.A02 = new ProgressBar(x2, null, R.attr.progressBarStyleHorizontal);
        A0A(i3, i4);
        this.A02.setMax(Constants.MAXIMUM_UPLOAD_PARTS);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A03();
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), 0, 0);
        this.A01.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A07 == null) {
            return;
        }
        A03();
        int progress = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int i2 = duration > 0 ? (progress * Constants.MAXIMUM_UPLOAD_PARTS) / duration : 0;
        int i3 = this.A00;
        if (i3 >= i2 || duration <= progress) {
            return;
        }
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), i3, i2);
        ObjectAnimator objectAnimator = this.A01;
        int duration2 = Math.min(250, duration - progress);
        objectAnimator.setDuration(duration2);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = i2;
    }

    public final void A09() {
        A03();
        this.A02 = null;
        this.A07 = null;
    }

    public final void A0A(int i2, int i3) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(i3), new ColorDrawable(i3), new ScaleDrawable(new ColorDrawable(i2), 8388611, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        this.A02.setProgressDrawable(layerDrawable);
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void A7w(C0854Lx c0854Lx) {
        this.A07 = c0854Lx;
        c0854Lx.getEventBus().A04(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void ADd(C0854Lx c0854Lx) {
        c0854Lx.getEventBus().A05(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
