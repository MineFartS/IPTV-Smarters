package com.nst.iptvsmarterstvbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import c.h.a.b;

/* JADX INFO: loaded from: classes2.dex */
public class MaxHeightLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f24679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f24680c;

    public MaxHeightLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24679b = 0.6f;
        this.f24680c = 0.0f;
        c(context, attributeSet);
        b();
    }

    public final int a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
    }

    public final void b() {
        float f2 = this.f24680c;
        this.f24680c = f2 <= 0.0f ? this.f24679b * a(getContext()) : Math.min(f2, this.f24679b * a(getContext()));
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.n1);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f24679b = typedArrayObtainStyledAttributes.getFloat(index, 0.6f);
            } else if (index == 0) {
                this.f24680c = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 1073741824) {
            float f2 = size;
            float f3 = this.f24680c;
            if (f2 > f3) {
                size = (int) f3;
            }
        }
        if (mode == 0) {
            float f4 = size;
            float f5 = this.f24680c;
            if (f4 > f5) {
                size = (int) f5;
            }
        }
        if (mode == Integer.MIN_VALUE) {
            float f6 = size;
            float f7 = this.f24680c;
            if (f6 > f7) {
                size = (int) f7;
            }
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(size, mode));
    }
}
