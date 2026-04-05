package androidx.leanback.preference.internal;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class OutlineOnlyWithChildrenFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewOutlineProvider f4427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewOutlineProvider f4428c;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            (OutlineOnlyWithChildrenFrameLayout.this.getChildCount() > 0 ? OutlineOnlyWithChildrenFrameLayout.this.f4428c : ViewOutlineProvider.BACKGROUND).getOutline(view, outline);
        }
    }

    public OutlineOnlyWithChildrenFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        invalidateOutline();
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
        this.f4428c = viewOutlineProvider;
        if (this.f4427b == null) {
            this.f4427b = new a();
        }
        super.setOutlineProvider(this.f4427b);
    }
}
