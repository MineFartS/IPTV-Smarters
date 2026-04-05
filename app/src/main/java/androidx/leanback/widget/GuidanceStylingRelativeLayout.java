package androidx.leanback.widget;

import a.n.f;
import a.n.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes.dex */
public class GuidanceStylingRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4470b;

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4470b = a(context);
    }

    public static float a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(l.f2661h);
        float f2 = typedArrayObtainStyledAttributes.getFloat(l.f2662i, 40.0f);
        typedArrayObtainStyledAttributes.recycle();
        return f2;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View viewFindViewById = getRootView().findViewById(f.f2617h);
        View viewFindViewById2 = getRootView().findViewById(f.f2614e);
        View viewFindViewById3 = getRootView().findViewById(f.f2615f);
        ImageView imageView = (ImageView) getRootView().findViewById(f.f2616g);
        int measuredHeight = (int) ((getMeasuredHeight() * this.f4470b) / 100.0f);
        if (viewFindViewById != null && viewFindViewById.getParent() == this) {
            int baseline = (((measuredHeight - viewFindViewById.getBaseline()) - viewFindViewById2.getMeasuredHeight()) - viewFindViewById.getPaddingTop()) - viewFindViewById2.getTop();
            if (viewFindViewById2.getParent() == this) {
                viewFindViewById2.offsetTopAndBottom(baseline);
            }
            viewFindViewById.offsetTopAndBottom(baseline);
            if (viewFindViewById3 != null && viewFindViewById3.getParent() == this) {
                viewFindViewById3.offsetTopAndBottom(baseline);
            }
        }
        if (imageView == null || imageView.getParent() != this || imageView.getDrawable() == null) {
            return;
        }
        imageView.offsetTopAndBottom(measuredHeight - (imageView.getMeasuredHeight() / 2));
    }
}
