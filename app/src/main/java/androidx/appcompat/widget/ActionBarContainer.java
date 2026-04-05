package androidx.appcompat.widget;

import a.b.f;
import a.b.j;
import a.b.q.b;
import a.b.q.n0;
import a.i.r.x;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f4126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f4127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f4128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f4129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f4130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f4131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4134k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x.s0(this, new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f120a);
        this.f4129f = typedArrayObtainStyledAttributes.getDrawable(j.f121b);
        this.f4130g = typedArrayObtainStyledAttributes.getDrawable(j.f123d);
        this.f4134k = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f129j, -1);
        boolean z = true;
        if (getId() == f.H) {
            this.f4132i = true;
            this.f4131h = typedArrayObtainStyledAttributes.getDrawable(j.f122c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f4132i ? this.f4129f != null || this.f4130g != null : this.f4131h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4129f;
        if (drawable != null && drawable.isStateful()) {
            this.f4129f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4130g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4130g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4131h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4131h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f4126c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4129f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4130g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4131h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4127d = findViewById(f.f71a);
        this.f4128e = findViewById(f.f76f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4125b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        View view2 = this.f4126c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i6 = layoutParams.bottomMargin;
            view2.layout(i2, measuredHeight2 - i6, i4, measuredHeight - i6);
        }
        if (this.f4132i) {
            Drawable drawable3 = this.f4131h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f4129f != null) {
                if (this.f4127d.getVisibility() == 0) {
                    drawable2 = this.f4129f;
                    left = this.f4127d.getLeft();
                    top = this.f4127d.getTop();
                    right = this.f4127d.getRight();
                    view = this.f4127d;
                } else {
                    View view3 = this.f4128e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f4129f.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f4129f;
                        left = this.f4128e.getLeft();
                        top = this.f4128e.getTop();
                        right = this.f4128e.getRight();
                        view = this.f4128e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f4133j = z4;
            if (!z4 || (drawable = this.f4130g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f4127d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f4134k
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f4127d
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f4126c
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f4127d
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f4127d
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f4128e
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f4128e
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f4126c
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4129f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4129f);
        }
        this.f4129f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4127d;
            if (view != null) {
                this.f4129f.setBounds(view.getLeft(), this.f4127d.getTop(), this.f4127d.getRight(), this.f4127d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f4132i ? this.f4129f != null || this.f4130g != null : this.f4131h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4131h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4131h);
        }
        this.f4131h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4132i && (drawable2 = this.f4131h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f4132i ? !(this.f4129f != null || this.f4130g != null) : this.f4131h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4130g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4130g);
        }
        this.f4130g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4133j && (drawable2 = this.f4130g) != null) {
                drawable2.setBounds(this.f4126c.getLeft(), this.f4126c.getTop(), this.f4126c.getRight(), this.f4126c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f4132i ? this.f4129f != null || this.f4130g != null : this.f4131h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(n0 n0Var) {
        View view = this.f4126c;
        if (view != null) {
            removeView(view);
        }
        this.f4126c = n0Var;
        if (n0Var != null) {
            addView(n0Var);
            ViewGroup.LayoutParams layoutParams = n0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            n0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f4125b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f4129f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f4130g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f4131h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f4129f && !this.f4132i) || (drawable == this.f4130g && this.f4133j) || ((drawable == this.f4131h && this.f4132i) || super.verifyDrawable(drawable));
    }
}
