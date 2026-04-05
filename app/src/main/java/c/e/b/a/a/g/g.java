package c.e.b.a.a.g;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends f {
    public f[] F = O();
    public int G;

    public g() {
        M();
        N(this.F);
    }

    public void J(Canvas canvas) {
        f[] fVarArr = this.F;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                int iSave = canvas.save();
                fVar.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
    }

    public f K(int i2) {
        f[] fVarArr = this.F;
        if (fVarArr == null) {
            return null;
        }
        return fVarArr[i2];
    }

    public int L() {
        f[] fVarArr = this.F;
        if (fVarArr == null) {
            return 0;
        }
        return fVarArr.length;
    }

    public final void M() {
        f[] fVarArr = this.F;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setCallback(this);
            }
        }
    }

    public void N(f... fVarArr) {
    }

    public abstract f[] O();

    @Override // c.e.b.a.a.g.f
    public void b(Canvas canvas) {
    }

    @Override // c.e.b.a.a.g.f
    public int c() {
        return this.G;
    }

    @Override // c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        J(canvas);
    }

    @Override // c.e.b.a.a.g.f, android.graphics.drawable.Animatable
    public boolean isRunning() {
        return c.e.b.a.a.f.a.b(this.F) || super.isRunning();
    }

    @Override // c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (f fVar : this.F) {
            fVar.setBounds(rect);
        }
    }

    @Override // c.e.b.a.a.g.f
    public ValueAnimator r() {
        return null;
    }

    @Override // c.e.b.a.a.g.f, android.graphics.drawable.Animatable
    public void start() {
        super.start();
        c.e.b.a.a.f.a.e(this.F);
    }

    @Override // c.e.b.a.a.g.f, android.graphics.drawable.Animatable
    public void stop() {
        super.stop();
        c.e.b.a.a.f.a.f(this.F);
    }

    @Override // c.e.b.a.a.g.f
    public void u(int i2) {
        this.G = i2;
        for (int i3 = 0; i3 < L(); i3++) {
            K(i3).u(i2);
        }
    }
}
