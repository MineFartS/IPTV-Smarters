package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import c.f.a.d.g0.b;
import c.f.a.d.g0.c;
import c.f.a.d.l;
import c.f.a.d.o0.a.a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        int iH;
        super(a.c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        if (g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (j(context2, theme, attributeSet, i2, i3) || (iH = h(theme, attributeSet, i2, i3)) == -1) {
                return;
            }
            f(theme, iH);
        }
    }

    public static boolean g(Context context) {
        return b.b(context, c.f.a.d.b.F, true);
    }

    public static int h(Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.x3, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.y3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int i(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i2 = 0; i2 < iArr.length && iC < 0; i2++) {
            iC = c.c(context, typedArray, iArr[i2], -1);
        }
        return iC;
    }

    public static boolean j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.x3, i2, i3);
        int i4 = i(context, typedArrayObtainStyledAttributes, l.z3, l.A3);
        typedArrayObtainStyledAttributes.recycle();
        return i4 != -1;
    }

    public final void f(Resources.Theme theme, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i2, l.t3);
        int i3 = i(getContext(), typedArrayObtainStyledAttributes, l.v3, l.w3);
        typedArrayObtainStyledAttributes.recycle();
        if (i3 >= 0) {
            setLineHeight(i3);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (g(context)) {
            f(context.getTheme(), i2);
        }
    }
}
