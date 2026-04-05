package androidx.cardview.widget;

import a.e.f.b;
import a.e.f.c;
import a.e.f.d;
import a.e.f.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4263b = {R.attr.colorBackground};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f4264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f4269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f4270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f4271j;

    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f4272a;

        public a() {
        }

        @Override // a.e.f.d
        public void a(int i2, int i3, int i4, int i5) {
            CardView.this.f4270i.set(i2, i3, i4, i5);
            CardView cardView = CardView.this;
            Rect rect = cardView.f4269h;
            CardView.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
        }

        @Override // a.e.f.d
        public void b(int i2, int i3) {
            CardView cardView = CardView.this;
            if (i2 > cardView.f4267f) {
                CardView.super.setMinimumWidth(i2);
            }
            CardView cardView2 = CardView.this;
            if (i3 > cardView2.f4268g) {
                CardView.super.setMinimumHeight(i3);
            }
        }

        @Override // a.e.f.d
        public void c(Drawable drawable) {
            this.f4272a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // a.e.f.d
        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // a.e.f.d
        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // a.e.f.d
        public Drawable f() {
            return this.f4272a;
        }

        @Override // a.e.f.d
        public View g() {
            return CardView.this;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f4264c = i2 >= 21 ? new b() : i2 >= 17 ? new a.e.f.a() : new c();
        f4264c.i();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.e.a.f1193a);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        Resources resources;
        int i3;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i2);
        Rect rect = new Rect();
        this.f4269h = rect;
        this.f4270i = new Rect();
        a aVar = new a();
        this.f4271j = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.e.e.f1200a, i2, a.e.d.f1199a);
        int i4 = a.e.e.f1203d;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i4);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f4263b);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i3 = a.e.b.f1195b;
            } else {
                resources = getResources();
                i3 = a.e.b.f1194a;
            }
            colorStateListValueOf = ColorStateList.valueOf(resources.getColor(i3));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(a.e.e.f1204e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(a.e.e.f1205f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(a.e.e.f1206g, 0.0f);
        this.f4265d = typedArrayObtainStyledAttributes.getBoolean(a.e.e.f1208i, false);
        this.f4266e = typedArrayObtainStyledAttributes.getBoolean(a.e.e.f1207h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.e.f1209j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.e.f1211l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.e.f1213n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.e.f1212m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.e.f1210k, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f4267f = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.e.f1201b, 0);
        this.f4268g = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.e.f1202c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f4264c.a(aVar, context, colorStateList, dimension, dimension2, f2);
    }

    public ColorStateList getCardBackgroundColor() {
        return f4264c.h(this.f4271j);
    }

    public float getCardElevation() {
        return f4264c.c(this.f4271j);
    }

    public int getContentPaddingBottom() {
        return this.f4269h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4269h.left;
    }

    public int getContentPaddingRight() {
        return this.f4269h.right;
    }

    public int getContentPaddingTop() {
        return this.f4269h.top;
    }

    public float getMaxCardElevation() {
        return f4264c.g(this.f4271j);
    }

    public boolean getPreventCornerOverlap() {
        return this.f4266e;
    }

    public float getRadius() {
        return f4264c.d(this.f4271j);
    }

    public boolean getUseCompatPadding() {
        return this.f4265d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!(f4264c instanceof b)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.k(this.f4271j)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.j(this.f4271j)), View.MeasureSpec.getSize(i3)), mode2);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        f4264c.m(this.f4271j, ColorStateList.valueOf(i2));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f4264c.m(this.f4271j, colorStateList);
    }

    public void setCardElevation(float f2) {
        f4264c.f(this.f4271j, f2);
    }

    public void setMaxCardElevation(float f2) {
        f4264c.n(this.f4271j, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.f4268g = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.f4267f = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f4266e) {
            this.f4266e = z;
            f4264c.l(this.f4271j);
        }
    }

    public void setRadius(float f2) {
        f4264c.b(this.f4271j, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f4265d != z) {
            this.f4265d = z;
            f4264c.e(this.f4271j);
        }
    }
}
