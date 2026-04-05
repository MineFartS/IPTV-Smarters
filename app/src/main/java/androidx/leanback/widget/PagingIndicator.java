package androidx.leanback.widget;

import a.n.l;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class PagingIndicator extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f4492b = new DecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Property<d, Float> f4493c = new a(Float.class, "alpha");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Property<d, Float> f4494d = new b(Float.class, "diameter");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Property<d, Float> f4495e = new c(Float.class, "translation_x");
    public final AnimatorSet A;
    public Bitmap B;
    public Paint C;
    public final Rect D;
    public final float E;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d[] f4504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f4505o;
    public int[] p;
    public int[] q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final Paint w;
    public final Paint x;
    public final AnimatorSet y;
    public final AnimatorSet z;

    public static class a extends Property<d, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.d());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f2) {
            dVar.i(f2.floatValue());
        }
    }

    public static class b extends Property<d, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.e());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f2) {
            dVar.j(f2.floatValue());
        }
    }

    public static class c extends Property<d, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.f());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f2) {
            dVar.k(f2.floatValue());
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f4506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f4508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f4509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f4510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f4511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f4512g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f4513h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f4514i;

        public d() {
            this.f4514i = PagingIndicator.this.f4496f ? 1.0f : -1.0f;
        }

        public void a() {
            this.f4507b = Color.argb(Math.round(this.f4506a * 255.0f), Color.red(PagingIndicator.this.v), Color.green(PagingIndicator.this.v), Color.blue(PagingIndicator.this.v));
        }

        public void b() {
            this.f4508c = 0.0f;
            this.f4509d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f4510e = pagingIndicator.f4497g;
            float f2 = pagingIndicator.f4498h;
            this.f4511f = f2;
            this.f4512g = f2 * pagingIndicator.E;
            this.f4506a = 0.0f;
            a();
        }

        public void c(Canvas canvas) {
            float f2 = this.f4509d + this.f4508c;
            canvas.drawCircle(f2, r1.r, this.f4511f, PagingIndicator.this.w);
            if (this.f4506a > 0.0f) {
                PagingIndicator.this.x.setColor(this.f4507b);
                canvas.drawCircle(f2, r1.r, this.f4511f, PagingIndicator.this.x);
                PagingIndicator pagingIndicator = PagingIndicator.this;
                Bitmap bitmap = pagingIndicator.B;
                Rect rect = pagingIndicator.D;
                float f3 = this.f4512g;
                int i2 = PagingIndicator.this.r;
                canvas.drawBitmap(bitmap, rect, new Rect((int) (f2 - f3), (int) (i2 - f3), (int) (f2 + f3), (int) (i2 + f3)), PagingIndicator.this.C);
            }
        }

        public float d() {
            return this.f4506a;
        }

        public float e() {
            return this.f4510e;
        }

        public float f() {
            return this.f4508c;
        }

        public void g() {
            this.f4514i = PagingIndicator.this.f4496f ? 1.0f : -1.0f;
        }

        public void h() {
            this.f4508c = 0.0f;
            this.f4509d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f4510e = pagingIndicator.f4500j;
            float f2 = pagingIndicator.f4501k;
            this.f4511f = f2;
            this.f4512g = f2 * pagingIndicator.E;
            this.f4506a = 1.0f;
            a();
        }

        public void i(float f2) {
            this.f4506a = f2;
            a();
            PagingIndicator.this.invalidate();
        }

        public void j(float f2) {
            this.f4510e = f2;
            float f3 = f2 / 2.0f;
            this.f4511f = f3;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f4512g = f3 * pagingIndicator.E;
            pagingIndicator.invalidate();
        }

        public void k(float f2) {
            this.f4508c = f2 * this.f4513h * this.f4514i;
            PagingIndicator.this.invalidate();
        }
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AnimatorSet animatorSet = new AnimatorSet();
        this.A = animatorSet;
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.p, i2, 0);
        int iG = g(typedArrayObtainStyledAttributes, l.w, a.n.c.f2590k);
        this.f4498h = iG;
        this.f4497g = iG * 2;
        int iG2 = g(typedArrayObtainStyledAttributes, l.s, a.n.c.f2586g);
        this.f4501k = iG2;
        int i3 = iG2 * 2;
        this.f4500j = i3;
        this.f4499i = g(typedArrayObtainStyledAttributes, l.v, a.n.c.f2589j);
        this.f4502l = g(typedArrayObtainStyledAttributes, l.u, a.n.c.f2585f);
        int iF = f(typedArrayObtainStyledAttributes, l.t, a.n.b.f2569d);
        Paint paint = new Paint(1);
        this.w = paint;
        paint.setColor(iF);
        this.v = f(typedArrayObtainStyledAttributes, l.q, a.n.b.f2567b);
        if (this.C == null) {
            int i4 = l.r;
            if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                setArrowColor(typedArrayObtainStyledAttributes.getColor(i4, 0));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f4496f = resources.getConfiguration().getLayoutDirection() == 0;
        int color = resources.getColor(a.n.b.f2568c);
        int dimensionPixelSize = resources.getDimensionPixelSize(a.n.c.f2588i);
        this.f4503m = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.x = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(a.n.c.f2587h);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color);
        this.B = h();
        this.D = new Rect(0, 0, this.B.getWidth(), this.B.getHeight());
        this.E = this.B.getWidth() / i3;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        animatorSet2.playTogether(c(0.0f, 1.0f), d(iG * 2, iG2 * 2), e());
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.z = animatorSet3;
        animatorSet3.playTogether(c(1.0f, 0.0f), d(iG2 * 2, iG * 2), e());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f4500j + getPaddingBottom() + this.f4503m;
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth() {
        return (this.f4498h * 2) + (this.f4502l * 2) + ((this.s - 3) * this.f4499i);
    }

    private void setSelectedPage(int i2) {
        if (i2 == this.t) {
            return;
        }
        this.t = i2;
        a();
    }

    public final void a() {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = this.t;
            if (i3 >= i2) {
                break;
            }
            this.f4504n[i3].b();
            d[] dVarArr = this.f4504n;
            d dVar = dVarArr[i3];
            if (i3 != this.u) {
                f = 1.0f;
            }
            dVar.f4513h = f;
            dVarArr[i3].f4509d = this.p[i3];
            i3++;
        }
        this.f4504n[i2].h();
        d[] dVarArr2 = this.f4504n;
        int i4 = this.t;
        dVarArr2[i4].f4513h = this.u >= i4 ? 1.0f : -1.0f;
        d dVar2 = dVarArr2[i4];
        int i5 = this.f4505o[i4];
        while (true) {
            dVar2.f4509d = i5;
            i4++;
            if (i4 >= this.s) {
                return;
            }
            this.f4504n[i4].b();
            d[] dVarArr3 = this.f4504n;
            dVarArr3[i4].f4513h = 1.0f;
            dVar2 = dVarArr3[i4];
            i5 = this.q[i4];
        }
    }

    public final void b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i2 = (paddingLeft + width) / 2;
        int i3 = this.s;
        int[] iArr = new int[i3];
        this.f4505o = iArr;
        int[] iArr2 = new int[i3];
        this.p = iArr2;
        int[] iArr3 = new int[i3];
        this.q = iArr3;
        int i4 = 1;
        int i5 = requiredWidth / 2;
        if (this.f4496f) {
            int i6 = i2 - i5;
            int i7 = this.f4498h;
            int i8 = this.f4499i;
            int i9 = this.f4502l;
            iArr[0] = ((i6 + i7) - i8) + i9;
            iArr2[0] = i6 + i7;
            iArr3[0] = ((i6 + i7) - (i8 * 2)) + (i9 * 2);
            while (i4 < this.s) {
                int[] iArr4 = this.f4505o;
                int[] iArr5 = this.p;
                int i10 = i4 - 1;
                int i11 = iArr5[i10];
                int i12 = this.f4502l;
                iArr4[i4] = i11 + i12;
                iArr5[i4] = iArr5[i10] + this.f4499i;
                this.q[i4] = iArr4[i10] + i12;
                i4++;
            }
        } else {
            int i13 = i2 + i5;
            int i14 = this.f4498h;
            int i15 = this.f4499i;
            int i16 = this.f4502l;
            iArr[0] = ((i13 - i14) + i15) - i16;
            iArr2[0] = i13 - i14;
            iArr3[0] = ((i13 - i14) + (i15 * 2)) - (i16 * 2);
            while (i4 < this.s) {
                int[] iArr6 = this.f4505o;
                int[] iArr7 = this.p;
                int i17 = i4 - 1;
                int i18 = iArr7[i17];
                int i19 = this.f4502l;
                iArr6[i4] = i18 - i19;
                iArr7[i4] = iArr7[i17] - this.f4499i;
                this.q[i4] = iArr6[i17] - i19;
                i4++;
            }
        }
        this.r = paddingTop + this.f4501k;
        a();
    }

    public final Animator c(float f2, float f3) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, f4493c, f2, f3);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(f4492b);
        return objectAnimatorOfFloat;
    }

    public final Animator d(float f2, float f3) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, f4494d, f2, f3);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(f4492b);
        return objectAnimatorOfFloat;
    }

    public final Animator e() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, f4495e, (-this.f4502l) + this.f4499i, 0.0f);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(f4492b);
        return objectAnimatorOfFloat;
    }

    public final int f(TypedArray typedArray, int i2, int i3) {
        return typedArray.getColor(i2, getResources().getColor(i3));
    }

    public final int g(TypedArray typedArray, int i2, int i3) {
        return typedArray.getDimensionPixelOffset(i2, getResources().getDimensionPixelOffset(i3));
    }

    public int[] getDotSelectedLeftX() {
        return this.p;
    }

    public int[] getDotSelectedRightX() {
        return this.q;
    }

    public int[] getDotSelectedX() {
        return this.f4505o;
    }

    public int getPageCount() {
        return this.s;
    }

    public final Bitmap h() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), a.n.d.f2596b);
        if (this.f4496f) {
            return bitmapDecodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.s; i2++) {
            this.f4504n[i2].c(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i3));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i3);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i2));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z = i2 == 0;
        if (this.f4496f != z) {
            this.f4496f = z;
            this.B = h();
            d[] dVarArr = this.f4504n;
            if (dVarArr != null) {
                for (d dVar : dVarArr) {
                    dVar.g();
                }
            }
            b();
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        setMeasuredDimension(i2, i3);
        b();
    }

    public void setArrowBackgroundColor(int i2) {
        this.v = i2;
    }

    public void setArrowColor(int i2) {
        if (this.C == null) {
            this.C = new Paint();
        }
        this.C.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i2) {
        this.w.setColor(i2);
    }

    public void setPageCount(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The page count should be a positive integer");
        }
        this.s = i2;
        this.f4504n = new d[i2];
        for (int i3 = 0; i3 < this.s; i3++) {
            this.f4504n[i3] = new d();
        }
        b();
        setSelectedPage(0);
    }
}
