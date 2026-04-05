package com.google.android.material.appbar;

import a.i.r.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import c.f.a.d.b;
import c.f.a.d.d0.j;
import c.f.a.d.j0.g;
import c.f.a.d.j0.h;
import c.f.a.d.k;
import c.f.a.d.l;
import c.f.a.d.o0.a.a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    public static final int Q = k.w;
    public Integer R;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.I);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i2) {
        int i3 = Q;
        super(a.c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayH = j.h(context2, attributeSet, l.C3, i2, i3, new int[0]);
        int i4 = l.D3;
        if (typedArrayH.hasValue(i4)) {
            setNavigationIconTint(typedArrayH.getColor(i4, -1));
        }
        typedArrayH.recycle();
        P(context2);
    }

    public final void P(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.X(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.M(context);
            gVar.W(x.w(this));
            x.s0(this, gVar);
        }
    }

    public final Drawable Q(Drawable drawable) {
        if (drawable == null || this.R == null) {
            return drawable;
        }
        Drawable drawableR = a.i.j.l.a.r(drawable);
        a.i.j.l.a.n(drawableR, this.R.intValue());
        return drawableR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        h.d(this, f2);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Q(drawable));
    }

    public void setNavigationIconTint(int i2) {
        this.R = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}
