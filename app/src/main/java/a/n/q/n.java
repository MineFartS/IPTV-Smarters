package a.n.q;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.HorizontalGridView;

/* JADX INFO: loaded from: classes.dex */
public final class n extends j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f2858g = new int[2];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f2859h = new Rect();

    @Override // a.n.q.j0
    public void d(View view) {
        b().addView(view);
    }

    @Override // a.n.q.j0
    public void e(View view) {
        int measuredWidth;
        int width = b().getWidth() - b().getPaddingRight();
        int paddingLeft = b().getPaddingLeft();
        view.measure(0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z = a.i.r.x.C(view) == 1;
        if (!z && this.f2856e + view.getMeasuredWidth() > width) {
            measuredWidth = width - view.getMeasuredWidth();
            marginLayoutParams.leftMargin = measuredWidth;
        } else if (z && this.f2856e < paddingLeft) {
            marginLayoutParams.leftMargin = paddingLeft;
        } else if (z) {
            width = this.f2857f;
            measuredWidth = width - view.getMeasuredWidth();
            marginLayoutParams.leftMargin = measuredWidth;
        } else {
            measuredWidth = this.f2856e;
            marginLayoutParams.leftMargin = measuredWidth;
        }
        view.requestLayout();
    }

    public void k(HorizontalGridView horizontalGridView, View view, Object obj) {
        ViewGroup viewGroupB = b();
        horizontalGridView.D1(view, this.f2858g);
        this.f2859h.set(0, 0, view.getWidth(), view.getHeight());
        viewGroupB.offsetDescendantRectToMyCoords(view, this.f2859h);
        Rect rect = this.f2859h;
        int i2 = rect.left;
        int[] iArr = this.f2858g;
        this.f2856e = i2 - iArr[0];
        this.f2857f = rect.right - iArr[0];
        f(obj);
    }
}
