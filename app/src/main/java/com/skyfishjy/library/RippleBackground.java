package com.skyfishjy.library;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import c.j.a.b;
import c.j.a.c;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class RippleBackground extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f30041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f30043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f30044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f30045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<Animator> f30046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout.LayoutParams f30047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<a> f30048o;

    public class a extends View {
        public a(Context context) {
            super(context);
            setVisibility(4);
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            float fMin = Math.min(getWidth(), getHeight()) / 2;
            canvas.drawCircle(fMin, fMin, fMin - RippleBackground.this.f30036c, RippleBackground.this.f30043j);
        }
    }

    public RippleBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30044k = false;
        this.f30048o = new ArrayList<>();
        c(context, attributeSet);
    }

    public final void c(Context context, AttributeSet attributeSet) {
        Paint paint;
        Paint.Style style;
        if (isInEditMode()) {
            return;
        }
        if (attributeSet == null) {
            throw new IllegalArgumentException("Attributes should be provided to this view,");
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f18135a);
        this.f30035b = typedArrayObtainStyledAttributes.getColor(c.f18136b, getResources().getColor(c.j.a.a.f18132a));
        this.f30036c = typedArrayObtainStyledAttributes.getDimension(c.f18141g, getResources().getDimension(b.f18134b));
        this.f30037d = typedArrayObtainStyledAttributes.getDimension(c.f18138d, getResources().getDimension(b.f18133a));
        this.f30038e = typedArrayObtainStyledAttributes.getInt(c.f18137c, 3000);
        this.f30039f = typedArrayObtainStyledAttributes.getInt(c.f18139e, 6);
        this.f30041h = typedArrayObtainStyledAttributes.getFloat(c.f18140f, 6.0f);
        this.f30042i = typedArrayObtainStyledAttributes.getInt(c.f18142h, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f30040g = this.f30038e / this.f30039f;
        Paint paint2 = new Paint();
        this.f30043j = paint2;
        paint2.setAntiAlias(true);
        if (this.f30042i == 0) {
            this.f30036c = 0.0f;
            paint = this.f30043j;
            style = Paint.Style.FILL;
        } else {
            paint = this.f30043j;
            style = Paint.Style.STROKE;
        }
        paint.setStyle(style);
        this.f30043j.setColor(this.f30035b);
        float f2 = this.f30037d;
        float f3 = this.f30036c;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) ((f2 + f3) * 2.0f), (int) ((f2 + f3) * 2.0f));
        this.f30047n = layoutParams;
        layoutParams.addRule(13, -1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f30045l = animatorSet;
        animatorSet.setDuration(this.f30038e);
        this.f30045l.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f30046m = new ArrayList<>();
        for (int i2 = 0; i2 < this.f30039f; i2++) {
            a aVar = new a(getContext());
            addView(aVar, this.f30047n);
            this.f30048o.add(aVar);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(aVar, "ScaleX", 1.0f, this.f30041h);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(1);
            objectAnimatorOfFloat.setStartDelay(this.f30040g * i2);
            this.f30046m.add(objectAnimatorOfFloat);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(aVar, "ScaleY", 1.0f, this.f30041h);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.setRepeatMode(1);
            objectAnimatorOfFloat2.setStartDelay(this.f30040g * i2);
            this.f30046m.add(objectAnimatorOfFloat2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(aVar, "Alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat3.setRepeatCount(-1);
            objectAnimatorOfFloat3.setRepeatMode(1);
            objectAnimatorOfFloat3.setStartDelay(this.f30040g * i2);
            this.f30046m.add(objectAnimatorOfFloat3);
        }
        this.f30045l.playTogether(this.f30046m);
    }

    public boolean d() {
        return this.f30044k;
    }

    public void e() {
        if (d()) {
            return;
        }
        Iterator<a> it = this.f30048o.iterator();
        while (it.hasNext()) {
            it.next().setVisibility(0);
        }
        this.f30045l.start();
        this.f30044k = true;
    }

    public void f() {
        if (d()) {
            this.f30045l.end();
            this.f30044k = false;
        }
    }
}
