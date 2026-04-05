package androidx.leanback.widget;

import a.n.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class ThumbsBar extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray<Bitmap> f4602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4603i;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThumbsBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4596b = -1;
        this.f4602h = new SparseArray<>();
        this.f4603i = false;
        this.f4597c = context.getResources().getDimensionPixelSize(c.s);
        this.f4598d = context.getResources().getDimensionPixelSize(c.q);
        this.f4600f = context.getResources().getDimensionPixelSize(c.f2592m);
        this.f4599e = context.getResources().getDimensionPixelSize(c.f2591l);
        this.f4601g = context.getResources().getDimensionPixelSize(c.r);
    }

    public static int c(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public final int a(int i2) {
        int iC = c(i2 - this.f4599e, this.f4597c + this.f4601g);
        if (iC < 2) {
            iC = 2;
        } else if ((iC & 1) != 0) {
            iC++;
        }
        return iC + 1;
    }

    public View b(ViewGroup viewGroup) {
        return new ImageView(viewGroup.getContext());
    }

    public final void d() {
        int i2;
        while (getChildCount() > this.f4596b) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (getChildCount() < this.f4596b) {
            addView(b(this), new LinearLayout.LayoutParams(this.f4597c, this.f4598d));
        }
        int heroIndex = getHeroIndex();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i3) {
                layoutParams.width = this.f4599e;
                i2 = this.f4600f;
            } else {
                layoutParams.width = this.f4597c;
                i2 = this.f4598d;
            }
            layoutParams.height = i2;
            childAt.setLayoutParams(layoutParams);
        }
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int width2 = (getWidth() / 2) + (childAt.getMeasuredWidth() / 2);
        childAt.layout(width, getPaddingTop(), width2, getPaddingTop() + childAt.getMeasuredHeight());
        int paddingTop = getPaddingTop() + (childAt.getMeasuredHeight() / 2);
        for (int i6 = heroIndex - 1; i6 >= 0; i6--) {
            int i7 = width - this.f4601g;
            View childAt2 = getChildAt(i6);
            childAt2.layout(i7 - childAt2.getMeasuredWidth(), paddingTop - (childAt2.getMeasuredHeight() / 2), i7, (childAt2.getMeasuredHeight() / 2) + paddingTop);
            width = i7 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex >= this.f4596b) {
                return;
            }
            int i8 = width2 + this.f4601g;
            View childAt3 = getChildAt(heroIndex);
            childAt3.layout(i8, paddingTop - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i8, (childAt3.getMeasuredHeight() / 2) + paddingTop);
            width2 = i8 + childAt3.getMeasuredWidth();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int iA;
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        if (this.f4603i || this.f4596b == (iA = a(measuredWidth))) {
            return;
        }
        this.f4596b = iA;
        d();
    }

    public void setNumberOfThumbs(int i2) {
        this.f4603i = true;
        this.f4596b = i2;
        d();
    }

    public void setThumbSpace(int i2) {
        this.f4601g = i2;
        requestLayout();
    }
}
