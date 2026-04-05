package a.b.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class t extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f759i;

    public t(SeekBar seekBar) {
        super(seekBar);
        this.f756f = null;
        this.f757g = null;
        this.f758h = false;
        this.f759i = false;
        this.f754d = seekBar;
    }

    @Override // a.b.q.p
    public void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        Context context = this.f754d.getContext();
        int[] iArr = a.b.j.V;
        u0 u0VarV = u0.v(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f754d;
        a.i.r.x.n0(seekBar, seekBar.getContext(), iArr, attributeSet, u0VarV.r(), i2, 0);
        Drawable drawableH = u0VarV.h(a.b.j.W);
        if (drawableH != null) {
            this.f754d.setThumb(drawableH);
        }
        j(u0VarV.g(a.b.j.X));
        int i3 = a.b.j.Z;
        if (u0VarV.s(i3)) {
            this.f757g = b0.e(u0VarV.k(i3, -1), this.f757g);
            this.f759i = true;
        }
        int i4 = a.b.j.Y;
        if (u0VarV.s(i4)) {
            this.f756f = u0VarV.c(i4);
            this.f758h = true;
        }
        u0VarV.w();
        f();
    }

    public final void f() {
        Drawable drawable = this.f755e;
        if (drawable != null) {
            if (this.f758h || this.f759i) {
                Drawable drawableR = a.i.j.l.a.r(drawable.mutate());
                this.f755e = drawableR;
                if (this.f758h) {
                    a.i.j.l.a.o(drawableR, this.f756f);
                }
                if (this.f759i) {
                    a.i.j.l.a.p(this.f755e, this.f757g);
                }
                if (this.f755e.isStateful()) {
                    this.f755e.setState(this.f754d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f755e != null) {
            int max = this.f754d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f755e.getIntrinsicWidth();
                int intrinsicHeight = this.f755e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f755e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f754d.getWidth() - this.f754d.getPaddingLeft()) - this.f754d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f754d.getPaddingLeft(), this.f754d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f755e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f755e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f754d.getDrawableState())) {
            this.f754d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f755e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f755e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f755e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f754d);
            a.i.j.l.a.m(drawable, a.i.r.x.C(this.f754d));
            if (drawable.isStateful()) {
                drawable.setState(this.f754d.getDrawableState());
            }
            f();
        }
        this.f754d.invalidate();
    }
}
