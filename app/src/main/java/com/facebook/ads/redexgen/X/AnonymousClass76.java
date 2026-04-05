package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.76, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass76 extends KS {
    public final Paint A00;
    public final X2 A01;

    @Nullable
    public final C0789Jg A02;
    public final KQ A03;
    public final KK A04;
    public final KE A05;
    public final PX A06;

    public AnonymousClass76(X2 x2, boolean z, @Nullable C0789Jg c0789Jg) {
        super(x2);
        this.A04 = new KK() { // from class: com.facebook.ads.redexgen.X.7K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(C05137o c05137o) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A05 = new KE() { // from class: com.facebook.ads.redexgen.X.7J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(KJ kj) {
                this.A00.A06.setChecked(false);
            }
        };
        this.A03 = new KQ() { // from class: com.facebook.ads.redexgen.X.7I
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(C7q c7q) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A02 = c0789Jg;
        this.A01 = x2;
        this.A06 = new PX(x2, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 23.76d), (int) (((double) displayMetrics.density) * 23.76d));
        layoutParams.addRule(13);
        this.A06.setLayoutParams(layoutParams);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        C0856Lz.A0P(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 72.0d), (int) (((double) displayMetrics.density) * 72.0d));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
    }

    @Override // com.facebook.ads.redexgen.X.KS
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A04, this.A05, this.A03);
        }
        setOnClickListener(new PU(this));
    }

    @Override // com.facebook.ads.redexgen.X.KS
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A05(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int centerX = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        canvas.drawCircle(getPaddingLeft() + r4, getPaddingTop() + (centerX / 2), centerX / 2, this.A00);
        super.onDraw(canvas);
    }
}
