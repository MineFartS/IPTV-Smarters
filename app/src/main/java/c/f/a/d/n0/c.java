package c.f.a.d.n0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import c.f.a.d.j0.k;

/* JADX INFO: loaded from: classes2.dex */
public class c extends c.f.a.d.j0.g {
    public final RectF A;
    public int B;
    public final Paint z;

    public c() {
        this(null);
    }

    public c(k kVar) {
        super(kVar == null ? new k() : kVar);
        this.z = new Paint(1);
        r0();
        this.A = new RectF();
    }

    @Override // c.f.a.d.j0.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.A, this.z);
        l0(canvas);
    }

    public boolean k0() {
        return !this.A.isEmpty();
    }

    public final void l0(Canvas canvas) {
        if (s0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.B);
    }

    public final void m0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!s0(callback)) {
            o0(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    public void n0() {
        p0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void o0(Canvas canvas) {
        this.B = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
    }

    public void p0(float f2, float f3, float f4, float f5) {
        RectF rectF = this.A;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }

    public void q0(RectF rectF) {
        p0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void r0() {
        this.z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.z.setColor(-1);
        this.z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final boolean s0(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
