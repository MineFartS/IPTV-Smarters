package c.f.a.d.k0;

import a.i.r.x;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c.f.a.d.d0.k;
import c.f.a.d.l;

/* JADX INFO: loaded from: classes2.dex */
public class d extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final View.OnTouchListener f15009b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f15010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f15011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f15015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f15016i;

    public static class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(c.f.a.d.o0.a.a.c(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l.q4);
        if (typedArrayObtainStyledAttributes.hasValue(l.x4)) {
            x.w0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r1, 0));
        }
        this.f15012e = typedArrayObtainStyledAttributes.getInt(l.t4, 0);
        this.f15013f = typedArrayObtainStyledAttributes.getFloat(l.u4, 1.0f);
        setBackgroundTintList(c.f.a.d.g0.c.a(context2, typedArrayObtainStyledAttributes, l.v4));
        setBackgroundTintMode(k.e(typedArrayObtainStyledAttributes.getInt(l.w4, -1), PorterDuff.Mode.SRC_IN));
        this.f15014g = typedArrayObtainStyledAttributes.getFloat(l.s4, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f15009b);
        setFocusable(true);
        if (getBackground() == null) {
            x.s0(this, a());
        }
    }

    public final Drawable a() {
        float dimension = getResources().getDimension(c.f.a.d.d.U);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(c.f.a.d.w.a.g(this, c.f.a.d.b.f14636m, c.f.a.d.b.f14633j, getBackgroundOverlayColorAlpha()));
        if (this.f15015h == null) {
            return a.i.j.l.a.r(gradientDrawable);
        }
        Drawable drawableR = a.i.j.l.a.r(gradientDrawable);
        a.i.j.l.a.o(drawableR, this.f15015h);
        return drawableR;
    }

    public float getActionTextColorAlpha() {
        return this.f15014g;
    }

    public int getAnimationMode() {
        return this.f15012e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f15013f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f15011d;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        x.m0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f15011d;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        c cVar = this.f15010c;
        if (cVar != null) {
            cVar.a(this, i2, i3, i4, i5);
        }
    }

    public void setAnimationMode(int i2) {
        this.f15012e = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f15015h != null) {
            drawable = a.i.j.l.a.r(drawable.mutate());
            a.i.j.l.a.o(drawable, this.f15015h);
            a.i.j.l.a.p(drawable, this.f15016i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f15015h = colorStateList;
        if (getBackground() != null) {
            Drawable drawableR = a.i.j.l.a.r(getBackground().mutate());
            a.i.j.l.a.o(drawableR, colorStateList);
            a.i.j.l.a.p(drawableR, this.f15016i);
            if (drawableR != getBackground()) {
                super.setBackgroundDrawable(drawableR);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f15016i = mode;
        if (getBackground() != null) {
            Drawable drawableR = a.i.j.l.a.r(getBackground().mutate());
            a.i.j.l.a.p(drawableR, mode);
            if (drawableR != getBackground()) {
                super.setBackgroundDrawable(drawableR);
            }
        }
    }

    public void setOnAttachStateChangeListener(b bVar) {
        this.f15011d = bVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f15009b);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(c cVar) {
        this.f15010c = cVar;
    }
}
