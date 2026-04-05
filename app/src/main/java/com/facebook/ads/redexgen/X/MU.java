package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MU extends View {
    public int A00;
    public Paint A01;
    public Paint A02;
    public Paint A03;
    public boolean A04;

    public MU(X2 x2) {
        this(x2, 60, true);
    }

    public MU(X2 x2, int i2, boolean z) {
        super(x2);
        this.A00 = i2;
        this.A04 = z;
        if (z) {
            this.A02 = new Paint();
            this.A02.setColor(DefaultRenderer.TEXT_COLOR);
            this.A02.setStyle(Paint.Style.STROKE);
            this.A02.setStrokeWidth(3.0f);
            this.A02.setAntiAlias(true);
            this.A01 = new Paint();
            this.A01.setColor(-1287371708);
            this.A01.setStyle(Paint.Style.FILL);
            this.A01.setAntiAlias(true);
            this.A03 = new Paint();
            this.A03.setColor(-1);
            this.A03.setStyle(Paint.Style.STROKE);
            this.A03.setStrokeWidth(6.0f);
            this.A03.setAntiAlias(true);
        }
    }

    public RelativeLayout.LayoutParams getDefaultLayoutParams() {
        float f2 = C0856Lz.A01;
        int i2 = this.A00;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (i2 * f2), (int) (i2 * f2));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        return layoutParams;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A04) {
            if (canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 17) {
                setLayerType(1, null);
            }
            int iMin = Math.min(canvas.getWidth(), canvas.getHeight());
            int i2 = iMin / 2;
            int i3 = iMin / 2;
            int centerY = i2 * 2;
            int i4 = centerY / 3;
            canvas.drawCircle(i2, i3, i4, this.A02);
            int outerRadius = i4 - 2;
            canvas.drawCircle(i2, i3, outerRadius, this.A01);
            int i5 = iMin / 3;
            int innerRadius = iMin / 3;
            int startX = i5 * 2;
            float f2 = startX;
            int startX2 = innerRadius * 2;
            canvas.drawLine(i5, innerRadius, f2, startX2, this.A03);
            int startX3 = i5 * 2;
            int startX4 = innerRadius * 2;
            canvas.drawLine(startX3, innerRadius, i5, startX4, this.A03);
        }
        super.onDraw(canvas);
    }
}
