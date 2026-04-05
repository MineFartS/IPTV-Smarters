package mbanje.kurt.fabbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import j.a.a.b;
import j.a.a.f;
import mbanje.kurt.fabbutton.CircleImageView;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class ProgressRingView extends View implements b.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f31190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f31192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f31193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f31195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f31196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f31198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f31199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f31200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f31201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31202o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public ValueAnimator u;
    public ValueAnimator v;
    public AnimatorSet w;
    public CircleImageView.b x;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f31203b = false;

        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f31203b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f31203b) {
                return;
            }
            ProgressRingView.this.c();
        }
    }

    public ProgressRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31189b = ProgressRingView.class.getSimpleName();
        this.f31191d = 0;
        this.f31193f = 0.14f;
        this.f31195h = 0.14f;
        this.r = DefaultRenderer.BACKGROUND_COLOR;
        b(attributeSet, 0);
    }

    @Override // j.a.a.b.g
    public void a(float f2, float f3, float f4, float f5) {
        CircleImageView.b bVar;
        if (f2 != -1.0f) {
            this.f31200m = f2;
        }
        if (f3 != -1.0f) {
            this.f31201n = f3;
        }
        if (f4 != -1.0f) {
            this.s = f4;
        }
        if (f5 != -1.0f) {
            this.t = f5;
            if (Math.round(f5) != 100 || (bVar = this.x) == null) {
                return;
            }
            bVar.a();
        }
    }

    public void b(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.z, i2, 0);
        this.f31198k = typedArrayObtainStyledAttributes.getFloat(f.C, 0.0f);
        this.r = typedArrayObtainStyledAttributes.getColor(f.M, this.r);
        this.f31199l = typedArrayObtainStyledAttributes.getFloat(f.B, 100.0f);
        this.f31196i = typedArrayObtainStyledAttributes.getBoolean(f.D, false);
        this.f31197j = typedArrayObtainStyledAttributes.getBoolean(f.J, true);
        this.q = typedArrayObtainStyledAttributes.getInteger(f.E, 4000);
        this.f31195h = typedArrayObtainStyledAttributes.getFloat(f.N, this.f31195h);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f31190c = paint;
        paint.setColor(this.r);
        this.f31190c.setStyle(Paint.Style.STROKE);
        this.f31190c.setStrokeCap(Paint.Cap.BUTT);
        if (this.f31197j) {
            e();
        }
    }

    public void c() {
        int i2 = 0;
        f(false);
        boolean z = this.f31196i;
        this.s = -90.0f;
        if (!z) {
            ValueAnimator valueAnimatorC = b.c(this, -90.0f, 270.0f, this);
            this.u = valueAnimatorC;
            valueAnimatorC.start();
            this.t = 0.0f;
            ValueAnimator valueAnimatorB = b.b(this, 0.0f, this.f31198k, this);
            this.v = valueAnimatorB;
            valueAnimatorB.start();
            return;
        }
        this.f31200m = 15.0f;
        this.w = new AnimatorSet();
        AnimatorSet animatorSet = null;
        while (i2 < 4) {
            AnimatorSet animatorSetA = b.a(this, i2, this.q, this);
            AnimatorSet.Builder builderPlay = this.w.play(animatorSetA);
            if (animatorSet != null) {
                builderPlay.after(animatorSet);
            }
            i2++;
            animatorSet = animatorSetA;
        }
        this.w.addListener(new a());
        this.w.start();
    }

    public void d(int i2, boolean z) {
        if (z) {
            i2 = Math.round(this.f31194g * this.f31195h);
        }
        this.f31202o = i2;
        int i3 = this.f31202o;
        this.p = i3 / 2;
        this.f31190c.setStrokeWidth(i3);
        g();
    }

    public void e() {
        c();
    }

    public void f(boolean z) {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.u.cancel();
        }
        ValueAnimator valueAnimator2 = this.v;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.v.cancel();
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.w.cancel();
        }
        if (z) {
            d(0, false);
        } else {
            d(0, true);
        }
        invalidate();
    }

    public final void g() {
        int i2 = this.p;
        int i3 = this.f31191d;
        this.f31192e = new RectF(i2, i2, i3 - i2, i3 - i2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f2 = ((isInEditMode() ? this.f31198k : this.t) / this.f31199l) * 360.0f;
        if (this.f31196i) {
            canvas.drawArc(this.f31192e, this.s + this.f31201n, this.f31200m, false, this.f31190c);
        } else {
            canvas.drawArc(this.f31192e, this.s, f2, false, this.f31190c);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int iMin = Math.min(i2, i3);
        this.f31191d = iMin;
        this.f31194g = iMin / 2;
        d(-1, true);
    }

    public void setAnimDuration(int i2) {
        this.q = i2;
    }

    public void setAutostartanim(boolean z) {
        this.f31197j = z;
    }

    public void setFabViewListener(CircleImageView.b bVar) {
        this.x = bVar;
    }

    public void setIndeterminate(boolean z) {
        this.f31196i = z;
    }

    public void setMaxProgress(float f2) {
        this.f31199l = f2;
    }

    public void setProgress(float f2) {
        this.f31198k = f2;
        if (!this.f31196i) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.v.cancel();
            }
            ValueAnimator valueAnimatorB = b.b(this, this.t, f2, this);
            this.v = valueAnimatorB;
            valueAnimatorB.start();
        }
        invalidate();
    }

    public void setProgressColor(int i2) {
        this.r = i2;
        this.f31190c.setColor(i2);
    }

    public void setRingWidthRatio(float f2) {
        this.f31195h = f2;
    }
}
