package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4W, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4W implements Runnable {
    public static byte[] A07;
    public static String[] A08;
    public OverScroller A01;
    public int A02;
    public int A03;
    public final /* synthetic */ C0660Eb A06;
    public Interpolator A00 = C0660Eb.A1A;
    public boolean A04 = false;
    public boolean A05 = false;

    static {
        A04();
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-46, -42, -96, -45, -29, -14, -17, -20, -20};
    }

    public static void A04() {
        A08 = new String[]{"c4xSVVt4fNiIZ9aJ0ftrOCVpKy2EJW", "bj77oS7wYHzhrY124YppwtIfPTuDoAHL", "mRmZUQV2DMpprRsDQaH8Mtbq5JuQtR14", "UXM5", "qfxFRQLCBxpF20va4RNO9ygLlTXV5cTV", "Bw29gSSAA0erG37CQVEqOkFPeCj6ZZr8", "KVIri1u0fbW7r5jnncTGzAnirlJcKx", "TA0EOfT3Z02jNldii3VIEnkki3"};
    }

    public C4W(C0660Eb c0660Eb) {
        this.A06 = c0660Eb;
        this.A01 = new OverScroller(c0660Eb.getContext(), C0660Eb.A1A);
    }

    private float A00(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    private int A01(int absDx, int absDy, int i2, int i3) {
        int iRound;
        int containerSize = Math.abs(absDx);
        int halfContainerSize = Math.abs(absDy);
        boolean z = containerSize > halfContainerSize;
        int iSqrt = (int) Math.sqrt((i2 * i2) + (i3 * i3));
        int iSqrt2 = (int) Math.sqrt((absDx * absDx) + (absDy * absDy));
        C0660Eb c0660Eb = this.A06;
        int width = z ? c0660Eb.getWidth() : c0660Eb.getHeight();
        int delta = width / 2;
        float fA00 = delta + (delta * A00(Math.min(1.0f, (iSqrt2 * 1.0f) / width)));
        if (iSqrt > 0) {
            iRound = Math.round(Math.abs(fA00 / iSqrt) * 1000.0f) * 4;
        } else {
            if (!z) {
                containerSize = halfContainerSize;
            }
            iRound = (int) (((containerSize / width) + 1.0f) * 300.0f);
        }
        return Math.min(iRound, AdError.SERVER_ERROR_CODE);
    }

    private final void A05() {
        this.A05 = false;
        this.A04 = true;
    }

    private final void A06() {
        this.A04 = false;
        if (this.A05) {
            A08();
        }
    }

    private final void A07(int i2, int i3, int i4, int i5) {
        A0C(i2, i3, A01(i2, i3, i4, i5));
    }

    public final void A08() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        this.A06.removeCallbacks(this);
        if (A08[4].charAt(10) == 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[2] = "DBTzn4opHB64KJUt1kyQdTPFEm6jko5S";
        strArr[2] = "DBTzn4opHB64KJUt1kyQdTPFEm6jko5S";
        C2u.A0C(this.A06, this);
    }

    public final void A09() {
        this.A06.removeCallbacks(this);
        this.A01.abortAnimation();
    }

    public final void A0A(int i2, int i3) {
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        A08();
    }

    public final void A0B(int i2, int i3) {
        A07(i2, i3, 0, 0);
    }

    public final void A0C(int i2, int i3, int i4) {
        A0D(i2, i3, i4, C0660Eb.A1A);
    }

    public final void A0D(int i2, int i3, int i4, Interpolator interpolator) {
        if (this.A00 != interpolator) {
            this.A00 = interpolator;
            this.A01 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.startScroll(0, 0, i2, i3, i4);
        if (Build.VERSION.SDK_INT < 23) {
            OverScroller overScroller = this.A01;
            if (A08[7].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[2] = "UeYo97OquvC2FnZv3LivDSVIricXCoYT";
            strArr[2] = "UeYo97OquvC2FnZv3LivDSVIricXCoYT";
            overScroller.computeScrollOffset();
        }
        A08();
    }

    public final void A0E(int i2, int i3, Interpolator interpolator) {
        int iA01 = A01(i2, i3, 0, 0);
        if (interpolator == null) {
            interpolator = C0660Eb.A1A;
        }
        A0D(i2, i3, iA01, interpolator);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0229  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4W.run():void");
    }
}
