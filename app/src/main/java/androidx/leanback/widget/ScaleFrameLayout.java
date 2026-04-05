package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ScaleFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4531d;

    public ScaleFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4529b = 1.0f;
        this.f4530c = 1.0f;
        this.f4531d = 1.0f;
    }

    public static int a(int i2, float f2) {
        return f2 == 1.0f ? i2 : View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i2) / f2) + 0.5f), View.MeasureSpec.getMode(i2));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        view.setScaleX(this.f4531d);
        view.setScaleY(this.f4531d);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        boolean zAddViewInLayout = super.addViewInLayout(view, i2, layoutParams, z);
        if (zAddViewInLayout) {
            view.setScaleX(this.f4531d);
            view.setScaleY(this.f4531d);
        }
        return zAddViewInLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ScaleFrameLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        float f2 = this.f4529b;
        if (f2 == 1.0f && this.f4530c == 1.0f) {
            super.onMeasure(i2, i3);
        } else {
            super.onMeasure(a(i2, f2), a(i3, this.f4530c));
            setMeasuredDimension((int) ((getMeasuredWidth() * this.f4529b) + 0.5f), (int) ((getMeasuredHeight() * this.f4530c) + 0.5f));
        }
    }

    public void setChildScale(float f2) {
        if (this.f4531d != f2) {
            this.f4531d = f2;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                getChildAt(i2).setScaleX(f2);
                getChildAt(i2).setScaleY(f2);
            }
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }

    public void setLayoutScaleX(float f2) {
        if (f2 != this.f4529b) {
            this.f4529b = f2;
            requestLayout();
        }
    }

    public void setLayoutScaleY(float f2) {
        if (f2 != this.f4530c) {
            this.f4530c = f2;
            requestLayout();
        }
    }
}
