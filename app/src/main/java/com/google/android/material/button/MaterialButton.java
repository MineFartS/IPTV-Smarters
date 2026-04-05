package com.google.android.material.button;

import a.b.q.f;
import a.i.r.x;
import a.i.s.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import c.f.a.d.d0.j;
import c.f.a.d.j0.h;
import c.f.a.d.j0.n;
import c.f.a.d.k;
import c.f.a.d.l;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends f implements Checkable, n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f24398d = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f24399e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24400f = k.f15005m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.d.q.a f24401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet<a> f24402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f24403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f24404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f24405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f24406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24409o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public static class c extends a.k.a.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24410d;

        public static class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            c(parcel);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void c(Parcel parcel) {
            this.f24410d = parcel.readInt() == 1;
        }

        @Override // a.k.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f24410d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f.a.d.b.s);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f24400f;
        super(c.f.a.d.o0.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24402h = new LinkedHashSet<>();
        this.q = false;
        this.r = false;
        Context context2 = getContext();
        TypedArray typedArrayH = j.h(context2, attributeSet, l.r2, i2, i3, new int[0]);
        this.p = typedArrayH.getDimensionPixelSize(l.E2, 0);
        this.f24404j = c.f.a.d.d0.k.e(typedArrayH.getInt(l.H2, -1), PorterDuff.Mode.SRC_IN);
        this.f24405k = c.f.a.d.g0.c.a(getContext(), typedArrayH, l.G2);
        this.f24406l = c.f.a.d.g0.c.d(getContext(), typedArrayH, l.C2);
        this.s = typedArrayH.getInteger(l.D2, 1);
        this.f24407m = typedArrayH.getDimensionPixelSize(l.F2, 0);
        c.f.a.d.q.a aVar = new c.f.a.d.q.a(this, c.f.a.d.j0.k.e(context2, attributeSet, i2, i3).m());
        this.f24401g = aVar;
        aVar.q(typedArrayH);
        typedArrayH.recycle();
        setCompoundDrawablePadding(this.p);
        j(this.f24406l != null);
    }

    private String getA11yClassName() {
        return (b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    public void a(a aVar) {
        this.f24402h.add(aVar);
    }

    public boolean b() {
        c.f.a.d.q.a aVar = this.f24401g;
        return aVar != null && aVar.p();
    }

    public final boolean c() {
        int i2 = this.s;
        return i2 == 3 || i2 == 4;
    }

    public final boolean d() {
        int i2 = this.s;
        return i2 == 1 || i2 == 2;
    }

    public final boolean e() {
        int i2 = this.s;
        return i2 == 16 || i2 == 32;
    }

    public final boolean f() {
        return x.C(this) == 1;
    }

    public final boolean g() {
        c.f.a.d.q.a aVar = this.f24401g;
        return (aVar == null || aVar.o()) ? false : true;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (g()) {
            return this.f24401g.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f24406l;
    }

    public int getIconGravity() {
        return this.s;
    }

    public int getIconPadding() {
        return this.p;
    }

    public int getIconSize() {
        return this.f24407m;
    }

    public ColorStateList getIconTint() {
        return this.f24405k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f24404j;
    }

    public int getInsetBottom() {
        return this.f24401g.c();
    }

    public int getInsetTop() {
        return this.f24401g.d();
    }

    public ColorStateList getRippleColor() {
        if (g()) {
            return this.f24401g.h();
        }
        return null;
    }

    public c.f.a.d.j0.k getShapeAppearanceModel() {
        if (g()) {
            return this.f24401g.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (g()) {
            return this.f24401g.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (g()) {
            return this.f24401g.k();
        }
        return 0;
    }

    @Override // a.b.q.f, a.i.r.w
    public ColorStateList getSupportBackgroundTintList() {
        return g() ? this.f24401g.l() : super.getSupportBackgroundTintList();
    }

    @Override // a.b.q.f, a.i.r.w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return g() ? this.f24401g.m() : super.getSupportBackgroundTintMode();
    }

    public void h(a aVar) {
        this.f24402h.remove(aVar);
    }

    public final void i() {
        if (d()) {
            i.l(this, this.f24406l, null, null, null);
        } else if (c()) {
            i.l(this, null, null, this.f24406l, null);
        } else if (e()) {
            i.l(this, null, this.f24406l, null, null);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.q;
    }

    public final void j(boolean z) {
        Drawable drawable = this.f24406l;
        if (drawable != null) {
            Drawable drawableMutate = a.i.j.l.a.r(drawable).mutate();
            this.f24406l = drawableMutate;
            a.i.j.l.a.o(drawableMutate, this.f24405k);
            PorterDuff.Mode mode = this.f24404j;
            if (mode != null) {
                a.i.j.l.a.p(this.f24406l, mode);
            }
            int intrinsicWidth = this.f24407m;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f24406l.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f24407m;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f24406l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f24406l;
            int i2 = this.f24408n;
            int i3 = this.f24409o;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
        }
        if (z) {
            i();
            return;
        }
        Drawable[] drawableArrA = i.a(this);
        boolean z2 = false;
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((d() && drawable3 != this.f24406l) || ((c() && drawable5 != this.f24406l) || (e() && drawable4 != this.f24406l))) {
            z2 = true;
        }
        if (z2) {
            i();
        }
    }

    public final void k(int i2, int i3) {
        if (this.f24406l == null || getLayout() == null) {
            return;
        }
        if (!d() && !c()) {
            if (e()) {
                this.f24408n = 0;
                if (this.s == 16) {
                    this.f24409o = 0;
                    j(false);
                    return;
                }
                int intrinsicHeight = this.f24407m;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f24406l.getIntrinsicHeight();
                }
                int textHeight = (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.p) - getPaddingBottom()) / 2;
                if (this.f24409o != textHeight) {
                    this.f24409o = textHeight;
                    j(false);
                }
                return;
            }
            return;
        }
        this.f24409o = 0;
        int i4 = this.s;
        if (i4 == 1 || i4 == 3) {
            this.f24408n = 0;
            j(false);
            return;
        }
        int intrinsicWidth = this.f24407m;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f24406l.getIntrinsicWidth();
        }
        int textWidth = (((((i2 - getTextWidth()) - x.H(this)) - intrinsicWidth) - this.p) - x.I(this)) / 2;
        if (f() != (this.s == 4)) {
            textWidth = -textWidth;
        }
        if (this.f24408n != textWidth) {
            this.f24408n = textWidth;
            j(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            h.f(this, this.f24401g.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (b()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f24398d);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f24399e);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // a.b.q.f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // a.b.q.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // a.b.q.f, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c.f.a.d.q.a aVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT != 21 || (aVar = this.f24401g) == null) {
            return;
        }
        aVar.H(i5 - i3, i4 - i2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.b());
        setChecked(cVar.f24410d);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f24410d = this.q;
        return cVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        k(i2, i3);
    }

    @Override // a.b.q.f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (g()) {
            this.f24401g.r(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    @Override // a.b.q.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (g()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            } else {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f24401g.s();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // a.b.q.f, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? a.b.l.a.a.d(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (g()) {
            this.f24401g.t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (b() && isEnabled() && this.q != z) {
            this.q = z;
            refreshDrawableState();
            if (this.r) {
                return;
            }
            this.r = true;
            Iterator<a> it = this.f24402h.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.q);
            }
            this.r = false;
        }
    }

    public void setCornerRadius(int i2) {
        if (g()) {
            this.f24401g.u(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (g()) {
            this.f24401g.f().W(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f24406l != drawable) {
            this.f24406l = drawable;
            j(true);
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.s != i2) {
            this.s = i2;
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.p != i2) {
            this.p = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? a.b.l.a.a.d(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f24407m != i2) {
            this.f24407m = i2;
            j(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f24405k != colorStateList) {
            this.f24405k = colorStateList;
            j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f24404j != mode) {
            this.f24404j = mode;
            j(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(a.b.l.a.a.c(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        this.f24401g.v(i2);
    }

    public void setInsetTop(int i2) {
        this.f24401g.w(i2);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f24403i = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.f24403i;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (g()) {
            this.f24401g.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (g()) {
            setRippleColor(a.b.l.a.a.c(getContext(), i2));
        }
    }

    @Override // c.f.a.d.j0.n
    public void setShapeAppearanceModel(c.f.a.d.j0.k kVar) {
        if (!g()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f24401g.y(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (g()) {
            this.f24401g.z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (g()) {
            this.f24401g.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (g()) {
            setStrokeColor(a.b.l.a.a.c(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (g()) {
            this.f24401g.B(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // a.b.q.f, a.i.r.w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (g()) {
            this.f24401g.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // a.b.q.f, a.i.r.w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (g()) {
            this.f24401g.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.q);
    }
}
