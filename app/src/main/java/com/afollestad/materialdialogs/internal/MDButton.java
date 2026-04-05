package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import c.a.a.a;
import c.a.a.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class MDButton extends TextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f18850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f18852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f18853f;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18849b = false;
        a(context);
    }

    public final void a(Context context) {
        this.f18851d = context.getResources().getDimensionPixelSize(c.f5021d);
        this.f18850c = a.END;
    }

    public void b(boolean z, boolean z2) {
        if (this.f18849b != z || z2) {
            setGravity(z ? this.f18850c.getGravityInt() | 16 : 17);
            if (Build.VERSION.SDK_INT >= 17) {
                setTextAlignment(z ? this.f18850c.getTextAlignment() : 4);
            }
            c.a.a.h.a.c(this, z ? this.f18852e : this.f18853f);
            if (z) {
                setPadding(this.f18851d, getPaddingTop(), this.f18851d, getPaddingBottom());
            }
            this.f18849b = z;
        }
    }

    public void setAllCapsCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 14) {
            setAllCaps(z);
        } else {
            setTransformationMethod(z ? new c.a.a.g.a(getContext()) : null);
        }
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f18853f = drawable;
        if (this.f18849b) {
            return;
        }
        b(false, true);
    }

    public void setStackedGravity(a aVar) {
        this.f18850c = aVar;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f18852e = drawable;
        if (this.f18849b) {
            b(true, true);
        }
    }
}
