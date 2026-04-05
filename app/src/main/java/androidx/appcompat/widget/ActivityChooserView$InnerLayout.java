package androidx.appcompat.widget;

import a.b.q.u0;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4167b = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u0 u0VarU = u0.u(context, attributeSet, f4167b);
        setBackgroundDrawable(u0VarU.g(0));
        u0VarU.w();
    }
}
