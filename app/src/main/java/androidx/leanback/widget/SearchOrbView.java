package androidx.leanback.widget;

import a.i.r.x;
import a.n.d;
import a.n.e;
import a.n.f;
import a.n.g;
import a.n.h;
import a.n.l;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.OnClickListener f4563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f4564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f4565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f4566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f4567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f4568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f4572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f4573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f4574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4576o;
    public final ArgbEvaluator p;
    public final ValueAnimator.AnimatorUpdateListener q;
    public ValueAnimator r;
    public final ValueAnimator.AnimatorUpdateListener s;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setSearchOrbZ(valueAnimator.getAnimatedFraction());
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4581c;

        public c(int i2, int i3, int i4) {
            this.f4579a = i2;
            this.f4580b = i3 == i2 ? a(i2) : i3;
            this.f4581c = i4;
        }

        public static int a(int i2) {
            return Color.argb((int) ((Color.alpha(i2) * 0.85f) + 38.25f), (int) ((Color.red(i2) * 0.85f) + 38.25f), (int) ((Color.green(i2) * 0.85f) + 38.25f), (int) ((Color.blue(i2) * 0.85f) + 38.25f));
        }
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.n.a.f2565c);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.p = new ArgbEvaluator();
        this.q = new a();
        this.s = new b();
        Resources resources = context.getResources();
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.f4564c = viewInflate;
        this.f4565d = viewInflate.findViewById(f.D);
        this.f4566e = (ImageView) this.f4564c.findViewById(f.f2619j);
        this.f4569h = context.getResources().getFraction(e.f2607g, 1, 1);
        this.f4570i = context.getResources().getInteger(g.f2628d);
        this.f4571j = context.getResources().getInteger(g.f2629e);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(a.n.c.w);
        this.f4573l = dimensionPixelSize;
        this.f4572k = context.getResources().getDimensionPixelSize(a.n.c.x);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.Z, i2, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(l.c0);
        setOrbIcon(drawable == null ? resources.getDrawable(d.f2595a) : drawable);
        int color = typedArrayObtainStyledAttributes.getColor(l.b0, resources.getColor(a.n.b.f2566a));
        setOrbColors(new c(color, typedArrayObtainStyledAttributes.getColor(l.a0, color), typedArrayObtainStyledAttributes.getColor(l.d0, 0)));
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        x.J0(this.f4566e, dimensionPixelSize);
    }

    public void a(boolean z) {
        float f2 = z ? this.f4569h : 1.0f;
        this.f4564c.animate().scaleX(f2).scaleY(f2).setDuration(this.f4571j).start();
        d(z, this.f4571j);
        b(z);
    }

    public void b(boolean z) {
        this.f4575n = z;
        e();
    }

    public void c(float f2) {
        this.f4565d.setScaleX(f2);
        this.f4565d.setScaleY(f2);
    }

    public final void d(boolean z, int i2) {
        if (this.r == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.r = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(this.s);
        }
        if (z) {
            this.r.start();
        } else {
            this.r.reverse();
        }
        this.r.setDuration(i2);
    }

    public final void e() {
        ValueAnimator valueAnimator = this.f4574m;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f4574m = null;
        }
        if (this.f4575n && this.f4576o) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.p, Integer.valueOf(this.f4568g.f4579a), Integer.valueOf(this.f4568g.f4580b), Integer.valueOf(this.f4568g.f4579a));
            this.f4574m = valueAnimatorOfObject;
            valueAnimatorOfObject.setRepeatCount(-1);
            this.f4574m.setDuration(this.f4570i * 2);
            this.f4574m.addUpdateListener(this.q);
            this.f4574m.start();
        }
    }

    public float getFocusedZoom() {
        return this.f4569h;
    }

    public int getLayoutResourceId() {
        return h.f2641l;
    }

    public int getOrbColor() {
        return this.f4568g.f4579a;
    }

    public c getOrbColors() {
        return this.f4568g;
    }

    public Drawable getOrbIcon() {
        return this.f4567f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4576o = true;
        e();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f4563b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f4576o = false;
        e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        a(z);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.f4563b = onClickListener;
    }

    public void setOrbColor(int i2) {
        setOrbColors(new c(i2, i2, 0));
    }

    public void setOrbColors(c cVar) {
        this.f4568g = cVar;
        this.f4566e.setColorFilter(cVar.f4581c);
        if (this.f4574m == null) {
            setOrbViewColor(this.f4568g.f4579a);
        } else {
            b(true);
        }
    }

    public void setOrbIcon(Drawable drawable) {
        this.f4567f = drawable;
        this.f4566e.setImageDrawable(drawable);
    }

    public void setOrbViewColor(int i2) {
        if (this.f4565d.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.f4565d.getBackground()).setColor(i2);
        }
    }

    public void setSearchOrbZ(float f2) {
        View view = this.f4565d;
        float f3 = this.f4572k;
        x.J0(view, f3 + (f2 * (this.f4573l - f3)));
    }
}
