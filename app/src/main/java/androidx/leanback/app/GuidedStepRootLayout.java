package androidx.leanback.app;

import a.n.q.c1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class GuidedStepRootLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4425c;

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4424b = false;
        this.f4425c = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View viewFocusSearch = super.focusSearch(view, i2);
        if ((i2 != 17 && i2 != 66) || c1.a(this, viewFocusSearch)) {
            return viewFocusSearch;
        }
        if (getLayoutDirection() != 0 ? i2 != 66 : i2 != 17) {
            if (!this.f4425c) {
                return view;
            }
        } else if (!this.f4424b) {
            return view;
        }
        return viewFocusSearch;
    }
}
