package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(12)
public final class C0745Hn implements PE {
    public static String[] A0B;
    public View A00;

    @Nullable
    public C0854Lx A01;

    @Nullable
    public PP A02;
    public boolean A03;
    public final Handler A04;
    public final KQ A05;
    public final KK A06;
    public final KE A07;
    public final IX A08;
    public final boolean A09;
    public final boolean A0A;

    static {
        A06();
    }

    public static void A06() {
        A0B = new String[]{"82Zz8oCZg8zkkbzw8opl2Yz4CtrF2SDp", "9Qv", "sj5N5SmrmBRQmWue5o8rJw6ys3alFtJa", "lBA7odrZYL425", "CSSBUKaIJSWMhqfJuWGnuyX4cipoTk5I", "IDQP5gLMbSSnC18VVbdsGZXvkzghwpNg", "Yf1MSxzKxHs57zUlY7hI2xykX4pHUq1P", "T3bn0lMwtbok5v0PvXD6574OGDOrX6LS"};
    }

    public C0745Hn(View view, PP pp, boolean z) {
        this(view, pp, z, false);
    }

    public C0745Hn(View view, @Nullable PP pp, boolean z, boolean z2) {
        this.A06 = new KK() { // from class: com.facebook.ads.redexgen.X.7c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(C05137o c05137o) {
                this.A00.A07(1, 0);
            }
        };
        this.A07 = new KE() { // from class: com.facebook.ads.redexgen.X.7Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(KJ kj) {
                if (!this.A00.A03) {
                    return;
                }
                if (this.A00.A02 == PP.A03 || this.A00.A09) {
                    this.A00.A02 = null;
                    this.A00.A05();
                } else {
                    this.A00.A07(0, 8);
                }
            }
        };
        this.A05 = new KQ() { // from class: com.facebook.ads.redexgen.X.7Y
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(C7q c7q) {
                if (this.A00.A02 == PP.A04) {
                    return;
                }
                this.A00.A00.setAlpha(1.0f);
                this.A00.A00.setVisibility(0);
            }
        };
        this.A08 = new C7X(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A09(view, pp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new PO(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i2, int i3) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i2);
        this.A00.setVisibility(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A09(View view, PP pp) {
        this.A02 = pp;
        this.A00 = view;
        this.A00.clearAnimation();
        if (pp == PP.A04) {
            this.A00.setAlpha(0.0f);
            String[] strArr = A0B;
            if (strArr[5].charAt(26) == strArr[0].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "3OWa54Sl5zOXBo6RskK22JrE4LW5JWKj";
            strArr2[0] = "lt7hksMEFpJVhV2333OBcIopOVPW9bfy";
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    public final void A0G() {
        this.A03 = false;
        A08(null);
    }

    public final boolean A0H() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void A7w(C0854Lx c0854Lx) {
        this.A01 = c0854Lx;
        c0854Lx.getEventBus().A04(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void ADd(C0854Lx c0854Lx) {
        A07(1, 0);
        c0854Lx.getEventBus().A05(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
