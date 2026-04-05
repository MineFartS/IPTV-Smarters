package com.google.android.material.chip;

import a.i.r.g0.c;
import a.i.r.x;
import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import c.f.a.d.g0.d;
import c.f.a.d.g0.f;
import c.f.a.d.j;
import c.f.a.d.j0.n;
import c.f.a.d.k;
import c.f.a.d.l;
import c.f.a.d.m.h;
import c.f.a.d.u.a;
import com.facebook.ads.AdError;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0177a, n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24432e = k.p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Rect f24433f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f24434g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f24435h = {R.attr.state_checkable};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.f.a.d.u.a f24436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InsetDrawable f24437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RippleDrawable f24438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View.OnClickListener f24439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f24440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24441n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24442o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public final c u;
    public final Rect v;
    public final RectF w;
    public final f x;

    public class a extends f {
        public a() {
        }

        @Override // c.f.a.d.g0.f
        public void a(int i2) {
        }

        @Override // c.f.a.d.g0.f
        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f24436i.L2() ? Chip.this.f24436i.h1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f24436i != null) {
                Chip.this.f24436i.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class c extends a.k.b.a {
        public c(Chip chip) {
            super(chip);
        }

        @Override // a.k.b.a
        public int B(float f2, float f3) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f2, f3)) ? 1 : 0;
        }

        @Override // a.k.b.a
        public void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f24439l != null) {
                list.add(1);
            }
        }

        @Override // a.k.b.a
        public boolean J(int i2, int i3, Bundle bundle) {
            if (i3 != 16) {
                return false;
            }
            if (i2 == 0) {
                return Chip.this.performClick();
            }
            if (i2 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // a.k.b.a
        public void M(a.i.r.g0.c cVar) {
            cVar.V(Chip.this.r());
            cVar.Y(Chip.this.isClickable());
            cVar.X((Chip.this.r() || Chip.this.isClickable()) ? Chip.this.r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.t0(text);
            } else {
                cVar.b0(text);
            }
        }

        @Override // a.k.b.a
        public void N(int i2, a.i.r.g0.c cVar) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i2 != 1) {
                cVar.b0(BuildConfig.FLAVOR);
                cVar.T(Chip.f24433f);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i3 = j.f14879j;
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                closeIconContentDescription = context.getString(i3, objArr).trim();
            }
            cVar.b0(closeIconContentDescription);
            cVar.T(Chip.this.getCloseIconTouchBoundsInt());
            cVar.b(c.a.f2056e);
            cVar.c0(Chip.this.isEnabled());
        }

        @Override // a.k.b.a
        public void O(int i2, boolean z) {
            if (i2 == 1) {
                Chip.this.q = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f.a.d.b.f14630g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f24432e;
        super(c.f.a.d.o0.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.v = new Rect();
        this.w = new RectF();
        this.x = new a();
        Context context2 = getContext();
        C(attributeSet);
        c.f.a.d.u.a aVarV0 = c.f.a.d.u.a.v0(context2, attributeSet, i2, i3);
        o(context2, attributeSet, i2);
        setChipDrawable(aVarV0);
        aVarV0.W(x.w(this));
        TypedArray typedArrayH = c.f.a.d.d0.j.h(context2, attributeSet, l.c0, i2, i3, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(c.f.a.d.g0.c.a(context2, typedArrayH, l.f0));
        }
        boolean zHasValue = typedArrayH.hasValue(l.O0);
        typedArrayH.recycle();
        this.u = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f24441n);
        setText(aVarV0.h1());
        setEllipsize(aVarV0.b1());
        B();
        if (!this.f24436i.L2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.t);
        }
        this.s = x.C(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.w.setEmpty();
        if (n() && this.f24439l != null) {
            this.f24436i.Y0(this.w);
        }
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.v;
    }

    private d getTextAppearance() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.i1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f24442o != z) {
            this.f24442o = z;
            refreshDrawableState();
        }
    }

    public final void A() {
        c.f.a.d.u.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f24436i) == null) {
            return;
        }
        int iJ0 = (int) (aVar.J0() + this.f24436i.j1() + this.f24436i.q0());
        int iO0 = (int) (this.f24436i.O0() + this.f24436i.k1() + this.f24436i.m0());
        if (this.f24437j != null) {
            Rect rect = new Rect();
            this.f24437j.getPadding(rect);
            iO0 += rect.left;
            iJ0 += rect.right;
        }
        x.B0(this, iO0, getPaddingTop(), iJ0, getPaddingBottom());
    }

    public final void B() {
        TextPaint paint = getPaint();
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.j(getContext(), paint, this.x);
        }
    }

    public final void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override // c.f.a.d.u.a.InterfaceC0177a
    public void a() {
        k(this.t);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m(motionEvent) || this.u.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.u.w(keyEvent) || this.u.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c.f.a.d.u.a aVar = this.f24436i;
        if ((aVar == null || !aVar.p1()) ? false : this.f24436i.l2(j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f24437j;
        return insetDrawable == null ? this.f24436i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.F0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return Math.max(0.0f, aVar.I0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f24436i;
    }

    public float getChipEndPadding() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public float getChipIconSize() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getChipMinHeight() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.T0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.U0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.V0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.u.A() == 1 || this.u.x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public h getHideMotionSpec() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    public float getIconEndPadding() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.e1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public c.f.a.d.j0.k getShapeAppearanceModel() {
        return this.f24436i.C();
    }

    public h getShowMotionSpec() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.g1();
        }
        return null;
    }

    public float getTextEndPadding() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.j1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            return aVar.k1();
        }
        return 0.0f;
    }

    public final void i(c.f.a.d.u.a aVar) {
        aVar.p2(this);
    }

    public final int[] j() {
        int i2 = 0;
        int i3 = isEnabled() ? 1 : 0;
        if (this.q) {
            i3++;
        }
        if (this.p) {
            i3++;
        }
        if (this.f24442o) {
            i3++;
        }
        if (isChecked()) {
            i3++;
        }
        int[] iArr = new int[i3];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.q) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.p) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.f24442o) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    public boolean k(int i2) {
        this.t = i2;
        if (!v()) {
            if (this.f24437j != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i2 - this.f24436i.getIntrinsicHeight());
        int iMax2 = Math.max(0, i2 - this.f24436i.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f24437j != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i3 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i4 = iMax > 0 ? iMax / 2 : 0;
        if (this.f24437j != null) {
            Rect rect = new Rect();
            this.f24437j.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                y();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != i2) {
                setMinHeight(i2);
            }
            if (getMinWidth() != i2) {
            }
            q(i3, i4, i3, i4);
            y();
            return true;
        }
        setMinHeight(i2);
        setMinWidth(i2);
        q(i3, i4, i3, i4);
        y();
        return true;
    }

    public final void l() {
        if (getBackgroundDrawable() == this.f24437j && this.f24436i.getCallback() == null) {
            this.f24436i.setCallback(this.f24437j);
        }
    }

    @SuppressLint({"PrivateApi"})
    public final boolean m(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = a.k.b.a.class.getDeclaredField("p");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.u)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = a.k.b.a.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.u, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            }
        }
        return false;
    }

    public final boolean n() {
        c.f.a.d.u.a aVar = this.f24436i;
        return (aVar == null || aVar.R0() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayH = c.f.a.d.d0.j.h(context, attributeSet, l.c0, i2, f24432e, new int[0]);
        this.r = typedArrayH.getBoolean(l.J0, false);
        this.t = (int) Math.ceil(typedArrayH.getDimension(l.x0, (float) Math.ceil(c.f.a.d.d0.k.b(getContext(), 48))));
        typedArrayH.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.f.a.d.j0.h.f(this, this.f24436i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f24434g);
        }
        if (r()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f24435h);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        this.u.I(z, i2, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((r() || isClickable()) ? r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            a.i.r.g0.c.x0(accessibilityNodeInfo).a0(c.C0042c.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.o(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.s != i2) {
            this.s = i2;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f24442o
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f24442o
            if (r0 == 0) goto L34
            r5.t()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    public final void q(int i2, int i3, int i4, int i5) {
        this.f24437j = new InsetDrawable((Drawable) this.f24436i, i2, i3, i4, i5);
    }

    public boolean r() {
        c.f.a.d.u.a aVar = this.f24436i;
        return aVar != null && aVar.o1();
    }

    public boolean s() {
        c.f.a.d.u.a aVar = this.f24436i;
        return aVar != null && aVar.q1();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f24438k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f24438k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.x1(z);
        }
    }

    public void setCheckableResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.y1(i2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar == null) {
            this.f24441n = z;
            return;
        }
        if (aVar.o1()) {
            boolean zIsChecked = isChecked();
            super.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.f24440m) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.z1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.A1(i2);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.B1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.C1(i2);
        }
    }

    public void setCheckedIconVisible(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.D1(i2);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.E1(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.F1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.G1(i2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.H1(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.I1(i2);
        }
    }

    public void setChipDrawable(c.f.a.d.u.a aVar) {
        c.f.a.d.u.a aVar2 = this.f24436i;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f24436i = aVar;
            aVar.A2(false);
            i(this.f24436i);
            k(this.t);
        }
    }

    public void setChipEndPadding(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.J1(f2);
        }
    }

    public void setChipEndPaddingResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.K1(i2);
        }
    }

    public void setChipIcon(Drawable drawable) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.L1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.M1(i2);
        }
    }

    public void setChipIconSize(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.N1(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.O1(i2);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.P1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.Q1(i2);
        }
    }

    public void setChipIconVisible(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.R1(i2);
        }
    }

    public void setChipIconVisible(boolean z) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.S1(z);
        }
    }

    public void setChipMinHeight(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.T1(f2);
        }
    }

    public void setChipMinHeightResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.U1(i2);
        }
    }

    public void setChipStartPadding(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.V1(f2);
        }
    }

    public void setChipStartPaddingResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.W1(i2);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.X1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.Y1(i2);
        }
    }

    public void setChipStrokeWidth(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.Z1(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.a2(i2);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.c2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.d2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.e2(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.f2(i2);
        }
    }

    public void setCloseIconResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.g2(i2);
        }
        x();
    }

    public void setCloseIconSize(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.h2(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.i2(i2);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.j2(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.k2(i2);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.m2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.n2(i2);
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public void setCloseIconVisible(boolean z) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.o2(z);
        }
        x();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.W(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f24436i == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.q2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.r = z;
        k(this.t);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(h hVar) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.r2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.s2(i2);
        }
    }

    public void setIconEndPadding(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.t2(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.u2(i2);
        }
    }

    public void setIconStartPadding(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.v2(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.w2(i2);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f24436i != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i2);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.x2(i2);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f24440m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f24439l = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.y2(colorStateList);
        }
        if (this.f24436i.m1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.z2(i2);
            if (this.f24436i.m1()) {
                return;
            }
            z();
        }
    }

    @Override // c.f.a.d.j0.n
    public void setShapeAppearanceModel(c.f.a.d.j0.k kVar) {
        this.f24436i.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.B2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.C2(i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        super.setText(aVar.L2() ? null : charSequence, bufferType);
        c.f.a.d.u.a aVar2 = this.f24436i;
        if (aVar2 != null) {
            aVar2.D2(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.F2(i2);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.F2(i2);
        }
        B();
    }

    public void setTextAppearance(d dVar) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.E2(dVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.G2(f2);
        }
    }

    public void setTextEndPaddingResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.H2(i2);
        }
    }

    public void setTextStartPadding(float f2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.I2(f2);
        }
    }

    public void setTextStartPaddingResource(int i2) {
        c.f.a.d.u.a aVar = this.f24436i;
        if (aVar != null) {
            aVar.J2(i2);
        }
    }

    public boolean t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f24439l;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.u.U(1, 1);
        return z;
    }

    public final void u() {
        if (this.f24437j != null) {
            this.f24437j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    public boolean v() {
        return this.r;
    }

    public final void w(c.f.a.d.u.a aVar) {
        if (aVar != null) {
            aVar.p2(null);
        }
    }

    public final void x() {
        x.p0(this, (n() && s() && this.f24439l != null) ? this.u : null);
    }

    public final void y() {
        if (c.f.a.d.h0.b.f14845a) {
            z();
            return;
        }
        this.f24436i.K2(true);
        x.s0(this, getBackgroundDrawable());
        A();
        l();
    }

    public final void z() {
        this.f24438k = new RippleDrawable(c.f.a.d.h0.b.d(this.f24436i.f1()), getBackgroundDrawable(), null);
        this.f24436i.K2(false);
        x.s0(this, this.f24438k);
        A();
    }
}
