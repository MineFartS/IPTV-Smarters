package a.g.c;

import a.g.b.k.k;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1598k;

    @Override // a.g.c.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.c1) {
                    this.f1597j = true;
                } else if (index == i.h1) {
                    this.f1598k = true;
                }
            }
        }
    }

    public void n(k kVar, int i2, int i3) {
    }

    @Override // a.g.c.b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f1597j || this.f1598k) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i2 = 0; i2 < this.f1503c; i2++) {
                View viewH = constraintLayout.h(this.f1502b[i2]);
                if (viewH != null) {
                    if (this.f1597j) {
                        viewH.setVisibility(visibility);
                    }
                    if (this.f1598k && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        c();
    }
}
