package com.google.android.material.snackbar;

import a.i.r.x;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.f.a.d.f;
import c.f.a.d.l;

/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f24500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f24501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24503e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.q4);
        this.f24502d = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.r4, -1);
        this.f24503e = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.y4, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void a(View view, int i2, int i3) {
        if (x.W(view)) {
            x.B0(view, x.I(view), i2, x.H(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
    }

    public final boolean b(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.f24500b.getPaddingTop() == i3 && this.f24500b.getPaddingBottom() == i4) {
            return z;
        }
        a(this.f24500b, i3, i4);
        return true;
    }

    public Button getActionView() {
        return this.f24501c;
    }

    public TextView getMessageView() {
        return this.f24500b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24500b = (TextView) findViewById(f.I);
        this.f24501c = (Button) findViewById(f.H);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f24502d
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f24502d
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = c.f.a.d.d.f14708g
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = c.f.a.d.d.f14707f
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f24500b
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f24503e
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f24501c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f24503e
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.b(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.b(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f24503e = i2;
    }
}
