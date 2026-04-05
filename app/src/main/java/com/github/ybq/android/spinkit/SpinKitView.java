package com.github.ybq.android.spinkit;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import c.e.b.a.a.a;
import c.e.b.a.a.b;
import c.e.b.a.a.c;
import c.e.b.a.a.d;
import c.e.b.a.a.e;
import c.e.b.a.a.g.f;

/* JADX INFO: loaded from: classes.dex */
public class SpinKitView extends ProgressBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f18932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f18934d;

    public SpinKitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f5972a);
    }

    public SpinKitView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, b.f5973a);
    }

    @TargetApi(21)
    public SpinKitView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f5974a, i2, i3);
        this.f18932b = e.values()[typedArrayObtainStyledAttributes.getInt(c.f5976c, 0)];
        this.f18933c = typedArrayObtainStyledAttributes.getColor(c.f5975b, -1);
        typedArrayObtainStyledAttributes.recycle();
        a();
        setIndeterminate(true);
    }

    public final void a() {
        f fVarA = d.a(this.f18932b);
        fVarA.u(this.f18933c);
        setIndeterminateDrawable(fVarA);
    }

    @Override // android.widget.ProgressBar
    public f getIndeterminateDrawable() {
        return this.f18934d;
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i2) {
        f fVar;
        super.onScreenStateChanged(i2);
        if (i2 != 0 || (fVar = this.f18934d) == null) {
            return;
        }
        fVar.stop();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f18934d != null && getVisibility() == 0) {
            this.f18934d.start();
        }
    }

    public void setColor(int i2) {
        this.f18933c = i2;
        f fVar = this.f18934d;
        if (fVar != null) {
            fVar.u(i2);
        }
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (!(drawable instanceof f)) {
            throw new IllegalArgumentException("this d must be instanceof Sprite");
        }
        setIndeterminateDrawable((f) drawable);
    }

    public void setIndeterminateDrawable(f fVar) {
        super.setIndeterminateDrawable((Drawable) fVar);
        this.f18934d = fVar;
        if (fVar.c() == 0) {
            this.f18934d.u(this.f18933c);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.f18934d.start();
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof f) {
            ((f) drawable).stop();
        }
    }
}
