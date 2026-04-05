package androidx.appcompat.widget;

import a.b.h;
import a.b.j;
import a.b.q.a1;
import a.b.q.b0;
import a.b.q.p0;
import a.b.q.u0;
import a.b.q.w;
import a.i.r.x;
import a.i.s.i;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Property<SwitchCompat, Float> f4219b = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f4220c = {R.attr.state_checked};
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final TextPaint I;
    public ColorStateList J;
    public Layout K;
    public Layout L;
    public TransformationMethod M;
    public ObjectAnimator N;
    public final w O;
    public final Rect P;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f4221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f4222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f4223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f4226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f4227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f4228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4232o;
    public int p;
    public boolean q;
    public CharSequence r;
    public CharSequence s;
    public boolean t;
    public int u;
    public int v;
    public float w;
    public float x;
    public VelocityTracker y;
    public int z;

    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.A);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f2) {
            switchCompat.setThumbPosition(f2.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.Q);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4222e = null;
        this.f4223f = null;
        this.f4224g = false;
        this.f4225h = false;
        this.f4227j = null;
        this.f4228k = null;
        this.f4229l = false;
        this.f4230m = false;
        this.y = VelocityTracker.obtain();
        this.P = new Rect();
        p0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = j.Q2;
        u0 u0VarV = u0.v(context, attributeSet, iArr, i2, 0);
        x.n0(this, context, iArr, attributeSet, u0VarV.r(), i2, 0);
        Drawable drawableG = u0VarV.g(j.T2);
        this.f4221d = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = u0VarV.g(j.c3);
        this.f4226i = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        this.r = u0VarV.p(j.R2);
        this.s = u0VarV.p(j.S2);
        this.t = u0VarV.a(j.U2, true);
        this.f4231n = u0VarV.f(j.Z2, 0);
        this.f4232o = u0VarV.f(j.W2, 0);
        this.p = u0VarV.f(j.X2, 0);
        this.q = u0VarV.a(j.V2, false);
        ColorStateList colorStateListC = u0VarV.c(j.a3);
        if (colorStateListC != null) {
            this.f4222e = colorStateListC;
            this.f4224g = true;
        }
        PorterDuff.Mode modeE = b0.e(u0VarV.k(j.b3, -1), null);
        if (this.f4223f != modeE) {
            this.f4223f = modeE;
            this.f4225h = true;
        }
        if (this.f4224g || this.f4225h) {
            b();
        }
        ColorStateList colorStateListC2 = u0VarV.c(j.d3);
        if (colorStateListC2 != null) {
            this.f4227j = colorStateListC2;
            this.f4229l = true;
        }
        PorterDuff.Mode modeE2 = b0.e(u0VarV.k(j.e3, -1), null);
        if (this.f4228k != modeE2) {
            this.f4228k = modeE2;
            this.f4230m = true;
        }
        if (this.f4229l || this.f4230m) {
            c();
        }
        int iN = u0VarV.n(j.Y2, 0);
        if (iN != 0) {
            k(context, iN);
        }
        w wVar = new w(this);
        this.O = wVar;
        wVar.m(attributeSet, i2);
        u0VarV.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.v = viewConfiguration.getScaledTouchSlop();
        this.z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public static float f(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    private boolean getTargetCheckedState() {
        return this.A > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((a1.b(this) ? 1.0f - this.A : this.A) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f4226i;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.P;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f4221d;
        Rect rectD = drawable2 != null ? b0.d(drawable2) : b0.f555c;
        return ((((this.B - this.D) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    public final void a(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f4219b, z ? 1.0f : 0.0f);
        this.N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.N.setAutoCancel(true);
        }
        this.N.start();
    }

    public final void b() {
        Drawable drawable = this.f4221d;
        if (drawable != null) {
            if (this.f4224g || this.f4225h) {
                Drawable drawableMutate = a.i.j.l.a.r(drawable).mutate();
                this.f4221d = drawableMutate;
                if (this.f4224g) {
                    a.i.j.l.a.o(drawableMutate, this.f4222e);
                }
                if (this.f4225h) {
                    a.i.j.l.a.p(this.f4221d, this.f4223f);
                }
                if (this.f4221d.isStateful()) {
                    this.f4221d.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f4226i;
        if (drawable != null) {
            if (this.f4229l || this.f4230m) {
                Drawable drawableMutate = a.i.j.l.a.r(drawable).mutate();
                this.f4226i = drawableMutate;
                if (this.f4229l) {
                    a.i.j.l.a.o(drawableMutate, this.f4227j);
                }
                if (this.f4230m) {
                    a.i.j.l.a.p(this.f4226i, this.f4228k);
                }
                if (this.f4226i.isStateful()) {
                    this.f4226i.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        Rect rect = this.P;
        int i4 = this.E;
        int i5 = this.F;
        int i6 = this.G;
        int i7 = this.H;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f4221d;
        Rect rectD = drawable != null ? b0.d(drawable) : b0.f555c;
        Drawable drawable2 = this.f4226i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (rectD != null) {
                int i9 = rectD.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rectD.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = rectD.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rectD.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                }
                this.f4226i.setBounds(i4, i2, i6, i3);
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f4226i.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f4221d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.D + rect.right;
            this.f4221d.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                a.i.j.l.a.l(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.f4221d;
        if (drawable != null) {
            a.i.j.l.a.k(drawable, f2, f3);
        }
        Drawable drawable2 = this.f4226i;
        if (drawable2 != null) {
            a.i.j.l.a.k(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4221d;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f4226i;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final boolean g(float f2, float f3) {
        if (this.f4221d == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f4221d.getPadding(this.P);
        int i2 = this.F;
        int i3 = this.v;
        int i4 = i2 - i3;
        int i5 = (this.E + thumbOffset) - i3;
        int i6 = this.D + i5;
        Rect rect = this.P;
        return f2 > ((float) i5) && f2 < ((float) (((i6 + rect.left) + rect.right) + i3)) && f3 > ((float) i4) && f3 < ((float) (this.H + i3));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!a1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.p : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (a1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.p : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.t;
    }

    public boolean getSplitTrack() {
        return this.q;
    }

    public int getSwitchMinWidth() {
        return this.f4232o;
    }

    public int getSwitchPadding() {
        return this.p;
    }

    public CharSequence getTextOff() {
        return this.s;
    }

    public CharSequence getTextOn() {
        return this.r;
    }

    public Drawable getThumbDrawable() {
        return this.f4221d;
    }

    public int getThumbTextPadding() {
        return this.f4231n;
    }

    public ColorStateList getThumbTintList() {
        return this.f4222e;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f4223f;
    }

    public Drawable getTrackDrawable() {
        return this.f4226i;
    }

    public ColorStateList getTrackTintList() {
        return this.f4227j;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f4228k;
    }

    public final Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.M;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.I, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void i() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.s;
            if (string == null) {
                string = getResources().getString(h.f102b);
            }
            x.E0(this, string);
        }
    }

    public final void j() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.r;
            if (string == null) {
                string = getResources().getString(h.f103c);
            }
            x.E0(this, string);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4221d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4226i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    public void k(Context context, int i2) {
        u0 u0VarT = u0.t(context, i2, j.f3);
        ColorStateList colorStateListC = u0VarT.c(j.j3);
        if (colorStateListC == null) {
            colorStateListC = getTextColors();
        }
        this.J = colorStateListC;
        int iF = u0VarT.f(j.g3, 0);
        if (iF != 0) {
            float f2 = iF;
            if (f2 != this.I.getTextSize()) {
                this.I.setTextSize(f2);
                requestLayout();
            }
        }
        m(u0VarT.k(j.h3, -1), u0VarT.k(j.i3, -1));
        this.M = u0VarT.a(j.q3, false) ? new a.b.o.a(getContext()) : null;
        u0VarT.w();
    }

    public void l(Typeface typeface, int i2) {
        if (i2 <= 0) {
            this.I.setFakeBoldText(false);
            this.I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int style = ((typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0) ^ (-1)) & i2;
            this.I.setFakeBoldText((style & 1) != 0);
            this.I.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void m(int i2, int i3) {
        l(i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i3);
    }

    public final void n(MotionEvent motionEvent) {
        this.u = 0;
        boolean targetCheckedState = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.y.computeCurrentVelocity(1000);
            float xVelocity = this.y.getXVelocity();
            if (Math.abs(xVelocity) <= this.z) {
                targetCheckedState = getTargetCheckedState();
            } else if (!a1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(iArrOnCreateDrawableState, f4220c);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.P;
        Drawable drawable = this.f4226i;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.F;
        int i3 = this.H;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f4221d;
        if (drawable != null) {
            if (!this.q || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = b0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.K : this.L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i4 + i5) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.r : this.s;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int iMax;
        int width;
        int paddingLeft;
        int i6;
        int paddingTop;
        int height;
        super.onLayout(z, i2, i3, i4, i5);
        int iMax2 = 0;
        if (this.f4221d != null) {
            Rect rect = this.P;
            Drawable drawable = this.f4226i;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = b0.d(this.f4221d);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (a1.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.B + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.B) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i6 = this.C;
            paddingTop = paddingTop2 - (i6 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.C;
                this.E = paddingLeft;
                this.F = paddingTop;
                this.H = height;
                this.G = width;
            }
            paddingTop = getPaddingTop();
            i6 = this.C;
        }
        height = i6 + paddingTop;
        this.E = paddingLeft;
        this.F = paddingTop;
        this.H = height;
        this.G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.t) {
            if (this.K == null) {
                this.K = h(this.r);
            }
            if (this.L == null) {
                this.L = h(this.s);
            }
        }
        Rect rect = this.P;
        Drawable drawable = this.f4221d;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f4221d.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f4221d.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.D = Math.max(this.t ? Math.max(this.K.getWidth(), this.L.getWidth()) + (this.f4231n * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f4226i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f4226i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f4221d;
        if (drawable3 != null) {
            Rect rectD = b0.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = Math.max(this.f4232o, (this.D * 2) + iMax + iMax2);
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.B = iMax3;
        this.C = iMax4;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.r : this.s;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.y
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.u
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.w
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = a.b.q.a1.b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.A
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.A
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.w = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.w
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.v
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.x
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.v
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.u = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.w = r0
            r6.x = r3
            return r1
        L8b:
            int r0 = r6.u
            if (r0 != r2) goto L96
            r6.n(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.u = r0
            android.view.VelocityTracker r0 = r6.y
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto Lb9
            r6.u = r1
            r6.w = r0
            r6.x = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            j();
        } else {
            i();
        }
        if (getWindowToken() != null && x.U(this)) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.s(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.t != z) {
            this.t = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.q = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f4232o = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.p = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.I.getTypeface() == null || this.I.getTypeface().equals(typeface)) && (this.I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.s = charSequence;
        requestLayout();
        if (isChecked()) {
            return;
        }
        i();
    }

    public void setTextOn(CharSequence charSequence) {
        this.r = charSequence;
        requestLayout();
        if (isChecked()) {
            j();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4221d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4221d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.A = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(a.b.l.a.a.d(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f4231n = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f4222e = colorStateList;
        this.f4224g = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f4223f = mode;
        this.f4225h = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4226i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4226i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(a.b.l.a.a.d(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f4227j = colorStateList;
        this.f4229l = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f4228k = mode;
        this.f4230m = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4221d || drawable == this.f4226i;
    }
}
