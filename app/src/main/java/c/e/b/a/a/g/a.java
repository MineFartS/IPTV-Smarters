package c.e.b.a.a.g;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends g {
    @Override // c.e.b.a.a.g.g
    public void J(Canvas canvas) {
        for (int i2 = 0; i2 < L(); i2++) {
            f fVarK = K(i2);
            int iSave = canvas.save();
            canvas.rotate((i2 * 360) / L(), getBounds().centerX(), getBounds().centerY());
            fVarK.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // c.e.b.a.a.g.g, c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        double dWidth = rectA.width();
        Double.isNaN(dWidth);
        double dL = L();
        Double.isNaN(dL);
        int i2 = (int) (((dWidth * 3.141592653589793d) / 3.5999999046325684d) / dL);
        int iCenterX = rectA.centerX() - i2;
        int iCenterX2 = rectA.centerX() + i2;
        for (int i3 = 0; i3 < L(); i3++) {
            f fVarK = K(i3);
            int i4 = rectA.top;
            fVarK.v(iCenterX, i4, iCenterX2, (i2 * 2) + i4);
        }
    }
}
