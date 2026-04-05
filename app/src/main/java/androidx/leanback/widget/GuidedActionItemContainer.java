package androidx.leanback.widget;

import a.n.q.c1;
import a.n.q.x;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class GuidedActionItemContainer extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4475e;

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4475e = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        if (this.f4475e || !c1.a(this, view)) {
            return super.focusSearch(view, i2);
        }
        View viewFocusSearch = super.focusSearch(view, i2);
        if (c1.a(this, viewFocusSearch)) {
            return viewFocusSearch;
        }
        return null;
    }
}
