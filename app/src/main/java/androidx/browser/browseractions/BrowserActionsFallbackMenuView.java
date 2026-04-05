package androidx.browser.browseractions;

import a.d.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4262c;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4261b = getResources().getDimensionPixelOffset(a.f1138b);
        this.f4262c = getResources().getDimensionPixelOffset(a.f1137a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4261b * 2), this.f4262c), 1073741824), i3);
    }
}
