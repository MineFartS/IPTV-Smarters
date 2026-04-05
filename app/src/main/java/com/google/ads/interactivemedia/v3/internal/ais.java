package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ais extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final air f19851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f19852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19853c;

    public ais(Context context) {
        super(context, null);
        this.f19853c = 0;
        this.f19851a = new air(this);
    }

    public final void a(float f2) {
        if (this.f19852b != f2) {
            this.f19852b = f2;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f19852b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = measuredWidth;
        float f3 = measuredHeight;
        float f4 = (this.f19852b / (f2 / f3)) - 1.0f;
        if (Math.abs(f4) <= 0.01f) {
            this.f19851a.a();
            return;
        }
        if (f4 > 0.0f) {
            measuredHeight = (int) (f2 / this.f19852b);
        } else {
            measuredWidth = (int) (f3 * this.f19852b);
        }
        this.f19851a.a();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
