package c.f.a.d.s;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import c.f.a.d.j0.n;
import c.f.a.d.k;

/* JADX INFO: loaded from: classes2.dex */
public class a extends CardView implements Checkable, n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f15234k = {R.attr.state_checkable};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f15235l = {R.attr.state_checked};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f15236m = {c.f.a.d.b.B};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f15237n = k.f15006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f15238o;
    public boolean p;
    public boolean q;
    public boolean r;
    public InterfaceC0176a s;

    /* JADX INFO: renamed from: c.f.a.d.s.a$a, reason: collision with other inner class name */
    public interface InterfaceC0176a {
        void a(a aVar, boolean z);
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    public final void g() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public c.f.a.d.j0.k getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public boolean h() {
        if (this.f15238o == null) {
            return false;
        }
        throw null;
    }

    public boolean i() {
        return this.r;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (h()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f15234k);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f15235l);
        }
        if (i()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f15236m);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.p) {
            throw null;
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i2) {
        ColorStateList.valueOf(i2);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.q != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconMargin(int i2) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i2) {
        if (i2 == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setCheckedIconResource(int i2) {
        a.b.l.a.a.d(getContext(), i2);
        throw null;
    }

    public void setCheckedIconSize(int i2) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i2) {
        if (i2 == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        if (this.f15238o != null) {
            throw null;
        }
    }

    public void setDragged(boolean z) {
        if (this.r != z) {
            this.r = z;
            refreshDrawableState();
            g();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        throw null;
    }

    public void setOnCheckedChangeListener(InterfaceC0176a interfaceC0176a) {
        this.s = interfaceC0176a;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(float f2) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f2) {
        super.setRadius(f2);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i2) {
        a.b.l.a.a.c(getContext(), i2);
        throw null;
    }

    @Override // c.f.a.d.j0.n
    public void setShapeAppearanceModel(c.f.a.d.j0.k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(kVar.u(getBoundsAsRectF()));
        }
        throw null;
    }

    public void setStrokeColor(int i2) {
        ColorStateList.valueOf(i2);
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i2) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (h() && isEnabled()) {
            this.q = !this.q;
            refreshDrawableState();
            g();
            InterfaceC0176a interfaceC0176a = this.s;
            if (interfaceC0176a != null) {
                interfaceC0176a.a(this, this.q);
            }
        }
    }
}
