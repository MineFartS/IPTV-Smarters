package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import c.f.a.b.h3.y0;

/* JADX INFO: loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f24004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f24005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24007e;

    public interface b {
        void a(float f2, float f3, boolean z);
    }

    public final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f24008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f24009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24011e;

        public c() {
        }

        public void a(float f2, float f3, boolean z) {
            this.f24008b = f2;
            this.f24009c = f3;
            this.f24010d = z;
            if (this.f24011e) {
                return;
            }
            this.f24011e = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24011e = false;
            if (AspectRatioFrameLayout.this.f24005c == null) {
                return;
            }
            AspectRatioFrameLayout.this.f24005c.a(this.f24008b, this.f24009c, this.f24010d);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24007e = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, y0.f8802a, 0, 0);
            try {
                this.f24007e = typedArrayObtainStyledAttributes.getInt(y0.f8803b, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f24004b = new c();
    }

    public int getResizeMode() {
        return this.f24007e;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f24006d
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f24006d
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L31
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r9 = r8.f24004b
            float r10 = r8.f24006d
            r0 = 0
            r9.a(r10, r3, r0)
            return
        L31:
            int r5 = r8.f24007e
            r6 = 1
            if (r5 == 0) goto L4e
            if (r5 == r6) goto L49
            r7 = 2
            if (r5 == r7) goto L43
            r7 = 4
            if (r5 == r7) goto L3f
            goto L53
        L3f:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L49
        L43:
            float r9 = r8.f24006d
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L53
        L49:
            float r10 = r8.f24006d
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L53
        L4e:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L43
            goto L49
        L53:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r10 = r8.f24004b
            float r1 = r8.f24006d
            r10.a(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f2) {
        if (this.f24006d != f2) {
            this.f24006d = f2;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
        this.f24005c = bVar;
    }

    public void setResizeMode(int i2) {
        if (this.f24007e != i2) {
            this.f24007e = i2;
            requestLayout();
        }
    }
}
