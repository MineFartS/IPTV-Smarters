package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class R6 extends O9 {
    public RelativeLayout A00;
    public C0869Mm A01;
    public ON A02;
    public PI A03;
    public C0922Oo A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final X2 A0B;
    public final KQ A0C;
    public final KK A0D;
    public final KE A0E;
    public final AbstractC0787Je A0F;
    public final IL A0G;
    public final String A0H;
    public static final int A0J = (int) (C0856Lz.A01 * 1.0f);
    public static final int A0K = (int) (C0856Lz.A01 * 4.0f);
    public static final int A0I = (int) (C0856Lz.A01 * 6.0f);

    public abstract void A0h(X2 x2);

    public R6(OD od, boolean z, String str, PI pi) {
        super(od, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0G = new IL() { // from class: com.facebook.ads.redexgen.X.9C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(IV iv) {
                this.A00.A03.A0Z().setVolume(this.A00.getVideoView().getVolume());
            }
        };
        this.A0C = new KQ() { // from class: com.facebook.ads.redexgen.X.8s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(C7q c7q) {
                this.A00.A03.A0X().ABG(((Integer) this.A00.getTag(-1593835536)).intValue());
            }
        };
        this.A0E = new KE() { // from class: com.facebook.ads.redexgen.X.8r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(KJ kj) {
                this.A00.A03.A0Y().ABN(this.A00);
            }
        };
        this.A0D = new KK() { // from class: com.facebook.ads.redexgen.X.8q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(C05137o c05137o) {
                this.A00.A03.A0Y().ABM(this.A00);
            }
        };
        this.A0F = new AbstractC0787Je() { // from class: com.facebook.ads.redexgen.X.8p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(K5 k5) {
                this.A00.A07 = true;
                this.A00.A01();
            }
        };
        this.A03 = pi;
        this.A0H = str;
        this.A0B = od.A05();
        setGravity(17);
        int i2 = A0J;
        setPadding(i2, 0, i2, i2);
        C0856Lz.A0P(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(DefaultRenderer.BACKGROUND_COLOR);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A02 == null) {
            return;
        }
        if ((A0k() && this.A07) || (!A0k() && this.A06)) {
            this.A02.A8x();
        }
    }

    private void A02(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        C0856Lz.A0N(view);
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public boolean A0M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final boolean A0c() {
        return false;
    }

    public final void A0e() {
        if (A0k()) {
            this.A04.A01();
        }
    }

    public final void A0f() {
        if (A0k()) {
            A0g();
            this.A04.A05(PD.A03);
        }
    }

    public final void A0g() {
        float volume = this.A03.A0Z().getVolume();
        if (A0k() && volume != this.A04.getVolume()) {
            this.A04.setVolume(volume);
        }
    }

    public final void A0i(Map<String, String> map) {
        this.A04.A02();
        if (A0k()) {
            this.A04.A04(getAdEventManager(), this.A0H, map);
        }
    }

    public final boolean A0j() {
        return A0k() && this.A04.A06();
    }

    public final boolean A0k() {
        return this.A05;
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final C0922Oo getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.A09;
        RectF rectF = this.A0A;
        int i2 = A0I;
        path.addRoundRect(rectF, i2, i2, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0J, 0.0f, getWidth() - A0J, getHeight() - A0J);
        Path path2 = this.A09;
        RectF rectF2 = this.A0A;
        int i3 = A0K;
        path2.addRoundRect(rectF2, i3, i3, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A02(str, str2, null, true, false);
    }

    public void setCTAInfo(C1I c1i, Map<String, String> map) {
        getCtaButton().setCta(c1i, this.A0H, map);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new XE(this.A01, this.A0B).A05().A07(new R7(this)).A08(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(ON on) {
        this.A02 = on;
    }

    public void setUpImageView(X2 x2) {
        this.A01 = new C0869Mm(x2);
        A02(this.A01);
    }

    public void setUpMediaContainer(X2 x2) {
        this.A00 = new RelativeLayout(x2);
        A02(this.A00);
    }

    public void setUpVideoView(X2 x2) {
        this.A04 = new C0922Oo(x2, new C0789Jg(this.A0H, getAdEventManager()));
        A02(this.A04);
    }

    private void setUpView(X2 x2) {
        setUpImageView(x2);
        setUpVideoView(x2);
        setUpMediaContainer(x2);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A0h(x2);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0C);
        this.A04.A03(this.A0E);
        this.A04.A03(this.A0D);
        this.A04.A03(this.A0F);
    }
}
