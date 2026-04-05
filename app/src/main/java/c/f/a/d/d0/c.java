package c.f.a.d.d0;

import a.i.r.x;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class c extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14738e;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f14737d = false;
        d(context, attributeSet);
    }

    public static int a(int i2, int i3, int i4) {
        return i3 != Integer.MIN_VALUE ? i3 != 1073741824 ? i4 : i2 : Math.min(i4, i2);
    }

    public int b(View view) {
        Object tag = view.getTag(c.f.a.d.f.F);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f14737d;
    }

    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c.f.a.d.l.Q1, 0, 0);
        this.f14735b = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.f.a.d.l.S1, 0);
        this.f14736c = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.f.a.d.l.R1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f14736c;
    }

    public int getLineSpacing() {
        return this.f14735b;
    }

    public int getRowCount() {
        return this.f14738e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int iA;
        int iB;
        if (getChildCount() == 0) {
            this.f14738e = 0;
            return;
        }
        this.f14738e = 1;
        boolean z2 = x.C(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i6 = (i4 - i2) - paddingLeft;
        int measuredWidth = paddingRight;
        int i7 = paddingTop;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(c.f.a.d.f.F, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iB = a.i.r.i.b(marginLayoutParams);
                    iA = a.i.r.i.a(marginLayoutParams);
                } else {
                    iA = 0;
                    iB = 0;
                }
                int measuredWidth2 = measuredWidth + iB + childAt.getMeasuredWidth();
                if (!this.f14737d && measuredWidth2 > i6) {
                    i7 = this.f14735b + paddingTop;
                    this.f14738e++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(c.f.a.d.f.F, Integer.valueOf(this.f14738e - 1));
                int i9 = measuredWidth + iB;
                int measuredWidth3 = childAt.getMeasuredWidth() + i9;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (z2) {
                    i9 = i6 - measuredWidth3;
                    measuredWidth3 = (i6 - measuredWidth) - iB;
                }
                childAt.layout(i9, i7, measuredWidth3, measuredHeight);
                measuredWidth += iB + iA + childAt.getMeasuredWidth() + this.f14736c;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i5 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i10 = paddingLeft2;
                if (paddingLeft2 + i4 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i10;
                } else {
                    paddingLeft = getPaddingLeft();
                    i7 = this.f14735b + paddingTop;
                }
                int measuredWidth = paddingLeft + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i4 + i5 + childAt.getMeasuredWidth() + this.f14736c;
                if (i9 == getChildCount() - 1) {
                    i8 += i5;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i8 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i2) {
        this.f14736c = i2;
    }

    public void setLineSpacing(int i2) {
        this.f14735b = i2;
    }

    public void setSingleLine(boolean z) {
        this.f14737d = z;
    }
}
