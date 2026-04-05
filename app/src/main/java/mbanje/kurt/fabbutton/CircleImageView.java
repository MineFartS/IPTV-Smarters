package mbanje.kurt.fabbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import j.a.a.f;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class CircleImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f31169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f31170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f31171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint f31173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f31174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f31175o;
    public Drawable[] p;
    public TransitionDrawable q;
    public int r;
    public ObjectAnimator s;
    public float t;
    public float u;
    public float v;
    public int w;
    public boolean x;
    public boolean y;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (CircleImageView.this.f31170j != null) {
                CircleImageView.this.f31170j.b(CircleImageView.this.f31167g);
            }
        }
    }

    public interface b {
        void a();

        void b(boolean z);
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31171k = 75;
        this.f31175o = 0.14f;
        this.p = new Drawable[2];
        this.t = 3.5f;
        this.u = 0.0f;
        this.v = 10.0f;
        this.w = 100;
        this.y = true;
        e(context, attributeSet);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        setFocusable(false);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setClickable(true);
        Paint paint = new Paint(1);
        this.f31169i = paint;
        paint.setStyle(Paint.Style.FILL);
        int i2 = getResources().getDisplayMetrics().densityDpi;
        this.v = i2 <= 240 ? 1.0f : i2 <= 320 ? 3.0f : 10.0f;
        Paint paint2 = new Paint(1);
        this.f31173m = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        setWillNotDraw(false);
        setLayerType(1, null);
        int color = DefaultRenderer.BACKGROUND_COLOR;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.z);
            color = typedArrayObtainStyledAttributes.getColor(f.I, DefaultRenderer.BACKGROUND_COLOR);
            this.f31175o = typedArrayObtainStyledAttributes.getFloat(f.N, this.f31175o);
            this.v = typedArrayObtainStyledAttributes.getFloat(f.H, this.v);
            this.t = typedArrayObtainStyledAttributes.getFloat(f.G, this.t);
            this.u = typedArrayObtainStyledAttributes.getFloat(f.F, this.u);
            setShowShadow(typedArrayObtainStyledAttributes.getBoolean(f.P, true));
            typedArrayObtainStyledAttributes.recycle();
        }
        setColor(color);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "currentRingWidth", 0.0f, 0.0f);
        this.s = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.s.addListener(new a());
    }

    public void f(int i2, int i3) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i2);
        if (!this.x) {
            setImageBitmap(bitmapDecodeResource);
        } else {
            g(new BitmapDrawable(getResources(), bitmapDecodeResource), new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), i3)));
        }
    }

    public final void g(Drawable drawable, Drawable drawable2) {
        Drawable[] drawableArr = this.p;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        TransitionDrawable transitionDrawable = new TransitionDrawable(this.p);
        this.q = transitionDrawable;
        transitionDrawable.setCrossFadeEnabled(true);
        setImageDrawable(this.q);
    }

    public float getCurrentRingWidth() {
        return this.f31174n;
    }

    public void h(boolean z, boolean z2) {
        if (z) {
            this.q.startTransition(500);
        }
        if (z2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "currentRingWidth", 0.0f, 0.0f);
            objectAnimatorOfFloat.setFloatValues(1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.start();
        }
    }

    public void i(boolean z) {
        this.f31167g = z;
        if (z) {
            this.s.setFloatValues(this.f31174n, this.r);
        } else {
            this.s.setFloatValues(this.r, 0.0f);
        }
        this.s.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(this.f31165e, this.f31164d, this.f31172l + this.f31174n, this.f31173m);
        canvas.drawCircle(this.f31165e, this.f31164d, this.f31168h, this.f31169i);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f31165e = i2 / 2;
        this.f31164d = i3 / 2;
        int iMin = Math.min(i2, i3) / 2;
        this.f31166f = iMin;
        int iRound = Math.round(iMin * this.f31175o);
        this.r = iRound;
        this.f31168h = this.f31166f - iRound;
        this.f31173m.setStrokeWidth(iRound);
        this.f31173m.setAlpha(75);
        this.f31172l = this.f31168h - (this.r / 2);
    }

    public void setColor(int i2) {
        this.f31169i.setColor(i2);
        this.f31173m.setColor(i2);
        this.f31173m.setAlpha(75);
        invalidate();
    }

    public void setCurrentRingWidth(float f2) {
        this.f31174n = f2;
        invalidate();
    }

    public void setFabViewListener(b bVar) {
        this.f31170j = bVar;
    }

    public void setRingWidthRatio(float f2) {
        this.f31175o = f2;
    }

    public void setShowEndBitmap(boolean z) {
        this.x = z;
    }

    public void setShowShadow(boolean z) {
        if (z) {
            this.f31169i.setShadowLayer(this.v, this.u, this.t, Color.argb(this.w, 0, 0, 0));
        } else {
            this.f31169i.clearShadowLayer();
        }
        invalidate();
    }
}
