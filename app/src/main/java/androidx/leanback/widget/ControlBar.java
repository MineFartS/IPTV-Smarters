package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ControlBar extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f4467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4469e;

    public interface a {
        void a(View view, View view2);
    }

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4468d = -1;
        this.f4469e = true;
    }

    public int a() {
        if (this.f4469e) {
            return getChildCount() / 2;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        int iA;
        if (i2 != 33 && i2 != 130) {
            super.addFocusables(arrayList, i2, i3);
            return;
        }
        int i4 = this.f4468d;
        if (i4 >= 0 && i4 < getChildCount()) {
            iA = this.f4468d;
        } else if (getChildCount() <= 0) {
            return;
        } else {
            iA = a();
        }
        arrayList.add(getChildAt(iA));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f4466b <= 0) {
            return;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < getChildCount() - 1) {
            View childAt = getChildAt(i4);
            i4++;
            View childAt2 = getChildAt(i4);
            int measuredWidth = this.f4466b - ((childAt.getMeasuredWidth() + childAt2.getMeasuredWidth()) / 2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            int marginStart = measuredWidth - layoutParams.getMarginStart();
            layoutParams.setMarginStart(measuredWidth);
            childAt2.setLayoutParams(layoutParams);
            i5 += marginStart;
        }
        setMeasuredDimension(getMeasuredWidth() + i5, getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (getChildCount() > 0) {
            int i3 = this.f4468d;
            if (getChildAt((i3 < 0 || i3 >= getChildCount()) ? a() : this.f4468d).requestFocus(i2, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f4468d = indexOfChild(view);
        a aVar = this.f4467c;
        if (aVar != null) {
            aVar.a(view, view2);
        }
    }
}
