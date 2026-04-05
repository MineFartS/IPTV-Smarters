package c.f.a.d.n;

import a.i.r.f;
import a.i.r.f0;
import a.i.r.x;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends c<View> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f15078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f15079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15081g;

    public b() {
        this.f15078d = new Rect();
        this.f15079e = new Rect();
        this.f15080f = 0;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15078d = new Rect();
        this.f15079e = new Rect();
        this.f15080f = 0;
    }

    public static int N(int i2) {
        if (i2 == 0) {
            return 8388659;
        }
        return i2;
    }

    @Override // c.f.a.d.n.c
    public void F(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int bottom;
        View viewH = H(coordinatorLayout.s(view));
        if (viewH != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f15078d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewH.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewH.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            f0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && x.z(coordinatorLayout) && !x.z(view)) {
                rect.left += lastWindowInsets.g();
                rect.right -= lastWindowInsets.h();
            }
            Rect rect2 = this.f15079e;
            f.a(N(fVar.f4334c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
            int I = I(viewH);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            bottom = rect2.top - viewH.getBottom();
        } else {
            super.F(coordinatorLayout, view, i2);
            bottom = 0;
        }
        this.f15080f = bottom;
    }

    public abstract View H(List<View> list);

    public final int I(View view) {
        if (this.f15081g == 0) {
            return 0;
        }
        float fJ = J(view);
        int i2 = this.f15081g;
        return a.i.m.a.b((int) (fJ * i2), 0, i2);
    }

    public abstract float J(View view);

    public final int K() {
        return this.f15081g;
    }

    public int L(View view) {
        return view.getMeasuredHeight();
    }

    public final int M() {
        return this.f15080f;
    }

    public final void O(int i2) {
        this.f15081g = i2;
    }

    public boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        View viewH;
        f0 lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (viewH = H(coordinatorLayout.s(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (x.z(viewH) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.i() + lastWindowInsets.f();
        }
        int iL = size + L(viewH);
        int measuredHeight = viewH.getMeasuredHeight();
        if (P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            iL -= measuredHeight;
        }
        coordinatorLayout.K(view, i2, i3, View.MeasureSpec.makeMeasureSpec(iL, i6 == -1 ? 1073741824 : Integer.MIN_VALUE), i5);
        return true;
    }
}
