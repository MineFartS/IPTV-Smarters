package a.l.d;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class h extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<View> f2384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<View> f2385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f2386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2387e;

    public h(Context context) {
        super(context);
        this.f2387e = true;
    }

    public h(Context context, AttributeSet attributeSet, n nVar) {
        String str;
        super(context, attributeSet);
        this.f2387e = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.l.c.f2228h);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(a.l.c.f2229i) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(a.l.c.f2230j);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentH0 = nVar.h0(id);
        if (classAttribute != null && fragmentH0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = BuildConfig.FLAVOR;
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentA = nVar.r0().a(context.getClassLoader(), classAttribute);
            fragmentA.onInflate(context, attributeSet, (Bundle) null);
            nVar.m().x(true).d(this, fragmentA, string).m();
        }
        nVar.V0(this);
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.f2385c;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f2384b == null) {
            this.f2384b = new ArrayList<>();
        }
        this.f2384b.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (n.A0(view) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (n.A0(view) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        a.i.r.f0 f0VarS = a.i.r.f0.s(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2386d;
        a.i.r.f0 f0VarS2 = onApplyWindowInsetsListener != null ? a.i.r.f0.s(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : a.i.r.x.b0(this, f0VarS);
        if (!f0VarS2.l()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                a.i.r.x.h(getChildAt(i2), f0VarS2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f2387e && this.f2384b != null) {
            for (int i2 = 0; i2 < this.f2384b.size(); i2++) {
                super.drawChild(canvas, this.f2384b.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f2387e || (arrayList = this.f2384b) == null || arrayList.size() <= 0 || !this.f2384b.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2385c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2384b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2387e = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f2387e = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT >= 18) {
            throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
        }
        super.setLayoutTransition(layoutTransition);
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2386d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2385c == null) {
                this.f2385c = new ArrayList<>();
            }
            this.f2385c.add(view);
        }
        super.startViewTransition(view);
    }
}
