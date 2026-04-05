package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NonOverlappingLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<ArrayList<View>> f4491d;

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4489b = false;
        this.f4491d = new ArrayList<>();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void focusableViewAvailable(View view) {
        int iIndexOfChild;
        if (!this.f4490c) {
            super.focusableViewAvailable(view);
            return;
        }
        for (View view2 = view; view2 != this && view2 != null; view2 = (View) view2.getParent()) {
            if (view2.getParent() == this) {
                iIndexOfChild = indexOfChild(view2);
                break;
            }
        }
        iIndexOfChild = -1;
        if (iIndexOfChild != -1) {
            this.f4491d.get(iIndexOfChild).add(view);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        int size;
        ?? r0 = 0;
        int i6 = 0;
        try {
            boolean z3 = this.f4489b && getOrientation() == 0 && getLayoutDirection() == 1;
            this.f4490c = z3;
            if (z3) {
                while (this.f4491d.size() > getChildCount()) {
                    ArrayList<ArrayList<View>> arrayList = this.f4491d;
                    arrayList.remove(arrayList.size() - 1);
                }
                while (this.f4491d.size() < getChildCount()) {
                    this.f4491d.add(new ArrayList<>());
                }
            }
            super.onLayout(z, i2, i3, i4, i5);
            if (this.f4490c) {
                for (int i7 = 0; i7 < this.f4491d.size(); i7++) {
                    for (int i8 = 0; i8 < this.f4491d.get(i7).size(); i8++) {
                        super.focusableViewAvailable(this.f4491d.get(i7).get(i8));
                    }
                }
            }
            if (z2) {
                while (true) {
                    if (i6 >= size) {
                        return;
                    }
                }
            }
        } finally {
            if (this.f4490c) {
                this.f4490c = false;
                while (r0 < this.f4491d.size()) {
                    this.f4491d.get(r0).clear();
                    r0++;
                }
            }
        }
    }

    public void setFocusableViewAvailableFixEnabled(boolean z) {
        this.f4489b = z;
    }
}
