package androidx.appcompat.widget;

import a.b.f;
import a.b.g;
import a.b.j;
import a.b.p.b;
import a.b.q.a1;
import a.b.q.c;
import a.b.q.u0;
import a.i.r.b0;
import a.i.r.x;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends a.b.q.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f4135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f4136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f4137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f4138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f4139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f4140o;
    public TextView p;
    public TextView q;
    public int r;
    public int s;
    public boolean t;
    public int u;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f4141b;

        public a(b bVar) {
            this.f4141b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f4141b.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.f26j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        u0 u0VarV = u0.v(context, attributeSet, j.y, i2, 0);
        x.s0(this, u0VarV.g(j.z));
        this.r = u0VarV.n(j.D, 0);
        this.s = u0VarV.n(j.C, 0);
        this.f544f = u0VarV.m(j.B, 0);
        this.u = u0VarV.n(j.A, g.f89d);
        u0VarV.w();
    }

    @Override // a.b.q.a
    public /* bridge */ /* synthetic */ b0 f(int i2, long j2) {
        return super.f(i2, j2);
    }

    public void g() {
        if (this.f4137l == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // a.b.q.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // a.b.q.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f4136k;
    }

    public CharSequence getTitle() {
        return this.f4135j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(a.b.p.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f4137l
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.u
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f4137l = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f4137l
            goto L15
        L22:
            android.view.View r0 = r3.f4137l
            int r1 = a.b.f.f79i
            android.view.View r0 = r0.findViewById(r1)
            r3.f4138m = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            a.b.p.j.g r4 = (a.b.p.j.g) r4
            a.b.q.c r0 = r3.f543e
            if (r0 == 0) goto L41
            r0.y()
        L41:
            a.b.q.c r0 = new a.b.q.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f543e = r0
            r1 = 1
            r0.J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            a.b.q.c r1 = r3.f543e
            android.content.Context r2 = r3.f541c
            r4.c(r1, r2)
            a.b.q.c r4 = r3.f543e
            a.b.p.j.n r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f542d = r4
            r1 = 0
            a.i.r.x.s0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f542d
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(a.b.p.b):void");
    }

    public final void i() {
        if (this.f4140o == null) {
            LayoutInflater.from(getContext()).inflate(g.f86a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4140o = linearLayout;
            this.p = (TextView) linearLayout.findViewById(f.f75e);
            this.q = (TextView) this.f4140o.findViewById(f.f74d);
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
            if (this.s != 0) {
                this.q.setTextAppearance(getContext(), this.s);
            }
        }
        this.p.setText(this.f4135j);
        this.q.setText(this.f4136k);
        boolean z = !TextUtils.isEmpty(this.f4135j);
        boolean z2 = !TextUtils.isEmpty(this.f4136k);
        int i2 = 0;
        this.q.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f4140o;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f4140o.getParent() == null) {
            addView(this.f4140o);
        }
    }

    public boolean j() {
        return this.t;
    }

    public void k() {
        removeAllViews();
        this.f4139n = null;
        this.f542d = null;
        this.f543e = null;
        View view = this.f4138m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f543e;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f543e;
        if (cVar != null) {
            cVar.B();
            this.f543e.C();
        }
    }

    @Override // a.b.q.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f4135j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean zB = a1.b(this);
        int paddingRight = zB ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4137l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4137l.getLayoutParams();
            int i6 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = a.b.q.a.d(paddingRight, i6, zB);
            paddingRight = a.b.q.a.d(iD + e(this.f4137l, iD, paddingTop, paddingTop2, zB), i7, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f4140o;
        if (linearLayout != null && this.f4139n == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f4140o, iE, paddingTop, paddingTop2, zB);
        }
        int i8 = iE;
        View view2 = this.f4139n;
        if (view2 != null) {
            e(view2, i8, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f542d;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f544f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f4137l;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4137l.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f542d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f542d, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f4140o;
        if (linearLayout != null && this.f4139n == null) {
            if (this.t) {
                this.f4140o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f4140o.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f4140o.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f4139n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f4139n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f544f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // a.b.q.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // a.b.q.a
    public void setContentHeight(int i2) {
        this.f544f = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4139n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4139n = view;
        if (view != null && (linearLayout = this.f4140o) != null) {
            removeView(linearLayout);
            this.f4140o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4136k = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4135j = charSequence;
        i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.t) {
            requestLayout();
        }
        this.t = z;
    }

    @Override // a.b.q.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
