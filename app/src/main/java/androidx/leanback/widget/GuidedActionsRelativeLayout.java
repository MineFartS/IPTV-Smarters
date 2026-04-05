package androidx.leanback.widget;

import a.n.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes.dex */
public class GuidedActionsRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f4478d;

    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4477c = false;
        this.f4476b = GuidanceStylingRelativeLayout.a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        a aVar = this.f4478d;
        if (aVar == null || !aVar.a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f4477c = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        View viewFindViewById;
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0 && (viewFindViewById = findViewById(f.f2618i)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.f4477c) {
                this.f4477c = true;
            }
            if (this.f4477c) {
                marginLayoutParams.topMargin = (int) ((this.f4476b * size) / 100.0f);
            }
        }
        super.onMeasure(i2, i3);
    }
}
